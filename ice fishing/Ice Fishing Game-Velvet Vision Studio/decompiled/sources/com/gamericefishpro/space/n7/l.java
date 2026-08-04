package com.gamericefishpro.space.n7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.vh.c {
    public final /* synthetic */ q A;
    public int B;
    public q d;
    public int e;
    public int i;
    public int v;
    public int w;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.A = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return q.g(this.A, 0, this);
    }
}
