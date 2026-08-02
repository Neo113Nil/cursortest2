package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public abstract class zzai extends zzb implements zzaj {
    public static zzaj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new zzah(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
    }
}
