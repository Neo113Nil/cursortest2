package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class zzcf {
    public static final Method zza;
    public static final Method zzb;

    static {
        Method method;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzb = method2;
    }

    public static void zza(Context context, JobInfo jobInfo) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        Method method = zza;
        if (method == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfo);
            return;
        }
        int i = 0;
        Method method2 = zzb;
        if (method2 != null) {
            try {
                Integer num = (Integer) method2.invoke(UserHandle.class, null);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
            jobScheduler.schedule(jobInfo);
        }
    }
}
