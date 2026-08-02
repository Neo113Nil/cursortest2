package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes9.dex */
public final class zzak extends zaa implements zzam {
    public final zzaj zzd(ObjectWrapper objectWrapper, zzah zzahVar) {
        zzaj zzajVar;
        Parcel zza = zza();
        int i = zzc.$r8$clinit;
        zza.writeStrongBinder(objectWrapper);
        zza.writeInt(1);
        zzahVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(zza, 1);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzajVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            zzajVar = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzaj(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 7);
        }
        zzb.recycle();
        return zzajVar;
    }
}
