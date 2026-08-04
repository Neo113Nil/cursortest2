package com.gamericefishpro.space.si;

/* JADX INFO: loaded from: classes.dex */
public final class x extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ com.gamericefishpro.space.b0.n i;
    public Object v;
    public f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.gamericefishpro.space.b0.n nVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.i = nVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.i.d(null, this);
    }
}
