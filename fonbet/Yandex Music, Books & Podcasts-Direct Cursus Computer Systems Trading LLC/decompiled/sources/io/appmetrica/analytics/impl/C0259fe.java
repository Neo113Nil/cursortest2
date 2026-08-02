package io.appmetrica.analytics.impl;

import defpackage.b6e;
import defpackage.jj4;
import defpackage.tah;
import defpackage.v75;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0259fe {
    public static final Ia a(C0259fe c0259fe, Ra ra, Map map) {
        int i;
        String jSONObject;
        Object value;
        c0259fe.getClass();
        Ia ia = new Ia();
        switch (ra) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                b6e.s();
                return null;
        }
        ia.a = i;
        C0288ge.b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int a = tah.a(v75.o(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Number");
                    return null;
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
        JSONObject b = Fc.b(linkedHashMap);
        if (b != null && (jSONObject = b.toString()) != null) {
            ia.b = jSONObject.getBytes(Charsets.UTF_8);
        }
        return ia;
    }
}
