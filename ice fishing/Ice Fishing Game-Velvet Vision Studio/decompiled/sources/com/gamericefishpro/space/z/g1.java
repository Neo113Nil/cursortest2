package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends com.gamericefishpro.space.vh.i implements Function2 {
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(long j, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = j;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        g1 g1Var = new g1(this.e, aVar);
        g1Var.d = obj;
        return g1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        q1 q1Var = ((o1) this.d).a;
        q1Var.c(q1Var.k, this.e, 1);
        return Unit.a;
    }
}
