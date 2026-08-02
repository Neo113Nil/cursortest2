package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class oc4 extends a6 implements lc4 {
    public final zi3 d;

    public oc4(CoroutineContext coroutineContext, zi3 zi3Var, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.d = zi3Var;
    }

    public Object c(Object obj) {
        return this.d.c(obj);
    }

    @Override // defpackage.qln
    public final Object e(aur aurVar) {
        zi3 zi3Var = this.d;
        zi3Var.getClass();
        Object G = zi3.G(zi3Var, aurVar);
        nm6 nm6Var = nm6.a;
        return G;
    }

    @Override // defpackage.qln
    public final x3n f() {
        return this.d.f();
    }

    @Override // defpackage.h3f, defpackage.r2f
    public final void g(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new t2f(w(), null, this);
        }
        u(cancellationException);
    }

    @Override // defpackage.qln
    public final x3n i() {
        return this.d.i();
    }

    @Override // defpackage.qln
    public final si3 iterator() {
        zi3 zi3Var = this.d;
        zi3Var.getClass();
        return new si3(zi3Var);
    }

    @Override // defpackage.qln
    public final Object k() {
        return this.d.k();
    }

    @Override // defpackage.qln
    public final Object l(Continuation continuation) {
        return this.d.l(continuation);
    }

    public Object m(Object obj, Continuation continuation) {
        return this.d.m(obj, continuation);
    }

    public boolean p0(Throwable th) {
        return this.d.o(th, false);
    }

    public final void q0(Function1 function1) {
        this.d.y(function1);
    }

    @Override // defpackage.h3f
    public final void u(CancellationException cancellationException) {
        this.d.o(cancellationException, true);
        t(cancellationException);
    }
}
