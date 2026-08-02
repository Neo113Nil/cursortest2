package com.yandex.pulse.metrics;

import defpackage.kse;

/* loaded from: classes5.dex */
public final class v1 implements kse {
    public static final v1 a = new v1();

    @Override // defpackage.kse
    public final boolean a(int i) {
        w1 w1Var;
        switch (i) {
            case 0:
                w1Var = w1.UNSET;
                break;
            case 1:
                w1Var = w1.OTHER_SESSION_TYPE;
                break;
            case 2:
                w1Var = w1.UNSPECIFIED;
                break;
            case 3:
                w1Var = w1.TTY;
                break;
            case 4:
                w1Var = w1.X11;
                break;
            case 5:
                w1Var = w1.WAYLAND;
                break;
            case 6:
                w1Var = w1.MIR;
                break;
            default:
                w1Var = null;
                break;
        }
        return w1Var != null;
    }
}
