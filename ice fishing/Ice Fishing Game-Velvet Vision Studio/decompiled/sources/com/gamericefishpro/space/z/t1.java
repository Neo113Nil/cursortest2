package com.gamericefishpro.space.z;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.oh.d d;
    public Function0 e;
    public float i;
    public /* synthetic */ Object v;
    public final /* synthetic */ u1 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.w = u1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.a(null, null, this);
    }
}
