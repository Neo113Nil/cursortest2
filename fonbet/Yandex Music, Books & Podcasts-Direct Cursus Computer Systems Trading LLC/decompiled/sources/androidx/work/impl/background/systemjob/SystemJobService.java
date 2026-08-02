package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.a4w;
import defpackage.b6e;
import defpackage.g4w;
import defpackage.hrg;
import defpackage.htm;
import defpackage.jo0;
import defpackage.jsg;
import defpackage.knn;
import defpackage.rf0;
import defpackage.rob;
import defpackage.ucr;
import defpackage.ujl;
import defpackage.xq0;
import defpackage.y8p;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements rob {
    public static final String e = jsg.n("SystemJobService");
    public g4w a;
    public final HashMap b = new HashMap();
    public final knn c = new knn(9);
    public y8p d;

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        xq0.q(hrg.q("Cannot invoke ", str, " on a background thread"));
    }

    public static a4w c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new a4w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.rob
    public final void a(a4w a4wVar, boolean z) {
        b("onExecuted");
        jsg.j().e(e, a4wVar.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(a4wVar);
        this.c.a(a4wVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            g4w d = g4w.d(getApplicationContext());
            this.a = d;
            htm htmVar = d.f;
            this.d = new y8p(htmVar, d.d);
            htmVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                jsg.j().o(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                b6e.o("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        g4w g4wVar = this.a;
        if (g4wVar != null) {
            htm htmVar = g4wVar.f;
            synchronized (htmVar.k) {
                htmVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        g4w g4wVar = this.a;
        String str = e;
        if (g4wVar == null) {
            jsg.j().e(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        a4w c = c(jobParameters);
        if (c == null) {
            jsg.j().g(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.b;
        if (hashMap.containsKey(c)) {
            jsg.j().e(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        jsg.j().e(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        ujl ujlVar = new ujl();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            jo0.o(jobParameters);
        }
        this.d.n(this.c.s(c), ujlVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        b("onStopJob");
        if (this.a == null) {
            jsg.j().e(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        a4w c = c(jobParameters);
        if (c == null) {
            jsg.j().g(e, "WorkSpec id not found!");
            return false;
        }
        jsg.j().e(e, "onStopJob for " + c);
        this.b.remove(c);
        ucr a = this.c.a(c);
        if (a != null) {
            int o = Build.VERSION.SDK_INT >= 31 ? rf0.o(jobParameters) : -512;
            y8p y8pVar = this.d;
            y8pVar.getClass();
            y8pVar.o(a, o);
        }
        htm htmVar = this.a.f;
        String str = c.a;
        synchronized (htmVar.k) {
            contains = htmVar.i.contains(str);
        }
        return !contains;
    }
}
