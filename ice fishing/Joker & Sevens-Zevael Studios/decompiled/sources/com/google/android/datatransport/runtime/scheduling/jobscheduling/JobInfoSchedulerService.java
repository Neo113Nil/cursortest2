package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.d;
import a5.c;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c6.e;
import c6.l;
import g6.a;
import java.util.concurrent.Executor;
import w5.i;
import w5.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1402g = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        c a6 = i.a();
        a6.L(string);
        a6.f263i = a.b(i10);
        if (string2 != null) {
            a6.f261g = Base64.decode(string2, 0);
        }
        l lVar = o.a().f7707d;
        ((Executor) lVar.f1272e).execute(new e(lVar, a6.n(), i11, new d(2, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
