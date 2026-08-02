package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdu;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzez;

/* loaded from: classes.dex */
public class AppMeasurementSdk {
    public final zzez zza;

    public AppMeasurementSdk(zzez zzezVar) {
        this.zza = zzezVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return zzez.zza(context, null).zze;
    }

    public void beginAdUnitExposure(String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdq(zzezVar, str, 0));
    }

    public void endAdUnitExposure(String str) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdq(zzezVar, str, 1));
    }

    public long generateEventId() {
        return this.zza.zzz();
    }

    public String getAppInstanceId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 1));
        return zzcmVar.zzc(50L);
    }

    public String getGmpAppId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdu(zzezVar, zzcmVar, 0));
        return zzcmVar.zzc(500L);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        zzez zzezVar = this.zza;
        zzezVar.zzV(new zzdz(zzezVar, str, str2, bundle, true));
    }
}
