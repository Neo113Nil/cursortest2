package com.gamericefishpro.space.e7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.c {
    public Object d;
    public String e;
    public /* synthetic */ Object i;
    public final /* synthetic */ g v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
