package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b2.i;
import b2.n;
import b3.e;
import l2.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f24332n = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        n.b(getApplicationContext());
        e a9 = i.a();
        a9.H(string);
        a9.f5559w = a.b(i);
        if (string2 != null) {
            a9.f5558v = Base64.decode(string2, 0);
        }
        h2.i iVar = n.a().f5551d;
        i o4 = a9.o();
        F.n nVar = new F.n(18, this, jobParameters);
        iVar.getClass();
        iVar.f38110e.execute(new h2.e(iVar, o4, i4, nVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
