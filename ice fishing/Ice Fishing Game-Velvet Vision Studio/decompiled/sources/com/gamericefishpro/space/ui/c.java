package com.gamericefishpro.space.ui;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.pi.x {
    public final CoroutineContext d;

    public c(CoroutineContext coroutineContext) {
        this.d = coroutineContext;
    }

    @Override // com.gamericefishpro.space.pi.x
    public final CoroutineContext l() {
        return this.d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}
