package com.yandex.pulse.metrics;

import defpackage.hse;

/* loaded from: classes5.dex */
public enum c1 implements hse {
    PURPOSE_UNKNOWN(0),
    PURPOSE_BOOT(1),
    PURPOSE_SWAP(2),
    PURPOSE_BOOT_SWAP(3);

    public final int a;

    c1(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
