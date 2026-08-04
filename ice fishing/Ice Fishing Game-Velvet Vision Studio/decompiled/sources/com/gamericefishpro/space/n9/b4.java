package com.gamericefishpro.space.n9;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends g4 {
    public final AlarmManager v;
    public u3 w;
    public Integer y;

    public b4(m4 m4Var) {
        super(m4Var);
        this.v = (AlarmManager) ((r1) this.d).d.getSystemService("alarm");
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
        AlarmManager alarmManager = this.v;
        if (alarmManager != null) {
            Context context = ((r1) this.d).d;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.gamericefishpro.space.i9.e0.a));
        }
        x();
    }

    public final void v() {
        s();
        r1 r1Var = (r1) this.d;
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.G.a("Unscheduling upload");
        AlarmManager alarmManager = this.v;
        if (alarmManager != null) {
            Context context = r1Var.d;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.gamericefishpro.space.i9.e0.a));
        }
        w().c();
        x();
    }

    public final n w() {
        if (this.w == null) {
            this.w = new u3(this, this.e.E, 1);
        }
        return this.w;
    }

    public final void x() {
        JobScheduler jobScheduler = (JobScheduler) ((r1) this.d).d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
    }

    public final int y() {
        if (this.y == null) {
            this.y = Integer.valueOf("measurement".concat(String.valueOf(((r1) this.d).d.getPackageName())).hashCode());
        }
        return this.y.intValue();
    }
}
