package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public final class zzs implements IInterface {
    public final IBinder zza;
    public final String zzb;

    public zzs(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }
}
