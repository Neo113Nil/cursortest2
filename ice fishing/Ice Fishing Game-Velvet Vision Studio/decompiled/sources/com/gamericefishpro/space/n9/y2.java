package com.gamericefishpro.space.n9;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends g0 {
    public JobScheduler i;

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return true;
    }

    public final void v(long j) {
        r1 r1Var = (r1) this.d;
        s();
        r();
        JobScheduler jobScheduler = this.i;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(r1Var.d.getPackageName())).hashCode()) != null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iW = w();
        if (iW != 2) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.G.b(com.gamericefishpro.space.m5.a.v(iW), "[sgtm] Not eligible for Scion upload");
            return;
        }
        v0 v0Var3 = r1Var.y;
        r1.l(v0Var3);
        v0Var3.G.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(r1Var.d.getPackageName())).hashCode(), new ComponentName(r1Var.d, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.i;
        com.gamericefishpro.space.v8.c0.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        v0 v0Var4 = r1Var.y;
        r1.l(v0Var4);
        v0Var4.G.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int w() {
        r1 r1Var = (r1) this.d;
        s();
        r();
        if (this.i == null) {
            return 7;
        }
        Boolean boolD = r1Var.v.D("google_analytics_sgtm_upload_enabled");
        if (!(boolD == null ? false : boolD.booleanValue())) {
            return 8;
        }
        if (r1Var.q().C < 119000) {
            return 6;
        }
        if (r4.K(r1Var.d)) {
            return !r1Var.o().y() ? 5 : 2;
        }
        return 3;
    }
}
