package com.gamericefishpro.space.w;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends com.gamericefishpro.space.vh.i implements Function1 {
    public int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ s0 v;
    public final /* synthetic */ l1 w;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Object obj, Object obj2, s0 s0Var, l1 l1Var, float f, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.e = obj;
        this.i = obj2;
        this.v = s0Var;
        this.w = l1Var;
        this.y = f;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        return new p0(this.e, this.i, this.v, this.w, this.y, aVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p0) create((com.gamericefishpro.space.th.a) obj)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            o0 o0Var = new o0(this.e, this.i, this.v, this.w, this.y, null);
            this.d = 1;
            if (com.gamericefishpro.space.pi.a0.h(o0Var, this) == aVar) {
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
