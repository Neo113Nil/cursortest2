package com.gamericefishpro.space.si;

import com.gamericefishpro.space.pi.d1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.gamericefishpro.space.vh.c {
    public int A;
    public n0 d;
    public f e;
    public o0 i;
    public d1 v;
    public Object w;
    public /* synthetic */ Object y;
    public final /* synthetic */ n0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.z = n0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        this.z.a(null, this);
        return com.gamericefishpro.space.uh.a.d;
    }
}
