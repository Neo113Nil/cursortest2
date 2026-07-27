package kotlin.text;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* loaded from: classes.dex */
public final class CatchingFishMVISpannable extends AsyncTask {
    public final /* synthetic */ JobIntentService CatchingFishParcelableFAB;

    public CatchingFishMVISpannable(JobIntentService jobIntentService) {
        this.CatchingFishParcelableFAB = jobIntentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[LOOP:0: B:2:0x0002->B:12:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        CatchingFishViewSharedFlow catchingFishViewSharedFlow;
        JobWorkItem dequeueWork;
        Intent intent;
        while (true) {
            JobIntentService jobIntentService = this.CatchingFishParcelableFAB;
            CatchingFishStateFlowKtor catchingFishStateFlowKtor = jobIntentService.CatchingFishReduxKtor;
            if (catchingFishStateFlowKtor != null) {
                synchronized (catchingFishStateFlowKtor.CatchingFishSnackbar) {
                    try {
                        JobParameters jobParameters = catchingFishStateFlowKtor.CatchingFishCoroutine;
                        if (jobParameters != null) {
                            dequeueWork = jobParameters.dequeueWork();
                            if (dequeueWork != null) {
                                intent = dequeueWork.getIntent();
                                intent.setExtrasClassLoader(catchingFishStateFlowKtor.CatchingFishParcelableFAB.getClassLoader());
                                catchingFishViewSharedFlow = new CatchingFishPicassoLiveData(catchingFishStateFlowKtor, dequeueWork);
                                if (catchingFishViewSharedFlow == null) {
                                    return null;
                                }
                                JobIntentService jobIntentService2 = this.CatchingFishParcelableFAB;
                                catchingFishViewSharedFlow.getIntent();
                                jobIntentService2.CatchingFishSnackbar();
                                catchingFishViewSharedFlow.CatchingFishParcelableFAB();
                            }
                        }
                    } finally {
                    }
                }
                if (catchingFishViewSharedFlow == null) {
                }
            } else {
                synchronized (jobIntentService.CatchingFishViewModelFAB) {
                    try {
                        catchingFishViewSharedFlow = jobIntentService.CatchingFishViewModelFAB.size() > 0 ? (CatchingFishViewSharedFlow) jobIntentService.CatchingFishViewModelFAB.remove(0) : null;
                    } finally {
                    }
                }
                if (catchingFishViewSharedFlow == null) {
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.CatchingFishParcelableFAB.CatchingFishCoroutine();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.CatchingFishParcelableFAB.CatchingFishCoroutine();
    }
}
