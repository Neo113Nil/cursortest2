package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzcq extends zaa implements zzcs {
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void zzb(Bundle bundle) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzc(zza, 1);
    }
}
