package com.gamericefishpro.space.si;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.ti.t d;
    public /* synthetic */ Object e;
    public final /* synthetic */ com.gamericefishpro.space.l4.p i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.gamericefishpro.space.l4.p pVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.i = pVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
