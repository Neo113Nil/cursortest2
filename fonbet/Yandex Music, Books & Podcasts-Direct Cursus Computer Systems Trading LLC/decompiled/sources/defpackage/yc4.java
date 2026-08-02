package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class yc4 extends uc4 {
    public final aur e;

    /* JADX WARN: Multi-variable type inference failed */
    public yc4(pyc pycVar, pjc pjcVar, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(pjcVar, coroutineContext, i, oi3Var);
        this.e = (aur) pycVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, pyc] */
    @Override // defpackage.sc4
    public final sc4 f(CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        return new yc4(this.e, this.d, coroutineContext, i, oi3Var);
    }

    @Override // defpackage.uc4
    public final Object j(rjc rjcVar, Continuation continuation) {
        Object Q = gld.Q(new wc4(this, rjcVar, null), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }
}
