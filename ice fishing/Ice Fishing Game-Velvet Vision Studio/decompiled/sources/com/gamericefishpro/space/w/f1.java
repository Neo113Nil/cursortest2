package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public final com.gamericefishpro.space.u6.l a;
    public final com.gamericefishpro.space.t0.f1 b = com.gamericefishpro.space.t0.i.v(null);
    public final /* synthetic */ l1 c;

    public f1(l1 l1Var, com.gamericefishpro.space.u6.l lVar, String str) {
        this.c = l1Var;
        this.a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e1 a(Function1 function1, Function1 function2) {
        com.gamericefishpro.space.t0.f1 f1Var = this.b;
        e1 e1Var = (e1) f1Var.getValue();
        l1 l1Var = this.c;
        if (e1Var == null) {
            Object objInvoke = function2.invoke(l1Var.a.k());
            Object objInvoke2 = function2.invoke(l1Var.a.k());
            com.gamericefishpro.space.u6.l lVar = this.a;
            o oVar = (o) ((Function1) lVar.d).invoke(objInvoke2);
            oVar.d();
            i1 i1Var = new i1(l1Var, objInvoke, oVar, lVar);
            e1Var = new e1(this, i1Var, function1, function2);
            f1Var.setValue(e1Var);
            l1Var.i.add(i1Var);
        }
        e1Var.i = (com.gamericefishpro.space.ei.l) function2;
        e1Var.e = function1;
        e1Var.b(l1Var.f());
        return e1Var;
    }
}
