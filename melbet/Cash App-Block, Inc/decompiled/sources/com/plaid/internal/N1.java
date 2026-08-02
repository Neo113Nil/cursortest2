package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class N1 implements Factory {
    public final I1 a;
    public final Provider b;

    public N1(I1 i1, Provider provider) {
        this.a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i1 = this.a;
        T3 t3 = (T3) this.b.get();
        i1.getClass();
        t3.getClass();
        return new C0115c6(t3);
    }
}
