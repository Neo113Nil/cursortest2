package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends com.gamericefishpro.space.vh.c {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ com.gamericefishpro.space.b4.f i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.gamericefishpro.space.b4.f fVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.i = fVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.k(0L, 0L, this);
    }
}
