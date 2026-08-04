package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends com.gamericefishpro.space.vh.i implements Function2 {
    public int d;
    public final /* synthetic */ j1 e;
    public final /* synthetic */ float i;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, float f, float f2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.e = j1Var;
        this.i = f;
        this.v = f2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new i1(this.e, this.i, this.v, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.d;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            q1 q1Var = this.e.g0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.i)) << 32) | (((long) Float.floatToRawIntBits(this.v)) & 4294967295L);
            this.d = 1;
            if (d1.a(q1Var, jFloatToRawIntBits, this) == aVar) {
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
