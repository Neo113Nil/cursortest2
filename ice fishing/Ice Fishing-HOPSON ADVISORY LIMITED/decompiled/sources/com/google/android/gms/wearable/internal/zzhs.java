package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzhs extends zza {
    final /* synthetic */ TaskCompletionSource zza;

    zzhs(zzhy zzhyVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzhyVar);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzd(zzfz zzfzVar) {
        TaskUtil.setResultOrApiException(zziy.zza(zzfzVar.zza), zzfzVar.zzb, this.zza);
    }
}
