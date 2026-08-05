package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzgk extends com.google.android.gms.internal.wearable.zza implements IInterface {
    zzgk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IServiceResponseCallback");
    }

    public final void zzd(zzkg zzkgVar, zzgp zzgpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.wearable.zzc.zzb(zza, zzkgVar);
        com.google.android.gms.internal.wearable.zzc.zzc(zza, zzgpVar);
        zzT(1, zza);
    }
}
