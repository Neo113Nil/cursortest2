package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public final class q981 {
    public final ExecutorService a;
    public final sv81 b;
    public final Handler c;

    public q981() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        sv81 sv81Var = new sv81();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = newSingleThreadExecutor;
        this.b = sv81Var;
        this.c = handler;
    }
}
