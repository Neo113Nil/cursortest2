package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0210k3 implements Factory {
    public final C0147d3 a;
    public final Provider b;

    public C0210k3(C0147d3 c0147d3, Provider provider) {
        this.a = c0147d3;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0147d3 c0147d3 = this.a;
        I5 i5 = (I5) this.b.get();
        c0147d3.getClass();
        i5.getClass();
        return new I(i5);
    }
}
