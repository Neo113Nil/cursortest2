package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.measurement.zzbn;

/* loaded from: classes4.dex */
public final class zzgf extends zaa implements zzgh {
    public zzgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 5);
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, zzoqVar);
        zzd(zza);
    }
}
