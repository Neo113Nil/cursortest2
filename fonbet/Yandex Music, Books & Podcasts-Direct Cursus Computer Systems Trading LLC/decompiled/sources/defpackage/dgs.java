package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class dgs {
    public static final Thread a;

    static {
        new Handler(Looper.getMainLooper());
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            xq0.q("No main looper");
            return;
        }
        Thread thread = mainLooper.getThread();
        thread.getClass();
        a = thread;
    }
}
