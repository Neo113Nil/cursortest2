package com.squareup.cash.security.service;

import app.cash.api.ApiResult;
import app.cash.api.wrapper.ServiceContextWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import com.squareup.cash.activity.backend.PaymentRequestsListener;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.cash.security.SetPasswordResponse;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.cash.security.VerifyPasswordResponse;
import com.squareup.protos.franklin.api.ClientScenario;
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

/* loaded from: classes7.dex */
public final class SecurityServiceContextWrapper extends ServiceContextWrapper implements SecurityService {
    public final SecurityService securityService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityServiceContextWrapper(SecurityService securityService, RealServiceContextManager realServiceContextManager) {
        super(realServiceContextManager, EmptyList.INSTANCE);
        securityService.getClass();
        this.securityService = securityService;
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
    @Override // com.squareup.cash.security.service.SecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setPassword(ClientScenario clientScenario, String str, SetPasswordRequest setPasswordRequest, Continuation continuation) {
        SecurityServiceContextWrapper$setPassword$1 securityServiceContextWrapper$setPassword$1;
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
        SetPasswordRequest setPasswordRequest2;
        Object password;
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
        SetPasswordRequest setPasswordRequest3 = setPasswordRequest;
        if (continuation instanceof SecurityServiceContextWrapper$setPassword$1) {
            securityServiceContextWrapper$setPassword$1 = (SecurityServiceContextWrapper$setPassword$1) continuation;
            int i4 = securityServiceContextWrapper$setPassword$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                securityServiceContextWrapper$setPassword$1.label = i4 - PKIFailureInfo.systemUnavail;
                SecurityServiceContextWrapper$setPassword$1 securityServiceContextWrapper$setPassword$12 = securityServiceContextWrapper$setPassword$1;
                Object obj3 = securityServiceContextWrapper$setPassword$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = securityServiceContextWrapper$setPassword$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = setPasswordRequest3.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    securityServiceContextWrapper$setPassword$12.L$0 = clientScenario;
                    str2 = str;
                    securityServiceContextWrapper$setPassword$12.L$1 = str2;
                    securityServiceContextWrapper$setPassword$12.L$3 = this;
                    securityServiceContextWrapper$setPassword$12.L$4 = setPasswordRequest3;
                    securityServiceContextWrapper$setPassword$12.L$6 = exc3;
                    securityServiceContextWrapper$setPassword$12.I$0 = 0;
                    securityServiceContextWrapper$setPassword$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, securityServiceContextWrapper$setPassword$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = securityServiceContextWrapper$setPassword$12.I$0;
                    Exception exc4 = securityServiceContextWrapper$setPassword$12.L$6;
                    ?? r7 = securityServiceContextWrapper$setPassword$12.L$4;
                    serviceContextWrapper = securityServiceContextWrapper$setPassword$12.L$3;
                    str2 = securityServiceContextWrapper$setPassword$12.L$1;
                    clientScenario2 = securityServiceContextWrapper$setPassword$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    setPasswordRequest3 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) securityServiceContextWrapper$setPassword$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) securityServiceContextWrapper$setPassword$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = securityServiceContextWrapper$setPassword$12.I$0;
                        obj2 = securityServiceContextWrapper$setPassword$12.L$9;
                        message2 = (Message) securityServiceContextWrapper$setPassword$12.L$8;
                        requestContext2 = securityServiceContextWrapper$setPassword$12.L$7;
                        serviceContextWrapper3 = securityServiceContextWrapper$setPassword$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$setPassword$12.L$0 = null;
                            securityServiceContextWrapper$setPassword$12.L$1 = null;
                            securityServiceContextWrapper$setPassword$12.L$3 = null;
                            securityServiceContextWrapper$setPassword$12.L$4 = null;
                            securityServiceContextWrapper$setPassword$12.L$6 = null;
                            securityServiceContextWrapper$setPassword$12.L$7 = null;
                            securityServiceContextWrapper$setPassword$12.L$8 = apiResult2;
                            securityServiceContextWrapper$setPassword$12.L$9 = null;
                            securityServiceContextWrapper$setPassword$12.L$10 = null;
                            securityServiceContextWrapper$setPassword$12.I$0 = i3;
                            securityServiceContextWrapper$setPassword$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$setPassword$12.L$0 = null;
                            securityServiceContextWrapper$setPassword$12.L$1 = null;
                            securityServiceContextWrapper$setPassword$12.L$3 = null;
                            securityServiceContextWrapper$setPassword$12.L$4 = null;
                            securityServiceContextWrapper$setPassword$12.L$6 = null;
                            securityServiceContextWrapper$setPassword$12.L$7 = null;
                            securityServiceContextWrapper$setPassword$12.L$8 = th;
                            securityServiceContextWrapper$setPassword$12.L$9 = null;
                            securityServiceContextWrapper$setPassword$12.L$10 = null;
                            securityServiceContextWrapper$setPassword$12.I$0 = i3;
                            securityServiceContextWrapper$setPassword$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = securityServiceContextWrapper$setPassword$12.I$0;
                    SetPasswordRequest setPasswordRequest4 = securityServiceContextWrapper$setPassword$12.L$10;
                    requestContext = securityServiceContextWrapper$setPassword$12.L$7;
                    Exception exc5 = securityServiceContextWrapper$setPassword$12.L$6;
                    message = securityServiceContextWrapper$setPassword$12.L$4;
                    serviceContextWrapper = securityServiceContextWrapper$setPassword$12.L$3;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        setPasswordRequest2 = setPasswordRequest4;
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
                        securityServiceContextWrapper$setPassword$12.L$0 = null;
                        securityServiceContextWrapper$setPassword$12.L$1 = null;
                        securityServiceContextWrapper$setPassword$12.L$3 = null;
                        securityServiceContextWrapper$setPassword$12.L$4 = null;
                        securityServiceContextWrapper$setPassword$12.L$6 = null;
                        securityServiceContextWrapper$setPassword$12.L$7 = null;
                        securityServiceContextWrapper$setPassword$12.L$8 = th;
                        securityServiceContextWrapper$setPassword$12.L$9 = null;
                        securityServiceContextWrapper$setPassword$12.L$10 = null;
                        securityServiceContextWrapper$setPassword$12.I$0 = i3;
                        securityServiceContextWrapper$setPassword$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((SetPasswordResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        securityServiceContextWrapper$setPassword$12.L$0 = null;
                        securityServiceContextWrapper$setPassword$12.L$1 = null;
                        securityServiceContextWrapper$setPassword$12.L$3 = serviceContextWrapper2;
                        securityServiceContextWrapper$setPassword$12.L$4 = null;
                        securityServiceContextWrapper$setPassword$12.L$6 = null;
                        securityServiceContextWrapper$setPassword$12.L$7 = requestContext;
                        securityServiceContextWrapper$setPassword$12.L$8 = setPasswordRequest2;
                        securityServiceContextWrapper$setPassword$12.L$9 = obj3;
                        securityServiceContextWrapper$setPassword$12.L$10 = null;
                        securityServiceContextWrapper$setPassword$12.I$0 = i3;
                        securityServiceContextWrapper$setPassword$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, securityServiceContextWrapper$setPassword$12) != coroutineSingletons) {
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                message2 = setPasswordRequest2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                securityServiceContextWrapper$setPassword$12.L$0 = null;
                                securityServiceContextWrapper$setPassword$12.L$1 = null;
                                securityServiceContextWrapper$setPassword$12.L$3 = null;
                                securityServiceContextWrapper$setPassword$12.L$4 = null;
                                securityServiceContextWrapper$setPassword$12.L$6 = null;
                                securityServiceContextWrapper$setPassword$12.L$7 = null;
                                securityServiceContextWrapper$setPassword$12.L$8 = apiResult2;
                                securityServiceContextWrapper$setPassword$12.L$9 = null;
                                securityServiceContextWrapper$setPassword$12.L$10 = null;
                                securityServiceContextWrapper$setPassword$12.I$0 = i3;
                                securityServiceContextWrapper$setPassword$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$setPassword$12.L$0 = null;
                            securityServiceContextWrapper$setPassword$12.L$1 = null;
                            securityServiceContextWrapper$setPassword$12.L$3 = null;
                            securityServiceContextWrapper$setPassword$12.L$4 = null;
                            securityServiceContextWrapper$setPassword$12.L$6 = null;
                            securityServiceContextWrapper$setPassword$12.L$7 = null;
                            securityServiceContextWrapper$setPassword$12.L$8 = th;
                            securityServiceContextWrapper$setPassword$12.L$9 = null;
                            securityServiceContextWrapper$setPassword$12.L$10 = null;
                            securityServiceContextWrapper$setPassword$12.I$0 = i3;
                            securityServiceContextWrapper$setPassword$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    securityServiceContextWrapper$setPassword$12.L$0 = null;
                    securityServiceContextWrapper$setPassword$12.L$1 = null;
                    securityServiceContextWrapper$setPassword$12.L$3 = null;
                    securityServiceContextWrapper$setPassword$12.L$4 = null;
                    securityServiceContextWrapper$setPassword$12.L$6 = null;
                    securityServiceContextWrapper$setPassword$12.L$7 = null;
                    securityServiceContextWrapper$setPassword$12.L$8 = apiResult2;
                    securityServiceContextWrapper$setPassword$12.L$9 = null;
                    securityServiceContextWrapper$setPassword$12.L$10 = null;
                    securityServiceContextWrapper$setPassword$12.I$0 = i3;
                    securityServiceContextWrapper$setPassword$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$setPassword$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                SetPasswordRequest setPasswordRequest5 = setPasswordRequest3;
                String str3 = setPasswordRequest5.new_password;
                ByteString unknownFields = setPasswordRequest5.unknownFields();
                unknownFields.getClass();
                setPasswordRequest2 = new SetPasswordRequest(requestContext, str3, unknownFields);
                SecurityService securityService = this.securityService;
                securityServiceContextWrapper$setPassword$12.L$0 = null;
                securityServiceContextWrapper$setPassword$12.L$1 = null;
                securityServiceContextWrapper$setPassword$12.L$3 = serviceContextWrapper;
                securityServiceContextWrapper$setPassword$12.L$4 = setPasswordRequest3;
                securityServiceContextWrapper$setPassword$12.L$6 = exc;
                securityServiceContextWrapper$setPassword$12.L$7 = requestContext;
                securityServiceContextWrapper$setPassword$12.L$8 = null;
                securityServiceContextWrapper$setPassword$12.L$9 = null;
                securityServiceContextWrapper$setPassword$12.L$10 = setPasswordRequest2;
                securityServiceContextWrapper$setPassword$12.I$0 = i2;
                securityServiceContextWrapper$setPassword$12.label = 2;
                password = securityService.setPassword(clientScenario2, str2, setPasswordRequest2, securityServiceContextWrapper$setPassword$12);
                if (password != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = setPasswordRequest3;
                    i3 = i2;
                    obj3 = password;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        securityServiceContextWrapper$setPassword$1 = new SecurityServiceContextWrapper$setPassword$1(this, continuation);
        SecurityServiceContextWrapper$setPassword$1 securityServiceContextWrapper$setPassword$122 = securityServiceContextWrapper$setPassword$1;
        Object obj32 = securityServiceContextWrapper$setPassword$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = securityServiceContextWrapper$setPassword$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        SetPasswordRequest setPasswordRequest52 = setPasswordRequest3;
        String str32 = setPasswordRequest52.new_password;
        ByteString unknownFields2 = setPasswordRequest52.unknownFields();
        unknownFields2.getClass();
        setPasswordRequest2 = new SetPasswordRequest(requestContext, str32, unknownFields2);
        SecurityService securityService2 = this.securityService;
        securityServiceContextWrapper$setPassword$122.L$0 = null;
        securityServiceContextWrapper$setPassword$122.L$1 = null;
        securityServiceContextWrapper$setPassword$122.L$3 = serviceContextWrapper;
        securityServiceContextWrapper$setPassword$122.L$4 = setPasswordRequest3;
        securityServiceContextWrapper$setPassword$122.L$6 = exc;
        securityServiceContextWrapper$setPassword$122.L$7 = requestContext;
        securityServiceContextWrapper$setPassword$122.L$8 = null;
        securityServiceContextWrapper$setPassword$122.L$9 = null;
        securityServiceContextWrapper$setPassword$122.L$10 = setPasswordRequest2;
        securityServiceContextWrapper$setPassword$122.I$0 = i2;
        securityServiceContextWrapper$setPassword$122.label = 2;
        password = securityService2.setPassword(clientScenario2, str2, setPasswordRequest2, securityServiceContextWrapper$setPassword$122);
        if (password != coroutineSingletons) {
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
    @Override // com.squareup.cash.security.service.SecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object verifyPassword(ClientScenario clientScenario, String str, VerifyPasswordRequest verifyPasswordRequest, Continuation continuation) {
        SecurityServiceContextWrapper$verifyPassword$1 securityServiceContextWrapper$verifyPassword$1;
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
        VerifyPasswordRequest verifyPasswordRequest2;
        Object verifyPassword;
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
        VerifyPasswordRequest verifyPasswordRequest3 = verifyPasswordRequest;
        if (continuation instanceof SecurityServiceContextWrapper$verifyPassword$1) {
            securityServiceContextWrapper$verifyPassword$1 = (SecurityServiceContextWrapper$verifyPassword$1) continuation;
            int i4 = securityServiceContextWrapper$verifyPassword$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                securityServiceContextWrapper$verifyPassword$1.label = i4 - PKIFailureInfo.systemUnavail;
                SecurityServiceContextWrapper$verifyPassword$1 securityServiceContextWrapper$verifyPassword$12 = securityServiceContextWrapper$verifyPassword$1;
                Object obj3 = securityServiceContextWrapper$verifyPassword$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = securityServiceContextWrapper$verifyPassword$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RequestContext requestContext3 = verifyPasswordRequest3.request_context;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    securityServiceContextWrapper$verifyPassword$12.L$0 = clientScenario;
                    str2 = str;
                    securityServiceContextWrapper$verifyPassword$12.L$1 = str2;
                    securityServiceContextWrapper$verifyPassword$12.L$3 = this;
                    securityServiceContextWrapper$verifyPassword$12.L$4 = verifyPasswordRequest3;
                    securityServiceContextWrapper$verifyPassword$12.L$6 = exc3;
                    securityServiceContextWrapper$verifyPassword$12.I$0 = 0;
                    securityServiceContextWrapper$verifyPassword$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, securityServiceContextWrapper$verifyPassword$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = securityServiceContextWrapper$verifyPassword$12.I$0;
                    Exception exc4 = securityServiceContextWrapper$verifyPassword$12.L$6;
                    ?? r7 = securityServiceContextWrapper$verifyPassword$12.L$4;
                    serviceContextWrapper = securityServiceContextWrapper$verifyPassword$12.L$3;
                    str2 = securityServiceContextWrapper$verifyPassword$12.L$1;
                    clientScenario2 = securityServiceContextWrapper$verifyPassword$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    verifyPasswordRequest3 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) securityServiceContextWrapper$verifyPassword$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) securityServiceContextWrapper$verifyPassword$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = securityServiceContextWrapper$verifyPassword$12.I$0;
                        obj2 = securityServiceContextWrapper$verifyPassword$12.L$9;
                        message2 = (Message) securityServiceContextWrapper$verifyPassword$12.L$8;
                        requestContext2 = securityServiceContextWrapper$verifyPassword$12.L$7;
                        serviceContextWrapper3 = securityServiceContextWrapper$verifyPassword$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$8 = apiResult2;
                            securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                            securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                            securityServiceContextWrapper$verifyPassword$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$8 = th;
                            securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                            securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                            securityServiceContextWrapper$verifyPassword$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = securityServiceContextWrapper$verifyPassword$12.I$0;
                    VerifyPasswordRequest verifyPasswordRequest4 = securityServiceContextWrapper$verifyPassword$12.L$10;
                    requestContext = securityServiceContextWrapper$verifyPassword$12.L$7;
                    Exception exc5 = securityServiceContextWrapper$verifyPassword$12.L$6;
                    message = securityServiceContextWrapper$verifyPassword$12.L$4;
                    serviceContextWrapper = securityServiceContextWrapper$verifyPassword$12.L$3;
                    try {
                        SafeTrace.throwOnFailure(obj3);
                        verifyPasswordRequest2 = verifyPasswordRequest4;
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
                        securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$8 = th;
                        securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                        securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                        securityServiceContextWrapper$verifyPassword$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        ResponseContext responseContext = ((VerifyPasswordResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$3 = serviceContextWrapper2;
                        securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                        securityServiceContextWrapper$verifyPassword$12.L$7 = requestContext;
                        securityServiceContextWrapper$verifyPassword$12.L$8 = verifyPasswordRequest2;
                        securityServiceContextWrapper$verifyPassword$12.L$9 = obj3;
                        securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                        securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                        securityServiceContextWrapper$verifyPassword$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, responseContext, simpleName, exc2, securityServiceContextWrapper$verifyPassword$12) != coroutineSingletons) {
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                message2 = verifyPasswordRequest2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$8 = apiResult2;
                                securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                                securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                                securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                                securityServiceContextWrapper$verifyPassword$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$8 = th;
                            securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                            securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                            securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                            securityServiceContextWrapper$verifyPassword$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$3 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$4 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$6 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$7 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$8 = apiResult2;
                    securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                    securityServiceContextWrapper$verifyPassword$12.L$10 = null;
                    securityServiceContextWrapper$verifyPassword$12.I$0 = i3;
                    securityServiceContextWrapper$verifyPassword$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, securityServiceContextWrapper$verifyPassword$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                VerifyPasswordRequest verifyPasswordRequest5 = verifyPasswordRequest3;
                zzkp zzkpVar = verifyPasswordRequest5.input;
                ByteString unknownFields = verifyPasswordRequest5.unknownFields();
                unknownFields.getClass();
                verifyPasswordRequest2 = new VerifyPasswordRequest(requestContext, zzkpVar, unknownFields);
                SecurityService securityService = this.securityService;
                securityServiceContextWrapper$verifyPassword$12.L$0 = null;
                securityServiceContextWrapper$verifyPassword$12.L$1 = null;
                securityServiceContextWrapper$verifyPassword$12.L$3 = serviceContextWrapper;
                securityServiceContextWrapper$verifyPassword$12.L$4 = verifyPasswordRequest3;
                securityServiceContextWrapper$verifyPassword$12.L$6 = exc;
                securityServiceContextWrapper$verifyPassword$12.L$7 = requestContext;
                securityServiceContextWrapper$verifyPassword$12.L$8 = null;
                securityServiceContextWrapper$verifyPassword$12.L$9 = null;
                securityServiceContextWrapper$verifyPassword$12.L$10 = verifyPasswordRequest2;
                securityServiceContextWrapper$verifyPassword$12.I$0 = i2;
                securityServiceContextWrapper$verifyPassword$12.label = 2;
                verifyPassword = securityService.verifyPassword(clientScenario2, str2, verifyPasswordRequest2, securityServiceContextWrapper$verifyPassword$12);
                if (verifyPassword != coroutineSingletons) {
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = verifyPasswordRequest3;
                    i3 = i2;
                    obj3 = verifyPassword;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        securityServiceContextWrapper$verifyPassword$1 = new SecurityServiceContextWrapper$verifyPassword$1(this, continuation);
        SecurityServiceContextWrapper$verifyPassword$1 securityServiceContextWrapper$verifyPassword$122 = securityServiceContextWrapper$verifyPassword$1;
        Object obj32 = securityServiceContextWrapper$verifyPassword$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = securityServiceContextWrapper$verifyPassword$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        VerifyPasswordRequest verifyPasswordRequest52 = verifyPasswordRequest3;
        zzkp zzkpVar2 = verifyPasswordRequest52.input;
        ByteString unknownFields2 = verifyPasswordRequest52.unknownFields();
        unknownFields2.getClass();
        verifyPasswordRequest2 = new VerifyPasswordRequest(requestContext, zzkpVar2, unknownFields2);
        SecurityService securityService2 = this.securityService;
        securityServiceContextWrapper$verifyPassword$122.L$0 = null;
        securityServiceContextWrapper$verifyPassword$122.L$1 = null;
        securityServiceContextWrapper$verifyPassword$122.L$3 = serviceContextWrapper;
        securityServiceContextWrapper$verifyPassword$122.L$4 = verifyPasswordRequest3;
        securityServiceContextWrapper$verifyPassword$122.L$6 = exc;
        securityServiceContextWrapper$verifyPassword$122.L$7 = requestContext;
        securityServiceContextWrapper$verifyPassword$122.L$8 = null;
        securityServiceContextWrapper$verifyPassword$122.L$9 = null;
        securityServiceContextWrapper$verifyPassword$122.L$10 = verifyPasswordRequest2;
        securityServiceContextWrapper$verifyPassword$122.I$0 = i2;
        securityServiceContextWrapper$verifyPassword$122.label = 2;
        verifyPassword = securityService2.verifyPassword(clientScenario2, str2, verifyPasswordRequest2, securityServiceContextWrapper$verifyPassword$122);
        if (verifyPassword != coroutineSingletons) {
        }
    }
}
