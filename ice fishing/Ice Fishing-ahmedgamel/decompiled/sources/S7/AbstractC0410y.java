package S7;

import E2.C0316m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import u7.AbstractC5083i;
import z7.C5241e;
import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5242f;
import z7.InterfaceC5243g;
import z7.InterfaceC5244h;
import z7.InterfaceC5245i;

/* renamed from: S7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0410y {

    /* renamed from: a, reason: collision with root package name */
    public static final C0316m f3090a = new C0316m("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0316m f3091b = new C0316m("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0316m f3092c = new C0316m("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0316m f3093d = new C0316m("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0316m f3094e = new C0316m("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final C0316m f3095f = new C0316m("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final C0316m f3096g = new C0316m("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0316m f3097h = new C0316m("SEALED", 1);
    public static final J i = new J(false);

    /* renamed from: j, reason: collision with root package name */
    public static final J f3098j = new J(true);

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(long j6, I7.p pVar, InterfaceC5240d interfaceC5240d) {
        u0 u0Var;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5240d instanceof u0) {
            u0Var = (u0) interfaceC5240d;
            int i6 = u0Var.f3079v;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                u0Var.f3079v = i6 - Integer.MIN_VALUE;
                Object obj = u0Var.f3078u;
                A7.a aVar = A7.a.f215n;
                i4 = u0Var.f3079v;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    if (j6 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    try {
                        u0Var.f3077n = rVar2;
                        u0Var.f3079v = 1;
                        t0 t0Var = new t0(j6, u0Var);
                        rVar2.f38644n = t0Var;
                        Object u6 = u(t0Var, pVar);
                        return u6 == aVar ? aVar : u6;
                    } catch (s0 e9) {
                        e = e9;
                        rVar = rVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = u0Var.f3077n;
                    try {
                        Q3.b.s(obj);
                        return obj;
                    } catch (s0 e10) {
                        e = e10;
                    }
                }
                if (e.f3072n != rVar.f38644n) {
                    return null;
                }
                throw e;
            }
        }
        u0Var = new u0(interfaceC5240d);
        Object obj2 = u0Var.f3078u;
        A7.a aVar2 = A7.a.f215n;
        i4 = u0Var.f3079v;
        if (i4 != 0) {
        }
        if (e.f3072n != rVar.f38644n) {
        }
    }

    public static C0399m a() {
        C0399m c0399m = new C0399m(true);
        c0399m.F(null);
        return c0399m;
    }

    public static final X7.e b(InterfaceC5245i interfaceC5245i) {
        if (interfaceC5245i.m(C0407v.f3081u) == null) {
            interfaceC5245i = interfaceC5245i.n(new b0());
        }
        return new X7.e(interfaceC5245i);
    }

    public static B c(InterfaceC0408w interfaceC0408w, I7.p pVar, int i4) {
        EnumC0409x enumC0409x = EnumC0409x.f3087w;
        C5246j c5246j = C5246j.f42241n;
        if ((i4 & 2) != 0) {
            enumC0409x = EnumC0409x.f3084n;
        }
        InterfaceC5245i p9 = p(interfaceC0408w, c5246j);
        B i0Var = enumC0409x == EnumC0409x.f3085u ? new i0(p9, pVar) : new B(p9, true, 0);
        i0Var.W(enumC0409x, i0Var, pVar);
        return i0Var;
    }

    public static final void d(InterfaceC5245i interfaceC5245i, CancellationException cancellationException) {
        Y y7 = (Y) interfaceC5245i.m(C0407v.f3081u);
        if (y7 != null) {
            y7.a(cancellationException);
        }
    }

    public static final Object e(I7.p pVar, InterfaceC5240d interfaceC5240d) {
        X7.s sVar = new X7.s(interfaceC5240d, interfaceC5240d.getContext());
        Object q8 = X2.a.q(sVar, sVar, pVar);
        A7.a aVar = A7.a.f215n;
        return q8;
    }

    public static final Object f(long j6, InterfaceC5240d interfaceC5240d) {
        u7.v vVar = u7.v.f41073a;
        if (j6 > 0) {
            C0393g c0393g = new C0393g(1, A8.b.n(interfaceC5240d));
            c0393g.r();
            if (j6 < Long.MAX_VALUE) {
                i(c0393g.f3047x).k(j6, c0393g);
            }
            Object q8 = c0393g.q();
            if (q8 == A7.a.f215n) {
                return q8;
            }
        }
        return vVar;
    }

    public static final void g(InterfaceC5245i interfaceC5245i) {
        Y y7 = (Y) interfaceC5245i.m(C0407v.f3081u);
        if (y7 != null && !y7.j()) {
            throw ((h0) y7).w();
        }
    }

    public static final InterfaceC5245i h(InterfaceC5245i interfaceC5245i, InterfaceC5245i interfaceC5245i2, boolean z6) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f3069v;
        boolean booleanValue = ((Boolean) interfaceC5245i.l(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC5245i2.l(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC5245i.n(interfaceC5245i2);
        }
        C5246j c5246j = C5246j.f42241n;
        InterfaceC5245i interfaceC5245i3 = (InterfaceC5245i) interfaceC5245i.l(c5246j, new r(2, 2));
        Object obj = interfaceC5245i2;
        if (booleanValue2) {
            obj = interfaceC5245i2.l(c5246j, r.f3068u);
        }
        return interfaceC5245i3.n((InterfaceC5245i) obj);
    }

    public static final C i(InterfaceC5245i interfaceC5245i) {
        InterfaceC5243g m9 = interfaceC5245i.m(C5241e.f42240n);
        C c9 = m9 instanceof C ? (C) m9 : null;
        return c9 == null ? A.f2994a : c9;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0393g k(InterfaceC5240d interfaceC5240d) {
        C0393g c0393g;
        C0393g c0393g2;
        if (!(interfaceC5240d instanceof X7.h)) {
            return new C0393g(1, interfaceC5240d);
        }
        X7.h hVar = (X7.h) interfaceC5240d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3788A;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0316m c0316m = X7.a.f3778d;
            c0393g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, c0316m);
                c0393g2 = null;
                break;
            }
            if (obj instanceof C0393g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, c0316m)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0393g2 = (C0393g) obj;
                break loop0;
            }
            if (obj != c0316m && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0393g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0393g.f3045z;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0393g2);
            if (!(obj2 instanceof C0401o) || ((C0401o) obj2).f3063d == null) {
                C0393g.f3044y.set(c0393g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0393g2, C0388b.f3026n);
                c0393g = c0393g2;
            } else {
                c0393g2.n();
            }
            if (c0393g != null) {
                return c0393g;
            }
        }
        return new C0393g(2, interfaceC5240d);
    }

    public static final void l(Throwable th, InterfaceC5245i interfaceC5245i) {
        try {
            T7.b bVar = (T7.b) interfaceC5245i.m(C0407v.f3080n);
            if (bVar != null) {
                bVar.p(th);
            } else {
                X7.a.d(th, interfaceC5245i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                A8.b.a(runtimeException, th);
                th = runtimeException;
            }
            X7.a.d(th, interfaceC5245i);
        }
    }

    public static final boolean n(InterfaceC0408w interfaceC0408w) {
        Y y7 = (Y) interfaceC0408w.z().m(C0407v.f3081u);
        if (y7 != null) {
            return y7.j();
        }
        return true;
    }

    public static B o(InterfaceC0408w interfaceC0408w, AbstractC0406u abstractC0406u, I7.p pVar, int i4) {
        EnumC0409x enumC0409x = EnumC0409x.f3087w;
        InterfaceC5245i interfaceC5245i = abstractC0406u;
        if ((i4 & 1) != 0) {
            interfaceC5245i = C5246j.f42241n;
        }
        if ((i4 & 2) != 0) {
            enumC0409x = EnumC0409x.f3084n;
        }
        InterfaceC5245i p9 = p(interfaceC0408w, interfaceC5245i);
        B j0Var = enumC0409x == EnumC0409x.f3085u ? new j0(p9, pVar) : new B(p9, true, 1);
        j0Var.W(enumC0409x, j0Var, pVar);
        return j0Var;
    }

    public static final InterfaceC5245i p(InterfaceC0408w interfaceC0408w, InterfaceC5245i interfaceC5245i) {
        InterfaceC5245i h3 = h(interfaceC0408w.z(), interfaceC5245i, true);
        Z7.e eVar = F.f2998a;
        return (h3 == eVar || h3.m(C5241e.f42240n) != null) ? h3 : h3.n(eVar);
    }

    public static final Object q(Object obj) {
        return obj instanceof C0402p ? Q3.b.b(((C0402p) obj).f3066a) : obj;
    }

    public static final void r(C0393g c0393g, InterfaceC5240d interfaceC5240d, boolean z6) {
        Object obj = C0393g.f3045z.get(c0393g);
        Throwable e9 = c0393g.e(obj);
        Object b9 = e9 != null ? Q3.b.b(e9) : c0393g.g(obj);
        if (!z6) {
            interfaceC5240d.resumeWith(b9);
            return;
        }
        kotlin.jvm.internal.h.c(interfaceC5240d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        X7.h hVar = (X7.h) interfaceC5240d;
        B7.c cVar = hVar.f3790x;
        InterfaceC5245i context = cVar.getContext();
        Object m9 = X7.a.m(context, hVar.f3792z);
        w0 x9 = m9 != X7.a.f3780f ? x(cVar, context, m9) : null;
        try {
            cVar.resumeWith(b9);
            if (x9 == null || x9.X()) {
                X7.a.g(context, m9);
            }
        } catch (Throwable th) {
            if (x9 == null || x9.X()) {
                X7.a.g(context, m9);
            }
            throw th;
        }
    }

    public static final Object s(InterfaceC5245i interfaceC5245i, I7.p pVar) {
        P p9;
        InterfaceC5245i h3;
        Thread currentThread = Thread.currentThread();
        InterfaceC5244h interfaceC5244h = C5241e.f42240n;
        InterfaceC5242f interfaceC5242f = (InterfaceC5242f) interfaceC5245i.m(interfaceC5244h);
        C5246j c5246j = C5246j.f42241n;
        if (interfaceC5242f == null) {
            p9 = q0.a();
            h3 = h(c5246j, interfaceC5245i.n(p9), true);
            Z7.e eVar = F.f2998a;
            if (h3 != eVar && h3.m(interfaceC5244h) == null) {
                h3 = h3.n(eVar);
            }
        } else {
            if (interfaceC5242f instanceof P) {
            }
            p9 = (P) q0.f3067a.get();
            h3 = h(c5246j, interfaceC5245i, true);
            Z7.e eVar2 = F.f2998a;
            if (h3 != eVar2 && h3.m(interfaceC5244h) == null) {
                h3 = h3.n(eVar2);
            }
        }
        C0389c c0389c = new C0389c(h3, currentThread, p9);
        c0389c.W(EnumC0409x.f3084n, c0389c, pVar);
        P p10 = c0389c.f3029x;
        if (p10 != null) {
            int i4 = P.f3014y;
            p10.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long E8 = p10 != null ? p10.E() : Long.MAX_VALUE;
                if (!(c0389c.C() instanceof V)) {
                    if (p10 != null) {
                        int i6 = P.f3014y;
                        p10.A(false);
                    }
                    Object w3 = w(c0389c.C());
                    C0402p c0402p = w3 instanceof C0402p ? (C0402p) w3 : null;
                    if (c0402p == null) {
                        return w3;
                    }
                    throw c0402p.f3066a;
                }
                LockSupport.parkNanos(c0389c, E8);
            } catch (Throwable th) {
                if (p10 != null) {
                    int i9 = P.f3014y;
                    p10.A(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0389c.o(interruptedException);
        throw interruptedException;
    }

    public static final Object u(t0 t0Var, I7.p pVar) {
        Object c0402p;
        Object K7;
        t0Var.G(false, true, new I(0, i(t0Var.f3813w.getContext()).b(t0Var.f3075x, t0Var, t0Var.f3025v)));
        try {
            if (pVar instanceof B7.a) {
                kotlin.jvm.internal.u.b(2, pVar);
                c0402p = pVar.invoke(t0Var, t0Var);
            } else {
                c0402p = A8.b.x(pVar, t0Var, t0Var);
            }
        } catch (Throwable th) {
            c0402p = new C0402p(th, false);
        }
        A7.a aVar = A7.a.f215n;
        if (c0402p == aVar || (K7 = t0Var.K(c0402p)) == f3094e) {
            return aVar;
        }
        if (K7 instanceof C0402p) {
            Throwable th2 = ((C0402p) K7).f3066a;
            if (!(th2 instanceof s0)) {
                throw th2;
            }
            if (((s0) th2).f3072n != t0Var) {
                throw th2;
            }
            if (c0402p instanceof C0402p) {
                throw ((C0402p) c0402p).f3066a;
            }
        } else {
            c0402p = w(K7);
        }
        return c0402p;
    }

    public static final String v(InterfaceC5240d interfaceC5240d) {
        Object b9;
        if (interfaceC5240d instanceof X7.h) {
            return interfaceC5240d.toString();
        }
        try {
            b9 = interfaceC5240d + '@' + j(interfaceC5240d);
        } catch (Throwable th) {
            b9 = Q3.b.b(th);
        }
        if (AbstractC5083i.a(b9) != null) {
            b9 = interfaceC5240d.getClass().getName() + '@' + j(interfaceC5240d);
        }
        return (String) b9;
    }

    public static final Object w(Object obj) {
        V v9;
        W w3 = obj instanceof W ? (W) obj : null;
        return (w3 == null || (v9 = w3.f3021a) == null) ? obj : v9;
    }

    public static final w0 x(InterfaceC5240d interfaceC5240d, InterfaceC5245i interfaceC5245i, Object obj) {
        w0 w0Var = null;
        if ((interfaceC5240d instanceof B7.d) && interfaceC5245i.m(x0.f3089n) != null) {
            B7.d dVar = (B7.d) interfaceC5240d;
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
                w0Var.Y(interfaceC5245i, obj);
            }
        }
        return w0Var;
    }

    public static final Object y(InterfaceC5245i interfaceC5245i, I7.p pVar, InterfaceC5240d interfaceC5240d) {
        Object w3;
        InterfaceC5245i context = interfaceC5240d.getContext();
        InterfaceC5245i n9 = !((Boolean) interfaceC5245i.l(Boolean.FALSE, r.f3069v)).booleanValue() ? context.n(interfaceC5245i) : h(context, interfaceC5245i, false);
        g(n9);
        if (n9 == context) {
            X7.s sVar = new X7.s(interfaceC5240d, n9);
            w3 = X2.a.q(sVar, sVar, pVar);
        } else {
            C5241e c5241e = C5241e.f42240n;
            if (kotlin.jvm.internal.h.a(n9.m(c5241e), context.m(c5241e))) {
                w0 w0Var = new w0(interfaceC5240d, n9);
                InterfaceC5245i interfaceC5245i2 = w0Var.f3025v;
                Object m9 = X7.a.m(interfaceC5245i2, null);
                try {
                    Object q8 = X2.a.q(w0Var, w0Var, pVar);
                    X7.a.g(interfaceC5245i2, m9);
                    w3 = q8;
                } catch (Throwable th) {
                    X7.a.g(interfaceC5245i2, m9);
                    throw th;
                }
            } else {
                D d9 = new D(interfaceC5240d, n9);
                S0.f.s(pVar, d9, d9);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D.f2996x;
                    int i4 = atomicIntegerFieldUpdater.get(d9);
                    if (i4 != 0) {
                        if (i4 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        w3 = w(d9.C());
                        if (w3 instanceof C0402p) {
                            throw ((C0402p) w3).f3066a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(d9, 0, 1)) {
                        w3 = A7.a.f215n;
                        break;
                    }
                }
            }
        }
        A7.a aVar = A7.a.f215n;
        return w3;
    }

    public static final Object z(long j6, I7.p pVar, B7.c cVar) {
        if (j6 <= 0) {
            throw new s0("Timed out immediately", null);
        }
        Object u6 = u(new t0(j6, cVar), pVar);
        A7.a aVar = A7.a.f215n;
        return u6;
    }
}
