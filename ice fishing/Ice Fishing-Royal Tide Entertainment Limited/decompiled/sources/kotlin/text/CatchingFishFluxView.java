package kotlin.text;

import com.adjust.sdk.AdjustFactory;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class CatchingFishFluxView implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AdjustFactory.getLogger().error("Thread [%s] with error [%s]", thread.getName(), th.getMessage());
    }
}
