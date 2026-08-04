package com.gamericefishpro.space.u5;

import com.gamericefishpro.space.s5.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.vh.c {
    public q d;
    public z e;
    public f i;
    public /* synthetic */ Object v;
    public final /* synthetic */ q w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.w = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.e(null, this);
    }
}
