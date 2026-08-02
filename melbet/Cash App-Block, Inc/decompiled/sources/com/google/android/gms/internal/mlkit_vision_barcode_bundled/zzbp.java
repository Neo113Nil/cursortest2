package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes4.dex */
public abstract class zzbp extends zzb implements zzbq {
    public static zzbq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        IObjectWrapper asInterface = ObjectWrapper.asInterface(parcel.readStrongBinder());
        zzba zzbaVar = (zzba) zzc.zza(parcel, zzba.CREATOR);
        zzc.zzb(parcel);
        zzbn newBarcodeScanner = newBarcodeScanner(asInterface, zzbaVar);
        parcel2.writeNoException();
        if (newBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
            return true;
        }
        parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
        return true;
    }
}
