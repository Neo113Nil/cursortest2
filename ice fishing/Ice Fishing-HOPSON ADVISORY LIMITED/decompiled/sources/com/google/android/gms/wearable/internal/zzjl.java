package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzjl extends zzjf {
    private final zzcm zza;

    public zzjl(BaseImplementation.ResultHolder resultHolder, zzcm zzcmVar) {
        super(resultHolder);
        this.zza = zzcmVar;
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void zzu(zzer zzerVar) {
        zzce zzceVar;
        ParcelFileDescriptor parcelFileDescriptor = zzerVar.zzb;
        if (parcelFileDescriptor != null) {
            zzceVar = new zzce(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            this.zza.zzb(new zzcd(zzceVar));
        } else {
            zzceVar = null;
        }
        zzS(new zzbz(new Status(zzerVar.zza), zzceVar));
    }
}
