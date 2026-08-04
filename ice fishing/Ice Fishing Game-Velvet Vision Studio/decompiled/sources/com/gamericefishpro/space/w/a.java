package com.gamericefishpro.space.w;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.vh.i implements Function1 {
    public final /* synthetic */ Function1 A;
    public j d;
    public com.gamericefishpro.space.ei.w e;
    public int i;
    public final /* synthetic */ b v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ c1 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Object obj, c1 c1Var, long j, Function1 function1, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.v = bVar;
        this.w = obj;
        this.y = c1Var;
        this.z = j;
        this.A = function1;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        return new a(this.v, this.w, this.y, this.z, this.A, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((com.gamericefishpro.space.th.a) obj)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        com.gamericefishpro.space.ei.w wVar;
        c1 c1Var = this.y;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.i;
        b bVar = this.v;
        try {
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                bVar.c.i = (o) ((Function1) bVar.a.d).invoke(this.w);
                bVar.e.setValue(c1Var.c);
                bVar.d.setValue(Boolean.TRUE);
                j jVar2 = bVar.c;
                j jVar3 = new j(jVar2.d, jVar2.e.getValue(), c.h(jVar2.i), jVar2.v, Long.MIN_VALUE, jVar2.y);
                com.gamericefishpro.space.ei.w wVar2 = new com.gamericefishpro.space.ei.w();
                long j = this.z;
                com.gamericefishpro.space.g0.t tVar = new com.gamericefishpro.space.g0.t(bVar, jVar3, this.A, wVar2, 3);
                this.d = jVar3;
                this.e = wVar2;
                this.i = 1;
                if (c.c(jVar3, c1Var, j, tVar, this) == aVar) {
                    return aVar;
                }
                jVar = jVar3;
                wVar = wVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wVar = this.e;
                jVar = this.d;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            f fVar = wVar.d ? f.d : f.e;
            b.a(bVar);
            return new g(jVar, fVar);
        } catch (CancellationException e) {
            b.a(bVar);
            throw e;
        }
    }
}
