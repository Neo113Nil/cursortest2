package com.gamericefishpro.space.v5;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.vh.c {
    public d d;
    public com.gamericefishpro.space.d6.b e;
    public /* synthetic */ Object i;
    public final /* synthetic */ d v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, null, this);
    }
}
