package N0;

import android.app.job.JobParameters;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class e {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
