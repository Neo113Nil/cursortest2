package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kd4 implements lc4 {
    public final zi3 a;
    public az6 b;

    public kd4(zi3 zi3Var) {
        this.a = zi3Var;
    }

    public final boolean a(Throwable th) {
        az6 az6Var;
        boolean o = this.a.o(th, false);
        if (o && (az6Var = this.b) != null) {
            az6Var.invoke(th);
        }
        this.b = null;
        return o;
    }

    @Override // defpackage.fgp
    public final Object c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.qln
    public final Object e(aur aurVar) {
        Object G = zi3.G(this.a, aurVar);
        nm6 nm6Var = nm6.a;
        return G;
    }

    @Override // defpackage.qln
    public final x3n f() {
        return this.a.f();
    }

    @Override // defpackage.qln
    public final void g(CancellationException cancellationException) {
        this.a.g(cancellationException);
    }

    @Override // defpackage.qln
    public final x3n i() {
        return this.a.i();
    }

    @Override // defpackage.qln
    public final si3 iterator() {
        return new si3(this.a);
    }

    @Override // defpackage.qln
    public final Object k() {
        return this.a.k();
    }

    @Override // defpackage.qln
    public final Object l(Continuation continuation) {
        return this.a.l(continuation);
    }

    @Override // defpackage.fgp
    public final Object m(Object obj, Continuation continuation) {
        return this.a.m(obj, continuation);
    }
}
