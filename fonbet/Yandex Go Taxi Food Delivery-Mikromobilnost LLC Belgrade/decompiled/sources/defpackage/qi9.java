package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.a;

/* loaded from: classes10.dex */
public final class qi9 implements ci9 {
    public final a a;
    public tls b;

    public qi9(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.tfi0
    public final void a(CancellationException cancellationException) {
        this.a.a(cancellationException);
    }

    public final void b(tls tlsVar) {
        this.b = tlsVar;
    }

    @Override // defpackage.ioq0
    public final Object d(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.tfi0
    public final Object e(ContinuationImpl continuationImpl) {
        return a.J(this.a, continuationImpl);
    }

    @Override // defpackage.tfi0
    public final ofa0 f() {
        return this.a.f();
    }

    @Override // defpackage.tfi0
    public final Object g() {
        return this.a.g();
    }

    @Override // defpackage.tfi0
    public final Object h(Continuation continuation) {
        Object K = a.K(this.a, (ContinuationImpl) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return K;
    }

    @Override // defpackage.tfi0
    public final ofa0 i() {
        return this.a.i();
    }

    @Override // defpackage.tfi0
    public final jq6 iterator() {
        return new jq6(this.a);
    }

    @Override // defpackage.ioq0
    public final boolean l(Throwable th) {
        tls tlsVar;
        boolean m = this.a.m(th, false);
        if (m && (tlsVar = this.b) != null) {
            tlsVar.invoke(th);
        }
        this.b = null;
        return m;
    }

    @Override // defpackage.ioq0
    public final Object o(Object obj, Continuation continuation) {
        return this.a.o(obj, continuation);
    }
}
