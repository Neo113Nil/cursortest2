package com.gamericefishpro.space.ti;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends f {
    @Override // com.gamericefishpro.space.ti.e
    public final e e(CoroutineContext coroutineContext, int i, com.gamericefishpro.space.ri.a aVar) {
        return new g(this.v, coroutineContext, i, aVar);
    }

    @Override // com.gamericefishpro.space.ti.e
    public final com.gamericefishpro.space.si.e f() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.ti.f
    public final Object h(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        Object objA = this.v.a(fVar, aVar);
        return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
    }
}
