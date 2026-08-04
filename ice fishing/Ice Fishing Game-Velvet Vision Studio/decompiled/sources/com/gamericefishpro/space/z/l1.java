package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.ei.z d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q1 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(q1 q1Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.i = q1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(0L, this);
    }
}
