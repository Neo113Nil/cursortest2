package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzdn extends zzq {
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzdn(TaskCompletionSource taskCompletionSource) {
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zzd(zzl zzlVar) {
        TaskUtil.setResultOrApiException(zzlVar.zzb, Boolean.TRUE, this.zzb);
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zze() {
    }
}
