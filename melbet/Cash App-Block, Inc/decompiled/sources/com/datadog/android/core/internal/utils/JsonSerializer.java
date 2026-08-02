package com.datadog.android.core.internal.utils;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class JsonSerializer {
    public static LinkedHashMap safeMapValuesToJson(LinkedHashMap linkedHashMap, InternalLogger internalLogger) {
        InternalLogger internalLogger2;
        internalLogger.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                linkedHashMap2.put(entry.getKey(), toJsonElement(entry.getValue()));
                internalLogger2 = internalLogger;
            } catch (Exception e) {
                internalLogger2 = internalLogger;
                DBUtil.log$default(internalLogger2, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new JsonSerializer$safeMapValuesToJson$1$1(entry, 0), e, 48);
            }
            internalLogger = internalLogger2;
        }
        return linkedHashMap2;
    }

    public static JsonElement toJsonElement(Object obj) {
        if (Intrinsics.areEqual(obj, MapUtilsKt.NULL_MAP_VALUE)) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            jsonNull.getClass();
            return jsonNull;
        }
        if (obj == null) {
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            jsonNull2.getClass();
            return jsonNull2;
        }
        JsonNull jsonNull3 = JsonNull.INSTANCE;
        if (obj.equals(jsonNull3)) {
            jsonNull3.getClass();
            return jsonNull3;
        }
        if (obj instanceof Boolean) {
            return new JsonPrimitive((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                return new JsonPrimitive((String) obj);
            }
            if (obj instanceof Date) {
                return new JsonPrimitive(Long.valueOf(((Date) obj).getTime()));
            }
            if (obj instanceof JsonArray) {
                return (JsonElement) obj;
            }
            if (obj instanceof Iterable) {
                JsonArray jsonArray = new JsonArray();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    jsonArray.add(toJsonElement(it.next()));
                }
                return jsonArray;
            }
            if (obj instanceof Map) {
                JsonObject jsonObject = new JsonObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jsonObject.add(String.valueOf(entry.getKey()), toJsonElement(entry.getValue()));
                }
                return jsonObject;
            }
            if (!(obj instanceof JsonObject) && !(obj instanceof JsonPrimitive)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JsonObject jsonObject2 = new JsonObject();
                    Iterator<String> keys = jSONObject.keys();
                    keys.getClass();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jsonObject2.add(next, toJsonElement(jSONObject.get(next)));
                    }
                    return jsonObject2;
                }
                if (!(obj instanceof JSONArray)) {
                    return new JsonPrimitive(obj.toString());
                }
                JSONArray jSONArray = (JSONArray) obj;
                JsonArray jsonArray2 = new JsonArray();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    jsonArray2.add(toJsonElement(jSONArray.get(i)));
                }
                return jsonArray2;
            }
            return (JsonElement) obj;
        }
        return new JsonPrimitive((Number) obj);
    }
}
