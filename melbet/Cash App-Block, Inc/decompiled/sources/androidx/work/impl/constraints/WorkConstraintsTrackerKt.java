package androidx.work.impl.constraints;

import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.model.WorkSpec;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import okhttp3.Headers;

/* loaded from: classes.dex */
public abstract class WorkConstraintsTrackerKt {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("WorkConstraintsTracker");

    public static final StandaloneCoroutine listen(Headers.Builder builder, WorkSpec workSpec, CoroutineDispatcher coroutineDispatcher, OnConstraintsStateChangedListener onConstraintsStateChangedListener) {
        builder.getClass();
        coroutineDispatcher.getClass();
        onConstraintsStateChangedListener.getClass();
        return JobKt.launch$default(JobKt.CoroutineScope(coroutineDispatcher), null, null, new DataStoreImpl$data$1(builder, workSpec, onConstraintsStateChangedListener, null, 14), 3);
    }
}
