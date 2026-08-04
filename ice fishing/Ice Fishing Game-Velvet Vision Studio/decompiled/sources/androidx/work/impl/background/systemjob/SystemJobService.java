package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.c;
import com.gamericefishpro.space.m6.f;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.p6.d;
import com.gamericefishpro.space.u6.e;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.v6.l;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements c {
    public static final String v = q.d("SystemJobService");
    public o d;
    public final HashMap e = new HashMap();
    public final e i = new e(6);

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

    @Override // com.gamericefishpro.space.m6.c
    public final void f(j jVar, boolean z) {
        JobParameters jobParameters;
        q.c().getClass();
        synchronized (this.e) {
            jobParameters = (JobParameters) this.e.remove(jVar);
        }
        this.i.i(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o oVarA = o.a(getApplicationContext());
            this.d = oVarA;
            oVarA.f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            q.c().e(v, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.d;
        if (oVar != null) {
            oVar.f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.d == null) {
            q.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.c().a(v, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.e) {
            try {
                if (this.e.containsKey(jVarA)) {
                    q qVarC = q.c();
                    jVarA.toString();
                    qVarC.getClass();
                    return false;
                }
                q qVarC2 = q.c();
                jVarA.toString();
                qVarC2.getClass();
                this.e.put(jVarA, jobParameters);
                int i = Build.VERSION.SDK_INT;
                com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(17);
                if (d.b(jobParameters) != null) {
                    cVar.i = Arrays.asList(d.b(jobParameters));
                }
                if (d.a(jobParameters) != null) {
                    cVar.e = Arrays.asList(d.a(jobParameters));
                }
                if (i >= 28) {
                    cVar.v = com.gamericefishpro.space.p6.e.a(jobParameters);
                }
                this.d.e(this.i.l(jVarA), cVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.d == null) {
            q.c().getClass();
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            q.c().a(v, "WorkSpec id not found!");
            return false;
        }
        q qVarC = q.c();
        jVarA.toString();
        qVarC.getClass();
        synchronized (this.e) {
            this.e.remove(jVarA);
        }
        com.gamericefishpro.space.m6.j jVarI = this.i.i(jVarA);
        if (jVarI != null) {
            o oVar = this.d;
            oVar.d.a(new l(oVar, jVarI, false));
        }
        f fVar = this.d.f;
        String str = jVarA.a;
        synchronized (fVar.E) {
            zContains = fVar.C.contains(str);
        }
        return !zContains;
    }
}
