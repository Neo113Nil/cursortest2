package yc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dd.w f8818a;

    /* renamed from: b, reason: collision with root package name */
    public static final dd.w f8819b;

    /* renamed from: c, reason: collision with root package name */
    public static final dd.w f8820c;

    /* renamed from: d, reason: collision with root package name */
    public static final dd.w f8821d;

    /* renamed from: e, reason: collision with root package name */
    public static final dd.w f8822e;

    /* renamed from: f, reason: collision with root package name */
    public static final dd.w f8823f;

    /* renamed from: g, reason: collision with root package name */
    public static final dd.w f8824g;

    /* renamed from: h, reason: collision with root package name */
    public static final dd.w f8825h;

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f8826i = new m0(false);

    /* renamed from: j, reason: collision with root package name */
    public static final m0 f8827j = new m0(true);

    static {
        int i10 = 0;
        f8818a = new dd.w("RESUME_TOKEN", i10);
        f8819b = new dd.w("REMOVED_TASK", i10);
        f8820c = new dd.w("CLOSED_EMPTY", i10);
        f8821d = new dd.w("COMPLETING_ALREADY", i10);
        f8822e = new dd.w("COMPLETING_WAITING_CHILDREN", i10);
        f8823f = new dd.w("COMPLETING_RETRY", i10);
        f8824g = new dd.w("TOO_LATE_TO_CANCEL", i10);
        f8825h = new dd.w("SEALED", i10);
    }

    public static final Object A(fc.i iVar, oc.e eVar, fc.d dVar) {
        fc.i context = dVar.getContext();
        fc.i d10 = !((Boolean) iVar.i(Boolean.FALSE, r.f8894i)).booleanValue() ? context.d(iVar) : h(context, iVar, false);
        g(d10);
        if (d10 == context) {
            dd.t tVar = new dd.t(dVar, d10);
            return bc.a0.J(tVar, tVar, eVar);
        }
        fc.e eVar2 = fc.e.f2347g;
        if (pc.j.a(d10.v(eVar2), context.v(eVar2))) {
            z1 z1Var = new z1(dVar, d10);
            fc.i iVar2 = z1Var.f8817i;
            Object l10 = dd.a.l(iVar2, null);
            try {
                return bc.a0.J(z1Var, z1Var, eVar);
            } finally {
                dd.a.f(iVar2, l10);
            }
        }
        g0 g0Var = new g0(dVar, d10);
        i7.b.E(eVar, g0Var, g0Var);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g0.f8850k;
        do {
            int i10 = atomicIntegerFieldUpdater.get(g0Var);
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object y10 = y(g0Var.M());
                if (y10 instanceof p) {
                    throw ((p) y10).f8889a;
                }
                return y10;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(g0Var, 0, 1));
        return gc.a.f2559g;
    }

    public static final Object B(long j3, oc.e eVar, hc.c cVar) {
        if (j3 > 0) {
            return w(new w1(j3, cVar), eVar);
        }
        throw new v1("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(long j3, oc.e eVar, fc.d dVar) {
        x1 x1Var;
        int i10;
        pc.s sVar;
        if (dVar instanceof x1) {
            x1Var = (x1) dVar;
            int i11 = x1Var.f8918i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x1Var.f8918i = i11 - Integer.MIN_VALUE;
                Object obj = x1Var.f8917h;
                i10 = x1Var.f8918i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (j3 <= 0) {
                        return null;
                    }
                    pc.s sVar2 = new pc.s();
                    try {
                        x1Var.f8916g = sVar2;
                        x1Var.f8918i = 1;
                        w1 w1Var = new w1(j3, x1Var);
                        sVar2.f5683g = w1Var;
                        Object w3 = w(w1Var, eVar);
                        gc.a aVar = gc.a.f2559g;
                        return w3 == aVar ? aVar : w3;
                    } catch (v1 e10) {
                        e = e10;
                        sVar = sVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = x1Var.f8916g;
                    try {
                        v6.a.W(obj);
                        return obj;
                    } catch (v1 e11) {
                        e = e11;
                    }
                }
                if (e.f8912g != sVar.f5683g) {
                    return null;
                }
                throw e;
            }
        }
        x1Var = new x1(dVar);
        Object obj2 = x1Var.f8917h;
        i10 = x1Var.f8918i;
        if (i10 != 0) {
        }
        if (e.f8912g != sVar.f5683g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(hc.c cVar) {
        Object obj;
        fc.i context = cVar.getContext();
        g(context);
        fc.d w3 = bc.a0.w(cVar);
        dd.h hVar = w3 instanceof dd.h ? (dd.h) w3 : null;
        Object obj2 = gc.a.f2559g;
        Object obj3 = ac.o.f277a;
        if (hVar != null) {
            u uVar = hVar.f1855j;
            if (uVar.y()) {
                hVar.f1857l = obj3;
                hVar.f8853i = 1;
                uVar.x(context, hVar);
            } else {
                c2 c2Var = new c2(c2.f8838i);
                fc.i d10 = context.d(c2Var);
                hVar.f1857l = obj3;
                hVar.f8853i = 1;
                uVar.x(d10, hVar);
                if (c2Var.f8839h) {
                    s0 a6 = u1.a();
                    bc.k kVar = a6.f8903k;
                    if (!(kVar != null ? kVar.isEmpty() : true)) {
                        if (a6.f8901i >= 4294967296L) {
                            hVar.f1857l = obj3;
                            hVar.f8853i = 1;
                            a6.A(hVar);
                        } else {
                            a6.C(true);
                            try {
                                hVar.run();
                                do {
                                } while (a6.E());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                }
            }
            obj = obj2;
            return obj != obj2 ? obj : obj3;
        }
        obj = obj3;
        if (obj != obj2) {
        }
    }

    public static final dd.e a(fc.i iVar) {
        if (iVar.v(v.f8910h) == null) {
            iVar = iVar.d(b());
        }
        return new dd.e(iVar);
    }

    public static e1 b() {
        return new e1(null);
    }

    public static final void c(fc.i iVar, CancellationException cancellationException) {
        b1 b1Var = (b1) iVar.v(v.f8910h);
        if (b1Var != null) {
            b1Var.a(cancellationException);
        }
    }

    public static final void d(y yVar, CancellationException cancellationException) {
        b1 b1Var = (b1) yVar.f().v(v.f8910h);
        if (b1Var != null) {
            b1Var.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + yVar).toString());
        }
    }

    public static final Object e(oc.e eVar, fc.d dVar) {
        dd.t tVar = new dd.t(dVar, dVar.getContext());
        return bc.a0.J(tVar, tVar, eVar);
    }

    public static final Object f(long j3, fc.d dVar) {
        if (j3 > 0) {
            g gVar = new g(1, bc.a0.w(dVar));
            gVar.q();
            if (j3 < Long.MAX_VALUE) {
                i(gVar.f8849k).s(j3, gVar);
            }
            Object p8 = gVar.p();
            if (p8 == gc.a.f2559g) {
                return p8;
            }
        }
        return ac.o.f277a;
    }

    public static final void g(fc.i iVar) {
        b1 b1Var = (b1) iVar.v(v.f8910h);
        if (b1Var != null && !b1Var.b()) {
            throw b1Var.m();
        }
    }

    public static final fc.i h(fc.i iVar, fc.i iVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f8894i;
        boolean booleanValue = ((Boolean) iVar.i(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.i(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.d(iVar2);
        }
        r rVar2 = new r(2, 2);
        fc.j jVar = fc.j.f2348g;
        fc.i iVar3 = (fc.i) iVar.i(jVar, rVar2);
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.i(jVar, r.f8893h);
        }
        return iVar3.d((fc.i) obj);
    }

    public static final f0 i(fc.i iVar) {
        fc.g v10 = iVar.v(fc.e.f2347g);
        f0 f0Var = v10 instanceof f0 ? (f0) v10 : null;
        return f0Var == null ? c0.f8836a : f0Var;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final b1 k(fc.i iVar) {
        b1 b1Var = (b1) iVar.v(v.f8910h);
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final g l(fc.d dVar) {
        g gVar;
        g gVar2;
        if (!(dVar instanceof dd.h)) {
            return new g(1, dVar);
        }
        dd.h hVar = (dd.h) dVar;
        dd.w wVar = dd.a.f1842d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.h.f1854n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            gVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, wVar);
                gVar2 = null;
                break;
            }
            if (obj instanceof g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, wVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                gVar2 = (g) obj;
                break loop0;
            }
            if (obj != wVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (gVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g.f8846m;
            Object obj2 = atomicReferenceFieldUpdater2.get(gVar2);
            if (!(obj2 instanceof o) || ((o) obj2).f8884d == null) {
                g.f8845l.set(gVar2, 536870911);
                atomicReferenceFieldUpdater2.set(gVar2, b.f8831a);
                gVar = gVar2;
            } else {
                gVar2.l();
            }
            if (gVar != null) {
                return gVar;
            }
        }
        return new g(2, dVar);
    }

    public static final void m(fc.i iVar, Throwable th) {
        try {
            w wVar = (w) iVar.v(v.f8909g);
            if (wVar != null) {
                wVar.q(iVar, th);
            } else {
                dd.a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                i7.b.k(runtimeException, th);
                th = runtimeException;
            }
            dd.a.c(iVar, th);
        }
    }

    public static k0 n(b1 b1Var, boolean z10, f1 f1Var, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        if (b1Var instanceof k1) {
            return ((k1) b1Var).Q(z10, z11, f1Var);
        }
        return b1Var.o(z10, z11, new d1.q(1, f1Var, z0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 1));
    }

    public static final boolean o(fc.i iVar) {
        b1 b1Var = (b1) iVar.v(v.f8910h);
        if (b1Var != null) {
            return b1Var.b();
        }
        return true;
    }

    public static final boolean p(y yVar) {
        b1 b1Var = (b1) yVar.f().v(v.f8910h);
        if (b1Var != null) {
            return b1Var.b();
        }
        return true;
    }

    public static r1 q(y yVar, fc.i iVar, oc.e eVar, int i10) {
        if ((i10 & 1) != 0) {
            iVar = fc.j.f2348g;
        }
        z zVar = (i10 & 2) != 0 ? z.f8921g : z.f8924j;
        fc.i h10 = h(yVar.f(), iVar, true);
        fd.e eVar2 = i0.f8859a;
        if (h10 != eVar2 && h10.v(fc.e.f2347g) == null) {
            h10 = h10.d(eVar2);
        }
        r1 l1Var = zVar == z.f8922h ? new l1(h10, eVar) : new r1(h10, true);
        l1Var.f0(zVar, l1Var, eVar);
        return l1Var;
    }

    public static final u0 r(String str) {
        return new u0(Executors.newScheduledThreadPool(1, new q3.a(str, new AtomicInteger())));
    }

    public static final Object s(Object obj) {
        return obj instanceof p ? v6.a.s(((p) obj).f8889a) : obj;
    }

    public static final void t(g gVar, fc.d dVar, boolean z10) {
        Object obj = g.f8846m.get(gVar);
        Throwable d10 = gVar.d(obj);
        Object s10 = d10 != null ? v6.a.s(d10) : gVar.f(obj);
        if (!z10) {
            dVar.resumeWith(s10);
            return;
        }
        pc.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        dd.h hVar = (dd.h) dVar;
        hc.c cVar = hVar.f1856k;
        Object obj2 = hVar.f1858m;
        fc.i context = cVar.getContext();
        Object l10 = dd.a.l(context, obj2);
        z1 z11 = l10 != dd.a.f1844f ? z(cVar, context, l10) : null;
        try {
            cVar.resumeWith(s10);
            if (z11 == null || z11.g0()) {
                dd.a.f(context, l10);
            }
        } catch (Throwable th) {
            if (z11 == null || z11.g0()) {
                dd.a.f(context, l10);
            }
            throw th;
        }
    }

    public static final Object u(fc.i iVar, oc.e eVar) {
        s0 s0Var;
        fc.i h10;
        Thread currentThread = Thread.currentThread();
        fc.h hVar = fc.e.f2347g;
        fc.f fVar = (fc.f) iVar.v(hVar);
        fc.j jVar = fc.j.f2348g;
        if (fVar == null) {
            s0Var = u1.a();
            h10 = h(jVar, iVar.d(s0Var), true);
            fd.e eVar2 = i0.f8859a;
            if (h10 != eVar2 && h10.v(hVar) == null) {
                h10 = h10.d(eVar2);
            }
        } else {
            if (fVar instanceof s0) {
            }
            s0Var = (s0) u1.f8908a.get();
            h10 = h(jVar, iVar, true);
            fd.e eVar3 = i0.f8859a;
            if (h10 != eVar3 && h10.v(hVar) == null) {
                h10 = h10.d(eVar3);
            }
        }
        c cVar = new c(h10, currentThread, s0Var);
        cVar.f0(z.f8921g, cVar, eVar);
        s0 s0Var2 = cVar.f8835k;
        if (s0Var2 != null) {
            int i10 = s0.f8900l;
            s0Var2.C(false);
        }
        while (!Thread.interrupted()) {
            try {
                long D = s0Var2 != null ? s0Var2.D() : Long.MAX_VALUE;
                if (!(cVar.M() instanceof w0)) {
                    if (s0Var2 != null) {
                        int i11 = s0.f8900l;
                        s0Var2.z(false);
                    }
                    Object y10 = y(cVar.M());
                    p pVar = y10 instanceof p ? (p) y10 : null;
                    if (pVar == null) {
                        return y10;
                    }
                    throw pVar.f8889a;
                }
                LockSupport.parkNanos(cVar, D);
            } catch (Throwable th) {
                if (s0Var2 != null) {
                    int i12 = s0.f8900l;
                    s0Var2.z(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar.A(interruptedException);
        throw interruptedException;
    }

    public static final Object w(w1 w1Var, oc.e eVar) {
        Object pVar;
        Object T;
        n(w1Var, false, new l0(0, i(w1Var.f1882j.getContext()).f(w1Var.f8913k, w1Var, w1Var.f8817i)), 3);
        try {
            if (eVar instanceof hc.a) {
                pc.v.c(2, eVar);
                pVar = eVar.invoke(w1Var, w1Var);
            } else {
                pVar = bc.a0.M(eVar, w1Var, w1Var);
            }
        } catch (Throwable th) {
            pVar = new p(th, false);
        }
        gc.a aVar = gc.a.f2559g;
        if (pVar == aVar || (T = w1Var.T(pVar)) == f8822e) {
            return aVar;
        }
        if (T instanceof p) {
            Throwable th2 = ((p) T).f8889a;
            if (!(th2 instanceof v1)) {
                throw th2;
            }
            if (((v1) th2).f8912g != w1Var) {
                throw th2;
            }
            if (pVar instanceof p) {
                throw ((p) pVar).f8889a;
            }
        } else {
            pVar = y(T);
        }
        return pVar;
    }

    public static final String x(fc.d dVar) {
        Object s10;
        if (dVar instanceof dd.h) {
            return dVar.toString();
        }
        try {
            s10 = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            s10 = v6.a.s(th);
        }
        if (ac.l.a(s10) != null) {
            s10 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) s10;
    }

    public static final Object y(Object obj) {
        w0 w0Var;
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        return (x0Var == null || (w0Var = x0Var.f8915a) == null) ? obj : w0Var;
    }

    public static final z1 z(fc.d dVar, fc.i iVar, Object obj) {
        z1 z1Var = null;
        if ((dVar instanceof hc.d) && iVar.v(a2.f8830g) != null) {
            hc.d dVar2 = (hc.d) dVar;
            while (true) {
                if ((dVar2 instanceof g0) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof z1) {
                    z1Var = (z1) dVar2;
                    break;
                }
            }
            if (z1Var != null) {
                z1Var.h0(iVar, obj);
            }
        }
        return z1Var;
    }
}
