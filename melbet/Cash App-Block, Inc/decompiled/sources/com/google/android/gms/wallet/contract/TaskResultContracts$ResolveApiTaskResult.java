package com.google.android.gms.wallet.contract;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* loaded from: classes9.dex */
public abstract class TaskResultContracts$ResolveApiTaskResult<I, O> extends ActivityResultContract<Task<I>, O> {
    public Status zza;
    public PendingIntent zzb;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        PendingIntent pendingIntent = this.zzb;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new IntentSenderRequest(intentSender, null, 0, 0));
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, Object obj) {
        Task task = (Task) obj;
        if (!task.isComplete()) {
            a$$ExternalSyntheticBUOutline0.m$3("The task has to be executed before using this API to resolve its result.");
            return null;
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            this.zza = ((ApiException) exception).mStatus;
            if (exception instanceof ResolvableApiException) {
                this.zzb = ((ResolvableApiException) exception).mStatus.zzc;
            }
        }
        if (this.zzb == null) {
            return new ActivityResultContract.SynchronousResult(outputFromTask(task));
        }
        return null;
    }

    public abstract Object outputFromTask(Task task);
}
