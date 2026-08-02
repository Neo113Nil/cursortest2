package defpackage;

import android.view.Choreographer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dj0 implements qdi {
    public final Choreographer a;
    public final bj0 b;

    public dj0(Choreographer choreographer, bj0 bj0Var) {
        this.a = choreographer;
        this.b = bj0Var;
    }

    @Override // defpackage.qdi
    public final Object P(Function1 function1, Continuation continuation) {
        bj0 bj0Var = this.b;
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        cj0 cj0Var = new cj0(zt3Var, this, function1);
        if (Intrinsics.d(bj0Var.d, this.a)) {
            synchronized (bj0Var.f) {
                bj0Var.h.add(cj0Var);
                if (!bj0Var.k) {
                    bj0Var.k = true;
                    bj0Var.d.postFrameCallback(bj0Var.l);
                }
            }
            zt3Var.u(new al(8, bj0Var, cj0Var));
        } else {
            this.a.postFrameCallback(cj0Var);
            zt3Var.u(new al(9, this, cj0Var));
        }
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
