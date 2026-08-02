package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.zza;

/* loaded from: classes4.dex */
public final class MapPropertiesNode implements MapNode {
    public CameraPositionState cameraPositionState;
    public Density density;
    public LayoutDirection layoutDirection;
    public final GoogleMap map;

    public MapPropertiesNode(GoogleMap googleMap, CameraPositionState cameraPositionState, String str, Density density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        googleMap.getClass();
        cameraPositionState.getClass();
        density.getClass();
        layoutDirection.getClass();
        paddingValues.getClass();
        this.map = googleMap;
        this.density = density;
        this.layoutDirection = layoutDirection;
        MapUpdaterKt.access$applyContentPadding(this, googleMap, paddingValues);
        cameraPositionState.setMap$maps_compose_release(googleMap);
        if (str != null) {
            googleMap.setContentDescription(str);
        }
        this.cameraPositionState = cameraPositionState;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        MapPropertiesNode$$ExternalSyntheticLambda0 mapPropertiesNode$$ExternalSyntheticLambda0 = new MapPropertiesNode$$ExternalSyntheticLambda0(this);
        GoogleMap googleMap = this.map;
        zzg zzgVar = googleMap.zza;
        zzg zzgVar2 = googleMap.zza;
        try {
            zza zzaVar = new zza(googleMap, mapPropertiesNode$$ExternalSyntheticLambda0);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 99);
            try {
                zza zzaVar2 = new zza(googleMap, new MapPropertiesNode$$ExternalSyntheticLambda1(this));
                Parcel zza2 = zzgVar2.zza();
                zzc.zzg(zza2, zzaVar2);
                zzgVar2.zzc(zza2, 98);
                try {
                    zza zzaVar3 = new zza(googleMap, new MapPropertiesNode$$ExternalSyntheticLambda1(this), (byte) 0);
                    Parcel zza3 = zzgVar2.zza();
                    zzc.zzg(zza3, zzaVar3);
                    zzgVar2.zzc(zza3, 96);
                    try {
                        zza zzaVar4 = new zza(googleMap, new MapPropertiesNode$$ExternalSyntheticLambda1(this), (char) 0);
                        Parcel zza4 = zzgVar2.zza();
                        zzc.zzg(zza4, zzaVar4);
                        zzgVar2.zzc(zza4, 97);
                    } catch (RemoteException e) {
                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                    }
                } catch (RemoteException e2) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e2);
                }
            } catch (RemoteException e3) {
                TransportImpl$$ExternalSyntheticLambda0.m(e3);
            }
        } catch (RemoteException e4) {
            TransportImpl$$ExternalSyntheticLambda0.m(e4);
        }
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }
}
