package com.plaid.internal;

import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Providers;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0342z1 implements Factory {
    public final Provider a;
    public final Provider b;

    public C0342z1(Provider provider, Provider provider2) {
        this.a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0333y1((H5) this.a.get(), DoubleCheck.lazy(Providers.asDaggerProvider(this.b)));
    }
}
