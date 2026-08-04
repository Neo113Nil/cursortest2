package com.gamericefishpro.space.pi;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Exception {
    public final Throwable d;

    public g0(Throwable th, t tVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + tVar + " threw an exception, context = " + coroutineContext, th);
        this.d = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.d;
    }
}
