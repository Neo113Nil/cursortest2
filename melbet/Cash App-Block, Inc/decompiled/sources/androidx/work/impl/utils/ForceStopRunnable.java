package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.JobSchedulerExtKt;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("ForceStopRunnable");
    public static final long TEN_YEARS = 315360000000L;
    public final Context mContext;
    public final MemoryCacheService mPreferenceUtils;
    public int mRetryCount = 0;
    public final WorkManagerImpl mWorkManager;

    public class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String TAG = Logger$LogcatLogger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (Logger$LogcatLogger.get().mLoggingLevel <= 2) {
                Log.v(TAG, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.setAlarm(context);
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mPreferenceUtils = workManagerImpl.mPreferenceUtils;
    }

    public static void setAlarm(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + TEN_YEARS;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void forceStopRunnable() {
        boolean z;
        int i;
        PendingIntent broadcast;
        MemoryCacheService memoryCacheService = this.mPreferenceUtils;
        WorkManagerImpl workManagerImpl = this.mWorkManager;
        WorkDatabase workDatabase = workManagerImpl.mWorkDatabase;
        Configuration configuration = workManagerImpl.mConfiguration;
        MemoryCacheService memoryCacheService2 = workManagerImpl.mPreferenceUtils;
        workDatabase = workManagerImpl.mWorkDatabase;
        String str = SystemJobScheduler.TAG;
        Context context = this.mContext;
        JobScheduler wmJobScheduler = JobSchedulerExtKt.getWmJobScheduler(context);
        ArrayList pendingJobs = SystemJobScheduler.getPendingJobs(context, wmJobScheduler);
        List list = (List) DBUtil.performBlocking(workDatabase.systemIdInfoDao().__db, true, false, new TransactorKt$$ExternalSyntheticLambda0(18));
        HashSet hashSet = new HashSet(pendingJobs != null ? pendingJobs.size() : 0);
        if (pendingJobs != null && !pendingJobs.isEmpty()) {
            Iterator it = pendingJobs.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                WorkGenerationalId workGenerationalIdFromJobInfo = SystemJobScheduler.getWorkGenerationalIdFromJobInfo(jobInfo);
                if (workGenerationalIdFromJobInfo != null) {
                    hashSet.add(workGenerationalIdFromJobInfo.workSpecId);
                } else {
                    SystemJobScheduler.cancelJobById(wmJobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    Logger$LogcatLogger.get().debug(SystemJobScheduler.TAG, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(-1L, (String) it3.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
        WorkSpecDao_Impl workSpecDao2 = workDatabase.workSpecDao();
        WorkProgressDao_Impl workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> list2 = (List) DBUtil.performBlocking(workSpecDao2.__db, true, false, new TransactorKt$$ExternalSyntheticLambda0(20));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (WorkSpec workSpec : list2) {
                    WorkInfo.State state = WorkInfo.State.ENQUEUED;
                    String str2 = workSpec.id;
                    workSpecDao2.setState(state, str2);
                    workSpecDao2.setStopReason(-512, str2);
                    workSpecDao2.markWorkSpecScheduled(-1L, str2);
                }
            }
            DBUtil.performBlocking(workProgressDao.__db, false, true, new TransactorKt$$ExternalSyntheticLambda0(19));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            boolean z3 = z2 || z;
            Long longValue = ((WorkDatabase) memoryCacheService2.imageLoader).preferenceDao().getLongValue("reschedule_needed");
            int i2 = 14;
            String str3 = TAG;
            if (longValue != null && longValue.longValue() == 1) {
                Logger$LogcatLogger.get().debug(str3, "Rescheduling Workers.");
                workManagerImpl.rescheduleEligibleWork();
                memoryCacheService2.getClass();
                Preference preference = new Preference("reschedule_needed", 0L);
                PreferenceDao_Impl preferenceDao = ((WorkDatabase) memoryCacheService2.imageLoader).preferenceDao();
                DBUtil.performBlocking(preferenceDao.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(i2, preferenceDao, preference));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i3 = i >= 31 ? 570425344 : PKIFailureInfo.duplicateCertReq;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
            } catch (IllegalArgumentException | SecurityException e) {
                if (Logger$LogcatLogger.get().mLoggingLevel <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long longValue2 = ((WorkDatabase) memoryCacheService.imageLoader).preferenceDao().getLongValue("last_force_stop_ms");
                    long longValue3 = longValue2 != null ? longValue2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo m = a$$ExternalSyntheticBUOutline0.m((Object) historicalProcessExitReasons.get(i4));
                        if (m.getReason() == 10 && m.getTimestamp() >= longValue3) {
                            Logger$LogcatLogger.get().debug(str3, "Application was force-stopped, rescheduling.");
                            workManagerImpl.rescheduleEligibleWork();
                            configuration.clock.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            memoryCacheService.getClass();
                            Preference preference2 = new Preference("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                            PreferenceDao_Impl preferenceDao2 = ((WorkDatabase) memoryCacheService.imageLoader).preferenceDao();
                            DBUtil.performBlocking(preferenceDao2.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(i2, preferenceDao2, preference2));
                            return;
                        }
                    }
                }
            } else if (broadcast == null) {
                setAlarm(context);
                Logger$LogcatLogger.get().debug(str3, "Application was force-stopped, rescheduling.");
                workManagerImpl.rescheduleEligibleWork();
                configuration.clock.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                memoryCacheService.getClass();
                Preference preference22 = new Preference("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                PreferenceDao_Impl preferenceDao22 = ((WorkDatabase) memoryCacheService.imageLoader).preferenceDao();
                DBUtil.performBlocking(preferenceDao22.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(i2, preferenceDao22, preference22));
                return;
            }
            if (z3) {
                Logger$LogcatLogger.get().debug(str3, "Found unfinished work, scheduling it.");
                Schedulers.schedule(configuration, workDatabase, workManagerImpl.mSchedulers);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    public final boolean multiProcessChecks() {
        Configuration configuration = this.mWorkManager.mConfiguration;
        configuration.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = TAG;
        if (isEmpty) {
            Logger$LogcatLogger.get().debug(str, "The default process name was not specified.");
            return true;
        }
        boolean isDefaultProcess = ProcessUtils.isDefaultProcess(this.mContext, configuration);
        Logger$LogcatLogger.get().debug(str, "Is default app process = " + isDefaultProcess);
        return isDefaultProcess;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.mContext;
        String str = TAG;
        WorkManagerImpl workManagerImpl = this.mWorkManager;
        try {
            if (!multiProcessChecks()) {
                return;
            }
            while (true) {
                try {
                    PlatformKt.migrateDatabase(context);
                    Logger$LogcatLogger.get().debug(str, "Performing cleanup operations.");
                    try {
                        forceStopRunnable();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.mRetryCount + 1;
                        this.mRetryCount = i;
                        if (i >= 3) {
                            String str2 = Countries.isUserUnlocked(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            Logger$LogcatLogger.get().error(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            workManagerImpl.mConfiguration.getClass();
                            throw illegalStateException;
                        }
                        long j = i * 300;
                        String str3 = "Retrying after " + j;
                        if (Logger$LogcatLogger.get().mLoggingLevel <= 3) {
                            Log.d(str, str3, e);
                        }
                        try {
                            Thread.sleep(this.mRetryCount * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    Logger$LogcatLogger.get().error(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    workManagerImpl.mConfiguration.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            workManagerImpl.onForceStopRunnableCompleted();
        }
    }
}
