package com.gamericefishpro.space.pi;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends t {
    public static final b2 i = new b2();

    @Override // com.gamericefishpro.space.pi.t
    public final void P(CoroutineContext coroutineContext, Runnable runnable) {
        f2 f2Var = (f2) coroutineContext.j(f2.i);
        if (f2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f2Var.e = true;
    }

    @Override // com.gamericefishpro.space.pi.t
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
