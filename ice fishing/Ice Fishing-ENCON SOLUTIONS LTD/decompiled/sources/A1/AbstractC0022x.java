package A1;

import h1.AbstractC0236f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import n1.AbstractC0995f;
import n1.InterfaceC0992c;
import u0.AbstractC1050a;

/* renamed from: A1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0022x {

    /* renamed from: c, reason: collision with root package name */
    public static final C.j f76c;

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f77d;

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f78e;

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f79f;

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f80g;

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f74a = new C.j(5, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f75b = new C.j(5, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final G f81h = new G(false);

    /* renamed from: i, reason: collision with root package name */
    public static final G f82i = new G(true);

    static {
        int i2 = 5;
        f76c = new C.j(i2, "COMPLETING_ALREADY");
        f77d = new C.j(i2, "COMPLETING_WAITING_CHILDREN");
        f78e = new C.j(i2, "COMPLETING_RETRY");
        f79f = new C.j(i2, "TOO_LATE_TO_CANCEL");
        f80g = new C.j(i2, "SEALED");
    }

    public static final l1.i a(l1.i iVar, l1.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0016q c0016q = C0016q.f66g;
        boolean booleanValue = ((Boolean) iVar.k(bool, c0016q)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.k(bool, c0016q)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.l(iVar2);
        }
        l1.j jVar = l1.j.f8138a;
        l1.i iVar3 = (l1.i) iVar.k(jVar, new C0016q(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.k(jVar, C0016q.f65f);
        }
        return iVar3.l((l1.i) obj);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0005f c(l1.d dVar) {
        C0005f c0005f;
        C0005f c0005f2;
        if (!(dVar instanceof F1.h)) {
            return new C0005f(1, dVar);
        }
        F1.h hVar = (F1.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.h.f602h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C.j jVar = F1.a.f592d;
            c0005f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, jVar);
                c0005f2 = null;
                break;
            }
            if (obj instanceof C0005f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, jVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0005f2 = (C0005f) obj;
                break loop0;
            }
            if (obj != jVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0005f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0005f.f45g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0005f2);
            if (!(obj2 instanceof C0012m) || ((C0012m) obj2).f58d == null) {
                C0005f.f44f.set(c0005f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0005f2, C0001b.f37a);
                c0005f = c0005f2;
            } else {
                c0005f2.q();
            }
            if (c0005f != null) {
                return c0005f;
            }
        }
        return new C0005f(2, dVar);
    }

    public static final void d(Throwable th, l1.i iVar) {
        try {
            B1.b bVar = (B1.b) iVar.m(C0019u.f72a);
            if (bVar != null) {
                bVar.j(th, iVar);
            } else {
                F1.a.d(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1050a.a(runtimeException, th);
                th = runtimeException;
            }
            F1.a.d(th, iVar);
        }
    }

    public static /* synthetic */ E e(S s2, boolean z2, W w2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((b0) s2).H(z2, (i2 & 2) != 0, w2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static g0 g(InterfaceC0020v interfaceC0020v, t1.p pVar) {
        l1.i a2 = a(interfaceC0020v.h(), l1.j.f8138a, true);
        H1.d dVar = D.f2a;
        if (a2 != dVar && a2.m(l1.e.f8137a) == null) {
            a2 = a2.l(dVar);
        }
        g0 g0Var = new g0(a2, true);
        g0Var.V(1, g0Var, pVar);
        return g0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0013n ? R1.l.h(((C0013n) obj).f62a) : obj;
    }

    public static final void i(C0005f c0005f, l1.d dVar, boolean z2) {
        Object obj = C0005f.f45g.get(c0005f);
        Throwable g2 = c0005f.g(obj);
        Object h2 = g2 != null ? R1.l.h(g2) : c0005f.h(obj);
        if (!z2) {
            dVar.i(h2);
            return;
        }
        kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        F1.h hVar = (F1.h) dVar;
        AbstractC0991b abstractC0991b = hVar.f604e;
        l1.i context = abstractC0991b.getContext();
        Object m2 = F1.a.m(context, hVar.f606g);
        l0 m3 = m2 != F1.a.f594f ? m(abstractC0991b, context, m2) : null;
        try {
            abstractC0991b.i(h2);
        } finally {
            if (m3 == null || m3.W()) {
                F1.a.g(context, m2);
            }
        }
    }

    public static Object j(t1.p pVar) {
        l1.j jVar = l1.j.f8138a;
        Thread currentThread = Thread.currentThread();
        l1.e eVar = l1.e.f8137a;
        J a2 = j0.a();
        l1.i a3 = a(jVar, a2, true);
        H1.d dVar = D.f2a;
        if (a3 != dVar && a3.m(eVar) == null) {
            a3 = a3.l(dVar);
        }
        C0002c c0002c = new C0002c(a3, currentThread, a2);
        c0002c.V(1, c0002c, pVar);
        J j2 = c0002c.f41e;
        if (j2 != null) {
            int i2 = J.f9f;
            j2.q(false);
        }
        while (!Thread.interrupted()) {
            try {
                long r2 = j2 != null ? j2.r() : Long.MAX_VALUE;
                if (!(c0002c.D() instanceof N)) {
                    if (j2 != null) {
                        int i3 = J.f9f;
                        j2.o(false);
                    }
                    Object l2 = l(c0002c.D());
                    C0013n c0013n = l2 instanceof C0013n ? (C0013n) l2 : null;
                    if (c0013n == null) {
                        return l2;
                    }
                    throw c0013n.f62a;
                }
                LockSupport.parkNanos(c0002c, r2);
            } catch (Throwable th) {
                if (j2 != null) {
                    int i4 = J.f9f;
                    j2.o(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0002c.r(interruptedException);
        throw interruptedException;
    }

    public static final String k(l1.d dVar) {
        Object h2;
        if (dVar instanceof F1.h) {
            return dVar.toString();
        }
        try {
            h2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            h2 = R1.l.h(th);
        }
        if (AbstractC0236f.a(h2) != null) {
            h2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) h2;
    }

    public static final Object l(Object obj) {
        N n2;
        O o2 = obj instanceof O ? (O) obj : null;
        return (o2 == null || (n2 = o2.f15a) == null) ? obj : n2;
    }

    public static final l0 m(l1.d dVar, l1.i iVar, Object obj) {
        l0 l0Var = null;
        if (!(dVar instanceof InterfaceC0992c)) {
            return null;
        }
        if (iVar.m(m0.f60a) != null) {
            InterfaceC0992c interfaceC0992c = (InterfaceC0992c) dVar;
            while (true) {
                if ((interfaceC0992c instanceof B) || (interfaceC0992c = interfaceC0992c.f()) == null) {
                    break;
                }
                if (interfaceC0992c instanceof l0) {
                    l0Var = (l0) interfaceC0992c;
                    break;
                }
            }
            if (l0Var != null) {
                l0Var.X(iVar, obj);
            }
        }
        return l0Var;
    }

    public static final Object n(l1.i iVar, t1.p pVar, AbstractC0995f abstractC0995f) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        l1.i iVar2 = abstractC0995f.f8213b;
        kotlin.jvm.internal.i.b(iVar2);
        l1.i l2 = !((Boolean) iVar.k(Boolean.FALSE, C0016q.f66g)).booleanValue() ? iVar2.l(iVar) : a(iVar2, iVar, false);
        S s2 = (S) l2.m(C0019u.f73b);
        if (s2 != null && !s2.b()) {
            throw ((b0) s2).z();
        }
        if (l2 == iVar2) {
            F1.t tVar = new F1.t(abstractC0995f, l2);
            return R1.d.I(tVar, tVar, pVar);
        }
        l1.e eVar = l1.e.f8137a;
        if (kotlin.jvm.internal.i.a(l2.m(eVar), iVar2.m(eVar))) {
            l0 l0Var = new l0(l2, abstractC0995f);
            l1.i iVar3 = l0Var.f32c;
            Object m2 = F1.a.m(iVar3, null);
            try {
                return R1.d.I(l0Var, l0Var, pVar);
            } finally {
                F1.a.g(iVar3, m2);
            }
        }
        B b2 = new B(abstractC0995f, l2);
        AbstractC1050a.B(pVar, b2, b2);
        do {
            atomicIntegerFieldUpdater = B.f0e;
            int i2 = atomicIntegerFieldUpdater.get(b2);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l3 = l(b2.D());
                if (l3 instanceof C0013n) {
                    throw ((C0013n) l3).f62a;
                }
                return l3;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(b2, 0, 1));
        return EnumC0985a.f8194a;
    }
}
