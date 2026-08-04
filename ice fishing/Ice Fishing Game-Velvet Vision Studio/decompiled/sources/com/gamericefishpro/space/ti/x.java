package com.gamericefishpro.space.ti;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements com.gamericefishpro.space.th.a, com.gamericefishpro.space.vh.d {
    public final com.gamericefishpro.space.th.a d;
    public final CoroutineContext e;

    public x(com.gamericefishpro.space.th.a aVar, CoroutineContext coroutineContext) {
        this.d = aVar;
        this.e = coroutineContext;
    }

    @Override // com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        com.gamericefishpro.space.th.a aVar = this.d;
        if (aVar instanceof com.gamericefishpro.space.vh.d) {
            return (com.gamericefishpro.space.vh.d) aVar;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        this.d.resumeWith(obj);
    }
}
