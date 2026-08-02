package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback$Stub;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzdj extends IStatusCallback$Stub {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzdj(Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.zza = bool;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback$Stub
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.zza, this.zzb);
    }
}
