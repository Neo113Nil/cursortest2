package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.pi.v0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends v0 {
    public c i;

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        c.j(this.i, runnable, 6);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void Q(CoroutineContext coroutineContext, Runnable runnable) {
        c.j(this.i, runnable, 2);
    }
}
