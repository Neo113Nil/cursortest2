package com.gamericefishpro.space.l4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.u6.i d;
    public com.gamericefishpro.space.xi.a e;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.gamericefishpro.space.u6.i v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.gamericefishpro.space.u6.i iVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(this);
    }
}
