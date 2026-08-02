package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.internal.zzl;

/* loaded from: classes4.dex */
public class MapView extends FrameLayout {
    public final zzai zza;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public final void onLowMemory() {
        zzah zzahVar = (zzah) this.zza.zaa;
        if (zzahVar != null) {
            try {
                zzl zzlVar = (zzl) zzahVar.zzb;
                zzlVar.zzc(zzlVar.zza(), 6);
            } catch (RemoteException e) {
                TransportImpl$$ExternalSyntheticLambda0.m(e);
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.zza = new zzai(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zza = new zzai(this, context, googleMapOptions);
        setClickable(true);
    }
}
