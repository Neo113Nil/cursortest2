package com.gamericefishpro.space.t0;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends kotlin.coroutines.a implements com.gamericefishpro.space.pi.v {
    public final /* synthetic */ com.gamericefishpro.space.g1.f e;
    public final /* synthetic */ a2 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public z1(com.gamericefishpro.space.g1.f fVar, a2 a2Var) {
        com.gamericefishpro.space.pi.u uVar = com.gamericefishpro.space.pi.u.d;
        this.e = fVar;
        this.i = a2Var;
        super(uVar);
    }

    @Override // com.gamericefishpro.space.pi.v
    public final void N(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        com.gamericefishpro.space.g1.f fVar = this.e;
        a2 a2Var = this.i;
        com.gamericefishpro.space.wa.b.R(th, new com.gamericefishpro.space.e.e(3, fVar, a2Var));
        CoroutineContext coroutineContext2 = a2Var.e;
        com.gamericefishpro.space.pi.u uVar = com.gamericefishpro.space.pi.u.d;
        com.gamericefishpro.space.pi.v vVar = (com.gamericefishpro.space.pi.v) coroutineContext2.j(uVar);
        if (vVar != null) {
            vVar.N(th, coroutineContext);
            return;
        }
        com.gamericefishpro.space.pi.v vVar2 = (com.gamericefishpro.space.pi.v) a2Var.d.j(uVar);
        if (vVar2 == null) {
            throw th;
        }
        vVar2.N(th, coroutineContext);
    }
}
