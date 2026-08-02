package S7;

import E2.C0316m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.InterfaceC5243g;
import z7.InterfaceC5244h;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public class h0 implements Y, n0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3053n = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3054u = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h0(boolean z6) {
        this._state$volatile = z6 ? AbstractC0410y.f3098j : AbstractC0410y.i;
    }

    public static C0397k M(X7.k kVar) {
        while (kVar.g()) {
            X7.k c9 = kVar.c();
            if (c9 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.k.f3800u;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (X7.k) obj;
                    if (!kVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = c9;
            }
        }
        while (true) {
            kVar = kVar.f();
            if (!kVar.g()) {
                if (kVar instanceof C0397k) {
                    return (C0397k) kVar;
                }
                if (kVar instanceof k0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof f0)) {
            return obj instanceof V ? ((V) obj).j() ? "Active" : "New" : obj instanceof C0402p ? "Cancelled" : "Completed";
        }
        f0 f0Var = (f0) obj;
        return f0Var.c() ? "Cancelling" : f0Var.d() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C0399m;
    }

    public final k0 B(V v9) {
        k0 k9 = v9.k();
        if (k9 != null) {
            return k9;
        }
        if (v9 instanceof J) {
            return new k0();
        }
        if (v9 instanceof c0) {
            Q((c0) v9);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + v9).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f3053n.get(this);
            if (!(obj instanceof X7.p)) {
                return obj;
            }
            ((X7.p) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public final void F(Y y7) {
        int R8;
        H G2;
        l0 l0Var = l0.f3059n;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3054u;
        if (y7 == null) {
            atomicReferenceFieldUpdater.set(this, l0Var);
            return;
        }
        h0 h0Var = (h0) y7;
        do {
            R8 = h0Var.R(h0Var.C());
            if (R8 == 0) {
                break;
            }
        } while (R8 != 1);
        G2 = h0Var.G((r5 & 1) == 0, (r5 & 2) != 0, new C0397k(this));
        InterfaceC0396j interfaceC0396j = (InterfaceC0396j) G2;
        atomicReferenceFieldUpdater.set(this, interfaceC0396j);
        if (C() instanceof V) {
            return;
        }
        interfaceC0396j.b();
        atomicReferenceFieldUpdater.set(this, l0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H G(boolean z6, boolean z9, I7.l lVar) {
        c0 c0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z6) {
            c0Var = lVar instanceof a0 ? (a0) lVar : null;
            if (c0Var == null) {
                c0Var = new X(lVar);
            }
        } else {
            c0Var = lVar instanceof c0 ? (c0) lVar : null;
            if (c0Var == null) {
                c0Var = new I(1, lVar);
            }
        }
        c0Var.f3030w = this;
        loop0: while (true) {
            Object C8 = C();
            if (C8 instanceof J) {
                J j6 = (J) C8;
                if (j6.f3004n) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3053n;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C8, c0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C8) {
                            break;
                        }
                    }
                    break loop0;
                }
                k0 k0Var = new k0();
                V u6 = j6.f3004n ? k0Var : new U(k0Var);
                do {
                    atomicReferenceFieldUpdater = f3053n;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, j6, u6)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == j6);
            } else {
                if (!(C8 instanceof V)) {
                    if (z9) {
                        C0402p c0402p = C8 instanceof C0402p ? (C0402p) C8 : null;
                        lVar.invoke(c0402p != null ? c0402p.f3066a : null);
                    }
                    return l0.f3059n;
                }
                k0 k9 = ((V) C8).k();
                if (k9 == null) {
                    kotlin.jvm.internal.h.c(C8, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((c0) C8);
                } else {
                    H h3 = l0.f3059n;
                    if (z6 && (C8 instanceof f0)) {
                        synchronized (C8) {
                            try {
                                th = ((f0) C8).b();
                                if (th != null) {
                                    if ((lVar instanceof C0397k) && !((f0) C8).d()) {
                                    }
                                }
                                if (g((V) C8, k9, c0Var)) {
                                    if (th == null) {
                                        return c0Var;
                                    }
                                    h3 = c0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z9) {
                            lVar.invoke(th);
                        }
                        return h3;
                    }
                    if (g((V) C8, k9, c0Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof C0389c;
    }

    public final Object I(B7.c cVar) {
        Object C8;
        u7.v vVar;
        do {
            C8 = C();
            boolean z6 = C8 instanceof V;
            vVar = u7.v.f41073a;
            if (!z6) {
                AbstractC0410y.g(cVar.getContext());
                return vVar;
            }
        } while (R(C8) < 0);
        C0393g c0393g = new C0393g(1, A8.b.n(cVar));
        c0393g.r();
        c0393g.t(new C0391e(1, G(false, true, new I(3, c0393g))));
        Object q8 = c0393g.q();
        A7.a aVar = A7.a.f215n;
        if (q8 != aVar) {
            q8 = vVar;
        }
        return q8 == aVar ? q8 : vVar;
    }

    public final boolean J(Object obj) {
        Object T8;
        do {
            T8 = T(C(), obj);
            if (T8 == AbstractC0410y.f3093d) {
                return false;
            }
            if (T8 == AbstractC0410y.f3094e) {
                return true;
            }
        } while (T8 == AbstractC0410y.f3095f);
        h(T8);
        return true;
    }

    public final Object K(Object obj) {
        Object T8;
        do {
            T8 = T(C(), obj);
            if (T8 == AbstractC0410y.f3093d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0402p c0402p = obj instanceof C0402p ? (C0402p) obj : null;
                throw new IllegalStateException(str, c0402p != null ? c0402p.f3066a : null);
            }
        } while (T8 == AbstractC0410y.f3095f);
        return T8;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(k0 k0Var, Throwable th) {
        Object e9 = k0Var.e();
        kotlin.jvm.internal.h.c(e9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        B0.c cVar = null;
        for (X7.k kVar = (X7.k) e9; !kVar.equals(k0Var); kVar = kVar.f()) {
            if (kVar instanceof a0) {
                c0 c0Var = (c0) kVar;
                try {
                    c0Var.i(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        A8.b.a(cVar, th2);
                    } else {
                        cVar = new B0.c("Exception in completion handler " + c0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            E(cVar);
        }
        q(th);
    }

    public final void Q(c0 c0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var = new k0();
        c0Var.getClass();
        X7.k.f3800u.set(k0Var, c0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.k.f3799n;
        atomicReferenceFieldUpdater2.set(k0Var, c0Var);
        loop0: while (true) {
            if (c0Var.e() == c0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, c0Var, k0Var)) {
                    if (atomicReferenceFieldUpdater2.get(c0Var) != c0Var) {
                        break;
                    }
                }
                k0Var.d(c0Var);
                break loop0;
            }
            break;
        }
        X7.k f2 = c0Var.f();
        do {
            atomicReferenceFieldUpdater = f3053n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0Var, f2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0Var);
    }

    public final int R(Object obj) {
        boolean z6 = obj instanceof J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3053n;
        if (z6) {
            if (((J) obj).f3004n) {
                return 0;
            }
            J j6 = AbstractC0410y.f3098j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        }
        if (!(obj instanceof U)) {
            return 0;
        }
        k0 k0Var = ((U) obj).f3020n;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        P();
        return 1;
    }

    public final Object T(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        H G2;
        if (!(obj instanceof V)) {
            return AbstractC0410y.f3093d;
        }
        if (((obj instanceof J) || (obj instanceof c0)) && !(obj instanceof C0397k) && !(obj2 instanceof C0402p)) {
            V v9 = (V) obj;
            Object w3 = obj2 instanceof V ? new W((V) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3053n;
                if (atomicReferenceFieldUpdater.compareAndSet(this, v9, w3)) {
                    O(obj2);
                    t(v9, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == v9);
            return AbstractC0410y.f3095f;
        }
        V v10 = (V) obj;
        k0 B3 = B(v10);
        if (B3 == null) {
            return AbstractC0410y.f3095f;
        }
        C0397k c0397k = null;
        f0 f0Var = v10 instanceof f0 ? (f0) v10 : null;
        if (f0Var == null) {
            f0Var = new f0(B3, null);
        }
        synchronized (f0Var) {
            try {
                if (f0Var.d()) {
                    return AbstractC0410y.f3093d;
                }
                f0.f3039u.set(f0Var, 1);
                if (f0Var != v10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3053n;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, v10, f0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != v10) {
                            return AbstractC0410y.f3095f;
                        }
                    }
                }
                boolean c9 = f0Var.c();
                C0402p c0402p = obj2 instanceof C0402p ? (C0402p) obj2 : null;
                if (c0402p != null) {
                    f0Var.a(c0402p.f3066a);
                }
                Throwable b9 = f0Var.b();
                if (c9) {
                    b9 = null;
                }
                if (b9 != null) {
                    N(B3, b9);
                }
                C0397k c0397k2 = v10 instanceof C0397k ? (C0397k) v10 : null;
                if (c0397k2 == null) {
                    k0 k9 = v10.k();
                    if (k9 != null) {
                        c0397k = M(k9);
                    }
                } else {
                    c0397k = c0397k2;
                }
                if (c0397k != null) {
                    do {
                        G2 = c0397k.f3058x.G((r5 & 1) == 0, (r5 & 2) != 0, new e0(this, f0Var, c0397k, obj2));
                        if (G2 != l0.f3059n) {
                            return AbstractC0410y.f3094e;
                        }
                        c0397k = M(c0397k);
                    } while (c0397k != null);
                }
                return v(f0Var, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S7.Y
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Z(r(), null, this);
        }
        p(cancellationException);
    }

    public final boolean g(V v9, k0 k0Var, c0 c0Var) {
        char c9;
        g0 g0Var = new g0(c0Var, this, v9);
        do {
            X7.k c10 = k0Var.c();
            if (c10 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.k.f3800u;
                Object obj = atomicReferenceFieldUpdater.get(k0Var);
                while (true) {
                    c10 = (X7.k) obj;
                    if (!c10.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c10);
                }
            }
            X7.k.f3800u.set(c0Var, c10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.k.f3799n;
            atomicReferenceFieldUpdater2.set(c0Var, k0Var);
            g0Var.f3049c = k0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(c10, k0Var, g0Var)) {
                    c9 = g0Var.a(c10) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(c10) != k0Var) {
                    c9 = 0;
                    break;
                }
            }
            if (c9 == 1) {
                return true;
            }
        } while (c9 != 2);
        return false;
    }

    @Override // z7.InterfaceC5243g
    public final InterfaceC5244h getKey() {
        return C0407v.f3081u;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i i(InterfaceC5244h interfaceC5244h) {
        return A8.b.q(this, interfaceC5244h);
    }

    @Override // S7.Y
    public boolean j() {
        Object C8 = C();
        return (C8 instanceof V) && ((V) C8).j();
    }

    public void k(Object obj) {
        h(obj);
    }

    @Override // z7.InterfaceC5245i
    public final Object l(Object obj, I7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5243g m(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(C0407v.f3081u, key)) {
            return this;
        }
        return null;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i n(InterfaceC5245i interfaceC5245i) {
        return A8.b.t(this, interfaceC5245i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == S7.AbstractC0410y.f3094e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        C0316m c0316m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0410y.f3093d;
        if (A()) {
            do {
                Object C8 = C();
                if (!(C8 instanceof V) || ((C8 instanceof f0) && ((f0) C8).d())) {
                    obj2 = AbstractC0410y.f3093d;
                    break;
                }
                obj2 = T(C8, new C0402p(u(obj), false));
            } while (obj2 == AbstractC0410y.f3095f);
        }
        if (obj2 == AbstractC0410y.f3093d) {
            Throwable th = null;
            loop1: while (true) {
                Object C9 = C();
                if (!(C9 instanceof f0)) {
                    if (!(C9 instanceof V)) {
                        c0316m = AbstractC0410y.f3096g;
                        break;
                    }
                    if (th == null) {
                        th = u(obj);
                    }
                    V v9 = (V) C9;
                    if (v9.j()) {
                        k0 B3 = B(v9);
                        if (B3 == null) {
                            continue;
                        } else {
                            f0 f0Var = new f0(B3, th);
                            do {
                                atomicReferenceFieldUpdater = f3053n;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, v9, f0Var)) {
                                    N(B3, th);
                                    c0316m = AbstractC0410y.f3093d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == v9);
                        }
                    } else {
                        Object T8 = T(C9, new C0402p(th, false));
                        if (T8 == AbstractC0410y.f3093d) {
                            throw new IllegalStateException(("Cannot happen in " + C9).toString());
                        }
                        if (T8 != AbstractC0410y.f3095f) {
                            obj2 = T8;
                            break;
                        }
                    }
                } else {
                    synchronized (C9) {
                        try {
                            f0 f0Var2 = (f0) C9;
                            f0Var2.getClass();
                            if (f0.f3041w.get(f0Var2) == AbstractC0410y.f3097h) {
                                c0316m = AbstractC0410y.f3096g;
                            } else {
                                boolean c9 = ((f0) C9).c();
                                if (th == null) {
                                    th = u(obj);
                                }
                                ((f0) C9).a(th);
                                Throwable b9 = c9 ? null : ((f0) C9).b();
                                if (b9 != null) {
                                    N(((f0) C9).f3042n, b9);
                                }
                                c0316m = AbstractC0410y.f3093d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = c0316m;
        }
        if (obj2 != AbstractC0410y.f3093d && obj2 != AbstractC0410y.f3094e) {
            if (obj2 == AbstractC0410y.f3096g) {
                return false;
            }
            h(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (H()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC0396j interfaceC0396j = (InterfaceC0396j) f3054u.get(this);
        return (interfaceC0396j == null || interfaceC0396j == l0.f3059n) ? z6 : interfaceC0396j.a(th) || z6;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && y();
    }

    public final void t(V v9, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3054u;
        InterfaceC0396j interfaceC0396j = (InterfaceC0396j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0396j != null) {
            interfaceC0396j.b();
            atomicReferenceFieldUpdater.set(this, l0.f3059n);
        }
        B0.c cVar = null;
        C0402p c0402p = obj instanceof C0402p ? (C0402p) obj : null;
        Throwable th = c0402p != null ? c0402p.f3066a : null;
        if (v9 instanceof c0) {
            try {
                ((c0) v9).i(th);
                return;
            } catch (Throwable th2) {
                E(new B0.c("Exception in completion handler " + v9 + " for " + this, th2));
                return;
            }
        }
        k0 k9 = v9.k();
        if (k9 != null) {
            Object e9 = k9.e();
            kotlin.jvm.internal.h.c(e9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (X7.k kVar = (X7.k) e9; !kVar.equals(k9); kVar = kVar.f()) {
                if (kVar instanceof c0) {
                    c0 c0Var = (c0) kVar;
                    try {
                        c0Var.i(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            A8.b.a(cVar, th3);
                        } else {
                            cVar = new B0.c("Exception in completion handler " + c0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                E(cVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + '{' + S(C()) + '}');
        sb.append('@');
        sb.append(AbstractC0410y.j(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable u(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        h0 h0Var = (h0) ((n0) obj);
        Object C8 = h0Var.C();
        if (C8 instanceof f0) {
            cancellationException = ((f0) C8).b();
        } else if (C8 instanceof C0402p) {
            cancellationException = ((C0402p) C8).f3066a;
        } else {
            if (C8 instanceof V) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C8).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Z("Parent job is ".concat(S(C8)), cancellationException, h0Var) : cancellationException2;
    }

    public final Object v(f0 f0Var, Object obj) {
        Throwable x9;
        C0402p c0402p = obj instanceof C0402p ? (C0402p) obj : null;
        Throwable th = c0402p != null ? c0402p.f3066a : null;
        synchronized (f0Var) {
            f0Var.c();
            ArrayList<Throwable> e9 = f0Var.e(th);
            x9 = x(f0Var, e9);
            if (x9 != null && e9.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e9.size()));
                for (Throwable th2 : e9) {
                    if (th2 != x9 && th2 != x9 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        A8.b.a(x9, th2);
                    }
                }
            }
        }
        if (x9 != null && x9 != th) {
            obj = new C0402p(x9, false);
        }
        if (x9 != null && (q(x9) || D(x9))) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0402p.f3065b.compareAndSet((C0402p) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3053n;
        Object w3 = obj instanceof V ? new W((V) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, f0Var, w3) && atomicReferenceFieldUpdater.get(this) == f0Var) {
        }
        t(f0Var, obj);
        return obj;
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object C8 = C();
        if (!(C8 instanceof f0)) {
            if (C8 instanceof V) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C8 instanceof C0402p)) {
                return new Z(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0402p) C8).f3066a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Z(r(), th, this) : cancellationException;
        }
        Throwable b9 = ((f0) C8).b();
        if (b9 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b9 instanceof CancellationException ? (CancellationException) b9 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = r();
            }
            cancellationException = new Z(concat, b9, this);
        }
        return cancellationException;
    }

    public final Throwable x(f0 f0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (f0Var.c()) {
                return new Z(r(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof s0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof s0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean y() {
        return true;
    }

    public void P() {
    }

    public void E(B0.c cVar) {
        throw cVar;
    }

    public void O(Object obj) {
    }

    public void h(Object obj) {
    }
}
