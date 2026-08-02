package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public final class tva1 extends vw91 {
    public JobScheduler w;

    @Override // defpackage.vw91
    public final boolean Jg() {
        return true;
    }

    public final void Kg(long j) {
        g gVar = (g) this.b;
        Hg();
        Gg();
        JobScheduler jobScheduler = this.w;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(gVar.a.getPackageName())).hashCode()) != null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.H.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin Lg = Lg();
        if (Lg != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.H.b(Lg.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        y1a1 y1a1Var3 = gVar.y;
        g.g(y1a1Var3);
        y1a1Var3.H.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(gVar.a.getPackageName())).hashCode(), new ComponentName(gVar.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.w;
        cvw.l(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        y1a1 y1a1Var4 = gVar.y;
        g.g(y1a1Var4);
        y1a1Var4.H.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final zzin Lg() {
        g gVar = (g) this.b;
        Hg();
        Gg();
        if (this.w == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        Boolean Sg = gVar.w.Sg("google_analytics_sgtm_upload_enabled");
        return Sg == null ? false : Sg.booleanValue() ? gVar.l().D >= 119000 ? !ieb1.Zg(gVar.a) ? zzin.MEASUREMENT_SERVICE_NOT_ENABLED : !gVar.j().Ng() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE : zzin.SDK_TOO_OLD : zzin.NOT_ENABLED_IN_MANIFEST;
    }
}
