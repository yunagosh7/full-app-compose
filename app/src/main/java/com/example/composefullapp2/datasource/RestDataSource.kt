package com.example.composefullapp2.datasource

import com.example.composefullapp2.model.ApiResponse
import retrofit2.http.GET

interface RestDataSource {
    @GET("?inc=name")
    suspend fun getUserName(): ApiResponse

    @GET("?inc=picture")
    suspend fun getUserPicture(): ApiResponse

    @GET("?inc=location")
    suspend fun getUserLocation(): ApiResponse

}