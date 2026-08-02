package androidx.work;

import androidx.work.Data;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes.dex */
public abstract class WorkManager {
    public final Data.Builder enqueue(OneTimeWorkRequest oneTimeWorkRequest) {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(oneTimeWorkRequest);
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) this;
        if (!listOf.isEmpty()) {
            return new WorkContinuationImpl(workManagerImpl, null, ExistingWorkPolicy.KEEP, listOf).enqueue();
        }
        a$$ExternalSyntheticBUOutline0.m$3("enqueue needs at least one WorkRequest.");
        return null;
    }

    public final Data.Builder enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        return new WorkContinuationImpl((WorkManagerImpl) this, str, existingWorkPolicy, CollectionsKt__CollectionsJVMKt.listOf(oneTimeWorkRequest)).enqueue();
    }
}
