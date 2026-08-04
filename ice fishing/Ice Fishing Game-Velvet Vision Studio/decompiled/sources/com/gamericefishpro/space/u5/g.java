package com.gamericefishpro.space.u5;

import com.gamericefishpro.space.g5.v;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public int e;
    public com.gamericefishpro.space.si.f i;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.v = vVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
