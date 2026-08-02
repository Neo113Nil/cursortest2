package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import app.cash.trifle.Trifle;
import coil3.Extras;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class AppMeasurementJobService extends JobService implements zznp {
    public Extras.Key zza;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) zzd().f61default).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) zzd().f61default).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zzd();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Extras.Key zzd = zzd();
        Service service = (Service) zzd.f61default;
        String string2 = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string2)));
        if (Objects.equals(string2, "com.google.android.gms.measurement.UPLOAD")) {
            zzae.checkNotNull(string2);
            zzpg zza = zzpg.zza(service);
            zzgu zzaW = zza.zzaW();
            Trifle trifle = zza.zzn.zzf;
            zzaW.zzl.zzb(string2, "Local AppMeasurementJobService called. action");
            zza.zzaX().zzj(new com.google.android.gms.tasks.zzc(zzd, zza, new Fillr.AnonymousClass2(18, zzd, zzaW, jobParameters)));
        }
        if (!Objects.equals(string2, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        zzae.checkNotNull(string2);
        zzez zza2 = zzez.zza(service, null);
        com.google.android.gms.tasks.zzc zzcVar = new com.google.android.gms.tasks.zzc(zzd, jobParameters, false, 5);
        zza2.getClass();
        zza2.zzV(new zzdf(zza2, zzcVar, 3));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        zzd();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(Intent intent) {
    }

    public final Extras.Key zzd() {
        if (this.zza == null) {
            this.zza = new Extras.Key(this);
        }
        return this.zza;
    }
}
