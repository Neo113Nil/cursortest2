package com.gamericefishpro.space.f2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements u {
    public final com.gamericefishpro.space.h2.o0 d;

    public j0(com.gamericefishpro.space.h2.o0 o0Var) {
        this.d = o0Var;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final boolean E() {
        return this.d.H.K0().G;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long F() {
        com.gamericefishpro.space.h2.o0 o0Var = this.d;
        return (((long) o0Var.d) << 32) | (((long) o0Var.e) & 4294967295L);
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long H(long j) {
        return this.d.H.H(com.gamericefishpro.space.n1.b.e(0L, a()));
    }

    public final long a() {
        com.gamericefishpro.space.h2.o0 o0Var = this.d;
        com.gamericefishpro.space.h2.o0 o0VarI = x.i(o0Var);
        return com.gamericefishpro.space.n1.b.d(k(o0VarI.K, 0L), o0Var.H.k(o0VarI.H, 0L));
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long d(long j) {
        return this.d.H.d(com.gamericefishpro.space.n1.b.e(0L, a()));
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long h(long j) {
        return this.d.H.h(com.gamericefishpro.space.n1.b.e(j, a()));
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long k(u uVar, long j) {
        boolean z = uVar instanceof j0;
        com.gamericefishpro.space.h2.o0 o0Var = this.d;
        if (!z) {
            com.gamericefishpro.space.h2.o0 o0VarI = x.i(o0Var);
            com.gamericefishpro.space.h2.f1 f1Var = o0VarI.H;
            long jK = k(o0VarI.K, j);
            long j2 = o0VarI.I;
            long jD = com.gamericefishpro.space.n1.b.d(jK, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!f1Var.K0().G) {
                com.gamericefishpro.space.e2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            f1Var.T0();
            com.gamericefishpro.space.h2.f1 f1Var2 = f1Var.J;
            if (f1Var2 != null) {
                f1Var = f1Var2;
            }
            return com.gamericefishpro.space.n1.b.e(jD, f1Var.k(uVar, 0L));
        }
        com.gamericefishpro.space.h2.o0 o0Var2 = ((j0) uVar).d;
        com.gamericefishpro.space.h2.f1 f1Var3 = o0Var2.H;
        f1Var3.T0();
        com.gamericefishpro.space.h2.o0 o0VarI0 = o0Var.H.G0(f1Var3).I0();
        if (o0VarI0 != null) {
            long jB = com.gamericefishpro.space.c3.i.b(com.gamericefishpro.space.c3.i.c(o0Var2.C0(o0VarI0, false), com.gamericefishpro.space.a.a.D(j)), o0Var.C0(o0VarI0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        com.gamericefishpro.space.h2.o0 o0VarI2 = x.i(o0Var2);
        long jC = com.gamericefishpro.space.c3.i.c(com.gamericefishpro.space.c3.i.c(o0Var2.C0(o0VarI2, false), o0VarI2.I), com.gamericefishpro.space.a.a.D(j));
        com.gamericefishpro.space.h2.o0 o0VarI3 = x.i(o0Var);
        long jB2 = com.gamericefishpro.space.c3.i.b(jC, com.gamericefishpro.space.c3.i.c(o0Var.C0(o0VarI3, false), o0VarI3.I));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        com.gamericefishpro.space.h2.f1 f1Var4 = o0VarI3.H.J;
        Intrinsics.b(f1Var4);
        com.gamericefishpro.space.h2.f1 f1Var5 = o0VarI2.H.J;
        Intrinsics.b(f1Var5);
        return f1Var4.k(f1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // com.gamericefishpro.space.f2.u
    public final u l() {
        com.gamericefishpro.space.h2.o0 o0VarI0;
        if (!E()) {
            com.gamericefishpro.space.e2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        com.gamericefishpro.space.h2.f1 f1Var = this.d.H.H.Z.d.J;
        if (f1Var == null || (o0VarI0 = f1Var.I0()) == null) {
            return null;
        }
        return o0VarI0.K;
    }

    @Override // com.gamericefishpro.space.f2.u
    public final long o(u uVar, long j) {
        return k(uVar, j);
    }

    @Override // com.gamericefishpro.space.f2.u
    public final com.gamericefishpro.space.n1.c z(u uVar, boolean z) {
        return this.d.H.z(uVar, z);
    }
}
