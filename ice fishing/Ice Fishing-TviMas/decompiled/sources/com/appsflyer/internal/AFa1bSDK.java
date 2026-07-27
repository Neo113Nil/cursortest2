package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass2;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFa1bSDK implements Runnable {
    private final WeakReference<Context> AFAdRevenueData;
    private final String areAllFieldsValid;
    private final AFd1qSDK component1;
    private final Map<String, String> component3;
    private final String component4;
    final String getCurrencyIso4217Code;
    private final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    AFa1bSDK(Context context, String str, AFd1qSDK aFd1qSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFAdRevenueData = new WeakReference<>(context);
        this.getMediationNetwork = str;
        this.areAllFieldsValid = str2;
        this.getCurrencyIso4217Code = str4;
        this.getRevenue = str5;
        this.getMonetizationNetwork = str6;
        this.component3 = map;
        this.component4 = str3;
        this.component1 = aFd1qSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFAdRevenueData.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.areAllFieldsValid);
            hashMap.put("sig-data", this.getCurrencyIso4217Code);
            hashMap.put("signature", this.component4);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.component3;
            String monetizationNetwork = AFb1rSDK.getRevenue().getMonetizationNetwork().getRevenue().getMonetizationNetwork("referrer", "");
            AFh1aSDK aFh1aSDK = new AFh1aSDK();
            aFh1aSDK.component2 = monetizationNetwork;
            AFh1aSDK aFh1aSDK2 = aFh1aSDK;
            AFb1rSDK revenue = AFb1rSDK.getRevenue();
            Map<String, Object> monetizationNetwork2 = revenue.getMonetizationNetwork(aFh1aSDK);
            monetizationNetwork2.put("price", this.getRevenue);
            monetizationNetwork2.put("currency", this.getMonetizationNetwork);
            monetizationNetwork2.put("receipt_data", hashMap2);
            if (obj != null) {
                monetizationNetwork2.put("extra_prms", obj);
            }
            monetizationNetwork2.putAll(revenue.getMonetizationNetwork().AFKeystoreWrapper().getMediationNetwork());
            aFh1aSDK.getRevenue((Map<String, ?>) monetizationNetwork2);
            aFh1aSDK.getRevenue(new AFj1jSDK(this.component1).getMediationNetwork(aFh1aSDK));
            AFAdRevenueData(context, aFh1aSDK);
            hashMap.put("dev_key", this.getMediationNetwork);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1pSDK aFh1pSDK = AFb1rSDK.getRevenue().getMonetizationNetwork().getMediationNetwork().AFAdRevenueData.component4;
            AFb1tSDK aFb1tSDK = aFh1pSDK != null ? new AFb1tSDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.areAllFieldsValid) : null;
            String str2 = aFb1tSDK != null ? aFb1tSDK.getRevenue : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1bSDK aFh1bSDK = (AFh1bSDK) new AFh1bSDK().getRevenue(hashMap);
            aFh1bSDK.getRevenue(new AFj1jSDK(this.component1).getMediationNetwork(aFh1bSDK));
            final AFf1eSDK AFAdRevenueData = AFAdRevenueData(context, aFh1bSDK);
            aFh1bSDK.getMediationNetwork = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1bSDK.5
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1oSDK) AFAdRevenueData).component4.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        AFa1bSDK.getRevenue(jSONObject.optBoolean("result"), AFa1bSDK.this.getCurrencyIso4217Code, AFa1bSDK.this.getRevenue, AFa1bSDK.this.getMonetizationNetwork, jSONObject.toString());
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                        AFa1bSDK.getRevenue(false, AFa1bSDK.this.getCurrencyIso4217Code, AFa1bSDK.this.getRevenue, AFa1bSDK.this.getMonetizationNetwork, e.getMessage());
                    }
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i, String str3) {
                    ResponseNetwork responseNetwork;
                    if (i == 50 && (responseNetwork = ((AFf1oSDK) AFAdRevenueData).component4) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1bSDK.getRevenue(false, AFa1bSDK.this.getCurrencyIso4217Code, AFa1bSDK.this.getRevenue, AFa1bSDK.this.getMonetizationNetwork, str3);
                }
            };
        } catch (Throwable th) {
            if (AFb1rSDK.getMediationNetwork != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th);
                getRevenue(false, this.getCurrencyIso4217Code, this.getRevenue, this.getMonetizationNetwork, th.getMessage());
            }
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private static AFf1eSDK AFAdRevenueData(Context context, AFh1gSDK aFh1gSDK) {
        AFb1rSDK revenue = AFb1rSDK.getRevenue();
        AFb1rSDK.getCurrencyIso4217Code(new Object[]{revenue, context}, -608775197, 608775214, System.identityHashCode(revenue));
        AFd1kSDK monetizationNetwork = AFb1rSDK.getRevenue().getMonetizationNetwork();
        aFh1gSDK.getMediationNetwork(monetizationNetwork.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0));
        AFf1eSDK aFf1eSDK = new AFf1eSDK(aFh1gSDK, monetizationNetwork);
        AFe1aSDK copy = monetizationNetwork.copy();
        copy.AFAdRevenueData.execute(copy.new AnonymousClass2(aFf1eSDK));
        return aFf1eSDK;
    }

    static void getRevenue(boolean z, String str, String str2, String str3, String str4) {
        if (AFb1rSDK.getMediationNetwork != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1rSDK.getMediationNetwork.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1rSDK.getMediationNetwork;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
