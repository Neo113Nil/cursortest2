package com.gamericefishpro.space.v;

import com.gamericefishpro.space.w.l1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ l1 d;
    public final /* synthetic */ com.gamericefishpro.space.h1.m e;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ com.gamericefishpro.space.h1.e v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ com.gamericefishpro.space.b1.h y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l1 l1Var, com.gamericefishpro.space.h1.m mVar, Function1 function1, com.gamericefishpro.space.h1.e eVar, Function1 function2, com.gamericefishpro.space.b1.h hVar, int i) {
        super(2);
        this.d = l1Var;
        this.e = mVar;
        this.i = function1;
        this.v = eVar;
        this.w = function2;
        this.y = hVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h.a(this.d, this.e, this.i, this.v, this.w, this.y, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.z | 1));
        return Unit.a;
    }
}
