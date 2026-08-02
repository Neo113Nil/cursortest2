package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class X1 implements Factory {
    public final Provider a;
    public final W1 b;

    public X1(I1 i1, Provider provider, W1 w1) {
        this.a = provider;
        this.b = w1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC0312v7 interfaceC0312v7 = (InterfaceC0312v7) this.a.get();
        InterfaceC0178g7 interfaceC0178g7 = (InterfaceC0178g7) this.b.get();
        interfaceC0312v7.getClass();
        interfaceC0178g7.getClass();
        return new C0294t7(interfaceC0312v7, interfaceC0178g7);
    }
}
