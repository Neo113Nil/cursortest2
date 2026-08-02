package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.a;

/* loaded from: classes.dex */
public abstract class qyy0 {
    public static final i3y a = a.a(new pyy0(0));

    public static final boolean a() {
        return jl40.l(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final tac b(Runnable runnable) {
        ((Handler) a.getValue()).post(runnable);
        return new tac(3, runnable);
    }

    public static final void c(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            b(runnable);
        }
    }
}
