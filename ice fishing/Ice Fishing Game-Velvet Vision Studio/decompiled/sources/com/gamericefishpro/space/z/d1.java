package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public static final com.gamericefishpro.space.x7.e a = new com.gamericefishpro.space.x7.e(7);
    public static final a1 b = new a1();
    public static final z0 c = new z0();
    public static final b1 d = new b1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(q1 q1Var, long j, com.gamericefishpro.space.vh.c cVar) {
        c1 c1Var;
        com.gamericefishpro.space.ei.x xVar;
        q1 q1Var2;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i = c1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1Var.v = i - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(cVar);
            }
        } else {
            c1Var = new c1(cVar);
        }
        Object obj = c1Var.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = c1Var.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            xVar = new com.gamericefishpro.space.ei.x();
            com.gamericefishpro.space.y.r0 r0Var = com.gamericefishpro.space.y.r0.d;
            com.gamericefishpro.space.y.d dVar = new com.gamericefishpro.space.y.d(q1Var, j, xVar, null, 1);
            c1Var.d = q1Var;
            c1Var.e = xVar;
            c1Var.v = 1;
            if (q1Var.f(r0Var, dVar, c1Var) == aVar) {
                return aVar;
            }
            q1Var2 = q1Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.ei.x xVar2 = c1Var.e;
            q1 q1Var3 = c1Var.d;
            com.gamericefishpro.space.wa.b.P(obj);
            xVar = xVar2;
            q1Var2 = q1Var3;
        }
        return new com.gamericefishpro.space.n1.b(q1Var2.h(xVar.d));
    }
}
