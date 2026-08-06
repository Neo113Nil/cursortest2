package io.appmetrica.analytics.impl;

import A1.C0015p;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353db {
    public static final A9 a(C0353db c0353db, J9 j9, JSONObject jSONObject) {
        int i2;
        c0353db.getClass();
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
        a9.f4135b = jSONObject.toString().getBytes(z1.a.f8620a);
        return a9;
    }
}
