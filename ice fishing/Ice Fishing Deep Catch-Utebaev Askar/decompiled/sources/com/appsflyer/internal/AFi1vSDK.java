package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    public final AFi1zSDK getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;
    public final AFh1cSDK getRevenue;

    public AFi1vSDK(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getMediationNetwork = string;
            this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
            this.AFAdRevenueData = str;
            this.getCurrencyIso4217Code = string.startsWith("default") ? AFi1zSDK.DEFAULT : AFi1zSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getRevenue = jSONObjectOptJSONObject != null ? new AFh1cSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e2) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e2);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1vSDK.class != obj.getClass()) {
            return false;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) obj;
        if (this.getMonetizationNetwork == aFi1vSDK.getMonetizationNetwork && this.getMediationNetwork.equals(aFi1vSDK.getMediationNetwork)) {
            return this.AFAdRevenueData.equals(aFi1vSDK.AFAdRevenueData);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.AFAdRevenueData.hashCode() + ((this.getMediationNetwork.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFh1cSDK aFh1cSDK = this.getRevenue;
        return aFh1cSDK != null ? (iHashCode * 31) + aFh1cSDK.hashCode() : iHashCode;
    }
}
