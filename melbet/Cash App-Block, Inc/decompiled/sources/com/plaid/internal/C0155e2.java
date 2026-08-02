package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0155e2 implements Factory {
    public final Z1 a;

    public C0155e2(I1 i1, Z1 z1) {
        this.a = z1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E7 e7 = (E7) this.a.get();
        e7.getClass();
        return e7;
    }
}
