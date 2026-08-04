package com.gamericefishpro.space.g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ q d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ o i;
    public final /* synthetic */ com.gamericefishpro.space.c3.l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, Function0 function0, o oVar, com.gamericefishpro.space.c3.l lVar) {
        super(0);
        this.d = qVar;
        this.e = function0;
        this.i = oVar;
        this.v = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.d.h(this.e, this.i, this.v);
        return Unit.a;
    }
}
