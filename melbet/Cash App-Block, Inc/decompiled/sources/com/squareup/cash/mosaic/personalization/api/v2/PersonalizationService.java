package com.squareup.cash.mosaic.personalization.api.v2;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationService;", "", "Lcom/squareup/cash/mosaic/personalization/api/v2/GetEntityActivityItemRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/mosaic/personalization/api/v2/GetEntityActivityItemResponse;", "getEntityActivityItem", "(Lcom/squareup/cash/mosaic/personalization/api/v2/GetEntityActivityItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/cash/mosaic/personalization/api/v2/MarkViewedRequest;", "Lcom/squareup/cash/mosaic/personalization/api/v2/MarkViewedResponse;", "markViewed", "(Lcom/squareup/cash/mosaic/personalization/api/v2/MarkViewedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PersonalizationService {
    @POST("/cash-app/personalization/v2/get-entity-activity-item")
    Object getEntityActivityItem(@Body GetEntityActivityItemRequest getEntityActivityItemRequest, Continuation<? super ApiResult<GetEntityActivityItemResponse>> continuation);

    @POST("/cash-app/personalization/v2/mark-viewed")
    Object markViewed(@Body MarkViewedRequest markViewedRequest, Continuation<? super ApiResult<MarkViewedResponse>> continuation);
}
