package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.x;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFe1eSDK extends AFe1mSDK<AFh1rSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    private final com.gamericefishpro.space.oh.h areAllFieldsValid;
    private final AFc1oSDK component1;
    private final AFc1eSDK component2;
    private final AFh1rSDK component3;
    private final AFc1hSDK component4;
    private final com.gamericefishpro.space.oh.h copy;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass1 extends com.gamericefishpro.space.ei.l implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1eSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AnonymousClass4 extends com.gamericefishpro.space.ei.l implements Function0<Long> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long lC;
            String currencyIso4217Code = AFe1eSDK.this.component1.getCurrencyIso4217Code("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((currencyIso4217Code == null || (lC = StringsKt.C(currencyIso4217Code)) == null) ? 1000L : lC.longValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1uSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1uSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1uSDK copy$default(AFa1uSDK aFa1uSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1uSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1uSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1uSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1uSDK.gaidError;
            }
            return aFa1uSDK.copy(str, bool, z, sb);
        }

        public final String component1() {
            return this.advertisingId;
        }

        public final Boolean component2() {
            return this.isLimitAdTrackingEnabled;
        }

        public final boolean component3() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder component4() {
            return this.gaidError;
        }

        public final AFa1uSDK copy(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1uSDK(str, bool, z, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.a(this.advertisingId, aFa1uSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1uSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1uSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1uSDK.gaidError);
        }

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r1) * 31);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1uSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class AFa1ySDK implements CloudDevCallback {
        final /* synthetic */ AFa1uSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1ySDK(AFa1uSDK aFa1uSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1uSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1ySDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, com.gamericefishpro.space.m5.a.u("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFd1zSDK aFd1zSDK) {
        super(AFe1pSDK.FETCH_ADVERTISING_ID, new AFe1pSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        AFc1hSDK aFc1hSDKAFInAppEventParameterName = aFd1zSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
        this.component4 = aFc1hSDKAFInAppEventParameterName;
        AFc1oSDK aFc1oSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
        this.component1 = aFc1oSDKAFAdRevenueData;
        AFc1eSDK aFc1eSDKForce = aFd1zSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFc1eSDKForce, "");
        this.component2 = aFc1eSDKForce;
        this.component3 = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
        this.areAllFieldsValid = com.gamericefishpro.space.oh.i.b(new AnonymousClass4());
        this.copy = com.gamericefishpro.space.oh.i.b(new AnonymousClass1());
    }

    private static boolean component2() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th instanceof ClassNotFoundException ? "CloudDevSdk not found" : com.gamericefishpro.space.m5.a.u("Unexpected exception while checking if running in cloud environment: ", th.getMessage()), th, true, false, false, false, 112, null);
            return false;
        }
    }

    private final boolean component3() {
        return ((Boolean) this.copy.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    private final boolean copydefault() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (component3() && getMonetizationNetwork(i)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                if (getCurrencyIso4217Code(i)) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
                break;
                break;
            }
        }
        this.component2.component3 = this.component3;
        return z;
    }

    private final boolean getMediationNetwork(int i) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component2()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.component4.getMonetizationNetwork;
            Intrinsics.b(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.component4.getMonetizationNetwork;
                    Intrinsics.b(context2);
                    cloudDevSdk2.request(context2, w.c("gaid"), new AFa1ySDK(aFa1uSDK, countDownLatch));
                    countDownLatch.await(((Number) this.areAllFieldsValid.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1uSDK.getGaidError().length() > 0) {
                        getRevenue(this.component3, aFa1uSDK.getGaidError().toString());
                    }
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                        }
                        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1uSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1uSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th2) {
                        if (aFa1uSDK.getGaidError().length() > 0) {
                            getRevenue(this.component3, aFa1uSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                String advertisingId = aFa1uSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1rSDK aFh1rSDK = this.component3;
                aFh1rSDK.getCurrencyIso4217Code = aFa1uSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1rSDK.getRevenue = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1rSDK.AFAdRevenueData = bool2;
                aFh1rSDK.getMediationNetwork = bool;
                aFh1rSDK.getMonetizationNetwork = bool2;
                aFh1rSDK.component2 = Boolean.valueOf(i != 2);
                return true;
            }
        }
        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return ((Number) this.areAllFieldsValid.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        if (this.component2.AFAdRevenueData()) {
            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1uSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copydefault());
        Boolean bool = Boolean.FALSE;
        AFe1uSDK aFe1uSDK = x.f(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1uSDK.SUCCESS : AFe1uSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.component2;
        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1aSDK.getMediationNetwork + "ms", false, 4, null);
        aFc1eSDK.getMediationNetwork(aFd1aSDK);
        return aFe1uSDK;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean getCurrencyIso4217Code(int i) {
        boolean z;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1uSDK aFa1uSDK = new AFa1uSDK(null, null, false, null, 15, null);
        Context context = this.component4.getMonetizationNetwork;
        Intrinsics.b(context);
        int revenue = getRevenue(context);
        Context context2 = this.component4.getMonetizationNetwork;
        Intrinsics.b(context2);
        if (!getCurrencyIso4217Code(context2, aFa1uSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.component4.getMonetizationNetwork;
                Intrinsics.b(context3);
                if (getRevenue(context3, aFa1uSDK)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String string = aFa1uSDK.getGaidError().toString();
            if (string != null && !StringsKt.u(string)) {
                string = revenue + ": " + StringsKt.D(string).toString();
            }
            getRevenue(this.component3, string);
            if (!z) {
                return false;
            }
        }
        AFh1rSDK aFh1rSDK = this.component3;
        aFh1rSDK.getCurrencyIso4217Code = aFa1uSDK.getAdvertisingId();
        aFh1rSDK.getRevenue = aFa1uSDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1uSDK.isLimitAdTrackingEnabled();
        aFh1rSDK.AFAdRevenueData = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1rSDK.getMediationNetwork = Boolean.valueOf(aFa1uSDK.getAdvertisingIdWithGps());
        aFh1rSDK.getMonetizationNetwork = Boolean.FALSE;
        aFh1rSDK.component2 = Boolean.valueOf(i != 2);
        return true;
    }

    private final boolean getMonetizationNetwork(int i) {
        return getMediationNetwork(i);
    }

    private static int getRevenue(Context context) {
        try {
            return com.gamericefishpro.space.s8.e.d.b(context, com.gamericefishpro.space.s8.f.a);
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getRevenue(Context context, AFa1uSDK aFa1uSDK) {
        try {
            AFb1vSDK.AFa1ySDK aFa1ySDKAFAdRevenueData = AFb1vSDK.AFAdRevenueData(context);
            aFa1uSDK.setAdvertisingId(aFa1ySDKAFAdRevenueData.getCurrencyIso4217Code);
            aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1ySDKAFAdRevenueData.AFAdRevenueData()));
            String advertisingId = aFa1uSDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1uSDK.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.a != null) {
                return true;
            }
            aFa1uSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, com.gamericefishpro.space.m5.a.u("Failed to fetch GAID: ", th.getMessage()), th, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1uSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1uSDK aFa1uSDK) {
        try {
            com.gamericefishpro.space.o8.a aVarA = com.gamericefishpro.space.o8.b.a(context);
            aFa1uSDK.setAdvertisingId(aVarA.c);
            aFa1uSDK.setLimitAdTrackingEnabled(Boolean.valueOf(aVarA.b));
            aFa1uSDK.setAdvertisingIdWithGps(true);
            String advertisingId = aFa1uSDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1uSDK.getGaidError().append("emptyOrNull |");
            }
            if (Unit.a != null) {
                return true;
            }
            aFa1uSDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, com.gamericefishpro.space.m5.a.u("Google Play Services is missing ", th.getMessage()), th, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1uSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static void getRevenue(AFh1rSDK aFh1rSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1rSDK.component3;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1rSDK.component3 = str;
    }
}
