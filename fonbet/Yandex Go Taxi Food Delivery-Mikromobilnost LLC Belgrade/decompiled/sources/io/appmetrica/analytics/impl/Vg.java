package io.appmetrica.analytics.impl;

import defpackage.uza;
import defpackage.w511;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Vg {
    public static final Qa a(Vg vg, Za za, Object obj) {
        int i;
        vg.getClass();
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
        Wg.b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        qa.b = jSONObject.toString().getBytes(uza.a);
        return qa;
    }
}
