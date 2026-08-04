package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ph.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1wSDK extends AFe1mSDK<Unit> {
    public AFg1nSDK areAllFieldsValid;
    public AFc1oSDK component1;
    public AFe1rSDK component2;
    public Executor component3;
    public AFc1hSDK component4;
    public Function1<AFe1uSDK, Unit> equals;
    public AFf1eSDK toString;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class AFa1uSDK implements OutcomeReceiver {
        private /* synthetic */ a0 AFAdRevenueData;
        private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
        private /* synthetic */ AFf1wSDK getRevenue;

        public AFa1uSDK(a0 a0Var, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
            this.AFAdRevenueData = a0Var;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getRevenue = aFf1wSDK;
        }

        public final /* synthetic */ void onError(Throwable th) {
            Exception exc = (Exception) th;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1wSDK.getMediationNetwork(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFAdRevenueData.d = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1wSDK(AFe1rSDK aFe1rSDK, Executor executor, AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component2 = aFe1rSDK;
        this.component3 = executor;
        this.component1 = aFc1oSDK;
        this.component4 = aFc1hSDK;
        this.areAllFieldsValid = aFg1nSDK;
        this.toString = aFf1eSDK;
        this.equals = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
            this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1uSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1zSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, com.gamericefishpro.space.m5.a.u("Error occurred: ", th.getMessage()), th, false, false, false, true);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
        if (aFe1uSDK != null) {
            this.equals.invoke(aFe1uSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        MeasurementManager measurementManagerE;
        a0 a0Var = new a0();
        a0Var.d = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component4.getMonetizationNetwork;
            if (context != null && (measurementManagerE = m.e(context.getSystemService(m.j()))) != null) {
                new AFj1cSDK(this.component1, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
                String strAreAllFieldsValid = this.component1.areAllFieldsValid();
                if (strAreAllFieldsValid == null) {
                    strAreAllFieldsValid = "";
                }
                LinkedHashMap linkedHashMapF = m0.f(new Pair("event_name", this.component2.getRevenue), new Pair("app_id", this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("app_version", this.component1.n_().versionName), new Pair("sdk_version", AFc1oSDK.getMonetizationNetwork()), new Pair("api_version", AFc1oSDK.getCurrencyIso4217Code()), new Pair("timestamp", String.valueOf(this.areAllFieldsValid.getCurrencyIso4217Code())), new Pair("request_id", AFc1oSDK.getMediationNetwork()), new Pair("gaid", strAreAllFieldsValid));
                String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component1.getMediationNetwork);
                if (currencyIso4217Code != null) {
                    linkedHashMapF.put("appsflyer_id", currencyIso4217Code);
                }
                Long monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    linkedHashMapF.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                }
                AFe1rSDK aFe1rSDK = this.component2;
                if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
                    Float f = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
                    if (f != null) {
                        linkedHashMapF.put("event_revenue", String.valueOf(f.floatValue()));
                    }
                    Integer num = ((AFe1rSDK.AFa1zSDK) this.component2).AFAdRevenueData;
                    if (num != null) {
                        linkedHashMapF.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : linkedHashMapF.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerE.registerTrigger(uriBuild, this.component3, new AFa1uSDK(a0Var, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            a0Var.d = AFe1uSDK.TIMEOUT;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, com.gamericefishpro.space.m5.a.u("Error occurred: ", th.getMessage()), th, false, false, false, true);
        }
        return (AFe1uSDK) a0Var.d;
    }
}
