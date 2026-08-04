package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.c8.r;
import com.gamericefishpro.space.i8.d;
import com.gamericefishpro.space.i8.h;
import com.gamericefishpro.space.m8.a;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        c cVarA = j.a();
        cVarA.C(string);
        cVarA.i = a.b(i);
        if (string2 != null) {
            cVarA.e = Base64.decode(string2, 0);
        }
        h hVar = r.a().d;
        ((Executor) hVar.e).execute(new d(hVar, cVarA.e(), i2, new com.gamericefishpro.space.bb.h(5, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
