package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.RemoteException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.internal.maps.zzc;

/* loaded from: classes4.dex */
public class Marker {
    public final zzaj zza;

    public Marker(zzaj zzajVar) {
        zzae.checkNotNull(zzajVar);
        this.zza = zzajVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            zzaj zzajVar = this.zza;
            zzaj zzajVar2 = ((Marker) obj).zza;
            zzah zzahVar = (zzah) zzajVar;
            Parcel zza = zzahVar.zza();
            zzc.zzg(zza, zzajVar2);
            Parcel zzJ = zzahVar.zzJ(zza, 16);
            boolean z = zzJ.readInt() != 0;
            zzJ.recycle();
            return z;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return false;
        }
    }

    public final LatLng getPosition() {
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zzJ = zzahVar.zzJ(zzahVar.zza(), 4);
            LatLng latLng = (LatLng) zzc.zza(zzJ, LatLng.CREATOR);
            zzJ.recycle();
            return latLng;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public final int hashCode() {
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zzJ = zzahVar.zzJ(zzahVar.zza(), 17);
            int readInt = zzJ.readInt();
            zzJ.recycle();
            return readInt;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return 0;
        }
    }

    public final boolean isInfoWindowShown() {
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zzJ = zzahVar.zzJ(zzahVar.zza(), 13);
            int i = zzc.$r8$clinit;
            boolean z = zzJ.readInt() != 0;
            zzJ.recycle();
            return z;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return false;
        }
    }

    public final void remove() {
        try {
            zzah zzahVar = (zzah) this.zza;
            zzahVar.zzc(zzahVar.zza(), 1);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setAnchor(float f, float f2) {
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zza = zzahVar.zza();
            zza.writeFloat(f);
            zza.writeFloat(f2);
            zzahVar.zzc(zza, 19);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        zzaj zzajVar = this.zza;
        try {
            if (bitmapDescriptor == null) {
                zzah zzahVar = (zzah) zzajVar;
                Parcel zza = zzahVar.zza();
                zzc.zzg(zza, null);
                zzahVar.zzc(zza, 18);
                return;
            }
            IObjectWrapper iObjectWrapper = bitmapDescriptor.zza;
            zzah zzahVar2 = (zzah) zzajVar;
            Parcel zza2 = zzahVar2.zza();
            zzc.zzg(zza2, iObjectWrapper);
            zzahVar2.zzc(zza2, 18);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setPosition(LatLng latLng) {
        if (latLng == null) {
            a$$ExternalSyntheticBUOutline0.m$3("latlng cannot be null - a position is required.");
            return;
        }
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zza = zzahVar.zza();
            zzc.zze(zza, latLng);
            zzahVar.zzc(zza, 3);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setTag(Object obj) {
        try {
            zzaj zzajVar = this.zza;
            ObjectWrapper objectWrapper = new ObjectWrapper(obj);
            zzah zzahVar = (zzah) zzajVar;
            Parcel zza = zzahVar.zza();
            zzc.zzg(zza, objectWrapper);
            zzahVar.zzc(zza, 29);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setZIndex(float f) {
        try {
            zzah zzahVar = (zzah) this.zza;
            Parcel zza = zzahVar.zza();
            zza.writeFloat(f);
            zzahVar.zzc(zza, 27);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void showInfoWindow() {
        try {
            zzah zzahVar = (zzah) this.zza;
            zzahVar.zzc(zzahVar.zza(), 11);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }
}
