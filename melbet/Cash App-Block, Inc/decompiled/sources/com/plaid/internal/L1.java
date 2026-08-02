package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class L1 implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final Provider e;
    public final Provider f;
    public final Provider g;
    public final Provider h;
    public final C0 i;

    public L1(I1 i1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, C0 c0) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = c0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G2 g2 = (G2) this.a.get();
        Z2 z2 = (Z2) this.b.get();
        Y2 y2 = (Y2) this.c.get();
        y8 y8Var = (y8) this.d.get();
        C8 c8 = (C8) this.e.get();
        x8 x8Var = (x8) this.f.get();
        B8 b8 = (B8) this.g.get();
        A8 a8 = (A8) this.h.get();
        A0 a0 = (A0) this.i.get();
        g2.getClass();
        z2.getClass();
        y2.getClass();
        y8Var.getClass();
        c8.getClass();
        x8Var.getClass();
        b8.getClass();
        a8.getClass();
        a0.getClass();
        return new C0289t2(g2, z2, y2, y8Var, c8, x8Var, b8, a8, a0);
    }
}
