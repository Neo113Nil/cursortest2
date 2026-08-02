package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public abstract class bm6 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new fp5(12))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new fp5(12))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        xqn xqnVar = new xqn();
        xqnVar.a = coroutineContext2;
        g gVar = g.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new fp5(13));
        if (booleanValue2) {
            xqnVar.a = ((CoroutineContext) xqnVar.a).fold(gVar, new fp5(14));
        }
        return coroutineContext3.plus((CoroutineContext) xqnVar.a);
    }

    public static final CoroutineContext b(mm6 mm6Var, CoroutineContext coroutineContext) {
        CoroutineContext a = a(mm6Var.getCoroutineContext(), coroutineContext, true);
        CoroutineContext plus = ve7.a() ? a.plus(new hm6(ve7.c.incrementAndGet())) : a;
        dq7 dq7Var = ca8.a;
        return (a == dq7Var || a.get(d.t0) != null) ? plus : plus.plus(dq7Var);
    }

    public static final kit c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        kit kitVar = null;
        if ((continuation instanceof om6) && coroutineContext.get(lit.a) != null) {
            om6 om6Var = (om6) continuation;
            while (true) {
                if ((om6Var instanceof x98) || (om6Var = om6Var.getCallerFrame()) == null) {
                    break;
                }
                if (om6Var instanceof kit) {
                    kitVar = (kit) om6Var;
                    break;
                }
            }
            if (kitVar != null) {
                kitVar.s0(coroutineContext, obj);
            }
        }
        return kitVar;
    }
}
