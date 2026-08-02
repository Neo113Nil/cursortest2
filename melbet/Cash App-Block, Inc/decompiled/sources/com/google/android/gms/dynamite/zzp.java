package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class zzp extends zaa {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
    }

    public final IObjectWrapper zze(ObjectWrapper objectWrapper, String str, int i) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(zza, 2);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzf(ObjectWrapper objectWrapper, String str, boolean z) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(zza, 3);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzg(ObjectWrapper objectWrapper, String str, int i) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(zza, 4);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final int zzh(ObjectWrapper objectWrapper, String str, boolean z) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(zza, 5);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzi() {
        Parcel zzB = zzB(zza(), 6);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final IObjectWrapper zzj(ObjectWrapper objectWrapper, String str, boolean z, long j) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        Parcel zzB = zzB(zza, 7);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        zzc.zze(zza, objectWrapper2);
        Parcel zzB = zzB(zza, 8);
        IObjectWrapper asInterface = ObjectWrapper.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}
