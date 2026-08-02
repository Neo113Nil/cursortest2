package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0237n3 implements Factory {
    public final C0272r3 a;
    public final Provider b;
    public final Provider c;

    public C0237n3(C0147d3 c0147d3, C0272r3 c0272r3, Provider provider, Provider provider2) {
        this.a = c0272r3;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 i8Var = (i8) this.a.get();
        String str = (String) this.b.get();
        I i = (I) this.c.get();
        i8Var.getClass();
        str.getClass();
        i.getClass();
        return new N6(i8Var, str, i);
    }
}
