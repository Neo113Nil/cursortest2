package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzkv extends zzid implements ScheduledFuture, ListenableFuture, Future {
    public final ScheduledFuture zza;
    public final zzjc zza$1;

    public zzkv(zzjc zzjcVar, ScheduledFuture scheduledFuture) {
        this.zza$1 = zzjcVar;
        this.zza = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza$1.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.zza$1.cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zza$1.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza$1.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza$1.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zza$1.get(j, timeUnit);
    }
}
