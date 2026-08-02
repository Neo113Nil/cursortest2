package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes4.dex */
public final class Polygon {
    public final zzam zza;

    public Polygon(zzam zzamVar) {
        zzae.checkNotNull(zzamVar);
        this.zza = zzamVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            zzam zzamVar = this.zza;
            zzam zzamVar2 = ((Polygon) obj).zza;
            Parcel zza = zzamVar.zza();
            zzc.zzg(zza, zzamVar2);
            Parcel zzJ = zzamVar.zzJ(zza, 19);
            boolean z = zzJ.readInt() != 0;
            zzJ.recycle();
            return z;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return false;
        }
    }

    public final int hashCode() {
        try {
            zzam zzamVar = this.zza;
            Parcel zzJ = zzamVar.zzJ(zzamVar.zza(), 20);
            int readInt = zzJ.readInt();
            zzJ.recycle();
            return readInt;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return 0;
        }
    }
}
