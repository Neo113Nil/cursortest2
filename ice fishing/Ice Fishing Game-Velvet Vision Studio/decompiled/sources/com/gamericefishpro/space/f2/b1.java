package com.gamericefishpro.space.f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.h1.m d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.gamericefishpro.space.h1.m mVar, Function2 function2, int i, int i2) {
        super(2);
        this.d = mVar;
        this.e = function2;
        this.i = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = com.gamericefishpro.space.t0.i.D(this.i | 1);
        int i = this.v;
        x.b(this.d, this.e, (com.gamericefishpro.space.t0.r) obj, iD, i);
        return Unit.a;
    }
}
