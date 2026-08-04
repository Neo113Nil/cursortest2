package com.gamericefishpro.space.si;

/* JADX INFO: loaded from: classes.dex */
public final class k extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ l i;
    public l v;
    public f w;
    public com.gamericefishpro.space.ti.t y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        this.i = lVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
