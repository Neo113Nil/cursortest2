package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lbk implements qdi {
    public final qdi a;
    public final z0j b = new z0j(15);

    public lbk(qdi qdiVar) {
        this.a = qdiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(Function1 function1, Continuation continuation) {
        kbk kbkVar;
        int i;
        boolean z;
        Object q;
        lbk lbkVar;
        if (continuation instanceof kbk) {
            kbkVar = (kbk) continuation;
            int i2 = kbkVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kbkVar.n = i2 - Integer.MIN_VALUE;
                Object obj = kbkVar.l;
                nm6 nm6Var = nm6.a;
                i = kbkVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    z0j z0jVar = this.b;
                    kbkVar.j = this;
                    kbkVar.k = function1;
                    kbkVar.n = 1;
                    synchronized (z0jVar.c) {
                        z = z0jVar.b;
                    }
                    if (z) {
                        q = Unit.a;
                    } else {
                        zt3 zt3Var = new zt3(1, qxe.b(kbkVar));
                        zt3Var.s();
                        synchronized (z0jVar.c) {
                            ((ArrayList) z0jVar.d).add(zt3Var);
                        }
                        zt3Var.u(new sea(22, z0jVar, zt3Var));
                        q = zt3Var.q();
                        if (q != nm6Var) {
                            q = Unit.a;
                        }
                    }
                    if (q != nm6Var) {
                        lbkVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = kbkVar.k;
                lbkVar = kbkVar.j;
                qgg.h0(obj);
                qdi qdiVar = lbkVar.a;
                kbkVar.j = null;
                kbkVar.k = null;
                kbkVar.n = 2;
                Object P = qdiVar.P(function1, kbkVar);
                return P != nm6Var ? nm6Var : P;
            }
        }
        kbkVar = new kbk(this, continuation);
        Object obj2 = kbkVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kbkVar.n;
        if (i != 0) {
        }
        qdi qdiVar2 = lbkVar.a;
        kbkVar.j = null;
        kbkVar.k = null;
        kbkVar.n = 2;
        Object P2 = qdiVar2.P(function1, kbkVar);
        if (P2 != nm6Var2) {
        }
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
