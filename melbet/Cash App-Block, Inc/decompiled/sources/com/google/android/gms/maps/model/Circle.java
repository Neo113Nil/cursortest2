package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzl;

/* loaded from: classes4.dex */
public final class Circle {
    public final zzl zza;

    public Circle(zzl zzlVar) {
        zzae.checkNotNull(zzlVar);
        this.zza = zzlVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            zzl zzlVar = this.zza;
            zzl zzlVar2 = ((Circle) obj).zza;
            Parcel zza = zzlVar.zza();
            zzc.zzg(zza, zzlVar2);
            Parcel zzJ = zzlVar.zzJ(zza, 17);
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
            zzl zzlVar = this.zza;
            Parcel zzJ = zzlVar.zzJ(zzlVar.zza(), 18);
            int readInt = zzJ.readInt();
            zzJ.recycle();
            return readInt;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return 0;
        }
    }
}
