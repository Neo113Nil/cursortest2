package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ com.gamericefishpro.space.p5.a e;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.gamericefishpro.space.p5.a aVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.e = aVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.i |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
