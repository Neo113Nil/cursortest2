package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class ks1 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public ks1(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                this.b.post(runnable);
                return;
            case 3:
                runnable.getClass();
                Handler handler2 = this.b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.b.post(runnable);
                return;
        }
    }

    public /* synthetic */ ks1(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
