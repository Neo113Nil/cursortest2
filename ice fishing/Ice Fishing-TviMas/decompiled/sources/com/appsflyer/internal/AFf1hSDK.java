package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes4.dex */
public final class AFf1hSDK extends AFe1eSDK<Unit> {
    private final AFd1nSDK areAllFieldsValid;
    private final String component1;
    private final AFd1qSDK component2;
    private final ExecutorService component3;
    private final AFg1kSDK component4;
    private final AFg1wSDK hashCode;

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1hSDK(AFd1kSDK aFd1kSDK, String str) {
        super(AFf1zSDK.REGISTER_TRIGGER, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.CONVERSION}, "RegisterTrigger");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        ExecutorService monetizationNetwork = aFd1kSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.component3 = monetizationNetwork;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.component2 = mediationNetwork;
        AFd1nSDK values = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        this.areAllFieldsValid = values;
        AFg1kSDK component1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(component1, "");
        this.component4 = component1;
        AFg1wSDK AFKeystoreWrapper = aFd1kSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
        this.hashCode = AFKeystoreWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.appsflyer.internal.AFe1cSDK] */
    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        MeasurementManager measurementManager;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AFe1cSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.areAllFieldsValid.AFAdRevenueData;
            if (context != null && (measurementManager = (MeasurementManager) context.getSystemService(MeasurementManager.class)) != null) {
                new AFj1jSDK(this.component2, null, 2, null);
                Uri.Builder buildUpon = Uri.parse(AFj1jSDK.getCurrencyIso4217Code()).buildUpon();
                String monetizationNetwork = this.component2.getMonetizationNetwork();
                if (monetizationNetwork == null) {
                    monetizationNetwork = "";
                }
                AFd1qSDK aFd1qSDK = this.component2;
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("event_name", this.component1), TuplesKt.to("app_id", this.component2.getMonetizationNetwork.AFAdRevenueData.getPackageName()), TuplesKt.to("app_version", AFb1qSDK.getMediationNetwork(aFd1qSDK.getMonetizationNetwork.AFAdRevenueData, aFd1qSDK.getMonetizationNetwork.AFAdRevenueData.getPackageName())), TuplesKt.to("sdk_version", AFd1qSDK.getRevenue()), TuplesKt.to("api_version", AFd1qSDK.getCurrencyIso4217Code()), TuplesKt.to(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, String.valueOf(this.component4.getCurrencyIso4217Code())), TuplesKt.to(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, AFd1qSDK.getMediationNetwork()), TuplesKt.to("gaid", monetizationNetwork));
                AFd1qSDK aFd1qSDK2 = this.component2;
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK2.getMonetizationNetwork, aFd1qSDK2.getRevenue);
                if (currencyIso4217Code != null) {
                    mutableMapOf.put("appsflyer_id", currencyIso4217Code);
                }
                Long AFAdRevenueData = this.component4.AFAdRevenueData();
                if (AFAdRevenueData != null) {
                    mutableMapOf.put("install_time", String.valueOf(AFAdRevenueData.longValue()));
                }
                for (Map.Entry entry : mutableMapOf.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Intrinsics.checkNotNullExpressionValue(build, "");
                measurementManager.registerTrigger(build, this.component3, new AFa1vSDK(objectRef, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return (AFe1cSDK) objectRef.element;
    }

    public static final class AFa1vSDK implements OutcomeReceiver<Object, Exception> {
        private /* synthetic */ AFf1hSDK AFAdRevenueData;
        private /* synthetic */ Ref.ObjectRef<AFe1cSDK> getCurrencyIso4217Code;
        private /* synthetic */ CountDownLatch getMonetizationNetwork;

        AFa1vSDK(Ref.ObjectRef<AFe1cSDK> objectRef, CountDownLatch countDownLatch, AFf1hSDK aFf1hSDK) {
            this.getCurrencyIso4217Code = objectRef;
            this.getMonetizationNetwork = countDownLatch;
            this.AFAdRevenueData = aFf1hSDK;
        }

        @Override // android.os.OutcomeReceiver
        public final /* synthetic */ void onError(Exception exc) {
            Exception exc2 = exc;
            Intrinsics.checkNotNullParameter(exc2, "");
            AFf1hSDK.getMonetizationNetwork(exc2);
            this.getMonetizationNetwork.countDown();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.appsflyer.internal.AFe1cSDK] */
        @Override // android.os.OutcomeReceiver
        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.element = AFe1cSDK.SUCCESS;
            this.getMonetizationNetwork.countDown();
        }
    }

    public static final /* synthetic */ void getMonetizationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
