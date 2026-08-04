package com.gamericefishpro.space.s5;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ k0 B;
    public int C;
    public k0 d;
    public m e;
    public String i;
    public String[] v;
    public int w;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.B = k0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return k0.c(this.B, null, 0, this);
    }
}
