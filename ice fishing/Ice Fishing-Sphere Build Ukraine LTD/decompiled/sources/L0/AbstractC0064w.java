package L0;

import Q0.AbstractC0068a;
import a.AbstractC0069a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import t0.AbstractC0249d;

/* renamed from: L0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0064w {

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f685c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f686d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f687e;

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f688f;

    /* renamed from: g, reason: collision with root package name */
    public static final A.j f689g;

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f683a = new A.j(11, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f684b = new A.j(11, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final F f690h = new F(false);

    /* renamed from: i, reason: collision with root package name */
    public static final F f691i = new F(true);

    static {
        int i2 = 11;
        f685c = new A.j(i2, "COMPLETING_ALREADY");
        f686d = new A.j(i2, "COMPLETING_WAITING_CHILDREN");
        f687e = new A.j(i2, "COMPLETING_RETRY");
        f688f = new A.j(i2, "TOO_LATE_TO_CANCEL");
        f689g = new A.j(i2, "SEALED");
    }

    public static final v0.i a(v0.i iVar, v0.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0059q c0059q = C0059q.f675h;
        boolean booleanValue = ((Boolean) iVar.m(bool, c0059q)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.m(bool, c0059q)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.f(iVar2);
        }
        v0.j jVar = v0.j.f3014e;
        v0.i iVar3 = (v0.i) iVar.m(jVar, new C0059q(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.m(jVar, C0059q.f674g);
        }
        return iVar3.f((v0.i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0048f c(v0.d dVar) {
        C0048f c0048f;
        C0048f c0048f2;
        if (!(dVar instanceof Q0.h)) {
            return new C0048f(1, dVar);
        }
        Q0.h hVar = (Q0.h) dVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q0.h.f882l;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            A.j jVar = AbstractC0068a.f872d;
            c0048f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, jVar);
                c0048f2 = null;
                break;
            }
            if (obj instanceof C0048f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, jVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0048f2 = (C0048f) obj;
                break loop0;
            }
            if (obj != jVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0048f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0048f.f654k;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0048f2);
            if (!(obj2 instanceof C0055m) || ((C0055m) obj2).f668d == null) {
                C0048f.f653j.set(c0048f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0048f2, C0044b.f648e);
                c0048f = c0048f2;
            } else {
                c0048f2.r();
            }
            if (c0048f != null) {
                return c0048f;
            }
        }
        return new C0048f(2, dVar);
    }

    public static final void d(Throwable th, v0.i iVar) {
        try {
            M0.b bVar = (M0.b) iVar.i(C0062u.f681e);
            if (bVar != null) {
                bVar.c(th, iVar);
            } else {
                AbstractC0068a.e(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                o.g.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0068a.e(th, iVar);
        }
    }

    public static /* synthetic */ D e(Q q2, boolean z2, V v2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((a0) q2).I(z2, (i2 & 2) != 0, v2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static f0 g(InterfaceC0063v interfaceC0063v, D0.p pVar) {
        v0.i a2 = a(interfaceC0063v.o(), v0.j.f3014e, true);
        S0.d dVar = C.f611a;
        if (a2 != dVar && a2.i(v0.e.f3013e) == null) {
            a2 = a2.f(dVar);
        }
        f0 f0Var = new f0(a2, true);
        f0Var.W(1, f0Var, pVar);
        return f0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0056n ? o.g.f(((C0056n) obj).f671a) : obj;
    }

    public static final void i(C0048f c0048f, v0.d dVar, boolean z2) {
        Object obj = C0048f.f654k.get(c0048f);
        Throwable g2 = c0048f.g(obj);
        Object f2 = g2 != null ? o.g.f(g2) : c0048f.i(obj);
        if (!z2) {
            dVar.c(f2);
            return;
        }
        E0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Q0.h hVar = (Q0.h) dVar;
        x0.b bVar = hVar.f884i;
        v0.i j2 = bVar.j();
        Object n2 = AbstractC0068a.n(j2, hVar.f886k);
        k0 m2 = n2 != AbstractC0068a.f874f ? m(bVar, j2, n2) : null;
        try {
            bVar.c(f2);
        } finally {
            if (m2 == null || m2.X()) {
                AbstractC0068a.h(j2, n2);
            }
        }
    }

    public static Object j(D0.p pVar) {
        v0.j jVar = v0.j.f3014e;
        Thread currentThread = Thread.currentThread();
        v0.e eVar = v0.e.f3013e;
        I a2 = i0.a();
        v0.i a3 = a(jVar, a2, true);
        S0.d dVar = C.f611a;
        if (a3 != dVar && a3.i(eVar) == null) {
            a3 = a3.f(dVar);
        }
        C0045c c0045c = new C0045c(a3, currentThread, a2);
        c0045c.W(1, c0045c, pVar);
        I i2 = c0045c.f650i;
        if (i2 != null) {
            int i3 = I.f618j;
            i2.j(false);
        }
        while (!Thread.interrupted()) {
            try {
                long k2 = i2 != null ? i2.k() : Long.MAX_VALUE;
                if (!(c0045c.E() instanceof M)) {
                    if (i2 != null) {
                        int i4 = I.f618j;
                        i2.e(false);
                    }
                    Object l2 = l(c0045c.E());
                    C0056n c0056n = l2 instanceof C0056n ? (C0056n) l2 : null;
                    if (c0056n == null) {
                        return l2;
                    }
                    throw c0056n.f671a;
                }
                LockSupport.parkNanos(c0045c, k2);
            } catch (Throwable th) {
                if (i2 != null) {
                    int i5 = I.f618j;
                    i2.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0045c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(v0.d dVar) {
        Object f2;
        if (dVar instanceof Q0.h) {
            return dVar.toString();
        }
        try {
            f2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            f2 = o.g.f(th);
        }
        if (AbstractC0249d.a(f2) != null) {
            f2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) f2;
    }

    public static final Object l(Object obj) {
        M m2;
        N n2 = obj instanceof N ? (N) obj : null;
        return (n2 == null || (m2 = n2.f624a) == null) ? obj : m2;
    }

    public static final k0 m(v0.d dVar, v0.i iVar, Object obj) {
        k0 k0Var = null;
        if (!(dVar instanceof x0.c)) {
            return null;
        }
        if (iVar.i(l0.f664e) != null) {
            x0.c cVar = (x0.c) dVar;
            while (true) {
                if ((cVar instanceof A) || (cVar = cVar.h()) == null) {
                    break;
                }
                if (cVar instanceof k0) {
                    k0Var = (k0) cVar;
                    break;
                }
            }
            if (k0Var != null) {
                k0Var.Y(iVar, obj);
            }
        }
        return k0Var;
    }

    public static final Object n(v0.i iVar, D0.p pVar, x0.f fVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        v0.i iVar2 = fVar.f3091f;
        E0.i.b(iVar2);
        v0.i f2 = !((Boolean) iVar.m(Boolean.FALSE, C0059q.f675h)).booleanValue() ? iVar2.f(iVar) : a(iVar2, iVar, false);
        Q q2 = (Q) f2.i(C0062u.f682f);
        if (q2 != null && !q2.b()) {
            throw ((a0) q2).A();
        }
        if (f2 == iVar2) {
            Q0.u uVar = new Q0.u(fVar, f2);
            return AbstractC0069a.I(uVar, uVar, pVar);
        }
        v0.e eVar = v0.e.f3013e;
        if (E0.i.a(f2.i(eVar), iVar2.i(eVar))) {
            k0 k0Var = new k0(f2, fVar);
            v0.i iVar3 = k0Var.f645g;
            Object n2 = AbstractC0068a.n(iVar3, null);
            try {
                return AbstractC0069a.I(k0Var, k0Var, pVar);
            } finally {
                AbstractC0068a.h(iVar3, n2);
            }
        }
        A a2 = new A(fVar, f2);
        AbstractC0069a.H(pVar, a2, a2);
        do {
            atomicIntegerFieldUpdater = A.f609i;
            int i2 = atomicIntegerFieldUpdater.get(a2);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l2 = l(a2.E());
                if (l2 instanceof C0056n) {
                    throw ((C0056n) l2).f671a;
                }
                return l2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(a2, 0, 1));
        return w0.a.f3076e;
    }
}
