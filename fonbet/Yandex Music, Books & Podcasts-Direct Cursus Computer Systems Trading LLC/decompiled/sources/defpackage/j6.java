package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j6 {
    public static final j6 d = new j6();
    public final Runnable a;
    public final Executor b;
    public j6 c;

    public j6() {
        this.a = null;
        this.b = null;
    }

    public j6(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
