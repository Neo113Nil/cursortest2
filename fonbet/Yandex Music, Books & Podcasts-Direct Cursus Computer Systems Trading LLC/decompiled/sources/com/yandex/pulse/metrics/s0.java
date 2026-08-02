package com.yandex.pulse.metrics;

import defpackage.kse;

/* loaded from: classes5.dex */
public final class s0 implements kse {
    public static final s0 a = new s0();

    @Override // defpackage.kse
    public final boolean a(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? null : t0.BIOS_TYPE_UEFI : t0.BIOS_TYPE_LEGACY : t0.BIOS_TYPE_UNKNOWN) != null;
    }
}
