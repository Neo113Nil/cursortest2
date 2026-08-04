package com.gamericefishpro.space.l4;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends com.gamericefishpro.space.vh.c {
    public final /* synthetic */ c0 A;
    public int B;
    public Object d;
    public Object e;
    public Serializable i;
    public com.gamericefishpro.space.ei.a0 v;
    public boolean w;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.A = c0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return c0.e(this.A, false, this);
    }
}
