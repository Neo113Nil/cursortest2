package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d1 implements Executor {
    public final Handler MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public d1() {
        this.NCTxEWno = 0;
        this.MdtA4re8 = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.NCTxEWno;
        Handler handler = this.MdtA4re8;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public d1(Handler handler) {
        this.NCTxEWno = 1;
        this.MdtA4re8 = handler;
    }
}
