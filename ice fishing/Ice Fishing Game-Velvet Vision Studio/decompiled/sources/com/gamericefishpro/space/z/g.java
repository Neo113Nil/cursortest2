package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u1 i;
    public final /* synthetic */ i v;
    public final /* synthetic */ c w;
    public final /* synthetic */ long y;
    public final /* synthetic */ com.gamericefishpro.space.pi.d1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u1 u1Var, i iVar, c cVar, long j, com.gamericefishpro.space.pi.d1 d1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = u1Var;
        this.v = iVar;
        this.w = cVar;
        this.y = j;
        this.z = d1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        g gVar = new g(this.i, this.v, this.w, this.y, this.z, aVar);
        gVar.e = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            o1 o1Var = (o1) this.e;
            long j = this.y;
            i iVar = this.v;
            c cVar = this.w;
            float fA0 = i.A0(iVar, cVar, j);
            u1 u1Var = this.i;
            u1Var.e = fA0;
            com.gamericefishpro.space.a5.b bVar = new com.gamericefishpro.space.a5.b(iVar, u1Var, this.z, o1Var);
            com.gamericefishpro.space.b1.b bVar2 = new com.gamericefishpro.space.b1.b(iVar, u1Var, cVar, 6);
            this.d = 1;
            if (u1Var.a(bVar, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Unit.a;
    }
}
