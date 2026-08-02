package com.google.maps.android.compose;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamic.zac;
import com.google.android.gms.dynamic.zaf;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.maps.zzai;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class MapLifecycleEventObserver implements LifecycleEventObserver {
    public Lifecycle.State currentLifecycleState;
    public final MapView mapView;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapLifecycleEventObserver(MapView mapView) {
        mapView.getClass();
        this.mapView = mapView;
        this.currentLifecycleState = Lifecycle.State.INITIALIZED;
    }

    public final void invokeEvent(Lifecycle.Event event) {
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        MapView mapView = this.mapView;
        switch (i) {
            case 1:
                zzai zzaiVar = mapView.zza;
                zzah zzahVar = (zzah) zzaiVar.zaa;
                if (zzahVar == null) {
                    zzaiVar.zae(1);
                    break;
                } else {
                    try {
                        zzl zzlVar = (zzl) zzahVar.zzb;
                        zzlVar.zzc(zzlVar.zza(), 5);
                        break;
                    } catch (RemoteException e) {
                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                        return;
                    }
                }
            case 2:
                Bundle bundle = new Bundle();
                mapView.getClass();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    zzai zzaiVar2 = mapView.zza;
                    zzaiVar2.getClass();
                    zzaiVar2.zaf(bundle, new zac(zzaiVar2, bundle));
                    if (((zzah) zzaiVar2.zaa) == null) {
                        zzai.showGooglePlayUnavailableMessage(mapView);
                    }
                    break;
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            case 3:
                zzai zzaiVar3 = mapView.zza;
                zzaiVar3.getClass();
                zzaiVar3.zaf(null, new zaf(zzaiVar3, 0));
                break;
            case 4:
                zzai zzaiVar4 = mapView.zza;
                zzaiVar4.getClass();
                zzaiVar4.zaf(null, new zaf(zzaiVar4, 1));
                break;
            case 5:
                zzai zzaiVar5 = mapView.zza;
                zzah zzahVar2 = (zzah) zzaiVar5.zaa;
                if (zzahVar2 == null) {
                    zzaiVar5.zae(5);
                    break;
                } else {
                    try {
                        zzl zzlVar2 = (zzl) zzahVar2.zzb;
                        zzlVar2.zzc(zzlVar2.zza(), 4);
                        break;
                    } catch (RemoteException e2) {
                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                        return;
                    }
                }
            case 6:
                zzai zzaiVar6 = mapView.zza;
                zzah zzahVar3 = (zzah) zzaiVar6.zaa;
                if (zzahVar3 == null) {
                    zzaiVar6.zae(4);
                    break;
                } else {
                    try {
                        zzl zzlVar3 = (zzl) zzahVar3.zzb;
                        zzlVar3.zzc(zzlVar3.zza(), 13);
                        break;
                    } catch (RemoteException e3) {
                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                        return;
                    }
                }
            default:
                Path$$ExternalSyntheticBUOutline0.m$1(event, "Unsupported lifecycle event: ");
                return;
        }
        this.currentLifecycleState = event.getTargetState();
    }

    public final void moveToLifecycleState(Lifecycle.State state) {
        while (true) {
            Lifecycle.State state2 = this.currentLifecycleState;
            if (state2 == state) {
                return;
            }
            if (state2.compareTo(state) < 0) {
                Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                Lifecycle.State state3 = this.currentLifecycleState;
                companion.getClass();
                Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(state3);
                if (upFrom == null) {
                    a$$ExternalSyntheticBUOutline0.m(this.currentLifecycleState, "no event up from ");
                    return;
                }
                invokeEvent(upFrom);
            } else if (this.currentLifecycleState.compareTo(state) > 0) {
                Lifecycle.Event.Companion companion2 = Lifecycle.Event.Companion;
                Lifecycle.State state4 = this.currentLifecycleState;
                companion2.getClass();
                Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(state4);
                if (downFrom == null) {
                    a$$ExternalSyntheticBUOutline0.m(this.currentLifecycleState, "no event down from ");
                    return;
                }
                invokeEvent(downFrom);
            } else {
                continue;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] != 1) {
            moveToLifecycleState(event.getTargetState());
            return;
        }
        Lifecycle.State state = this.currentLifecycleState;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.compareTo(state2) > 0) {
            moveToLifecycleState(state2);
        }
    }
}
