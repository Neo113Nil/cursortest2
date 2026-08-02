package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzbq implements Continuation, OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzbq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        if (task.isSuccessful()) {
            return;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        this.zza.trySetException(exception);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        boolean isSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.zza;
        if (isSuccessful) {
            taskCompletionSource.trySetResult((Location) task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}
