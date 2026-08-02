package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.internal.a;

/* loaded from: classes5.dex */
public class h3f implements r2f, b7k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(h3f.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(h3f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h3f(boolean z) {
        this._state$volatile = z ? i3f.g : i3f.f;
    }

    public static ij4 Z(a aVar) {
        while (aVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.b;
            a f = aVar.f();
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(aVar);
                while (true) {
                    aVar = (a) obj;
                    if (!aVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(aVar);
                }
            } else {
                aVar = f;
            }
        }
        while (true) {
            aVar = aVar.h();
            if (!aVar.i()) {
                if (aVar instanceof ij4) {
                    return (ij4) aVar;
                }
                if (aVar instanceof h8j) {
                    return null;
                }
            }
        }
    }

    public static String h0(Object obj) {
        if (!(obj instanceof c3f)) {
            return obj instanceof iie ? ((iie) obj).b() ? "Active" : "New" : obj instanceof sm5 ? "Cancelled" : "Completed";
        }
        c3f c3fVar = (c3f) obj;
        return c3fVar.e() ? "Cancelling" : c3f.b.get(c3fVar) == 1 ? "Completing" : "Active";
    }

    public static void n(Throwable th, ArrayList arrayList) {
        if (arrayList.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
        Throwable c = !ve7.b() ? th : dar.c(th);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (ve7.b()) {
                th2 = dar.c(th2);
            }
            if (th2 != th && th2 != c && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                fob.a(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    public final Throwable A(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        h3f h3fVar = (h3f) ((b7k) obj);
        Object obj2 = a.get(h3fVar);
        if (obj2 instanceof c3f) {
            cancellationException = ((c3f) obj2).c();
        } else if (obj2 instanceof sm5) {
            cancellationException = ((sm5) obj2).a;
        } else {
            if (obj2 instanceof iie) {
                b6e.l(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new t2f("Parent job is ".concat(h0(obj2)), cancellationException, h3fVar) : cancellationException2;
    }

    public final Object B(c3f c3fVar, Object obj) {
        boolean e;
        Throwable E;
        sm5 sm5Var = obj instanceof sm5 ? (sm5) obj : null;
        Throwable th = sm5Var != null ? sm5Var.a : null;
        synchronized (c3fVar) {
            e = c3fVar.e();
            ArrayList f = c3fVar.f(th);
            E = E(c3fVar, f);
            if (E != null) {
                n(E, f);
            }
        }
        if (E != null && E != th) {
            obj = new sm5(E, false);
        }
        if (E != null && (v(E) || M(E))) {
            obj.getClass();
            sm5.b.compareAndSet((sm5) obj, 0, 1);
        }
        if (!e) {
            b0(E);
        }
        c0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object lieVar = obj instanceof iie ? new lie((iie) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c3fVar, lieVar) && atomicReferenceFieldUpdater.get(this) == c3fVar) {
        }
        y(c3fVar, obj);
        return obj;
    }

    public final Object C() {
        Object obj = a.get(this);
        if (obj instanceof iie) {
            xq0.q("This job has not completed yet");
            return null;
        }
        if (obj instanceof sm5) {
            throw ((sm5) obj).a;
        }
        return i3f.a(obj);
    }

    @Override // defpackage.r2f
    public final CancellationException D() {
        CancellationException cancellationException;
        Object obj = a.get(this);
        if (obj instanceof c3f) {
            Throwable c = ((c3f) obj).c();
            if (c == null) {
                b6e.l(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new t2f(concat, c, this) : cancellationException;
        }
        if (obj instanceof iie) {
            b6e.l(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof sm5)) {
            return new t2f(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((sm5) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new t2f(w(), th, this) : cancellationException;
    }

    public final Throwable E(c3f c3fVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c3fVar.e()) {
                return new t2f(w(), null, this);
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
        if (th2 instanceof wis) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof wis)) {
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

    public boolean F() {
        return true;
    }

    public final x3n G() {
        e3f e3fVar = e3f.a;
        wct.o(3, e3fVar);
        f3f f3fVar = f3f.a;
        wct.o(3, f3fVar);
        return new x3n(this, e3fVar, f3fVar, (Object) null);
    }

    public boolean J() {
        return this instanceof gm5;
    }

    public final z6n K() {
        g3f g3fVar = g3f.a;
        wct.o(3, g3fVar);
        return new z6n(this, g3fVar);
    }

    public final h8j L(iie iieVar) {
        h8j d = iieVar.d();
        if (d != null) {
            return d;
        }
        if (iieVar instanceof l4b) {
            return new h8j();
        }
        if (iieVar instanceof y2f) {
            f0((y2f) iieVar);
            return null;
        }
        b6e.l(iieVar, "State should have list: ");
        return null;
    }

    public boolean M(Throwable th) {
        return false;
    }

    public final void Q(r2f r2fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        m8j m8jVar = m8j.a;
        if (r2fVar == null) {
            atomicReferenceFieldUpdater.set(this, m8jVar);
            return;
        }
        r2fVar.start();
        hj4 l0 = r2fVar.l0(this);
        atomicReferenceFieldUpdater.set(this, l0);
        if (X()) {
            l0.a();
            atomicReferenceFieldUpdater.set(this, m8jVar);
        }
    }

    @Override // defpackage.r2f
    public final qa8 R(Function1 function1) {
        return S(true, new xa8(1, function1));
    }

    public final qa8 S(boolean z, y2f y2fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m8j m8jVar;
        boolean z2;
        boolean e;
        y2fVar.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof l4b;
            m8jVar = m8j.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof iie)) {
                    z2 = false;
                    break;
                }
                iie iieVar = (iie) obj;
                h8j d = iieVar.d();
                if (d == null) {
                    f0((y2f) obj);
                } else {
                    if (y2fVar.k()) {
                        c3f c3fVar = iieVar instanceof c3f ? (c3f) iieVar : null;
                        Throwable c = c3fVar != null ? c3fVar.c() : null;
                        if (c == null) {
                            e = d.e(y2fVar, 5);
                        } else if (z) {
                            y2fVar.l(c);
                            return m8jVar;
                        }
                    } else {
                        e = d.e(y2fVar, 1);
                    }
                    if (e) {
                        break;
                    }
                }
            } else {
                l4b l4bVar = (l4b) obj;
                if (l4bVar.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y2fVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                e0(l4bVar);
            }
        }
        if (z2) {
            return y2fVar;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            sm5 sm5Var = obj2 instanceof sm5 ? (sm5) obj2 : null;
            y2fVar.l(sm5Var != null ? sm5Var.a : null);
        }
        return m8jVar;
    }

    public boolean T() {
        return this instanceof j73;
    }

    public final boolean U(Object obj) {
        Object i0;
        do {
            i0 = i0(a.get(this), obj);
            if (i0 == i3f.a) {
                return false;
            }
            if (i0 == i3f.b) {
                return true;
            }
        } while (i0 == i3f.c);
        p(i0);
        return true;
    }

    public final Object V(Object obj) {
        Object i0;
        do {
            i0 = i0(a.get(this), obj);
            if (i0 == i3f.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                sm5 sm5Var = obj instanceof sm5 ? (sm5) obj : null;
                throw new IllegalStateException(str, sm5Var != null ? sm5Var.a : null);
            }
        } while (i0 == i3f.c);
        return i0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.r2f
    public final boolean X() {
        return !(a.get(this) instanceof iie);
    }

    @Override // defpackage.r2f
    public final qa8 Y(boolean z, boolean z2, aub aubVar) {
        return S(z2, z ? new nye(aubVar) : new xa8(1, aubVar));
    }

    @Override // defpackage.r2f
    public final Sequence a() {
        return new wz0(new rna(this, (Continuation) null, 1));
    }

    public final void a0(h8j h8jVar, Throwable th) {
        b0(th);
        h8jVar.e(new q8g(4), 4);
        Object obj = a.a.get(h8jVar);
        obj.getClass();
        wp3 wp3Var = null;
        for (a aVar = (a) obj; !aVar.equals(h8jVar); aVar = aVar.h()) {
            if ((aVar instanceof y2f) && ((y2f) aVar).k()) {
                try {
                    ((y2f) aVar).l(th);
                } catch (Throwable th2) {
                    if (wp3Var != null) {
                        fob.a(wp3Var, th2);
                    } else {
                        wp3Var = new wp3("Exception in completion handler " + aVar + " for " + this, th2);
                    }
                }
            }
        }
        if (wp3Var != null) {
            O(wp3Var);
        }
        v(th);
    }

    @Override // defpackage.r2f
    public boolean b() {
        Object obj = a.get(this);
        return (obj instanceof iie) && ((iie) obj).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [she] */
    public final void e0(l4b l4bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h8j h8jVar = new h8j();
        if (!l4bVar.a) {
            h8jVar = new she(h8jVar);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l4bVar, h8jVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l4bVar);
    }

    public final void f0(y2f y2fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h8j h8jVar = new h8j();
        y2fVar.getClass();
        a.b.set(h8jVar, y2fVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.a;
        atomicReferenceFieldUpdater2.set(h8jVar, y2fVar);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(y2fVar) == y2fVar) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(y2fVar, y2fVar, h8jVar)) {
                    if (atomicReferenceFieldUpdater2.get(y2fVar) != y2fVar) {
                        break;
                    }
                }
                h8jVar.g(y2fVar);
                break loop0;
            }
            break;
        }
        a h = y2fVar.h();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, y2fVar, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == y2fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.r2f
    public void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new t2f(w(), null, this);
        }
        u(cancellationException);
    }

    public final int g0(Object obj) {
        boolean z = obj instanceof l4b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((l4b) obj).a) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i3f.g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            d0();
            return 1;
        }
        if (!(obj instanceof she)) {
            return 0;
        }
        h8j h8jVar = ((she) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h8jVar)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        d0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return o6c.l;
    }

    public final Object i0(Object obj, Object obj2) {
        if (!(obj instanceof iie)) {
            return i3f.a;
        }
        if (((obj instanceof l4b) || (obj instanceof y2f)) && !(obj instanceof ij4) && !(obj2 instanceof sm5)) {
            iie iieVar = (iie) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object lieVar = obj2 instanceof iie ? new lie((iie) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iieVar, lieVar)) {
                if (atomicReferenceFieldUpdater.get(this) != iieVar) {
                    return i3f.c;
                }
            }
            b0(null);
            c0(obj2);
            y(iieVar, obj2);
            return obj2;
        }
        iie iieVar2 = (iie) obj;
        h8j L = L(iieVar2);
        if (L == null) {
            return i3f.c;
        }
        c3f c3fVar = iieVar2 instanceof c3f ? (c3f) iieVar2 : null;
        if (c3fVar == null) {
            c3fVar = new c3f(L, null);
        }
        synchronized (c3fVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c3f.b;
            if (atomicIntegerFieldUpdater.get(c3fVar) == 1) {
                return i3f.a;
            }
            atomicIntegerFieldUpdater.set(c3fVar, 1);
            if (c3fVar != iieVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, iieVar2, c3fVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != iieVar2) {
                        return i3f.c;
                    }
                }
            }
            boolean e = c3fVar.e();
            sm5 sm5Var = obj2 instanceof sm5 ? (sm5) obj2 : null;
            if (sm5Var != null) {
                c3fVar.a(sm5Var.a);
            }
            Throwable c = e ? null : c3fVar.c();
            if (c != null) {
                a0(L, c);
            }
            ij4 Z = Z(L);
            if (Z != null && k0(c3fVar, Z, obj2)) {
                return i3f.b;
            }
            L.e(new q8g(2), 2);
            ij4 Z2 = Z(L);
            return (Z2 == null || !k0(c3fVar, Z2, obj2)) ? B(c3fVar, obj2) : i3f.b;
        }
    }

    @Override // defpackage.r2f
    public final boolean isCancelled() {
        Object obj = a.get(this);
        if (obj instanceof sm5) {
            return true;
        }
        return (obj instanceof c3f) && ((c3f) obj).e();
    }

    @Override // defpackage.r2f
    public final Object j0(Continuation continuation) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof iie)) {
                saf.K(continuation.getContext());
                return Unit.a;
            }
        } while (g0(obj) < 0);
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        zt3Var.v(new ot3(2, saf.W(this, true, new gj4(zt3Var, 1))));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        if (q != nm6Var) {
            q = Unit.a;
        }
        return q == nm6Var ? q : Unit.a;
    }

    public final boolean k0(c3f c3fVar, ij4 ij4Var, Object obj) {
        while (saf.W(ij4Var.e, false, new b3f(this, c3fVar, ij4Var, obj)) == m8j.a) {
            ij4Var = Z(ij4Var);
            if (ij4Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r2f
    public final hj4 l0(h3f h3fVar) {
        ij4 ij4Var = new ij4(h3fVar);
        ij4Var.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof l4b) {
                l4b l4bVar = (l4b) obj;
                if (l4bVar.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ij4Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                e0(l4bVar);
            } else {
                boolean z = obj instanceof iie;
                m8j m8jVar = m8j.a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    sm5 sm5Var = obj2 instanceof sm5 ? (sm5) obj2 : null;
                    ij4Var.l(sm5Var != null ? sm5Var.a : null);
                    return m8jVar;
                }
                h8j d = ((iie) obj).d();
                if (d == null) {
                    f0((y2f) obj);
                } else if (!d.e(ij4Var, 7)) {
                    boolean e = d.e(ij4Var, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c3f) {
                        r4 = ((c3f) obj3).c();
                    } else {
                        sm5 sm5Var2 = obj3 instanceof sm5 ? (sm5) obj3 : null;
                        if (sm5Var2 != null) {
                            r4 = sm5Var2.a;
                        }
                    }
                    ij4Var.l(r4);
                    if (e) {
                        break loop0;
                    }
                    return m8jVar;
                }
            }
        }
        return ij4Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    public Object o() {
        return C();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    public void q(Object obj) {
        p(obj);
    }

    public final Object s(Continuation continuation) {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof iie)) {
                if (!(obj instanceof sm5)) {
                    return i3f.a(obj);
                }
                Throwable th = ((sm5) obj).a;
                if (!ve7.b()) {
                    throw th;
                }
                if (continuation instanceof om6) {
                    throw dar.a(th, (om6) continuation);
                }
                throw th;
            }
        } while (g0(obj) < 0);
        a3f a3fVar = new a3f(qxe.b(continuation), this);
        a3fVar.s();
        int i = 2;
        a3fVar.v(new ot3(i, saf.W(this, true, new xa8(i, a3fVar))));
        Object q = a3fVar.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    @Override // defpackage.r2f
    public final boolean start() {
        int g0;
        do {
            g0 = g0(a.get(this));
            if (g0 == 0) {
                return false;
            }
        } while (g0 != 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == defpackage.i3f.b) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Object obj) {
        js3 js3Var;
        Object obj2 = i3f.a;
        if (J()) {
            do {
                Object obj3 = a.get(this);
                if (obj3 instanceof iie) {
                    if (obj3 instanceof c3f) {
                        if (c3f.b.get((c3f) obj3) == 1) {
                        }
                    }
                    obj2 = i0(obj3, new sm5(A(obj), false));
                }
                obj2 = i3f.a;
                break;
            } while (obj2 == i3f.c);
        }
        if (obj2 == i3f.a) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof c3f)) {
                    if (!(obj4 instanceof iie)) {
                        js3Var = i3f.d;
                        break;
                    }
                    if (th == null) {
                        th = A(obj);
                    }
                    iie iieVar = (iie) obj4;
                    if (iieVar.b()) {
                        h8j L = L(iieVar);
                        if (L != null) {
                            c3f c3fVar = new c3f(L, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, iieVar, c3fVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != iieVar) {
                                    break;
                                }
                            }
                            a0(L, th);
                            js3Var = i3f.a;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object i0 = i0(obj4, new sm5(th, false));
                        if (i0 == i3f.a) {
                            b6e.l(obj4, "Cannot happen in ");
                            return false;
                        }
                        if (i0 != i3f.c) {
                            obj2 = i0;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (c3f.d.get((c3f) obj4) == i3f.e) {
                            js3Var = i3f.d;
                        } else {
                            boolean e = ((c3f) obj4).e();
                            if (th == null) {
                                th = A(obj);
                            }
                            ((c3f) obj4).a(th);
                            Throwable c = e ? null : ((c3f) obj4).c();
                            if (c != null) {
                                a0(((c3f) obj4).a, c);
                            }
                            js3Var = i3f.a;
                        }
                    }
                }
            }
            obj2 = js3Var;
        }
        if (obj2 != i3f.a && obj2 != i3f.b) {
            if (obj2 == i3f.d) {
                return false;
            }
            p(obj2);
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(W() + '{' + h0(a.get(this)) + '}');
        sb.append('@');
        sb.append(ff7.B(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        t(cancellationException);
    }

    public final boolean v(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hj4 hj4Var = (hj4) b.get(this);
        return (hj4Var == null || hj4Var == m8j.a) ? z : hj4Var.c(th) || z;
    }

    public String w() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && F();
    }

    public final void y(iie iieVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        hj4 hj4Var = (hj4) atomicReferenceFieldUpdater.get(this);
        if (hj4Var != null) {
            hj4Var.a();
            atomicReferenceFieldUpdater.set(this, m8j.a);
        }
        wp3 wp3Var = null;
        sm5 sm5Var = obj instanceof sm5 ? (sm5) obj : null;
        Throwable th = sm5Var != null ? sm5Var.a : null;
        if (iieVar instanceof y2f) {
            try {
                ((y2f) iieVar).l(th);
                return;
            } catch (Throwable th2) {
                O(new wp3("Exception in completion handler " + iieVar + " for " + this, th2));
                return;
            }
        }
        h8j d = iieVar.d();
        if (d != null) {
            d.e(new q8g(1), 1);
            Object obj2 = a.a.get(d);
            obj2.getClass();
            for (a aVar = (a) obj2; !aVar.equals(d); aVar = aVar.h()) {
                if (aVar instanceof y2f) {
                    try {
                        ((y2f) aVar).l(th);
                    } catch (Throwable th3) {
                        if (wp3Var != null) {
                            fob.a(wp3Var, th3);
                        } else {
                            wp3Var = new wp3("Exception in completion handler " + aVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (wp3Var != null) {
                O(wp3Var);
            }
        }
    }

    public final Throwable z() {
        Object obj = a.get(this);
        if (obj instanceof iie) {
            xq0.q("This job has not completed yet");
            return null;
        }
        sm5 sm5Var = obj instanceof sm5 ? (sm5) obj : null;
        if (sm5Var != null) {
            return sm5Var.a;
        }
        return null;
    }

    public void d0() {
    }

    public void O(wp3 wp3Var) {
        throw wp3Var;
    }

    public void b0(Throwable th) {
    }

    public void c0(Object obj) {
    }

    public void p(Object obj) {
    }
}
