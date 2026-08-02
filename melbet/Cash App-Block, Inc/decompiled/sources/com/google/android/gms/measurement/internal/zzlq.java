package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes.dex */
public final class zzlq extends zzg {
    public JobScheduler zza;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return true;
    }

    public final void zzh(long j) {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzb$1();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(zzicVar.zzd.getPackageName())).hashCode()) != null) {
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int zzj = zzj();
        if (zzj != 2) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzl.zzb(FillrEnv$EnumUnboxingLocalUtility.name(zzj), "[sgtm] Not eligible for Scion upload");
            return;
        }
        zzgu zzguVar3 = zzicVar.zzi;
        zzic.zzP(zzguVar3);
        zzguVar3.zzl.zzb(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(zzicVar.zzd.getPackageName())).hashCode(), new ComponentName(zzicVar.zzd, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.zza;
        zzae.checkNotNull(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        zzgu zzguVar4 = zzicVar.zzi;
        zzic.zzP(zzguVar4);
        zzguVar4.zzl.zzb(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int zzj() {
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzb$1();
        zzg();
        if (this.zza == null) {
            return 7;
        }
        Boolean zzr = zzicVar.zzg.zzr("google_analytics_sgtm_upload_enabled");
        if (!(zzr == null ? false : zzr.booleanValue())) {
            return 8;
        }
        if (zzicVar.zzv().zzh < 119000) {
            return 6;
        }
        if (zzpp.zzT(zzicVar.zzd)) {
            return !zzicVar.zzt().zzK() ? 5 : 2;
        }
        return 3;
    }
}
