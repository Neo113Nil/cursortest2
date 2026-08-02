package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class fkn implements vdr, cu3, hzc {
    public final /* synthetic */ vdr a;

    public fkn(bqi bqiVar) {
        this.a = bqiVar;
    }

    @Override // defpackage.u0q
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.hzc
    public final pjc c(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return (((i < 0 || i >= 2) && i != -2) || oi3Var != oi3.b) ? y0q.d(this, coroutineContext, i, oi3Var) : this;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        return this.a.collect(rjcVar, continuation);
    }

    @Override // defpackage.vdr
    public final Object getValue() {
        return this.a.getValue();
    }
}
