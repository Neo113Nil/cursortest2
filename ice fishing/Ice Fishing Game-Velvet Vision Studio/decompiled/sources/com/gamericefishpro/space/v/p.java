package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.e1;
import com.gamericefishpro.space.w.f1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o0 {
    public f1 H;
    public v0 I;
    public q J;
    public long K;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        long j2;
        u0 u0VarE = k0Var.e(j);
        if (n0Var.n()) {
            j2 = (((long) u0VarE.d) << 32) | (((long) u0VarE.e) & 4294967295L);
        } else {
            f1 f1Var = this.H;
            if (f1Var == null) {
                j2 = (((long) u0VarE.d) << 32) | (((long) u0VarE.e) & 4294967295L);
                this.K = j2;
            } else {
                long j3 = (((long) u0VarE.e) & 4294967295L) | (((long) u0VarE.d) << 32);
                e1 e1VarA = f1Var.a(new o(this, j3, 0), new o(this, j3, 1));
                this.J.getClass();
                j2 = ((com.gamericefishpro.space.c3.k) e1VarA.getValue()).a;
                this.K = ((com.gamericefishpro.space.c3.k) e1VarA.getValue()).a;
            }
        }
        return n0Var.y((int) (j2 >> 32), (int) (4294967295L & j2), com.gamericefishpro.space.ph.m0.c(), new n(this, u0VarE, j2));
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void u0() {
        this.K = h.a;
    }
}
