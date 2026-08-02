package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.internal.maps.zzj;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.maps.GoogleMapOptions;

/* loaded from: classes4.dex */
public final class zze extends zaa {
    public zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
    }

    public final int zzd() {
        Parcel zzJ = zzJ(zza(), 9);
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    public final zzb zze() {
        zzb zzbVar;
        Parcel zzJ = zzJ(zza(), 4);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zzbVar = queryLocalInterface instanceof zzb ? (zzb) queryLocalInterface : new zzb(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
        }
        zzJ.recycle();
        return zzbVar;
    }

    public final zzl zzg(ObjectWrapper objectWrapper, GoogleMapOptions googleMapOptions) {
        zzl zzlVar;
        Parcel zza = zza();
        zzc.zzg(zza, objectWrapper);
        zzc.zze(zza, googleMapOptions);
        Parcel zzJ = zzJ(zza, 3);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            zzlVar = queryLocalInterface instanceof zzl ? (zzl) queryLocalInterface : new zzl(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
        }
        zzJ.recycle();
        return zzlVar;
    }

    public final zzk zzj() {
        zzk zziVar;
        Parcel zzJ = zzJ(zza(), 5);
        IBinder readStrongBinder = zzJ.readStrongBinder();
        int i = zzj.$r8$clinit;
        if (readStrongBinder == null) {
            zziVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            zziVar = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
        }
        zzJ.recycle();
        return zziVar;
    }

    public final void zzk(ObjectWrapper objectWrapper, String str) {
        Parcel zza = zza();
        zzc.zzg(zza, objectWrapper);
        zza.writeString(str);
        zzc(zza, 12);
    }

    public final void zzl(ObjectWrapper objectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, objectWrapper);
        zza.writeInt(20000000);
        zzc(zza, 6);
    }

    public final void zzn(ObjectWrapper objectWrapper) {
        Parcel zza = zza();
        zzc.zzg(zza, objectWrapper);
        zzc(zza, 11);
    }
}
