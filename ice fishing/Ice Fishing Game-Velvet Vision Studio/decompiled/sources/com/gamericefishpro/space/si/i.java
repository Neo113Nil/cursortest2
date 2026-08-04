package com.gamericefishpro.space.si;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ j i;
    public Object v;
    public f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.i = jVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
