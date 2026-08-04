package com.gamericefishpro.space.v;

import com.gamericefishpro.space.w.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ l1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ com.gamericefishpro.space.h1.m i;
    public final /* synthetic */ j0 v;
    public final /* synthetic */ k0 w;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ com.gamericefishpro.space.b1.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l1 l1Var, Function1 function1, com.gamericefishpro.space.h1.m mVar, j0 j0Var, k0 k0Var, Function2 function2, com.gamericefishpro.space.b1.h hVar, int i) {
        super(2);
        this.d = l1Var;
        this.e = function1;
        this.i = mVar;
        this.v = j0Var;
        this.w = k0Var;
        this.y = function2;
        this.z = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = com.gamericefishpro.space.t0.i.D(12582913);
        t.a(this.d, this.e, this.i, this.v, this.w, this.y, this.z, (com.gamericefishpro.space.t0.r) obj, iD);
        return Unit.a;
    }
}
