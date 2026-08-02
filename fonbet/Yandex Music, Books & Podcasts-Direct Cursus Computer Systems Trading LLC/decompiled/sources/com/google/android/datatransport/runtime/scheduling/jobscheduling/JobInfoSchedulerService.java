package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.de2;
import defpackage.hgp;
import defpackage.juc;
import defpackage.kv0;
import defpackage.nsh;
import defpackage.qsm;
import defpackage.t9t;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        t9t.b(getApplicationContext());
        nsh a2 = de2.a();
        a2.L(string);
        a2.d = qsm.b(i);
        if (string2 != null) {
            a2.c = Base64.decode(string2, 0);
        }
        hgp hgpVar = t9t.a().d;
        ((Executor) hgpVar.f).execute(new kv0(hgpVar, a2.c(), i2, new juc(8, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
