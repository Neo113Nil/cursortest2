package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum b2 implements hse {
    DEGRADATION_OFF(0),
    DEGRADATION_ON(1),
    DEGRADATION_AMBIGOUS(2);

    public final int a;

    b2(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
