package com.google.android.gms.wallet.contract;

import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public abstract class TaskResultContracts$UnpackApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, T> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    public final Object outputFromTask(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        return null;
    }
}
