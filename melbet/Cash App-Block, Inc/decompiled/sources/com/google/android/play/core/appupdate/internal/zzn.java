package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public abstract class zzn implements Runnable {
    public final TaskCompletionSource zza;

    public zzn() {
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

    public zzn(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
