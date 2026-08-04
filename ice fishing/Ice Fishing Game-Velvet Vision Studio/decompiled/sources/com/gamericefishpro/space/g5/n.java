package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.i9.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.f5.k d;
    public final /* synthetic */ p e;
    public final /* synthetic */ com.gamericefishpro.space.e1.c i;
    public final /* synthetic */ com.gamericefishpro.space.f1.u v;
    public final /* synthetic */ o w;

    public n(com.gamericefishpro.space.f5.k kVar, p pVar, com.gamericefishpro.space.e1.d dVar, com.gamericefishpro.space.f1.u uVar, o oVar) {
        this.d = kVar;
        this.e = pVar;
        this.i = dVar;
        this.v = uVar;
        this.w = oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rVar.E()) {
            rVar.V();
        } else {
            com.gamericefishpro.space.f5.k kVar = this.d;
            boolean zH = rVar.h(kVar);
            p pVar = this.e;
            boolean zH2 = zH | rVar.h(pVar);
            Object objP = rVar.P();
            if (zH2 || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.a5.b(this.v, kVar, pVar, 2);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.t0.i.d(kVar, (Function1) objP, rVar);
            a4.i(kVar, this.i, com.gamericefishpro.space.b1.n.c(-497631156, new m(0, this.w, kVar), rVar), rVar, 384);
        }
        return Unit.a;
    }
}
