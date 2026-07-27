package androidx.work.impl.background.systemjob;

import J0.s;
import K0.c;
import K0.f;
import K0.p;
import N0.d;
import S0.j;
import T0.m;
import Z2.e;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: w, reason: collision with root package name */
    public static final String f5387w = s.f("SystemJobService");

    /* renamed from: n, reason: collision with root package name */
    public p f5388n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f5389u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final S0.c f5390v = new S0.c(3);

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K0.c
    public final void b(j jVar, boolean z3) {
        JobParameters jobParameters;
        s.d().a(f5387w, jVar.f2792a + " executed on JobScheduler");
        synchronized (this.f5389u) {
            jobParameters = (JobParameters) this.f5389u.remove(jVar);
        }
        this.f5390v.k(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p b9 = p.b(getApplicationContext());
            this.f5388n = b9;
            b9.f1537f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s.d().g(f5387w, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f5388n;
        if (pVar != null) {
            pVar.f1537f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f5388n == null) {
            s.d().a(f5387w, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            s.d().b(f5387w, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f5389u) {
            try {
                if (this.f5389u.containsKey(a9)) {
                    s.d().a(f5387w, "Job is already being executed by SystemJobService: " + a9);
                    return false;
                }
                s.d().a(f5387w, "onStartJob for " + a9);
                this.f5389u.put(a9, jobParameters);
                int i = Build.VERSION.SDK_INT;
                e eVar = new e(7);
                if (N0.c.b(jobParameters) != null) {
                    eVar.f4171v = Arrays.asList(N0.c.b(jobParameters));
                }
                if (N0.c.a(jobParameters) != null) {
                    eVar.f4170u = Arrays.asList(N0.c.a(jobParameters));
                }
                if (i >= 28) {
                    eVar.f4172w = d.a(jobParameters);
                }
                this.f5388n.f(this.f5390v.m(a9), eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f5388n == null) {
            s.d().a(f5387w, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            s.d().b(f5387w, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f5387w, "onStopJob for " + a9);
        synchronized (this.f5389u) {
            this.f5389u.remove(a9);
        }
        K0.j k9 = this.f5390v.k(a9);
        if (k9 != null) {
            p pVar = this.f5388n;
            pVar.f1535d.i(new m(pVar, k9, false));
        }
        f fVar = this.f5388n.f1537f;
        String str = a9.f2792a;
        synchronized (fVar.f1506E) {
            contains = fVar.f1504C.contains(str);
        }
        return !contains;
    }
}
