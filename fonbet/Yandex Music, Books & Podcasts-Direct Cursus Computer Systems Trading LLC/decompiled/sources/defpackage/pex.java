package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pex {
    public static final pex d = new pex(null, null);
    public final Runnable a;
    public final Executor b;
    public pex c;

    public pex(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
