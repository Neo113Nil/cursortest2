package com.gamericefishpro.space.t0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Iterator, com.gamericefishpro.space.fi.a {
    public final e2 d;
    public final int e;
    public int i;
    public final int v;

    public k0(e2 e2Var, int i, int i2) {
        this.d = e2Var;
        this.e = i2;
        this.i = i;
        this.v = e2Var.A;
        if (e2Var.z) {
            g2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        e2 e2Var = this.d;
        int i = e2Var.A;
        int i2 = this.v;
        if (i != i2) {
            g2.f();
        }
        int i3 = this.i;
        this.i = g2.a(e2Var.d, i3) + i3;
        return new f2(e2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
