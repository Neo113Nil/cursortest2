package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0165f3 implements Factory {
    public final C0272r3 a;
    public final Provider b;
    public final Provider c;
    public final G3 d;
    public final Provider e;
    public final Provider f;
    public final Provider g;

    public C0165f3(C0147d3 c0147d3, C0272r3 c0272r3, Provider provider, Provider provider2, G3 g3, Provider provider3, Provider provider4, Provider provider5) {
        this.a = c0272r3;
        this.b = provider;
        this.c = provider2;
        this.d = g3;
        this.e = provider3;
        this.f = provider4;
        this.g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i8 i8Var = (i8) this.a.get();
        C0326x3 c0326x3 = (C0326x3) this.b.get();
        L4 l4 = (L4) this.c.get();
        F3 f3 = (F3) this.d.get();
        n8 n8Var = (n8) this.e.get();
        y8 y8Var = (y8) this.f.get();
        H6 h6 = (H6) this.g.get();
        i8Var.getClass();
        c0326x3.getClass();
        l4.getClass();
        f3.getClass();
        n8Var.getClass();
        y8Var.getClass();
        h6.getClass();
        return new Y2(i8Var, l4, c0326x3, f3, n8Var, y8Var, h6);
    }
}
