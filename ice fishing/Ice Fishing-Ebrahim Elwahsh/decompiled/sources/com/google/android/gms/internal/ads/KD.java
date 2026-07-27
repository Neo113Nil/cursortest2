package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class KD extends JD {

    /* renamed from: A, reason: collision with root package name */
    public final J3.a f25942A;

    public KD(J3.a aVar) {
        aVar.getClass();
        this.f25942A = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f25942A.c(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.f25942A.cancel(z8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, java.util.concurrent.Future
    public final Object get() {
        return this.f25942A.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f25942A.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f25942A.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD
    public final String toString() {
        return this.f25942A.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3354iD, java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f25942A.get(j9, timeUnit);
    }
}
