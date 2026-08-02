package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h23 {
    public final gc8 a;
    public final g23 b;
    public final v23 c;

    public h23(gc8 gc8Var, g23 g23Var, v23 v23Var) {
        this.a = gc8Var;
        this.b = g23Var;
        this.c = v23Var;
    }

    public static final void a(h23 h23Var) {
        h23Var.a.I(new RuntimeException("Trying to run UI thread binding operation while background one in progress. Such actions may cause deadlocks, so your call is terminated. Fix this call ASAP. Looks like asserts are turned off, so your call received default return value."));
    }

    public final boolean b() {
        boolean d;
        Thread thread = this.c.a.a;
        if (thread == null || !thread.isAlive()) {
            thread = null;
        }
        if (thread == null) {
            return false;
        }
        g23 g23Var = this.b;
        synchronized (g23Var.d) {
            d = Intrinsics.d(g23Var.a, thread);
        }
        return d;
    }
}
