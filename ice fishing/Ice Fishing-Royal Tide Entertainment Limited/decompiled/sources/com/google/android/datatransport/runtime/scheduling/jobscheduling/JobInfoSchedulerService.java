package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBundleMVIHilt;
import kotlin.text.CatchingFishEspressoFlux;
import kotlin.text.CatchingFishGlideDagger;
import kotlin.text.CatchingFishGsonRetrofit;
import kotlin.text.CatchingFishMVVMWorkManager;
import kotlin.text.CatchingFishRoomGlide;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int CatchingFishReduxKtor = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        CatchingFishGlideDagger.CatchingFishSnackbar(getApplicationContext());
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
        CatchingFishParcelableFAB.CatchingFishMoshiDaggerHilt(string);
        CatchingFishParcelableFAB.CatchingFishViewModelScope = CatchingFishRoomGlide.CatchingFishSnackbar(i);
        if (string2 != null) {
            CatchingFishParcelableFAB.CatchingFishWorkManager = Base64.decode(string2, 0);
        }
        CatchingFishGsonRetrofit catchingFishGsonRetrofit = CatchingFishGlideDagger.CatchingFishParcelableFAB().CatchingFishReduxKtor;
        catchingFishGsonRetrofit.CatchingFishDaggerWebsocket.execute(new CatchingFishMVVMWorkManager(catchingFishGsonRetrofit, CatchingFishParcelableFAB.CatchingFishCoroutineFlow(), i2, new CatchingFishEspressoFlux(12, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
