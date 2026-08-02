package io.appmetrica.analytics.impl;

import defpackage.b6e;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Cc {
    public static final Ia a(Cc cc, Ra ra, JSONObject jSONObject) {
        int i;
        cc.getClass();
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
        ia.b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return ia;
    }
}
