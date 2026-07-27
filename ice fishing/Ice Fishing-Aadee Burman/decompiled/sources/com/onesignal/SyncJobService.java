package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes2.dex */
public final class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
