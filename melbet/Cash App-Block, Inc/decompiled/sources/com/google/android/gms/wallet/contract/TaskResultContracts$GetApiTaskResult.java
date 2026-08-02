package com.google.android.gms.wallet.contract;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes4.dex */
public abstract class TaskResultContracts$GetApiTaskResult<T> extends TaskResultContracts$ResolveApiTaskResult<T, ApiTaskResult> {
    @Override // com.google.android.gms.wallet.contract.TaskResultContracts$ResolveApiTaskResult
    public final Object outputFromTask(Task task) {
        if (task.isSuccessful()) {
            return new ApiTaskResult(task.getResult(), Status.RESULT_SUCCESS);
        }
        if (task.isCanceled()) {
            return new ApiTaskResult(null, new Status(16, "The task has been canceled.", null, null));
        }
        Status status = this.zza;
        return status != null ? new ApiTaskResult(null, status) : new ApiTaskResult(null, Status.RESULT_INTERNAL_ERROR);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public ApiTaskResult parseResult(int i, Intent intent) {
        Status status = Status.RESULT_INTERNAL_ERROR;
        if (i != -1) {
            return i != 0 ? new ApiTaskResult(null, status) : new ApiTaskResult(null, Status.RESULT_CANCELED);
        }
        PaymentData taskResultFromIntent = intent != null ? taskResultFromIntent(intent) : null;
        return taskResultFromIntent != null ? new ApiTaskResult(taskResultFromIntent, Status.RESULT_SUCCESS) : new ApiTaskResult(null, status);
    }

    public abstract PaymentData taskResultFromIntent(Intent intent);
}
