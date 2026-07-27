package s;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0256a implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2950f;

    public ExecutorC0256a(Handler handler) {
        this.f2950f = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f2950f;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
