package com.google.android.gms.common;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zab;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class zzj extends zab implements IInterface {
    public final int zza;

    public zzj(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        com.google.android.gms.common.internal.zzae.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (obj instanceof zzj) {
            try {
                zzj zzjVar = (zzj) obj;
                if (zzjVar.zza == this.zza && (zzd = zzjVar.zzd()) != null) {
                    return Arrays.equals(zzc(), (byte[]) ObjectWrapper.unwrap(zzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper zzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, zzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.zza);
        return true;
    }

    public abstract byte[] zzc();

    public final IObjectWrapper zzd() {
        return new ObjectWrapper(zzc());
    }
}
