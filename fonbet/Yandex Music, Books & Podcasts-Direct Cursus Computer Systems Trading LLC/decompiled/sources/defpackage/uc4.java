package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class uc4 extends sc4 {
    public final pjc d;

    public uc4(pjc pjcVar, CoroutineContext coroutineContext, int i, oi3 oi3Var) {
        super(coroutineContext, i, oi3Var);
        this.d = pjcVar;
    }

    @Override // defpackage.sc4, defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        if (this.b == -3) {
            CoroutineContext context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            fp5 fp5Var = new fp5(12);
            CoroutineContext coroutineContext = this.a;
            CoroutineContext plus = !((Boolean) coroutineContext.fold(bool, fp5Var)).booleanValue() ? context.plus(coroutineContext) : bm6.a(context, coroutineContext, false);
            if (Intrinsics.d(plus, context)) {
                Object j = j(rjcVar, continuation);
                return j == nm6.a ? j : Unit.a;
            }
            dg6 dg6Var = d.t0;
            if (Intrinsics.d(plus.get(dg6Var), context.get(dg6Var))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(rjcVar instanceof ngp) && !(rjcVar instanceof qej)) {
                    rjcVar = new hyl(rjcVar, context2);
                }
                Object M = q6k.M(plus, rjcVar, nfs.b(plus), new cs1(this, (Continuation) null, 21), continuation);
                return M == nm6.a ? M : Unit.a;
            }
        }
        Object collect = super.collect(rjcVar, continuation);
        return collect == nm6.a ? collect : Unit.a;
    }

    @Override // defpackage.sc4
    public final Object e(ltm ltmVar, Continuation continuation) {
        Object j = j(new ngp(ltmVar), continuation);
        return j == nm6.a ? j : Unit.a;
    }

    public abstract Object j(rjc rjcVar, Continuation continuation);

    @Override // defpackage.sc4
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
