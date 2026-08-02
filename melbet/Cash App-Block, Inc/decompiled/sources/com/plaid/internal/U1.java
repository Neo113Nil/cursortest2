package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class U1 implements Factory {
    public final C0091a2 a;

    public U1(I1 i1, C0091a2 c0091a2) {
        this.a = c0091a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M7 m7 = (M7) this.a.get();
        m7.getClass();
        return m7;
    }
}
