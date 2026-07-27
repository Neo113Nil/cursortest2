package O7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q7.AbstractC4940i;
import v7.C5134e;
import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5135f;
import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5217a;
import x7.AbstractC5219c;

/* renamed from: O7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0399y {

    /* renamed from: a, reason: collision with root package name */
    public static final T7.v f2643a = new T7.v("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final T7.v f2644b = new T7.v("REMOVED_TASK", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final T7.v f2645c = new T7.v("CLOSED_EMPTY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final T7.v f2646d = new T7.v("COMPLETING_ALREADY", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final T7.v f2647e = new T7.v("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final T7.v f2648f = new T7.v("COMPLETING_RETRY", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final T7.v f2649g = new T7.v("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final T7.v f2650h = new T7.v("SEALED", 0);
    public static final J i = new J(false);

    /* renamed from: j, reason: collision with root package name */
    public static final J f2651j = new J(true);

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(long j9, E7.p pVar, InterfaceC5133d interfaceC5133d) {
        u0 u0Var;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5133d instanceof u0) {
            u0Var = (u0) interfaceC5133d;
            int i9 = u0Var.f2632v;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                u0Var.f2632v = i9 - Integer.MIN_VALUE;
                Object obj = u0Var.f2631u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = u0Var.f2632v;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (j9 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    try {
                        u0Var.f2630n = rVar2;
                        u0Var.f2632v = 1;
                        t0 t0Var = new t0(j9, u0Var);
                        rVar2.f38861n = t0Var;
                        Object u7 = u(t0Var, pVar);
                        return u7 == enumC5179a ? enumC5179a : u7;
                    } catch (s0 e6) {
                        e = e6;
                        rVar = rVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = u0Var.f2630n;
                    try {
                        com.bumptech.glide.f.r(obj);
                        return obj;
                    } catch (s0 e9) {
                        e = e9;
                    }
                }
                if (e.f2625n != rVar.f38861n) {
                    return null;
                }
                throw e;
            }
        }
        u0Var = new u0(interfaceC5133d);
        Object obj2 = u0Var.f2631u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = u0Var.f2632v;
        if (i4 != 0) {
        }
        if (e.f2625n != rVar.f38861n) {
        }
    }

    public static C0388m a() {
        C0388m c0388m = new C0388m(true);
        c0388m.F(null);
        return c0388m;
    }

    public static final T7.e b(InterfaceC5138i interfaceC5138i) {
        if (interfaceC5138i.i(C0396v.f2634u) == null) {
            interfaceC5138i = interfaceC5138i.n(new b0());
        }
        return new T7.e(interfaceC5138i);
    }

    public static B c(InterfaceC0397w interfaceC0397w, E7.p pVar, int i4) {
        EnumC0398x enumC0398x = EnumC0398x.f2640w;
        C5139j c5139j = C5139j.f41372n;
        if ((i4 & 2) != 0) {
            enumC0398x = EnumC0398x.f2637n;
        }
        InterfaceC5138i p6 = p(interfaceC0397w, c5139j);
        B i0Var = enumC0398x == EnumC0398x.f2638u ? new i0(p6, pVar) : new B(p6, true, 0);
        i0Var.W(enumC0398x, i0Var, pVar);
        return i0Var;
    }

    public static final void d(InterfaceC5138i interfaceC5138i, CancellationException cancellationException) {
        Y y6 = (Y) interfaceC5138i.i(C0396v.f2634u);
        if (y6 != null) {
            y6.a(cancellationException);
        }
    }

    public static final Object e(E7.p pVar, InterfaceC5133d interfaceC5133d) {
        T7.s sVar = new T7.s(interfaceC5133d, interfaceC5133d.getContext());
        Object U7 = com.bumptech.glide.g.U(sVar, sVar, pVar);
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        return U7;
    }

    public static final Object f(long j9, InterfaceC5133d interfaceC5133d) {
        q7.v vVar = q7.v.f40183a;
        if (j9 > 0) {
            C0382g c0382g = new C0382g(1, w8.a.f(interfaceC5133d));
            c0382g.r();
            if (j9 < Long.MAX_VALUE) {
                i(c0382g.f2600x).k(j9, c0382g);
            }
            Object q6 = c0382g.q();
            if (q6 == EnumC5179a.f41704n) {
                return q6;
            }
        }
        return vVar;
    }

    public static final void g(InterfaceC5138i interfaceC5138i) {
        Y y6 = (Y) interfaceC5138i.i(C0396v.f2634u);
        if (y6 != null && !y6.j()) {
            throw ((h0) y6).w();
        }
    }

    public static final InterfaceC5138i h(InterfaceC5138i interfaceC5138i, InterfaceC5138i interfaceC5138i2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f2622v;
        boolean booleanValue = ((Boolean) interfaceC5138i.m(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC5138i2.m(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC5138i.n(interfaceC5138i2);
        }
        C5139j c5139j = C5139j.f41372n;
        InterfaceC5138i interfaceC5138i3 = (InterfaceC5138i) interfaceC5138i.m(c5139j, new r(2, 2));
        Object obj = interfaceC5138i2;
        if (booleanValue2) {
            obj = interfaceC5138i2.m(c5139j, r.f2621u);
        }
        return interfaceC5138i3.n((InterfaceC5138i) obj);
    }

    public static final C i(InterfaceC5138i interfaceC5138i) {
        InterfaceC5136g i4 = interfaceC5138i.i(C5134e.f41371n);
        C c4 = i4 instanceof C ? (C) i4 : null;
        return c4 == null ? A.f2547a : c4;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0382g k(InterfaceC5133d interfaceC5133d) {
        C0382g c0382g;
        C0382g c0382g2;
        if (!(interfaceC5133d instanceof T7.h)) {
            return new C0382g(1, interfaceC5133d);
        }
        T7.h hVar = (T7.h) interfaceC5133d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.h.f3139A;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            T7.v vVar = T7.a.f3129d;
            c0382g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                c0382g2 = null;
                break;
            }
            if (obj instanceof C0382g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0382g2 = (C0382g) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0382g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0382g.f2598z;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0382g2);
            if (!(obj2 instanceof C0390o) || ((C0390o) obj2).f2616d == null) {
                C0382g.f2597y.set(c0382g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0382g2, C0377b.f2579n);
                c0382g = c0382g2;
            } else {
                c0382g2.n();
            }
            if (c0382g != null) {
                return c0382g;
            }
        }
        return new C0382g(2, interfaceC5133d);
    }

    public static final void l(Throwable th, InterfaceC5138i interfaceC5138i) {
        try {
            P7.b bVar = (P7.b) interfaceC5138i.i(C0396v.f2633n);
            if (bVar != null) {
                bVar.p(th);
            } else {
                T7.a.d(th, interfaceC5138i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.bumptech.glide.d.b(runtimeException, th);
                th = runtimeException;
            }
            T7.a.d(th, interfaceC5138i);
        }
    }

    public static final boolean n(InterfaceC0397w interfaceC0397w) {
        Y y6 = (Y) interfaceC0397w.z().i(C0396v.f2634u);
        if (y6 != null) {
            return y6.j();
        }
        return true;
    }

    public static B o(InterfaceC0397w interfaceC0397w, AbstractC0395u abstractC0395u, E7.p pVar, int i4) {
        EnumC0398x enumC0398x = EnumC0398x.f2640w;
        InterfaceC5138i interfaceC5138i = abstractC0395u;
        if ((i4 & 1) != 0) {
            interfaceC5138i = C5139j.f41372n;
        }
        if ((i4 & 2) != 0) {
            enumC0398x = EnumC0398x.f2637n;
        }
        InterfaceC5138i p6 = p(interfaceC0397w, interfaceC5138i);
        B j0Var = enumC0398x == EnumC0398x.f2638u ? new j0(p6, pVar) : new B(p6, true, 1);
        j0Var.W(enumC0398x, j0Var, pVar);
        return j0Var;
    }

    public static final InterfaceC5138i p(InterfaceC0397w interfaceC0397w, InterfaceC5138i interfaceC5138i) {
        InterfaceC5138i h9 = h(interfaceC0397w.z(), interfaceC5138i, true);
        V7.e eVar = F.f2551a;
        return (h9 == eVar || h9.i(C5134e.f41371n) != null) ? h9 : h9.n(eVar);
    }

    public static final Object q(Object obj) {
        return obj instanceof C0391p ? com.bumptech.glide.f.e(((C0391p) obj).f2619a) : obj;
    }

    public static final void r(C0382g c0382g, InterfaceC5133d interfaceC5133d, boolean z8) {
        Object obj = C0382g.f2598z.get(c0382g);
        Throwable e6 = c0382g.e(obj);
        Object e9 = e6 != null ? com.bumptech.glide.f.e(e6) : c0382g.g(obj);
        if (!z8) {
            interfaceC5133d.resumeWith(e9);
            return;
        }
        kotlin.jvm.internal.h.c(interfaceC5133d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        T7.h hVar = (T7.h) interfaceC5133d;
        AbstractC5219c abstractC5219c = hVar.f3141x;
        InterfaceC5138i context = abstractC5219c.getContext();
        Object m8 = T7.a.m(context, hVar.f3143z);
        w0 x3 = m8 != T7.a.f3131f ? x(abstractC5219c, context, m8) : null;
        try {
            abstractC5219c.resumeWith(e9);
            if (x3 == null || x3.X()) {
                T7.a.g(context, m8);
            }
        } catch (Throwable th) {
            if (x3 == null || x3.X()) {
                T7.a.g(context, m8);
            }
            throw th;
        }
    }

    public static final Object s(InterfaceC5138i interfaceC5138i, E7.p pVar) {
        P p6;
        InterfaceC5138i h9;
        Thread currentThread = Thread.currentThread();
        InterfaceC5137h interfaceC5137h = C5134e.f41371n;
        InterfaceC5135f interfaceC5135f = (InterfaceC5135f) interfaceC5138i.i(interfaceC5137h);
        C5139j c5139j = C5139j.f41372n;
        if (interfaceC5135f == null) {
            p6 = q0.a();
            h9 = h(c5139j, interfaceC5138i.n(p6), true);
            V7.e eVar = F.f2551a;
            if (h9 != eVar && h9.i(interfaceC5137h) == null) {
                h9 = h9.n(eVar);
            }
        } else {
            if (interfaceC5135f instanceof P) {
            }
            p6 = (P) q0.f2620a.get();
            h9 = h(c5139j, interfaceC5138i, true);
            V7.e eVar2 = F.f2551a;
            if (h9 != eVar2 && h9.i(interfaceC5137h) == null) {
                h9 = h9.n(eVar2);
            }
        }
        C0378c c0378c = new C0378c(h9, currentThread, p6);
        c0378c.W(EnumC0398x.f2637n, c0378c, pVar);
        P p9 = c0378c.f2582x;
        if (p9 != null) {
            int i4 = P.f2567y;
            p9.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long E8 = p9 != null ? p9.E() : Long.MAX_VALUE;
                if (!(c0378c.C() instanceof V)) {
                    if (p9 != null) {
                        int i9 = P.f2567y;
                        p9.A(false);
                    }
                    Object w9 = w(c0378c.C());
                    C0391p c0391p = w9 instanceof C0391p ? (C0391p) w9 : null;
                    if (c0391p == null) {
                        return w9;
                    }
                    throw c0391p.f2619a;
                }
                LockSupport.parkNanos(c0378c, E8);
            } catch (Throwable th) {
                if (p9 != null) {
                    int i10 = P.f2567y;
                    p9.A(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0378c.o(interruptedException);
        throw interruptedException;
    }

    public static final Object u(t0 t0Var, E7.p pVar) {
        Object c0391p;
        Object K8;
        t0Var.G(false, true, new I(0, i(t0Var.f3164w.getContext()).b(t0Var.f2628x, t0Var, t0Var.f2578v)));
        try {
            if (pVar instanceof AbstractC5217a) {
                kotlin.jvm.internal.u.b(2, pVar);
                c0391p = pVar.invoke(t0Var, t0Var);
            } else {
                c0391p = w8.a.m(pVar, t0Var, t0Var);
            }
        } catch (Throwable th) {
            c0391p = new C0391p(th, false);
        }
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        if (c0391p == enumC5179a || (K8 = t0Var.K(c0391p)) == f2647e) {
            return enumC5179a;
        }
        if (K8 instanceof C0391p) {
            Throwable th2 = ((C0391p) K8).f2619a;
            if (!(th2 instanceof s0)) {
                throw th2;
            }
            if (((s0) th2).f2625n != t0Var) {
                throw th2;
            }
            if (c0391p instanceof C0391p) {
                throw ((C0391p) c0391p).f2619a;
            }
        } else {
            c0391p = w(K8);
        }
        return c0391p;
    }

    public static final String v(InterfaceC5133d interfaceC5133d) {
        Object e6;
        if (interfaceC5133d instanceof T7.h) {
            return interfaceC5133d.toString();
        }
        try {
            e6 = interfaceC5133d + '@' + j(interfaceC5133d);
        } catch (Throwable th) {
            e6 = com.bumptech.glide.f.e(th);
        }
        if (AbstractC4940i.a(e6) != null) {
            e6 = interfaceC5133d.getClass().getName() + '@' + j(interfaceC5133d);
        }
        return (String) e6;
    }

    public static final Object w(Object obj) {
        V v6;
        W w9 = obj instanceof W ? (W) obj : null;
        return (w9 == null || (v6 = w9.f2574a) == null) ? obj : v6;
    }

    public static final w0 x(InterfaceC5133d interfaceC5133d, InterfaceC5138i interfaceC5138i, Object obj) {
        w0 w0Var = null;
        if ((interfaceC5133d instanceof x7.d) && interfaceC5138i.i(x0.f2642n) != null) {
            x7.d dVar = (x7.d) interfaceC5133d;
            while (true) {
                if ((dVar instanceof D) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof w0) {
                    w0Var = (w0) dVar;
                    break;
                }
            }
            if (w0Var != null) {
                w0Var.Y(interfaceC5138i, obj);
            }
        }
        return w0Var;
    }

    public static final Object y(InterfaceC5138i interfaceC5138i, E7.p pVar, InterfaceC5133d interfaceC5133d) {
        Object w9;
        InterfaceC5138i context = interfaceC5133d.getContext();
        InterfaceC5138i n9 = !((Boolean) interfaceC5138i.m(Boolean.FALSE, r.f2622v)).booleanValue() ? context.n(interfaceC5138i) : h(context, interfaceC5138i, false);
        g(n9);
        if (n9 == context) {
            T7.s sVar = new T7.s(interfaceC5133d, n9);
            w9 = com.bumptech.glide.g.U(sVar, sVar, pVar);
        } else {
            C5134e c5134e = C5134e.f41371n;
            if (kotlin.jvm.internal.h.a(n9.i(c5134e), context.i(c5134e))) {
                w0 w0Var = new w0(interfaceC5133d, n9);
                InterfaceC5138i interfaceC5138i2 = w0Var.f2578v;
                Object m8 = T7.a.m(interfaceC5138i2, null);
                try {
                    Object U7 = com.bumptech.glide.g.U(w0Var, w0Var, pVar);
                    T7.a.g(interfaceC5138i2, m8);
                    w9 = U7;
                } catch (Throwable th) {
                    T7.a.g(interfaceC5138i2, m8);
                    throw th;
                }
            } else {
                D d2 = new D(interfaceC5133d, n9);
                com.bumptech.glide.f.q(pVar, d2, d2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D.f2549x;
                    int i4 = atomicIntegerFieldUpdater.get(d2);
                    if (i4 != 0) {
                        if (i4 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        w9 = w(d2.C());
                        if (w9 instanceof C0391p) {
                            throw ((C0391p) w9).f2619a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(d2, 0, 1)) {
                        w9 = EnumC5179a.f41704n;
                        break;
                    }
                }
            }
        }
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        return w9;
    }

    public static final Object z(long j9, E7.p pVar, AbstractC5219c abstractC5219c) {
        if (j9 <= 0) {
            throw new s0("Timed out immediately", null);
        }
        Object u7 = u(new t0(j9, abstractC5219c), pVar);
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        return u7;
    }
}
