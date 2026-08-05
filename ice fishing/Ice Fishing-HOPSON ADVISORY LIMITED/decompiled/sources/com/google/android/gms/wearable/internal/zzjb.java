package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjb implements BaseImplementation.ResultHolder {
    final TaskCompletionSource zza;

    zzjb(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        int statusCode = status.getStatusCode();
        if (statusCode == 0) {
            this.zza.setResult(true);
        } else if (statusCode == 4002) {
            this.zza.setResult(false);
        } else {
            setFailedResult(status);
        }
    }
}
