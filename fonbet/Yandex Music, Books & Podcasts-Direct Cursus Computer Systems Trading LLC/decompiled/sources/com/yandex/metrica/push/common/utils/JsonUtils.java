package com.yandex.metrica.push.common.utils;

import androidx.annotation.NonNull;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class JsonUtils {
    private JsonUtils() {
    }

    public static Boolean extractBooleanSafely(JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Integer extractIntegerSafely(JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long extractLongSafely(JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String extractStringSafely(JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static JSONObject merge(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        try {
            if (jSONObject2 == null) {
                return new JSONObject(jSONObject.toString());
            }
            if (jSONObject == null) {
                return new JSONObject(jSONObject2.toString());
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject optJSONObject = jSONObject3.optJSONObject(next);
                    JSONObject merge = merge(optJSONObject, (JSONObject) opt);
                    if (merge == null) {
                        throw new JSONException(String.format("Failed to marge json %s with %s for key '%s'", next, optJSONObject, opt));
                    }
                    jSONObject3.put(next, merge);
                } else {
                    jSONObject3.put(next, opt);
                }
            }
            return jSONObject3;
        } catch (Throwable th) {
            PublicLogger.e(th, "Failed to merge json %s with %s", jSONObject, jSONObject2);
            return null;
        }
    }

    public static boolean optBoolean(JSONObject jSONObject, @NonNull String str, boolean z) {
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }
}
