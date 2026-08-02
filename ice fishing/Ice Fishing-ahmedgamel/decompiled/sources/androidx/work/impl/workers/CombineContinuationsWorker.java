package androidx.work.impl.workers;

import J0.o;
import J0.p;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        h.e(context, "context");
        h.e(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final p doWork() {
        return new o(getInputData());
    }
}
