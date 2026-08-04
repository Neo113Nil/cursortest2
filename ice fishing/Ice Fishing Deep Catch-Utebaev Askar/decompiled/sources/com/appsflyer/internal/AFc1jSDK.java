package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK implements AFe1jSDK<AFc1pSDK> {
    @Override // com.appsflyer.internal.AFe1jSDK
    public final /* synthetic */ AFc1pSDK getRevenue(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink revenue = null;
        if (str == null || str.length() == 0) {
            return new AFc1pSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            revenue = DeepLink.getRevenue(jSONObjectOptJSONObject);
            revenue.getMediationNetwork.put("is_deferred", true);
        }
        return new AFc1pSDK(zOptBoolean2, revenue);
    }
}
