package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes9.dex */
public final class zzaj extends zaa {
    public final zzu[] zze(ObjectWrapper objectWrapper, zzan zzanVar) {
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzanVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 1);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }
}
