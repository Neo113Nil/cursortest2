package com.gamericefishpro.space.n2;

import com.gamericefishpro.space.c3.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.vh.c {
    public Object d;
    public j e;
    public int i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ c y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, com.gamericefishpro.space.vh.c cVar2) {
        super(cVar2);
        this.y = cVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return c.a(this.y, null, null, this);
    }
}
