package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class JD extends ID {

    /* renamed from: A, reason: collision with root package name */
    public final N3.a f25657A;

    public JD(N3.a aVar) {
        aVar.getClass();
        this.f25657A = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, N3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f25657A.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f25657A.cancel(z3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, java.util.concurrent.Future
    public final Object get() {
        return this.f25657A.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25657A.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25657A.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final String toString() {
        return this.f25657A.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f25657A.get(j6, timeUnit);
    }
}
