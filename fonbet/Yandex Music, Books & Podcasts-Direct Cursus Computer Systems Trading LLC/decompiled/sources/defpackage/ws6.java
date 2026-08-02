package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ws6 extends vs6 {
    public ls6 d;
    public Executor e;
    public CancellationSignal f;
    public final ss6 g;

    public ws6(Context context) {
        context.getClass();
        this.g = new ss6(this, new Handler(Looper.getMainLooper()), 1);
    }
}
