package com.gamericefishpro.space.f2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {
    public int d;
    public int e;
    public long i;
    public long v = w0.a;
    public long w = 0;

    public u0() {
        long j = 0;
        this.i = (j & 4294967295L) | (j << 32);
    }

    public int X() {
        return (int) (this.i & 4294967295L);
    }

    public int Y() {
        return (int) (this.i >> 32);
    }

    public final void Z() {
        this.d = com.gamericefishpro.space.ji.f.c((int) (this.i >> 32), com.gamericefishpro.space.c3.a.j(this.v), com.gamericefishpro.space.c3.a.h(this.v));
        int iC = com.gamericefishpro.space.ji.f.c((int) (this.i & 4294967295L), com.gamericefishpro.space.c3.a.i(this.v), com.gamericefishpro.space.c3.a.g(this.v));
        this.e = iC;
        int i = this.d;
        long j = this.i;
        this.w = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iC - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void a0(long j, float f, Function1 function1);

    public final void c0(long j) {
        if (com.gamericefishpro.space.c3.k.a(this.i, j)) {
            return;
        }
        this.i = j;
        Z();
    }

    public final void d0(long j) {
        if (com.gamericefishpro.space.c3.a.b(this.v, j)) {
            return;
        }
        this.v = j;
        Z();
    }

    public Object i() {
        return null;
    }
}
