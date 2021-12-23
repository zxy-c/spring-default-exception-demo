package com.example.springdefaultexceptiondemo

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.lang.RuntimeException
import javax.validation.Valid
import javax.validation.constraints.NotBlank

@RestController
@RequestMapping("errors")
class ErrorTestController {

    @GetMapping("401")
    fun get401(){
        throw ResponseStatusException(HttpStatus.UNAUTHORIZED)
    }

    @GetMapping("500")
    fun get500(){
        throw RuntimeException()
    }

    class A(
        @field:NotBlank
        val a:String
    )

    @PostMapping("400")
    fun post400(@Valid @RequestBody a:A){

    }

}