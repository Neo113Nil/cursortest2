package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFg1bSDK extends AFf1oSDK<Map<String, Object>> {
    private static final List<String> component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFInAppEventParameterName;
    private final AFd1rSDK copy;
    private Map<String, Object> copydefault;
    private final AFe1qSDK equals;
    private final AFd1qSDK hashCode;
    private final AFh1oSDK toString;

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    public AFg1bSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.equals = aFd1kSDK.getCurrencyIso4217Code();
        this.copy = aFd1kSDK.getRevenue();
        this.toString = aFd1kSDK.component3();
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
        this.getCurrencyIso4217Code.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        Map<String, Object> map = this.copydefault;
        String str = this.AFInAppEventParameterName;
        if (map != null) {
            AFg1aSDK.AFAdRevenueData(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1aSDK.getRevenue(str);
        } else {
            AFg1aSDK.getRevenue("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<Map<String, Object>> getMediationNetwork(String str) {
        String str2;
        String monetizationNetwork = AFb1rSDK.getMonetizationNetwork(this.copy, this.hashCode.component4());
        if (monetizationNetwork != null && !monetizationNetwork.trim().isEmpty()) {
            if (!component3.contains(monetizationNetwork.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(String.valueOf(monetizationNetwork));
                AFe1qSDK aFe1qSDK = this.equals;
                AFe1tSDK<Map<String, Object>> aFe1tSDK = (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK, str2, str}, -465858035, 465858035, System.identityHashCode(aFe1qSDK));
                AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(aFe1tSDK.getRevenue.getMediationNetwork).toString());
                return aFe1tSDK;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", monetizationNetwork));
        }
        str2 = "";
        AFe1qSDK aFe1qSDK2 = this.equals;
        AFe1tSDK<Map<String, Object>> aFe1tSDK2 = (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK2, str2, str}, -465858035, 465858035, System.identityHashCode(aFe1qSDK2));
        AFLogger.afInfoLog(new StringBuilder("[GCD-B01] URL: ").append(aFe1tSDK2.getRevenue.getMediationNetwork).toString());
        return aFe1tSDK2;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() throws Exception {
        AFe1cSDK aFe1cSDK;
        AFe1cSDK aFe1cSDK2;
        if (this.component1.getCurrencyIso4217Code()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.AFInAppEventParameterName = "'isStopTracking' enabled";
            throw new AFf1ySDK();
        }
        AFe1cSDK aFe1cSDK3 = AFe1cSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.toString.hashCode = System.currentTimeMillis();
            try {
                try {
                    try {
                        aFe1cSDK = super.AFAdRevenueData();
                        ResponseNetwork responseNetwork = ((AFf1oSDK) this).component4;
                        if (responseNetwork != null) {
                            int statusCode = responseNetwork.getStatusCode();
                            if (statusCode != 403 && statusCode < 500) {
                                z = false;
                            }
                            if (!responseNetwork.isSuccessful() && statusCode != 404) {
                                if (!z2) {
                                    if (!z) {
                                    }
                                }
                                this.AFInAppEventParameterName = "Error connection to server: ".concat(String.valueOf(statusCode));
                                aFe1cSDK2 = AFe1cSDK.FAILURE;
                                return aFe1cSDK2;
                            }
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.copy.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    AFLogger.afDebugLog(new StringBuilder("[Invite] Detected App-Invite via channel: ").append(map.get(AFInAppEventParameterName.AF_CHANNEL)).toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.copy.AFAdRevenueData("attributionId", new JSONObject(map).toString());
                            if (!this.copy.getMediationNetwork("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.copydefault = map;
                            aFe1cSDK2 = AFe1cSDK.SUCCESS;
                            return aFe1cSDK2;
                        }
                    } catch (Exception e) {
                        AFLogger.afErrorLog(new StringBuilder("[GCD] Error: ").append(e.getMessage()).toString(), e, false, false);
                        aFe1cSDK = AFe1cSDK.FAILURE;
                        if (z2) {
                            this.AFInAppEventParameterName = e.getMessage();
                            throw e;
                        }
                    }
                    aFe1cSDK3 = aFe1cSDK;
                    i++;
                } catch (AFf1wSDK e2) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.AFInAppEventParameterName = "AppsFlyer dev key is missing";
                    throw e2;
                }
            } finally {
                this.toString.getCurrencyIso4217Code(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
            }
        }
        return aFe1cSDK3;
    }
}
