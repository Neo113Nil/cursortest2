package s4;

import android.app.job.JobParameters;
import android.net.Network;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
