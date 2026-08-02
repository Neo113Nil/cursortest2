package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzkt extends zaa {
    public zzkt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 5);
    }

    public final void zze(zzjy zzjyVar, String str, String[] strArr) {
        Parcel zza = zza();
        zzbn.zzd(zza, zzjyVar);
        zza.writeString(str);
        zza.writeInt(0);
        zza.writeStringArray(strArr);
        zza.writeByteArray(null);
        zzc(zza, 1);
    }
}
