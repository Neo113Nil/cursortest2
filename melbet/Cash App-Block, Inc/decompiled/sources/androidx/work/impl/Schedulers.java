package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.SystemClock;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda12;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Schedulers {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("Schedulers");

    public static void markScheduled(WorkSpecDao_Impl workSpecDao_Impl, SystemClock systemClock, List list) {
        if (list.size() > 0) {
            systemClock.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao_Impl.markWorkSpecScheduled(currentTimeMillis, ((WorkSpec) it.next()).id);
            }
        }
    }

    public static void schedule(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            RoomDatabase roomDatabase = workSpecDao.__db;
            RoomDatabase roomDatabase2 = workSpecDao.__db;
            List list2 = (List) DBUtil.performBlocking(roomDatabase, true, false, new TransactorKt$$ExternalSyntheticLambda0(21));
            markScheduled(workSpecDao, configuration.clock, list2);
            List list3 = (List) DBUtil.performBlocking(roomDatabase2, true, false, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(configuration.maxSchedulerLimit, 0));
            markScheduled(workSpecDao, configuration.clock, list3);
            list3.addAll(list2);
            List list4 = (List) DBUtil.performBlocking(roomDatabase2, true, false, new TransactorKt$$ExternalSyntheticLambda0(23));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (list3.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) list3.toArray(new WorkSpec[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Scheduler scheduler = (Scheduler) it.next();
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (list4.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) list4.toArray(new WorkSpec[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler2 = (Scheduler) it2.next();
                    if (!scheduler2.hasLimitedSchedulingSlots()) {
                        scheduler2.schedule(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
