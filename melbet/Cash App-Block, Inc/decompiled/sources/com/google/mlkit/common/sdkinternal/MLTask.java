package com.google.mlkit.common.sdkinternal;

import coil3.request.OneShotDisposable;
import com.android.volley.Response;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.vision.common.InputImage;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class MLTask {
    public final Response taskQueue;
    public final AtomicInteger zza;
    public final AtomicBoolean zzb;

    public MLTask() {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = new Response(13);
    }

    public final zzw callAfterLoad(final Executor executor, Callable callable, final com.google.android.gms.tasks.zzb zzbVar) {
        zzae.checkState(this.zza.get() > 0);
        if (((zzw) zzbVar.zza).isComplete()) {
            zzw zzwVar = new zzw();
            zzwVar.zze();
            return zzwVar;
        }
        final OneShotDisposable oneShotDisposable = new OneShotDisposable(25);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource((com.google.android.gms.tasks.zzb) oneShotDisposable.job);
        this.taskQueue.submit(new zzn(this, zzbVar, oneShotDisposable, callable, taskCompletionSource, 0), new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((zzw) zzbVar.zza).isComplete()) {
                        oneShotDisposable.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        });
        return taskCompletionSource.zza;
    }

    public abstract void load();

    public abstract void release();

    public abstract Object run(InputImage inputImage);

    public MLTask(Response response) {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = response;
    }
}
