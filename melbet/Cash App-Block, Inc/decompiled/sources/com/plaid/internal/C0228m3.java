package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0228m3 implements Factory {
    public final Provider a;

    public C0228m3(C0147d3 c0147d3, Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N6 n6 = (N6) this.a.get();
        n6.getClass();
        return new H6(n6);
    }
}
