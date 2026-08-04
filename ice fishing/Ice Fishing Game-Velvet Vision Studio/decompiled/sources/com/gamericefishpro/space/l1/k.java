package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.f2.k0;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.f2.o0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.f2.x;
import com.gamericefishpro.space.f2.x0;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.h2.n0;
import com.gamericefishpro.space.h2.v;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.h1.l implements v, com.gamericefishpro.space.h2.l {
    public com.gamericefishpro.space.t1.b H;
    public boolean I;
    public com.gamericefishpro.space.h1.e J;
    public o0 K;
    public float L;
    public com.gamericefishpro.space.o1.k M;

    public static boolean B0(long j) {
        return !com.gamericefishpro.space.n1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean C0(long j) {
        return !com.gamericefishpro.space.n1.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean A0() {
        return this.I && this.H.d() != 9205357640488583168L;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int C(n0 n0Var, k0 k0Var, int i) {
        if (!A0()) {
            return k0Var.f(i);
        }
        long jD0 = D0(com.gamericefishpro.space.c3.b.b(i, 0, 13));
        return Math.max(com.gamericefishpro.space.c3.a.i(jD0), k0Var.f(i));
    }

    public final long D0(long j) {
        boolean z = false;
        boolean z2 = com.gamericefishpro.space.c3.a.d(j) && com.gamericefishpro.space.c3.a.c(j);
        if (com.gamericefishpro.space.c3.a.f(j) && com.gamericefishpro.space.c3.a.e(j)) {
            z = true;
        }
        if ((!A0() && z2) || z) {
            return com.gamericefishpro.space.c3.a.a(j, com.gamericefishpro.space.c3.a.h(j), 0, com.gamericefishpro.space.c3.a.g(j), 0, 10);
        }
        long jD = this.H.d();
        int iRound = C0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : com.gamericefishpro.space.c3.a.j(j);
        int iRound2 = B0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : com.gamericefishpro.space.c3.a.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(com.gamericefishpro.space.c3.b.e(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(com.gamericefishpro.space.c3.b.f(iRound, j))) << 32);
        if (A0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!C0(this.H.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.H.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!B0(this.H.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.H.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : x.l(jFloatToRawIntBits2, this.K.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return com.gamericefishpro.space.c3.a.a(j, com.gamericefishpro.space.c3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, com.gamericefishpro.space.c3.b.e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final m0 F(com.gamericefishpro.space.f2.n0 n0Var, k0 k0Var, long j) {
        u0 u0VarE = k0Var.e(D0(j));
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new x0(u0VarE, 2));
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int N(n0 n0Var, k0 k0Var, int i) {
        if (!A0()) {
            return k0Var.L(i);
        }
        long jD0 = D0(com.gamericefishpro.space.c3.b.b(0, i, 7));
        return Math.max(com.gamericefishpro.space.c3.a.j(jD0), k0Var.L(i));
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int Z(n0 n0Var, k0 k0Var, int i) {
        if (!A0()) {
            return k0Var.U(i);
        }
        long jD0 = D0(com.gamericefishpro.space.c3.b.b(i, 0, 13));
        return Math.max(com.gamericefishpro.space.c3.a.i(jD0), k0Var.U(i));
    }

    @Override // com.gamericefishpro.space.h2.l
    public final void f(h0 h0Var) {
        com.gamericefishpro.space.q1.b bVar = h0Var.d;
        long jD = this.H.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (bVar.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(B0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (bVar.c() & 4294967295L)))) & 4294967295L);
        long jL = (Float.intBitsToFloat((int) (bVar.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) == 0.0f) ? 0L : x.l(jFloatToRawIntBits, this.K.a(jFloatToRawIntBits, bVar.c()));
        long jA = this.J.a((((long) Math.round(Float.intBitsToFloat((int) (jL >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jL & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.c() & 4294967295L)))) & 4294967295L), h0Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((com.gamericefishpro.space.m.d) bVar.e.e).B(f, f2);
        try {
            this.H.c(h0Var, jL, this.L, this.M);
            ((com.gamericefishpro.space.m.d) bVar.e.e).B(-f, -f2);
            h0Var.a();
        } catch (Throwable th) {
            ((com.gamericefishpro.space.m.d) bVar.e.e).B(-f, -f2);
            throw th;
        }
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int k0(n0 n0Var, k0 k0Var, int i) {
        if (!A0()) {
            return k0Var.R(i);
        }
        long jD0 = D0(com.gamericefishpro.space.c3.b.b(0, i, 7));
        return Math.max(com.gamericefishpro.space.c3.a.j(jD0), k0Var.R(i));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.H + ", sizeToIntrinsics=" + this.I + ", alignment=" + this.J + ", alpha=" + this.L + ", colorFilter=" + this.M + ')';
    }
}
