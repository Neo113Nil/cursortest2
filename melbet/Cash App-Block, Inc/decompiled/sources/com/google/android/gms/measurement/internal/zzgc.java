package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgc extends zaa implements zzge {
    public zzgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 5);
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzd(zza);
    }
}
