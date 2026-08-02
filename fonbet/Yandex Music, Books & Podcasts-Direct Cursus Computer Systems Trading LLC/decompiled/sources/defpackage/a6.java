package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class a6 extends h3f implements Continuation, mm6 {
    public final CoroutineContext c;

    public a6(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            Q((r2f) coroutineContext.get(o6c.l));
        }
        this.c = coroutineContext.plus(this);
    }

    @Override // defpackage.h3f
    public final void O(wp3 wp3Var) {
        cxb.V(wp3Var, this.c);
    }

    @Override // defpackage.h3f
    public String W() {
        String str;
        String str2 = null;
        if (ve7.a()) {
            gos gosVar = hm6.d;
            CoroutineContext coroutineContext = this.c;
            hm6 hm6Var = (hm6) coroutineContext.get(gosVar);
            if (hm6Var != null) {
                im6 im6Var = (im6) coroutineContext.get(im6.d);
                if (im6Var == null || (str = im6Var.c) == null) {
                    str = "coroutine";
                }
                str2 = str + '#' + hm6Var.c;
            }
        }
        if (str2 == null) {
            return super.W();
        }
        StringBuilder u = ouj.u("\"", str2, "\":");
        u.append(super.W());
        return u.toString();
    }

    @Override // defpackage.h3f
    public final void c0(Object obj) {
        if (!(obj instanceof sm5)) {
            n0(obj);
        } else {
            sm5 sm5Var = (sm5) obj;
            m0(sm5Var.a, sm5.b.get(sm5Var) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.c;
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }

    public final void o0(pm6 pm6Var, a6 a6Var, Function2 function2) {
        Object invoke;
        int ordinal = pm6Var.ordinal();
        if (ordinal == 0) {
            n7w.c0(function2, a6Var, this);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                function2.getClass();
                Continuation b = qxe.b(qxe.a(a6Var, this, function2));
                Unit unit = Unit.a;
                r7o r7oVar = z7o.b;
                b.resumeWith(unit);
                return;
            }
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            try {
                CoroutineContext coroutineContext = this.c;
                Object c = nfs.c(coroutineContext, null);
                try {
                    if (function2 instanceof kq2) {
                        wct.o(2, function2);
                        invoke = function2.invoke(a6Var, this);
                    } else {
                        invoke = qxe.c(function2, a6Var, this);
                    }
                    nfs.a(coroutineContext, c);
                    if (invoke != nm6.a) {
                        r7o r7oVar2 = z7o.b;
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    nfs.a(coroutineContext, c);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof t98) {
                    th = ((t98) th).a;
                }
                r7o r7oVar3 = z7o.b;
                resumeWith(qgg.J(th));
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = z7o.a(obj);
        if (a != null) {
            obj = new sm5(a, false);
        }
        Object V = V(obj);
        if (V == i3f.b) {
            return;
        }
        q(V);
    }

    @Override // defpackage.h3f
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void n0(Object obj) {
    }

    public void m0(Throwable th, boolean z) {
    }
}
