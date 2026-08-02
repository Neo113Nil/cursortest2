package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class t implements Runnable {
    public final TaskCompletionSource a;

    public t() {
        this.a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
