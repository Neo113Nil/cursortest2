package com.gamericefishpro.space.o1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements com.gamericefishpro.space.c3.c {
    public float A;
    public long B;
    public k0 C;
    public boolean D;
    public long E;
    public com.gamericefishpro.space.c3.c F;
    public com.gamericefishpro.space.c3.l G;
    public n H;
    public int I;
    public o J;
    public int d;
    public float e = 1.0f;
    public float i = 1.0f;
    public float v = 1.0f;
    public float w;
    public long y;
    public long z;

    public h0() {
        long j = x.a;
        this.y = j;
        this.z = j;
        this.A = 8.0f;
        this.B = n0.b;
        this.C = o.b;
        this.E = 9205357640488583168L;
        this.F = com.gamericefishpro.space.u6.f.a();
        this.G = com.gamericefishpro.space.c3.l.d;
        this.I = 3;
    }

    public final void a() {
        i(1.0f);
        k(1.0f);
        d(1.0f);
        l(0.0f);
        long j = x.a;
        e(j);
        p(j);
        if (this.A != 8.0f) {
            this.d |= 2048;
            this.A = 8.0f;
        }
        t(n0.b);
        o(o.b);
        f(false);
        h(null);
        if (this.I != 3) {
            this.d |= 524288;
            this.I = 3;
        }
        this.E = 9205357640488583168L;
        this.J = null;
        this.d = 0;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.F.b();
    }

    public final void d(float f) {
        if (this.v == f) {
            return;
        }
        this.d |= 4;
        this.v = f;
    }

    public final void e(long j) {
        if (s.d(this.y, j)) {
            return;
        }
        this.d |= 64;
        this.y = j;
    }

    public final void f(boolean z) {
        if (this.D != z) {
            this.d |= 16384;
            this.D = z;
        }
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.F.g();
    }

    public final void h(n nVar) {
        if (Intrinsics.a(this.H, nVar)) {
            return;
        }
        this.d |= 131072;
        this.H = nVar;
    }

    public final void i(float f) {
        if (this.e == f) {
            return;
        }
        this.d |= 1;
        this.e = f;
    }

    public final void k(float f) {
        if (this.i == f) {
            return;
        }
        this.d |= 2;
        this.i = f;
    }

    public final void l(float f) {
        if (this.w == f) {
            return;
        }
        this.d |= 32;
        this.w = f;
    }

    public final void o(k0 k0Var) {
        if (Intrinsics.a(this.C, k0Var)) {
            return;
        }
        this.d |= 8192;
        this.C = k0Var;
    }

    public final void p(long j) {
        if (s.d(this.z, j)) {
            return;
        }
        this.d |= 128;
        this.z = j;
    }

    public final void t(long j) {
        if (n0.a(this.B, j)) {
            return;
        }
        this.d |= 4096;
        this.B = j;
    }
}
