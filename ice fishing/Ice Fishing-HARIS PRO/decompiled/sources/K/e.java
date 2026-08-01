package K;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f381a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f382b;

    public /* synthetic */ e(Handler handler, int i) {
        this.f381a = i;
        this.f382b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f381a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f382b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f382b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
