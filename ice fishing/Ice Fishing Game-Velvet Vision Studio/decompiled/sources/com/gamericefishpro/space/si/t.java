package com.gamericefishpro.space.si;

/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.vh.c {
    public com.gamericefishpro.space.b0.n d;
    public /* synthetic */ Object e;
    public int i;
    public final /* synthetic */ com.gamericefishpro.space.b0.n v;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.gamericefishpro.space.b0.n nVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.v = nVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.v.d(null, this);
    }
}
