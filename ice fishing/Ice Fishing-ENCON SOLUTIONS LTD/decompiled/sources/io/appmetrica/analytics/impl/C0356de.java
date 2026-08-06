package io.appmetrica.analytics.impl;

import A1.C0015p;

/* renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356de {
    public static final A9 a(C0356de c0356de, J9 j9) {
        int i2;
        c0356de.getClass();
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
        return a9;
    }
}
