package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class C0 implements Factory {
    public final Provider a;

    public C0(Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0((InterfaceC0338y6) this.a.get());
    }
}
