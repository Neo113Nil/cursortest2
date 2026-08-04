package com.gamericefishpro.space.ti;

import com.gamericefishpro.space.pi.a0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    public final com.gamericefishpro.space.vh.i w;

    /* JADX WARN: Multi-variable type inference failed */
    public j(com.gamericefishpro.space.di.c cVar, com.gamericefishpro.space.si.e eVar, CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        super(eVar, coroutineContext, i, aVar);
        this.w = (com.gamericefishpro.space.vh.i) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    @Override // com.gamericefishpro.space.ti.e
    public final e e(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        return new j(this.w, this.v, coroutineContext, i, aVar);
    }

    @Override // com.gamericefishpro.space.ti.f
    public final Object h(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        Object objH = a0.h(new h(this, fVar, null), aVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }
}
