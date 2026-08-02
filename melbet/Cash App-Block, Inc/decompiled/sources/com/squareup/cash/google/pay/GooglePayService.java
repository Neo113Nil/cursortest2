package com.squareup.cash.google.pay;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.protos.franklin.app.ActivateDigitalWalletResponse;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningRequest;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningResponse;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenRequest;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/google/pay/GooglePayService;", "", "provisionDigitalWalletToken", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/app/ProvisionDigitalWalletTokenResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "request", "Lcom/squareup/protos/franklin/app/ProvisionDigitalWalletTokenRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/app/ProvisionDigitalWalletTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeDigitalWalletTokenProvisioning", "Lcom/squareup/protos/franklin/app/CompleteDigitalWalletTokenProvisioningResponse;", "Lcom/squareup/protos/franklin/app/CompleteDigitalWalletTokenProvisioningRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/app/CompleteDigitalWalletTokenProvisioningRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activateDigitalWallet", "Lcom/squareup/protos/franklin/app/ActivateDigitalWalletResponse;", "Lcom/squareup/protos/franklin/app/ActivateDigitalWalletRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/app/ActivateDigitalWalletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GooglePayService {
    @POST("/2.0/cash/activate-digital-wallet")
    Object activateDigitalWallet(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body ActivateDigitalWalletRequest activateDigitalWalletRequest, Continuation<? super ApiResult<ActivateDigitalWalletResponse>> continuation);

    @POST("/2.0/cash/complete-digital-wallet-token-provisioning")
    Object completeDigitalWalletTokenProvisioning(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest, Continuation<? super ApiResult<CompleteDigitalWalletTokenProvisioningResponse>> continuation);

    @POST("/2.0/cash/provision-digital-wallet-token")
    Object provisionDigitalWalletToken(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest, Continuation<? super ApiResult<ProvisionDigitalWalletTokenResponse>> continuation);
}
