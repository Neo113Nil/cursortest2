package com.gamericefishpro.space.ri;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.gamericefishpro.space.vh.c cVar) {
        super(cVar);
        this.e = eVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.i |= Integer.MIN_VALUE;
        Object objC = this.e.C(null, 0, 0L, this);
        return objC == com.gamericefishpro.space.uh.a.d ? objC : new l(objC);
    }
}
