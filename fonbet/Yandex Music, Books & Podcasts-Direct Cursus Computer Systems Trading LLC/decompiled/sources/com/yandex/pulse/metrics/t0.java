package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum t0 implements hse {
    BIOS_TYPE_UNKNOWN(0),
    BIOS_TYPE_LEGACY(1),
    BIOS_TYPE_UEFI(2);

    public final int a;

    t0(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
