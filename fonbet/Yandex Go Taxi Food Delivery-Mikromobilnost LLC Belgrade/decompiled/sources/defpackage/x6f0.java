package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.a;

/* loaded from: classes9.dex */
public final class x6f0 extends c7 implements y6f0, ci9 {
    public final a y;

    public x6f0(fse fseVar, a aVar) {
        super(fseVar, true);
        this.y = aVar;
    }

    @Override // kotlinx.coroutines.c, defpackage.l8x
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(y(), null, this);
        }
        u(cancellationException);
    }

    @Override // defpackage.ioq0
    public final Object d(Object obj) {
        return this.y.d(obj);
    }

    @Override // defpackage.tfi0
    public final Object e(ContinuationImpl continuationImpl) {
        a aVar = this.y;
        aVar.getClass();
        return a.J(aVar, continuationImpl);
    }

    @Override // defpackage.tfi0
    public final ofa0 f() {
        return this.y.f();
    }

    @Override // defpackage.tfi0
    public final Object g() {
        return this.y.g();
    }

    @Override // defpackage.tfi0
    public final Object h(Continuation continuation) {
        a aVar = this.y;
        aVar.getClass();
        Object K = a.K(aVar, (ContinuationImpl) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return K;
    }

    @Override // defpackage.tfi0
    public final ofa0 i() {
        return this.y.i();
    }

    @Override // defpackage.tfi0
    public final jq6 iterator() {
        a aVar = this.y;
        aVar.getClass();
        return new jq6(aVar);
    }

    @Override // defpackage.c7
    public final void j0(Throwable th, boolean z) {
        if (this.y.m(th, false) || z) {
            return;
        }
        d6z.I(this.x, th);
    }

    @Override // defpackage.ioq0
    public final boolean l(Throwable th) {
        return this.y.m(th, false);
    }

    @Override // defpackage.c7
    public final void l0(Object obj) {
        this.y.l(null);
    }

    @Override // defpackage.ioq0
    public final Object o(Object obj, Continuation continuation) {
        return this.y.o(obj, continuation);
    }

    @Override // kotlinx.coroutines.c
    public final void u(CancellationException cancellationException) {
        this.y.m(cancellationException, true);
        t(cancellationException);
    }
}
