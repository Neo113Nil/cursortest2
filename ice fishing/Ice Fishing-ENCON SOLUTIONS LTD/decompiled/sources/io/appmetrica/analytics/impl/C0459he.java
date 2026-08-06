package io.appmetrica.analytics.impl;

import A1.C0015p;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459he {
    public static final A9 a(C0459he c0459he, J9 j9, Object obj) {
        int i2;
        c0459he.getClass();
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
        C0485ie.f6189b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        a9.f4135b = jSONObject.toString().getBytes(z1.a.f8620a);
        return a9;
    }
}
