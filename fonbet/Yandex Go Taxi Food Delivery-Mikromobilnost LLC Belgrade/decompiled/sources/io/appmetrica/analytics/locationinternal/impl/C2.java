package io.appmetrica.analytics.locationinternal.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class C2 {
    public static C0985s1[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new C0985s1[0];
        }
        int length = jSONArray.length();
        C0985s1[] c0985s1Arr = new C0985s1[length];
        for (int i = 0; i < length; i++) {
            C0985s1 c0985s1 = new C0985s1();
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    c0985s1.a = optJSONObject.getString("mac");
                    c0985s1.b = optJSONObject.getInt("signal_strength");
                    c0985s1.c = optJSONObject.getString("ssid");
                    c0985s1.d = optJSONObject.optBoolean("is_connected");
                    c0985s1.e = optJSONObject.optLong("last_visible_offset_seconds");
                } catch (Throwable unused) {
                    c0985s1.a = optJSONObject.optString("mac");
                }
            }
            c0985s1Arr[i] = c0985s1;
        }
        return c0985s1Arr;
    }
}
