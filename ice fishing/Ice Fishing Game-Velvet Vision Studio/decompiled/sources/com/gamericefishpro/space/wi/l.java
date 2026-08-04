package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.pi.t;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends t {
    public static final l i = new l();

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        e.v.i.c(runnable, true, false);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final void Q(CoroutineContext coroutineContext, Runnable runnable) {
        e.v.i.c(runnable, true, true);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final t S(int i2) {
        com.gamericefishpro.space.ui.a.a(i2);
        return i2 >= k.d ? this : super.S(i2);
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
