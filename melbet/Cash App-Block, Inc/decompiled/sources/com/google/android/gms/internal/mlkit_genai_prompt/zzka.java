package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzka extends zzjz {
    public final ListenableFuture zza;

    public zzka(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, java.util.concurrent.Future
    public final Object get() {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.zza.get(j, timeUnit);
    }
}
