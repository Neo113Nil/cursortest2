package com.squareup.cash.security.service;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.cash.security.SetPasswordResponse;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.cash.security.VerifyPasswordResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/security/service/SecurityService;", "", "setPassword", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/security/SetPasswordResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "setPasswordRequest", "Lcom/squareup/protos/cash/security/SetPasswordRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/security/SetPasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyPassword", "Lcom/squareup/protos/cash/security/VerifyPasswordResponse;", "verifyPasswordRequest", "Lcom/squareup/protos/cash/security/VerifyPasswordRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/security/VerifyPasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SecurityService {
    @POST("cash-app/security/1.0/set-password")
    Object setPassword(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SetPasswordRequest setPasswordRequest, Continuation<? super ApiResult<SetPasswordResponse>> continuation);

    @POST("cash-app/security/1.0/verify-password")
    Object verifyPassword(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body VerifyPasswordRequest verifyPasswordRequest, Continuation<? super ApiResult<VerifyPasswordResponse>> continuation);
}
