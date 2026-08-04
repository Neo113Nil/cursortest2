package com.gamericefishpro.space.n7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.vh.c {
    public q d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.i = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return q.f(this.i, this);
    }
}
