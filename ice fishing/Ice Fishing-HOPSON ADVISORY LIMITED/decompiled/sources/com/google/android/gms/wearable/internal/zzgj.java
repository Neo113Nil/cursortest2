package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzgj extends com.google.android.gms.internal.wearable.zza implements IInterface {
    zzgj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void zzd(boolean z, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeByteArray(bArr);
        zzU(1, zza);
    }
}
