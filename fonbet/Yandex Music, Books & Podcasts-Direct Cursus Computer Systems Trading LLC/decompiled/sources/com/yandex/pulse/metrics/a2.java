package com.yandex.pulse.metrics;

import defpackage.kse;

/* loaded from: classes5.dex */
public final class a2 implements kse {
    public static final a2 a = new a2();

    @Override // defpackage.kse
    public final boolean a(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? null : b2.DEGRADATION_AMBIGOUS : b2.DEGRADATION_ON : b2.DEGRADATION_OFF) != null;
    }
}
