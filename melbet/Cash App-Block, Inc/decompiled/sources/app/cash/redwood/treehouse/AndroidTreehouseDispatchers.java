package app.cash.redwood.treehouse;

import android.os.Looper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.internal.BackgroundTaskServiceKt$$ExternalSyntheticLambda0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;

/* loaded from: classes.dex */
public final class AndroidTreehouseDispatchers implements AutoCloseable {
    public final ExecutorService executorService;
    public final ExecutorCoroutineDispatcherImpl zipline;
    public Thread ziplineThread;

    public AndroidTreehouseDispatchers(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new BackgroundTaskServiceKt$$ExternalSyntheticLambda0(str, 1, this));
        this.executorService = newSingleThreadExecutor;
        newSingleThreadExecutor.getClass();
        this.zipline = new ExecutorCoroutineDispatcherImpl(newSingleThreadExecutor);
    }

    public static void checkUi() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
    }

    public final void checkZipline() {
        if (Intrinsics.areEqual(Thread.currentThread(), this.ziplineThread)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.executorService.shutdown();
    }
}
