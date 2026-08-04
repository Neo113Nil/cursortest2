package com.gamericefishpro.space.f7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.vh.c {
    public int A;
    public c d;
    public int e;
    public int i;
    public int v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, com.gamericefishpro.space.vh.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(0, 0, 0, 0, this);
    }
}
