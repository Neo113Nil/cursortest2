package io.appmetrica.analytics.impl;

import defpackage.b6e;

/* loaded from: classes5.dex */
public final class Ag {
    public static final Ia a(Ag ag, Ra ra) {
        int i;
        ag.getClass();
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
        return ia;
    }
}
