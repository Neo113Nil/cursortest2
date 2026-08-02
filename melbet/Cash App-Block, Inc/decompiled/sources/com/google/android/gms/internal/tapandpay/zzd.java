package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class zzd implements IInterface {
    public final IBinder zza;
    public final String zzb;

    public zzd(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final void zzb(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
