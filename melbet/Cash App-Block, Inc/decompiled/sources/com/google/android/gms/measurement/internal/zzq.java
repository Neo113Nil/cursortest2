package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzcw;
import com.google.android.gms.internal.measurement.zzcy;

/* loaded from: classes4.dex */
public final class zzq {
    public final zzcy zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcyVar;
    }

    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            zzcw zzcwVar = (zzcw) this.zza;
            Parcel zza = zzcwVar.zza();
            zza.writeString(str);
            zza.writeString(str2);
            zzbn.zzc(zza, bundle);
            zza.writeLong(j);
            zzcwVar.zzc(zza, 1);
        } catch (RemoteException e) {
            zzic zzicVar = this.zzb.zza;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzg.zzb(e, "Event listener threw exception");
            }
        }
    }
}
