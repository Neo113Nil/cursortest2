package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class x0j0 {
    public final n5t0 a;

    public x0j0(n5t0 n5t0Var) {
        this.a = n5t0Var;
    }

    public final w0j0 a(long j, TimeUnit timeUnit, o5t0 o5t0Var) {
        return new w0j0(this, timeUnit.toMillis(j), o5t0Var);
    }
}
