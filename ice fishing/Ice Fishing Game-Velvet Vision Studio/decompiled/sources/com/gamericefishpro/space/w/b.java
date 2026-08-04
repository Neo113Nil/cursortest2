package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final com.gamericefishpro.space.u6.l a;
    public final Object b;
    public final j c;
    public final com.gamericefishpro.space.t0.f1 d;
    public final com.gamericefishpro.space.t0.f1 e;
    public final h0 f;
    public final o g;
    public final o h;
    public final o i;
    public final o j;

    public b(Object obj, com.gamericefishpro.space.u6.l lVar, Object obj2) {
        this.a = lVar;
        this.b = obj2;
        j jVar = new j(lVar, obj, null, 60);
        this.c = jVar;
        this.d = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
        this.e = com.gamericefishpro.space.t0.i.v(obj);
        this.f = new h0();
        new v0(1.0f, 1500.0f, obj2);
        o oVar = jVar.i;
        boolean z = oVar instanceof k;
        o oVar2 = z ? c.e : oVar instanceof l ? c.f : oVar instanceof m ? c.g : c.h;
        this.g = oVar2;
        o oVar3 = z ? c.a : oVar instanceof l ? c.b : oVar instanceof m ? c.c : c.d;
        this.h = oVar3;
        this.i = oVar2;
        this.j = oVar3;
    }

    public static final void a(b bVar) {
        j jVar = bVar.c;
        jVar.i.d();
        jVar.v = Long.MIN_VALUE;
        bVar.d.setValue(Boolean.FALSE);
    }

    public static Object b(b bVar, Object obj, i iVar, Function1 function1, com.gamericefishpro.space.vh.i iVar2, int i) {
        Object objInvoke = ((Function1) bVar.a.e).invoke(bVar.c.i);
        Function1 function2 = (i & 8) != 0 ? null : function1;
        Object objC = bVar.c();
        com.gamericefishpro.space.u6.l lVar = bVar.a;
        return h0.a(bVar.f, new a(bVar, objInvoke, new c1(iVar, lVar, objC, obj, (o) ((Function1) lVar.d).invoke(objInvoke)), bVar.c.v, function2, null), iVar2);
    }

    public final Object c() {
        return this.c.e.getValue();
    }
}
