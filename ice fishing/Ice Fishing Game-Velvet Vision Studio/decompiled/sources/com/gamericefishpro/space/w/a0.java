package com.gamericefishpro.space.w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public /* synthetic */ float d;

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        a0 a0Var = new a0(2, aVar);
        a0Var.d = ((Number) obj).floatValue();
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create(Float.valueOf(((Number) obj).floatValue()), (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        return Boolean.valueOf(this.d > 0.0f);
    }
}
