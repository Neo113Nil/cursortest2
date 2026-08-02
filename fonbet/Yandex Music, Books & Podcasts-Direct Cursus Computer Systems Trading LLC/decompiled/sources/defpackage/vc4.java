package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class vc4 extends uc4 {
    public vc4(pjc pjcVar, CoroutineContext coroutineContext, int i, oi3 oi3Var, int i2) {
        super(pjcVar, (i2 & 2) != 0 ? g.a : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? oi3.a : oi3Var);
    }

    @Override // defpackage.sc4
    public final sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return new vc4(this.d, coroutineContext, i, oi3Var);
    }

    @Override // defpackage.sc4
    public final pjc h() {
        return this.d;
    }

    @Override // defpackage.uc4
    public final Object j(rjc rjcVar, Continuation continuation) {
        Object collect = this.d.collect(rjcVar, continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
