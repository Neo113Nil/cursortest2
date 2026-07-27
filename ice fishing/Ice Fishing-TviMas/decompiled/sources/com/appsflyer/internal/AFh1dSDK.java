package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFh1dSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final int getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFh1dSDK(String str, int i, int i2, long j) {
        this.getCurrencyIso4217Code = str;
        this.getMediationNetwork = i;
        this.getMonetizationNetwork = i2;
        this.AFAdRevenueData = j;
    }

    public final String getRevenue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getCurrencyIso4217Code);
            jSONObject.put("min", this.getMediationNetwork);
            jSONObject.put("expire", this.getMonetizationNetwork);
            jSONObject.put("ttl", this.AFAdRevenueData);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getMediationNetwork) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.AFAdRevenueData);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) obj;
            if (this.getMediationNetwork == aFh1dSDK.getMediationNetwork && this.getMonetizationNetwork == aFh1dSDK.getMonetizationNetwork && this.AFAdRevenueData == aFh1dSDK.AFAdRevenueData && (str = this.getCurrencyIso4217Code) != null && str.equals(aFh1dSDK.getCurrencyIso4217Code)) {
                return true;
            }
        }
        return false;
    }
}
