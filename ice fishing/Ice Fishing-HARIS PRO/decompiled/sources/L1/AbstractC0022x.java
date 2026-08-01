package L1;

import java.util.concurrent.CancellationException;

/* renamed from: L1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0022x extends R1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f585c;

    public AbstractC0022x(int i) {
        super(0L, R1.k.f1048g);
        this.f585c = i;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract v1.d d();

    public Throwable f(Object obj) {
        C0009j c0009j = obj instanceof C0009j ? (C0009j) obj : null;
        if (c0009j != null) {
            return c0009j.f565a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            h0.f.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        D1.i.b(th);
        AbstractC0018t.b(new C0017s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().h());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = t1.i.f4388c;
        R1.i iVar = this.f1040b;
        try {
            v1.d d2 = d();
            D1.i.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Q1.g gVar = (Q1.g) d2;
            x1.c cVar = gVar.e;
            Object obj2 = gVar.f947g;
            v1.i h2 = cVar.h();
            Object k2 = Q1.a.k(h2, obj2);
            if (k2 != Q1.a.f937f) {
                AbstractC0018t.g(cVar, h2);
            }
            try {
                v1.i h3 = cVar.h();
                Object j = j();
                Throwable f2 = f(j);
                K k3 = (f2 == null && AbstractC0018t.d(this.f585c)) ? (K) h3.e(C0016q.f576b) : null;
                if (k3 != null && !k3.a()) {
                    CancellationException n2 = ((T) k3).n();
                    c(j, n2);
                    cVar.b(new t1.e(n2));
                } else if (f2 != null) {
                    cVar.b(new t1.e(f2));
                } else {
                    cVar.b(g(j));
                }
                Q1.a.g(h2, k2);
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = new t1.e(th);
                }
                i(null, t1.f.a(obj));
            } catch (Throwable th2) {
                Q1.a.g(h2, k2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = new t1.e(th4);
            }
            i(th3, t1.f.a(obj));
        }
    }
}
