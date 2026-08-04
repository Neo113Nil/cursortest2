package com.gamericefishpro.space.s5;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.gamericefishpro.space.vh.c {
    public int A;
    public m d;
    public String e;
    public String[] i;
    public int v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ k0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.z = k0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return k0.d(this.z, null, 0, this);
    }
}
