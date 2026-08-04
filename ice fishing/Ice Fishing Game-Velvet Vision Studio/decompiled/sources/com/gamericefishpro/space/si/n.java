package com.gamericefishpro.space.si;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.g5.v d;
    public Object e;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.gamericefishpro.space.g5.v v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.gamericefishpro.space.g5.v vVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.v = vVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
