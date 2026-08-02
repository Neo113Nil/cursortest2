package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xmo extends cg6 implements rjc {
    public final rjc j;
    public final CoroutineContext k;
    public final int l;
    public CoroutineContext m;
    public Continuation n;

    public xmo(rjc rjcVar, CoroutineContext coroutineContext) {
        super(k7j.a, g.a);
        this.j = rjcVar;
        this.k = coroutineContext;
        this.l = ((Number) coroutineContext.fold(0, new d6h(24))).intValue();
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object k = k(continuation, obj);
            return k == nm6.a ? k : Unit.a;
        } catch (Throwable th) {
            this.m = new ama(th, continuation.getContext());
            throw th;
        }
    }

    @Override // defpackage.kq2, defpackage.om6
    public final om6 getCallerFrame() {
        Continuation continuation = this.n;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    @Override // defpackage.cg6, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.m;
        return coroutineContext == null ? g.a : coroutineContext;
    }

    @Override // defpackage.kq2, defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Throwable a = z7o.a(obj);
        if (a != null) {
            this.m = new ama(a, getContext());
        }
        Continuation continuation = this.n;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return nm6.a;
    }

    public final Object k(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        saf.K(context);
        CoroutineContext coroutineContext = this.m;
        if (coroutineContext != context) {
            if (coroutineContext instanceof ama) {
                e7o.f(hlr.d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ama) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                return null;
            }
            if (((Number) context.fold(0, new ucm(16, this))).intValue() != this.l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.k + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.m = context;
        }
        this.n = continuation;
        pyc pycVar = zmo.a;
        rjc rjcVar = this.j;
        rjcVar.getClass();
        Object invoke = pycVar.invoke(rjcVar, obj, this);
        if (!Intrinsics.d(invoke, nm6.a)) {
            this.n = null;
        }
        return invoke;
    }
}
