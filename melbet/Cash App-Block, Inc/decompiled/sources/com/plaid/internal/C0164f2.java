package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0164f2 implements Factory {
    public final C0091a2 a;

    public C0164f2(I1 i1, C0091a2 c0091a2) {
        this.a = c0091a2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M7 m7 = (M7) this.a.get();
        m7.getClass();
        return m7;
    }
}
