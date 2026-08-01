package S7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import u7.AbstractC5091i;
import z7.C5268e;
import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5269f;
import z7.InterfaceC5270g;
import z7.InterfaceC5271h;
import z7.InterfaceC5272i;

/* renamed from: S7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0406y {

    /* renamed from: b, reason: collision with root package name */
    public static final D2.b f3008b;

    /* renamed from: c, reason: collision with root package name */
    public static final D2.b f3009c;

    /* renamed from: d, reason: collision with root package name */
    public static final D2.b f3010d;

    /* renamed from: e, reason: collision with root package name */
    public static final D2.b f3011e;

    /* renamed from: f, reason: collision with root package name */
    public static final D2.b f3012f;

    /* renamed from: g, reason: collision with root package name */
    public static final D2.b f3013g;

    /* renamed from: h, reason: collision with root package name */
    public static final D2.b f3014h;

    /* renamed from: a, reason: collision with root package name */
    public static final D2.b f3007a = new D2.b("RESUME_TOKEN", 1);
    public static final J i = new J(false);

    /* renamed from: j, reason: collision with root package name */
    public static final J f3015j = new J(true);

    static {
        int i6 = 1;
        f3008b = new D2.b("REMOVED_TASK", i6);
        f3009c = new D2.b("CLOSED_EMPTY", i6);
        int i9 = 1;
        f3010d = new D2.b("COMPLETING_ALREADY", i9);
        f3011e = new D2.b("COMPLETING_WAITING_CHILDREN", i9);
        f3012f = new D2.b("COMPLETING_RETRY", i9);
        f3013g = new D2.b("TOO_LATE_TO_CANCEL", i9);
        f3014h = new D2.b("SEALED", i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(long j6, I7.p pVar, InterfaceC5267d interfaceC5267d) {
        u0 u0Var;
        int i6;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5267d instanceof u0) {
            u0Var = (u0) interfaceC5267d;
            int i9 = u0Var.f2996v;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                u0Var.f2996v = i9 - Integer.MIN_VALUE;
                Object obj = u0Var.f2995u;
                A7.a aVar = A7.a.f58n;
                i6 = u0Var.f2996v;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    if (j6 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    try {
                        u0Var.f2994n = rVar2;
                        u0Var.f2996v = 1;
                        t0 t0Var = new t0(j6, u0Var);
                        rVar2.f38717n = t0Var;
                        Object u3 = u(t0Var, pVar);
                        return u3 == aVar ? aVar : u3;
                    } catch (s0 e9) {
                        e = e9;
                        rVar = rVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = u0Var.f2994n;
                    try {
                        com.bumptech.glide.d.k(obj);
                        return obj;
                    } catch (s0 e10) {
                        e = e10;
                    }
                }
                if (e.f2989n != rVar.f38717n) {
                    return null;
                }
                throw e;
            }
        }
        u0Var = new u0(interfaceC5267d);
        Object obj2 = u0Var.f2995u;
        A7.a aVar2 = A7.a.f58n;
        i6 = u0Var.f2996v;
        if (i6 != 0) {
        }
        if (e.f2989n != rVar.f38717n) {
        }
    }

    public static C0395m a() {
        C0395m c0395m = new C0395m(true);
        c0395m.F(null);
        return c0395m;
    }

    public static final X7.e b(InterfaceC5272i interfaceC5272i) {
        if (interfaceC5272i.m(C0403v.f2998u) == null) {
            interfaceC5272i = interfaceC5272i.n(new b0());
        }
        return new X7.e(interfaceC5272i);
    }

    public static B c(InterfaceC0404w interfaceC0404w, I7.p pVar, int i6) {
        EnumC0405x enumC0405x = EnumC0405x.f3004w;
        C5273j c5273j = C5273j.f42272n;
        if ((i6 & 2) != 0) {
            enumC0405x = EnumC0405x.f3001n;
        }
        InterfaceC5272i p9 = p(interfaceC0404w, c5273j);
        B i0Var = enumC0405x == EnumC0405x.f3002u ? new i0(p9, pVar) : new B(p9, true, 0);
        i0Var.W(enumC0405x, i0Var, pVar);
        return i0Var;
    }

    public static final void d(InterfaceC5272i interfaceC5272i, CancellationException cancellationException) {
        Y y7 = (Y) interfaceC5272i.m(C0403v.f2998u);
        if (y7 != null) {
            y7.a(cancellationException);
        }
    }

    public static final Object e(I7.p pVar, InterfaceC5267d interfaceC5267d) {
        X7.s sVar = new X7.s(interfaceC5267d, interfaceC5267d.getContext());
        Object Q8 = X2.e.Q(sVar, sVar, pVar);
        A7.a aVar = A7.a.f58n;
        return Q8;
    }

    public static final Object f(long j6, InterfaceC5267d interfaceC5267d) {
        u7.v vVar = u7.v.f41353a;
        if (j6 > 0) {
            C0389g c0389g = new C0389g(1, A8.b.l(interfaceC5267d));
            c0389g.r();
            if (j6 < Long.MAX_VALUE) {
                i(c0389g.f2964x).k(j6, c0389g);
            }
            Object q8 = c0389g.q();
            if (q8 == A7.a.f58n) {
                return q8;
            }
        }
        return vVar;
    }

    public static final void g(InterfaceC5272i interfaceC5272i) {
        Y y7 = (Y) interfaceC5272i.m(C0403v.f2998u);
        if (y7 != null && !y7.j()) {
            throw ((h0) y7).w();
        }
    }

    public static final InterfaceC5272i h(InterfaceC5272i interfaceC5272i, InterfaceC5272i interfaceC5272i2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f2986v;
        boolean booleanValue = ((Boolean) interfaceC5272i.l(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC5272i2.l(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC5272i.n(interfaceC5272i2);
        }
        C5273j c5273j = C5273j.f42272n;
        InterfaceC5272i interfaceC5272i3 = (InterfaceC5272i) interfaceC5272i.l(c5273j, new r(2, 2));
        Object obj = interfaceC5272i2;
        if (booleanValue2) {
            obj = interfaceC5272i2.l(c5273j, r.f2985u);
        }
        return interfaceC5272i3.n((InterfaceC5272i) obj);
    }

    public static final C i(InterfaceC5272i interfaceC5272i) {
        InterfaceC5270g m4 = interfaceC5272i.m(C5268e.f42271n);
        C c9 = m4 instanceof C ? (C) m4 : null;
        return c9 == null ? A.f2911a : c9;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0389g k(InterfaceC5267d interfaceC5267d) {
        C0389g c0389g;
        C0389g c0389g2;
        if (!(interfaceC5267d instanceof X7.h)) {
            return new C0389g(1, interfaceC5267d);
        }
        X7.h hVar = (X7.h) interfaceC5267d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3833A;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            D2.b bVar = X7.a.f3823d;
            c0389g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, bVar);
                c0389g2 = null;
                break;
            }
            if (obj instanceof C0389g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, bVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0389g2 = (C0389g) obj;
                break loop0;
            }
            if (obj != bVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0389g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0389g.f2962z;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0389g2);
            if (!(obj2 instanceof C0397o) || ((C0397o) obj2).f2980d == null) {
                C0389g.f2961y.set(c0389g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0389g2, C0384b.f2943n);
                c0389g = c0389g2;
            } else {
                c0389g2.n();
            }
            if (c0389g != null) {
                return c0389g;
            }
        }
        return new C0389g(2, interfaceC5267d);
    }

    public static final void l(Throwable th, InterfaceC5272i interfaceC5272i) {
        try {
            T7.b bVar = (T7.b) interfaceC5272i.m(C0403v.f2997n);
            if (bVar != null) {
                bVar.p(th);
            } else {
                X7.a.d(th, interfaceC5272i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                X2.e.y(runtimeException, th);
                th = runtimeException;
            }
            X7.a.d(th, interfaceC5272i);
        }
    }

    public static final boolean n(InterfaceC0404w interfaceC0404w) {
        Y y7 = (Y) interfaceC0404w.z().m(C0403v.f2998u);
        if (y7 != null) {
            return y7.j();
        }
        return true;
    }

    public static B o(InterfaceC0404w interfaceC0404w, AbstractC0402u abstractC0402u, I7.p pVar, int i6) {
        EnumC0405x enumC0405x = EnumC0405x.f3004w;
        InterfaceC5272i interfaceC5272i = abstractC0402u;
        if ((i6 & 1) != 0) {
            interfaceC5272i = C5273j.f42272n;
        }
        if ((i6 & 2) != 0) {
            enumC0405x = EnumC0405x.f3001n;
        }
        InterfaceC5272i p9 = p(interfaceC0404w, interfaceC5272i);
        B j0Var = enumC0405x == EnumC0405x.f3002u ? new j0(p9, pVar) : new B(p9, true, 1);
        j0Var.W(enumC0405x, j0Var, pVar);
        return j0Var;
    }

    public static final InterfaceC5272i p(InterfaceC0404w interfaceC0404w, InterfaceC5272i interfaceC5272i) {
        InterfaceC5272i h9 = h(interfaceC0404w.z(), interfaceC5272i, true);
        Z7.e eVar = F.f2915a;
        return (h9 == eVar || h9.m(C5268e.f42271n) != null) ? h9 : h9.n(eVar);
    }

    public static final Object q(Object obj) {
        return obj instanceof C0398p ? com.bumptech.glide.d.f(((C0398p) obj).f2983a) : obj;
    }

    public static final void r(C0389g c0389g, InterfaceC5267d interfaceC5267d, boolean z3) {
        Object obj = C0389g.f2962z.get(c0389g);
        Throwable e9 = c0389g.e(obj);
        Object f3 = e9 != null ? com.bumptech.glide.d.f(e9) : c0389g.g(obj);
        if (!z3) {
            interfaceC5267d.resumeWith(f3);
            return;
        }
        kotlin.jvm.internal.h.c(interfaceC5267d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        X7.h hVar = (X7.h) interfaceC5267d;
        B7.c cVar = hVar.f3835x;
        InterfaceC5272i context = cVar.getContext();
        Object m4 = X7.a.m(context, hVar.f3837z);
        w0 x9 = m4 != X7.a.f3825f ? x(cVar, context, m4) : null;
        try {
            cVar.resumeWith(f3);
            if (x9 == null || x9.X()) {
                X7.a.g(context, m4);
            }
        } catch (Throwable th) {
            if (x9 == null || x9.X()) {
                X7.a.g(context, m4);
            }
            throw th;
        }
    }

    public static final Object s(InterfaceC5272i interfaceC5272i, I7.p pVar) {
        P p9;
        InterfaceC5272i h9;
        Thread currentThread = Thread.currentThread();
        InterfaceC5271h interfaceC5271h = C5268e.f42271n;
        InterfaceC5269f interfaceC5269f = (InterfaceC5269f) interfaceC5272i.m(interfaceC5271h);
        C5273j c5273j = C5273j.f42272n;
        if (interfaceC5269f == null) {
            p9 = q0.a();
            h9 = h(c5273j, interfaceC5272i.n(p9), true);
            Z7.e eVar = F.f2915a;
            if (h9 != eVar && h9.m(interfaceC5271h) == null) {
                h9 = h9.n(eVar);
            }
        } else {
            if (interfaceC5269f instanceof P) {
            }
            p9 = (P) q0.f2984a.get();
            h9 = h(c5273j, interfaceC5272i, true);
            Z7.e eVar2 = F.f2915a;
            if (h9 != eVar2 && h9.m(interfaceC5271h) == null) {
                h9 = h9.n(eVar2);
            }
        }
        C0385c c0385c = new C0385c(h9, currentThread, p9);
        c0385c.W(EnumC0405x.f3001n, c0385c, pVar);
        P p10 = c0385c.f2946x;
        if (p10 != null) {
            int i6 = P.f2931y;
            p10.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long E8 = p10 != null ? p10.E() : Long.MAX_VALUE;
                if (!(c0385c.C() instanceof V)) {
                    if (p10 != null) {
                        int i9 = P.f2931y;
                        p10.A(false);
                    }
                    Object w6 = w(c0385c.C());
                    C0398p c0398p = w6 instanceof C0398p ? (C0398p) w6 : null;
                    if (c0398p == null) {
                        return w6;
                    }
                    throw c0398p.f2983a;
                }
                LockSupport.parkNanos(c0385c, E8);
            } catch (Throwable th) {
                if (p10 != null) {
                    int i10 = P.f2931y;
                    p10.A(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0385c.o(interruptedException);
        throw interruptedException;
    }

    public static final Object u(t0 t0Var, I7.p pVar) {
        Object c0398p;
        Object K7;
        t0Var.G(false, true, new I(0, i(t0Var.f3858w.getContext()).b(t0Var.f2992x, t0Var, t0Var.f2942v)));
        try {
            if (pVar instanceof B7.a) {
                kotlin.jvm.internal.u.b(2, pVar);
                c0398p = pVar.invoke(t0Var, t0Var);
            } else {
                c0398p = A8.b.u(pVar, t0Var, t0Var);
            }
        } catch (Throwable th) {
            c0398p = new C0398p(th, false);
        }
        A7.a aVar = A7.a.f58n;
        if (c0398p == aVar || (K7 = t0Var.K(c0398p)) == f3011e) {
            return aVar;
        }
        if (K7 instanceof C0398p) {
            Throwable th2 = ((C0398p) K7).f2983a;
            if (!(th2 instanceof s0)) {
                throw th2;
            }
            if (((s0) th2).f2989n != t0Var) {
                throw th2;
            }
            if (c0398p instanceof C0398p) {
                throw ((C0398p) c0398p).f2983a;
            }
        } else {
            c0398p = w(K7);
        }
        return c0398p;
    }

    public static final String v(InterfaceC5267d interfaceC5267d) {
        Object f3;
        if (interfaceC5267d instanceof X7.h) {
            return interfaceC5267d.toString();
        }
        try {
            f3 = interfaceC5267d + '@' + j(interfaceC5267d);
        } catch (Throwable th) {
            f3 = com.bumptech.glide.d.f(th);
        }
        if (AbstractC5091i.a(f3) != null) {
            f3 = interfaceC5267d.getClass().getName() + '@' + j(interfaceC5267d);
        }
        return (String) f3;
    }

    public static final Object w(Object obj) {
        V v9;
        W w6 = obj instanceof W ? (W) obj : null;
        return (w6 == null || (v9 = w6.f2938a) == null) ? obj : v9;
    }

    public static final w0 x(InterfaceC5267d interfaceC5267d, InterfaceC5272i interfaceC5272i, Object obj) {
        w0 w0Var = null;
        if ((interfaceC5267d instanceof B7.d) && interfaceC5272i.m(x0.f3006n) != null) {
            B7.d dVar = (B7.d) interfaceC5267d;
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
                w0Var.Y(interfaceC5272i, obj);
            }
        }
        return w0Var;
    }

    public static final Object y(InterfaceC5272i interfaceC5272i, I7.p pVar, InterfaceC5267d interfaceC5267d) {
        Object w6;
        InterfaceC5272i context = interfaceC5267d.getContext();
        InterfaceC5272i n9 = !((Boolean) interfaceC5272i.l(Boolean.FALSE, r.f2986v)).booleanValue() ? context.n(interfaceC5272i) : h(context, interfaceC5272i, false);
        g(n9);
        if (n9 == context) {
            X7.s sVar = new X7.s(interfaceC5267d, n9);
            w6 = X2.e.Q(sVar, sVar, pVar);
        } else {
            C5268e c5268e = C5268e.f42271n;
            if (kotlin.jvm.internal.h.a(n9.m(c5268e), context.m(c5268e))) {
                w0 w0Var = new w0(interfaceC5267d, n9);
                InterfaceC5272i interfaceC5272i2 = w0Var.f2942v;
                Object m4 = X7.a.m(interfaceC5272i2, null);
                try {
                    Object Q8 = X2.e.Q(w0Var, w0Var, pVar);
                    X7.a.g(interfaceC5272i2, m4);
                    w6 = Q8;
                } catch (Throwable th) {
                    X7.a.g(interfaceC5272i2, m4);
                    throw th;
                }
            } else {
                D d2 = new D(interfaceC5267d, n9);
                V2.a.u(pVar, d2, d2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D.f2913x;
                    int i6 = atomicIntegerFieldUpdater.get(d2);
                    if (i6 != 0) {
                        if (i6 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        w6 = w(d2.C());
                        if (w6 instanceof C0398p) {
                            throw ((C0398p) w6).f2983a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(d2, 0, 1)) {
                        w6 = A7.a.f58n;
                        break;
                    }
                }
            }
        }
        A7.a aVar = A7.a.f58n;
        return w6;
    }

    public static final Object z(long j6, I7.p pVar, B7.c cVar) {
        if (j6 <= 0) {
            throw new s0("Timed out immediately", null);
        }
        Object u3 = u(new t0(j6, cVar), pVar);
        A7.a aVar = A7.a.f58n;
        return u3;
    }
}
