package com.yandex.pulse.metrics;

import defpackage.kse;

/* loaded from: classes5.dex */
public final class b1 implements kse {
    public static final b1 a = new b1();

    @Override // defpackage.kse
    public final boolean a(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : c1.PURPOSE_BOOT_SWAP : c1.PURPOSE_SWAP : c1.PURPOSE_BOOT : c1.PURPOSE_UNKNOWN) != null;
    }
}
