package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0192i3 implements Factory {
    public final C0147d3 a;
    public final Provider b;

    public C0192i3(C0147d3 c0147d3, Provider provider) {
        this.a = c0147d3;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0147d3 c0147d3 = this.a;
        T3 t3 = (T3) this.b.get();
        c0147d3.getClass();
        t3.getClass();
        return new C0273r4(t3);
    }
}
