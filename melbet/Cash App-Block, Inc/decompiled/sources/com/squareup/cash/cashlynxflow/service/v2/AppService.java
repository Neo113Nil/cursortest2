package com.squareup.cash.cashlynxflow.service.v2;

import app.cash.api.ApiResult;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentRequest;
import com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentResponse;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentResponse;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentRequest;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/cashlynxflow/service/v2/AppService;", "", "updateDefaultInstrument", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/cashlynxflow/plasma/v1/UpdateDefaultInstrumentResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "request", "Lcom/squareup/cash/cashlynxflow/plasma/v1/UpdateDefaultInstrumentRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/cash/cashlynxflow/plasma/v1/UpdateDefaultInstrumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectInstrument", "Lcom/squareup/cash/cashlynxflow/api/v2/SelectInstrumentResponse;", "Lcom/squareup/cash/cashlynxflow/api/v2/SelectInstrumentRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/cash/cashlynxflow/api/v2/SelectInstrumentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorizeDigitalWalletPayment", "Lcom/squareup/cash/cashlynxflow/api/v2/AuthorizeDigitalWalletPaymentResponse;", "Lcom/squareup/cash/cashlynxflow/api/v2/AuthorizeDigitalWalletPaymentRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/cash/cashlynxflow/api/v2/AuthorizeDigitalWalletPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppService {
    @POST("/2.0/cash/authorize-digital-wallet-payment")
    Object authorizeDigitalWalletPayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest, Continuation<? super ApiResult<AuthorizeDigitalWalletPaymentResponse>> continuation);

    @POST("/cash-app/instrument/v2.0/select-instrument")
    Object selectInstrument(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SelectInstrumentRequest selectInstrumentRequest, Continuation<? super ApiResult<SelectInstrumentResponse>> continuation);

    @POST("/2.0/cash/update-default-instrument")
    Object updateDefaultInstrument(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest, Continuation<? super ApiResult<UpdateDefaultInstrumentResponse>> continuation);
}
