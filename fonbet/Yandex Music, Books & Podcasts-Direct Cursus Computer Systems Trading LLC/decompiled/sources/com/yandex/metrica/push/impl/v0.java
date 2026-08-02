package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v0 {
    public final String a;
    public final long b;

    public v0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public static Map<String, v0> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                hashMap.put(next, new v0(jSONObject2.has("token") ? jSONObject2.getString("token") : null, jSONObject2.getLong("lastUpdateTime")));
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }
}
