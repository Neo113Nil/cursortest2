package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes4.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 3);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        zzl zzlVar = (zzl) zzc.zza(parcel, zzl.CREATOR);
        zzc.zzd(parcel);
        zzd(zzlVar);
        return true;
    }
}
