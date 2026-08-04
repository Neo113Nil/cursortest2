package com.gamericefishpro.space.vh;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(com.gamericefishpro.space.th.a aVar) {
        super(aVar);
        if (aVar != null && aVar.getContext() != kotlin.coroutines.g.d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.d;
    }
}
