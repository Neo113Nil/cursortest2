package com.gamericefishpro.space.l4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.gamericefishpro.space.vh.c {
    public Object d;
    public c0 e;
    public com.gamericefishpro.space.pi.n i;
    public /* synthetic */ Object v;
    public final /* synthetic */ c0 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c0 c0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.w = c0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return c0.b(this.w, null, this);
    }
}
