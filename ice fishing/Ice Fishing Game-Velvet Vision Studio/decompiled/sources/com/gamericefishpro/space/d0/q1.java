package com.gamericefishpro.space.d0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v {
    public f0 H;
    public Function2 I;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(final com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        final com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.b.a(this.H != f0.d ? 0 : com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.h(j), this.H == f0.e ? com.gamericefishpro.space.c3.a.i(j) : 0, com.gamericefishpro.space.c3.a.g(j)));
        final int iC = com.gamericefishpro.space.ji.f.c(u0VarE.d, com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.h(j));
        final int iC2 = com.gamericefishpro.space.ji.f.c(u0VarE.e, com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.c3.a.g(j));
        return n0Var.y(iC, iC2, com.gamericefishpro.space.ph.m0.c(), new Function1() { // from class: com.gamericefishpro.space.d0.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function2 function2 = this.d.I;
                com.gamericefishpro.space.f2.u0 u0Var = u0VarE;
                com.gamericefishpro.space.f2.t0.k((com.gamericefishpro.space.f2.t0) obj, u0Var, ((com.gamericefishpro.space.c3.i) function2.invoke(new com.gamericefishpro.space.c3.k((((long) (iC - u0Var.d)) << 32) | (((long) (iC2 - u0Var.e)) & 4294967295L)), n0Var.getLayoutDirection())).a);
                return Unit.a;
            }
        });
    }
}
