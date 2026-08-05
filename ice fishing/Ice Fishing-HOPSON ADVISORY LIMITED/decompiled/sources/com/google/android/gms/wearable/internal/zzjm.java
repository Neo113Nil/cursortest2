package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjm extends zzjf {
    private final zzcm zza;
    private final zzbn zzb;

    public zzjm(BaseImplementation.ResultHolder resultHolder, zzcm zzcmVar, zzbn zzbnVar) {
        super(resultHolder);
        this.zza = zzcmVar;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzv(zzet zzetVar) {
        zzch zzchVar;
        ParcelFileDescriptor parcelFileDescriptor = zzetVar.zzb;
        if (parcelFileDescriptor != null) {
            zzchVar = new zzch(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor), zzetVar.zzc, this.zzb);
            this.zza.zzb(new zzcf(zzchVar));
        } else {
            zzchVar = null;
        }
        zzS(new zzca(new Status(zzetVar.zza), zzchVar));
    }
}
