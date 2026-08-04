package com.gamericefishpro.space.n2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ g e;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.e = gVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.i |= Integer.MIN_VALUE;
        return this.e.a(0.0f, this);
    }
}
