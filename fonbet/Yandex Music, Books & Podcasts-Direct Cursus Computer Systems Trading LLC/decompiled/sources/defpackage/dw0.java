package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dw0 implements fd6 {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ ltm b;

    public dw0(AtomicReference atomicReference, ltm ltmVar) {
        this.a = atomicReference;
        this.b = ltmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Function2 function2, cg6 cg6Var) {
        cw0 cw0Var;
        int i;
        if (cg6Var instanceof cw0) {
            cw0Var = (cw0) cg6Var;
            int i2 = cw0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cw0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = cw0Var.k;
                nm6 nm6Var = nm6.a;
                i = cw0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    cw0Var.j = function2;
                    cw0Var.m = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(cw0Var));
                    zt3Var.s();
                    ltm ltmVar = this.b;
                    zt3Var.u(new bw0(ltmVar, 0));
                    yt3 yt3Var = (yt3) this.a.getAndSet(zt3Var);
                    if (yt3Var != null) {
                        yt3Var.h(null);
                    }
                    ((oc4) ltmVar).c(function2);
                    if (zt3Var.q() == nm6Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
            }
        }
        cw0Var = new cw0(this, cg6Var);
        Object obj2 = cw0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = cw0Var.m;
        if (i != 0) {
        }
        rj7.f();
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
