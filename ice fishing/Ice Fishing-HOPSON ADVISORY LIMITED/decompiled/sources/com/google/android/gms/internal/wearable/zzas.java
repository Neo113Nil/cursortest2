package com.google.android.gms.internal.wearable;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzas extends AbstractExecutorService implements zzbg {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzbo.zzn(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzbf) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zza */
    public final zzbf submit(Runnable runnable) {
        return (zzbf) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zzb */
    public final zzbf submit(Runnable runnable, Object obj) {
        return (zzbf) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zzc */
    public final zzbf submit(Callable callable) {
        return (zzbf) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzbo(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzbf) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzbf) super.submit(callable);
    }
}
