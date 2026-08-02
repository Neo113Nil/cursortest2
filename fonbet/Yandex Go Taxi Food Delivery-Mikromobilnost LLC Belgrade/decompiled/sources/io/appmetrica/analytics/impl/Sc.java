package io.appmetrica.analytics.impl;

import defpackage.uza;
import defpackage.w511;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Sc {
    public static final Qa a(Sc sc, Za za, JSONObject jSONObject) {
        int i;
        sc.getClass();
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
        qa.b = jSONObject.toString().getBytes(uza.a);
        return qa;
    }
}
