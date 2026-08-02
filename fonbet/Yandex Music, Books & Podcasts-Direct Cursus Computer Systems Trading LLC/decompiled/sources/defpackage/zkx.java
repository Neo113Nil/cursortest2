package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zkx {
    public static final zkx d = new zkx();
    public final Runnable a;
    public final Executor b;
    public zkx c;

    public zkx() {
        this.a = null;
        this.b = null;
    }

    public zkx(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
