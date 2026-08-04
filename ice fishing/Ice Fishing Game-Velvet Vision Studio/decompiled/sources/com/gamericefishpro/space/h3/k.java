package com.gamericefishpro.space.h3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.va.b {
    public final WeakReference d;
    public final j e = new j(this);

    public k(i iVar) {
        this.d = new WeakReference(iVar);
    }

    @Override // com.gamericefishpro.space.va.b
    public final void a(Runnable runnable, Executor executor) {
        this.e.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i iVar = (i) this.d.get();
        boolean zCancel = this.e.cancel(z);
        if (zCancel && iVar != null) {
            iVar.a = null;
            iVar.b = null;
            iVar.c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.e.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e.d instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.e.isDone();
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.e.get(j, timeUnit);
    }
}
