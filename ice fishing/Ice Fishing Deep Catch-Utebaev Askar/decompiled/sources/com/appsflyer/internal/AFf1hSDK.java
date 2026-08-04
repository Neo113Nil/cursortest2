package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1hSDK extends AFe1eSDK<Unit> {
    private final AFd1nSDK areAllFieldsValid;
    private final String component1;
    private final AFd1qSDK component2;
    private final ExecutorService component3;
    private final AFg1kSDK component4;
    private final AFg1wSDK hashCode;

    public static final class AFa1vSDK implements OutcomeReceiver {
        private /* synthetic */ AFf1hSDK AFAdRevenueData;
        private /* synthetic */ m.e getCurrencyIso4217Code;
        private /* synthetic */ CountDownLatch getMonetizationNetwork;

        public AFa1vSDK(m.e eVar, CountDownLatch countDownLatch, AFf1hSDK aFf1hSDK) {
            this.getCurrencyIso4217Code = eVar;
            this.getMonetizationNetwork = countDownLatch;
            this.AFAdRevenueData = aFf1hSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1hSDK.getMonetizationNetwork(exc);
            this.getMonetizationNetwork.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.getCurrencyIso4217Code.f210a = AFe1cSDK.SUCCESS;
            this.getMonetizationNetwork.countDown();
        }
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
        AFd1nSDK aFd1nSDKValues = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(aFd1nSDKValues, "");
        this.areAllFieldsValid = aFd1nSDKValues;
        AFg1kSDK aFg1kSDKComponent1 = aFd1kSDK.component1();
        Intrinsics.checkNotNullExpressionValue(aFg1kSDKComponent1, "");
        this.component4 = aFg1kSDKComponent1;
        AFg1wSDK aFg1wSDKAFKeystoreWrapper = aFd1kSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFg1wSDKAFKeystoreWrapper, "");
        this.hashCode = aFg1wSDKAFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        MeasurementManager measurementManagerA;
        m.e eVar = new m.e();
        eVar.f210a = AFe1cSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.areAllFieldsValid.AFAdRevenueData;
            if (context != null && (measurementManagerA = b.a(context.getSystemService(b.b()))) != null) {
                new AFj1jSDK(this.component2, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1jSDK.getCurrencyIso4217Code()).buildUpon();
                String monetizationNetwork = this.component2.getMonetizationNetwork();
                if (monetizationNetwork == null) {
                    monetizationNetwork = "";
                }
                Context context2 = this.component2.getMonetizationNetwork.AFAdRevenueData;
                LinkedHashMap linkedHashMapE = d0.e(new Pair("event_name", this.component1), new Pair("app_id", this.component2.getMonetizationNetwork.AFAdRevenueData.getPackageName()), new Pair("app_version", AFb1qSDK.getMediationNetwork(context2, context2.getPackageName())), new Pair("sdk_version", AFd1qSDK.getRevenue()), new Pair("api_version", AFd1qSDK.getCurrencyIso4217Code()), new Pair("timestamp", String.valueOf(this.component4.getCurrencyIso4217Code())), new Pair("request_id", AFd1qSDK.getMediationNetwork()), new Pair("gaid", monetizationNetwork));
                AFd1qSDK aFd1qSDK = this.component2;
                String currencyIso4217Code = AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue);
                if (currencyIso4217Code != null) {
                    linkedHashMapE.put("appsflyer_id", currencyIso4217Code);
                }
                Long lAFAdRevenueData = this.component4.AFAdRevenueData();
                if (lAFAdRevenueData != null) {
                    linkedHashMapE.put("install_time", String.valueOf(lAFAdRevenueData.longValue()));
                }
                for (Map.Entry entry : linkedHashMapE.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerA.registerTrigger(uriBuild, this.component3, new AFa1vSDK(eVar, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
        }
        return eVar.f210a;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 20000L;
    }

    public static final /* synthetic */ void getMonetizationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, "Error occurred: " + th.getMessage(), th, false, false, false, true);
    }
}
