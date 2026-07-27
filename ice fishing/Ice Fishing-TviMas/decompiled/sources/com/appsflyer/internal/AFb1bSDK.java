package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFb1bSDK {
    public static void getCurrencyIso4217Code(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    String string = jSONObject.getString("appsflyerKey");
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < string.length(); i++) {
                        if (i != 0 && i != string.length() - 1) {
                            sb.append("*");
                        }
                        sb.append(string.charAt(i));
                    }
                    jSONObject.put("appsflyerKey", sb.toString());
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger.INSTANCE.i(AFh1vSDK.OTHER, new StringBuilder().append(str).append(jSONObject).toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(AFh1vSDK.OTHER, "Not able to log the payload", e);
            }
        }
    }
}
