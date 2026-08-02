package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qht {
    public static final qht a = new qht();
    public static final Handler b = new Handler(Looper.getMainLooper());

    public final boolean a() {
        return Intrinsics.d(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    public final boolean b(Runnable runnable) {
        return b.post(runnable);
    }
}
