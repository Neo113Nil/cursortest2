package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class Q1 implements Factory {
    public final I1 a;
    public final Provider b;

    public Q1(I1 i1, Provider provider) {
        this.a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i1 = this.a;
        L4 l4 = (L4) this.b.get();
        i1.getClass();
        l4.getClass();
        return l4;
    }
}
