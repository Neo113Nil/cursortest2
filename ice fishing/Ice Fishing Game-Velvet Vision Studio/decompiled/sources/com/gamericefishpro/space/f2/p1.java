package com.gamericefishpro.space.f2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {
    public static final com.gamericefishpro.space.t.w a;
    public static final n1[] b;

    static {
        com.gamericefishpro.space.t.w wVar = new com.gamericefishpro.space.t.w(8);
        n1.a.getClass();
        o1 o1Var = m1.g;
        wVar.h(1, o1Var);
        o1 o1Var2 = m1.f;
        wVar.h(2, o1Var2);
        o1 o1Var3 = m1.b;
        wVar.h(4, o1Var3);
        o1 o1Var4 = m1.d;
        wVar.h(8, o1Var4);
        o1 o1Var5 = m1.h;
        wVar.h(16, o1Var5);
        o1 o1Var6 = m1.e;
        wVar.h(32, o1Var6);
        o1 o1Var7 = m1.i;
        wVar.h(64, o1Var7);
        o1 o1Var8 = m1.c;
        wVar.h(128, o1Var8);
        a = wVar;
        b = new n1[]{o1Var, o1Var2, o1Var3, o1Var7, o1Var5, o1Var6, o1Var4, m1.j, o1Var8};
    }

    public static final void a(com.gamericefishpro.space.h2.k0 k0Var, n nVar, long j, int i, int i2) {
        if (x.g(j, -1L)) {
            return;
        }
        k0Var.a(nVar.b(), (int) ((j >>> 48) & 65535));
        k0Var.a(nVar.d(), (int) ((j >>> 32) & 65535));
        k0Var.a(nVar.c(), i - ((int) ((j >>> 16) & 65535)));
        k0Var.a(nVar.a(), i2 - ((int) (j & 65535)));
    }
}
