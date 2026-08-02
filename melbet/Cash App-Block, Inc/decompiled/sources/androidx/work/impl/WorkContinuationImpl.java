package androidx.work.impl;

import android.text.TextUtils;
import androidx.core.os.BundleKt;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger$LogcatLogger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkContinuationImpl {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("WorkContinuationImpl");
    public final ArrayList mAllIds = new ArrayList();
    public boolean mEnqueued;
    public final ExistingWorkPolicy mExistingWorkPolicy;
    public final ArrayList mIds;
    public final String mName;
    public Data.Builder mOperation;
    public final List mWork;
    public final WorkManagerImpl mWorkManagerImpl;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mName = str;
        this.mExistingWorkPolicy = existingWorkPolicy;
        this.mWork = list;
        this.mIds = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && ((OneTimeWorkRequest) list.get(i)).workSpec.nextScheduleTimeOverride != Long.MAX_VALUE) {
                a$$ExternalSyntheticBUOutline0.m$3("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((OneTimeWorkRequest) list.get(i)).id.toString();
            uuid.getClass();
            this.mIds.add(uuid);
            this.mAllIds.add(uuid);
        }
    }

    public static HashSet prerequisitesFor(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        workContinuationImpl.getClass();
        return hashSet;
    }

    public final Data.Builder enqueue() {
        if (this.mEnqueued) {
            Logger$LogcatLogger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", this.mIds) + ")");
        } else {
            WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
            this.mOperation = BundleKt.launchOperation(workManagerImpl.mConfiguration.tracer, "EnqueueRunnable_" + this.mExistingWorkPolicy.name(), ((WorkManagerTaskExecutor) workManagerImpl.mWorkTaskExecutor).mBackgroundExecutor, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 20));
        }
        return this.mOperation;
    }
}
