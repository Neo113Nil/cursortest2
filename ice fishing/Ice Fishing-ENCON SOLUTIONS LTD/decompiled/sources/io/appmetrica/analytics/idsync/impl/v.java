package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {
    public static String a(D d2) {
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", d2.f3975a);
        jSONObject.put("url", d2.f3977c);
        jSONObject.put("responseCode", d2.f3979e);
        byte[] bArr = d2.f3980f;
        try {
            encodeToString = new String(bArr, z1.a.f8620a);
        } catch (Throwable unused) {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        Map map = d2.f3981g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
