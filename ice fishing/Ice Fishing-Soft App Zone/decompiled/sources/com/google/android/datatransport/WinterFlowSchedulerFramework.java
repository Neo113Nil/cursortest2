package com.google.android.datatransport;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import androidx.core.app.JobIntentService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSchedulerFramework extends JobServiceEngine {
    public final Object WinterFlowHookDataSource;
    public final JobIntentService WinterFlowRouterStructure;

    public WinterFlowSchedulerFramework(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.WinterFlowHookDataSource = new Object();
        this.WinterFlowRouterStructure = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        throw null;
    }
}
