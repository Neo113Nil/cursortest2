package com.gamericefishpro.space.f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ g1 d;
    public final /* synthetic */ com.gamericefishpro.space.h1.m e;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g1 g1Var, com.gamericefishpro.space.h1.m mVar, Function2 function2, int i) {
        super(2);
        this.d = g1Var;
        this.e = mVar;
        this.i = function2;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = com.gamericefishpro.space.t0.i.D(this.v | 1);
        x.a(this.d, this.e, this.i, (com.gamericefishpro.space.t0.r) obj, iD);
        return Unit.a;
    }
}
