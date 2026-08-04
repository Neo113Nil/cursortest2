package com.gamericefishpro.space.l4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends com.gamericefishpro.space.vh.c {
    public k0 d;
    public Object e;
    public Object i;
    public m0 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ k0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.y = k0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, this);
    }
}
