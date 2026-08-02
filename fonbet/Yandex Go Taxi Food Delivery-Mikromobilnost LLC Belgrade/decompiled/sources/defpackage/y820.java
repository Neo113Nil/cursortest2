package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class y820 implements yvf0 {
    public final k5m a;
    public final v8f b;

    public y820(k5m k5mVar, v8f v8fVar) {
        this.a = k5mVar;
        this.b = v8fVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new x820((Context) this.a.b, (am2) this.b.get());
    }
}
