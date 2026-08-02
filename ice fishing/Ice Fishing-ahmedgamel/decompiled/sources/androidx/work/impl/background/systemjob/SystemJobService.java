package androidx.work.impl.background.systemjob;

import J0.r;
import K0.c;
import K0.f;
import K0.p;
import N0.d;
import S0.j;
import T0.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import b3.e;
import com.google.android.gms.internal.ads.C3067cm;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: w, reason: collision with root package name */
    public static final String f5352w = r.f("SystemJobService");

    /* renamed from: n, reason: collision with root package name */
    public p f5353n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f5354u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final C3067cm f5355v = new C3067cm(2);

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
    public final void b(j jVar, boolean z6) {
        JobParameters jobParameters;
        r.d().a(f5352w, jVar.f2921a + " executed on JobScheduler");
        synchronized (this.f5354u) {
            jobParameters = (JobParameters) this.f5354u.remove(jVar);
        }
        this.f5355v.F(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z6);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p b9 = p.b(getApplicationContext());
            this.f5353n = b9;
            b9.f1646f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            r.d().g(f5352w, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f5353n;
        if (pVar != null) {
            pVar.f1646f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f5353n == null) {
            r.d().a(f5352w, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            r.d().b(f5352w, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f5354u) {
            try {
                if (this.f5354u.containsKey(a9)) {
                    r.d().a(f5352w, "Job is already being executed by SystemJobService: " + a9);
                    return false;
                }
                r.d().a(f5352w, "onStartJob for " + a9);
                this.f5354u.put(a9, jobParameters);
                int i = Build.VERSION.SDK_INT;
                e eVar = new e(7);
                if (N0.c.b(jobParameters) != null) {
                    eVar.f5558v = Arrays.asList(N0.c.b(jobParameters));
                }
                if (N0.c.a(jobParameters) != null) {
                    eVar.f5557u = Arrays.asList(N0.c.a(jobParameters));
                }
                if (i >= 28) {
                    eVar.f5559w = d.a(jobParameters);
                }
                this.f5353n.f(this.f5355v.H(a9), eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f5353n == null) {
            r.d().a(f5352w, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            r.d().b(f5352w, "WorkSpec id not found!");
            return false;
        }
        r.d().a(f5352w, "onStopJob for " + a9);
        synchronized (this.f5354u) {
            this.f5354u.remove(a9);
        }
        K0.j F8 = this.f5355v.F(a9);
        if (F8 != null) {
            p pVar = this.f5353n;
            pVar.f1644d.h(new m(pVar, F8, false));
        }
        f fVar = this.f5353n.f1646f;
        String str = a9.f2921a;
        synchronized (fVar.f1615E) {
            contains = fVar.f1613C.contains(str);
        }
        return !contains;
    }
}
