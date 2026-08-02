package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.appupdate.zzq;

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

    @Override // com.google.android.play.core.appupdate.internal.zzf
    public final void zzd(String str, Bundle bundle, zzq zzqVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = zzc.$r8$clinit;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(zzqVar);
        try {
            this.zza.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
