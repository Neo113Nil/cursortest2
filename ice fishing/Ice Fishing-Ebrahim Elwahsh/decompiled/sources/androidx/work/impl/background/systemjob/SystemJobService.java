package androidx.work.impl.background.systemjob;

import J0.s;
import K0.c;
import K0.f;
import K0.p;
import N0.d;
import S0.j;
import S0.l;
import T0.m;
import Y2.e;
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
    public static final String f5499w = s.f("SystemJobService");

    /* renamed from: n, reason: collision with root package name */
    public p f5500n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f5501u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final l f5502v = new l(3);

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
    public final void b(j jVar, boolean z8) {
        JobParameters jobParameters;
        s.d().a(f5499w, jVar.f2905a + " executed on JobScheduler");
        synchronized (this.f5501u) {
            jobParameters = (JobParameters) this.f5501u.remove(jVar);
        }
        this.f5502v.t(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z8);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p b9 = p.b(getApplicationContext());
            this.f5500n = b9;
            b9.f1535f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s.d().g(f5499w, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f5500n;
        if (pVar != null) {
            pVar.f1535f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f5500n == null) {
            s.d().a(f5499w, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            s.d().b(f5499w, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f5501u) {
            try {
                if (this.f5501u.containsKey(a9)) {
                    s.d().a(f5499w, "Job is already being executed by SystemJobService: " + a9);
                    return false;
                }
                s.d().a(f5499w, "onStartJob for " + a9);
                this.f5501u.put(a9, jobParameters);
                int i = Build.VERSION.SDK_INT;
                e eVar = new e(6);
                if (d.b(jobParameters) != null) {
                    eVar.f3964v = Arrays.asList(d.b(jobParameters));
                }
                if (d.a(jobParameters) != null) {
                    eVar.f3963u = Arrays.asList(d.a(jobParameters));
                }
                if (i >= 28) {
                    eVar.f3965w = N0.e.a(jobParameters);
                }
                this.f5500n.f(this.f5502v.v(a9), eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f5500n == null) {
            s.d().a(f5499w, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            s.d().b(f5499w, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f5499w, "onStopJob for " + a9);
        synchronized (this.f5501u) {
            this.f5501u.remove(a9);
        }
        K0.j t9 = this.f5502v.t(a9);
        if (t9 != null) {
            p pVar = this.f5500n;
            pVar.f1533d.i(new m(pVar, t9, false));
        }
        f fVar = this.f5500n.f1535f;
        String str = a9.f2905a;
        synchronized (fVar.f1503E) {
            contains = fVar.f1501C.contains(str);
        }
        return !contains;
    }
}
