package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class JD extends ID {

    /* renamed from: A, reason: collision with root package name */
    public final P3.a f26410A;

    public JD(P3.a aVar) {
        aVar.getClass();
        this.f26410A = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, P3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f26410A.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f26410A.cancel(z6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, java.util.concurrent.Future
    public final Object get() {
        return this.f26410A.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26410A.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26410A.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final String toString() {
        return this.f26410A.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f26410A.get(j6, timeUnit);
    }
}
