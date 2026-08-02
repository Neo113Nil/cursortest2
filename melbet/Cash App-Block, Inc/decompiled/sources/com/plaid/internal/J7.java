package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class J7 implements Factory {
    public final Provider a;
    public final Provider b;

    public J7(Provider provider, Provider provider2) {
        this.a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I7((C0326x3) this.a.get(), (B6) this.b.get());
    }
}
