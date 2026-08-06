package D0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f228b;

    public /* synthetic */ l(Handler handler, int i2) {
        this.f227a = i2;
        this.f228b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f227a) {
            case 0:
                ((A0.a) this.f228b).post(runnable);
                return;
            case 1:
                ((A0.a) this.f228b).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f228b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public l() {
        this.f227a = 0;
        A0.a aVar = new A0.a(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f228b = aVar;
    }
}
