package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1cSDK extends AFe1eSDK<Void> {
    private final AFd1rSDK areAllFieldsValid;
    private final Throwable component3;
    private final AFe1kSDK<String> component4;

    public AFg1cSDK(AFf1fSDK aFf1fSDK, AFd1rSDK aFd1rSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1fSDK.component1();
        this.component4 = ((AFf1oSDK) aFf1fSDK).component4;
        this.areAllFieldsValid = aFd1rSDK;
    }

    private Map<String, Object> component4() {
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork("attributionId", (String) null);
        if (monetizationNetwork == null) {
            return null;
        }
        try {
            new AFe1rSDK();
            return AFe1rSDK.AFAdRevenueData(monetizationNetwork);
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e2.getMessage());
            AFLogger.afErrorLog(sb.toString(), e2);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.areAllFieldsValid.getMediationNetwork("appsFlyerCount", 0))));
        long mediationNetwork = this.areAllFieldsValid.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.areAllFieldsValid.getRevenue("sixtyDayConversionData", true);
            this.areAllFieldsValid.AFAdRevenueData("attributionId", (String) null);
            this.areAllFieldsValid.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent4 = component4();
        if (mapComponent4 != null) {
            try {
                if (!mapComponent4.containsKey("is_first_launch")) {
                    mapComponent4.put("is_first_launch", Boolean.FALSE);
                }
                AFg1aSDK.AFAdRevenueData(mapComponent4);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e2.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e2);
            }
            return AFe1cSDK.SUCCESS;
        }
        try {
            if (this.component3 != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(this.component3.getMessage());
                AFg1aSDK.getRevenue(sb2.toString());
                return AFe1cSDK.SUCCESS;
            }
            AFe1kSDK<String> aFe1kSDK = this.component4;
            if (aFe1kSDK != null && !aFe1kSDK.isSuccessful()) {
                StringBuilder sb3 = new StringBuilder("Launch status code: ");
                sb3.append(this.component4.getStatusCode());
                AFg1aSDK.getRevenue(sb3.toString());
                return AFe1cSDK.SUCCESS;
            }
            return AFe1cSDK.FAILURE;
        } catch (Exception e3) {
            StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb4.append(e3.getLocalizedMessage());
            AFLogger.afErrorLog(sb4.toString(), e3);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1000L;
    }
}
