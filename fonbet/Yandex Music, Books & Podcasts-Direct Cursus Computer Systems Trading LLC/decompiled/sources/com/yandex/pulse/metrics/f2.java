package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum f2 implements hse {
    ENERGY_SAVING_OFF(0),
    ENERGY_SAVING_ON(1),
    ENERGY_SAVING_AMBIGOUS(2);

    public final int a;

    f2(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
