package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum y0 implements hse {
    FORM_FACTOR_UNKNOWN(0),
    FORM_FACTOR_DESKTOP(1),
    FORM_FACTOR_PHONE(2),
    FORM_FACTOR_TABLET(3),
    FORM_FACTOR_TV(4),
    FORM_FACTOR_MEET_DEVICE(5),
    FORM_FACTOR_AUTOMOTIVE(6),
    FORM_FACTOR_FOLDABLE(7);

    public final int a;

    y0(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
