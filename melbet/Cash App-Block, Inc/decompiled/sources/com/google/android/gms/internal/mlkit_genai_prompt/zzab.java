package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzab extends zaa implements zzad {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.aicore.aidl.IAICoreService", 6);
    }

    public final int zzg(zzm zzmVar, zzfd zzfdVar) {
        Parcel zza = zza();
        int i = zzl.$r8$clinit;
        zza.writeInt(1);
        zzmVar.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzfdVar);
        Parcel zzb = zzb(zza, 7);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final int zzh(zzm zzmVar, zzfd zzfdVar) {
        Parcel zza = zza();
        int i = zzl.$r8$clinit;
        zza.writeInt(1);
        zzmVar.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzfdVar);
        Parcel zzb = zzb(zza, 12);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }
}
