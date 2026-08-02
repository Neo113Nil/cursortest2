package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class P1 implements Factory {
    public final J1 a;

    public P1(I1 i1, J1 j1) {
        this.a = j1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c = (C) this.a.get();
        c.getClass();
        return c;
    }
}
