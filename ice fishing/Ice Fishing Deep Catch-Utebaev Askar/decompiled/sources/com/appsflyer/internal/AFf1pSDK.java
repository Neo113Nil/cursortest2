package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1pSDK extends AFe1eSDK<AFh1pSDK> {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    private final f.a areAllFieldsValid;
    private final AFh1pSDK component1;
    private final AFd1nSDK component2;
    private final AFd1tSDK component3;
    private final AFd1qSDK component4;
    private final f.a equals;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1pSDK$2, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass2 extends m.d implements Function0<Boolean> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.component4.getRevenue("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1pSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<Long> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            Long lE;
            String revenue = AFf1pSDK.this.component4.getRevenue("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((revenue == null || (lE = kotlin.text.o.e(revenue)) == null) ? 1000L : lE.longValue());
        }
    }

    @Metadata
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1uSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1uSDK.w$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata
    public static final class AFa1vSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i2 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i2 & 4) != 0) {
                z = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i2 & 8) != 0) {
                sb = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z, sb);
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

        public final AFa1vSDK copy(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1vSDK(str, bool, z, gaidError);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) obj;
            return Intrinsics.a(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.a(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.a(this.gaidError, aFa1vSDK.gaidError);
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

        public AFa1vSDK(String str, Boolean bool, boolean z, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = gaidError;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1nSDK aFd1nSDKValues = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(aFd1nSDKValues, "");
        this.component2 = aFd1nSDKValues;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.component4 = mediationNetwork;
        AFd1tSDK aFd1tSDKE = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFd1tSDKE, "");
        this.component3 = aFd1tSDKE;
        this.component1 = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        this.areAllFieldsValid = f.b.a(new AnonymousClass5());
        this.equals = f.b.a(new AnonymousClass2());
    }

    private final boolean areAllFieldsValid() {
        return ((Boolean) ((f.g) this.equals).a()).booleanValue();
    }

    private static boolean component4() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[LOOP:0: B:3:0x0005->B:15:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[EDGE_INSN: B:19:0x0042->B:16:0x0042 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x003f], SYNTHETIC] */
    private final boolean copydefault() {
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        String str;
        boolean z = false;
        for (int i2 = 2; i2 > 0; i2--) {
            if (areAllFieldsValid() && getCurrencyIso4217Code(i2)) {
                aFLogger = AFLogger.INSTANCE;
                aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
                str = "GAID fetched using Samsung Cloud dev SDK";
            } else {
                if (getMediationNetwork(i2)) {
                    aFLogger = AFLogger.INSTANCE;
                    aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
                    str = "GAID fetched using GMS";
                } else {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                    z = false;
                }
                if (!z) {
                    break;
                }
            }
            AFh1uSDK.v$default(aFLogger, aFh1vSDK, str, false, 4, null);
            z = true;
            if (!z) {
                break;
                break;
            }
        }
        this.component3.component4 = this.component1;
        return z;
    }

    private final boolean getCurrencyIso4217Code(int i2) {
        return getRevenue(i2);
    }

    private static int getMediationNetwork(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
    private final boolean getRevenue(int i2) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
        AFh1uSDK.i$default(aFLogger, aFh1vSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component4()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.component2.AFAdRevenueData;
            Intrinsics.b(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.component2.AFAdRevenueData;
                    Intrinsics.b(context2);
                    cloudDevSdk2.request(context2, kotlin.collections.n.a("gaid"), new AFa1uSDK(aFa1vSDK, countDownLatch));
                    countDownLatch.await(((Number) ((f.g) this.areAllFieldsValid).a()).longValue(), TimeUnit.MILLISECONDS);
                    if (aFa1vSDK.getGaidError().length() > 0) {
                        getMediationNetwork(this.component1, aFa1vSDK.getGaidError().toString());
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
                        AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, str, th, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1vSDK.getGaidError();
                        gaidError.append(th.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getMediationNetwork(this.component1, aFa1vSDK.getGaidError().toString());
                        }
                    } catch (Throwable th2) {
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getMediationNetwork(this.component1, aFa1vSDK.getGaidError().toString());
                        }
                        throw th2;
                    }
                }
                String advertisingId = aFa1vSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1pSDK aFh1pSDK = this.component1;
                aFh1pSDK.getMonetizationNetwork = aFa1vSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1pSDK.AFAdRevenueData = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1pSDK.getCurrencyIso4217Code = bool2;
                aFh1pSDK.getRevenue = bool;
                aFh1pSDK.getMediationNetwork = bool2;
                aFh1pSDK.areAllFieldsValid = Boolean.valueOf(i2 != 2);
                return true;
            }
        }
        AFh1uSDK.i$default(aFLogger, aFh1vSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return ((Number) ((f.g) this.areAllFieldsValid).a()).longValue();
    }

    private final boolean getCurrencyIso4217Code(Context context, AFa1vSDK aFa1vSDK) {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                aFa1vSDK.setAdvertisingId(advertisingIdInfo.getId());
                aFa1vSDK.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                aFa1vSDK.setAdvertisingIdWithGps(true);
                String advertisingId = aFa1vSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    aFa1vSDK.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f157a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            aFa1vSDK.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            StringBuilder gaidError = aFa1vSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            AFh1uSDK.i$default(aFLogger, aFh1vSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private static void getMediationNetwork(AFh1pSDK aFh1pSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1pSDK.component3;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1pSDK.component3 = str;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        if (this.component3.getMonetizationNetwork()) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1cSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean bool = Boolean.FALSE;
        AFe1cSDK aFe1cSDK = kotlin.collections.o.b(Boolean.valueOf(copydefault()), bool, bool).contains(Boolean.TRUE) ? AFe1cSDK.SUCCESS : AFe1cSDK.FAILURE;
        AFd1tSDK aFd1tSDK = this.component3;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFe1nSDK.getRevenue + "ms", false, 4, null);
        aFd1tSDK.getRevenue(aFe1nSDK);
        return aFe1cSDK;
    }

    private final boolean AFAdRevenueData(Context context, AFa1vSDK aFa1vSDK) {
        try {
            AFa1cSDK.AFa1uSDK currencyIso4217Code = AFa1cSDK.getCurrencyIso4217Code(context);
            aFa1vSDK.setAdvertisingId(currencyIso4217Code.getMonetizationNetwork);
            aFa1vSDK.setLimitAdTrackingEnabled(Boolean.valueOf(currencyIso4217Code.getMediationNetwork()));
            String advertisingId = aFa1vSDK.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                aFa1vSDK.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f157a != null) {
                return true;
            }
            aFa1vSDK.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.ADVERTISING_ID;
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            StringBuilder gaidError = aFa1vSDK.getGaidError();
            gaidError.append(th.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            AFh1uSDK.i$default(aFLogger, aFh1vSDK, localizedMessage == null ? th.toString() : localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
    private final boolean getMediationNetwork(int i2) {
        boolean z;
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
        Context context = this.component2.AFAdRevenueData;
        Intrinsics.b(context);
        int mediationNetwork = getMediationNetwork(context);
        Context context2 = this.component2.AFAdRevenueData;
        Intrinsics.b(context2);
        if (!getCurrencyIso4217Code(context2, aFa1vSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.component2.AFAdRevenueData;
                Intrinsics.b(context3);
                if (AFAdRevenueData(context3, aFa1vSDK)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            String string = aFa1vSDK.getGaidError().toString();
            if (!(string == null || kotlin.text.o.b(string))) {
                string = mediationNetwork + ": " + kotlin.text.q.l(string).toString();
            }
            getMediationNetwork(this.component1, string);
            if (!z) {
                return false;
            }
        }
        AFh1pSDK aFh1pSDK = this.component1;
        aFh1pSDK.getMonetizationNetwork = aFa1vSDK.getAdvertisingId();
        aFh1pSDK.AFAdRevenueData = aFa1vSDK.isLimitAdTrackingEnabled();
        Boolean boolIsLimitAdTrackingEnabled = aFa1vSDK.isLimitAdTrackingEnabled();
        aFh1pSDK.getCurrencyIso4217Code = boolIsLimitAdTrackingEnabled != null ? Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue()) : null;
        aFh1pSDK.getRevenue = Boolean.valueOf(aFa1vSDK.getAdvertisingIdWithGps());
        aFh1pSDK.getMediationNetwork = Boolean.FALSE;
        aFh1pSDK.areAllFieldsValid = Boolean.valueOf(i2 != 2);
        return true;
    }
}
