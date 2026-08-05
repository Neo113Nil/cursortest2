package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzhr implements BaseImplementation.ResultHolder {
    final /* synthetic */ TaskCompletionSource zza;

    zzhr(zzhy zzhyVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzhyVar);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.setException(ApiExceptionUtil.fromStatus(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        zzht zzhtVar = (zzht) obj;
        if (zzhtVar.getStatus().isSuccess()) {
            this.zza.setResult(zzhtVar.zza());
        } else {
            this.zza.setException(ApiExceptionUtil.fromStatus(zzhtVar.getStatus()));
        }
    }
}
