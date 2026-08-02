package com.google.android.gms.common.api.internal;

import androidx.compose.runtime.Composer;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;

/* loaded from: classes4.dex */
public abstract class TaskUtil {
    public static final FinancialConnectionsSheetNativeViewModel parentViewModel(Composer composer) {
        return Identity.parentActivity(composer).getViewModel();
    }

    public static void setResultOrApiException(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(zzae.fromStatus(status));
        }
    }

    public static void trySetResultOrApiException(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.zza.zzb(obj);
        } else {
            taskCompletionSource.trySetException(zzae.fromStatus(status));
        }
    }
}
