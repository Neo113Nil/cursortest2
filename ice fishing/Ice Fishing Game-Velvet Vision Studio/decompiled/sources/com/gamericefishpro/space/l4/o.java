package com.gamericefishpro.space.l4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ com.gamericefishpro.space.c7.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.gamericefishpro.space.c7.d dVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.i = dVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.i.d(null, this);
    }
}
