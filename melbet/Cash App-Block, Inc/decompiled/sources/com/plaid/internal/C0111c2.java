package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0111c2 implements Factory {
    public final J1 a;

    public C0111c2(I1 i1, J1 j1) {
        this.a = j1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c = (C) this.a.get();
        c.getClass();
        return c;
    }
}
