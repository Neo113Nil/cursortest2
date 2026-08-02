package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class R1 implements Factory {
    public final N1 a;

    public R1(I1 i1, N1 n1) {
        this.a = n1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0115c6 c0115c6 = (C0115c6) this.a.get();
        c0115c6.getClass();
        return c0115c6;
    }
}
