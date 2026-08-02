package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class v8f implements yvf0 {
    public final k5m a;
    public final yvf0 b;
    public final yvf0 c;

    public v8f(k5m k5mVar, yvf0 yvf0Var, yvf0 yvf0Var2) {
        this.a = k5mVar;
        this.b = yvf0Var;
        this.c = yvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new am2((Context) this.a.b, (s3c) this.b.get(), (s3c) this.c.get());
    }
}
