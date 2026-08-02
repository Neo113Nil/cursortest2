package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger$LogcatLogger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class EnqueueRunnable {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        HashSet prerequisitesFor = WorkContinuationImpl.prerequisitesFor(workContinuationImpl);
        WorkManagerImpl workManagerImpl = workContinuationImpl.mWorkManagerImpl;
        List list2 = workContinuationImpl.mWork;
        String[] strArr = (String[]) prerequisitesFor.toArray(new String[0]);
        String str = workContinuationImpl.mName;
        ExistingWorkPolicy existingWorkPolicy = workContinuationImpl.mExistingWorkPolicy;
        workManagerImpl.mConfiguration.clock.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = workManagerImpl.mWorkDatabase;
        boolean z8 = strArr != null && strArr.length > 0;
        if (z8) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str2 : strArr) {
                WorkSpec workSpec = workDatabase2.workSpecDao().getWorkSpec(str2);
                if (workSpec == null) {
                    Logger$LogcatLogger.get().error(TAG, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                WorkInfo.State state = workSpec.state;
                z &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z3 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (isEmpty || z8) {
            list = list2;
        } else {
            WorkSpecDao_Impl workSpecDao = workDatabase2.workSpecDao();
            workSpecDao.getClass();
            str.getClass();
            list = list2;
            List<WorkSpec.IdAndState> list3 = (List) DBUtil.performBlocking(workSpecDao.__db, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 5));
            if (!list3.isEmpty()) {
                int i = 12;
                if (existingWorkPolicy != ExistingWorkPolicy.APPEND && existingWorkPolicy != ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state2 = ((WorkSpec.IdAndState) it2.next()).state;
                            if (state2 != WorkInfo.State.ENQUEUED && state2 != WorkInfo.State.RUNNING) {
                            }
                            z7 = false;
                            z6 = true;
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.runInTransaction(new Processor$$ExternalSyntheticLambda1(3, workDatabase2, str, workManagerImpl));
                    WorkSpecDao_Impl workSpecDao2 = workDatabase2.workSpecDao();
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String str3 = ((WorkSpec.IdAndState) it3.next()).id;
                        workSpecDao2.getClass();
                        str3.getClass();
                        DBUtil.performBlocking(workSpecDao2.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str3, i));
                        workSpecDao2 = workSpecDao2;
                        i = 12;
                    }
                    z4 = isEmpty;
                    workDatabase = workDatabase2;
                    z5 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    z6 = true;
                    z7 = z5;
                    workContinuationImpl.mEnqueued = z6;
                    return z7;
                }
                DependencyDao_Impl dependencyDao = workDatabase2.dependencyDao();
                ArrayList arrayList = new ArrayList();
                for (WorkSpec.IdAndState idAndState : list3) {
                    String str4 = idAndState.id;
                    dependencyDao.getClass();
                    str4.getClass();
                    boolean z9 = isEmpty;
                    DependencyDao_Impl dependencyDao_Impl = dependencyDao;
                    WorkDatabase workDatabase3 = workDatabase2;
                    if (!((Boolean) DBUtil.performBlocking(dependencyDao.__db, true, false, new IconKt$$ExternalSyntheticLambda0(str4, 12))).booleanValue()) {
                        WorkInfo.State state3 = idAndState.state;
                        boolean z10 = (state3 == WorkInfo.State.SUCCEEDED) & z;
                        if (state3 == WorkInfo.State.FAILED) {
                            z3 = true;
                        } else if (state3 == WorkInfo.State.CANCELLED) {
                            z2 = true;
                        }
                        arrayList.add(idAndState.id);
                        z = z10;
                    }
                    isEmpty = z9;
                    dependencyDao = dependencyDao_Impl;
                    workDatabase2 = workDatabase3;
                }
                z4 = isEmpty;
                workDatabase = workDatabase2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                    WorkSpecDao_Impl workSpecDao3 = workDatabase.workSpecDao();
                    workSpecDao3.getClass();
                    RoomDatabase roomDatabase = workSpecDao3.__db;
                    Iterator it4 = ((List) DBUtil.performBlocking(roomDatabase, true, false, new ImageKt$$ExternalSyntheticLambda0(str, 5))).iterator();
                    while (it4.hasNext()) {
                        String str5 = ((WorkSpec.IdAndState) it4.next()).id;
                        str5.getClass();
                        DBUtil.performBlocking(roomDatabase, false, true, new ImageKt$$ExternalSyntheticLambda0(str5, 12));
                    }
                    z2 = false;
                    z3 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z8 = strArr.length > 0;
                z5 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) it.next();
                    WorkSpec workSpec2 = oneTimeWorkRequest.workSpec;
                    UUID uuid = oneTimeWorkRequest.id;
                    if (!z8 || z) {
                        workSpec2.lastEnqueueTime = currentTimeMillis;
                    } else if (z3) {
                        workSpec2.state = WorkInfo.State.FAILED;
                    } else if (z2) {
                        workSpec2.state = WorkInfo.State.CANCELLED;
                    } else {
                        workSpec2.state = WorkInfo.State.BLOCKED;
                    }
                    if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                        z5 = true;
                    }
                    WorkSpecDao_Impl workSpecDao4 = workDatabase.workSpecDao();
                    workManagerImpl.mSchedulers.getClass();
                    WorkManagerImpl workManagerImpl2 = workManagerImpl;
                    boolean hasKeyWithValueOfType = workSpec2.input.hasKeyWithValueOfType("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                    boolean z11 = z5;
                    Iterator it5 = it;
                    boolean hasKeyWithValueOfType2 = workSpec2.input.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    boolean hasKeyWithValueOfType3 = workSpec2.input.hasKeyWithValueOfType("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (!hasKeyWithValueOfType && hasKeyWithValueOfType2 && hasKeyWithValueOfType3) {
                        String str6 = workSpec2.workerClassName;
                        Data.Builder builder = new Data.Builder();
                        Data data = workSpec2.input;
                        data.getClass();
                        builder.putAll(data.values);
                        ((LinkedHashMap) builder.values).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str6);
                        Data build = builder.build();
                        String str7 = workSpec2.id;
                        WorkInfo.State state4 = workSpec2.state;
                        String str8 = workSpec2.inputMergerClassName;
                        Data data2 = workSpec2.output;
                        long j = workSpec2.initialDelay;
                        long j2 = workSpec2.intervalDuration;
                        long j3 = workSpec2.flexDuration;
                        Constraints constraints = workSpec2.constraints;
                        int i2 = workSpec2.runAttemptCount;
                        BackoffPolicy backoffPolicy = workSpec2.backoffPolicy;
                        long j4 = workSpec2.backoffDelayDuration;
                        long j5 = workSpec2.lastEnqueueTime;
                        long j6 = workSpec2.minimumRetentionDuration;
                        long j7 = workSpec2.scheduleRequestedAt;
                        boolean z12 = workSpec2.expedited;
                        OutOfQuotaPolicy outOfQuotaPolicy = workSpec2.outOfQuotaPolicy;
                        int i3 = workSpec2.periodCount;
                        int i4 = workSpec2.generation;
                        long j8 = workSpec2.nextScheduleTimeOverride;
                        int i5 = workSpec2.nextScheduleTimeOverrideGeneration;
                        int i6 = workSpec2.stopReason;
                        String str9 = workSpec2.traceTag;
                        Boolean bool = workSpec2.backOffOnSystemInterruptions;
                        str7.getClass();
                        state4.getClass();
                        str8.getClass();
                        data2.getClass();
                        constraints.getClass();
                        backoffPolicy.getClass();
                        outOfQuotaPolicy.getClass();
                        workSpec2 = new WorkSpec(str7, state4, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", str8, build, data2, j, j2, j3, constraints, i2, backoffPolicy, j4, j5, j6, j7, z12, outOfQuotaPolicy, i3, i4, j8, i5, i6, str9, bool);
                    }
                    workSpecDao4.getClass();
                    DBUtil.performBlocking(workSpecDao4.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(19, workSpecDao4, workSpec2));
                    if (z8) {
                        int length = strArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            String str10 = strArr[i7];
                            String uuid2 = uuid.toString();
                            uuid2.getClass();
                            Dependency dependency = new Dependency(uuid2, str10);
                            DependencyDao_Impl dependencyDao2 = workDatabase.dependencyDao();
                            dependencyDao2.getClass();
                            DBUtil.performBlocking(dependencyDao2.__db, false, true, new Navigator$$ExternalSyntheticLambda0(27, dependencyDao2, dependency));
                            i7++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    WorkTagDao_Impl workTagDao = workDatabase.workTagDao();
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    Set set = oneTimeWorkRequest.tags;
                    workTagDao.getClass();
                    set.getClass();
                    Iterator it6 = set.iterator();
                    while (it6.hasNext()) {
                        DBUtil.performBlocking(workTagDao.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(20, workTagDao, new WorkTag((String) it6.next(), uuid3)));
                    }
                    if (!z4) {
                        WorkNameDao_Impl workNameDao = workDatabase.workNameDao();
                        String uuid4 = uuid.toString();
                        uuid4.getClass();
                        WorkName workName = new WorkName(str, uuid4);
                        workNameDao.getClass();
                        DBUtil.performBlocking(workNameDao.__db, false, true, new Recomposer$$ExternalSyntheticLambda4(16, workNameDao, workName));
                    }
                    workManagerImpl = workManagerImpl2;
                    z5 = z11;
                    it = it5;
                    strArr = strArr2;
                }
                z6 = true;
                z7 = z5;
                workContinuationImpl.mEnqueued = z6;
                return z7;
            }
        }
        z4 = isEmpty;
        workDatabase = workDatabase2;
        z5 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        z6 = true;
        z7 = z5;
        workContinuationImpl.mEnqueued = z6;
        return z7;
    }
}
