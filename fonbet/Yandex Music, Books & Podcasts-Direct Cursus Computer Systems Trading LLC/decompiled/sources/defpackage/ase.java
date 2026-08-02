package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ase implements qdi {
    public final mm6 a;
    public final wh3 b = new wh3(new ypb(10, this));
    public final Object c = new Object();
    public int d = 5;
    public long e;
    public zt3 f;

    public ase(gjs gjsVar) {
        this.a = gjsVar;
    }

    @Override // defpackage.qdi
    public final Object P(Function1 function1, Continuation continuation) {
        return this.b.P(function1, continuation);
    }

    public final void c() {
        synchronized (this.c) {
            zt3 zt3Var = this.f;
            if (zt3Var != null) {
                zt3Var.h(null);
            }
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
