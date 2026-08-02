package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z2f {
    public static final String a = jsg.n("SystemJobScheduler");

    public static final List a(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            jobScheduler.getClass();
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            jsg.j().h(a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? sb.e(jobScheduler) : jobScheduler;
    }
}
