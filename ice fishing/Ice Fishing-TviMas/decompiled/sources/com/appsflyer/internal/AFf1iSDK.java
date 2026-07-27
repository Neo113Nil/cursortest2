package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1sSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
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

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
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
        AFd1tSDK e = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e, "");
        this.equals = e;
        AFc1kSDK d = aFd1kSDK.d();
        Intrinsics.checkNotNullExpressionValue(d, "");
        this.hashCode = d;
        AFh1oSDK component3 = aFd1kSDK.component3();
        Intrinsics.checkNotNullExpressionValue(component3, "");
        this.copydefault = component3;
        AFj1uSDK equals = aFd1kSDK.equals();
        Intrinsics.checkNotNullExpressionValue(equals, "");
        this.toString = equals;
        AFj1sSDK[] currencyIso4217Code = equals.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        ArrayList arrayList = new ArrayList();
        for (AFj1sSDK aFj1sSDK : currencyIso4217Code) {
            AFj1sSDK aFj1sSDK2 = aFj1sSDK;
            if (aFj1sSDK2 != null && aFj1sSDK2.component2 != AFj1sSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFj1sSDK);
            }
        }
        ArrayList<AFj1sSDK> arrayList2 = arrayList;
        this.valueOf = arrayList2.size();
        for (final AFj1sSDK aFj1sSDK3 : arrayList2) {
            AFj1sSDK.AFa1zSDK aFa1zSDK = aFj1sSDK3.component2;
            int i = aFa1zSDK == null ? -1 : AFa1uSDK.getCurrencyIso4217Code[aFa1zSDK.ordinal()];
            if (i == 1) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK3.getMediationNetwork.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1sSDK3, "");
                getMediationNetwork(aFj1sSDK3);
            } else if (i == 2) {
                aFj1sSDK3.addObserver(new Observer() { // from class: com.appsflyer.internal.AFf1iSDK$$ExternalSyntheticLambda0
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1iSDK.getRevenue(AFj1sSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        AFe1cSDK AFAdRevenueData;
        AFe1cSDK aFe1cSDK = AFe1cSDK.FAILURE;
        try {
            AFAdRevenueData = super.AFAdRevenueData();
            Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            AFh1oSDK aFh1oSDK = this.copydefault;
            int i = this.AFKeystoreWrapper;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFh1oSDK.component2[i2] = System.currentTimeMillis();
                if (aFh1oSDK.component1[i2] != 0) {
                    aFh1oSDK.component4[i2] = aFh1oSDK.component2[i2] - aFh1oSDK.component1[i2];
                    aFh1oSDK.getRevenue.put("net", aFh1oSDK.component4);
                    aFh1oSDK.AFAdRevenueData.AFAdRevenueData("ddl", new JSONObject(aFh1oSDK.getRevenue).toString());
                } else {
                    AFLogger.afInfoLog(new StringBuilder("Metrics: ddlStart[").append(i2).append("] ts is missing").toString());
                }
            }
            int i3 = AFa1uSDK.AFAdRevenueData[AFAdRevenueData.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return AFAdRevenueData;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.DDL;
                ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
                AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.copydefault.getRevenue(deepLinkResult, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult);
                return AFAdRevenueData;
            }
            ResponseNetwork responseNetwork2 = ((AFf1oSDK) this).component4;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            AFc1pSDK aFc1pSDK = (AFc1pSDK) body;
            if (aFc1pSDK.getMediationNetwork != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(aFc1pSDK.getMediationNetwork, null);
                this.copydefault.getRevenue(deepLinkResult2, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult2);
                return AFAdRevenueData;
            }
            if (this.AFKeystoreWrapper > 1 || !aFc1pSDK.getGetRevenue() || !copy()) {
                DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                this.copydefault.getRevenue(deepLinkResult3, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult3);
                return AFAdRevenueData;
            }
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Waiting for referrers...", false, 4, null);
            this.AFInAppEventParameterName.await();
            AFh1oSDK aFh1oSDK2 = this.copydefault;
            long currentTimeMillis = System.currentTimeMillis();
            if (aFh1oSDK2.component2[0] != 0) {
                aFh1oSDK2.getRevenue.put("rfr_wait", Long.valueOf(currentTimeMillis - aFh1oSDK2.component2[0]));
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
        } catch (Exception e2) {
            e = e2;
            aFe1cSDK = AFAdRevenueData;
            Throwable cause = e.getCause();
            if (cause instanceof InterruptedException ? true : cause instanceof InterruptedIOException) {
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.hashCode.component3 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.copydefault.getRevenue(deepLinkResult5, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult5);
                return AFe1cSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.copydefault.getRevenue(deepLinkResult6, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult6);
            } else {
                AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                this.copydefault.getRevenue(deepLinkResult7, this.hashCode.component3);
                this.hashCode.getMonetizationNetwork(deepLinkResult7);
            }
            return aFe1cSDK;
        }
    }

    private final void getMediationNetwork(AFj1sSDK aFj1sSDK) {
        if (getMonetizationNetwork(aFj1sSDK)) {
            this.AFInAppEventType.add(aFj1sSDK);
            this.AFInAppEventParameterName.countDown();
            AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Added non-organic " + aFj1sSDK.getClass().getSimpleName(), false, 4, null);
            return;
        }
        int i = this.values + 1;
        this.values = i;
        if (i == this.valueOf) {
            this.AFInAppEventParameterName.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1sSDK aFj1sSDK, AFf1iSDK aFf1iSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, aFj1sSDK.getMediationNetwork.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.checkNotNull(observable, "");
        aFf1iSDK.getMediationNetwork((AFj1sSDK) observable);
    }

    private final boolean copy() {
        Object obj = this.component3.getMonetizationNetwork().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.valueOf && !this.component3.getMonetizationNetwork().containsKey("referrers");
    }

    private static boolean getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        Object obj = aFj1sSDK.getMediationNetwork.get("click_ts");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return this.hashCode.component3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1tSDK<AFc1pSDK> getMediationNetwork(String str) {
        Map map;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper++;
        AFh1uSDK.d$default(AFLogger.INSTANCE, AFh1vSDK.DDL, "Preparing request " + this.AFKeystoreWrapper, false, 4, null);
        Map<String, Object> monetizationNetwork = this.component3.getMonetizationNetwork();
        if (this.AFKeystoreWrapper == 1) {
            monetizationNetwork.put("is_first", Boolean.valueOf(this.copy.getRevenue.getMediationNetwork("appsFlyerCount", 0) == 0));
            monetizationNetwork.put("lang", Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            monetizationNetwork.put("os", Build.VERSION.RELEASE);
            monetizationNetwork.put("type", Build.MODEL);
            AFd1qSDK aFd1qSDK = this.copy;
            monetizationNetwork.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, AFb1iSDK.getCurrencyIso4217Code(aFd1qSDK.getMonetizationNetwork, aFd1qSDK.getRevenue));
            AFc1cSDK aFc1cSDK = this.equals.getMediationNetwork;
            if (aFc1cSDK != null && (strArr = aFc1cSDK.getCurrencyIso4217Code) != null) {
                Intrinsics.checkNotNullExpressionValue(strArr, "");
                monetizationNetwork.put("sharing_filter", strArr);
            }
            AFh1pSDK aFh1pSDK = this.copy.AFAdRevenueData.component4;
            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code(aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.areAllFieldsValid) : null);
            if (currencyIso4217Code != null) {
                monetizationNetwork.put("gaid", currencyIso4217Code);
            }
            Map<String, String> currencyIso4217Code2 = getCurrencyIso4217Code(AFb1vSDK.getCurrencyIso4217Code(this.copy.getMonetizationNetwork.AFAdRevenueData));
            if (currencyIso4217Code2 != null) {
                monetizationNetwork.put("oaid", currencyIso4217Code2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        monetizationNetwork.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        monetizationNetwork.put("request_count", Integer.valueOf(this.AFKeystoreWrapper));
        List<AFj1sSDK> list = this.AFInAppEventType;
        ArrayList arrayList = new ArrayList();
        for (AFj1sSDK aFj1sSDK : list) {
            if (aFj1sSDK.component2 == AFj1sSDK.AFa1zSDK.FINISHED) {
                Object obj = aFj1sSDK.getMediationNetwork.get("referrer");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = aFj1sSDK.getMediationNetwork.get("source");
                    Intrinsics.checkNotNull(obj2, "");
                    map = MapsKt.mapOf(TuplesKt.to("source", (String) obj2), TuplesKt.to(SDKConstants.PARAM_VALUE, str2));
                    if (map == null) {
                        arrayList.add(map);
                    }
                }
            }
            map = null;
            if (map == null) {
            }
        }
        ArrayList arrayList2 = arrayList;
        if (true ^ arrayList2.isEmpty()) {
            monetizationNetwork.put("referrers", arrayList2);
        }
        AFc1qSDK aFc1qSDK = this.component3;
        AFj1jSDK aFj1jSDK = new AFj1jSDK(this.copy, null, 2, null);
        AFg1wSDK aFg1wSDK = this.component1;
        String str3 = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        Object obj3 = this.component3.getMonetizationNetwork().get(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP);
        Intrinsics.checkNotNull(obj3, "");
        aFc1qSDK.getRevenue(aFj1jSDK.getRevenue(str3, (String) obj3));
        AFh1oSDK aFh1oSDK = this.copydefault;
        int i = this.AFKeystoreWrapper;
        if (i <= 0 || i > 2) {
            AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
        } else {
            int i2 = i - 1;
            aFh1oSDK.component1[i2] = System.currentTimeMillis();
            if (i2 == 0) {
                if (aFh1oSDK.areAllFieldsValid != 0) {
                    aFh1oSDK.getRevenue.put("from_fg", Long.valueOf(aFh1oSDK.component1[i2] - aFh1oSDK.areAllFieldsValid));
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

    private static Map<String, String> getCurrencyIso4217Code(AFb1tSDK aFb1tSDK) {
        String str;
        if (aFb1tSDK == null || (str = aFb1tSDK.getRevenue) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1tSDK.AFAdRevenueData;
        if (bool == null || !bool.booleanValue()) {
            return MapsKt.mapOf(TuplesKt.to("type", "unhashed"), TuplesKt.to(SDKConstants.PARAM_VALUE, str));
        }
        return null;
    }

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
}
