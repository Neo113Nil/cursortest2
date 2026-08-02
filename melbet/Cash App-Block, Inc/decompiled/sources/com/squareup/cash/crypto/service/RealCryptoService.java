package com.squareup.cash.crypto.service;

import app.cash.api.ApiResult;
import app.cash.api.wrapper.ServiceContextWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.PaymentRequestsListener;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Request;
import com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceRequest;
import com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceResponse;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingRequest;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingResponse;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentRequest;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsRequest;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsResponse;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentRequest;
import com.squareup.protos.cash.btcnetwork.external.AcceptCryptoPaymentResponse;
import com.squareup.protos.cash.btcnetwork.external.GetBitcoinSellerLocationsRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeResponse;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsClientRequest;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request;
import com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Response;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.RefreshInvoice$Response;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okhttp3.Call;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* loaded from: classes.dex */
public final class RealCryptoService extends ServiceContextWrapper implements CryptoService {
    public final AutoWithdrawJsonEndpoint autoWithdrawJsonDelegate;
    public final CryptoService delegate;

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/squareup/cash/crypto/service/RealCryptoService$AutoWithdrawJsonEndpoint", "", "Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsResponse;", "updateAutoWithdrawSettings", "(Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    interface AutoWithdrawJsonEndpoint {
        @POST("/cash-app/crypto-withdrawals/auto-withdraw/update-settings")
        Object updateAutoWithdrawSettings(@Body UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest, Continuation<? super ApiResult<UpdateAutoWithdrawSettingsResponse>> continuation);
    }

    public RealCryptoService(Retrofit retrofit, RealServiceContextManager realServiceContextManager) {
        super(realServiceContextManager, EmptyList.INSTANCE);
        Object create = retrofit.create(CryptoService.class);
        create.getClass();
        this.delegate = (CryptoService) create;
        Retrofit.Builder builder = new Retrofit.Builder();
        Call.Factory factory = retrofit.callFactory;
        Objects.requireNonNull(factory, "factory == null");
        builder.callFactory = factory;
        builder.baseUrl(retrofit.baseUrl);
        Moshi.Builder builder2 = new Moshi.Builder();
        builder2.add((JsonAdapter.Factory) new WireJsonAdapterFactory());
        ((ArrayList) builder.converterFactories).add(MoshiConverterFactory.create(new Moshi(builder2)));
        ((ArrayList) builder.callAdapterFactories).add(new CompletableFutureCallAdapterFactory(1));
        Object create2 = builder.build().create(AutoWithdrawJsonEndpoint.class);
        create2.getClass();
        this.autoWithdrawJsonDelegate = (AutoWithdrawJsonEndpoint) create2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:72|(1:74)|75|(1:77)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|78|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149 A[Catch: all -> 0x0064, LOOP:0: B:25:0x0143->B:27:0x0149, LOOP_END, TryCatch #1 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x013d, B:25:0x0143, B:27:0x0149, B:30:0x015d), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #3 {all -> 0x0158, blocks: (B:45:0x00fd, B:47:0x0104), top: B:44:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.protos.cash.btcnetwork.external.BtcNetworkClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acceptCryptPayment(ClientScenario clientScenario, String str, AcceptCryptoPaymentRequest acceptCryptoPaymentRequest, Continuation continuation) {
        RealCryptoService$acceptCryptPayment$1 realCryptoService$acceptCryptPayment$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        Exception exc;
        Object obj;
        int i2;
        ClientScenario clientScenario2;
        ServiceContextWrapper serviceContextWrapper;
        RequestContext requestContext;
        int i3;
        AcceptCryptoPaymentRequest copy$default;
        Object acceptCryptPayment;
        ServiceContextWrapper serviceContextWrapper2;
        Exception exc2;
        Message message;
        RequestContext requestContext2;
        ServiceContextWrapper serviceContextWrapper3;
        ApiResult apiResult;
        Object obj2;
        Message message2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        AcceptCryptoPaymentRequest acceptCryptoPaymentRequest2 = acceptCryptoPaymentRequest;
        if (continuation instanceof RealCryptoService$acceptCryptPayment$1) {
            realCryptoService$acceptCryptPayment$1 = (RealCryptoService$acceptCryptPayment$1) continuation;
            int i4 = realCryptoService$acceptCryptPayment$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$acceptCryptPayment$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$acceptCryptPayment$1 realCryptoService$acceptCryptPayment$12 = realCryptoService$acceptCryptPayment$1;
                Object obj3 = realCryptoService$acceptCryptPayment$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$acceptCryptPayment$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = acceptCryptoPaymentRequest2.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$acceptCryptPayment$12.L$0 = clientScenario;
                    str2 = str;
                    realCryptoService$acceptCryptPayment$12.L$1 = str2;
                    realCryptoService$acceptCryptPayment$12.L$3 = this;
                    realCryptoService$acceptCryptPayment$12.L$4 = acceptCryptoPaymentRequest2;
                    realCryptoService$acceptCryptPayment$12.L$6 = exc3;
                    realCryptoService$acceptCryptPayment$12.I$0 = 0;
                    realCryptoService$acceptCryptPayment$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, realCryptoService$acceptCryptPayment$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = realCryptoService$acceptCryptPayment$12.I$0;
                    Exception exc4 = realCryptoService$acceptCryptPayment$12.L$6;
                    ?? r7 = realCryptoService$acceptCryptPayment$12.L$4;
                    serviceContextWrapper = realCryptoService$acceptCryptPayment$12.L$3;
                    str2 = realCryptoService$acceptCryptPayment$12.L$1;
                    clientScenario2 = realCryptoService$acceptCryptPayment$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    acceptCryptoPaymentRequest2 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$acceptCryptPayment$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$acceptCryptPayment$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = realCryptoService$acceptCryptPayment$12.I$0;
                        obj2 = realCryptoService$acceptCryptPayment$12.L$9;
                        message2 = (Message) realCryptoService$acceptCryptPayment$12.L$8;
                        requestContext2 = realCryptoService$acceptCryptPayment$12.L$7;
                        serviceContextWrapper3 = realCryptoService$acceptCryptPayment$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            realCryptoService$acceptCryptPayment$12.L$0 = null;
                            realCryptoService$acceptCryptPayment$12.L$1 = null;
                            realCryptoService$acceptCryptPayment$12.L$3 = null;
                            realCryptoService$acceptCryptPayment$12.L$4 = null;
                            realCryptoService$acceptCryptPayment$12.L$6 = null;
                            realCryptoService$acceptCryptPayment$12.L$7 = null;
                            realCryptoService$acceptCryptPayment$12.L$8 = apiResult2;
                            realCryptoService$acceptCryptPayment$12.L$9 = null;
                            realCryptoService$acceptCryptPayment$12.L$10 = null;
                            realCryptoService$acceptCryptPayment$12.I$0 = i3;
                            realCryptoService$acceptCryptPayment$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$acceptCryptPayment$12.L$0 = null;
                            realCryptoService$acceptCryptPayment$12.L$1 = null;
                            realCryptoService$acceptCryptPayment$12.L$3 = null;
                            realCryptoService$acceptCryptPayment$12.L$4 = null;
                            realCryptoService$acceptCryptPayment$12.L$6 = null;
                            realCryptoService$acceptCryptPayment$12.L$7 = null;
                            realCryptoService$acceptCryptPayment$12.L$8 = th;
                            realCryptoService$acceptCryptPayment$12.L$9 = null;
                            realCryptoService$acceptCryptPayment$12.L$10 = null;
                            realCryptoService$acceptCryptPayment$12.I$0 = i3;
                            realCryptoService$acceptCryptPayment$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = realCryptoService$acceptCryptPayment$12.I$0;
                    AcceptCryptoPaymentRequest acceptCryptoPaymentRequest3 = realCryptoService$acceptCryptPayment$12.L$10;
                    requestContext = realCryptoService$acceptCryptPayment$12.L$7;
                    Exception exc5 = realCryptoService$acceptCryptPayment$12.L$6;
                    message = realCryptoService$acceptCryptPayment$12.L$4;
                    serviceContextWrapper = realCryptoService$acceptCryptPayment$12.L$3;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        copy$default = acceptCryptoPaymentRequest3;
                        serviceContextWrapper2 = serviceContextWrapper;
                        exc2 = exc5;
                        try {
                            apiResult = (ApiResult) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            requestContext2 = requestContext;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        requestContext2 = requestContext;
                        serviceContextWrapper3 = serviceContextWrapper;
                        realServiceContextManager = serviceContextWrapper3.contextManager;
                        realCryptoService$acceptCryptPayment$12.L$0 = null;
                        realCryptoService$acceptCryptPayment$12.L$1 = null;
                        realCryptoService$acceptCryptPayment$12.L$3 = null;
                        realCryptoService$acceptCryptPayment$12.L$4 = null;
                        realCryptoService$acceptCryptPayment$12.L$6 = null;
                        realCryptoService$acceptCryptPayment$12.L$7 = null;
                        realCryptoService$acceptCryptPayment$12.L$8 = th;
                        realCryptoService$acceptCryptPayment$12.L$9 = null;
                        realCryptoService$acceptCryptPayment$12.L$10 = null;
                        realCryptoService$acceptCryptPayment$12.I$0 = i3;
                        realCryptoService$acceptCryptPayment$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((AcceptCryptoPaymentResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$acceptCryptPayment$12.L$0 = null;
                        realCryptoService$acceptCryptPayment$12.L$1 = null;
                        realCryptoService$acceptCryptPayment$12.L$3 = serviceContextWrapper2;
                        realCryptoService$acceptCryptPayment$12.L$4 = null;
                        realCryptoService$acceptCryptPayment$12.L$6 = null;
                        realCryptoService$acceptCryptPayment$12.L$7 = requestContext;
                        realCryptoService$acceptCryptPayment$12.L$8 = copy$default;
                        realCryptoService$acceptCryptPayment$12.L$9 = obj3;
                        realCryptoService$acceptCryptPayment$12.L$10 = null;
                        realCryptoService$acceptCryptPayment$12.I$0 = i3;
                        realCryptoService$acceptCryptPayment$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, realCryptoService$acceptCryptPayment$12) != coroutineSingletons) {
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                message2 = copy$default;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                realCryptoService$acceptCryptPayment$12.L$0 = null;
                                realCryptoService$acceptCryptPayment$12.L$1 = null;
                                realCryptoService$acceptCryptPayment$12.L$3 = null;
                                realCryptoService$acceptCryptPayment$12.L$4 = null;
                                realCryptoService$acceptCryptPayment$12.L$6 = null;
                                realCryptoService$acceptCryptPayment$12.L$7 = null;
                                realCryptoService$acceptCryptPayment$12.L$8 = apiResult2;
                                realCryptoService$acceptCryptPayment$12.L$9 = null;
                                realCryptoService$acceptCryptPayment$12.L$10 = null;
                                realCryptoService$acceptCryptPayment$12.I$0 = i3;
                                realCryptoService$acceptCryptPayment$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$acceptCryptPayment$12.L$0 = null;
                            realCryptoService$acceptCryptPayment$12.L$1 = null;
                            realCryptoService$acceptCryptPayment$12.L$3 = null;
                            realCryptoService$acceptCryptPayment$12.L$4 = null;
                            realCryptoService$acceptCryptPayment$12.L$6 = null;
                            realCryptoService$acceptCryptPayment$12.L$7 = null;
                            realCryptoService$acceptCryptPayment$12.L$8 = th;
                            realCryptoService$acceptCryptPayment$12.L$9 = null;
                            realCryptoService$acceptCryptPayment$12.L$10 = null;
                            realCryptoService$acceptCryptPayment$12.I$0 = i3;
                            realCryptoService$acceptCryptPayment$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    realCryptoService$acceptCryptPayment$12.L$0 = null;
                    realCryptoService$acceptCryptPayment$12.L$1 = null;
                    realCryptoService$acceptCryptPayment$12.L$3 = null;
                    realCryptoService$acceptCryptPayment$12.L$4 = null;
                    realCryptoService$acceptCryptPayment$12.L$6 = null;
                    realCryptoService$acceptCryptPayment$12.L$7 = null;
                    realCryptoService$acceptCryptPayment$12.L$8 = apiResult2;
                    realCryptoService$acceptCryptPayment$12.L$9 = null;
                    realCryptoService$acceptCryptPayment$12.L$10 = null;
                    realCryptoService$acceptCryptPayment$12.I$0 = i3;
                    realCryptoService$acceptCryptPayment$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$acceptCryptPayment$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                copy$default = AcceptCryptoPaymentRequest.copy$default(acceptCryptoPaymentRequest2, requestContext, null, 5);
                CryptoService cryptoService = this.delegate;
                realCryptoService$acceptCryptPayment$12.L$0 = null;
                realCryptoService$acceptCryptPayment$12.L$1 = null;
                realCryptoService$acceptCryptPayment$12.L$3 = serviceContextWrapper;
                realCryptoService$acceptCryptPayment$12.L$4 = acceptCryptoPaymentRequest2;
                realCryptoService$acceptCryptPayment$12.L$6 = exc;
                realCryptoService$acceptCryptPayment$12.L$7 = requestContext;
                realCryptoService$acceptCryptPayment$12.L$8 = null;
                realCryptoService$acceptCryptPayment$12.L$9 = null;
                realCryptoService$acceptCryptPayment$12.L$10 = copy$default;
                realCryptoService$acceptCryptPayment$12.I$0 = i2;
                realCryptoService$acceptCryptPayment$12.label = 2;
                acceptCryptPayment = cryptoService.acceptCryptPayment(clientScenario2, str2, copy$default, realCryptoService$acceptCryptPayment$12);
                if (acceptCryptPayment != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = acceptCryptoPaymentRequest2;
                    i3 = i2;
                    obj3 = acceptCryptPayment;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$acceptCryptPayment$1 = new RealCryptoService$acceptCryptPayment$1(this, continuation);
        RealCryptoService$acceptCryptPayment$1 realCryptoService$acceptCryptPayment$122 = realCryptoService$acceptCryptPayment$1;
        Object obj32 = realCryptoService$acceptCryptPayment$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$acceptCryptPayment$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        copy$default = AcceptCryptoPaymentRequest.copy$default(acceptCryptoPaymentRequest2, requestContext, null, 5);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$acceptCryptPayment$122.L$0 = null;
        realCryptoService$acceptCryptPayment$122.L$1 = null;
        realCryptoService$acceptCryptPayment$122.L$3 = serviceContextWrapper;
        realCryptoService$acceptCryptPayment$122.L$4 = acceptCryptoPaymentRequest2;
        realCryptoService$acceptCryptPayment$122.L$6 = exc;
        realCryptoService$acceptCryptPayment$122.L$7 = requestContext;
        realCryptoService$acceptCryptPayment$122.L$8 = null;
        realCryptoService$acceptCryptPayment$122.L$9 = null;
        realCryptoService$acceptCryptPayment$122.L$10 = copy$default;
        realCryptoService$acceptCryptPayment$122.I$0 = i2;
        realCryptoService$acceptCryptPayment$122.label = 2;
        acceptCryptPayment = cryptoService2.acceptCryptPayment(clientScenario2, str2, copy$default, realCryptoService$acceptCryptPayment$122);
        if (acceptCryptPayment != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:72|(1:74)|75|(1:77)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|78|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0151 A[Catch: all -> 0x0064, LOOP:0: B:25:0x014b->B:27:0x0151, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0145, B:25:0x014b, B:27:0x0151, B:30:0x0165), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x0106, B:47:0x010d), top: B:44:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.cash.crypto.service.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmBitcoinDepositIntent(String str, ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest, Continuation continuation) {
        RealCryptoService$confirmBitcoinDepositIntent$1 realCryptoService$confirmBitcoinDepositIntent$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Exception exc;
        String str2;
        ServiceContextWrapper serviceContextWrapper;
        Object obj;
        int i2;
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest2;
        RequestContext requestContext;
        int i3;
        Object confirmBitcoinDepositIntent;
        ServiceContextWrapper serviceContextWrapper2;
        Exception exc2;
        Message message;
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest3;
        RequestContext requestContext2;
        ServiceContextWrapper serviceContextWrapper3;
        ApiResult apiResult;
        Message message2;
        Object obj2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest4 = confirmBitcoinDepositIntentRequest;
        if (continuation instanceof RealCryptoService$confirmBitcoinDepositIntent$1) {
            realCryptoService$confirmBitcoinDepositIntent$1 = (RealCryptoService$confirmBitcoinDepositIntent$1) continuation;
            int i4 = realCryptoService$confirmBitcoinDepositIntent$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$confirmBitcoinDepositIntent$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$confirmBitcoinDepositIntent$1 realCryptoService$confirmBitcoinDepositIntent$12 = realCryptoService$confirmBitcoinDepositIntent$1;
                Object obj3 = realCryptoService$confirmBitcoinDepositIntent$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$confirmBitcoinDepositIntent$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = confirmBitcoinDepositIntentRequest4.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$confirmBitcoinDepositIntent$12.L$0 = str;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$1 = confirmBitcoinDepositIntentRequest4;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$2 = this;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$3 = confirmBitcoinDepositIntentRequest4;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$5 = exc3;
                    realCryptoService$confirmBitcoinDepositIntent$12.I$0 = 0;
                    realCryptoService$confirmBitcoinDepositIntent$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, realCryptoService$confirmBitcoinDepositIntent$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        str2 = str;
                        serviceContextWrapper = this;
                        obj = produceRequestContext;
                        i2 = 0;
                        confirmBitcoinDepositIntentRequest2 = confirmBitcoinDepositIntentRequest4;
                    }
                }
                if (i == 1) {
                    int i5 = realCryptoService$confirmBitcoinDepositIntent$12.I$0;
                    Exception exc4 = realCryptoService$confirmBitcoinDepositIntent$12.L$5;
                    ?? r7 = realCryptoService$confirmBitcoinDepositIntent$12.L$3;
                    serviceContextWrapper = realCryptoService$confirmBitcoinDepositIntent$12.L$2;
                    confirmBitcoinDepositIntentRequest2 = realCryptoService$confirmBitcoinDepositIntent$12.L$1;
                    str2 = realCryptoService$confirmBitcoinDepositIntent$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    confirmBitcoinDepositIntentRequest4 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$confirmBitcoinDepositIntent$12.L$7;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$confirmBitcoinDepositIntent$12.L$7;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = realCryptoService$confirmBitcoinDepositIntent$12.I$0;
                        obj2 = realCryptoService$confirmBitcoinDepositIntent$12.L$8;
                        message2 = (Message) realCryptoService$confirmBitcoinDepositIntent$12.L$7;
                        requestContext2 = realCryptoService$confirmBitcoinDepositIntent$12.L$6;
                        serviceContextWrapper3 = realCryptoService$confirmBitcoinDepositIntent$12.L$2;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$7 = apiResult2;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                            realCryptoService$confirmBitcoinDepositIntent$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$7 = th;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                            realCryptoService$confirmBitcoinDepositIntent$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = realCryptoService$confirmBitcoinDepositIntent$12.I$0;
                    confirmBitcoinDepositIntentRequest3 = realCryptoService$confirmBitcoinDepositIntent$12.L$9;
                    requestContext = realCryptoService$confirmBitcoinDepositIntent$12.L$6;
                    Exception exc5 = realCryptoService$confirmBitcoinDepositIntent$12.L$5;
                    message = realCryptoService$confirmBitcoinDepositIntent$12.L$3;
                    serviceContextWrapper = realCryptoService$confirmBitcoinDepositIntent$12.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        serviceContextWrapper2 = serviceContextWrapper;
                        exc2 = exc5;
                        try {
                            apiResult = (ApiResult) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            requestContext2 = requestContext;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        requestContext2 = requestContext;
                        serviceContextWrapper3 = serviceContextWrapper;
                        realServiceContextManager = serviceContextWrapper3.contextManager;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$7 = th;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                        realCryptoService$confirmBitcoinDepositIntent$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((ConfirmBitcoinDepositIntentResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$2 = serviceContextWrapper2;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$6 = requestContext;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$7 = confirmBitcoinDepositIntentRequest3;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$8 = obj3;
                        realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                        realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                        realCryptoService$confirmBitcoinDepositIntent$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, realCryptoService$confirmBitcoinDepositIntent$12) != coroutineSingletons) {
                                message2 = confirmBitcoinDepositIntentRequest3;
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$7 = apiResult2;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                                realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                                realCryptoService$confirmBitcoinDepositIntent$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$7 = th;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                            realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                            realCryptoService$confirmBitcoinDepositIntent$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$2 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$3 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$5 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$6 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$7 = apiResult2;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.L$9 = null;
                    realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i3;
                    realCryptoService$confirmBitcoinDepositIntent$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$confirmBitcoinDepositIntent$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest5 = confirmBitcoinDepositIntentRequest4;
                String str3 = confirmBitcoinDepositIntentRequest5.token;
                ByteString unknownFields = confirmBitcoinDepositIntentRequest5.unknownFields();
                unknownFields.getClass();
                ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest6 = new ConfirmBitcoinDepositIntentRequest(requestContext, str3, unknownFields);
                CryptoService cryptoService = this.delegate;
                realCryptoService$confirmBitcoinDepositIntent$12.L$0 = null;
                realCryptoService$confirmBitcoinDepositIntent$12.L$1 = null;
                realCryptoService$confirmBitcoinDepositIntent$12.L$2 = serviceContextWrapper;
                realCryptoService$confirmBitcoinDepositIntent$12.L$3 = confirmBitcoinDepositIntentRequest4;
                realCryptoService$confirmBitcoinDepositIntent$12.L$5 = exc;
                realCryptoService$confirmBitcoinDepositIntent$12.L$6 = requestContext;
                realCryptoService$confirmBitcoinDepositIntent$12.L$7 = null;
                realCryptoService$confirmBitcoinDepositIntent$12.L$8 = null;
                realCryptoService$confirmBitcoinDepositIntent$12.L$9 = confirmBitcoinDepositIntentRequest6;
                realCryptoService$confirmBitcoinDepositIntent$12.I$0 = i2;
                realCryptoService$confirmBitcoinDepositIntent$12.label = 2;
                confirmBitcoinDepositIntent = cryptoService.confirmBitcoinDepositIntent(str2, confirmBitcoinDepositIntentRequest2, realCryptoService$confirmBitcoinDepositIntent$12);
                if (confirmBitcoinDepositIntent != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = confirmBitcoinDepositIntentRequest4;
                    i3 = i2;
                    obj3 = confirmBitcoinDepositIntent;
                    confirmBitcoinDepositIntentRequest3 = confirmBitcoinDepositIntentRequest6;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$confirmBitcoinDepositIntent$1 = new RealCryptoService$confirmBitcoinDepositIntent$1(this, continuation);
        RealCryptoService$confirmBitcoinDepositIntent$1 realCryptoService$confirmBitcoinDepositIntent$122 = realCryptoService$confirmBitcoinDepositIntent$1;
        Object obj32 = realCryptoService$confirmBitcoinDepositIntent$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$confirmBitcoinDepositIntent$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest52 = confirmBitcoinDepositIntentRequest4;
        String str32 = confirmBitcoinDepositIntentRequest52.token;
        ByteString unknownFields2 = confirmBitcoinDepositIntentRequest52.unknownFields();
        unknownFields2.getClass();
        ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest62 = new ConfirmBitcoinDepositIntentRequest(requestContext, str32, unknownFields2);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$confirmBitcoinDepositIntent$122.L$0 = null;
        realCryptoService$confirmBitcoinDepositIntent$122.L$1 = null;
        realCryptoService$confirmBitcoinDepositIntent$122.L$2 = serviceContextWrapper;
        realCryptoService$confirmBitcoinDepositIntent$122.L$3 = confirmBitcoinDepositIntentRequest4;
        realCryptoService$confirmBitcoinDepositIntent$122.L$5 = exc;
        realCryptoService$confirmBitcoinDepositIntent$122.L$6 = requestContext;
        realCryptoService$confirmBitcoinDepositIntent$122.L$7 = null;
        realCryptoService$confirmBitcoinDepositIntent$122.L$8 = null;
        realCryptoService$confirmBitcoinDepositIntent$122.L$9 = confirmBitcoinDepositIntentRequest62;
        realCryptoService$confirmBitcoinDepositIntent$122.I$0 = i2;
        realCryptoService$confirmBitcoinDepositIntent$122.label = 2;
        confirmBitcoinDepositIntent = cryptoService2.confirmBitcoinDepositIntent(str2, confirmBitcoinDepositIntentRequest2, realCryptoService$confirmBitcoinDepositIntent$122);
        if (confirmBitcoinDepositIntent != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:72|(1:74)|75|(1:77)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|78|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d A[Catch: all -> 0x0064, LOOP:0: B:25:0x0137->B:27:0x013d, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0131, B:25:0x0137, B:27:0x013d, B:30:0x0151), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #4 {all -> 0x014c, blocks: (B:45:0x00f6, B:47:0x00fd), top: B:44:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.cash.crypto.service.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cryptoOnboarding(String str, StartCryptoOnboardingRequest startCryptoOnboardingRequest, Continuation continuation) {
        RealCryptoService$cryptoOnboarding$1 realCryptoService$cryptoOnboarding$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Exception exc;
        Object obj;
        int i2;
        String str2;
        ServiceContextWrapper serviceContextWrapper;
        RequestContext requestContext;
        int i3;
        StartCryptoOnboardingRequest copy$default;
        Object cryptoOnboarding;
        ServiceContextWrapper serviceContextWrapper2;
        Exception exc2;
        Message message;
        RequestContext requestContext2;
        ServiceContextWrapper serviceContextWrapper3;
        ApiResult apiResult;
        Object obj2;
        Message message2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        StartCryptoOnboardingRequest startCryptoOnboardingRequest2 = startCryptoOnboardingRequest;
        if (continuation instanceof RealCryptoService$cryptoOnboarding$1) {
            realCryptoService$cryptoOnboarding$1 = (RealCryptoService$cryptoOnboarding$1) continuation;
            int i4 = realCryptoService$cryptoOnboarding$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$cryptoOnboarding$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$cryptoOnboarding$1 realCryptoService$cryptoOnboarding$12 = realCryptoService$cryptoOnboarding$1;
                Object obj3 = realCryptoService$cryptoOnboarding$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$cryptoOnboarding$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = startCryptoOnboardingRequest2.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$cryptoOnboarding$12.L$0 = str;
                    realCryptoService$cryptoOnboarding$12.L$2 = this;
                    realCryptoService$cryptoOnboarding$12.L$3 = startCryptoOnboardingRequest2;
                    realCryptoService$cryptoOnboarding$12.L$5 = exc3;
                    realCryptoService$cryptoOnboarding$12.I$0 = 0;
                    realCryptoService$cryptoOnboarding$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, realCryptoService$cryptoOnboarding$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        str2 = str;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = realCryptoService$cryptoOnboarding$12.I$0;
                    Exception exc4 = realCryptoService$cryptoOnboarding$12.L$5;
                    ?? r7 = realCryptoService$cryptoOnboarding$12.L$3;
                    serviceContextWrapper = realCryptoService$cryptoOnboarding$12.L$2;
                    str2 = realCryptoService$cryptoOnboarding$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    startCryptoOnboardingRequest2 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$cryptoOnboarding$12.L$7;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$cryptoOnboarding$12.L$7;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = realCryptoService$cryptoOnboarding$12.I$0;
                        obj2 = realCryptoService$cryptoOnboarding$12.L$8;
                        message2 = (Message) realCryptoService$cryptoOnboarding$12.L$7;
                        requestContext2 = realCryptoService$cryptoOnboarding$12.L$6;
                        serviceContextWrapper3 = realCryptoService$cryptoOnboarding$12.L$2;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            realCryptoService$cryptoOnboarding$12.L$0 = null;
                            realCryptoService$cryptoOnboarding$12.L$2 = null;
                            realCryptoService$cryptoOnboarding$12.L$3 = null;
                            realCryptoService$cryptoOnboarding$12.L$5 = null;
                            realCryptoService$cryptoOnboarding$12.L$6 = null;
                            realCryptoService$cryptoOnboarding$12.L$7 = apiResult2;
                            realCryptoService$cryptoOnboarding$12.L$8 = null;
                            realCryptoService$cryptoOnboarding$12.L$9 = null;
                            realCryptoService$cryptoOnboarding$12.I$0 = i3;
                            realCryptoService$cryptoOnboarding$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$cryptoOnboarding$12.L$0 = null;
                            realCryptoService$cryptoOnboarding$12.L$2 = null;
                            realCryptoService$cryptoOnboarding$12.L$3 = null;
                            realCryptoService$cryptoOnboarding$12.L$5 = null;
                            realCryptoService$cryptoOnboarding$12.L$6 = null;
                            realCryptoService$cryptoOnboarding$12.L$7 = th;
                            realCryptoService$cryptoOnboarding$12.L$8 = null;
                            realCryptoService$cryptoOnboarding$12.L$9 = null;
                            realCryptoService$cryptoOnboarding$12.I$0 = i3;
                            realCryptoService$cryptoOnboarding$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) != coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = realCryptoService$cryptoOnboarding$12.I$0;
                    StartCryptoOnboardingRequest startCryptoOnboardingRequest3 = realCryptoService$cryptoOnboarding$12.L$9;
                    requestContext = realCryptoService$cryptoOnboarding$12.L$6;
                    Exception exc5 = realCryptoService$cryptoOnboarding$12.L$5;
                    message = realCryptoService$cryptoOnboarding$12.L$3;
                    serviceContextWrapper = realCryptoService$cryptoOnboarding$12.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        copy$default = startCryptoOnboardingRequest3;
                        serviceContextWrapper2 = serviceContextWrapper;
                        exc2 = exc5;
                        try {
                            apiResult = (ApiResult) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            requestContext2 = requestContext;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        requestContext2 = requestContext;
                        serviceContextWrapper3 = serviceContextWrapper;
                        realServiceContextManager = serviceContextWrapper3.contextManager;
                        realCryptoService$cryptoOnboarding$12.L$0 = null;
                        realCryptoService$cryptoOnboarding$12.L$2 = null;
                        realCryptoService$cryptoOnboarding$12.L$3 = null;
                        realCryptoService$cryptoOnboarding$12.L$5 = null;
                        realCryptoService$cryptoOnboarding$12.L$6 = null;
                        realCryptoService$cryptoOnboarding$12.L$7 = th;
                        realCryptoService$cryptoOnboarding$12.L$8 = null;
                        realCryptoService$cryptoOnboarding$12.L$9 = null;
                        realCryptoService$cryptoOnboarding$12.I$0 = i3;
                        realCryptoService$cryptoOnboarding$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) != coroutineSingletons) {
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((StartCryptoOnboardingResponse) ((ApiResult.Success) apiResult).response).response_context;
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$cryptoOnboarding$12.L$0 = null;
                        realCryptoService$cryptoOnboarding$12.L$2 = serviceContextWrapper2;
                        realCryptoService$cryptoOnboarding$12.L$3 = null;
                        realCryptoService$cryptoOnboarding$12.L$5 = null;
                        realCryptoService$cryptoOnboarding$12.L$6 = requestContext;
                        realCryptoService$cryptoOnboarding$12.L$7 = copy$default;
                        realCryptoService$cryptoOnboarding$12.L$8 = obj3;
                        realCryptoService$cryptoOnboarding$12.L$9 = null;
                        realCryptoService$cryptoOnboarding$12.I$0 = i3;
                        realCryptoService$cryptoOnboarding$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, realCryptoService$cryptoOnboarding$12) != coroutineSingletons) {
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                message2 = copy$default;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                realCryptoService$cryptoOnboarding$12.L$0 = null;
                                realCryptoService$cryptoOnboarding$12.L$2 = null;
                                realCryptoService$cryptoOnboarding$12.L$3 = null;
                                realCryptoService$cryptoOnboarding$12.L$5 = null;
                                realCryptoService$cryptoOnboarding$12.L$6 = null;
                                realCryptoService$cryptoOnboarding$12.L$7 = apiResult2;
                                realCryptoService$cryptoOnboarding$12.L$8 = null;
                                realCryptoService$cryptoOnboarding$12.L$9 = null;
                                realCryptoService$cryptoOnboarding$12.I$0 = i3;
                                realCryptoService$cryptoOnboarding$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            realCryptoService$cryptoOnboarding$12.L$0 = null;
                            realCryptoService$cryptoOnboarding$12.L$2 = null;
                            realCryptoService$cryptoOnboarding$12.L$3 = null;
                            realCryptoService$cryptoOnboarding$12.L$5 = null;
                            realCryptoService$cryptoOnboarding$12.L$6 = null;
                            realCryptoService$cryptoOnboarding$12.L$7 = th;
                            realCryptoService$cryptoOnboarding$12.L$8 = null;
                            realCryptoService$cryptoOnboarding$12.L$9 = null;
                            realCryptoService$cryptoOnboarding$12.I$0 = i3;
                            realCryptoService$cryptoOnboarding$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) != coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    realCryptoService$cryptoOnboarding$12.L$0 = null;
                    realCryptoService$cryptoOnboarding$12.L$2 = null;
                    realCryptoService$cryptoOnboarding$12.L$3 = null;
                    realCryptoService$cryptoOnboarding$12.L$5 = null;
                    realCryptoService$cryptoOnboarding$12.L$6 = null;
                    realCryptoService$cryptoOnboarding$12.L$7 = apiResult2;
                    realCryptoService$cryptoOnboarding$12.L$8 = null;
                    realCryptoService$cryptoOnboarding$12.L$9 = null;
                    realCryptoService$cryptoOnboarding$12.I$0 = i3;
                    realCryptoService$cryptoOnboarding$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$cryptoOnboarding$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                copy$default = StartCryptoOnboardingRequest.copy$default(startCryptoOnboardingRequest2, requestContext, null, 6);
                CryptoService cryptoService = this.delegate;
                realCryptoService$cryptoOnboarding$12.L$0 = null;
                realCryptoService$cryptoOnboarding$12.L$2 = serviceContextWrapper;
                realCryptoService$cryptoOnboarding$12.L$3 = startCryptoOnboardingRequest2;
                realCryptoService$cryptoOnboarding$12.L$5 = exc;
                realCryptoService$cryptoOnboarding$12.L$6 = requestContext;
                realCryptoService$cryptoOnboarding$12.L$7 = null;
                realCryptoService$cryptoOnboarding$12.L$8 = null;
                realCryptoService$cryptoOnboarding$12.L$9 = copy$default;
                realCryptoService$cryptoOnboarding$12.I$0 = i2;
                realCryptoService$cryptoOnboarding$12.label = 2;
                cryptoOnboarding = cryptoService.cryptoOnboarding(str2, copy$default, realCryptoService$cryptoOnboarding$12);
                if (cryptoOnboarding != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = startCryptoOnboardingRequest2;
                    i3 = i2;
                    obj3 = cryptoOnboarding;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$cryptoOnboarding$1 = new RealCryptoService$cryptoOnboarding$1(this, continuation);
        RealCryptoService$cryptoOnboarding$1 realCryptoService$cryptoOnboarding$122 = realCryptoService$cryptoOnboarding$1;
        Object obj32 = realCryptoService$cryptoOnboarding$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$cryptoOnboarding$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        copy$default = StartCryptoOnboardingRequest.copy$default(startCryptoOnboardingRequest2, requestContext, null, 6);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$cryptoOnboarding$122.L$0 = null;
        realCryptoService$cryptoOnboarding$122.L$2 = serviceContextWrapper;
        realCryptoService$cryptoOnboarding$122.L$3 = startCryptoOnboardingRequest2;
        realCryptoService$cryptoOnboarding$122.L$5 = exc;
        realCryptoService$cryptoOnboarding$122.L$6 = requestContext;
        realCryptoService$cryptoOnboarding$122.L$7 = null;
        realCryptoService$cryptoOnboarding$122.L$8 = null;
        realCryptoService$cryptoOnboarding$122.L$9 = copy$default;
        realCryptoService$cryptoOnboarding$122.I$0 = i2;
        realCryptoService$cryptoOnboarding$122.label = 2;
        cryptoOnboarding = cryptoService2.cryptoOnboarding(str2, copy$default, realCryptoService$cryptoOnboarding$122);
        if (cryptoOnboarding != coroutineSingletons) {
        }
    }

    @Override // com.squareup.protos.cash.cryptosparky.api.deposits.CryptoSparkyService
    public final Object generateLightningInvoice(GenerateLightningInvoice$Request generateLightningInvoice$Request, Continuation continuation) {
        return this.delegate.generateLightningInvoice(generateLightningInvoice$Request, continuation);
    }

    @Override // com.squareup.protos.cash.btcnetwork.external.BtcNetworkClientService
    public final Object getBitcoinSellerLocations(GetBitcoinSellerLocationsRequest getBitcoinSellerLocationsRequest, Continuation continuation) {
        return this.delegate.getBitcoinSellerLocations(getBitcoinSellerLocationsRequest, continuation);
    }

    @Override // com.squareup.cash.crypto.service.CryptoService
    public final Object getCryptoStatements(GetCryptoTaxStatementsClientRequest getCryptoTaxStatementsClientRequest, Continuation continuation) {
        return this.delegate.getCryptoStatements(getCryptoTaxStatementsClientRequest, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(3:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(12:20|21|22|23|24|25|(2:28|26)|29|30|31|32|(1:35)(1:34)))(7:45|46|47|48|49|50|(7:52|53|54|55|56|(9:58|24|25|(1:26)|29|30|31|32|(0))|35)(4:63|31|32|(0)(0)))|39|(0)(1:41))(1:69))(5:86|(1:88)|89|(1:91)|35)|70|71|72|73|74|75|76|(4:78|49|50|(0)(0))|35))|92|6|(0)(0)|70|71|72|73|74|75|76|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r8 = r2;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0173 A[Catch: all -> 0x017d, LOOP:0: B:26:0x016d->B:28:0x0173, LOOP_END, TryCatch #6 {all -> 0x017d, blocks: (B:25:0x0167, B:26:0x016d, B:28:0x0173, B:31:0x018d), top: B:24:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #4 {all -> 0x0187, blocks: (B:50:0x0119, B:52:0x0120), top: B:49:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r12v2, types: [app.cash.api.wrapper.ServiceContextWrapper] */
    @Override // com.squareup.protos.cash.cryptosparky.api.CryptoSparkyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiateBitcoinWithdrawal(ClientScenario clientScenario, String str, String str2, InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request, Continuation continuation) {
        RealCryptoService$initiateBitcoinWithdrawal$1 realCryptoService$initiateBitcoinWithdrawal$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ClientScenario clientScenario2;
        String str3;
        String str4;
        Message message;
        int i2;
        Exception exc;
        RealCryptoService realCryptoService;
        RealCryptoService$initiateBitcoinWithdrawal$1 realCryptoService$initiateBitcoinWithdrawal$12;
        RequestContext requestContext;
        ServiceContextWrapper serviceContextWrapper;
        Object initiateBitcoinWithdrawal;
        RequestContext requestContext2;
        InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request2;
        ApiResult apiResult;
        Message message2;
        Object obj;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager;
        Iterator it;
        if (continuation instanceof RealCryptoService$initiateBitcoinWithdrawal$1) {
            realCryptoService$initiateBitcoinWithdrawal$1 = (RealCryptoService$initiateBitcoinWithdrawal$1) continuation;
            int i3 = realCryptoService$initiateBitcoinWithdrawal$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$initiateBitcoinWithdrawal$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj2 = realCryptoService$initiateBitcoinWithdrawal$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$initiateBitcoinWithdrawal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    RequestContext requestContext3 = initiateBitcoinWithdrawal$Request.request_context;
                    Exception exc2 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    clientScenario2 = clientScenario;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$0 = clientScenario2;
                    str3 = str;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$1 = str3;
                    str4 = str2;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$2 = str4;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$4 = this;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$5 = initiateBitcoinWithdrawal$Request;
                    realCryptoService$initiateBitcoinWithdrawal$1.L$7 = exc2;
                    realCryptoService$initiateBitcoinWithdrawal$1.I$0 = 0;
                    realCryptoService$initiateBitcoinWithdrawal$1.label = 1;
                    obj2 = this.contextManager.produceRequestContext(requestContext3, realCryptoService$initiateBitcoinWithdrawal$1);
                    if (obj2 != coroutineSingletons) {
                        message = initiateBitcoinWithdrawal$Request;
                        i2 = 0;
                        exc = exc2;
                        realCryptoService = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$initiateBitcoinWithdrawal$1.L$9;
                                SafeTrace.throwOnFailure(obj2);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$initiateBitcoinWithdrawal$1.L$9;
                            SafeTrace.throwOnFailure(obj2);
                            throw th;
                        }
                        i2 = realCryptoService$initiateBitcoinWithdrawal$1.I$0;
                        obj = realCryptoService$initiateBitcoinWithdrawal$1.L$10;
                        message2 = (Message) realCryptoService$initiateBitcoinWithdrawal$1.L$9;
                        requestContext = realCryptoService$initiateBitcoinWithdrawal$1.L$8;
                        serviceContextWrapper = realCryptoService$initiateBitcoinWithdrawal$1.L$4;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$1;
                            try {
                                it = serviceContextWrapper.requestListeners.iterator();
                                while (it.hasNext()) {
                                    ((PaymentRequestsListener) it.next()).onRequest(message2);
                                }
                                obj2 = obj;
                                apiResult2 = (ApiResult) obj2;
                                realServiceContextManager = serviceContextWrapper.contextManager;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$0 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$1 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$2 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$4 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$5 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$7 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$8 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$9 = apiResult2;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$10 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$11 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.I$0 = i2;
                                realCryptoService$initiateBitcoinWithdrawal$12.label = 4;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$1;
                        }
                        return realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateBitcoinWithdrawal$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i2 = realCryptoService$initiateBitcoinWithdrawal$1.I$0;
                    initiateBitcoinWithdrawal$Request2 = realCryptoService$initiateBitcoinWithdrawal$1.L$11;
                    requestContext2 = realCryptoService$initiateBitcoinWithdrawal$1.L$8;
                    Exception exc3 = realCryptoService$initiateBitcoinWithdrawal$1.L$7;
                    message = realCryptoService$initiateBitcoinWithdrawal$1.L$5;
                    ServiceContextWrapper serviceContextWrapper2 = realCryptoService$initiateBitcoinWithdrawal$1.L$4;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                        exc = exc3;
                        serviceContextWrapper = serviceContextWrapper2;
                        try {
                            apiResult = (ApiResult) obj2;
                        } catch (Throwable th4) {
                            th = th4;
                            realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$1;
                            requestContext = requestContext2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$1;
                        requestContext = requestContext2;
                        serviceContextWrapper = serviceContextWrapper2;
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager2 = serviceContextWrapper.contextManager;
                        ResponseContext responseContext = ((InitiateBitcoinWithdrawal$Response) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$initiateBitcoinWithdrawal$1.L$0 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$1 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$2 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$4 = serviceContextWrapper;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$5 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$7 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$8 = requestContext2;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$9 = initiateBitcoinWithdrawal$Request2;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$10 = obj2;
                        realCryptoService$initiateBitcoinWithdrawal$1.L$11 = null;
                        realCryptoService$initiateBitcoinWithdrawal$1.I$0 = i2;
                        realCryptoService$initiateBitcoinWithdrawal$1.label = 3;
                        RealCryptoService$initiateBitcoinWithdrawal$1 realCryptoService$initiateBitcoinWithdrawal$13 = realCryptoService$initiateBitcoinWithdrawal$1;
                        RequestContext requestContext4 = requestContext2;
                        try {
                            Object consumeResponseContext = realServiceContextManager2.consumeResponseContext(requestContext4, responseContext, simpleName, exc, realCryptoService$initiateBitcoinWithdrawal$13);
                            requestContext = requestContext4;
                            realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$13;
                            if (consumeResponseContext != coroutineSingletons) {
                                message2 = initiateBitcoinWithdrawal$Request2;
                                obj = obj2;
                                it = serviceContextWrapper.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj2 = obj;
                                apiResult2 = (ApiResult) obj2;
                                realServiceContextManager = serviceContextWrapper.contextManager;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$0 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$1 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$2 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$4 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$5 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$7 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$8 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$9 = apiResult2;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$10 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.L$11 = null;
                                realCryptoService$initiateBitcoinWithdrawal$12.I$0 = i2;
                                realCryptoService$initiateBitcoinWithdrawal$12.label = 4;
                                if (realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateBitcoinWithdrawal$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            requestContext = requestContext4;
                            realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$13;
                        }
                    }
                    realCryptoService$initiateBitcoinWithdrawal$12 = realCryptoService$initiateBitcoinWithdrawal$1;
                    requestContext = requestContext2;
                    apiResult2 = (ApiResult) obj2;
                    realServiceContextManager = serviceContextWrapper.contextManager;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$0 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$1 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$2 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$4 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$5 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$7 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$8 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$9 = apiResult2;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$10 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$11 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.I$0 = i2;
                    realCryptoService$initiateBitcoinWithdrawal$12.label = 4;
                    if (realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateBitcoinWithdrawal$12) == coroutineSingletons) {
                    }
                    RealServiceContextManager realServiceContextManager3 = serviceContextWrapper.contextManager;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$0 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$1 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$2 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$4 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$5 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$7 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$8 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$9 = th;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$10 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.L$11 = null;
                    realCryptoService$initiateBitcoinWithdrawal$12.I$0 = i2;
                    realCryptoService$initiateBitcoinWithdrawal$12.label = 5;
                    if (realServiceContextManager3.requestComplete(requestContext, realCryptoService$initiateBitcoinWithdrawal$12) == coroutineSingletons) {
                        throw th;
                    }
                } else {
                    i2 = realCryptoService$initiateBitcoinWithdrawal$1.I$0;
                    Exception exc4 = realCryptoService$initiateBitcoinWithdrawal$1.L$7;
                    message = realCryptoService$initiateBitcoinWithdrawal$1.L$5;
                    ?? r12 = realCryptoService$initiateBitcoinWithdrawal$1.L$4;
                    String str5 = realCryptoService$initiateBitcoinWithdrawal$1.L$2;
                    String str6 = realCryptoService$initiateBitcoinWithdrawal$1.L$1;
                    ClientScenario clientScenario3 = realCryptoService$initiateBitcoinWithdrawal$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    exc = exc4;
                    realCryptoService = r12;
                    clientScenario2 = clientScenario3;
                    str4 = str5;
                    str3 = str6;
                }
                RequestContext requestContext5 = (RequestContext) obj2;
                InitiateBitcoinWithdrawal$Request copy$default = InitiateBitcoinWithdrawal$Request.copy$default((InitiateBitcoinWithdrawal$Request) message, requestContext5, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                CryptoService cryptoService = this.delegate;
                realCryptoService$initiateBitcoinWithdrawal$1.L$0 = null;
                realCryptoService$initiateBitcoinWithdrawal$1.L$1 = null;
                realCryptoService$initiateBitcoinWithdrawal$1.L$2 = null;
                realCryptoService$initiateBitcoinWithdrawal$1.L$4 = realCryptoService;
                realCryptoService$initiateBitcoinWithdrawal$1.L$5 = message;
                realCryptoService$initiateBitcoinWithdrawal$1.L$7 = exc;
                realCryptoService$initiateBitcoinWithdrawal$1.L$8 = requestContext5;
                realCryptoService$initiateBitcoinWithdrawal$1.L$9 = null;
                realCryptoService$initiateBitcoinWithdrawal$1.L$10 = null;
                realCryptoService$initiateBitcoinWithdrawal$1.L$11 = copy$default;
                realCryptoService$initiateBitcoinWithdrawal$1.I$0 = i2;
                realCryptoService$initiateBitcoinWithdrawal$1.label = 2;
                RealCryptoService$initiateBitcoinWithdrawal$1 realCryptoService$initiateBitcoinWithdrawal$14 = realCryptoService$initiateBitcoinWithdrawal$1;
                initiateBitcoinWithdrawal = cryptoService.initiateBitcoinWithdrawal(clientScenario2, str3, str4, copy$default, realCryptoService$initiateBitcoinWithdrawal$14);
                realCryptoService$initiateBitcoinWithdrawal$1 = realCryptoService$initiateBitcoinWithdrawal$14;
                if (initiateBitcoinWithdrawal != coroutineSingletons) {
                    serviceContextWrapper = realCryptoService;
                    requestContext2 = requestContext5;
                    obj2 = initiateBitcoinWithdrawal;
                    initiateBitcoinWithdrawal$Request2 = copy$default;
                    apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$initiateBitcoinWithdrawal$1 = new RealCryptoService$initiateBitcoinWithdrawal$1(this, continuation);
        Object obj22 = realCryptoService$initiateBitcoinWithdrawal$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$initiateBitcoinWithdrawal$1.label;
        if (i != 0) {
        }
        RequestContext requestContext52 = (RequestContext) obj22;
        InitiateBitcoinWithdrawal$Request copy$default2 = InitiateBitcoinWithdrawal$Request.copy$default((InitiateBitcoinWithdrawal$Request) message, requestContext52, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$initiateBitcoinWithdrawal$1.L$0 = null;
        realCryptoService$initiateBitcoinWithdrawal$1.L$1 = null;
        realCryptoService$initiateBitcoinWithdrawal$1.L$2 = null;
        realCryptoService$initiateBitcoinWithdrawal$1.L$4 = realCryptoService;
        realCryptoService$initiateBitcoinWithdrawal$1.L$5 = message;
        realCryptoService$initiateBitcoinWithdrawal$1.L$7 = exc;
        realCryptoService$initiateBitcoinWithdrawal$1.L$8 = requestContext52;
        realCryptoService$initiateBitcoinWithdrawal$1.L$9 = null;
        realCryptoService$initiateBitcoinWithdrawal$1.L$10 = null;
        realCryptoService$initiateBitcoinWithdrawal$1.L$11 = copy$default2;
        realCryptoService$initiateBitcoinWithdrawal$1.I$0 = i2;
        realCryptoService$initiateBitcoinWithdrawal$1.label = 2;
        RealCryptoService$initiateBitcoinWithdrawal$1 realCryptoService$initiateBitcoinWithdrawal$142 = realCryptoService$initiateBitcoinWithdrawal$1;
        initiateBitcoinWithdrawal = cryptoService2.initiateBitcoinWithdrawal(clientScenario2, str3, str4, copy$default2, realCryptoService$initiateBitcoinWithdrawal$142);
        realCryptoService$initiateBitcoinWithdrawal$1 = realCryptoService$initiateBitcoinWithdrawal$142;
        if (initiateBitcoinWithdrawal != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:78|(1:80)|81|(1:83)|34)|64|65|66|67|68|69|(4:71|44|45|(0)(0))|34))|84|6|7|(0)(0)|64|65|66|67|68|69|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0194, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0195, code lost:
    
        r1 = r2;
        r6 = r8;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e A[Catch: all -> 0x0064, LOOP:0: B:25:0x0158->B:27:0x015e, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0152, B:25:0x0158, B:27:0x015e, B:30:0x0172), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #5 {all -> 0x016d, blocks: (B:45:0x0113, B:47:0x011a), top: B:44:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.cash.crypto.service.CryptoService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiateCryptoExchange(String str, ExchangeRequest exchangeRequest, Continuation continuation) {
        RealCryptoService$initiateCryptoExchange$1 realCryptoService$initiateCryptoExchange$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Exception exc;
        String str2;
        ServiceContextWrapper serviceContextWrapper;
        Object obj;
        int i2;
        ExchangeRequest exchangeRequest2;
        int i3;
        ServiceContextWrapper serviceContextWrapper2;
        RequestContext requestContext;
        Object initiateCryptoExchange;
        ServiceContextWrapper serviceContextWrapper3;
        Exception exc2;
        Message message;
        ExchangeRequest exchangeRequest3;
        RequestContext requestContext2;
        ApiResult apiResult;
        Message message2;
        Object obj2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        ExchangeRequest exchangeRequest4 = exchangeRequest;
        if (continuation instanceof RealCryptoService$initiateCryptoExchange$1) {
            realCryptoService$initiateCryptoExchange$1 = (RealCryptoService$initiateCryptoExchange$1) continuation;
            int i4 = realCryptoService$initiateCryptoExchange$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$initiateCryptoExchange$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$initiateCryptoExchange$1 realCryptoService$initiateCryptoExchange$12 = realCryptoService$initiateCryptoExchange$1;
                Object obj3 = realCryptoService$initiateCryptoExchange$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$initiateCryptoExchange$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = exchangeRequest4.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$initiateCryptoExchange$12.L$0 = str;
                    realCryptoService$initiateCryptoExchange$12.L$1 = exchangeRequest4;
                    realCryptoService$initiateCryptoExchange$12.L$2 = this;
                    realCryptoService$initiateCryptoExchange$12.L$3 = exchangeRequest4;
                    realCryptoService$initiateCryptoExchange$12.L$5 = exc3;
                    realCryptoService$initiateCryptoExchange$12.I$0 = 0;
                    realCryptoService$initiateCryptoExchange$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, realCryptoService$initiateCryptoExchange$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        str2 = str;
                        serviceContextWrapper = this;
                        obj = produceRequestContext;
                        i2 = 0;
                        exchangeRequest2 = exchangeRequest4;
                    }
                }
                if (i == 1) {
                    int i5 = realCryptoService$initiateCryptoExchange$12.I$0;
                    Exception exc4 = realCryptoService$initiateCryptoExchange$12.L$5;
                    ?? r7 = realCryptoService$initiateCryptoExchange$12.L$3;
                    serviceContextWrapper = realCryptoService$initiateCryptoExchange$12.L$2;
                    exchangeRequest2 = realCryptoService$initiateCryptoExchange$12.L$1;
                    str2 = realCryptoService$initiateCryptoExchange$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    exchangeRequest4 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$initiateCryptoExchange$12.L$7;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$initiateCryptoExchange$12.L$7;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = realCryptoService$initiateCryptoExchange$12.I$0;
                        obj2 = realCryptoService$initiateCryptoExchange$12.L$8;
                        message2 = (Message) realCryptoService$initiateCryptoExchange$12.L$7;
                        requestContext = realCryptoService$initiateCryptoExchange$12.L$6;
                        serviceContextWrapper2 = realCryptoService$initiateCryptoExchange$12.L$2;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper2.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper2.contextManager;
                            realCryptoService$initiateCryptoExchange$12.L$0 = null;
                            realCryptoService$initiateCryptoExchange$12.L$1 = null;
                            realCryptoService$initiateCryptoExchange$12.L$2 = null;
                            realCryptoService$initiateCryptoExchange$12.L$3 = null;
                            realCryptoService$initiateCryptoExchange$12.L$5 = null;
                            realCryptoService$initiateCryptoExchange$12.L$6 = null;
                            realCryptoService$initiateCryptoExchange$12.L$7 = apiResult2;
                            realCryptoService$initiateCryptoExchange$12.L$8 = null;
                            realCryptoService$initiateCryptoExchange$12.L$9 = null;
                            realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                            realCryptoService$initiateCryptoExchange$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper2.contextManager;
                            realCryptoService$initiateCryptoExchange$12.L$0 = null;
                            realCryptoService$initiateCryptoExchange$12.L$1 = null;
                            realCryptoService$initiateCryptoExchange$12.L$2 = null;
                            realCryptoService$initiateCryptoExchange$12.L$3 = null;
                            realCryptoService$initiateCryptoExchange$12.L$5 = null;
                            realCryptoService$initiateCryptoExchange$12.L$6 = null;
                            realCryptoService$initiateCryptoExchange$12.L$7 = th;
                            realCryptoService$initiateCryptoExchange$12.L$8 = null;
                            realCryptoService$initiateCryptoExchange$12.L$9 = null;
                            realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                            realCryptoService$initiateCryptoExchange$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = realCryptoService$initiateCryptoExchange$12.I$0;
                    exchangeRequest3 = realCryptoService$initiateCryptoExchange$12.L$9;
                    requestContext2 = realCryptoService$initiateCryptoExchange$12.L$6;
                    Exception exc5 = realCryptoService$initiateCryptoExchange$12.L$5;
                    message = realCryptoService$initiateCryptoExchange$12.L$3;
                    ServiceContextWrapper serviceContextWrapper4 = realCryptoService$initiateCryptoExchange$12.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        serviceContextWrapper3 = serviceContextWrapper4;
                        exc2 = exc5;
                        try {
                            apiResult = (ApiResult) obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            requestContext = requestContext2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        requestContext = requestContext2;
                        serviceContextWrapper2 = serviceContextWrapper4;
                        realServiceContextManager = serviceContextWrapper2.contextManager;
                        realCryptoService$initiateCryptoExchange$12.L$0 = null;
                        realCryptoService$initiateCryptoExchange$12.L$1 = null;
                        realCryptoService$initiateCryptoExchange$12.L$2 = null;
                        realCryptoService$initiateCryptoExchange$12.L$3 = null;
                        realCryptoService$initiateCryptoExchange$12.L$5 = null;
                        realCryptoService$initiateCryptoExchange$12.L$6 = null;
                        realCryptoService$initiateCryptoExchange$12.L$7 = th;
                        realCryptoService$initiateCryptoExchange$12.L$8 = null;
                        realCryptoService$initiateCryptoExchange$12.L$9 = null;
                        realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                        realCryptoService$initiateCryptoExchange$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper3.contextManager;
                        ResponseContext responseContext = ((ExchangeResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$initiateCryptoExchange$12.L$0 = null;
                        realCryptoService$initiateCryptoExchange$12.L$1 = null;
                        realCryptoService$initiateCryptoExchange$12.L$2 = serviceContextWrapper3;
                        realCryptoService$initiateCryptoExchange$12.L$3 = null;
                        realCryptoService$initiateCryptoExchange$12.L$5 = null;
                        realCryptoService$initiateCryptoExchange$12.L$6 = requestContext2;
                        realCryptoService$initiateCryptoExchange$12.L$7 = exchangeRequest3;
                        realCryptoService$initiateCryptoExchange$12.L$8 = obj3;
                        realCryptoService$initiateCryptoExchange$12.L$9 = null;
                        realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                        realCryptoService$initiateCryptoExchange$12.label = 3;
                        requestContext = requestContext2;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext, responseContext, simpleName, exc2, realCryptoService$initiateCryptoExchange$12) != coroutineSingletons) {
                                message2 = exchangeRequest3;
                                obj2 = obj3;
                                serviceContextWrapper2 = serviceContextWrapper3;
                                it = serviceContextWrapper2.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper2.contextManager;
                                realCryptoService$initiateCryptoExchange$12.L$0 = null;
                                realCryptoService$initiateCryptoExchange$12.L$1 = null;
                                realCryptoService$initiateCryptoExchange$12.L$2 = null;
                                realCryptoService$initiateCryptoExchange$12.L$3 = null;
                                realCryptoService$initiateCryptoExchange$12.L$5 = null;
                                realCryptoService$initiateCryptoExchange$12.L$6 = null;
                                realCryptoService$initiateCryptoExchange$12.L$7 = apiResult2;
                                realCryptoService$initiateCryptoExchange$12.L$8 = null;
                                realCryptoService$initiateCryptoExchange$12.L$9 = null;
                                realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                                realCryptoService$initiateCryptoExchange$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper2 = serviceContextWrapper3;
                            realServiceContextManager = serviceContextWrapper2.contextManager;
                            realCryptoService$initiateCryptoExchange$12.L$0 = null;
                            realCryptoService$initiateCryptoExchange$12.L$1 = null;
                            realCryptoService$initiateCryptoExchange$12.L$2 = null;
                            realCryptoService$initiateCryptoExchange$12.L$3 = null;
                            realCryptoService$initiateCryptoExchange$12.L$5 = null;
                            realCryptoService$initiateCryptoExchange$12.L$6 = null;
                            realCryptoService$initiateCryptoExchange$12.L$7 = th;
                            realCryptoService$initiateCryptoExchange$12.L$8 = null;
                            realCryptoService$initiateCryptoExchange$12.L$9 = null;
                            realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                            realCryptoService$initiateCryptoExchange$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext = requestContext2;
                    serviceContextWrapper2 = serviceContextWrapper3;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper2.contextManager;
                    realCryptoService$initiateCryptoExchange$12.L$0 = null;
                    realCryptoService$initiateCryptoExchange$12.L$1 = null;
                    realCryptoService$initiateCryptoExchange$12.L$2 = null;
                    realCryptoService$initiateCryptoExchange$12.L$3 = null;
                    realCryptoService$initiateCryptoExchange$12.L$5 = null;
                    realCryptoService$initiateCryptoExchange$12.L$6 = null;
                    realCryptoService$initiateCryptoExchange$12.L$7 = apiResult2;
                    realCryptoService$initiateCryptoExchange$12.L$8 = null;
                    realCryptoService$initiateCryptoExchange$12.L$9 = null;
                    realCryptoService$initiateCryptoExchange$12.I$0 = i3;
                    realCryptoService$initiateCryptoExchange$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext, realCryptoService$initiateCryptoExchange$12) == coroutineSingletons) {
                    }
                }
                RequestContext requestContext4 = (RequestContext) obj;
                ExchangeRequest copy$default = ExchangeRequest.copy$default(exchangeRequest4, null, null, null, requestContext4, null, null, null, null, null, 8127);
                RequestContext requestContext5 = requestContext4;
                CryptoService cryptoService = this.delegate;
                realCryptoService$initiateCryptoExchange$12.L$0 = null;
                realCryptoService$initiateCryptoExchange$12.L$1 = null;
                realCryptoService$initiateCryptoExchange$12.L$2 = serviceContextWrapper;
                realCryptoService$initiateCryptoExchange$12.L$3 = exchangeRequest4;
                realCryptoService$initiateCryptoExchange$12.L$5 = exc;
                realCryptoService$initiateCryptoExchange$12.L$6 = requestContext5;
                realCryptoService$initiateCryptoExchange$12.L$7 = null;
                realCryptoService$initiateCryptoExchange$12.L$8 = null;
                realCryptoService$initiateCryptoExchange$12.L$9 = copy$default;
                realCryptoService$initiateCryptoExchange$12.I$0 = i2;
                realCryptoService$initiateCryptoExchange$12.label = 2;
                initiateCryptoExchange = cryptoService.initiateCryptoExchange(str2, exchangeRequest2, realCryptoService$initiateCryptoExchange$12);
                if (initiateCryptoExchange != coroutineSingletons) {
                    serviceContextWrapper3 = serviceContextWrapper;
                    exc2 = exc;
                    message = exchangeRequest4;
                    i3 = i2;
                    obj3 = initiateCryptoExchange;
                    exchangeRequest3 = copy$default;
                    requestContext2 = requestContext5;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$initiateCryptoExchange$1 = new RealCryptoService$initiateCryptoExchange$1(this, continuation);
        RealCryptoService$initiateCryptoExchange$1 realCryptoService$initiateCryptoExchange$122 = realCryptoService$initiateCryptoExchange$1;
        Object obj32 = realCryptoService$initiateCryptoExchange$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$initiateCryptoExchange$122.label;
        if (i != 0) {
        }
        RequestContext requestContext42 = (RequestContext) obj;
        ExchangeRequest copy$default2 = ExchangeRequest.copy$default(exchangeRequest4, null, null, null, requestContext42, null, null, null, null, null, 8127);
        RequestContext requestContext52 = requestContext42;
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$initiateCryptoExchange$122.L$0 = null;
        realCryptoService$initiateCryptoExchange$122.L$1 = null;
        realCryptoService$initiateCryptoExchange$122.L$2 = serviceContextWrapper;
        realCryptoService$initiateCryptoExchange$122.L$3 = exchangeRequest4;
        realCryptoService$initiateCryptoExchange$122.L$5 = exc;
        realCryptoService$initiateCryptoExchange$122.L$6 = requestContext52;
        realCryptoService$initiateCryptoExchange$122.L$7 = null;
        realCryptoService$initiateCryptoExchange$122.L$8 = null;
        realCryptoService$initiateCryptoExchange$122.L$9 = copy$default2;
        realCryptoService$initiateCryptoExchange$122.I$0 = i2;
        realCryptoService$initiateCryptoExchange$122.label = 2;
        initiateCryptoExchange = cryptoService2.initiateCryptoExchange(str2, exchangeRequest2, realCryptoService$initiateCryptoExchange$122);
        if (initiateCryptoExchange != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(8:40|41|42|43|44|45|46|(3:48|(8:50|24|(1:25)|28|29|30|31|(0))|34)(4:52|30|31|(0)(0))))(1:58))(5:67|(1:69)|70|(1:72)|34)|59|60|61|(5:63|44|45|46|(0)(0))|34))|73|6|7|(0)(0)|59|60|61|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0196, code lost:
    
        r5 = r4;
        r6 = r8;
        r1 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0160 A[Catch: all -> 0x0064, LOOP:0: B:25:0x015a->B:27:0x0160, LOOP_END, TryCatch #1 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0154, B:25:0x015a, B:27:0x0160, B:30:0x0170), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #3 {all -> 0x016c, blocks: (B:46:0x0113, B:48:0x011a), top: B:45:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.protos.cash.cryptosparky.api.deposits.CryptoSparkyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshInvoice(ClientScenario clientScenario, String str, RefreshInvoice$Request refreshInvoice$Request, Continuation continuation) {
        RealCryptoService$refreshInvoice$1 realCryptoService$refreshInvoice$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        int i2;
        Exception exc;
        ClientScenario clientScenario2;
        ServiceContextWrapper serviceContextWrapper;
        Object obj2;
        RefreshInvoice$Request refreshInvoice$Request2;
        RequestContext requestContext;
        RequestContext requestContext2;
        ServiceContextWrapper serviceContextWrapper2;
        int i3;
        RefreshInvoice$Request refreshInvoice$Request3;
        ServiceContextWrapper serviceContextWrapper3;
        Exception exc2;
        Message message;
        ApiResult apiResult;
        Message message2;
        Object obj3;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        RefreshInvoice$Request refreshInvoice$Request4 = refreshInvoice$Request;
        if (continuation instanceof RealCryptoService$refreshInvoice$1) {
            realCryptoService$refreshInvoice$1 = (RealCryptoService$refreshInvoice$1) continuation;
            int i4 = realCryptoService$refreshInvoice$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$refreshInvoice$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$refreshInvoice$1 realCryptoService$refreshInvoice$12 = realCryptoService$refreshInvoice$1;
                obj = realCryptoService$refreshInvoice$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$refreshInvoice$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestContext requestContext3 = refreshInvoice$Request4.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$refreshInvoice$12.L$0 = clientScenario;
                    str2 = str;
                    realCryptoService$refreshInvoice$12.L$1 = str2;
                    realCryptoService$refreshInvoice$12.L$2 = refreshInvoice$Request4;
                    realCryptoService$refreshInvoice$12.L$3 = this;
                    realCryptoService$refreshInvoice$12.L$4 = refreshInvoice$Request4;
                    realCryptoService$refreshInvoice$12.L$6 = exc3;
                    i2 = 0;
                    realCryptoService$refreshInvoice$12.I$0 = 0;
                    realCryptoService$refreshInvoice$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, realCryptoService$refreshInvoice$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                        obj2 = produceRequestContext;
                        refreshInvoice$Request2 = refreshInvoice$Request4;
                    }
                }
                if (i == 1) {
                    int i5 = realCryptoService$refreshInvoice$12.I$0;
                    Exception exc4 = realCryptoService$refreshInvoice$12.L$6;
                    ?? r7 = realCryptoService$refreshInvoice$12.L$4;
                    serviceContextWrapper = realCryptoService$refreshInvoice$12.L$3;
                    RefreshInvoice$Request refreshInvoice$Request5 = realCryptoService$refreshInvoice$12.L$2;
                    String str3 = realCryptoService$refreshInvoice$12.L$1;
                    clientScenario2 = realCryptoService$refreshInvoice$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = i5;
                    refreshInvoice$Request4 = r7;
                    exc = exc4;
                    obj2 = obj;
                    refreshInvoice$Request2 = refreshInvoice$Request5;
                    str2 = str3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$refreshInvoice$12.L$8;
                                SafeTrace.throwOnFailure(obj);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) realCryptoService$refreshInvoice$12.L$8;
                            SafeTrace.throwOnFailure(obj);
                            throw th;
                        }
                        i3 = realCryptoService$refreshInvoice$12.I$0;
                        obj3 = realCryptoService$refreshInvoice$12.L$9;
                        message2 = (Message) realCryptoService$refreshInvoice$12.L$8;
                        requestContext2 = realCryptoService$refreshInvoice$12.L$7;
                        serviceContextWrapper2 = realCryptoService$refreshInvoice$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            it = serviceContextWrapper2.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj = obj3;
                            apiResult2 = (ApiResult) obj;
                            realServiceContextManager2 = serviceContextWrapper2.contextManager;
                            realCryptoService$refreshInvoice$12.L$0 = null;
                            realCryptoService$refreshInvoice$12.L$1 = null;
                            realCryptoService$refreshInvoice$12.L$2 = null;
                            realCryptoService$refreshInvoice$12.L$3 = null;
                            realCryptoService$refreshInvoice$12.L$4 = null;
                            realCryptoService$refreshInvoice$12.L$6 = null;
                            realCryptoService$refreshInvoice$12.L$7 = null;
                            realCryptoService$refreshInvoice$12.L$8 = apiResult2;
                            realCryptoService$refreshInvoice$12.L$9 = null;
                            realCryptoService$refreshInvoice$12.L$10 = null;
                            realCryptoService$refreshInvoice$12.I$0 = i3;
                            realCryptoService$refreshInvoice$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper2.contextManager;
                            realCryptoService$refreshInvoice$12.L$0 = null;
                            realCryptoService$refreshInvoice$12.L$1 = null;
                            realCryptoService$refreshInvoice$12.L$2 = null;
                            realCryptoService$refreshInvoice$12.L$3 = null;
                            realCryptoService$refreshInvoice$12.L$4 = null;
                            realCryptoService$refreshInvoice$12.L$6 = null;
                            realCryptoService$refreshInvoice$12.L$7 = null;
                            realCryptoService$refreshInvoice$12.L$8 = th;
                            realCryptoService$refreshInvoice$12.L$9 = null;
                            realCryptoService$refreshInvoice$12.L$10 = null;
                            realCryptoService$refreshInvoice$12.I$0 = i3;
                            realCryptoService$refreshInvoice$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = realCryptoService$refreshInvoice$12.I$0;
                    refreshInvoice$Request3 = realCryptoService$refreshInvoice$12.L$10;
                    requestContext = realCryptoService$refreshInvoice$12.L$7;
                    Exception exc5 = realCryptoService$refreshInvoice$12.L$6;
                    message = realCryptoService$refreshInvoice$12.L$4;
                    ServiceContextWrapper serviceContextWrapper4 = realCryptoService$refreshInvoice$12.L$3;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        serviceContextWrapper3 = serviceContextWrapper4;
                        exc2 = exc5;
                        requestContext2 = requestContext;
                    } catch (Throwable th3) {
                        th = th3;
                        requestContext2 = requestContext;
                        serviceContextWrapper2 = serviceContextWrapper4;
                        realServiceContextManager = serviceContextWrapper2.contextManager;
                        realCryptoService$refreshInvoice$12.L$0 = null;
                        realCryptoService$refreshInvoice$12.L$1 = null;
                        realCryptoService$refreshInvoice$12.L$2 = null;
                        realCryptoService$refreshInvoice$12.L$3 = null;
                        realCryptoService$refreshInvoice$12.L$4 = null;
                        realCryptoService$refreshInvoice$12.L$6 = null;
                        realCryptoService$refreshInvoice$12.L$7 = null;
                        realCryptoService$refreshInvoice$12.L$8 = th;
                        realCryptoService$refreshInvoice$12.L$9 = null;
                        realCryptoService$refreshInvoice$12.L$10 = null;
                        realCryptoService$refreshInvoice$12.I$0 = i3;
                        realCryptoService$refreshInvoice$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    try {
                        apiResult = (ApiResult) obj;
                    } catch (Throwable th4) {
                        th = th4;
                        serviceContextWrapper2 = serviceContextWrapper3;
                        realServiceContextManager = serviceContextWrapper2.contextManager;
                        realCryptoService$refreshInvoice$12.L$0 = null;
                        realCryptoService$refreshInvoice$12.L$1 = null;
                        realCryptoService$refreshInvoice$12.L$2 = null;
                        realCryptoService$refreshInvoice$12.L$3 = null;
                        realCryptoService$refreshInvoice$12.L$4 = null;
                        realCryptoService$refreshInvoice$12.L$6 = null;
                        realCryptoService$refreshInvoice$12.L$7 = null;
                        realCryptoService$refreshInvoice$12.L$8 = th;
                        realCryptoService$refreshInvoice$12.L$9 = null;
                        realCryptoService$refreshInvoice$12.L$10 = null;
                        realCryptoService$refreshInvoice$12.I$0 = i3;
                        realCryptoService$refreshInvoice$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons) {
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper3.contextManager;
                        ResponseContext responseContext = ((RefreshInvoice$Response) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$refreshInvoice$12.L$0 = null;
                        realCryptoService$refreshInvoice$12.L$1 = null;
                        realCryptoService$refreshInvoice$12.L$2 = null;
                        realCryptoService$refreshInvoice$12.L$3 = serviceContextWrapper3;
                        realCryptoService$refreshInvoice$12.L$4 = null;
                        realCryptoService$refreshInvoice$12.L$6 = null;
                        realCryptoService$refreshInvoice$12.L$7 = requestContext2;
                        realCryptoService$refreshInvoice$12.L$8 = refreshInvoice$Request3;
                        realCryptoService$refreshInvoice$12.L$9 = obj;
                        realCryptoService$refreshInvoice$12.L$10 = null;
                        realCryptoService$refreshInvoice$12.I$0 = i3;
                        realCryptoService$refreshInvoice$12.label = 3;
                        if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, realCryptoService$refreshInvoice$12) != coroutineSingletons) {
                            message2 = refreshInvoice$Request3;
                            obj3 = obj;
                            serviceContextWrapper2 = serviceContextWrapper3;
                            it = serviceContextWrapper2.requestListeners.iterator();
                            while (it.hasNext()) {
                            }
                            obj = obj3;
                            apiResult2 = (ApiResult) obj;
                            realServiceContextManager2 = serviceContextWrapper2.contextManager;
                            realCryptoService$refreshInvoice$12.L$0 = null;
                            realCryptoService$refreshInvoice$12.L$1 = null;
                            realCryptoService$refreshInvoice$12.L$2 = null;
                            realCryptoService$refreshInvoice$12.L$3 = null;
                            realCryptoService$refreshInvoice$12.L$4 = null;
                            realCryptoService$refreshInvoice$12.L$6 = null;
                            realCryptoService$refreshInvoice$12.L$7 = null;
                            realCryptoService$refreshInvoice$12.L$8 = apiResult2;
                            realCryptoService$refreshInvoice$12.L$9 = null;
                            realCryptoService$refreshInvoice$12.L$10 = null;
                            realCryptoService$refreshInvoice$12.I$0 = i3;
                            realCryptoService$refreshInvoice$12.label = 4;
                            if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons) {
                            }
                        }
                    }
                    serviceContextWrapper2 = serviceContextWrapper3;
                    apiResult2 = (ApiResult) obj;
                    realServiceContextManager2 = serviceContextWrapper2.contextManager;
                    realCryptoService$refreshInvoice$12.L$0 = null;
                    realCryptoService$refreshInvoice$12.L$1 = null;
                    realCryptoService$refreshInvoice$12.L$2 = null;
                    realCryptoService$refreshInvoice$12.L$3 = null;
                    realCryptoService$refreshInvoice$12.L$4 = null;
                    realCryptoService$refreshInvoice$12.L$6 = null;
                    realCryptoService$refreshInvoice$12.L$7 = null;
                    realCryptoService$refreshInvoice$12.L$8 = apiResult2;
                    realCryptoService$refreshInvoice$12.L$9 = null;
                    realCryptoService$refreshInvoice$12.L$10 = null;
                    realCryptoService$refreshInvoice$12.I$0 = i3;
                    realCryptoService$refreshInvoice$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, realCryptoService$refreshInvoice$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj2;
                RefreshInvoice$Request refreshInvoice$Request6 = refreshInvoice$Request4;
                String str4 = refreshInvoice$Request6.invoiceId;
                ProtoAdapter protoAdapter = RefreshInvoice$Request.ADAPTER;
                ByteString unknownFields = refreshInvoice$Request6.unknownFields();
                unknownFields.getClass();
                RefreshInvoice$Request refreshInvoice$Request7 = new RefreshInvoice$Request(requestContext, str4, unknownFields);
                CryptoService cryptoService = this.delegate;
                realCryptoService$refreshInvoice$12.L$0 = null;
                realCryptoService$refreshInvoice$12.L$1 = null;
                realCryptoService$refreshInvoice$12.L$2 = null;
                realCryptoService$refreshInvoice$12.L$3 = serviceContextWrapper;
                realCryptoService$refreshInvoice$12.L$4 = refreshInvoice$Request4;
                realCryptoService$refreshInvoice$12.L$6 = exc;
                realCryptoService$refreshInvoice$12.L$7 = requestContext;
                realCryptoService$refreshInvoice$12.L$8 = null;
                realCryptoService$refreshInvoice$12.L$9 = null;
                realCryptoService$refreshInvoice$12.L$10 = refreshInvoice$Request7;
                realCryptoService$refreshInvoice$12.I$0 = i2;
                realCryptoService$refreshInvoice$12.label = 2;
                obj = cryptoService.refreshInvoice(clientScenario2, str2, refreshInvoice$Request2, realCryptoService$refreshInvoice$12);
                if (obj != coroutineSingletons) {
                    refreshInvoice$Request3 = refreshInvoice$Request7;
                    serviceContextWrapper3 = serviceContextWrapper;
                    exc2 = exc;
                    message = refreshInvoice$Request4;
                    i3 = i2;
                    requestContext2 = requestContext;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$refreshInvoice$1 = new RealCryptoService$refreshInvoice$1(this, continuation);
        RealCryptoService$refreshInvoice$1 realCryptoService$refreshInvoice$122 = realCryptoService$refreshInvoice$1;
        obj = realCryptoService$refreshInvoice$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$refreshInvoice$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj2;
        RefreshInvoice$Request refreshInvoice$Request62 = refreshInvoice$Request4;
        String str42 = refreshInvoice$Request62.invoiceId;
        ProtoAdapter protoAdapter2 = RefreshInvoice$Request.ADAPTER;
        ByteString unknownFields2 = refreshInvoice$Request62.unknownFields();
        unknownFields2.getClass();
        RefreshInvoice$Request refreshInvoice$Request72 = new RefreshInvoice$Request(requestContext, str42, unknownFields2);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$refreshInvoice$122.L$0 = null;
        realCryptoService$refreshInvoice$122.L$1 = null;
        realCryptoService$refreshInvoice$122.L$2 = null;
        realCryptoService$refreshInvoice$122.L$3 = serviceContextWrapper;
        realCryptoService$refreshInvoice$122.L$4 = refreshInvoice$Request4;
        realCryptoService$refreshInvoice$122.L$6 = exc;
        realCryptoService$refreshInvoice$122.L$7 = requestContext;
        realCryptoService$refreshInvoice$122.L$8 = null;
        realCryptoService$refreshInvoice$122.L$9 = null;
        realCryptoService$refreshInvoice$122.L$10 = refreshInvoice$Request72;
        realCryptoService$refreshInvoice$122.I$0 = i2;
        realCryptoService$refreshInvoice$122.label = 2;
        obj = cryptoService2.refreshInvoice(clientScenario2, str2, refreshInvoice$Request2, realCryptoService$refreshInvoice$122);
        if (obj != coroutineSingletons) {
        }
    }

    @Override // com.squareup.cash.crypto.service.CryptoService
    public final Object setBtcP2pConversionBps(SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request, Continuation continuation) {
        return this.delegate.setBtcP2pConversionBps(setBtcP2pConversionBpsV2Request, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(8:41|42|43|44|45|46|47|(3:49|(8:51|24|(1:25)|28|29|30|31|(0))|34)(4:53|30|31|(0)(0))))(1:60))(5:69|(1:71)|72|(1:74)|34)|61|62|63|(5:65|45|46|47|(0)(0))|34))|75|6|7|(0)(0)|61|62|63|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016f, code lost:
    
        r13 = r0;
        r1 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139 A[Catch: all -> 0x005e, LOOP:0: B:25:0x0133->B:27:0x0139, LOOP_END, TryCatch #3 {all -> 0x005e, blocks: (B:23:0x0059, B:24:0x012d, B:25:0x0133, B:27:0x0139, B:30:0x014e), top: B:22:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #1 {all -> 0x0145, blocks: (B:47:0x00ee, B:49:0x00f5), top: B:46:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.squareup.cash.cryptonauts.api.UsdOverLNPaymentPreferenceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setUsdOverLNPaymentPreference(SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest, Continuation continuation) {
        RealCryptoService$setUsdOverLNPaymentPreference$1 realCryptoService$setUsdOverLNPaymentPreference$1;
        Object obj;
        int i;
        Exception exc;
        Message message;
        SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest2;
        int i2;
        ServiceContextWrapper serviceContextWrapper;
        Throwable th;
        RequestContext requestContext;
        Object usdOverLNPaymentPreference;
        RequestContext requestContext2;
        Exception exc2;
        Message message2;
        int i3;
        ServiceContextWrapper serviceContextWrapper2;
        ServiceContextWrapper serviceContextWrapper3;
        ApiResult apiResult;
        Object obj2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        if (continuation instanceof RealCryptoService$setUsdOverLNPaymentPreference$1) {
            realCryptoService$setUsdOverLNPaymentPreference$1 = (RealCryptoService$setUsdOverLNPaymentPreference$1) continuation;
            int i4 = realCryptoService$setUsdOverLNPaymentPreference$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realCryptoService$setUsdOverLNPaymentPreference$1.label = i4 - PKIFailureInfo.systemUnavail;
                RealCryptoService$setUsdOverLNPaymentPreference$1 realCryptoService$setUsdOverLNPaymentPreference$12 = realCryptoService$setUsdOverLNPaymentPreference$1;
                Object obj3 = realCryptoService$setUsdOverLNPaymentPreference$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCryptoService$setUsdOverLNPaymentPreference$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = setUsdOverLNPaymentPreferenceRequest.request_context;
                    exc = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = setUsdOverLNPaymentPreferenceRequest;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = this;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = setUsdOverLNPaymentPreferenceRequest;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = exc;
                    realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = 0;
                    realCryptoService$setUsdOverLNPaymentPreference$12.label = 1;
                    obj3 = this.contextManager.produceRequestContext(requestContext3, realCryptoService$setUsdOverLNPaymentPreference$12);
                    if (obj3 != obj) {
                        message = setUsdOverLNPaymentPreferenceRequest;
                        setUsdOverLNPaymentPreferenceRequest2 = message;
                        i2 = 0;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    i2 = realCryptoService$setUsdOverLNPaymentPreference$12.I$0;
                    exc = realCryptoService$setUsdOverLNPaymentPreference$12.L$4;
                    message = realCryptoService$setUsdOverLNPaymentPreference$12.L$2;
                    serviceContextWrapper = realCryptoService$setUsdOverLNPaymentPreference$12.L$1;
                    SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest3 = realCryptoService$setUsdOverLNPaymentPreference$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    setUsdOverLNPaymentPreferenceRequest2 = setUsdOverLNPaymentPreferenceRequest3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) realCryptoService$setUsdOverLNPaymentPreference$12.L$6;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th2 = (Throwable) realCryptoService$setUsdOverLNPaymentPreference$12.L$6;
                            SafeTrace.throwOnFailure(obj3);
                            throw th2;
                        }
                        i3 = realCryptoService$setUsdOverLNPaymentPreference$12.I$0;
                        obj2 = realCryptoService$setUsdOverLNPaymentPreference$12.L$7;
                        message2 = (Message) realCryptoService$setUsdOverLNPaymentPreference$12.L$6;
                        requestContext = realCryptoService$setUsdOverLNPaymentPreference$12.L$5;
                        serviceContextWrapper2 = realCryptoService$setUsdOverLNPaymentPreference$12.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper2.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper2.contextManager;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = apiResult2;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i3;
                            realCryptoService$setUsdOverLNPaymentPreference$12.label = 4;
                        } catch (Throwable th3) {
                            i2 = i3;
                            th = th3;
                            realServiceContextManager = serviceContextWrapper2.contextManager;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = th;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i2;
                            realCryptoService$setUsdOverLNPaymentPreference$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj ? obj : apiResult2;
                    }
                    i3 = realCryptoService$setUsdOverLNPaymentPreference$12.I$0;
                    SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest4 = realCryptoService$setUsdOverLNPaymentPreference$12.L$8;
                    requestContext2 = realCryptoService$setUsdOverLNPaymentPreference$12.L$5;
                    Exception exc3 = realCryptoService$setUsdOverLNPaymentPreference$12.L$4;
                    message = realCryptoService$setUsdOverLNPaymentPreference$12.L$2;
                    serviceContextWrapper = realCryptoService$setUsdOverLNPaymentPreference$12.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        exc2 = exc3;
                        message2 = setUsdOverLNPaymentPreferenceRequest4;
                        serviceContextWrapper3 = serviceContextWrapper;
                    } catch (Throwable th4) {
                        i2 = i3;
                        th = th4;
                        requestContext = requestContext2;
                        serviceContextWrapper2 = serviceContextWrapper;
                        realServiceContextManager = serviceContextWrapper2.contextManager;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = th;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i2;
                        realCryptoService$setUsdOverLNPaymentPreference$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj) {
                            throw th;
                        }
                    }
                    try {
                        apiResult = (ApiResult) obj3;
                    } catch (Throwable th5) {
                        requestContext = requestContext2;
                        serviceContextWrapper2 = serviceContextWrapper3;
                        i2 = i3;
                        th = th5;
                        realServiceContextManager = serviceContextWrapper2.contextManager;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = th;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i2;
                        realCryptoService$setUsdOverLNPaymentPreference$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj) {
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper3.contextManager;
                        ResponseContext responseContext = ((SetUsdOverLNPaymentPreferenceResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = serviceContextWrapper3;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = requestContext2;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = message2;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = obj3;
                        realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                        realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i3;
                        realCryptoService$setUsdOverLNPaymentPreference$12.label = 3;
                        if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, realCryptoService$setUsdOverLNPaymentPreference$12) != obj) {
                            requestContext = requestContext2;
                            serviceContextWrapper2 = serviceContextWrapper3;
                            obj2 = obj3;
                            it = serviceContextWrapper2.requestListeners.iterator();
                            while (it.hasNext()) {
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper2.contextManager;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = apiResult2;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                            realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i3;
                            realCryptoService$setUsdOverLNPaymentPreference$12.label = 4;
                            if (realServiceContextManager2.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj) {
                            }
                        }
                    }
                    requestContext = requestContext2;
                    serviceContextWrapper2 = serviceContextWrapper3;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper2.contextManager;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = apiResult2;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = null;
                    realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i3;
                    realCryptoService$setUsdOverLNPaymentPreference$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext, realCryptoService$setUsdOverLNPaymentPreference$12) == obj) {
                    }
                }
                RequestContext requestContext4 = (RequestContext) obj3;
                SetUsdOverLNPaymentPreferenceRequest copy$default = SetUsdOverLNPaymentPreferenceRequest.copy$default((SetUsdOverLNPaymentPreferenceRequest) message, requestContext4, null, 5);
                CryptoService cryptoService = this.delegate;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$0 = null;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$1 = serviceContextWrapper;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$2 = message;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$4 = exc;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$5 = requestContext4;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$6 = null;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$7 = null;
                realCryptoService$setUsdOverLNPaymentPreference$12.L$8 = copy$default;
                realCryptoService$setUsdOverLNPaymentPreference$12.I$0 = i2;
                realCryptoService$setUsdOverLNPaymentPreference$12.label = 2;
                usdOverLNPaymentPreference = cryptoService.setUsdOverLNPaymentPreference(setUsdOverLNPaymentPreferenceRequest2, realCryptoService$setUsdOverLNPaymentPreference$12);
                if (usdOverLNPaymentPreference != obj) {
                    requestContext2 = requestContext4;
                    exc2 = exc;
                    message2 = copy$default;
                    obj3 = usdOverLNPaymentPreference;
                    i3 = i2;
                    serviceContextWrapper3 = serviceContextWrapper;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        realCryptoService$setUsdOverLNPaymentPreference$1 = new RealCryptoService$setUsdOverLNPaymentPreference$1(this, continuation);
        RealCryptoService$setUsdOverLNPaymentPreference$1 realCryptoService$setUsdOverLNPaymentPreference$122 = realCryptoService$setUsdOverLNPaymentPreference$1;
        Object obj32 = realCryptoService$setUsdOverLNPaymentPreference$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCryptoService$setUsdOverLNPaymentPreference$122.label;
        if (i != 0) {
        }
        RequestContext requestContext42 = (RequestContext) obj32;
        SetUsdOverLNPaymentPreferenceRequest copy$default2 = SetUsdOverLNPaymentPreferenceRequest.copy$default((SetUsdOverLNPaymentPreferenceRequest) message, requestContext42, null, 5);
        CryptoService cryptoService2 = this.delegate;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$0 = null;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$1 = serviceContextWrapper;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$2 = message;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$4 = exc;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$5 = requestContext42;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$6 = null;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$7 = null;
        realCryptoService$setUsdOverLNPaymentPreference$122.L$8 = copy$default2;
        realCryptoService$setUsdOverLNPaymentPreference$122.I$0 = i2;
        realCryptoService$setUsdOverLNPaymentPreference$122.label = 2;
        usdOverLNPaymentPreference = cryptoService2.setUsdOverLNPaymentPreference(setUsdOverLNPaymentPreferenceRequest2, realCryptoService$setUsdOverLNPaymentPreference$122);
        if (usdOverLNPaymentPreference != obj) {
        }
    }

    @Override // com.squareup.cash.crypto.service.CryptoService
    public final Object updateAutoWithdrawSettings(UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest, Continuation continuation) {
        return this.autoWithdrawJsonDelegate.updateAutoWithdrawSettings(updateAutoWithdrawSettingsRequest, continuation);
    }
}
