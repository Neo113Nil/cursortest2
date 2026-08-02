package com.squareup.cash.data.js;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.OfflinePaymentHistoryData;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import dev.zacsweers.metro.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ZiplineHistoryDataJavaScripter {
    public final Provider activityDataBridge;
    public final Lazy initiatePaymentRequestAdapter$delegate;
    public final Moshi moshi;
    public final Lazy offlinePaymentHistoryDataAdapter$delegate;
    public final Lazy paymentHistoryDataAdapter$delegate;
    public final Lazy transferFundsRequestAdapter$delegate;
    public final Provider treehouseActivity;

    public ZiplineHistoryDataJavaScripter(Provider provider, Provider provider2, Moshi moshi) {
        provider.getClass();
        provider2.getClass();
        this.treehouseActivity = provider;
        this.activityDataBridge = provider2;
        this.moshi = moshi;
        final int i = 0;
        this.paymentHistoryDataAdapter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$$ExternalSyntheticLambda0
            public final /* synthetic */ ZiplineHistoryDataJavaScripter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.f$0;
                switch (i2) {
                    case 0:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(PaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 1:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(OfflinePaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 2:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(InitiatePaymentRequest.class, Util.NO_ANNOTATIONS, null);
                    default:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(TransferFundsRequest.class, Util.NO_ANNOTATIONS, null);
                }
            }
        });
        final int i2 = 1;
        this.offlinePaymentHistoryDataAdapter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$$ExternalSyntheticLambda0
            public final /* synthetic */ ZiplineHistoryDataJavaScripter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.f$0;
                switch (i22) {
                    case 0:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(PaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 1:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(OfflinePaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 2:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(InitiatePaymentRequest.class, Util.NO_ANNOTATIONS, null);
                    default:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(TransferFundsRequest.class, Util.NO_ANNOTATIONS, null);
                }
            }
        });
        final int i3 = 2;
        this.initiatePaymentRequestAdapter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$$ExternalSyntheticLambda0
            public final /* synthetic */ ZiplineHistoryDataJavaScripter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.f$0;
                switch (i22) {
                    case 0:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(PaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 1:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(OfflinePaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 2:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(InitiatePaymentRequest.class, Util.NO_ANNOTATIONS, null);
                    default:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(TransferFundsRequest.class, Util.NO_ANNOTATIONS, null);
                }
            }
        });
        final int i4 = 3;
        this.transferFundsRequestAdapter$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$$ExternalSyntheticLambda0
            public final /* synthetic */ ZiplineHistoryDataJavaScripter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = this.f$0;
                switch (i22) {
                    case 0:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(PaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 1:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(OfflinePaymentHistoryData.class, Util.NO_ANNOTATIONS, null);
                    case 2:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(InitiatePaymentRequest.class, Util.NO_ANNOTATIONS, null);
                    default:
                        return ziplineHistoryDataJavaScripter.moshi.adapter(TransferFundsRequest.class, Util.NO_ANNOTATIONS, null);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object offlinePaymentHistoryData(InitiatePaymentRequest initiatePaymentRequest, ContinuationImpl continuationImpl) {
        ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$1 ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1;
        int i;
        if (continuationImpl instanceof ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$1) {
            ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1 = (ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$1) continuationImpl;
            int i2 = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.activityDataBridge.invoke();
                    Object value = this.initiatePaymentRequestAdapter$delegate.getValue();
                    value.getClass();
                    String json = ((JsonAdapter) value).toJson(initiatePaymentRequest);
                    json.getClass();
                    ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.label = 1;
                    obj = activityDataBridge.offlinePaymentHistoryData(json, ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Object value2 = this.offlinePaymentHistoryDataAdapter$delegate.getValue();
                value2.getClass();
                Object fromJson = ((JsonAdapter) value2).fromJson((String) obj);
                fromJson.getClass();
                return fromJson;
            }
        }
        ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1 = new ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$1(this, continuationImpl);
        Object obj2 = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$1.label;
        if (i != 0) {
        }
        Object value22 = this.offlinePaymentHistoryDataAdapter$delegate.getValue();
        value22.getClass();
        Object fromJson2 = ((JsonAdapter) value22).fromJson((String) obj2);
        fromJson2.getClass();
        return fromJson2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object paymentHistoryData(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        ZiplineHistoryDataJavaScripter$paymentHistoryData$1 ziplineHistoryDataJavaScripter$paymentHistoryData$1;
        int i;
        if (continuationImpl instanceof ZiplineHistoryDataJavaScripter$paymentHistoryData$1) {
            ziplineHistoryDataJavaScripter$paymentHistoryData$1 = (ZiplineHistoryDataJavaScripter$paymentHistoryData$1) continuationImpl;
            int i2 = ziplineHistoryDataJavaScripter$paymentHistoryData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                ziplineHistoryDataJavaScripter$paymentHistoryData$1.label = i2 - PKIFailureInfo.systemUnavail;
                ZiplineHistoryDataJavaScripter$paymentHistoryData$1 ziplineHistoryDataJavaScripter$paymentHistoryData$12 = ziplineHistoryDataJavaScripter$paymentHistoryData$1;
                Object obj = ziplineHistoryDataJavaScripter$paymentHistoryData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ziplineHistoryDataJavaScripter$paymentHistoryData$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.activityDataBridge.invoke();
                    ziplineHistoryDataJavaScripter$paymentHistoryData$12.label = 1;
                    obj = activityDataBridge.format(str, str2, str3, str4, ziplineHistoryDataJavaScripter$paymentHistoryData$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Object value = this.paymentHistoryDataAdapter$delegate.getValue();
                value.getClass();
                Object fromJson = ((JsonAdapter) value).fromJson((String) obj);
                fromJson.getClass();
                return fromJson;
            }
        }
        ziplineHistoryDataJavaScripter$paymentHistoryData$1 = new ZiplineHistoryDataJavaScripter$paymentHistoryData$1(this, continuationImpl);
        ZiplineHistoryDataJavaScripter$paymentHistoryData$1 ziplineHistoryDataJavaScripter$paymentHistoryData$122 = ziplineHistoryDataJavaScripter$paymentHistoryData$1;
        Object obj2 = ziplineHistoryDataJavaScripter$paymentHistoryData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineHistoryDataJavaScripter$paymentHistoryData$122.label;
        if (i != 0) {
        }
        Object value2 = this.paymentHistoryDataAdapter$delegate.getValue();
        value2.getClass();
        Object fromJson2 = ((JsonAdapter) value2).fromJson((String) obj2);
        fromJson2.getClass();
        return fromJson2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object offlinePaymentHistoryData(TransferFundsRequest transferFundsRequest, ContinuationImpl continuationImpl) {
        ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2 ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2;
        int i;
        if (continuationImpl instanceof ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2) {
            ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2 = (ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2) continuationImpl;
            int i2 = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) this.activityDataBridge.invoke();
                    Object value = this.transferFundsRequestAdapter$delegate.getValue();
                    value.getClass();
                    String json = ((JsonAdapter) value).toJson(transferFundsRequest);
                    json.getClass();
                    ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.label = 1;
                    obj = activityDataBridge.offlineTransferHistoryData(json, ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Object value2 = this.offlinePaymentHistoryDataAdapter$delegate.getValue();
                value2.getClass();
                Object fromJson = ((JsonAdapter) value2).fromJson((String) obj);
                fromJson.getClass();
                return fromJson;
            }
        }
        ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2 = new ZiplineHistoryDataJavaScripter$offlinePaymentHistoryData$2(this, continuationImpl);
        Object obj2 = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineHistoryDataJavaScripter$offlinePaymentHistoryData$2.label;
        if (i != 0) {
        }
        Object value22 = this.offlinePaymentHistoryDataAdapter$delegate.getValue();
        value22.getClass();
        Object fromJson2 = ((JsonAdapter) value22).fromJson((String) obj2);
        fromJson2.getClass();
        return fromJson2;
    }
}
