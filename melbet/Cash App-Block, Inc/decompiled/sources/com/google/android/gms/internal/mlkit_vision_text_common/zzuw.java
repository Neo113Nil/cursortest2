package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzuw extends zaa implements zzuy {
    public final zzuv zzd(ObjectWrapper objectWrapper) {
        zzuv zzuvVar;
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        Parcel zzb = zzb(zza, 1);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzuvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzuvVar = queryLocalInterface instanceof zzuv ? (zzuv) queryLocalInterface : new zzuv(readStrongBinder);
        }
        zzb.recycle();
        return zzuvVar;
    }

    public final zzuv zze(ObjectWrapper objectWrapper, zzvh zzvhVar) {
        zzuv zzuvVar;
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzvhVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 2);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzuvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzuvVar = queryLocalInterface instanceof zzuv ? (zzuv) queryLocalInterface : new zzuv(readStrongBinder);
        }
        zzb.recycle();
        return zzuvVar;
    }
}
