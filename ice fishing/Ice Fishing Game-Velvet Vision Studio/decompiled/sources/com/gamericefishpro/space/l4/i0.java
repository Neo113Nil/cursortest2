package com.gamericefishpro.space.l4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.gamericefishpro.space.vh.c {
    public k0 d;
    public f0 e;
    public boolean i;
    public /* synthetic */ Object v;
    public final /* synthetic */ k0 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.w = k0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
