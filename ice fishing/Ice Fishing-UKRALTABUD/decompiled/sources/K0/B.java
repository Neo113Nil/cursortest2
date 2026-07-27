package K0;

import P0.AbstractC0068a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class B extends R0.h {

    /* renamed from: h, reason: collision with root package name */
    public int f462h;

    public B(int i2) {
        super(0L, R0.k.f972g);
        this.f462h = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract v0.d f();

    public Throwable g(Object obj) {
        C0038n c0038n = obj instanceof C0038n ? (C0038n) obj : null;
        if (c0038n != null) {
            return c0038n.f523a;
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
        AbstractC0046w.d(new C0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), f().j());
    }

    public abstract Object m();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = t0.g.f2989a;
        R0.i iVar = this.f963g;
        try {
            v0.d f2 = f();
            E0.i.c(f2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            P0.h hVar = (P0.h) f2;
            x0.b bVar = hVar.f875j;
            Object obj2 = hVar.f877l;
            v0.i j2 = bVar.j();
            Object n2 = AbstractC0068a.n(j2, obj2);
            k0 m2 = n2 != AbstractC0068a.f865f ? AbstractC0046w.m(bVar, j2, n2) : null;
            try {
                v0.i j3 = bVar.j();
                Object m3 = m();
                Throwable g2 = g(m3);
                Q q2 = (g2 == null && AbstractC0046w.f(this.f462h)) ? (Q) j3.i(C0044u.f534g) : null;
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
                l(null, t0.d.a(obj));
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
            l(th3, t0.d.a(obj));
        }
    }

    public Object i(Object obj) {
        return obj;
    }
}
