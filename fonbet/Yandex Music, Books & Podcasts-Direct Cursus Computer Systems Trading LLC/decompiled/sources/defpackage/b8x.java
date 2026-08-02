package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b8x {
    public static final b8x d = new b8x();
    public final Runnable a;
    public final Executor b;
    public b8x c;

    public b8x() {
        this.a = null;
        this.b = null;
    }

    public b8x(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
