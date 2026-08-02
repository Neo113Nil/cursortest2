package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public abstract class w98 {
    public static final js3 a = new js3("UNDEFINED", 2);
    public static final js3 b = new js3("REUSABLE_CLAIMED", 2);

    public static final void a(Object obj, Continuation continuation) {
        if (!(continuation instanceof v98)) {
            continuation.resumeWith(obj);
            return;
        }
        v98 v98Var = (v98) continuation;
        a aVar = v98Var.d;
        cg6 cg6Var = v98Var.e;
        Throwable a2 = z7o.a(obj);
        Object sm5Var = a2 == null ? obj : new sm5(a2, false);
        if (c(aVar, cg6Var.getContext())) {
            v98Var.f = sm5Var;
            v98Var.c = 1;
            b(v98Var, cg6Var.getContext(), aVar);
            return;
        }
        rib a3 = rfs.a();
        if (a3.d >= 4294967296L) {
            v98Var.f = sm5Var;
            v98Var.c = 1;
            a3.K0(v98Var);
            return;
        }
        a3.M0(true);
        try {
            r2f r2fVar = (r2f) cg6Var.getContext().get(o6c.l);
            if (r2fVar == null || r2fVar.b()) {
                Object obj2 = v98Var.g;
                CoroutineContext context = cg6Var.getContext();
                Object c = nfs.c(context, obj2);
                kit c2 = c != nfs.a ? bm6.c(cg6Var, context, c) : null;
                try {
                    cg6Var.resumeWith(obj);
                } finally {
                    if (c2 == null || c2.q0()) {
                        nfs.a(context, c);
                    }
                }
            } else {
                v98Var.resumeWith(qgg.J(r2fVar.D()));
            }
            while (a3.O0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void b(Runnable runnable, CoroutineContext coroutineContext, a aVar) {
        try {
            aVar.F0(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new t98(th, aVar, coroutineContext);
        }
    }

    public static final boolean c(a aVar, CoroutineContext coroutineContext) {
        try {
            return aVar.H0(coroutineContext);
        } catch (Throwable th) {
            throw new t98(th, aVar, coroutineContext);
        }
    }
}
