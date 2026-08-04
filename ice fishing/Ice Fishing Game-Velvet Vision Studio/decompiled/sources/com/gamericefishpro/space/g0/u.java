package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.y.r0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.vh.c {
    public r0 d;
    public com.gamericefishpro.space.vh.i e;
    public /* synthetic */ Object i;
    public final /* synthetic */ v v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(null, null, this);
    }
}
