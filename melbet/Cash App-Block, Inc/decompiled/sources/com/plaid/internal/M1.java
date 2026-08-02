package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class M1 implements Factory {
    public final C0272r3 a;

    public M1(I1 i1, C0272r3 c0272r3) {
        this.a = c0272r3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 i8Var = (i8) this.a.get();
        i8Var.getClass();
        return new F(i8Var);
    }
}
