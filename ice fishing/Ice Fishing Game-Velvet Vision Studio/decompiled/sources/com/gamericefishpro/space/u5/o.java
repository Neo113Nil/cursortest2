package com.gamericefishpro.space.u5;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.vh.c {
    public Object d;
    public Serializable e;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ q w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.w = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.g(null, null, this);
    }
}
