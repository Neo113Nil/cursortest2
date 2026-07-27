package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1cSDK;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0012\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0019J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u001b*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u000b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tR\u001b\u0010\r\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\tR\u0014\u0010 \u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0015\u0010\u001d\u001a\u00020\u00148BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b'\u0010&"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK;", "Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;)V", "", "copydefault", "()Z", "", "getMediationNetwork", "(I)Z", "getRevenue", "getCurrencyIso4217Code", "Landroid/content/Context;", "Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "p1", "AFAdRevenueData", "(Landroid/content/Context;Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;)Z", "", "getMonetizationNetwork", "()J", "Lcom/appsflyer/internal/AFe1cSDK;", "()Lcom/appsflyer/internal/AFe1cSDK;", "(Landroid/content/Context;)I", "", "", "(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;)V", "component1", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFd1nSDK;", "component2", "Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFd1qSDK;", "component4", "Lcom/appsflyer/internal/AFd1qSDK;", "equals", "Lkotlin/Lazy;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFd1tSDK;", "component3", "Lcom/appsflyer/internal/AFd1tSDK;", "AFa1ySDK", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AFf1pSDK extends AFe1eSDK<AFh1pSDK> {

    /* renamed from: areAllFieldsValid, reason: from kotlin metadata */
    private final Lazy component1;

    /* renamed from: component1, reason: from kotlin metadata */
    private final AFh1pSDK getMediationNetwork;

    /* renamed from: component2, reason: from kotlin metadata */
    private final AFd1nSDK getMonetizationNetwork;

    /* renamed from: component3, reason: from kotlin metadata */
    private final AFd1tSDK component2;

    /* renamed from: component4, reason: from kotlin metadata */
    private final AFd1qSDK AFAdRevenueData;

    /* renamed from: equals, reason: from kotlin metadata */
    private final Lazy getRevenue;

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1pSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        AFd1nSDK values = aFd1kSDK.values();
        Intrinsics.checkNotNullExpressionValue(values, "");
        this.getMonetizationNetwork = values;
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.AFAdRevenueData = mediationNetwork;
        AFd1tSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.component2 = e;
        this.getMediationNetwork = new AFh1pSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component1 = LazyKt.lazy(new Function0<Long>() { // from class: com.appsflyer.internal.AFf1pSDK.5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                Long longOrNull;
                String revenue = AFf1pSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((revenue == null || (longOrNull = StringsKt.toLongOrNull(revenue)) == null) ? 1000L : longOrNull.longValue());
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1pSDK.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1pSDK.this.AFAdRevenueData.getRevenue("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private final boolean areAllFieldsValid() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
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

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        AFe1cSDK aFe1cSDK;
        if (this.component2.getMonetizationNetwork()) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1cSDK.FAILURE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(copydefault()), Boolean.FALSE, Boolean.FALSE}).contains(Boolean.TRUE)) {
            aFe1cSDK = AFe1cSDK.SUCCESS;
        } else {
            aFe1cSDK = AFe1cSDK.FAILURE;
        }
        AFd1tSDK aFd1tSDK = this.component2;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFe1nSDK.getRevenue + "ms", false, 4, null);
        aFd1tSDK.getRevenue(aFe1nSDK);
        return aFe1cSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[LOOP:0: B:2:0x0003->B:10:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[EDGE_INSN: B:11:0x004e->B:12:0x004e BREAK  A[LOOP:0: B:2:0x0003->B:10:0x004b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean copydefault() {
        boolean z = false;
        for (int i = 2; i > 0; i--) {
            if (areAllFieldsValid() && getCurrencyIso4217Code(i)) {
                AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else if (getMediationNetwork(i)) {
                AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "GAID fetched using GMS", false, 4, null);
            } else {
                AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Failed to fetch GAID", false, 4, null);
                z = false;
                if (!z) {
                    break;
                }
            }
            z = true;
            if (!z) {
            }
        }
        this.component2.component4 = this.getMediationNetwork;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(int p0) {
        boolean z;
        String obj;
        String str;
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Trying to fetch GAID...", false, 4, null);
        AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
        Context context = this.getMonetizationNetwork.AFAdRevenueData;
        Intrinsics.checkNotNull(context);
        int mediationNetwork = getMediationNetwork(context);
        Context context2 = this.getMonetizationNetwork.AFAdRevenueData;
        Intrinsics.checkNotNull(context2);
        if (!getCurrencyIso4217Code(context2, aFa1vSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.ENABLE_GPS_FALLBACK, true)) {
                Context context3 = this.getMonetizationNetwork.AFAdRevenueData;
                Intrinsics.checkNotNull(context3);
                if (AFAdRevenueData(context3, aFa1vSDK)) {
                    z = true;
                    obj = aFa1vSDK.getGaidError().toString();
                    str = obj;
                    if (str != null && !StringsKt.isBlank(str)) {
                        obj = mediationNetwork + ": " + StringsKt.trim((CharSequence) str).toString();
                    }
                    getMediationNetwork(this.getMediationNetwork, obj);
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            obj = aFa1vSDK.getGaidError().toString();
            str = obj;
            if (str != null) {
                obj = mediationNetwork + ": " + StringsKt.trim((CharSequence) str).toString();
            }
            getMediationNetwork(this.getMediationNetwork, obj);
            if (!z) {
            }
        }
        AFh1pSDK aFh1pSDK = this.getMediationNetwork;
        aFh1pSDK.AFAdRevenueData = aFa1vSDK.getAdvertisingId();
        aFh1pSDK.areAllFieldsValid = aFa1vSDK.isLimitAdTrackingEnabled();
        aFh1pSDK.getMediationNetwork = aFa1vSDK.isLimitAdTrackingEnabled() != null ? Boolean.valueOf(!r2.booleanValue()) : null;
        aFh1pSDK.getCurrencyIso4217Code = Boolean.valueOf(aFa1vSDK.getAdvertisingIdWithGps());
        aFh1pSDK.getMonetizationNetwork = Boolean.FALSE;
        aFh1pSDK.component4 = Boolean.valueOf(p0 != 2);
        return true;
    }

    private static int getMediationNetwork(Context p0) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(p0);
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean AFAdRevenueData(Context p0, AFa1vSDK p1) throws IllegalStateException {
        try {
            AFa1cSDK.AFa1uSDK currencyIso4217Code = AFa1cSDK.getCurrencyIso4217Code(p0);
            p1.setAdvertisingId(currencyIso4217Code.getMonetizationNetwork);
            p1.setLimitAdTrackingEnabled(Boolean.valueOf(currencyIso4217Code.getMediationNetwork()));
            String advertisingId = p1.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p1.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.INSTANCE != null) {
                return true;
            }
            AFf1pSDK aFf1pSDK = this;
            p1.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)".toString());
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Failed to fetch GAID: " + th.getMessage(), th, true, false, false, false, 64, null);
            p1.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, localizedMessage, false, 4, null);
            return false;
        }
    }

    private final boolean getCurrencyIso4217Code(Context p0, AFa1vSDK p1) throws IllegalStateException {
        Unit unit;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p0);
            if (advertisingIdInfo != null) {
                p1.setAdvertisingId(advertisingIdInfo.getId());
                p1.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p1.setAdvertisingIdWithGps(true);
                String advertisingId = p1.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p1.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            AFf1pSDK aFf1pSDK = this;
            p1.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null".toString());
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Google Play Services is missing " + th.getMessage(), th, false, false, false, false, 88, null);
            p1.getGaidError().append(th.getClass().getSimpleName()).append(" |");
            AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    private final boolean getCurrencyIso4217Code(int p0) {
        return getRevenue(p0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dd, code lost:
    
        r0 = r11.getAdvertisingId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00e3, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e9, code lost:
    
        if (r0.length() != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        r0 = r22.getMediationNetwork;
        r0.AFAdRevenueData = r11.getAdvertisingId();
        r0.areAllFieldsValid = java.lang.Boolean.FALSE;
        r0.getMediationNetwork = java.lang.Boolean.TRUE;
        r0.getCurrencyIso4217Code = java.lang.Boolean.FALSE;
        r0.getMonetizationNetwork = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0107, code lost:
    
        if (r23 == 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0109, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        r0.component4 = java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0110, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (r11.getGaidError().length() <= 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getRevenue(int p0) {
        String str;
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        boolean z = false;
        if (component4()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMonetizationNetwork.AFAdRevenueData;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMonetizationNetwork.AFAdRevenueData;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, CollectionsKt.listOf("gaid"), new AFa1uSDK(aFa1vSDK, countDownLatch));
                    countDownLatch.await(((Number) this.component1.getValue()).longValue(), TimeUnit.MILLISECONDS);
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
                        aFa1vSDK.getGaidError().append(th.getClass().getSimpleName()).append(" |");
                    } finally {
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getMediationNetwork(this.getMediationNetwork, aFa1vSDK.getGaidError().toString());
                        }
                    }
                }
            }
        }
        AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1uSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        AFa1uSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFh1uSDK.w$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            this.$fetchGaidData.getGaidError().append(reason).append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFf1pSDK$AFa1vSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class AFa1vSDK {
        private String advertisingId;
        private boolean advertisingIdWithGps;
        private final StringBuilder gaidError;
        private Boolean isLimitAdTrackingEnabled;

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z, StringBuilder sb, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i & 4) != 0) {
                z = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i & 8) != 0) {
                sb = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z, sb);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        /* renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final AFa1vSDK copy(String advertisingId, Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new AFa1vSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) other;
            return Intrinsics.areEqual(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1vSDK.gaidError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            String str = this.advertisingId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode2 + i) * 31) + this.gaidError.hashCode();
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

        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }

        public final StringBuilder getGaidError() {
            return this.gaidError;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return ((Number) this.component1.getValue()).longValue();
    }

    private static void getMediationNetwork(AFh1pSDK aFh1pSDK, String str) {
        String str2;
        if (str == null) {
            return;
        }
        String str3 = aFh1pSDK.getRevenue;
        if (str3 != null && (str2 = str3 + " | " + str) != null) {
            str = str2;
        }
        aFh1pSDK.getRevenue = str;
    }
}
