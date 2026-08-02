package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.zza;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
public final /* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$4$1$1 extends FunctionReferenceImpl implements Function2 {
    public static final MapClickListenersKt$MapClickListenerUpdater$1$4$1$1 INSTANCE = new MapClickListenersKt$MapClickListenerUpdater$1$4$1$1(2, GoogleMap.class, "setOnMapClickListener", "setOnMapClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GoogleMap googleMap = (GoogleMap) obj;
        MapClickListenersKt$$ExternalSyntheticLambda0 mapClickListenersKt$$ExternalSyntheticLambda0 = (MapClickListenersKt$$ExternalSyntheticLambda0) obj2;
        googleMap.getClass();
        zzg zzgVar = googleMap.zza;
        try {
            if (mapClickListenersKt$$ExternalSyntheticLambda0 == null) {
                Parcel zza = zzgVar.zza();
                zzc.zzg(zza, null);
                zzgVar.zzc(zza, 28);
            } else {
                zza zzaVar = new zza(googleMap, mapClickListenersKt$$ExternalSyntheticLambda0);
                Parcel zza2 = zzgVar.zza();
                zzc.zzg(zza2, zzaVar);
                zzgVar.zzc(zza2, 28);
            }
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }
}
