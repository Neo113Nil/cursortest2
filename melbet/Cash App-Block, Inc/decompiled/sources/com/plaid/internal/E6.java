package com.plaid.internal;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class E6 {
    public static HashMap a(String str) {
        String str2;
        if (str != null && (str2 = (String) AbstractC0306v1.b(str).get("pfcfg")) != null) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str2, 8)));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next));
                }
                return hashMap;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
