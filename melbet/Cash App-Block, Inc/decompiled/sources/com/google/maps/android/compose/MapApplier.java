package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.runtime.AbstractApplier;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.zza;
import com.google.zxing.Result;
import com.nimbusds.jose.jca.JCAContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class MapApplier extends AbstractApplier {
    public final ArrayList decorations;
    public final GoogleMap map;
    public final MapClickListeners mapClickListeners;
    public final MapView mapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(GoogleMap googleMap, MapView mapView, MapClickListeners mapClickListeners) {
        super(MapNodeRoot.INSTANCE);
        googleMap.getClass();
        mapView.getClass();
        this.map = googleMap;
        this.mapView = mapView;
        this.mapClickListeners = mapClickListeners;
        this.decorations = new ArrayList();
        attachClickListeners$maps_compose_release();
    }

    public final void attachClickListeners$maps_compose_release() {
        MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0 = new MapApplier$$ExternalSyntheticLambda0(this);
        GoogleMap googleMap = this.map;
        zzg zzgVar = googleMap.zza;
        zzg zzgVar2 = googleMap.zza;
        try {
            zza zzaVar = new zza(googleMap, mapApplier$$ExternalSyntheticLambda0);
            Parcel zza = zzgVar.zza();
            zzc.zzg(zza, zzaVar);
            zzgVar.zzc(zza, 89);
            try {
                zza zzaVar2 = new zza(googleMap, new MapApplier$$ExternalSyntheticLambda0(this), (char) 0);
                Parcel zza2 = zzgVar2.zza();
                zzc.zzg(zza2, zzaVar2);
                zzgVar2.zzc(zza2, 83);
                try {
                    zza zzaVar3 = new zza(googleMap, new MapApplier$$ExternalSyntheticLambda0(this), 0);
                    Parcel zza3 = zzgVar2.zza();
                    zzc.zzg(zza3, zzaVar3);
                    zzgVar2.zzc(zza3, 85);
                    try {
                        zza zzaVar4 = new zza(googleMap, new MapApplier$$ExternalSyntheticLambda0(this), (short) 0);
                        Parcel zza4 = zzgVar2.zza();
                        zzc.zzg(zza4, zzaVar4);
                        zzgVar2.zzc(zza4, 87);
                        googleMap.setOnMarkerClickListener(new MapApplier$$ExternalSyntheticLambda0(this));
                        googleMap.setOnInfoWindowClickListener(new MapApplier$$ExternalSyntheticLambda0(this));
                        try {
                            zza zzaVar5 = new zza(googleMap, new MapApplier$$ExternalSyntheticLambda0(this), (byte) 0);
                            Parcel zza5 = zzgVar2.zza();
                            zzc.zzg(zza5, zzaVar5);
                            zzgVar2.zzc(zza5, 86);
                            googleMap.setOnInfoWindowLongClickListener(new MapApplier$$ExternalSyntheticLambda0(this));
                            googleMap.setOnMarkerDragListener(new JCAContext(this, 8));
                            googleMap.setInfoWindowAdapter(new Result(this.mapView, new xg$$ExternalSyntheticLambda9(this, 18)));
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
        } catch (RemoteException e5) {
            TransportImpl$$ExternalSyntheticLambda0.m(e5);
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int i, Object obj) {
        MapNode mapNode = (MapNode) obj;
        mapNode.getClass();
        this.decorations.add(i, mapNode);
        mapNode.onAttached();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int i, Object obj) {
        ((MapNode) obj).getClass();
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int i, int i2, int i3) {
        AbstractApplier.move(i, i2, i3, this.decorations);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        GoogleMap googleMap = this.map;
        googleMap.getClass();
        try {
            zzg zzgVar = googleMap.zza;
            zzgVar.zzc(zzgVar.zza(), 14);
            ArrayList arrayList = this.decorations;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((MapNode) it.next()).onCleared();
            }
            arrayList.clear();
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int i, int i2) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.decorations;
            if (i3 >= i2) {
                break;
            }
            ((MapNode) arrayList.get(i + i3)).onRemoved();
            i3++;
        }
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.subList(i, i2 + i).clear();
        }
    }
}
