package com.yandex.pulse.metrics;

import defpackage.kse;

/* loaded from: classes5.dex */
public final class x0 implements kse {
    public static final x0 a = new x0();

    @Override // defpackage.kse
    public final boolean a(int i) {
        y0 y0Var;
        switch (i) {
            case 0:
                y0Var = y0.FORM_FACTOR_UNKNOWN;
                break;
            case 1:
                y0Var = y0.FORM_FACTOR_DESKTOP;
                break;
            case 2:
                y0Var = y0.FORM_FACTOR_PHONE;
                break;
            case 3:
                y0Var = y0.FORM_FACTOR_TABLET;
                break;
            case 4:
                y0Var = y0.FORM_FACTOR_TV;
                break;
            case 5:
                y0Var = y0.FORM_FACTOR_MEET_DEVICE;
                break;
            case 6:
                y0Var = y0.FORM_FACTOR_AUTOMOTIVE;
                break;
            case 7:
                y0Var = y0.FORM_FACTOR_FOLDABLE;
                break;
            default:
                y0Var = null;
                break;
        }
        return y0Var != null;
    }
}
