package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class Z1 implements Factory {
    public final I1 a;
    public final Provider b;
    public final Provider c;

    public Z1(I1 i1, Provider provider, Provider provider2) {
        this.a = i1;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i1 = this.a;
        T3 t3 = (T3) this.b.get();
        C0100b1 c0100b1 = (C0100b1) this.c.get();
        i1.getClass();
        t3.getClass();
        c0100b1.getClass();
        return new E7(t3, c0100b1);
    }
}
