package kotlin.text;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import androidx.core.app.JobIntentService;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowKtor extends JobServiceEngine {
    public JobParameters CatchingFishCoroutine;
    public final JobIntentService CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public CatchingFishStateFlowKtor(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.CatchingFishSnackbar = new Object();
        this.CatchingFishParcelableFAB = jobIntentService;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.CatchingFishCoroutine = jobParameters;
        this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        CatchingFishMVISpannable catchingFishMVISpannable = this.CatchingFishParcelableFAB.CatchingFishWorkManager;
        if (catchingFishMVISpannable != null) {
            catchingFishMVISpannable.cancel(false);
        }
        synchronized (this.CatchingFishSnackbar) {
            this.CatchingFishCoroutine = null;
        }
        return true;
    }
}
