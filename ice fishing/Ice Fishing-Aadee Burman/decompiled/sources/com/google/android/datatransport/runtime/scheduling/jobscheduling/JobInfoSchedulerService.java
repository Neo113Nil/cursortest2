package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import F.n;
import Z1.i;
import Z1.o;
import Z2.e;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import j2.a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23552n = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i6 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        e a9 = i.a();
        a9.H(string);
        a9.f4172w = a.b(i);
        if (string2 != null) {
            a9.f4171v = Base64.decode(string2, 0);
        }
        f2.i iVar = o.a().f4164d;
        i n9 = a9.n();
        n nVar = new n(16, this, jobParameters);
        iVar.getClass();
        iVar.f37486e.execute(new f2.e(iVar, n9, i6, nVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
