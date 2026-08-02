package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class dkn implements u0q, cu3, hzc {
    public final /* synthetic */ u0q a;

    public dkn(xpi xpiVar) {
        this.a = xpiVar;
    }

    @Override // defpackage.u0q
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.hzc
    public final pjc c(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return y0q.d(this, coroutineContext, i, oi3Var);
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        return this.a.collect(rjcVar, continuation);
    }
}
