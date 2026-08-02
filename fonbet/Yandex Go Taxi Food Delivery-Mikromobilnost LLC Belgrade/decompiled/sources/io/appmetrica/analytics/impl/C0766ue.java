package io.appmetrica.analytics.impl;

import defpackage.gw00;
import defpackage.tcc;
import defpackage.uza;
import defpackage.w511;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0766ue {
    public static final Qa a(C0766ue c0766ue, Za za, Map map) {
        int i;
        String jSONObject;
        Object value;
        c0766ue.getClass();
        Qa qa = new Qa();
        switch (za) {
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
                w511.b();
                return null;
        }
        qa.a = i;
        C0795ve.b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                double doubleValue = ((Number) entry.getValue()).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    Pair pair = new Pair(key, value);
                    linkedHashMap.put(pair.c(), pair.f());
                }
            }
            value = entry.getValue();
            Pair pair2 = new Pair(key, value);
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        JSONObject b = Vc.b(linkedHashMap);
        if (b != null && (jSONObject = b.toString()) != null) {
            qa.b = jSONObject.getBytes(uza.a);
        }
        return qa;
    }
}
