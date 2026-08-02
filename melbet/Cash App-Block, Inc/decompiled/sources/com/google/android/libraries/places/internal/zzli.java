package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzli implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzli(int i, TaskCompletionSource taskCompletionSource) {
        this.$r8$classId = i;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception exception = task.getException();
        boolean isSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = this.zza;
        if (isSuccessful) {
            taskCompletionSource.setResult(task.getResult());
        } else if (!task.isCanceled() && exception != null) {
            taskCompletionSource.setException(exception);
        }
        return taskCompletionSource.zza;
    }
}
