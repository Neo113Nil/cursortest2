package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {
    public static final com.gamericefishpro.space.r2.z a = new com.gamericefishpro.space.r2.z(10);
    public static final Object b = com.gamericefishpro.space.oh.i.a(com.gamericefishpro.space.oh.j.e, new com.gamericefishpro.space.q0.n(10));

    /* JADX WARN: Type inference failed for: r4v1, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public static final f1 a(l1 l1Var, com.gamericefishpro.space.u6.l lVar, String str, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        e1 e1Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = rVar.f(l1Var);
        Object objP = rVar.P();
        Object obj = com.gamericefishpro.space.t0.n.a;
        if (zF || objP == obj) {
            objP = new f1(l1Var, lVar, str);
            rVar.k0(objP);
        }
        f1 f1Var = (f1) objP;
        boolean zF2 = rVar.f(l1Var) | rVar.h(f1Var);
        Object objP2 = rVar.P();
        if (zF2 || objP2 == obj) {
            objP2 = new com.gamericefishpro.space.d0.q0(28, l1Var, f1Var);
            rVar.k0(objP2);
        }
        com.gamericefishpro.space.t0.i.d(f1Var, (Function1) objP2, rVar);
        if (l1Var.g() && (e1Var = (e1) f1Var.b.getValue()) != null) {
            l1 l1Var2 = f1Var.c;
            e1Var.d.f(e1Var.i.invoke(l1Var2.f().a()), e1Var.i.invoke(l1Var2.f().c()), (u) e1Var.e.invoke(l1Var2.f()));
        }
        return f1Var;
    }
}
