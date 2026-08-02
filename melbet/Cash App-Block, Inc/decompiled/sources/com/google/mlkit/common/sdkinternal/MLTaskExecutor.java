package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class MLTaskExecutor {
    public static final Object zza = new Object();
    public static MLTaskExecutor zzb;
    public final com.google.android.gms.internal.wallet.zzd zzc;

    public MLTaskExecutor(Looper looper) {
        com.google.android.gms.internal.wallet.zzd zzdVar = new com.google.android.gms.internal.wallet.zzd(looper);
        Looper.getMainLooper();
        this.zzc = zzdVar;
    }

    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    zzb = new MLTaskExecutor(handlerThread.getLooper());
                }
                mLTaskExecutor = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mLTaskExecutor;
    }

    public static zzw scheduleCallable(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzh.zza.execute(new zzb(callable, taskCompletionSource, false, 17));
        return taskCompletionSource.zza;
    }
}
