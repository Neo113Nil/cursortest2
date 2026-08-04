package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends com.gamericefishpro.space.vh.c {
    public t d;
    public com.gamericefishpro.space.b0.b e;
    public /* synthetic */ Object i;
    public final /* synthetic */ j1 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j1 j1Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = j1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return j1.E0(this.v, null, this);
    }
}
