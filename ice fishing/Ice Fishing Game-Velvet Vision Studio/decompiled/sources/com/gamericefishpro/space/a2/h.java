package com.gamericefishpro.space.a2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.c {
    public long d;
    public long e;
    public /* synthetic */ Object i;
    public final /* synthetic */ j v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.k(0L, 0L, this);
    }
}
