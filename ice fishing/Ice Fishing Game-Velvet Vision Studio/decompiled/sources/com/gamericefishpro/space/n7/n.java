package com.gamericefishpro.space.n7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.vh.c {
    public q d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ q v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.i(0, 0, 0, this);
    }
}
