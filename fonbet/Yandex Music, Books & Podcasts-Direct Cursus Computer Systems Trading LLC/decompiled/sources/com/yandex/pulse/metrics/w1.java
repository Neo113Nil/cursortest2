package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum w1 implements hse {
    UNSET(0),
    OTHER_SESSION_TYPE(1),
    UNSPECIFIED(2),
    TTY(3),
    X11(4),
    WAYLAND(5),
    MIR(6);

    public final int a;

    w1(int i2) {
        this.a = i2;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
