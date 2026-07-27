package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFg1aSDK {
    static void AFAdRevenueData(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog(new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n").append(map.toString()).toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    static void getRevenue(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
