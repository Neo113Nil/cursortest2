package kotlin.text;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* loaded from: classes.dex */
public final class CatchingFishPicassoLiveData implements CatchingFishViewSharedFlow {
    public final JobWorkItem CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishStateFlowKtor CatchingFishSnackbar;

    public CatchingFishPicassoLiveData(CatchingFishStateFlowKtor catchingFishStateFlowKtor, JobWorkItem jobWorkItem) {
        this.CatchingFishSnackbar = catchingFishStateFlowKtor;
        this.CatchingFishParcelableFAB = jobWorkItem;
    }

    @Override // kotlin.text.CatchingFishViewSharedFlow
    public final void CatchingFishParcelableFAB() {
        synchronized (this.CatchingFishSnackbar.CatchingFishSnackbar) {
            try {
                JobParameters jobParameters = this.CatchingFishSnackbar.CatchingFishCoroutine;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.CatchingFishParcelableFAB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.text.CatchingFishViewSharedFlow
    public final Intent getIntent() {
        Intent intent;
        intent = this.CatchingFishParcelableFAB.getIntent();
        return intent;
    }
}
