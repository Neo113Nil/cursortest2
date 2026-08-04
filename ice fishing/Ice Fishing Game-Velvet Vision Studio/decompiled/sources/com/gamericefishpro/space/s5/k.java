package com.gamericefishpro.space.s5;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ com.gamericefishpro.space.l4.d0 e;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.gamericefishpro.space.l4.d0 d0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.e = d0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.i |= Integer.MIN_VALUE;
        this.e.a(null, this);
        return com.gamericefishpro.space.uh.a.d;
    }
}
