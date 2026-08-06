package A1;

import h1.AbstractC0236f;
import h1.C0239i;
import java.util.concurrent.CancellationException;
import n1.AbstractC0991b;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public abstract class C extends H1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f1c;

    public C(int i2) {
        super(0L, H1.k.f698g);
        this.f1c = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract l1.d c();

    public Throwable g(Object obj) {
        C0013n c0013n = obj instanceof C0013n ? (C0013n) obj : null;
        if (c0013n != null) {
            return c0013n.f62a;
        }
        return null;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1050a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        AbstractC0022x.d(new C0021w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C0239i.f3393a;
        H1.i iVar = this.f689b;
        try {
            l1.d c2 = c();
            kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            F1.h hVar = (F1.h) c2;
            AbstractC0991b abstractC0991b = hVar.f604e;
            Object obj2 = hVar.f606g;
            l1.i context = abstractC0991b.getContext();
            Object m2 = F1.a.m(context, obj2);
            l0 m3 = m2 != F1.a.f594f ? AbstractC0022x.m(abstractC0991b, context, m2) : null;
            try {
                l1.i context2 = abstractC0991b.getContext();
                Object k2 = k();
                Throwable g2 = g(k2);
                S s2 = (g2 == null && AbstractC0022x.f(this.f1c)) ? (S) context2.m(C0019u.f73b) : null;
                if (s2 != null && !s2.b()) {
                    CancellationException z2 = ((b0) s2).z();
                    b(k2, z2);
                    abstractC0991b.i(R1.l.h(z2));
                } else if (g2 != null) {
                    abstractC0991b.i(R1.l.h(g2));
                } else {
                    abstractC0991b.i(h(k2));
                }
                if (m3 == null || m3.W()) {
                    F1.a.g(context, m2);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = R1.l.h(th);
                }
                j(null, AbstractC0236f.a(obj));
            } catch (Throwable th2) {
                if (m3 == null || m3.W()) {
                    F1.a.g(context, m2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = R1.l.h(th4);
            }
            j(th3, AbstractC0236f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
