package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Logger$LogcatLogger;
import com.squareup.cash.localization.LanguageManagerKt;
import java.util.List;

/* loaded from: classes.dex */
public abstract class JobSchedulerExtKt {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("SystemJobScheduler");

    public static final List getSafePendingJobs(JobScheduler jobScheduler) {
        jobScheduler.getClass();
        try {
            jobScheduler.getClass();
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
            return allPendingJobs;
        } catch (Throwable th) {
            Logger$LogcatLogger.get().error(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler getWmJobScheduler(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? LanguageManagerKt.forNamespace(jobScheduler) : jobScheduler;
    }
}
