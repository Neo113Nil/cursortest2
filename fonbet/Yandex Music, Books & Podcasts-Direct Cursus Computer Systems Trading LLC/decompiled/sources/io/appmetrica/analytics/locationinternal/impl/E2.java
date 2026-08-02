package io.appmetrica.analytics.locationinternal.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class E2 {
    public static C0910s1[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new C0910s1[0];
        }
        int length = jSONArray.length();
        C0910s1[] c0910s1Arr = new C0910s1[length];
        for (int i = 0; i < length; i++) {
            C0910s1 c0910s1 = new C0910s1();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    c0910s1.a = optJSONObject.getString("mac");
                    c0910s1.b = optJSONObject.getInt("signal_strength");
                    c0910s1.c = optJSONObject.getString("ssid");
                    c0910s1.d = optJSONObject.optBoolean("is_connected");
                    c0910s1.e = optJSONObject.optLong("last_visible_offset_seconds");
                } catch (Throwable unused) {
                    c0910s1.a = optJSONObject.optString("mac");
                }
            }
            c0910s1Arr[i] = c0910s1;
        }
        return c0910s1Arr;
    }
}
