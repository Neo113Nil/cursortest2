package com.gamericefishpro.space.l6;

import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.pi.f1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.va.b {
    public final com.gamericefishpro.space.w6.j d;

    public k(f1 job) {
        com.gamericefishpro.space.w6.j underlying = new com.gamericefishpro.space.w6.j();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.d = underlying;
        job.n(new d0(16, this));
    }

    @Override // com.gamericefishpro.space.va.b
    public final void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.d.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d.d instanceof com.gamericefishpro.space.w6.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.d.get(j, timeUnit);
    }
}
