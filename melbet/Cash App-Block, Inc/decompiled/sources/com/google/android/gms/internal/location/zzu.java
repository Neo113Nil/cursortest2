package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzu extends zaa {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 3);
    }

    public final void zzv(zzei zzeiVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeiVar);
        zzc(zza, 59);
    }

    public final void zzx(zzee zzeeVar, zzdj zzdjVar) {
        Parcel zza = zza();
        zzc.zzb(zza, zzeeVar);
        zza.writeStrongBinder(zzdjVar);
        zzc(zza, 89);
    }
}
