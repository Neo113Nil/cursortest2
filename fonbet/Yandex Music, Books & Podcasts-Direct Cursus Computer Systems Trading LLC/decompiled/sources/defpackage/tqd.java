package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class tqd implements mfs {
    public static final wvo b = new wvo(24);
    public final we6 a;

    public tqd(we6 we6Var) {
        we6Var.getClass();
        this.a = we6Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // defpackage.mfs
    public final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        we6 we6Var = (we6) obj;
        coroutineContext.getClass();
        we6Var.getClass();
        this.a.D(we6Var);
    }

    @Override // defpackage.mfs
    public final Object updateThreadContext(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        we6 b2 = this.a.b();
        b2.getClass();
        return b2;
    }
}
