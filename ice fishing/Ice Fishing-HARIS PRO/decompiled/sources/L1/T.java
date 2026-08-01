package L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T implements K, X {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f547a = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f548b = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public T(boolean z2) {
        this._state = z2 ? AbstractC0018t.i : AbstractC0018t.f583h;
    }

    public static C0007h u(Q1.j jVar) {
        while (jVar.m()) {
            Q1.j i = jVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q1.j.f954b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (Q1.j) obj;
                    if (!jVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = i;
            }
        }
        while (true) {
            jVar = jVar.l();
            if (!jVar.m()) {
                if (jVar instanceof C0007h) {
                    return (C0007h) jVar;
                }
                if (jVar instanceof U) {
                    return null;
                }
            }
        }
    }

    public static String z(Object obj) {
        if (!(obj instanceof Q)) {
            return obj instanceof I ? ((I) obj).a() ? "Active" : "New" : obj instanceof C0009j ? "Cancelled" : "Completed";
        }
        Q q2 = (Q) obj;
        return q2.e() ? "Cancelling" : q2.f() ? "Completing" : "Active";
    }

    public final Object A(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof I)) {
            return AbstractC0018t.f579c;
        }
        if (((obj instanceof B) || (obj instanceof O)) && !(obj instanceof C0007h) && !(obj2 instanceof C0009j)) {
            I i = (I) obj;
            Object c0016q = obj2 instanceof I ? new C0016q() : obj2;
            do {
                atomicReferenceFieldUpdater = f547a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i, c0016q)) {
                    w(obj2);
                    k(i, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i);
            return AbstractC0018t.e;
        }
        I i2 = (I) obj;
        U p2 = p(i2);
        if (p2 == null) {
            return AbstractC0018t.e;
        }
        C0007h c0007h = null;
        Q q2 = i2 instanceof Q ? (Q) i2 : null;
        if (q2 == null) {
            q2 = new Q(p2, null);
        }
        synchronized (q2) {
            if (q2.f()) {
                return AbstractC0018t.f579c;
            }
            Q.f540b.set(q2, 1);
            if (q2 != i2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f547a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, i2, q2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != i2) {
                        return AbstractC0018t.e;
                    }
                }
            }
            boolean e = q2.e();
            C0009j c0009j = obj2 instanceof C0009j ? (C0009j) obj2 : null;
            if (c0009j != null) {
                q2.c(c0009j.f565a);
            }
            Throwable d2 = q2.d();
            if (e) {
                d2 = null;
            }
            if (d2 != null) {
                v(p2, d2);
            }
            C0007h c0007h2 = i2 instanceof C0007h ? (C0007h) i2 : null;
            if (c0007h2 == null) {
                U b2 = i2.b();
                if (b2 != null) {
                    c0007h = u(b2);
                }
            } else {
                c0007h = c0007h2;
            }
            if (c0007h != null) {
                while (AbstractC0018t.c(c0007h.e, false, new P(this, q2, c0007h, obj2), 1) == V.f549a) {
                    c0007h = u(c0007h);
                    if (c0007h == null) {
                    }
                }
                return AbstractC0018t.f580d;
            }
            return m(q2, obj2);
        }
    }

    @Override // L1.K
    public boolean a() {
        Object q2 = q();
        return (q2 instanceof I) && ((I) q2).a();
    }

    @Override // v1.i
    public final v1.i c(v1.h hVar) {
        return h0.f.t(this, hVar);
    }

    @Override // v1.i
    public final Object d(Object obj, C1.p pVar) {
        return pVar.d(obj, this);
    }

    @Override // v1.i
    public final v1.g e(v1.h hVar) {
        return h0.f.m(this, hVar);
    }

    @Override // v1.i
    public final v1.i f(v1.i iVar) {
        return h0.f.v(this, iVar);
    }

    public final boolean g(I i, U u2, O o2) {
        char c2;
        S s2 = new S(o2, this, i);
        do {
            Q1.j i2 = u2.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q1.j.f954b;
                Object obj = atomicReferenceFieldUpdater.get(u2);
                while (true) {
                    i2 = (Q1.j) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            Q1.j.f954b.lazySet(o2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q1.j.f953a;
            atomicReferenceFieldUpdater2.lazySet(o2, u2);
            s2.f545c = u2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i2, u2, s2)) {
                    c2 = s2.a(i2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i2) != u2) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    @Override // v1.g
    public final v1.h getKey() {
        return C0016q.f576b;
    }

    public final boolean i(Object obj) {
        Q1.u uVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0018t.f579c;
        if (this instanceof N) {
            do {
                Object q2 = q();
                if (!(q2 instanceof I) || ((q2 instanceof Q) && ((Q) q2).f())) {
                    obj2 = AbstractC0018t.f579c;
                    break;
                }
                obj2 = A(q2, new C0009j(l(obj), false));
            } while (obj2 == AbstractC0018t.e);
            if (obj2 == AbstractC0018t.f580d) {
                return true;
            }
        }
        if (obj2 == AbstractC0018t.f579c) {
            Throwable th = null;
            loop1: while (true) {
                Object q3 = q();
                if (!(q3 instanceof Q)) {
                    if (!(q3 instanceof I)) {
                        uVar = AbstractC0018t.f581f;
                        break;
                    }
                    if (th == null) {
                        th = l(obj);
                    }
                    I i = (I) q3;
                    if (i.a()) {
                        U p2 = p(i);
                        if (p2 == null) {
                            continue;
                        } else {
                            Q q4 = new Q(p2, th);
                            do {
                                atomicReferenceFieldUpdater = f547a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, i, q4)) {
                                    v(p2, th);
                                    uVar = AbstractC0018t.f579c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == i);
                        }
                    } else {
                        Object A2 = A(q3, new C0009j(th, false));
                        if (A2 == AbstractC0018t.f579c) {
                            throw new IllegalStateException(("Cannot happen in " + q3).toString());
                        }
                        if (A2 != AbstractC0018t.e) {
                            obj2 = A2;
                            break;
                        }
                    }
                } else {
                    synchronized (q3) {
                        try {
                            Q q5 = (Q) q3;
                            q5.getClass();
                            if (Q.f542d.get(q5) == AbstractC0018t.f582g) {
                                uVar = AbstractC0018t.f581f;
                            } else {
                                boolean e = ((Q) q3).e();
                                if (th == null) {
                                    th = l(obj);
                                }
                                ((Q) q3).c(th);
                                Throwable d2 = e ? null : ((Q) q3).d();
                                if (d2 != null) {
                                    v(((Q) q3).f543a, d2);
                                }
                                uVar = AbstractC0018t.f579c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = uVar;
        }
        return obj2 == AbstractC0018t.f579c || obj2 == AbstractC0018t.f580d || obj2 != AbstractC0018t.f581f;
    }

    public String j() {
        return "Job was cancelled";
    }

    public final void k(I i, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f548b;
        InterfaceC0006g interfaceC0006g = (InterfaceC0006g) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0006g != null) {
            interfaceC0006g.e();
            atomicReferenceFieldUpdater.set(this, V.f549a);
        }
        C0011l c0011l = null;
        C0009j c0009j = obj instanceof C0009j ? (C0009j) obj : null;
        Throwable th = c0009j != null ? c0009j.f565a : null;
        if (i instanceof O) {
            try {
                ((O) i).o(th);
                return;
            } catch (Throwable th2) {
                s(new C0011l("Exception in completion handler " + i + " for " + this, th2));
                return;
            }
        }
        U b2 = i.b();
        if (b2 != null) {
            Object k2 = b2.k();
            D1.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (Q1.j jVar = (Q1.j) k2; !jVar.equals(b2); jVar = jVar.l()) {
                if (jVar instanceof O) {
                    O o2 = (O) jVar;
                    try {
                        o2.o(th);
                    } catch (Throwable th3) {
                        if (c0011l != null) {
                            h0.f.a(c0011l, th3);
                        } else {
                            c0011l = new C0011l("Exception in completion handler " + o2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0011l != null) {
                s(c0011l);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable l(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        T t2 = (T) ((X) obj);
        Object q2 = t2.q();
        if (q2 instanceof Q) {
            cancellationException = ((Q) q2).d();
        } else if (q2 instanceof C0009j) {
            cancellationException = ((C0009j) q2).f565a;
        } else {
            if (q2 instanceof I) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + q2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new L("Parent job is ".concat(z(q2)), cancellationException, t2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(Q q2, Object obj) {
        Throwable th = null;
        C0009j c0009j = obj instanceof C0009j ? (C0009j) obj : null;
        Throwable th2 = c0009j != null ? c0009j.f565a : null;
        synchronized (q2) {
            q2.e();
            ArrayList<Throwable> g2 = q2.g(th2);
            if (!g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (q2.e()) {
                th = new L(j(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        h0.f.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0009j(th, false);
        }
        if (th != null) {
            boolean z2 = th instanceof CancellationException;
            InterfaceC0006g interfaceC0006g = (InterfaceC0006g) f548b.get(this);
            if (interfaceC0006g != null && interfaceC0006g != V.f549a) {
                z2 = interfaceC0006g.h(th) || z2;
            }
            if (z2 || r(th)) {
                D1.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                C0009j.f564b.compareAndSet((C0009j) obj, 0, 1);
            }
        }
        w(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f547a;
        Object c0016q = obj instanceof I ? new C0016q() : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q2, c0016q) && atomicReferenceFieldUpdater.get(this) == q2) {
        }
        k(q2, obj);
        return obj;
    }

    public final CancellationException n() {
        CancellationException cancellationException;
        Object q2 = q();
        if (!(q2 instanceof Q)) {
            if (q2 instanceof I) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(q2 instanceof C0009j)) {
                return new L(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0009j) q2).f565a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new L(j(), th, this) : cancellationException;
        }
        Throwable d2 = ((Q) q2).d();
        if (d2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d2 instanceof CancellationException ? (CancellationException) d2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = j();
        }
        return new L(concat, d2, this);
    }

    public boolean o() {
        return true;
    }

    public final U p(I i) {
        U b2 = i.b();
        if (b2 != null) {
            return b2;
        }
        if (i instanceof B) {
            return new U();
        }
        if (i instanceof O) {
            y((O) i);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i).toString());
    }

    public final Object q() {
        while (true) {
            Object obj = f547a.get(this);
            if (!(obj instanceof Q1.p)) {
                return obj;
            }
            ((Q1.p) obj).a(this);
        }
    }

    public boolean r(Throwable th) {
        return false;
    }

    public void s(C0011l c0011l) {
        throw c0011l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(K k2) {
        boolean z2;
        V v2 = V.f549a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f548b;
        if (k2 == null) {
            atomicReferenceFieldUpdater.set(this, v2);
            return;
        }
        T t2 = (T) k2;
        do {
            Object q2 = t2.q();
            boolean z3 = q2 instanceof B;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f547a;
            if (z3) {
                if (!((B) q2).f525a) {
                    B b2 = AbstractC0018t.i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, q2, b2)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != q2) {
                            z2 = -1;
                            break;
                        }
                    }
                    t2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (q2 instanceof H) {
                    U u2 = ((H) q2).f532a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, q2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != q2) {
                            z2 = -1;
                            break;
                        }
                    }
                    t2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0006g interfaceC0006g = (InterfaceC0006g) AbstractC0018t.c(t2, true, new C0007h(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0006g);
        if (q() instanceof I) {
            return;
        }
        interfaceC0006g.e();
        atomicReferenceFieldUpdater.set(this, v2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + z(q()) + '}');
        sb.append('@');
        sb.append(AbstractC0018t.a(this));
        return sb.toString();
    }

    public final void v(U u2, Throwable th) {
        Object k2 = u2.k();
        D1.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0011l c0011l = null;
        for (Q1.j jVar = (Q1.j) k2; !jVar.equals(u2); jVar = jVar.l()) {
            if (jVar instanceof M) {
                O o2 = (O) jVar;
                try {
                    o2.o(th);
                } catch (Throwable th2) {
                    if (c0011l != null) {
                        h0.f.a(c0011l, th2);
                    } else {
                        c0011l = new C0011l("Exception in completion handler " + o2 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0011l != null) {
            s(c0011l);
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0006g interfaceC0006g = (InterfaceC0006g) f548b.get(this);
        if (interfaceC0006g == null || interfaceC0006g == V.f549a) {
            return;
        }
        interfaceC0006g.h(th);
    }

    public void w(Object obj) {
    }

    public void x() {
    }

    public final void y(O o2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u2 = new U();
        o2.getClass();
        Q1.j.f954b.lazySet(u2, o2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q1.j.f953a;
        atomicReferenceFieldUpdater2.lazySet(u2, o2);
        loop0: while (true) {
            if (o2.k() == o2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(o2, o2, u2)) {
                    if (atomicReferenceFieldUpdater2.get(o2) != o2) {
                        break;
                    }
                }
                u2.j(o2);
                break loop0;
            }
            break;
        }
        Q1.j l2 = o2.l();
        do {
            atomicReferenceFieldUpdater = f547a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o2);
    }
}
