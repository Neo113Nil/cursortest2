package com.squareup.cash.google.pay;

import app.cash.api.ApiResult;
import app.cash.api.wrapper.ServiceContextWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.PaymentRequestsListener;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.ActivateDigitalWalletRequest;
import com.squareup.protos.franklin.app.ActivateDigitalWalletResponse;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningRequest;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningResponse;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenRequest;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.Message;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GooglePayServiceContextWrapper extends ServiceContextWrapper implements GooglePayService {
    public final GooglePayService googlePayService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayServiceContextWrapper(GooglePayService googlePayService, RealServiceContextManager realServiceContextManager) {
        super(realServiceContextManager, EmptyList.INSTANCE);
        googlePayService.getClass();
        this.googlePayService = googlePayService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:72|(1:74)|75|(1:77)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|78|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0184, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d A[Catch: all -> 0x0064, LOOP:0: B:25:0x0147->B:27:0x014d, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0141, B:25:0x0147, B:27:0x014d, B:30:0x0161), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #4 {all -> 0x015c, blocks: (B:45:0x0102, B:47:0x0109), top: B:44:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.cash.google.pay.GooglePayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object activateDigitalWallet(ClientScenario clientScenario, String str, ActivateDigitalWalletRequest activateDigitalWalletRequest, Continuation continuation) {
        GooglePayServiceContextWrapper$activateDigitalWallet$1 googlePayServiceContextWrapper$activateDigitalWallet$1;
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
        Object activateDigitalWallet;
        ActivateDigitalWalletRequest activateDigitalWalletRequest2;
        ServiceContextWrapper serviceContextWrapper2;
        Exception exc2;
        Message message;
        RequestContext requestContext2;
        ServiceContextWrapper serviceContextWrapper3;
        ApiResult apiResult;
        Message message2;
        Object obj2;
        RealServiceContextManager realServiceContextManager;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager2;
        Iterator it;
        ActivateDigitalWalletRequest activateDigitalWalletRequest3 = activateDigitalWalletRequest;
        if (continuation instanceof GooglePayServiceContextWrapper$activateDigitalWallet$1) {
            googlePayServiceContextWrapper$activateDigitalWallet$1 = (GooglePayServiceContextWrapper$activateDigitalWallet$1) continuation;
            int i4 = googlePayServiceContextWrapper$activateDigitalWallet$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayServiceContextWrapper$activateDigitalWallet$1.label = i4 - PKIFailureInfo.systemUnavail;
                GooglePayServiceContextWrapper$activateDigitalWallet$1 googlePayServiceContextWrapper$activateDigitalWallet$12 = googlePayServiceContextWrapper$activateDigitalWallet$1;
                Object obj3 = googlePayServiceContextWrapper$activateDigitalWallet$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayServiceContextWrapper$activateDigitalWallet$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = activateDigitalWalletRequest3.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = clientScenario;
                    str2 = str;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = str2;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = this;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = activateDigitalWalletRequest3;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = exc3;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = 0;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, googlePayServiceContextWrapper$activateDigitalWallet$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = googlePayServiceContextWrapper$activateDigitalWallet$12.I$0;
                    Exception exc4 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$6;
                    ?? r7 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$4;
                    serviceContextWrapper = googlePayServiceContextWrapper$activateDigitalWallet$12.L$3;
                    str2 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$1;
                    clientScenario2 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    activateDigitalWalletRequest3 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) googlePayServiceContextWrapper$activateDigitalWallet$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) googlePayServiceContextWrapper$activateDigitalWallet$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = googlePayServiceContextWrapper$activateDigitalWallet$12.I$0;
                        obj2 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$9;
                        message2 = (Message) googlePayServiceContextWrapper$activateDigitalWallet$12.L$8;
                        requestContext2 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$7;
                        serviceContextWrapper3 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = apiResult2;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = th;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = googlePayServiceContextWrapper$activateDigitalWallet$12.I$0;
                    activateDigitalWalletRequest2 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$10;
                    requestContext = googlePayServiceContextWrapper$activateDigitalWallet$12.L$7;
                    Exception exc5 = googlePayServiceContextWrapper$activateDigitalWallet$12.L$6;
                    message = googlePayServiceContextWrapper$activateDigitalWallet$12.L$4;
                    serviceContextWrapper = googlePayServiceContextWrapper$activateDigitalWallet$12.L$3;
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
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = th;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((ActivateDigitalWalletResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = serviceContextWrapper2;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = requestContext;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = activateDigitalWalletRequest2;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = obj3;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                        googlePayServiceContextWrapper$activateDigitalWallet$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, googlePayServiceContextWrapper$activateDigitalWallet$12) != coroutineSingletons) {
                                message2 = activateDigitalWalletRequest2;
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = apiResult2;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                                googlePayServiceContextWrapper$activateDigitalWallet$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = th;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                            googlePayServiceContextWrapper$activateDigitalWallet$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = apiResult2;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = null;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i3;
                    googlePayServiceContextWrapper$activateDigitalWallet$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$activateDigitalWallet$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                ActivateDigitalWalletRequest copy$default = ActivateDigitalWalletRequest.copy$default(activateDigitalWalletRequest3, requestContext, null, null, 30);
                GooglePayService googlePayService = this.googlePayService;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$0 = null;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$1 = null;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$3 = serviceContextWrapper;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$4 = activateDigitalWalletRequest3;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$6 = exc;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$7 = requestContext;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$8 = null;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$9 = null;
                googlePayServiceContextWrapper$activateDigitalWallet$12.L$10 = copy$default;
                googlePayServiceContextWrapper$activateDigitalWallet$12.I$0 = i2;
                googlePayServiceContextWrapper$activateDigitalWallet$12.label = 2;
                activateDigitalWallet = googlePayService.activateDigitalWallet(clientScenario2, str2, copy$default, googlePayServiceContextWrapper$activateDigitalWallet$12);
                if (activateDigitalWallet != coroutineSingletons) {
                    int i6 = i2;
                    obj3 = activateDigitalWallet;
                    activateDigitalWalletRequest2 = copy$default;
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = activateDigitalWalletRequest3;
                    i3 = i6;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        googlePayServiceContextWrapper$activateDigitalWallet$1 = new GooglePayServiceContextWrapper$activateDigitalWallet$1(this, continuation);
        GooglePayServiceContextWrapper$activateDigitalWallet$1 googlePayServiceContextWrapper$activateDigitalWallet$122 = googlePayServiceContextWrapper$activateDigitalWallet$1;
        Object obj32 = googlePayServiceContextWrapper$activateDigitalWallet$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayServiceContextWrapper$activateDigitalWallet$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        ActivateDigitalWalletRequest copy$default2 = ActivateDigitalWalletRequest.copy$default(activateDigitalWalletRequest3, requestContext, null, null, 30);
        GooglePayService googlePayService2 = this.googlePayService;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$0 = null;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$1 = null;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$3 = serviceContextWrapper;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$4 = activateDigitalWalletRequest3;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$6 = exc;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$7 = requestContext;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$8 = null;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$9 = null;
        googlePayServiceContextWrapper$activateDigitalWallet$122.L$10 = copy$default2;
        googlePayServiceContextWrapper$activateDigitalWallet$122.I$0 = i2;
        googlePayServiceContextWrapper$activateDigitalWallet$122.label = 2;
        activateDigitalWallet = googlePayService2.activateDigitalWallet(clientScenario2, str2, copy$default2, googlePayServiceContextWrapper$activateDigitalWallet$122);
        if (activateDigitalWallet != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(5:72|(1:74)|75|(1:77)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|78|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018b, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153 A[Catch: all -> 0x0064, LOOP:0: B:25:0x014d->B:27:0x0153, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0147, B:25:0x014d, B:27:0x0153, B:30:0x0167), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:45:0x0107, B:47:0x010e), top: B:44:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.cash.google.pay.GooglePayService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeDigitalWalletTokenProvisioning(ClientScenario clientScenario, String str, CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest, Continuation continuation) {
        GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1 googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1;
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
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest2;
        Object completeDigitalWalletTokenProvisioning;
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
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest3 = completeDigitalWalletTokenProvisioningRequest;
        if (continuation instanceof GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1) {
            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1 = (GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1) continuation;
            int i4 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1.label = i4 - PKIFailureInfo.systemUnavail;
                GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1 googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1;
                Object obj3 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = completeDigitalWalletTokenProvisioningRequest3.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = clientScenario;
                    str2 = str;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = str2;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = this;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = completeDigitalWalletTokenProvisioningRequest3;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = exc3;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = 0;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0;
                    Exception exc4 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6;
                    ?? r7 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4;
                    serviceContextWrapper = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3;
                    str2 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1;
                    clientScenario2 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    completeDigitalWalletTokenProvisioningRequest3 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0;
                        obj2 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9;
                        message2 = (Message) googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8;
                        requestContext2 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7;
                        serviceContextWrapper3 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = apiResult2;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = th;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0;
                    CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest4 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10;
                    requestContext = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7;
                    Exception exc5 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6;
                    message = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4;
                    serviceContextWrapper = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        completeDigitalWalletTokenProvisioningRequest2 = completeDigitalWalletTokenProvisioningRequest4;
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
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = th;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((CompleteDigitalWalletTokenProvisioningResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = serviceContextWrapper2;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = requestContext;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = completeDigitalWalletTokenProvisioningRequest2;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = obj3;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) != coroutineSingletons) {
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                message2 = completeDigitalWalletTokenProvisioningRequest2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = apiResult2;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = th;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                            googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = apiResult2;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = null;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i3;
                    googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest5 = completeDigitalWalletTokenProvisioningRequest3;
                DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData = completeDigitalWalletTokenProvisioningRequest5.completion_request;
                ByteString unknownFields = completeDigitalWalletTokenProvisioningRequest5.unknownFields();
                unknownFields.getClass();
                completeDigitalWalletTokenProvisioningRequest2 = new CompleteDigitalWalletTokenProvisioningRequest(requestContext, digitalWalletTokenProvisioningCompletionData, unknownFields);
                GooglePayService googlePayService = this.googlePayService;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$0 = null;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$1 = null;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$3 = serviceContextWrapper;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$4 = completeDigitalWalletTokenProvisioningRequest3;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$6 = exc;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$7 = requestContext;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$8 = null;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$9 = null;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.L$10 = completeDigitalWalletTokenProvisioningRequest2;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.I$0 = i2;
                googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12.label = 2;
                completeDigitalWalletTokenProvisioning = googlePayService.completeDigitalWalletTokenProvisioning(clientScenario2, str2, completeDigitalWalletTokenProvisioningRequest2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$12);
                if (completeDigitalWalletTokenProvisioning != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = completeDigitalWalletTokenProvisioningRequest3;
                    i3 = i2;
                    obj3 = completeDigitalWalletTokenProvisioning;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1 = new GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1(this, continuation);
        GooglePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1 googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$1;
        Object obj32 = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest52 = completeDigitalWalletTokenProvisioningRequest3;
        DigitalWalletTokenProvisioningCompletionData digitalWalletTokenProvisioningCompletionData2 = completeDigitalWalletTokenProvisioningRequest52.completion_request;
        ByteString unknownFields2 = completeDigitalWalletTokenProvisioningRequest52.unknownFields();
        unknownFields2.getClass();
        completeDigitalWalletTokenProvisioningRequest2 = new CompleteDigitalWalletTokenProvisioningRequest(requestContext, digitalWalletTokenProvisioningCompletionData2, unknownFields2);
        GooglePayService googlePayService2 = this.googlePayService;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$0 = null;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$1 = null;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$3 = serviceContextWrapper;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$4 = completeDigitalWalletTokenProvisioningRequest3;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$6 = exc;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$7 = requestContext;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$8 = null;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$9 = null;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.L$10 = completeDigitalWalletTokenProvisioningRequest2;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.I$0 = i2;
        googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122.label = 2;
        completeDigitalWalletTokenProvisioning = googlePayService2.completeDigitalWalletTokenProvisioning(clientScenario2, str2, completeDigitalWalletTokenProvisioningRequest2, googlePayServiceContextWrapper$completeDigitalWalletTokenProvisioning$122);
        if (completeDigitalWalletTokenProvisioning != coroutineSingletons) {
        }
    }

    @Override // com.squareup.cash.google.pay.GooglePayService
    public final Object provisionDigitalWalletToken(ClientScenario clientScenario, String str, ProvisionDigitalWalletTokenRequest provisionDigitalWalletTokenRequest, Continuation continuation) {
        return this.googlePayService.provisionDigitalWalletToken(clientScenario, str, provisionDigitalWalletTokenRequest, continuation);
    }
}
