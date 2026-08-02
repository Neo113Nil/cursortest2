package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ya90 {
    public static LinkedHashMap a(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    linkedHashMap.put(next, vng.C((JSONArray) obj, ur51.c));
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            x4c.g("Failed to parse divkit palette", e, str, null, 8);
            return null;
        }
    }
}
