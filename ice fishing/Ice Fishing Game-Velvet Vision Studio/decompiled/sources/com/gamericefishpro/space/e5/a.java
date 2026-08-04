package com.gamericefishpro.space.e5;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, x {
    public final CoroutineContext d;

    public a(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.d = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a0.g(this.d, null);
    }

    @Override // com.gamericefishpro.space.pi.x
    public final CoroutineContext l() {
        return this.d;
    }
}
