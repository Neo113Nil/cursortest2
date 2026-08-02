package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class o extends JobServiceEngine {
    public final y0 a;
    public final Object b;
    public JobParameters c;

    public o(y0 y0Var) {
        super(y0Var);
        this.b = new Object();
        this.a = y0Var;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final n b() {
        synchronized (this.b) {
            try {
                JobParameters jobParameters = this.c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                dequeueWork.getIntent().setExtrasClassLoader(this.a.getClassLoader());
                return new n(this, dequeueWork);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.b(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        j jVar = this.a.c;
        if (jVar != null) {
            jVar.cancel(false);
        }
        synchronized (this.b) {
            this.c = null;
        }
        return true;
    }
}
