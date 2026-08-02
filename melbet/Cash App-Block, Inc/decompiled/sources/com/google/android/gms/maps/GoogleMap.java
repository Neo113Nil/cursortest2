package com.google.android.gms.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import coil3.request.OneShotDisposable;
import com.fillr.m1;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.internal.zzbu;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.zzb;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class GoogleMap {
    public final zzg zza;
    public zzb zze;

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public GoogleMap(zzg zzgVar) {
        new HashMap();
        new HashMap();
        zzae.checkNotNull(zzgVar);
        this.zza = zzgVar;
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            zzg zzgVar = this.zza;
            Parcel zza = zzgVar.zza();
            zzc.zze(zza, markerOptions);
            Parcel zzJ = zzgVar.zzJ(zza, 11);
            com.google.android.gms.internal.maps.zzaj zzb = com.google.android.gms.internal.maps.zzai.zzb(zzJ.readStrongBinder());
            zzJ.recycle();
            if (zzb != null) {
                return markerOptions.zzq == 1 ? new AdvancedMarker(zzb) : new Marker(zzb);
            }
            return null;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            zzg zzgVar = this.zza;
            Parcel zzJ = zzgVar.zzJ(zzgVar.zza(), 1);
            CameraPosition cameraPosition = (CameraPosition) zzc.zza(zzJ, CameraPosition.CREATOR);
            zzJ.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public final m1 getProjection() {
        zzbu zzbuVar;
        try {
            zzg zzgVar = this.zza;
            Parcel zzJ = zzgVar.zzJ(zzgVar.zza(), 26);
            IBinder readStrongBinder = zzJ.readStrongBinder();
            if (readStrongBinder == null) {
                zzbuVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                zzbuVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbu(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 4);
            }
            zzJ.recycle();
            return new m1(zzbuVar, 25);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public final zzb getUiSettings() {
        zzca zzcaVar;
        try {
            if (this.zze == null) {
                zzg zzgVar = this.zza;
                Parcel zzJ = zzgVar.zzJ(zzgVar.zza(), 25);
                IBinder readStrongBinder = zzJ.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    zzcaVar = queryLocalInterface instanceof zzca ? (zzca) queryLocalInterface : new zzca(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 4);
                }
                zzJ.recycle();
                this.zze = new zzb(zzcaVar, 23);
            }
            return this.zze;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public final void moveCamera(OneShotDisposable oneShotDisposable) {
        try {
            zzae.checkNotNull(oneShotDisposable, "CameraUpdate must not be null.");
            zzg zzgVar = this.zza;
            IObjectWrapper iObjectWrapper = (IObjectWrapper) oneShotDisposable.job;
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, iObjectWrapper);
            zzgVar.zzc(zza, 4);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setContentDescription(String str) {
        try {
            zzg zzgVar = this.zza;
            Parcel zza = zzgVar.zza();
            zza.writeString(str);
            zzgVar.zzc(zza, 61);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        zzg zzgVar = this.zza;
        try {
            zza zzaVar = new zza(this, infoWindowAdapter);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 33);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        zzg zzgVar = this.zza;
        try {
            zza zzaVar = new zza(this, onInfoWindowClickListener);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 32);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        zzg zzgVar = this.zza;
        try {
            zza zzaVar = new zza(this, onInfoWindowLongClickListener);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 84);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        zzg zzgVar = this.zza;
        try {
            zza zzaVar = new zza(this, onMarkerClickListener);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 30);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        zzg zzgVar = this.zza;
        try {
            zza zzaVar = new zza(this, onMarkerDragListener);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 31);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    public final void stopAnimation() {
        try {
            zzg zzgVar = this.zza;
            zzgVar.zzc(zzgVar.zza(), 8);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }
}
