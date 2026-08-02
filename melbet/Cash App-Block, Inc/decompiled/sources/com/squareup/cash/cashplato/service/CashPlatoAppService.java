package com.squareup.cash.cashplato.service;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateRequest;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleRequest;
import com.squareup.protos.cash.cashplato.api.v1.PersonalizedAdsToggleResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/cashplato/service/CashPlatoAppService;", "", "getPersonalizedAdsState", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashplato/api/v1/GetPersonalizedAdsStateResponse;", "request", "Lcom/squareup/protos/cash/cashplato/api/v1/GetPersonalizedAdsStateRequest;", "(Lcom/squareup/protos/cash/cashplato/api/v1/GetPersonalizedAdsStateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "personalizedAdsToggle", "Lcom/squareup/protos/cash/cashplato/api/v1/PersonalizedAdsToggleResponse;", "Lcom/squareup/protos/cash/cashplato/api/v1/PersonalizedAdsToggleRequest;", "(Lcom/squareup/protos/cash/cashplato/api/v1/PersonalizedAdsToggleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CashPlatoAppService {
    @POST("/cash-app/cash-plato/get-personalized-ads-state")
    Object getPersonalizedAdsState(@Body GetPersonalizedAdsStateRequest getPersonalizedAdsStateRequest, Continuation<? super ApiResult<GetPersonalizedAdsStateResponse>> continuation);

    @POST("/cash-app/cash-plato/personalized-ads-toggle")
    Object personalizedAdsToggle(@Body PersonalizedAdsToggleRequest personalizedAdsToggleRequest, Continuation<? super ApiResult<PersonalizedAdsToggleResponse>> continuation);
}
