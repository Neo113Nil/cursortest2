package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.y.r0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.gamericefishpro.space.vh.c {
    public r0 d;
    public com.gamericefishpro.space.vh.i e;
    public /* synthetic */ Object i;
    public final /* synthetic */ w v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = wVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, null, this);
    }
}
