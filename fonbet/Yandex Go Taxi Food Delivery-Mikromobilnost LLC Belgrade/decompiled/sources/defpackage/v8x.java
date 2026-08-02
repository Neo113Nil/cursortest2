package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class v8x {
    public static final String a = hgz.o("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        JobScheduler forNamespace;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        return forNamespace;
    }
}
