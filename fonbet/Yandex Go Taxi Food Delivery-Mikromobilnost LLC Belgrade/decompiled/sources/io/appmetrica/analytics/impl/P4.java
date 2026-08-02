package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* loaded from: classes9.dex */
public final class P4 extends Ee {
    public final Hh a;

    public P4(Hh hh) {
        this.a = hh;
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final int b() {
        return (int) this.a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final SparseArray<De> c() {
        return new SparseArray<>();
    }
}
