package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0264q3 implements Factory {
    public final Provider a;

    public C0264q3(C0147d3 c0147d3, Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0100b1 c0100b1 = (C0100b1) this.a.get();
        c0100b1.getClass();
        return new L7(new C0112c3(c0100b1));
    }
}
