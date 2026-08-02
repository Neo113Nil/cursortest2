package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class v98 extends y98 implements om6, Continuation {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v98.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final a d;
    public final cg6 e;
    public Object f;
    public final Object g;

    public v98(a aVar, cg6 cg6Var) {
        super(-1);
        this.d = aVar;
        this.e = cg6Var;
        this.f = w98.a;
        this.g = nfs.b(cg6Var.getContext());
    }

    @Override // defpackage.om6
    public final om6 getCallerFrame() {
        return this.e;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.y98
    public final Object i() {
        Object obj = this.f;
        this.f = w98.a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = z7o.a(obj);
        Object sm5Var = a == null ? obj : new sm5(a, false);
        cg6 cg6Var = this.e;
        CoroutineContext context = cg6Var.getContext();
        a aVar = this.d;
        if (w98.c(aVar, context)) {
            this.f = sm5Var;
            this.c = 0;
            w98.b(this, cg6Var.getContext(), aVar);
            return;
        }
        rib a2 = rfs.a();
        if (a2.d >= 4294967296L) {
            this.f = sm5Var;
            this.c = 0;
            a2.K0(this);
            return;
        }
        a2.M0(true);
        try {
            CoroutineContext context2 = cg6Var.getContext();
            Object c = nfs.c(context2, this.g);
            try {
                cg6Var.resumeWith(obj);
                while (a2.O0()) {
                }
            } finally {
                nfs.a(context2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + ff7.O(this.e) + ']';
    }

    @Override // defpackage.y98
    public final Continuation c() {
        return this;
    }
}
