package com.gamericefishpro.space.g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ o e;
    public final /* synthetic */ com.gamericefishpro.space.b1.h i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function0 function0, o oVar, com.gamericefishpro.space.b1.h hVar, int i, int i2) {
        super(2);
        this.d = function0;
        this.e = oVar;
        this.i = hVar;
        this.v = i;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        com.gamericefishpro.space.d9.h.b(this.d, this.e, this.i, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.v | 1), this.w);
        return Unit.a;
    }
}
