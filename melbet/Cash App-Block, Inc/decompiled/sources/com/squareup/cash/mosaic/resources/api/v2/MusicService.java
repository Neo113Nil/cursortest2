package com.squareup.cash.mosaic.resources.api.v2;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/MusicService;", "", "searchMusicResources", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/mosaic/resources/api/v2/SearchMusicResourcesResponse;", "request", "Lcom/squareup/cash/mosaic/resources/api/v2/SearchMusicResourcesRequest;", "(Lcom/squareup/cash/mosaic/resources/api/v2/SearchMusicResourcesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeaturedMusic", "Lcom/squareup/cash/mosaic/resources/api/v2/GetFeaturedMusicResponse;", "Lcom/squareup/cash/mosaic/resources/api/v2/GetFeaturedMusicRequest;", "(Lcom/squareup/cash/mosaic/resources/api/v2/GetFeaturedMusicRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMusicStreamingUrl", "Lcom/squareup/cash/mosaic/resources/api/v2/GetMusicStreamingUrlResponse;", "Lcom/squareup/cash/mosaic/resources/api/v2/GetMusicStreamingUrlRequest;", "(Lcom/squareup/cash/mosaic/resources/api/v2/GetMusicStreamingUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MusicService {
    @POST("/cash-app/personalization/v2/get-featured-music")
    Object getFeaturedMusic(@Body GetFeaturedMusicRequest getFeaturedMusicRequest, Continuation<? super ApiResult<GetFeaturedMusicResponse>> continuation);

    @POST("/cash-app/personalization/v2/get-music-streaming-url")
    Object getMusicStreamingUrl(@Body GetMusicStreamingUrlRequest getMusicStreamingUrlRequest, Continuation<? super ApiResult<GetMusicStreamingUrlResponse>> continuation);

    @POST("/cash-app/personalization/v2/search-music")
    Object searchMusicResources(@Body SearchMusicResourcesRequest searchMusicResourcesRequest, Continuation<? super ApiResult<SearchMusicResourcesResponse>> continuation);
}
