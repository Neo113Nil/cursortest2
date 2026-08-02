package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzv;

/* loaded from: classes4.dex */
public final class GroundOverlay {
    public final zzv zza;

    public GroundOverlay(zzv zzvVar) {
        zzae.checkNotNull(zzvVar);
        this.zza = zzvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            zzv zzvVar = this.zza;
            zzv zzvVar2 = ((GroundOverlay) obj).zza;
            Parcel zza = zzvVar.zza();
            zzc.zzg(zza, zzvVar2);
            Parcel zzJ = zzvVar.zzJ(zza, 19);
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
            zzv zzvVar = this.zza;
            Parcel zzJ = zzvVar.zzJ(zzvVar.zza(), 20);
            int readInt = zzJ.readInt();
            zzJ.recycle();
            return readInt;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return 0;
        }
    }
}
