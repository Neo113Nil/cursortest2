package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class zzd implements zzf, IInterface {
    public final IBinder zza;

    public zzd(IBinder iBinder) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zzb(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final String zzc() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel zzb = zzb(obtain, 1);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final boolean zzd() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = zzc.$r8$clinit;
        obtain.writeInt(1);
        Parcel zzb = zzb(obtain, 2);
        boolean z = zzb.readInt() != 0;
        zzb.recycle();
        return z;
    }
}
