package com.gamericefishpro.space.n4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.vh.c {
    public c d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.gamericefishpro.space.vh.c cVar2) {
        super(cVar2);
        this.i = cVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
