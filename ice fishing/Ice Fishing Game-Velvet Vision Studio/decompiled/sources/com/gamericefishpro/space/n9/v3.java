package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 implements com.gamericefishpro.space.w.p1 {
    public long d;
    public long e;
    public final Object i;
    public final Object v;

    public v3(w3 w3Var) {
        this.v = w3Var;
        r1 r1Var = (r1) w3Var.d;
        this.i = new u3(this, r1Var, 0);
        r1Var.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.d = jElapsedRealtime;
        this.e = jElapsedRealtime;
    }

    @Override // com.gamericefishpro.space.w.p1
    public boolean a() {
        return true;
    }

    @Override // com.gamericefishpro.space.w.p1
    public long b(com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return Long.MAX_VALUE;
    }

    public long c(long j) {
        long j2 = this.e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.d;
        long j5 = j3 / j4;
        return (((com.gamericefishpro.space.w.j0) this.v) == com.gamericefishpro.space.w.j0.d || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public com.gamericefishpro.space.w.o d(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? ((com.gamericefishpro.space.w.r1) this.i).f(j4 - j2, oVar, oVar3, oVar2) : oVar2;
    }

    public boolean e(boolean z, boolean z2, long j) {
        w3 w3Var = (w3) this.v;
        w3Var.r();
        w3Var.s();
        r1 r1Var = (r1) w3Var.d;
        boolean zB = r1Var.b();
        v0 v0Var = r1Var.y;
        if (zB) {
            f1 f1Var = r1Var.w;
            r1.j(f1Var);
            d1 d1Var = f1Var.I;
            r1Var.D.getClass();
            d1Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.d;
        if (!z && j2 < 1000) {
            r1.l(v0Var);
            v0Var.G.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.e;
            this.e = j;
        }
        r1.l(v0Var);
        v0Var.G.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !r1Var.v.F();
        e3 e3Var = r1Var.E;
        r1.k(e3Var);
        r4.i0(e3Var.x(z3), bundle, true);
        if (!z2) {
            t2 t2Var = r1Var.F;
            r1.k(t2Var);
            t2Var.y("auto", "_e", bundle);
        }
        this.d = j;
        u3 u3Var = (u3) this.i;
        u3Var.c();
        u3Var.b(((Long) e0.q0.a(null)).longValue());
        return true;
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o f(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.w.r1) this.i).f(c(j), oVar, oVar2, d(j, oVar, oVar3, oVar2));
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o r(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        return ((com.gamericefishpro.space.w.r1) this.i).r(c(j), oVar, oVar2, d(j, oVar, oVar3, oVar2));
    }

    public v3(com.gamericefishpro.space.w.r1 r1Var, com.gamericefishpro.space.w.j0 j0Var, long j) {
        this.i = r1Var;
        this.v = j0Var;
        this.d = ((long) (r1Var.o() + r1Var.m())) * 1000000;
        this.e = j * 1000000;
    }
}
