package kotlinx.coroutines.flow.internal;

import defpackage.fse;
import defpackage.jl40;
import defpackage.mqq0;
import defpackage.q5z;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x4c;
import defpackage.y6f0;
import defpackage.yk;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public abstract class e extends a {
    public final tpr w;

    public e(int i, fse fseVar, tpr tprVar, BufferOverflow bufferOverflow) {
        super(fseVar, i, bufferOverflow);
        this.w = tprVar;
    }

    @Override // kotlinx.coroutines.flow.internal.a, defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        if (this.b == -3) {
            fse fseVar = continuation.get_context();
            Boolean bool = Boolean.FALSE;
            yk ykVar = new yk(7);
            fse fseVar2 = this.a;
            fse plus = !((Boolean) fseVar2.fold(bool, ykVar)).booleanValue() ? fseVar.plus(fseVar2) : q5z.p(fseVar, fseVar2, false);
            if (jl40.l(plus, fseVar)) {
                Object k = k(vprVar, continuation);
                if (k == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return k;
                }
            } else {
                x4c x4cVar = x4c.K;
                if (jl40.l(plus.get(x4cVar), fseVar.get(x4cVar))) {
                    Object c = b.c(plus, b.a(vprVar, continuation.get_context()), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation);
                    if (c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return c;
                    }
                }
            }
            return zy11.a;
        }
        Object collect = super.collect(vprVar, continuation);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return zy11.a;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    public final Object e(y6f0 y6f0Var, Continuation continuation) {
        Object k = k(new mqq0(y6f0Var), continuation);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
    }

    public abstract Object k(vpr vprVar, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.a
    public final String toString() {
        return this.w + " -> " + super.toString();
    }
}
