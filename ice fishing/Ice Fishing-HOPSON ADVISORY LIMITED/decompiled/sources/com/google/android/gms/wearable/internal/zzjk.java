package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjk extends zzjf {
    public zzjk(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzA(zzep zzepVar) {
        Status zza = zziy.zza(zzepVar.zza);
        zzao zzaoVar = zzepVar.zzb;
        zzS(new zzaf(zza, zzaoVar == null ? null : new zzad(zzaoVar)));
    }
}
