package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.f2.x0;
import com.gamericefishpro.space.w.e1;
import com.gamericefishpro.space.w.f1;
import com.gamericefishpro.space.w.l1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends o0 {
    public l1 H;
    public k0 I;
    public Function0 J;
    public a0 K;
    public long L;
    public com.gamericefishpro.space.h1.e M;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        if (this.H.a.k() == this.H.d.getValue()) {
            this.M = null;
        } else if (this.M == null) {
            if (this.H.f().b(y.d, y.e)) {
                r0 r0Var = this.I.a;
            } else {
                r0 r0Var2 = this.I.a;
            }
            this.M = com.gamericefishpro.space.h1.b.d;
        }
        if (n0Var.n()) {
            u0 u0VarE = k0Var.e(j);
            long j2 = (((long) u0VarE.d) << 32) | (((long) u0VarE.e) & 4294967295L);
            this.L = j2;
            return n0Var.y((int) (j2 >> 32), (int) (j2 & 4294967295L), com.gamericefishpro.space.ph.m0.c(), new x0(u0VarE, 3));
        }
        if (!((Boolean) this.J.invoke()).booleanValue()) {
            u0 u0VarE2 = k0Var.e(j);
            return n0Var.y(u0VarE2.d, u0VarE2.e, com.gamericefishpro.space.ph.m0.c(), new x0(u0VarE2, 4));
        }
        a0 a0Var = this.K;
        f1 f1Var = a0Var.a;
        f1 f1Var2 = a0Var.b;
        l1 l1Var = a0Var.c;
        j0 j0Var = a0Var.d;
        k0 k0Var2 = a0Var.e;
        f1 f1Var3 = a0Var.f;
        e1 e1VarA = f1Var != null ? f1Var.a(new c0(j0Var, k0Var2, 0), new c0(j0Var, k0Var2, 1)) : null;
        e1 e1VarA2 = f1Var2 != null ? f1Var2.a(new c0(j0Var, k0Var2, 2), new c0(j0Var, k0Var2, 3)) : null;
        if (l1Var.a.k() == y.d) {
            r0 r0Var3 = k0Var2.a;
        } else {
            r0 r0Var4 = k0Var2.a;
        }
        com.gamericefishpro.space.f3.f fVar = new com.gamericefishpro.space.f3.f(e1VarA, e1VarA2, f1Var3 != null ? f1Var3.a(b0.v, new com.gamericefishpro.space.f3.f(null, j0Var, k0Var2, 5)) : null, 4);
        u0 u0VarE3 = k0Var.e(j);
        long j3 = (((long) u0VarE3.d) << 32) | (((long) u0VarE3.e) & 4294967295L);
        long j4 = !com.gamericefishpro.space.c3.k.a(this.L, w.a) ? this.L : j3;
        long jD = com.gamericefishpro.space.c3.b.d(j, j3);
        com.gamericefishpro.space.h1.e eVar = this.M;
        return n0Var.y((int) (jD >> 32), (int) (jD & 4294967295L), com.gamericefishpro.space.ph.m0.c(), new g0(u0VarE3, com.gamericefishpro.space.c3.i.c(eVar != null ? eVar.a(j4, jD, com.gamericefishpro.space.c3.l.d) : 0L, 0L), 0L, fVar));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void s0() {
        this.L = w.a;
    }
}
