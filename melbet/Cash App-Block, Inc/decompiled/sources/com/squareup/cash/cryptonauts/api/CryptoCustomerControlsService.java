package com.squareup.cash.cryptonauts.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/cryptonauts/api/CryptoCustomerControlsService;", "", "getCryptoControls", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/cryptonauts/api/GetCryptoControlsResponse;", "request", "Lcom/squareup/cash/cryptonauts/api/GetCryptoControlsRequest;", "(Lcom/squareup/cash/cryptonauts/api/GetCryptoControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCryptoControls", "Lcom/squareup/cash/cryptonauts/api/SetCryptoControlsResponse;", "Lcom/squareup/cash/cryptonauts/api/SetCryptoControlsRequest;", "(Lcom/squareup/cash/cryptonauts/api/SetCryptoControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CryptoCustomerControlsService {
    @POST("/cash-app/crypto/controls/get-customer-controls")
    Object getCryptoControls(@Body GetCryptoControlsRequest getCryptoControlsRequest, Continuation<? super ApiResult<GetCryptoControlsResponse>> continuation);

    @POST("/cash-app/crypto/controls/set-customer-controls")
    Object setCryptoControls(@Body SetCryptoControlsRequest setCryptoControlsRequest, Continuation<? super ApiResult<SetCryptoControlsResponse>> continuation);
}
