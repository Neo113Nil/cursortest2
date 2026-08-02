package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class zzq extends zaa {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
    }

    public final IObjectWrapper zze(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.zze(zza, objectWrapper2);
        Parcel zzB = zzB(zza, 2);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzf(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.zze(zza, objectWrapper2);
        Parcel zzB = zzB(zza, 3);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
