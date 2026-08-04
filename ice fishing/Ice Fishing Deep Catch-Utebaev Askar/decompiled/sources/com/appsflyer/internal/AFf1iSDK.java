package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1iSDK extends AFf1oSDK<AFc1pSDK> {
    private final CountDownLatch AFInAppEventParameterName;
    private final List<AFj1sSDK> AFInAppEventType;
    private int AFKeystoreWrapper;
    private final AFc1qSDK component3;
    private final AFd1qSDK copy;
    private final AFh1oSDK copydefault;
    private final AFd1tSDK equals;
    private final AFc1kSDK hashCode;
    private final AFj1uSDK toString;
    private int valueOf;
    private int values;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFe1cSDK.values().length];
            try {
                iArr[AFe1cSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1cSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
            int[] iArr2 = new int[AFj1sSDK.AFa1zSDK.values().length];
            try {
                iArr2[AFj1sSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1sSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getCurrencyIso4217Code = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1iSDK(AFc1qSDK aFc1qSDK, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.DLSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.component3 = aFc1qSDK;
        this.AFInAppEventParameterName = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFd1qSDK mediationNetwork = aFd1kSDK.getMediationNetwork();
        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
        this.copy = mediationNetwork;
        AFd1tSDK aFd1tSDKE = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFd1tSDKE, "");
        this.equals = aFd1tSDKE;
        AFc1kSDK aFc1kSDKD = aFd1kSDK.d();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKD, "");
        this.hashCode = aFc1kSDKD;
        AFh1oSDK aFh1oSDKComponent3 = aFd1kSDK.component3();
        Intrinsics.checkNotNullExpressionValue(aFh1oSDKComponent3, "");
        this.copydefault = aFh1oSDKComponent3;
        AFj1uSDK aFj1uSDKEquals = aFd1kSDK.equals();
        Intrinsics.checkNotNullExpressionValue(aFj1uSDKEquals, "");
        this.toString = aFj1uSDKEquals;
        AFj1sSDK[] currencyIso4217Code = aFj1uSDKEquals.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        ArrayList<AFj1sSDK> arrayList = new ArrayList();
        int length = currencyIso4217Code.length;
        for (int i2 = 0; i2 < length; i2++) {
            AFj1sSDK aFj1sSDK = currencyIso4217Code[i2];
            if ((aFj1sSDK == null || aFj1sSDK.component2 == AFj1sSDK.AFa1zSDK.NOT_STARTED) ? false : true) {
                arrayList.add(aFj1sSDK);
            }
        }
        this.valueOf = arrayList.size();
        for (final AFj1sSDK aFj1sSDK2 : arrayList) {
            AFj1sSDK.AFa1zSDK aFa1zSDK = aFj1sSDK2.component2;
            int i3 = aFa1zSDK == null ? -1 : AFa1uSDK.getCurrencyIso4217Code[aFa1zSDK.ordinal()];
            if (i3 == 1) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK2.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1sSDK2, "");
                getMediationNetwork(aFj1sSDK2);
            } else if (i3 == 2) {
                aFj1sSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.n
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1iSDK.getRevenue(aFj1sSDK2, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean copy() {
        Object obj = this.component3.getMonetizationNetwork().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.valueOf && !this.component3.getMonetizationNetwork().containsKey("referrers");
    }

    private static Map<String, String> getCurrencyIso4217Code(AFb1tSDK aFb1tSDK) {
        String str;
        if (aFb1tSDK == null || (str = aFb1tSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1tSDK.AFAdRevenueData;
        if (bool == null || !bool.booleanValue()) {
            return d0.d(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.c(observable, "");
        aFf1iSDK.getMediationNetwork((AFj1sSDK) observable);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        DeepLinkResult deepLinkResult;
        DeepLinkResult deepLinkResult2;
        AFc1kSDK aFc1kSDK;
        AFe1cSDK aFe1cSDK = AFe1cSDK.FAILURE;
        try {
            AFe1cSDK aFe1cSDKAFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(aFe1cSDKAFAdRevenueData, "");
            try {
                AFh1oSDK aFh1oSDK = this.copydefault;
                int i2 = this.AFKeystoreWrapper;
                if (i2 <= 0 || i2 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i2))));
                } else {
                    int i3 = i2 - 1;
                    aFh1oSDK.component2[i3] = System.currentTimeMillis();
                    long j2 = aFh1oSDK.component1[i3];
                    if (j2 != 0) {
                        long[] jArr = aFh1oSDK.component4;
                        jArr[i3] = aFh1oSDK.component2[i3] - j2;
                        aFh1oSDK.getRevenue.put("net", jArr);
                        aFh1oSDK.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK.getRevenue).toString());
                    } else {
                        StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                        sb.append(i3);
                        sb.append("] ts is missing");
                        AFLogger.afInfoLog(sb.toString());
                    }
                }
                int i4 = AFa1uSDK.AFAdRevenueData[aFe1cSDKAFAdRevenueData.ordinal()];
                if (i4 == 1) {
                    ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
                    Intrinsics.b(responseNetwork);
                    Object body = responseNetwork.getBody();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    AFc1pSDK aFc1pSDK = (AFc1pSDK) body;
                    DeepLink deepLink = aFc1pSDK.getCurrencyIso4217Code;
                    if (deepLink != null) {
                        DeepLinkResult deepLinkResult3 = new DeepLinkResult(deepLink, null);
                        this.copydefault.getRevenue(deepLinkResult3, this.hashCode.component3);
                        this.hashCode.getMonetizationNetwork(deepLinkResult3);
                        return aFe1cSDKAFAdRevenueData;
                    }
                    if (this.AFKeystoreWrapper <= 1 && aFc1pSDK.getCurrencyIso4217Code() && copy()) {
                        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Waiting for referrers...", false, 4, null);
                        this.AFInAppEventParameterName.await();
                        AFh1oSDK aFh1oSDK2 = this.copydefault;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j3 = aFh1oSDK2.component2[0];
                        if (j3 != 0) {
                            aFh1oSDK2.getRevenue.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j3));
                            aFh1oSDK2.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK2.getRevenue).toString());
                        } else {
                            AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                        }
                        if (this.values != this.valueOf) {
                            return AFAdRevenueData();
                        }
                        DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                        this.copydefault.getRevenue(deepLinkResult4, this.hashCode.component3);
                        this.hashCode.getMonetizationNetwork(deepLinkResult4);
                        return AFe1cSDK.SUCCESS;
                    }
                    deepLinkResult2 = new DeepLinkResult(null, null);
                    this.copydefault.getRevenue(deepLinkResult2, this.hashCode.component3);
                    aFc1kSDK = this.hashCode;
                } else {
                    if (i4 != 2) {
                        return aFe1cSDKAFAdRevenueData;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK = AFh1vSDK.DDL;
                    ResponseNetwork responseNetwork2 = ((AFf1oSDK) this).component4;
                    AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Error occurred. Server response code = " + (responseNetwork2 != null ? Integer.valueOf(responseNetwork2.getStatusCode()) : null), false, 4, null);
                    deepLinkResult2 = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.copydefault.getRevenue(deepLinkResult2, this.hashCode.component3);
                    aFc1kSDK = this.hashCode;
                }
                aFc1kSDK.getMonetizationNetwork(deepLinkResult2);
                return aFe1cSDKAFAdRevenueData;
            } catch (Exception e2) {
                e = e2;
                aFe1cSDK = aFe1cSDKAFAdRevenueData;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException)) {
                    boolean z = cause instanceof IOException;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1vSDK aFh1vSDK2 = AFh1vSDK.DDL;
                    if (z) {
                        AFh1uSDK.d$default(aFLogger2, aFh1vSDK2, "Http Exception: the request was not sent to the server", false, 4, null);
                        deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                    } else {
                        AFh1uSDK.d$default(aFLogger2, aFh1vSDK2, "Unexpected Exception: " + e, false, 4, null);
                        deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                    }
                    this.copydefault.getRevenue(deepLinkResult, this.hashCode.component3);
                    this.hashCode.getMonetizationNetwork(deepLinkResult);
                    return aFe1cSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.hashCode.component3 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copydefault.getRevenue(deepLinkResult5, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult5);
                return AFe1cSDK.TIMEOUT;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<AFc1pSDK> getMediationNetwork(String str) {
        Map mapD;
        Object obj;
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = this.AFKeystoreWrapper + 1;
        this.AFKeystoreWrapper = i2;
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Preparing request " + i2, false, 4, null);
        Map<String, Object> monetizationNetwork = this.component3.getMonetizationNetwork();
        AFj1bSDK aFj1bSDK = null;
        Object[] objArr = 0;
        if (this.AFKeystoreWrapper == 1) {
            monetizationNetwork.put("is_first", Boolean.valueOf(this.copy.getRevenue.getMediationNetwork("appsFlyerCount", 0) == 0));
            monetizationNetwork.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            monetizationNetwork.put("os", Build.VERSION.RELEASE);
            monetizationNetwork.put("type", Build.MODEL);
            AFd1qSDK aFd1qSDK = this.copy;
            monetizationNetwork.put("request_id", AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue));
            AFc1cSDK aFc1cSDK = this.equals.getMediationNetwork;
            if (aFc1cSDK != null && (obj = aFc1cSDK.getCurrencyIso4217Code) != null) {
                Intrinsics.checkNotNullExpressionValue(obj, "");
                monetizationNetwork.put("sharing_filter", obj);
            }
            AFh1pSDK aFh1pSDK = this.copy.AFAdRevenueData.component4;
            Object currencyIso4217Code = getCurrencyIso4217Code(aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.getMonetizationNetwork, aFh1pSDK.AFAdRevenueData) : null);
            if (currencyIso4217Code != null) {
                monetizationNetwork.put("gaid", currencyIso4217Code);
            }
            Object currencyIso4217Code2 = getCurrencyIso4217Code(AFb1vSDK.getCurrencyIso4217Code(this.copy.getMonetizationNetwork.AFAdRevenueData));
            if (currencyIso4217Code2 != null) {
                monetizationNetwork.put("oaid", currencyIso4217Code2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        monetizationNetwork.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        monetizationNetwork.put("request_count", Integer.valueOf(this.AFKeystoreWrapper));
        List<AFj1sSDK> list = this.AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFj1sSDK aFj1sSDK : list) {
            if (aFj1sSDK.component2 == AFj1sSDK.AFa1zSDK.FINISHED) {
                Object obj2 = aFj1sSDK.getMediationNetwork.get("referrer");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    Object obj3 = aFj1sSDK.getMediationNetwork.get("source");
                    Intrinsics.c(obj3, "");
                    mapD = d0.d(new Pair("source", (String) obj3), new Pair("value", str2));
                } else {
                    mapD = null;
                }
            } else {
                mapD = null;
            }
            if (mapD != null) {
                arrayList.add(mapD);
            }
        }
        if (true ^ arrayList.isEmpty()) {
            monetizationNetwork.put("referrers", arrayList);
        }
        AFc1qSDK aFc1qSDK = this.component3;
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.copy, aFj1bSDK, 2, objArr == true ? 1 : 0);
        AFg1wSDK aFg1wSDK = this.component1;
        String str3 = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        Object obj4 = this.component3.getMonetizationNetwork().get("timestamp");
        Intrinsics.c(obj4, "");
        aFc1qSDK.getRevenue(aFj1jSDK.getRevenue(str3, (String) obj4));
        AFh1oSDK aFh1oSDK = this.copydefault;
        int i3 = this.AFKeystoreWrapper;
        if (i3 <= 0 || i3 > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
        } else {
            int i4 = i3 - 1;
            aFh1oSDK.component1[i4] = System.currentTimeMillis();
            if (i4 == 0) {
                long j2 = aFh1oSDK.areAllFieldsValid;
                if (j2 != 0) {
                    aFh1oSDK.getRevenue.put("from_fg", Long.valueOf(aFh1oSDK.component1[i4] - j2));
                    aFh1oSDK.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK.getRevenue).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
            }
        }
        AFe1tSDK<AFc1pSDK> revenue = ((AFf1oSDK) this).component2.getRevenue(this.component3);
        Intrinsics.checkNotNullExpressionValue(revenue, "");
        return revenue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }

    private static boolean getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        Object obj = aFj1sSDK.getMediationNetwork.get("click_ts");
        Long l2 = obj instanceof Long ? (Long) obj : null;
        if (l2 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l2.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private final void getMediationNetwork(AFj1sSDK aFj1sSDK) {
        if (getMonetizationNetwork(aFj1sSDK)) {
            this.AFInAppEventType.add(aFj1sSDK);
            this.AFInAppEventParameterName.countDown();
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Added non-organic ".concat(aFj1sSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i2 = this.values + 1;
            this.values = i2;
            if (i2 == this.valueOf) {
                this.AFInAppEventParameterName.countDown();
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }
}
