package com.netcetera.threeds.sdk.infrastructure;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class rl {
    public static String ThreeDS2ServiceInstance(Object obj) {
        return obj instanceof Number ? "Number" : obj instanceof Boolean ? "Boolean" : obj instanceof List ? "Array" : obj instanceof Map ? "Object" : obj instanceof String ? "String" : "unknown";
    }

    public static String get(Map<String, Object> map, String str) {
        return (String) map.get(str);
    }

    public static List<String> getWarnings(Map<String, Object> map, String str) {
        return (List) map.get(str);
    }

    public static String initialize(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("'", str, "' parameter was ");
            m3m.append(ThreeDS2ServiceInstance(obj));
            m3m.append(" type but is required to be a String.");
            throw new ro(m3m.toString());
        }
    }

    public static Long ThreeDS2ServiceInstance(Map<String, ?> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }
}
