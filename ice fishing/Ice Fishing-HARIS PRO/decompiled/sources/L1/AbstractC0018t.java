package L1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: L1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018t {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.u f577a = new Q1.u("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Q1.u f578b = new Q1.u("CLOSED_EMPTY", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Q1.u f579c = new Q1.u("COMPLETING_ALREADY", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final Q1.u f580d = new Q1.u("COMPLETING_WAITING_CHILDREN", 0);
    public static final Q1.u e = new Q1.u("COMPLETING_RETRY", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Q1.u f581f = new Q1.u("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final Q1.u f582g = new Q1.u("SEALED", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final B f583h = new B(false);
    public static final B i = new B(true);

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void b(Throwable th, v1.i iVar) {
        try {
            M1.b bVar = (M1.b) iVar.e(C0016q.f575a);
            if (bVar != null) {
                bVar.b(th, iVar);
            } else {
                Q1.a.d(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                h0.f.a(runtimeException, th);
                th = runtimeException;
            }
            Q1.a.d(th, iVar);
        }
    }

    public static InterfaceC0024z c(K k2, boolean z2, O o2, int i2) {
        O o3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        T t2 = (T) k2;
        t2.getClass();
        if (z2) {
            o3 = o2 instanceof M ? (M) o2 : null;
            if (o3 == null) {
                o3 = new J(o2);
            }
        } else {
            o3 = o2;
        }
        o3.f536d = t2;
        while (true) {
            Object q2 = t2.q();
            if (q2 instanceof B) {
                B b2 = (B) q2;
                if (b2.f525a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f547a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, q2, o3)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != q2) {
                            break;
                        }
                    }
                    return o3;
                }
                U u2 = new U();
                I h2 = b2.f525a ? u2 : new H(u2);
                do {
                    atomicReferenceFieldUpdater = T.f547a;
                    if (atomicReferenceFieldUpdater.compareAndSet(t2, b2, h2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(t2) == b2);
            } else {
                if (!(q2 instanceof I)) {
                    if (z3) {
                        C0009j c0009j = q2 instanceof C0009j ? (C0009j) q2 : null;
                        o2.g(c0009j != null ? c0009j.f565a : null);
                    }
                    return V.f549a;
                }
                U b3 = ((I) q2).b();
                if (b3 == null) {
                    D1.i.c(q2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t2.y((O) q2);
                } else {
                    InterfaceC0024z interfaceC0024z = V.f549a;
                    if (z2 && (q2 instanceof Q)) {
                        synchronized (q2) {
                            try {
                                th = ((Q) q2).d();
                                if (th != null) {
                                    if ((o2 instanceof C0007h) && !((Q) q2).f()) {
                                    }
                                }
                                if (t2.g((I) q2, b3, o3)) {
                                    if (th == null) {
                                        return o3;
                                    }
                                    interfaceC0024z = o3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            o2.g(th);
                        }
                        return interfaceC0024z;
                    }
                    if (t2.g((I) q2, b3, o3)) {
                        return o3;
                    }
                }
            }
        }
    }

    public static final boolean d(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final void e(C0003d c0003d, v1.d dVar, boolean z2) {
        Object obj = C0003d.f556g.get(c0003d);
        Throwable f2 = c0003d.f(obj);
        Object eVar = f2 != null ? new t1.e(f2) : c0003d.g(obj);
        if (!z2) {
            dVar.b(eVar);
            return;
        }
        D1.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Q1.g gVar = (Q1.g) dVar;
        x1.c cVar = gVar.e;
        v1.i h2 = cVar.h();
        Object k2 = Q1.a.k(h2, gVar.f947g);
        if (k2 != Q1.a.f937f) {
            g(cVar, h2);
        }
        try {
            cVar.b(eVar);
        } finally {
            Q1.a.g(h2, k2);
        }
    }

    public static final String f(v1.d dVar) {
        Object eVar;
        if (dVar instanceof Q1.g) {
            return dVar.toString();
        }
        try {
            eVar = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            eVar = new t1.e(th);
        }
        if (t1.f.a(eVar) != null) {
            eVar = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x1.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x1.d] */
    /* JADX WARN: Type inference failed for: r1v2, types: [x1.d] */
    public static final void g(x1.c cVar, v1.i iVar) {
        if (cVar == 0 || iVar.e(c0.f554a) == null) {
            return;
        }
        do {
            cVar = cVar.e();
        } while (cVar != 0);
    }
}
