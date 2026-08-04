package com.gamericefishpro.space.u5;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.gamericefishpro.space.vh.c {
    public q d;
    public String e;
    public Function1 i;
    public f v;
    public /* synthetic */ Object w;
    public final /* synthetic */ q y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.y = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(null, null, this);
    }
}
