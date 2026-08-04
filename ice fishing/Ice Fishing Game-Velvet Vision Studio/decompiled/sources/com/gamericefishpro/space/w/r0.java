package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends com.gamericefishpro.space.vh.c {
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ s0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.i = s0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.v |= Integer.MIN_VALUE;
        return s0.v(this.i, this);
    }
}
