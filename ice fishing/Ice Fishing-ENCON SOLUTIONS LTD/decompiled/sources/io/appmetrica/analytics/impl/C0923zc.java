package io.appmetrica.analytics.impl;

import A1.C0015p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923zc {
    public static final A9 a(C0923zc c0923zc, J9 j9, Map map) {
        int i2;
        Object value;
        c0923zc.getClass();
        A9 a9 = new A9();
        switch (j9) {
            case UNKNOWN:
                i2 = 0;
                break;
            case APPSFLYER:
                i2 = 1;
                break;
            case ADJUST:
                i2 = 2;
                break;
            case KOCHAVA:
                i2 = 3;
                break;
            case TENJIN:
                i2 = 4;
                break;
            case AIRBRIDGE:
                i2 = 5;
                break;
            case SINGULAR:
                i2 = 6;
                break;
            default:
                throw new C0015p();
        }
        a9.f4134a = i2;
        Ac.f4142b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int G = i1.v.G(i1.k.E(entrySet));
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    linkedHashMap.put(key, value);
                }
            }
            value = entry.getValue();
            linkedHashMap.put(key, value);
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            a9.f4135b = jSONObject.getBytes(z1.a.f8620a);
        }
        return a9;
    }
}
