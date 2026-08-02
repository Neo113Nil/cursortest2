package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.maps.zzap;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes4.dex */
public final class Polyline {
    public final zzap zza;

    public Polyline(zzap zzapVar) {
        zzae.checkNotNull(zzapVar);
        this.zza = zzapVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            zzap zzapVar = this.zza;
            zzap zzapVar2 = ((Polyline) obj).zza;
            Parcel zza = zzapVar.zza();
            zzc.zzg(zza, zzapVar2);
            Parcel zzJ = zzapVar.zzJ(zza, 15);
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
            zzap zzapVar = this.zza;
            Parcel zzJ = zzapVar.zzJ(zzapVar.zza(), 16);
            int readInt = zzJ.readInt();
            zzJ.recycle();
            return readInt;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return 0;
        }
    }
}
