package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzcw extends zaa implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 5);
    }

    public final int zzf() {
        Parcel zzP = zzP(zza(), 2);
        int readInt = zzP.readInt();
        zzP.recycle();
        return readInt;
    }
}
