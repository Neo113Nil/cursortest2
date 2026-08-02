package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.maps.zzai;
import java.util.Objects;
import okio.internal.RealBufferedSource;

/* loaded from: classes4.dex */
public final class zac implements zah {
    public final /* synthetic */ Bundle zaa;
    public final /* synthetic */ zzai zab;

    public zac(zzai zzaiVar, Bundle bundle) {
        this.zaa = bundle;
        Objects.requireNonNull(zzaiVar);
        this.zab = zzaiVar;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab() {
        zzah zzahVar = (zzah) this.zab.zaa;
        Bundle bundle = this.zaa;
        zzahVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            RealBufferedSource.zzb(bundle, bundle2);
            zzl zzlVar = (zzl) zzahVar.zzb;
            Parcel zza = zzlVar.zza();
            zzc.zze(zza, bundle2);
            zzlVar.zzc(zza, 2);
            RealBufferedSource.zzb(bundle2, bundle);
            Parcel zzJ = zzlVar.zzJ(zzlVar.zza(), 8);
            IObjectWrapper asInterface = ObjectWrapper.asInterface(zzJ.readStrongBinder());
            zzJ.recycle();
            zzahVar.zzc = (View) ObjectWrapper.unwrap(asInterface);
            ViewGroup viewGroup = (ViewGroup) zzahVar.f68zza;
            viewGroup.removeAllViews();
            viewGroup.addView((View) zzahVar.zzc);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }
}
