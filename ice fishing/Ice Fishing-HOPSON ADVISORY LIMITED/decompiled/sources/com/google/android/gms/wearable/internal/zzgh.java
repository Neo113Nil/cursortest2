package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzgh extends com.google.android.gms.internal.wearable.zzb implements zzgi {
    public zzgh() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        com.google.android.gms.internal.wearable.zzc.zzd(parcel);
        zzc(readInt, readInt2);
        parcel2.writeNoException();
        return true;
    }
}
