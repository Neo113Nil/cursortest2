package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import o4.o;
import p4.c;
import p4.e;
import p4.i;
import p4.n;
import s4.d;
import x4.j;
import x4.l;
import y4.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: j, reason: collision with root package name */
    public static final String f776j = o.f("SystemJobService");

    /* renamed from: g, reason: collision with root package name */
    public n f777g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f778h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final l f779i = new l(7);

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

    @Override // p4.c
    public final void b(j jVar, boolean z10) {
        JobParameters jobParameters;
        o.d().a(f776j, jVar.f8307a + " executed on JobScheduler");
        synchronized (this.f778h) {
            jobParameters = (JobParameters) this.f778h.remove(jVar);
        }
        this.f779i.m(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            n a6 = n.a(getApplicationContext());
            this.f777g = a6;
            a6.f5498f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o.d().g(f776j, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        n nVar = this.f777g;
        if (nVar != null) {
            nVar.f5498f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f777g == null) {
            o.d().a(f776j, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a6 = a(jobParameters);
        if (a6 == null) {
            o.d().b(f776j, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f778h) {
            try {
                if (this.f778h.containsKey(a6)) {
                    o.d().a(f776j, "Job is already being executed by SystemJobService: " + a6);
                    return false;
                }
                o.d().a(f776j, "onStartJob for " + a6);
                this.f778h.put(a6, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                a5.c cVar = new a5.c(13);
                if (s4.c.b(jobParameters) != null) {
                    cVar.f261g = Arrays.asList(s4.c.b(jobParameters));
                }
                if (s4.c.a(jobParameters) != null) {
                    cVar.f262h = Arrays.asList(s4.c.a(jobParameters));
                }
                if (i10 >= 28) {
                    cVar.f263i = d.a(jobParameters);
                }
                this.f777g.e(this.f779i.o(a6), cVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f777g == null) {
            o.d().a(f776j, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a6 = a(jobParameters);
        if (a6 == null) {
            o.d().b(f776j, "WorkSpec id not found!");
            return false;
        }
        o.d().a(f776j, "onStopJob for " + a6);
        synchronized (this.f778h) {
            this.f778h.remove(a6);
        }
        i m10 = this.f779i.m(a6);
        if (m10 != null) {
            n nVar = this.f777g;
            nVar.f5496d.a(new m(nVar, m10, false));
        }
        e eVar = this.f777g.f5498f;
        String str = a6.f8307a;
        synchronized (eVar.f5474r) {
            contains = eVar.f5472p.contains(str);
        }
        return !contains;
    }
}
