package com.gamericefishpro.space.v;

import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.w.g1;
import com.gamericefishpro.space.w.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ l1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ q v;
    public final /* synthetic */ com.gamericefishpro.space.f1.u w;
    public final /* synthetic */ com.gamericefishpro.space.b1.h y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l1 l1Var, Object obj, Function1 function1, q qVar, com.gamericefishpro.space.f1.u uVar, com.gamericefishpro.space.b1.h hVar) {
        super(2);
        this.d = l1Var;
        this.e = obj;
        this.i = function1;
        this.v = qVar;
        this.w = uVar;
        this.y = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = rVar.P();
            Function1 function1 = this.i;
            q qVar = this.v;
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (objP == fVar) {
                objP = (x) function1.invoke(qVar);
                rVar.k0(objP);
            }
            x xVar = (x) objP;
            l1 l1Var = this.d;
            g1 g1VarF = l1Var.f();
            f1 f1Var = l1Var.d;
            Object objC = g1VarF.c();
            Object obj3 = this.e;
            boolean zG = rVar.g(Intrinsics.a(objC, obj3));
            Object objP2 = rVar.P();
            if (zG || objP2 == fVar) {
                objP2 = Intrinsics.a(l1Var.f().c(), obj3) ? k0.b : ((x) function1.invoke(qVar)).b;
                rVar.k0(objP2);
            }
            k0 k0Var = (k0) objP2;
            Object objP3 = rVar.P();
            if (objP3 == fVar) {
                objP3 = new l(Intrinsics.a(obj3, f1Var.getValue()));
                rVar.k0(objP3);
            }
            l lVar = (l) objP3;
            j0 j0Var = xVar.a;
            boolean zH = rVar.h(xVar);
            Object objP4 = rVar.P();
            if (zH || objP4 == fVar) {
                objP4 = new c(xVar);
                rVar.k0(objP4);
            }
            com.gamericefishpro.space.h1.m mVarJ = com.gamericefishpro.space.f2.x.j((com.gamericefishpro.space.di.c) objP4);
            lVar.a.setValue(Boolean.valueOf(Intrinsics.a(obj3, f1Var.getValue())));
            com.gamericefishpro.space.h1.m mVarC = mVarJ.c(lVar);
            boolean zH2 = rVar.h(obj3);
            Object objP5 = rVar.P();
            if (zH2 || objP5 == fVar) {
                objP5 = new com.gamericefishpro.space.b2.d0(29, obj3);
                rVar.k0(objP5);
            }
            Function1 function2 = (Function1) objP5;
            boolean zF = rVar.f(k0Var);
            Object objP6 = rVar.P();
            if (zF || objP6 == fVar) {
                objP6 = new com.gamericefishpro.space.g3.e(6, k0Var);
                rVar.k0(objP6);
            }
            t.a(this.d, function2, mVarC, j0Var, k0Var, (Function2) objP6, com.gamericefishpro.space.b1.n.c(-143346359, new d(this.w, obj3, qVar, this.y), rVar), rVar, 12582912);
        } else {
            rVar.V();
        }
        return Unit.a;
    }
}
