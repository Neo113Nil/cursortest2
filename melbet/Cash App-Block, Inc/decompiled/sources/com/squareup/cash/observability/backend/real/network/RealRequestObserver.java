package com.squareup.cash.observability.backend.real.network;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumMonitor;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealRequestObserver {
    public final String baseUrl;
    public final RealObservabilityManager observabilityManager;

    public RealRequestObserver(RealObservabilityManager realObservabilityManager, String str, RealUuidGenerator realUuidGenerator) {
        this.observabilityManager = realObservabilityManager;
        this.baseUrl = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object maybeObserveRequest(String str, Map map, MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5, RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        RealRequestObserver$maybeObserveRequest$1 realRequestObserver$maybeObserveRequest$1;
        int i;
        String str2;
        ApiResult apiResult;
        if (continuationImpl instanceof RealRequestObserver$maybeObserveRequest$1) {
            realRequestObserver$maybeObserveRequest$1 = (RealRequestObserver$maybeObserveRequest$1) continuationImpl;
            int i2 = realRequestObserver$maybeObserveRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRequestObserver$maybeObserveRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRequestObserver$maybeObserveRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRequestObserver$maybeObserveRequest$1.label;
                RealObservabilityManager realObservabilityManager = this.observabilityManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) moneyTabUIKt$$ExternalSyntheticLambda5.invoke()).booleanValue()) {
                        String m = re$$ExternalSyntheticOutline0.m();
                        realObservabilityManager.startResource(m, this.baseUrl + str, map);
                        realRequestObserver$maybeObserveRequest$1.L$4 = m;
                        realRequestObserver$maybeObserveRequest$1.label = 2;
                        obj = anonymousClass1.invoke(realRequestObserver$maybeObserveRequest$1);
                        if (obj != obj2) {
                            str2 = m;
                        }
                    } else {
                        realRequestObserver$maybeObserveRequest$1.label = 1;
                        Object invoke = anonymousClass1.invoke(realRequestObserver$maybeObserveRequest$1);
                        if (invoke != obj2) {
                            return invoke;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = realRequestObserver$maybeObserveRequest$1.L$4;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    realObservabilityManager.stopResource(new Integer(200), str2);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                if (failure instanceof ApiResult.Failure.HttpFailure) {
                    realObservabilityManager.stopResource(new Integer(((ApiResult.Failure.HttpFailure) failure).code), str2);
                    return apiResult;
                }
                if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Throwable th = ((ApiResult.Failure.NetworkFailure) failure).error;
                String message = th.getMessage();
                if (message == null) {
                    message = "network failure";
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                str2.getClass();
                emptyMap.getClass();
                ((RumMonitor) realObservabilityManager.datadogClient.rumMonitor.invoke()).stopResourceWithError(str2, message, th, emptyMap);
                return apiResult;
            }
        }
        realRequestObserver$maybeObserveRequest$1 = new RealRequestObserver$maybeObserveRequest$1(this, continuationImpl);
        Object obj3 = realRequestObserver$maybeObserveRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRequestObserver$maybeObserveRequest$1.label;
        RealObservabilityManager realObservabilityManager2 = this.observabilityManager;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
        if (apiResult instanceof ApiResult.Failure) {
        }
    }
}
