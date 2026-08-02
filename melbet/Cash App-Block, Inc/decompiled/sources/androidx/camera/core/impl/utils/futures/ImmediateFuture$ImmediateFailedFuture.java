package androidx.camera.core.impl.utils.futures;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public class ImmediateFuture$ImmediateFailedFuture implements ListenableFuture {
    public static final ImmediateFuture$ImmediateFailedFuture NULL_FUTURE = new ImmediateFuture$ImmediateFailedFuture(null, 1);
    public final /* synthetic */ int $r8$classId;
    public final Object mCause;

    public /* synthetic */ ImmediateFuture$ImmediateFailedFuture(Object obj, int i) {
        this.$r8$classId = i;
        this.mCause = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            StringUtilsKt.e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                throw new ExecutionException((Throwable) this.mCause);
            default:
                return this.mCause;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        int i = this.$r8$classId;
        Object obj = this.mCause;
        switch (i) {
            case 0:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("[status=SUCCESS, result=[");
                return Recorder$$ExternalSyntheticOutline1.m(sb, obj, "]]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
