package com.yandex.music.core.job;

import android.app.job.JobParameters;
import defpackage.hag;
import defpackage.jnn;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.l18;
import defpackage.s2f;
import defpackage.su4;
import defpackage.u2f;

/* loaded from: classes3.dex */
public final class JobService extends android.app.job.JobService {
    public final jyr a = l18.b.b(hag.I(u2f.class), true);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((u2f) this.a.getValue()).d = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ((u2f) this.a.getValue()).d = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        s2f s2fVar;
        jobParameters.getClass();
        u2f u2fVar = (u2f) this.a.getValue();
        u2fVar.getClass();
        int jobId = jobParameters.getJobId();
        jnn jnnVar = (jnn) u2fVar.c.a.get(Integer.valueOf(jobId));
        if (jnnVar == null) {
            s2fVar = null;
            su4.s(2, null, k5r.i(jobId, "Job isn't registered in JobsRegistry, id="), null);
        } else {
            s2fVar = (s2f) jnnVar.b.invoke();
        }
        if (s2fVar == null) {
            return false;
        }
        u2fVar.b.put(Integer.valueOf(jobParameters.getJobId()), s2fVar);
        s2fVar.a = u2fVar.e;
        s2fVar.b = jobParameters;
        s2fVar.b(u2fVar.a, jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        jobParameters.getClass();
        u2f u2fVar = (u2f) this.a.getValue();
        u2fVar.getClass();
        s2f s2fVar = (s2f) u2fVar.b.remove(Integer.valueOf(jobParameters.getJobId()));
        if (s2fVar != null) {
            return s2fVar.c(u2fVar.a, jobParameters);
        }
        return false;
    }
}
