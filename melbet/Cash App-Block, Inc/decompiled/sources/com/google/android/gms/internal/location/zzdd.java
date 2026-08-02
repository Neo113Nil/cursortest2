package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzdd extends zzq {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ zzdv zzb;

    public zzdd(TaskCompletionSource taskCompletionSource, zzdv zzdvVar) {
        this.zza = taskCompletionSource;
        this.zzb = zzdvVar;
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zzd(zzl zzlVar) {
        TaskUtil.setResultOrApiException(zzlVar.zzb, null, this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzr
    public final void zze() {
        this.zzb.zzf();
    }
}
