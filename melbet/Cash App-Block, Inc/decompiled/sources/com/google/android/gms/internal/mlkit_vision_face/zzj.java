package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzj extends zaa {
    public final zzf[] zzf(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, ObjectWrapper objectWrapper3, int i, int i2, int i3, int i4, int i5, int i6, zzp zzpVar) {
        Parcel zza = zza();
        int i7 = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeStrongBinder(objectWrapper2);
        zza.writeStrongBinder(objectWrapper3);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(i4);
        zza.writeInt(i5);
        zza.writeInt(i6);
        zza.writeInt(1);
        zzpVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 4);
        zzf[] zzfVarArr = (zzf[]) zzb.createTypedArray(zzf.CREATOR);
        zzb.recycle();
        return zzfVarArr;
    }
}
