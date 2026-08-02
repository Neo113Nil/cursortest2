package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class kit extends huo {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kit(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation, coroutineContext.get(r0) == null ? coroutineContext.plus(r0) : coroutineContext);
        lit litVar = lit.a;
        this.e = new ThreadLocal();
        if (continuation.getContext().get(d.t0) instanceof a) {
            return;
        }
        Object c = nfs.c(coroutineContext, null);
        nfs.a(coroutineContext, c);
        s0(coroutineContext, c);
    }

    @Override // defpackage.huo
    public final void p0() {
        r0();
    }

    @Override // defpackage.huo, defpackage.h3f
    public final void q(Object obj) {
        r0();
        Continuation continuation = this.d;
        Object B = ild.B(obj, continuation);
        CoroutineContext context = continuation.getContext();
        Object c = nfs.c(context, null);
        kit c2 = c != nfs.a ? bm6.c(continuation, context, c) : null;
        try {
            continuation.resumeWith(B);
            if (c2 == null || c2.q0()) {
                nfs.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.q0()) {
                nfs.a(context, c);
            }
            throw th;
        }
    }

    public final boolean q0() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    public final void r0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.e.get();
            if (pair != null) {
                nfs.a((CoroutineContext) pair.a, pair.b);
            }
            this.e.remove();
        }
    }

    public final void s0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair(coroutineContext, obj));
    }
}
