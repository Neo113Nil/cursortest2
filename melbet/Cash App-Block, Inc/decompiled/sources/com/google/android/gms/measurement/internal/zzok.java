package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzce;

/* loaded from: classes.dex */
public final class zzok extends zzos {
    public final AlarmManager zza;
    public zzkb zzb;
    public Integer zzc;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.zza = (AlarmManager) ((zzic) this.$$delegate_0).zzd.getSystemService("alarm");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void zzbc() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            Context context = ((zzic) this.$$delegate_0).zzd;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzce.zza));
        }
        zzh$1$1();
    }

    public final zzaz zzc() {
        if (this.zzb == null) {
            this.zzb = new zzkb(this, this.zzg.zzn, 2);
        }
        return this.zzb;
    }

    public final void zzf$1() {
        zzay();
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            Context context = zzicVar.zzd;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzce.zza));
        }
        zzc().zzd();
        zzh$1$1();
    }

    public final void zzh$1$1() {
        JobScheduler jobScheduler = (JobScheduler) ((zzic) this.$$delegate_0).zzd.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi$1());
        }
    }

    public final int zzi$1() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(((zzic) this.$$delegate_0).zzd.getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }
}
