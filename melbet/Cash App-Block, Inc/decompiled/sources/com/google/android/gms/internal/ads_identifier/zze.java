package com.google.android.gms.internal.ads_identifier;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public abstract class zze extends Binder implements zzf, IInterface {
    public static zzf zza(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
    }
}
