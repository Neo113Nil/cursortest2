package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public final class AFf1gSDK implements AFf1fSDK {
    private final AFc1eSDK getMediationNetwork;
    private final AppsFlyerProperties getMonetizationNetwork;
    private final AFg1xSDK getRevenue;

    public AFf1gSDK(AFg1xSDK aFg1xSDK, AFc1eSDK aFc1eSDK, AppsFlyerProperties appsFlyerProperties) {
        aFg1xSDK.getClass();
        aFc1eSDK.getClass();
        appsFlyerProperties.getClass();
        this.getRevenue = aFg1xSDK;
        this.getMediationNetwork = aFc1eSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1fSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        map.getClass();
        aFe1pSDK.getClass();
        AFf1bSDK mediationNetwork = this.getRevenue.getMediationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.getMediationNetwork.component1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Boolean isUserSubjectToGDPR = appsFlyerConsent.isUserSubjectToGDPR();
            if (isUserSubjectToGDPR != null) {
                linkedHashMap2.put("gdpr_applies", isUserSubjectToGDPR);
            }
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            Boolean hasConsentForAdStorage = appsFlyerConsent.getHasConsentForAdStorage();
            if (hasConsentForAdStorage != null) {
                linkedHashMap2.put("ad_storage_enabled", hasConsentForAdStorage);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (mediationNetwork != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(mediationNetwork.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(mediationNetwork.AFAdRevenueData));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(mediationNetwork.getRevenue));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(mediationNetwork.getMediationNetwork));
                linkedHashMap3.put("tcstring", mediationNetwork.getMonetizationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFe1pSDK != AFe1pSDK.CONVERSION || this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(map);
        mediationNetwork2.getClass();
        mediationNetwork2.put("api", MapsKt__MapsJVMKt.mapOf(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
