package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class cg6 extends kq2 {
    private final CoroutineContext _context;
    private transient Continuation<Object> intercepted;

    public cg6(Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    @NotNull
    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null) {
            return continuation;
        }
        d dVar = (d) getContext().get(d.t0);
        Continuation<Object> v98Var = dVar != null ? new v98((a) dVar, this) : this;
        this.intercepted = v98Var;
        return v98Var;
    }

    @Override // defpackage.kq2
    public void releaseIntercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getContext().get(d.t0);
            element.getClass();
            v98 v98Var = (v98) continuation;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v98.h;
            while (atomicReferenceFieldUpdater.get(v98Var) == w98.b) {
            }
            Object obj = atomicReferenceFieldUpdater.get(v98Var);
            zt3 zt3Var = obj instanceof zt3 ? (zt3) obj : null;
            if (zt3Var != null) {
                zt3Var.n();
            }
        }
        this.intercepted = rm5.a;
    }

    public cg6(Continuation continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }
}
