package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class AFg1cSDK extends AFe1eSDK<Void> {
    private final AFd1rSDK areAllFieldsValid;
    private final Throwable component3;
    private final AFe1kSDK<String> component4;

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1000L;
    }

    public AFg1cSDK(AFf1fSDK aFf1fSDK, AFd1rSDK aFd1rSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1fSDK.component1();
        this.component4 = ((AFf1oSDK) aFf1fSDK).component4;
        this.areAllFieldsValid = aFd1rSDK;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.areAllFieldsValid.getMediationNetwork("appsFlyerCount", 0))));
        long mediationNetwork = this.areAllFieldsValid.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.areAllFieldsValid.getRevenue("sixtyDayConversionData", true);
            this.areAllFieldsValid.AFAdRevenueData("attributionId", (String) null);
            this.areAllFieldsValid.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> component4 = component4();
        if (component4 != null) {
            try {
                if (!component4.containsKey("is_first_launch")) {
                    component4.put("is_first_launch", Boolean.FALSE);
                }
                AFg1aSDK.AFAdRevenueData(component4);
            } catch (Exception e) {
                AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e.getLocalizedMessage()).toString(), e);
            }
            return AFe1cSDK.SUCCESS;
        }
        try {
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Error executing conversion data callback: ").append(e2.getLocalizedMessage()).toString(), e2);
        }
        if (this.component3 != null) {
            AFg1aSDK.getRevenue(new StringBuilder("Launch exception: ").append(this.component3.getMessage()).toString());
            return AFe1cSDK.SUCCESS;
        }
        AFe1kSDK<String> aFe1kSDK = this.component4;
        if (aFe1kSDK != null && !aFe1kSDK.isSuccessful()) {
            AFg1aSDK.getRevenue(new StringBuilder("Launch status code: ").append(this.component4.getStatusCode()).toString());
            return AFe1cSDK.SUCCESS;
        }
        return AFe1cSDK.FAILURE;
    }

    private Map<String, Object> component4() {
        String monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork("attributionId", (String) null);
        if (monetizationNetwork == null) {
            return null;
        }
        try {
            new AFe1rSDK();
            return AFe1rSDK.AFAdRevenueData(monetizationNetwork);
        } catch (JSONException e) {
            AFLogger.afErrorLog(new StringBuilder("[GCD] Failed to parse GCD response: ").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
