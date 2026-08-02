package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class S1 implements Factory {
    public final C0192i3 a;

    public S1(I1 i1, C0192i3 c0192i3) {
        this.a = c0192i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0273r4 c0273r4 = (C0273r4) this.a.get();
        c0273r4.getClass();
        return c0273r4;
    }
}
