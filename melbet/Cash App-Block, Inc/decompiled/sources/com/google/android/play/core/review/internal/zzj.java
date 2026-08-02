package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public abstract class zzj implements Runnable {
    public final TaskCompletionSource zza;

    public zzj() {
        this.zza = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            TaskCompletionSource taskCompletionSource = this.zza;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e);
            }
        }
    }

    public abstract void zza();

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
