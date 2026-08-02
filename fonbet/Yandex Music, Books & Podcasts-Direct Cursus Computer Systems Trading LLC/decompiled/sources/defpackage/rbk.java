package defpackage;

import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class rbk extends a {
    public final u98 d = new u98();

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        u98 u98Var = this.d;
        u98Var.getClass();
        dq7 dq7Var = ca8.a;
        bsd bsdVar = j5h.a.g;
        if (bsdVar.H0(coroutineContext) || u98Var.b || !u98Var.a) {
            bsdVar.F0(coroutineContext, new jt6(25, u98Var, runnable));
        } else if (((ArrayDeque) u98Var.d).offer(runnable)) {
            u98Var.a();
        } else {
            xq0.q("cannot enqueue any more runnables");
        }
    }

    @Override // kotlinx.coroutines.a
    public final boolean H0(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        dq7 dq7Var = ca8.a;
        if (j5h.a.g.H0(coroutineContext)) {
            return true;
        }
        u98 u98Var = this.d;
        return !(u98Var.b || !u98Var.a);
    }
}
