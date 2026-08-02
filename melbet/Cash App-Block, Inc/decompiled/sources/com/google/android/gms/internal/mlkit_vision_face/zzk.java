package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzk extends zaa implements zzm {
    public final zzj zzd(ObjectWrapper objectWrapper, zzh zzhVar) {
        zzj zzjVar;
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzhVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 1);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            zzjVar = queryLocalInterface instanceof zzj ? (zzj) queryLocalInterface : new zzj(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 8);
        }
        zzb.recycle();
        return zzjVar;
    }
}
