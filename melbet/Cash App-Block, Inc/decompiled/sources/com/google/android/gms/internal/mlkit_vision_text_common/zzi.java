package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzi extends zaa implements zzk {
    public final zzh zzd(ObjectWrapper objectWrapper, zzp zzpVar) {
        zzh zzhVar;
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzpVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 1);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            zzhVar = queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(readStrongBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer", 9);
        }
        zzb.recycle();
        return zzhVar;
    }
}
