package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda4;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.maps.zzai;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int $r8$clinit = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string2 = jobParameters.getExtras().getString("backendName");
        String string3 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(getApplicationContext());
        SVG builder = AutoValue_TransportContext.builder();
        builder.setBackendName(string2);
        builder.idToElementMap = PriorityMapping.valueOf(i);
        if (string3 != null) {
            builder.cssRules = Base64.decode(string3, 0);
        }
        zzai zzaiVar = TransportRuntime.getInstance().uploader;
        ((Executor) zzaiVar.zad).execute(new EncoderImpl$$ExternalSyntheticLambda4(zzaiVar, builder.build(), i2, new q4$$ExternalSyntheticLambda0(25, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
