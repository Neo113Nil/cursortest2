package com.gamericefishpro.space.si;

import com.gamericefishpro.space.pi.d1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.gamericefishpro.space.vh.c {
    public d0 d;
    public f e;
    public f0 i;
    public d1 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ d0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.y = d0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        d0.k(this.y, null, this);
        return com.gamericefishpro.space.uh.a.d;
    }
}
