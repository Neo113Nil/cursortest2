package L0;

import Q0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import t0.AbstractC0249d;
import t0.C0252g;

/* loaded from: classes.dex */
public abstract class B extends S0.h {

    /* renamed from: g, reason: collision with root package name */
    public int f610g;

    public B(int i2) {
        super(0L, S0.k.f983g);
        this.f610g = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract v0.d f();

    public Throwable g(Object obj) {
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        if (c0056n != null) {
            return c0056n.f671a;
        }
        return null;
    }

    public final void l(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            o.g.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        E0.i.b(th);
        AbstractC0064w.d(new C0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().j());
    }

    public abstract Object m();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C0252g.f2994a;
        S0.i iVar = this.f974f;
        try {
            v0.d f2 = f();
            E0.i.c(f2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Q0.h hVar = (Q0.h) f2;
            x0.b bVar = hVar.f884i;
            Object obj2 = hVar.f886k;
            v0.i j2 = bVar.j();
            Object n2 = AbstractC0068a.n(j2, obj2);
            k0 m2 = n2 != AbstractC0068a.f874f ? AbstractC0064w.m(bVar, j2, n2) : null;
            try {
                v0.i j3 = bVar.j();
                Object m3 = m();
                Throwable g2 = g(m3);
                Q q2 = (g2 == null && AbstractC0064w.f(this.f610g)) ? (Q) j3.i(C0062u.f682f) : null;
                if (q2 != null && !q2.b()) {
                    CancellationException A2 = ((a0) q2).A();
                    b(m3, A2);
                    bVar.c(o.g.f(A2));
                } else if (g2 != null) {
                    bVar.c(o.g.f(g2));
                } else {
                    bVar.c(i(m3));
                }
                if (m2 == null || m2.X()) {
                    AbstractC0068a.h(j2, n2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = o.g.f(th);
                }
                l(null, AbstractC0249d.a(obj));
            } catch (Throwable th2) {
                if (m2 == null || m2.X()) {
                    AbstractC0068a.h(j2, n2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = o.g.f(th4);
            }
            l(th3, AbstractC0249d.a(obj));
        }
    }

    public Object i(Object obj) {
        return obj;
    }
}
