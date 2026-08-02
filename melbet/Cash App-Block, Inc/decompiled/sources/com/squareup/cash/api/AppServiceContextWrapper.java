package com.squareup.cash.api;

import app.cash.api.ApiResult;
import app.cash.api.CashServiceContextWrapper;
import app.cash.api.wrapper.ServiceContextWrapper;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.PaymentRequestsListener;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.fileupload.service.api.HttpFileUploadService;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.Message;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import okhttp3.RequestBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppServiceContextWrapper extends CashServiceContextWrapper implements LocalService, HttpFileUploadService {
    public final /* synthetic */ AppServiceResponseInterceptorWrapper $$delegate_0;
    public final AppServiceResponseInterceptorWrapper fiatlyService;
    public final AppServiceResponseInterceptorWrapper franklinAppService;

    public AppServiceContextWrapper(AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper2, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper3, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper4, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper5, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper6, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper7, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper8, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper9, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper10, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper11, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper12, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper13, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper14, RealActivityUpdatesNotifier realActivityUpdatesNotifier, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper15, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper16, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper17, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper18, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper19, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper20, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper21, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper22, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper23, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper24, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper25, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper26, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper27, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper28, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper29, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper30, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper31, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper32, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper33, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper34, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper35, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper36, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper37, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper38, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper39, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper40, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper41, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper42, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper43, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper44, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper45, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper46, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper47, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper48, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper49, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper50, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper51, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper52, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper53, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper54, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper55, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper56, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper57, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper58, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper59, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper60, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper61, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper62, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper63, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper64, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper65, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper66, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper67, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper68, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper69, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper70, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper71, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper72, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper73, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper74, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper75, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper76, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper77, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper78, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper79, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper80, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper81, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper82, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper83, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper84, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper85, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper86, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper87, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper88, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper89, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper90, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper91, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper92, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper93, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper94, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper95, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper96, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper97, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper98, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper99, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper100, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper101, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper102, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper103, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper104, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper105, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper106, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper107, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper108, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper109, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper110, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper111, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper112, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper113, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper114, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper115, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper116, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper117, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper118, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper119, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper120, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper121, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper122, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper123, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper124, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper125, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper126, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper127, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper128, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper129, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper130, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper131, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper132, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper133, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper134, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper135, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper136, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper137, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper138, AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper139, RealServiceContextManager realServiceContextManager) {
        super(appServiceResponseInterceptorWrapper5, appServiceResponseInterceptorWrapper20, appServiceResponseInterceptorWrapper138, appServiceResponseInterceptorWrapper139, appServiceResponseInterceptorWrapper35, appServiceResponseInterceptorWrapper126, appServiceResponseInterceptorWrapper132, appServiceResponseInterceptorWrapper123, appServiceResponseInterceptorWrapper37, appServiceResponseInterceptorWrapper6, appServiceResponseInterceptorWrapper74, appServiceResponseInterceptorWrapper33, appServiceResponseInterceptorWrapper102, appServiceResponseInterceptorWrapper75, appServiceResponseInterceptorWrapper133, appServiceResponseInterceptorWrapper134, appServiceResponseInterceptorWrapper99, appServiceResponseInterceptorWrapper70, appServiceResponseInterceptorWrapper61, appServiceResponseInterceptorWrapper76, appServiceResponseInterceptorWrapper89, appServiceResponseInterceptorWrapper62, appServiceResponseInterceptorWrapper51, appServiceResponseInterceptorWrapper108, appServiceResponseInterceptorWrapper77, appServiceResponseInterceptorWrapper22, appServiceResponseInterceptorWrapper65, appServiceResponseInterceptorWrapper78, appServiceResponseInterceptorWrapper103, appServiceResponseInterceptorWrapper104, appServiceResponseInterceptorWrapper105, appServiceResponseInterceptorWrapper7, appServiceResponseInterceptorWrapper38, appServiceResponseInterceptorWrapper39, appServiceResponseInterceptorWrapper40, appServiceResponseInterceptorWrapper8, appServiceResponseInterceptorWrapper9, appServiceResponseInterceptorWrapper63, appServiceResponseInterceptorWrapper64, appServiceResponseInterceptorWrapper23, appServiceResponseInterceptorWrapper31, appServiceResponseInterceptorWrapper32, appServiceResponseInterceptorWrapper49, appServiceResponseInterceptorWrapper50, appServiceResponseInterceptorWrapper10, appServiceResponseInterceptorWrapper72, appServiceResponseInterceptorWrapper73, appServiceResponseInterceptorWrapper71, appServiceResponseInterceptorWrapper135, appServiceResponseInterceptorWrapper136, appServiceResponseInterceptorWrapper36, appServiceResponseInterceptorWrapper68, appServiceResponseInterceptorWrapper17, appServiceResponseInterceptorWrapper24, appServiceResponseInterceptorWrapper25, appServiceResponseInterceptorWrapper3, appServiceResponseInterceptorWrapper4, appServiceResponseInterceptorWrapper67, appServiceResponseInterceptorWrapper114, appServiceResponseInterceptorWrapper115, appServiceResponseInterceptorWrapper117, appServiceResponseInterceptorWrapper118, appServiceResponseInterceptorWrapper116, appServiceResponseInterceptorWrapper122, appServiceResponseInterceptorWrapper34, appServiceResponseInterceptorWrapper109, appServiceResponseInterceptorWrapper90, appServiceResponseInterceptorWrapper19, appServiceResponseInterceptorWrapper79, appServiceResponseInterceptorWrapper18, appServiceResponseInterceptorWrapper, appServiceResponseInterceptorWrapper80, appServiceResponseInterceptorWrapper21, appServiceResponseInterceptorWrapper41, appServiceResponseInterceptorWrapper26, appServiceResponseInterceptorWrapper137, appServiceResponseInterceptorWrapper54, appServiceResponseInterceptorWrapper55, appServiceResponseInterceptorWrapper56, appServiceResponseInterceptorWrapper57, appServiceResponseInterceptorWrapper58, appServiceResponseInterceptorWrapper59, appServiceResponseInterceptorWrapper60, appServiceResponseInterceptorWrapper53, appServiceResponseInterceptorWrapper15, appServiceResponseInterceptorWrapper16, appServiceResponseInterceptorWrapper81, appServiceResponseInterceptorWrapper120, appServiceResponseInterceptorWrapper121, appServiceResponseInterceptorWrapper91, appServiceResponseInterceptorWrapper82, appServiceResponseInterceptorWrapper83, appServiceResponseInterceptorWrapper84, appServiceResponseInterceptorWrapper131, appServiceResponseInterceptorWrapper85, appServiceResponseInterceptorWrapper48, appServiceResponseInterceptorWrapper42, appServiceResponseInterceptorWrapper43, appServiceResponseInterceptorWrapper44, appServiceResponseInterceptorWrapper45, appServiceResponseInterceptorWrapper46, appServiceResponseInterceptorWrapper47, appServiceResponseInterceptorWrapper86, appServiceResponseInterceptorWrapper11, appServiceResponseInterceptorWrapper106, appServiceResponseInterceptorWrapper124, appServiceResponseInterceptorWrapper125, appServiceResponseInterceptorWrapper52, appServiceResponseInterceptorWrapper27, appServiceResponseInterceptorWrapper28, appServiceResponseInterceptorWrapper29, appServiceResponseInterceptorWrapper127, appServiceResponseInterceptorWrapper110, appServiceResponseInterceptorWrapper87, appServiceResponseInterceptorWrapper111, appServiceResponseInterceptorWrapper112, appServiceResponseInterceptorWrapper113, appServiceResponseInterceptorWrapper69, appServiceResponseInterceptorWrapper96, appServiceResponseInterceptorWrapper128, appServiceResponseInterceptorWrapper119, appServiceResponseInterceptorWrapper94, appServiceResponseInterceptorWrapper95, appServiceResponseInterceptorWrapper30, appServiceResponseInterceptorWrapper88, appServiceResponseInterceptorWrapper129, appServiceResponseInterceptorWrapper98, appServiceResponseInterceptorWrapper100, appServiceResponseInterceptorWrapper101, appServiceResponseInterceptorWrapper97, appServiceResponseInterceptorWrapper107, appServiceResponseInterceptorWrapper12, appServiceResponseInterceptorWrapper2, appServiceResponseInterceptorWrapper13, appServiceResponseInterceptorWrapper14, appServiceResponseInterceptorWrapper92, appServiceResponseInterceptorWrapper93, appServiceResponseInterceptorWrapper66, realServiceContextManager, CollectionsKt__CollectionsJVMKt.listOf(new PaymentRequestsListener(realActivityUpdatesNotifier)));
        this.$$delegate_0 = appServiceResponseInterceptorWrapper130;
        this.franklinAppService = appServiceResponseInterceptorWrapper2;
        this.fiatlyService = appServiceResponseInterceptorWrapper116;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(15:5|6|(1:(3:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(12:20|21|22|23|24|25|(2:28|26)|29|30|31|32|(1:35)(1:34)))(7:45|46|47|48|49|50|(7:52|53|54|55|56|(9:58|24|25|(1:26)|29|30|31|32|(0))|35)(4:63|31|32|(0)(0)))|39|(0)(1:41))(1:69))(5:92|(1:94)|95|(1:97)|35)|70|71|72|73|74|75|76|77|78|79|(4:81|49|50|(0)(0))|35))|98|6|(0)(0)|70|71|72|73|74|75|76|77|78|79|(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0200, code lost:
    
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0202, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0204, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0205, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0208, code lost:
    
        r6 = r3;
        r8 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01be A[Catch: all -> 0x01c8, LOOP:0: B:26:0x01b8->B:28:0x01be, LOOP_END, TryCatch #5 {all -> 0x01c8, blocks: (B:25:0x01b2, B:26:0x01b8, B:28:0x01be, B:31:0x01d8), top: B:24:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163 A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #0 {all -> 0x01d2, blocks: (B:50:0x015c, B:52:0x0163), top: B:49:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a7  */
    /* JADX WARN: Type inference failed for: r12v2, types: [app.cash.api.wrapper.ServiceContextWrapper] */
    @Override // com.squareup.protos.cash.fiatly.api.v1.FiatlyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiatePersonalizedPayment(ClientScenario clientScenario, String str, String str2, String str3, InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest, Continuation continuation) {
        AppServiceContextWrapper$initiatePersonalizedPayment$1 appServiceContextWrapper$initiatePersonalizedPayment$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ClientScenario clientScenario2;
        String str4;
        String str5;
        String str6;
        Message message;
        int i2;
        Exception exc;
        AppServiceContextWrapper appServiceContextWrapper;
        AppServiceContextWrapper$initiatePersonalizedPayment$1 appServiceContextWrapper$initiatePersonalizedPayment$12;
        RequestContext requestContext;
        ServiceContextWrapper serviceContextWrapper;
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest2;
        RequestContext requestContext2;
        ApiResult apiResult;
        Message message2;
        Object obj2;
        ApiResult apiResult2;
        RealServiceContextManager realServiceContextManager;
        Iterator it;
        if (continuation instanceof AppServiceContextWrapper$initiatePersonalizedPayment$1) {
            appServiceContextWrapper$initiatePersonalizedPayment$1 = (AppServiceContextWrapper$initiatePersonalizedPayment$1) continuation;
            int i3 = appServiceContextWrapper$initiatePersonalizedPayment$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                appServiceContextWrapper$initiatePersonalizedPayment$1.label = i3 - PKIFailureInfo.systemUnavail;
                obj = appServiceContextWrapper$initiatePersonalizedPayment$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appServiceContextWrapper$initiatePersonalizedPayment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InitiatePaymentRequest initiatePaymentRequest = initiatePersonalizedPaymentRequest.initiate_payment_request;
                    initiatePaymentRequest.getClass();
                    RequestContext requestContext3 = initiatePaymentRequest.request_context;
                    Exception exc2 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    clientScenario2 = clientScenario;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$0 = clientScenario2;
                    str4 = str;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$1 = str4;
                    str5 = str2;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$2 = str5;
                    str6 = str3;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$3 = str6;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$5 = this;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$6 = initiatePersonalizedPaymentRequest;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.L$8 = exc2;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.I$0 = 0;
                    appServiceContextWrapper$initiatePersonalizedPayment$1.label = 1;
                    obj = this.contextManager.produceRequestContext(requestContext3, appServiceContextWrapper$initiatePersonalizedPayment$1);
                    if (obj != coroutineSingletons) {
                        message = initiatePersonalizedPaymentRequest;
                        i2 = 0;
                        exc = exc2;
                        appServiceContextWrapper = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) appServiceContextWrapper$initiatePersonalizedPayment$1.L$10;
                                SafeTrace.throwOnFailure(obj);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) appServiceContextWrapper$initiatePersonalizedPayment$1.L$10;
                            SafeTrace.throwOnFailure(obj);
                            throw th;
                        }
                        i2 = appServiceContextWrapper$initiatePersonalizedPayment$1.I$0;
                        obj2 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$11;
                        message2 = (Message) appServiceContextWrapper$initiatePersonalizedPayment$1.L$10;
                        requestContext = appServiceContextWrapper$initiatePersonalizedPayment$1.L$9;
                        serviceContextWrapper = appServiceContextWrapper$initiatePersonalizedPayment$1.L$5;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                            try {
                                it = serviceContextWrapper.requestListeners.iterator();
                                while (it.hasNext()) {
                                    ((PaymentRequestsListener) it.next()).onRequest(message2);
                                }
                                obj = obj2;
                                apiResult2 = (ApiResult) obj;
                                realServiceContextManager = serviceContextWrapper.contextManager;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$0 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$1 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$2 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$3 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$5 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$6 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$8 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$9 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$10 = apiResult2;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$11 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$12 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.I$0 = i2;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.label = 4;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                        }
                        return realServiceContextManager.requestComplete(requestContext, appServiceContextWrapper$initiatePersonalizedPayment$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i2 = appServiceContextWrapper$initiatePersonalizedPayment$1.I$0;
                    initiatePersonalizedPaymentRequest2 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$12;
                    requestContext2 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$9;
                    Exception exc3 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$8;
                    message = appServiceContextWrapper$initiatePersonalizedPayment$1.L$6;
                    ServiceContextWrapper serviceContextWrapper2 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$5;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        exc = exc3;
                        serviceContextWrapper = serviceContextWrapper2;
                        try {
                            apiResult = (ApiResult) obj;
                        } catch (Throwable th4) {
                            th = th4;
                            appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                            requestContext = requestContext2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                        requestContext = requestContext2;
                        serviceContextWrapper = serviceContextWrapper2;
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager2 = serviceContextWrapper.contextManager;
                        InitiatePaymentResponse initiatePaymentResponse = ((InitiatePersonalizedPaymentResponse) ((ApiResult.Success) apiResult).response).response;
                        initiatePaymentResponse.getClass();
                        ResponseContext responseContext = initiatePaymentResponse.response_context;
                        responseContext.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$0 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$1 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$2 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$3 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$5 = serviceContextWrapper;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$6 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$8 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$9 = requestContext2;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$10 = initiatePersonalizedPaymentRequest2;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$11 = obj;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.L$12 = null;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.I$0 = i2;
                        appServiceContextWrapper$initiatePersonalizedPayment$1.label = 3;
                        AppServiceContextWrapper$initiatePersonalizedPayment$1 appServiceContextWrapper$initiatePersonalizedPayment$13 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                        RequestContext requestContext4 = requestContext2;
                        try {
                            Object consumeResponseContext = realServiceContextManager2.consumeResponseContext(requestContext4, responseContext, simpleName, exc, appServiceContextWrapper$initiatePersonalizedPayment$13);
                            requestContext = requestContext4;
                            appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$13;
                            if (consumeResponseContext != coroutineSingletons) {
                                message2 = initiatePersonalizedPaymentRequest2;
                                obj2 = obj;
                                it = serviceContextWrapper.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj = obj2;
                                apiResult2 = (ApiResult) obj;
                                realServiceContextManager = serviceContextWrapper.contextManager;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$0 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$1 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$2 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$3 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$5 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$6 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$8 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$9 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$10 = apiResult2;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$11 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.L$12 = null;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.I$0 = i2;
                                appServiceContextWrapper$initiatePersonalizedPayment$12.label = 4;
                                if (realServiceContextManager.requestComplete(requestContext, appServiceContextWrapper$initiatePersonalizedPayment$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            requestContext = requestContext4;
                            appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$13;
                        }
                    }
                    appServiceContextWrapper$initiatePersonalizedPayment$12 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                    requestContext = requestContext2;
                    apiResult2 = (ApiResult) obj;
                    realServiceContextManager = serviceContextWrapper.contextManager;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$0 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$1 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$2 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$3 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$5 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$6 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$8 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$9 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$10 = apiResult2;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$11 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$12 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.I$0 = i2;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.label = 4;
                    if (realServiceContextManager.requestComplete(requestContext, appServiceContextWrapper$initiatePersonalizedPayment$12) == coroutineSingletons) {
                    }
                    RealServiceContextManager realServiceContextManager3 = serviceContextWrapper.contextManager;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$0 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$1 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$2 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$3 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$5 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$6 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$8 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$9 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$10 = th;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$11 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.L$12 = null;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.I$0 = i2;
                    appServiceContextWrapper$initiatePersonalizedPayment$12.label = 5;
                    if (realServiceContextManager3.requestComplete(requestContext, appServiceContextWrapper$initiatePersonalizedPayment$12) == coroutineSingletons) {
                        throw th;
                    }
                } else {
                    i2 = appServiceContextWrapper$initiatePersonalizedPayment$1.I$0;
                    Exception exc4 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$8;
                    message = appServiceContextWrapper$initiatePersonalizedPayment$1.L$6;
                    ?? r12 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$5;
                    String str7 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$3;
                    String str8 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$2;
                    String str9 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$1;
                    clientScenario2 = appServiceContextWrapper$initiatePersonalizedPayment$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    exc = exc4;
                    appServiceContextWrapper = r12;
                    str4 = str9;
                    str6 = str7;
                    str5 = str8;
                }
                RequestContext requestContext5 = (RequestContext) obj;
                InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest3 = (InitiatePersonalizedPaymentRequest) message;
                InitiatePaymentRequest initiatePaymentRequest2 = initiatePersonalizedPaymentRequest3.initiate_payment_request;
                initiatePaymentRequest2.getClass();
                requestContext = requestContext5;
                InitiatePersonalizedPaymentRequest copy$default = InitiatePersonalizedPaymentRequest.copy$default(initiatePersonalizedPaymentRequest3, InitiatePaymentRequest.copy$default(initiatePaymentRequest2, requestContext5, null, null, null, null, null, null, null, null, null, 8388606), null, null, null, 30);
                AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper = this.fiatlyService;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$0 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$1 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$2 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$3 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$5 = appServiceContextWrapper;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$6 = message;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$8 = exc;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$9 = requestContext;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$10 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$11 = null;
                appServiceContextWrapper$initiatePersonalizedPayment$1.L$12 = copy$default;
                appServiceContextWrapper$initiatePersonalizedPayment$1.I$0 = i2;
                appServiceContextWrapper$initiatePersonalizedPayment$1.label = 2;
                AppServiceContextWrapper$initiatePersonalizedPayment$1 appServiceContextWrapper$initiatePersonalizedPayment$14 = appServiceContextWrapper$initiatePersonalizedPayment$1;
                obj = appServiceResponseInterceptorWrapper.initiatePersonalizedPayment(clientScenario2, str4, str5, str6, copy$default, appServiceContextWrapper$initiatePersonalizedPayment$14);
                initiatePersonalizedPaymentRequest2 = copy$default;
                appServiceContextWrapper$initiatePersonalizedPayment$1 = appServiceContextWrapper$initiatePersonalizedPayment$14;
                if (obj != coroutineSingletons) {
                    serviceContextWrapper = appServiceContextWrapper;
                    requestContext2 = requestContext;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        appServiceContextWrapper$initiatePersonalizedPayment$1 = new AppServiceContextWrapper$initiatePersonalizedPayment$1(this, continuation);
        obj = appServiceContextWrapper$initiatePersonalizedPayment$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appServiceContextWrapper$initiatePersonalizedPayment$1.label;
        if (i != 0) {
        }
        RequestContext requestContext52 = (RequestContext) obj;
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest32 = (InitiatePersonalizedPaymentRequest) message;
        InitiatePaymentRequest initiatePaymentRequest22 = initiatePersonalizedPaymentRequest32.initiate_payment_request;
        initiatePaymentRequest22.getClass();
        requestContext = requestContext52;
        InitiatePersonalizedPaymentRequest copy$default2 = InitiatePersonalizedPaymentRequest.copy$default(initiatePersonalizedPaymentRequest32, InitiatePaymentRequest.copy$default(initiatePaymentRequest22, requestContext52, null, null, null, null, null, null, null, null, null, 8388606), null, null, null, 30);
        AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper2 = this.fiatlyService;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$0 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$1 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$2 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$3 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$5 = appServiceContextWrapper;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$6 = message;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$8 = exc;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$9 = requestContext;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$10 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$11 = null;
        appServiceContextWrapper$initiatePersonalizedPayment$1.L$12 = copy$default2;
        appServiceContextWrapper$initiatePersonalizedPayment$1.I$0 = i2;
        appServiceContextWrapper$initiatePersonalizedPayment$1.label = 2;
        AppServiceContextWrapper$initiatePersonalizedPayment$1 appServiceContextWrapper$initiatePersonalizedPayment$142 = appServiceContextWrapper$initiatePersonalizedPayment$1;
        obj = appServiceResponseInterceptorWrapper2.initiatePersonalizedPayment(clientScenario2, str4, str5, str6, copy$default2, appServiceContextWrapper$initiatePersonalizedPayment$142);
        initiatePersonalizedPaymentRequest2 = copy$default2;
        appServiceContextWrapper$initiatePersonalizedPayment$1 = appServiceContextWrapper$initiatePersonalizedPayment$142;
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(2:19|20))(10:21|22|23|24|(2:27|25)|28|29|30|31|(1:34)(1:33)))(7:40|41|42|43|44|45|(6:47|48|49|50|(8:52|24|(1:25)|28|29|30|31|(0))|34)(4:57|30|31|(0)(0))))(1:63))(7:72|(1:74)(1:81)|75|(1:77)|78|(1:80)|34)|64|65|66|(4:68|44|45|(0)(0))|34))|82|6|7|(0)(0)|64|65|66|(0)|34) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0198, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0199, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161 A[Catch: all -> 0x0064, LOOP:0: B:25:0x015b->B:27:0x0161, LOOP_END, TryCatch #2 {all -> 0x0064, blocks: (B:23:0x005f, B:24:0x0155, B:25:0x015b, B:27:0x0161, B:30:0x0175), top: B:22:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:45:0x010e, B:47:0x0115), top: B:44:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.squareup.wire.Message] */
    @Override // com.squareup.protos.franklin.app.AppService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitBlocker(ClientScenario clientScenario, String str, SubmitBlockerRequest submitBlockerRequest, Continuation continuation) {
        AppServiceContextWrapper$submitBlocker$1 appServiceContextWrapper$submitBlocker$1;
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
        Object submitBlocker;
        SubmitBlockerRequest submitBlockerRequest2;
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
        SubmitBlockerRequest submitBlockerRequest3 = submitBlockerRequest;
        if (continuation instanceof AppServiceContextWrapper$submitBlocker$1) {
            appServiceContextWrapper$submitBlocker$1 = (AppServiceContextWrapper$submitBlocker$1) continuation;
            int i4 = appServiceContextWrapper$submitBlocker$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                appServiceContextWrapper$submitBlocker$1.label = i4 - PKIFailureInfo.systemUnavail;
                AppServiceContextWrapper$submitBlocker$1 appServiceContextWrapper$submitBlocker$12 = appServiceContextWrapper$submitBlocker$1;
                Object obj3 = appServiceContextWrapper$submitBlocker$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appServiceContextWrapper$submitBlocker$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    SubmitBlockerRequest.AppRequestContext appRequestContext = submitBlockerRequest3.app_request_context;
                    RequestContext requestContext3 = appRequestContext != null ? ContextKt.toRequestContext(appRequestContext) : null;
                    Exception exc3 = new Exception();
                    if (requestContext3 == null) {
                        requestContext3 = ServiceContextWrapper.EMPTY;
                    }
                    appServiceContextWrapper$submitBlocker$12.L$0 = clientScenario;
                    str2 = str;
                    appServiceContextWrapper$submitBlocker$12.L$1 = str2;
                    appServiceContextWrapper$submitBlocker$12.L$3 = this;
                    appServiceContextWrapper$submitBlocker$12.L$4 = submitBlockerRequest3;
                    appServiceContextWrapper$submitBlocker$12.L$6 = exc3;
                    appServiceContextWrapper$submitBlocker$12.I$0 = 0;
                    appServiceContextWrapper$submitBlocker$12.label = 1;
                    Object produceRequestContext = this.contextManager.produceRequestContext(requestContext3, appServiceContextWrapper$submitBlocker$12);
                    if (produceRequestContext != coroutineSingletons) {
                        exc = exc3;
                        obj = produceRequestContext;
                        i2 = 0;
                        clientScenario2 = clientScenario;
                        serviceContextWrapper = this;
                    }
                }
                if (i == 1) {
                    int i5 = appServiceContextWrapper$submitBlocker$12.I$0;
                    Exception exc4 = appServiceContextWrapper$submitBlocker$12.L$6;
                    ?? r7 = appServiceContextWrapper$submitBlocker$12.L$4;
                    serviceContextWrapper = appServiceContextWrapper$submitBlocker$12.L$3;
                    str2 = appServiceContextWrapper$submitBlocker$12.L$1;
                    clientScenario2 = appServiceContextWrapper$submitBlocker$12.L$0;
                    SafeTrace.throwOnFailure(obj3);
                    i2 = i5;
                    submitBlockerRequest3 = r7;
                    exc = exc4;
                    obj = obj3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ApiResult apiResult3 = (ApiResult) appServiceContextWrapper$submitBlocker$12.L$8;
                                SafeTrace.throwOnFailure(obj3);
                                return apiResult3;
                            }
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) appServiceContextWrapper$submitBlocker$12.L$8;
                            SafeTrace.throwOnFailure(obj3);
                            throw th;
                        }
                        i3 = appServiceContextWrapper$submitBlocker$12.I$0;
                        obj2 = appServiceContextWrapper$submitBlocker$12.L$9;
                        message2 = (Message) appServiceContextWrapper$submitBlocker$12.L$8;
                        requestContext2 = appServiceContextWrapper$submitBlocker$12.L$7;
                        serviceContextWrapper3 = appServiceContextWrapper$submitBlocker$12.L$3;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            it = serviceContextWrapper3.requestListeners.iterator();
                            while (it.hasNext()) {
                                ((PaymentRequestsListener) it.next()).onRequest(message2);
                            }
                            obj3 = obj2;
                            apiResult2 = (ApiResult) obj3;
                            realServiceContextManager2 = serviceContextWrapper3.contextManager;
                            appServiceContextWrapper$submitBlocker$12.L$0 = null;
                            appServiceContextWrapper$submitBlocker$12.L$1 = null;
                            appServiceContextWrapper$submitBlocker$12.L$3 = null;
                            appServiceContextWrapper$submitBlocker$12.L$4 = null;
                            appServiceContextWrapper$submitBlocker$12.L$6 = null;
                            appServiceContextWrapper$submitBlocker$12.L$7 = null;
                            appServiceContextWrapper$submitBlocker$12.L$8 = apiResult2;
                            appServiceContextWrapper$submitBlocker$12.L$9 = null;
                            appServiceContextWrapper$submitBlocker$12.L$10 = null;
                            appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                            appServiceContextWrapper$submitBlocker$12.label = 4;
                        } catch (Throwable th2) {
                            th = th2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            appServiceContextWrapper$submitBlocker$12.L$0 = null;
                            appServiceContextWrapper$submitBlocker$12.L$1 = null;
                            appServiceContextWrapper$submitBlocker$12.L$3 = null;
                            appServiceContextWrapper$submitBlocker$12.L$4 = null;
                            appServiceContextWrapper$submitBlocker$12.L$6 = null;
                            appServiceContextWrapper$submitBlocker$12.L$7 = null;
                            appServiceContextWrapper$submitBlocker$12.L$8 = th;
                            appServiceContextWrapper$submitBlocker$12.L$9 = null;
                            appServiceContextWrapper$submitBlocker$12.L$10 = null;
                            appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                            appServiceContextWrapper$submitBlocker$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons) {
                            }
                        }
                        return realServiceContextManager2.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons ? coroutineSingletons : apiResult2;
                    }
                    i3 = appServiceContextWrapper$submitBlocker$12.I$0;
                    submitBlockerRequest2 = appServiceContextWrapper$submitBlocker$12.L$10;
                    requestContext = appServiceContextWrapper$submitBlocker$12.L$7;
                    Exception exc5 = appServiceContextWrapper$submitBlocker$12.L$6;
                    message = appServiceContextWrapper$submitBlocker$12.L$4;
                    serviceContextWrapper = appServiceContextWrapper$submitBlocker$12.L$3;
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
                        appServiceContextWrapper$submitBlocker$12.L$0 = null;
                        appServiceContextWrapper$submitBlocker$12.L$1 = null;
                        appServiceContextWrapper$submitBlocker$12.L$3 = null;
                        appServiceContextWrapper$submitBlocker$12.L$4 = null;
                        appServiceContextWrapper$submitBlocker$12.L$6 = null;
                        appServiceContextWrapper$submitBlocker$12.L$7 = null;
                        appServiceContextWrapper$submitBlocker$12.L$8 = th;
                        appServiceContextWrapper$submitBlocker$12.L$9 = null;
                        appServiceContextWrapper$submitBlocker$12.L$10 = null;
                        appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                        appServiceContextWrapper$submitBlocker$12.label = 5;
                        if (realServiceContextManager.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons) {
                            throw th;
                        }
                    }
                    if (!(apiResult instanceof ApiResult.Success)) {
                        RealServiceContextManager realServiceContextManager3 = serviceContextWrapper2.contextManager;
                        SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) apiResult).response;
                        ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                        mergeResponseContexts.getClass();
                        String simpleName = message.getClass().getSimpleName();
                        appServiceContextWrapper$submitBlocker$12.L$0 = null;
                        appServiceContextWrapper$submitBlocker$12.L$1 = null;
                        appServiceContextWrapper$submitBlocker$12.L$3 = serviceContextWrapper2;
                        appServiceContextWrapper$submitBlocker$12.L$4 = null;
                        appServiceContextWrapper$submitBlocker$12.L$6 = null;
                        appServiceContextWrapper$submitBlocker$12.L$7 = requestContext;
                        appServiceContextWrapper$submitBlocker$12.L$8 = submitBlockerRequest2;
                        appServiceContextWrapper$submitBlocker$12.L$9 = obj3;
                        appServiceContextWrapper$submitBlocker$12.L$10 = null;
                        appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                        appServiceContextWrapper$submitBlocker$12.label = 3;
                        requestContext2 = requestContext;
                        try {
                            if (realServiceContextManager3.consumeResponseContext(requestContext2, mergeResponseContexts, simpleName, exc2, appServiceContextWrapper$submitBlocker$12) != coroutineSingletons) {
                                message2 = submitBlockerRequest2;
                                obj2 = obj3;
                                serviceContextWrapper3 = serviceContextWrapper2;
                                it = serviceContextWrapper3.requestListeners.iterator();
                                while (it.hasNext()) {
                                }
                                obj3 = obj2;
                                apiResult2 = (ApiResult) obj3;
                                realServiceContextManager2 = serviceContextWrapper3.contextManager;
                                appServiceContextWrapper$submitBlocker$12.L$0 = null;
                                appServiceContextWrapper$submitBlocker$12.L$1 = null;
                                appServiceContextWrapper$submitBlocker$12.L$3 = null;
                                appServiceContextWrapper$submitBlocker$12.L$4 = null;
                                appServiceContextWrapper$submitBlocker$12.L$6 = null;
                                appServiceContextWrapper$submitBlocker$12.L$7 = null;
                                appServiceContextWrapper$submitBlocker$12.L$8 = apiResult2;
                                appServiceContextWrapper$submitBlocker$12.L$9 = null;
                                appServiceContextWrapper$submitBlocker$12.L$10 = null;
                                appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                                appServiceContextWrapper$submitBlocker$12.label = 4;
                                if (realServiceContextManager2.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons) {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            serviceContextWrapper3 = serviceContextWrapper2;
                            realServiceContextManager = serviceContextWrapper3.contextManager;
                            appServiceContextWrapper$submitBlocker$12.L$0 = null;
                            appServiceContextWrapper$submitBlocker$12.L$1 = null;
                            appServiceContextWrapper$submitBlocker$12.L$3 = null;
                            appServiceContextWrapper$submitBlocker$12.L$4 = null;
                            appServiceContextWrapper$submitBlocker$12.L$6 = null;
                            appServiceContextWrapper$submitBlocker$12.L$7 = null;
                            appServiceContextWrapper$submitBlocker$12.L$8 = th;
                            appServiceContextWrapper$submitBlocker$12.L$9 = null;
                            appServiceContextWrapper$submitBlocker$12.L$10 = null;
                            appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                            appServiceContextWrapper$submitBlocker$12.label = 5;
                            if (realServiceContextManager.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons) {
                            }
                        }
                    }
                    requestContext2 = requestContext;
                    serviceContextWrapper3 = serviceContextWrapper2;
                    apiResult2 = (ApiResult) obj3;
                    realServiceContextManager2 = serviceContextWrapper3.contextManager;
                    appServiceContextWrapper$submitBlocker$12.L$0 = null;
                    appServiceContextWrapper$submitBlocker$12.L$1 = null;
                    appServiceContextWrapper$submitBlocker$12.L$3 = null;
                    appServiceContextWrapper$submitBlocker$12.L$4 = null;
                    appServiceContextWrapper$submitBlocker$12.L$6 = null;
                    appServiceContextWrapper$submitBlocker$12.L$7 = null;
                    appServiceContextWrapper$submitBlocker$12.L$8 = apiResult2;
                    appServiceContextWrapper$submitBlocker$12.L$9 = null;
                    appServiceContextWrapper$submitBlocker$12.L$10 = null;
                    appServiceContextWrapper$submitBlocker$12.I$0 = i3;
                    appServiceContextWrapper$submitBlocker$12.label = 4;
                    if (realServiceContextManager2.requestComplete(requestContext2, appServiceContextWrapper$submitBlocker$12) == coroutineSingletons) {
                    }
                }
                requestContext = (RequestContext) obj;
                SubmitBlockerRequest copy$default = SubmitBlockerRequest.copy$default(submitBlockerRequest3, ContextKt.toAppRequestContext(requestContext), null, null, 13);
                AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper = this.franklinAppService;
                appServiceContextWrapper$submitBlocker$12.L$0 = null;
                appServiceContextWrapper$submitBlocker$12.L$1 = null;
                appServiceContextWrapper$submitBlocker$12.L$3 = serviceContextWrapper;
                appServiceContextWrapper$submitBlocker$12.L$4 = submitBlockerRequest3;
                appServiceContextWrapper$submitBlocker$12.L$6 = exc;
                appServiceContextWrapper$submitBlocker$12.L$7 = requestContext;
                appServiceContextWrapper$submitBlocker$12.L$8 = null;
                appServiceContextWrapper$submitBlocker$12.L$9 = null;
                appServiceContextWrapper$submitBlocker$12.L$10 = copy$default;
                appServiceContextWrapper$submitBlocker$12.I$0 = i2;
                appServiceContextWrapper$submitBlocker$12.label = 2;
                submitBlocker = appServiceResponseInterceptorWrapper.submitBlocker(clientScenario2, str2, copy$default, appServiceContextWrapper$submitBlocker$12);
                if (submitBlocker != coroutineSingletons) {
                    int i6 = i2;
                    obj3 = submitBlocker;
                    submitBlockerRequest2 = copy$default;
                    serviceContextWrapper2 = serviceContextWrapper;
                    exc2 = exc;
                    message = submitBlockerRequest3;
                    i3 = i6;
                    apiResult = (ApiResult) obj3;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
            }
        }
        appServiceContextWrapper$submitBlocker$1 = new AppServiceContextWrapper$submitBlocker$1(this, continuation);
        AppServiceContextWrapper$submitBlocker$1 appServiceContextWrapper$submitBlocker$122 = appServiceContextWrapper$submitBlocker$1;
        Object obj32 = appServiceContextWrapper$submitBlocker$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appServiceContextWrapper$submitBlocker$122.label;
        if (i != 0) {
        }
        requestContext = (RequestContext) obj;
        SubmitBlockerRequest copy$default2 = SubmitBlockerRequest.copy$default(submitBlockerRequest3, ContextKt.toAppRequestContext(requestContext), null, null, 13);
        AppServiceResponseInterceptorWrapper appServiceResponseInterceptorWrapper2 = this.franklinAppService;
        appServiceContextWrapper$submitBlocker$122.L$0 = null;
        appServiceContextWrapper$submitBlocker$122.L$1 = null;
        appServiceContextWrapper$submitBlocker$122.L$3 = serviceContextWrapper;
        appServiceContextWrapper$submitBlocker$122.L$4 = submitBlockerRequest3;
        appServiceContextWrapper$submitBlocker$122.L$6 = exc;
        appServiceContextWrapper$submitBlocker$122.L$7 = requestContext;
        appServiceContextWrapper$submitBlocker$122.L$8 = null;
        appServiceContextWrapper$submitBlocker$122.L$9 = null;
        appServiceContextWrapper$submitBlocker$122.L$10 = copy$default2;
        appServiceContextWrapper$submitBlocker$122.I$0 = i2;
        appServiceContextWrapper$submitBlocker$122.label = 2;
        submitBlocker = appServiceResponseInterceptorWrapper2.submitBlocker(clientScenario2, str2, copy$default2, appServiceContextWrapper$submitBlocker$122);
        if (submitBlocker != coroutineSingletons) {
        }
    }

    @Override // com.squareup.protos.cash.cashfileuploads.app.FileUploadsClientService, com.squareup.cash.fileupload.service.api.HttpFileUploadService
    public final Object uploadFile(String str, String str2, RequestBody requestBody, Continuation continuation) {
        return this.$$delegate_0.uploadFile(str, str2, requestBody, continuation);
    }
}
