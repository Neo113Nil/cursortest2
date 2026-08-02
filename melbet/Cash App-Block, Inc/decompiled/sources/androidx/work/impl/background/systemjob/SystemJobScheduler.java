package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.work.Configuration;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.Logger$LogcatLogger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda4;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class SystemJobScheduler implements Scheduler {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("SystemJobScheduler");
    public final Configuration mConfiguration;
    public final Context mContext;
    public final JobScheduler mJobScheduler;
    public final SystemJobInfoConverter mSystemJobInfoConverter;
    public final WorkDatabase mWorkDatabase;

    public SystemJobScheduler(Context context, WorkDatabase workDatabase, Configuration configuration) {
        JobScheduler wmJobScheduler = JobSchedulerExtKt.getWmJobScheduler(context);
        SystemJobInfoConverter systemJobInfoConverter = new SystemJobInfoConverter(context, configuration.clock, configuration.isMarkingJobsAsImportantWhileForeground);
        this.mContext = context;
        this.mJobScheduler = wmJobScheduler;
        this.mSystemJobInfoConverter = systemJobInfoConverter;
        this.mWorkDatabase = workDatabase;
        this.mConfiguration = configuration;
    }

    public static void cancelJobById(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            Logger$LogcatLogger.get().error(TAG, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList getPendingJobs(Context context, JobScheduler jobScheduler) {
        List<JobInfo> safePendingJobs = JobSchedulerExtKt.getSafePendingJobs(jobScheduler);
        if (safePendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(safePendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : safePendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static WorkGenerationalId getWorkGenerationalIdFromJobInfo(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void cancel(String str) {
        ArrayList arrayList;
        Context context = this.mContext;
        JobScheduler jobScheduler = this.mJobScheduler;
        ArrayList pendingJobs = getPendingJobs(context, jobScheduler);
        if (pendingJobs == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = pendingJobs.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                WorkGenerationalId workGenerationalIdFromJobInfo = getWorkGenerationalIdFromJobInfo(jobInfo);
                if (workGenerationalIdFromJobInfo != null && str.equals(workGenerationalIdFromJobInfo.workSpecId)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cancelJobById(jobScheduler, ((Integer) it2.next()).intValue());
        }
        SystemIdInfoDao_Impl systemIdInfoDao = this.mWorkDatabase.systemIdInfoDao();
        systemIdInfoDao.getClass();
        str.getClass();
        DBUtil.performBlocking(systemIdInfoDao.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str, 3));
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public final void schedule(WorkSpec... workSpecArr) {
        int intValue;
        Configuration configuration = this.mConfiguration;
        WorkDatabase workDatabase = this.mWorkDatabase;
        workDatabase.getClass();
        final Extras.Key key = new Extras.Key();
        key.f61default = workDatabase;
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
                String str = workSpec.id;
                WorkSpec workSpec2 = workSpecDao.getWorkSpec(str);
                String str2 = TAG;
                if (workSpec2 == null) {
                    Logger$LogcatLogger.get().warning(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger$LogcatLogger.get().warning(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    WorkGenerationalId generationalId = Room.generationalId(workSpec);
                    int i = generationalId.generation;
                    String str3 = generationalId.workSpecId;
                    SystemIdInfoDao_Impl systemIdInfoDao = workDatabase.systemIdInfoDao();
                    systemIdInfoDao.getClass();
                    str3.getClass();
                    SystemIdInfo systemIdInfo = (SystemIdInfo) DBUtil.performBlocking(systemIdInfoDao.__db, true, false, new WorkSpecDao_Impl$$ExternalSyntheticLambda4(str3, i, 1));
                    if (systemIdInfo != null) {
                        intValue = systemIdInfo.systemId;
                    } else {
                        configuration.getClass();
                        final int i2 = configuration.maxJobSchedulerId;
                        Object runInTransaction = ((WorkDatabase) key.f61default).runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.IdGenerator$$ExternalSyntheticLambda0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) Extras.Key.this.f61default;
                                Long longValue = workDatabase2.preferenceDao().getLongValue("next_job_scheduler_id");
                                int i3 = 0;
                                int longValue2 = longValue != null ? (int) longValue.longValue() : 0;
                                int i4 = longValue2 == Integer.MAX_VALUE ? 0 : longValue2 + 1;
                                PreferenceDao_Impl preferenceDao = workDatabase2.preferenceDao();
                                DBUtil.performBlocking(preferenceDao.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(14, preferenceDao, new Preference("next_job_scheduler_id", Long.valueOf(i4))));
                                if (longValue2 < 0 || longValue2 > i2) {
                                    PreferenceDao_Impl preferenceDao2 = workDatabase2.preferenceDao();
                                    DBUtil.performBlocking(preferenceDao2.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(14, preferenceDao2, new Preference("next_job_scheduler_id", 1L)));
                                } else {
                                    i3 = longValue2;
                                }
                                return Integer.valueOf(i3);
                            }
                        });
                        runInTransaction.getClass();
                        intValue = ((Number) runInTransaction).intValue();
                    }
                    if (systemIdInfo == null) {
                        SystemIdInfo systemIdInfo2 = new SystemIdInfo(str3, i, intValue);
                        SystemIdInfoDao_Impl systemIdInfoDao2 = workDatabase.systemIdInfoDao();
                        systemIdInfoDao2.getClass();
                        DBUtil.performBlocking(systemIdInfoDao2.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(15, systemIdInfoDao2, systemIdInfo2));
                    }
                    scheduleInternal(workSpec, intValue);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public final void scheduleInternal(WorkSpec workSpec, int i) {
        JobInfo convert = this.mSystemJobInfoConverter.convert(workSpec, i);
        Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = workSpec.id;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String sb2 = sb.toString();
        String str2 = TAG;
        logger$LogcatLogger.debug(str2, sb2);
        try {
            if (this.mJobScheduler.schedule(convert) == 0) {
                Logger$LogcatLogger.get().warning(str2, "Unable to schedule work ID " + str);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    Logger$LogcatLogger.get().debug(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    scheduleInternal(workSpec, i);
                }
            }
        } catch (IllegalStateException e) {
            String str3 = JobSchedulerExtKt.TAG;
            Context context = this.mContext;
            context.getClass();
            WorkDatabase workDatabase = this.mWorkDatabase;
            workDatabase.getClass();
            Configuration configuration = this.mConfiguration;
            configuration.getClass();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) DBUtil.performBlocking(workDatabase.workSpecDao().__db, true, false, new Data$$ExternalSyntheticLambda0(5))).size();
            String str4 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler wmJobScheduler = JobSchedulerExtKt.getWmJobScheduler(context);
                List safePendingJobs = JobSchedulerExtKt.getSafePendingJobs(wmJobScheduler);
                if (safePendingJobs != null) {
                    ArrayList pendingJobs = getPendingJobs(context, wmJobScheduler);
                    int size2 = pendingJobs != null ? safePendingJobs.size() - pendingJobs.size() : 0;
                    String m = size2 == 0 ? null : Boxes$$ExternalSyntheticOutline1.m(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList pendingJobs2 = getPendingJobs(context, (JobScheduler) systemService);
                    int size3 = pendingJobs2 != null ? pendingJobs2.size() : 0;
                    str4 = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{safePendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", m, size3 != 0 ? Boxes$$ExternalSyntheticOutline1.m(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, 0, null, null, 62);
                }
            } else {
                ArrayList pendingJobs3 = getPendingJobs(context, JobSchedulerExtKt.getWmJobScheduler(context));
                if (pendingJobs3 != null) {
                    str4 = pendingJobs3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder m2 = re$$ExternalSyntheticOutline0.m("JobScheduler ", i3, " job limit exceeded.\nIn JobScheduler there are ", str4, ".\nThere are ");
            m2.append(size);
            m2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m2, configuration.maxSchedulerLimit, '.');
            Logger$LogcatLogger.get().error(str2, m3);
            a$$ExternalSyntheticBUOutline0.m(m3, e);
        } catch (Throwable th) {
            Logger$LogcatLogger.get().error(str2, "Unable to schedule " + workSpec, th);
        }
    }
}
