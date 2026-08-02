package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0146d2 implements Factory {
    public final N1 a;

    public C0146d2(I1 i1, N1 n1) {
        this.a = n1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0115c6 c0115c6 = (C0115c6) this.a.get();
        c0115c6.getClass();
        return c0115c6;
    }
}
