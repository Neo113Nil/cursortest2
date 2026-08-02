package com.google.android.gms.internal.time;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class zzat implements IInterface {
    public final IBinder zza;

    public zzat(IBinder iBinder) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
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
