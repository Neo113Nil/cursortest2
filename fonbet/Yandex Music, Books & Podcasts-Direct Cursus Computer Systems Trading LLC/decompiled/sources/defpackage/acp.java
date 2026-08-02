package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class acp implements pt3, hku {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(acp.class, Object.class, "state$volatile");
    public final CoroutineContext a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = bcp.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = bcp.d;

    public acp(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.hku
    public final void a(yap yapVar, int i) {
        this.c = yapVar;
        this.d = i;
    }

    @Override // defpackage.pt3
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == bcp.b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bcp.c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((xbp) it.next()).a();
            }
            this.e = bcp.d;
            this.b = null;
            return;
        }
    }

    public final Object c(cg6 cg6Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        xbp xbpVar = (xbp) obj;
        Object obj2 = xbpVar.d;
        Object obj3 = this.e;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xbp xbpVar2 = (xbp) it.next();
                if (xbpVar2 != xbpVar) {
                    xbpVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, bcp.b);
            this.e = bcp.d;
            this.b = null;
        }
        if (ve7.b()) {
            return h(xbpVar, obj3, cg6Var);
        }
        Object invoke = xbpVar.c.invoke(xbpVar.a, obj2, obj3);
        Continuation continuation = xbpVar.e;
        return obj2 == bcp.e ? ((Function1) continuation).invoke(cg6Var) : ((Function2) continuation).invoke(invoke, cg6Var);
    }

    public final Object d(aur aurVar) {
        return f.get(this) instanceof xbp ? c(aurVar) : e(aurVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        ybp ybpVar;
        int i;
        acp acpVar;
        if (cg6Var instanceof ybp) {
            ybpVar = (ybp) cg6Var;
            int i2 = ybpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ybpVar.k;
                nm6 nm6Var = nm6.a;
                i = ybpVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ybpVar.j = this;
                    ybpVar.m = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(ybpVar));
                    zt3Var.s();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        js3 js3Var = bcp.a;
                        if (obj2 == js3Var) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, zt3Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            zt3Var.v(this);
                            break loop0;
                        }
                        if (obj2 instanceof List) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, js3Var)) {
                                    Iterator it = ((Iterable) obj2).iterator();
                                    while (it.hasNext()) {
                                        xbp f2 = f(it.next());
                                        f2.getClass();
                                        f2.g = null;
                                        f2.h = -1;
                                        i(f2, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                        } else {
                            if (!(obj2 instanceof xbp)) {
                                b6e.l(obj2, "unexpected state: ");
                                return null;
                            }
                            Unit unit = Unit.a;
                            xbp xbpVar = (xbp) obj2;
                            Object obj3 = this.e;
                            pyc pycVar = xbpVar.f;
                            zt3Var.j(unit, pycVar != null ? (pyc) pycVar.invoke(this, xbpVar.d, obj3) : null);
                        }
                    }
                    Object q = zt3Var.q();
                    if (q != nm6.a) {
                        q = Unit.a;
                    }
                    if (q != nm6Var) {
                        acpVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                acpVar = ybpVar.j;
                qgg.h0(obj);
                ybpVar.j = null;
                ybpVar.m = 2;
                Object c = acpVar.c(ybpVar);
                return c != nm6Var ? nm6Var : c;
            }
        }
        ybpVar = new ybp(this, cg6Var);
        Object obj4 = ybpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ybpVar.m;
        if (i != 0) {
        }
        ybpVar.j = null;
        ybpVar.m = 2;
        Object c2 = acpVar.c(ybpVar);
        if (c2 != nm6Var2) {
        }
    }

    public final xbp f(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((xbp) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        xbp xbpVar = (xbp) obj2;
        if (xbpVar != null) {
            return xbpVar;
        }
        rj7.i(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(x3n x3nVar, Function2 function2) {
        i(new xbp(this, x3nVar.a, (pyc) x3nVar.b, (pyc) x3nVar.c, null, (aur) function2, (pyc) x3nVar.d), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(xbp xbpVar, Object obj, cg6 cg6Var) {
        zbp zbpVar;
        int i;
        try {
            if (cg6Var instanceof zbp) {
                zbpVar = (zbp) cg6Var;
                int i2 = zbpVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zbpVar.l = i2 - Integer.MIN_VALUE;
                    Object obj2 = zbpVar.j;
                    nm6 nm6Var = nm6.a;
                    i = zbpVar.l;
                    if (i == 0) {
                        if (i == 1) {
                            qgg.h0(obj2);
                            return obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    pyc pycVar = xbpVar.c;
                    Object obj3 = xbpVar.d;
                    Object invoke = pycVar.invoke(xbpVar.a, obj3, obj);
                    zbpVar.l = 1;
                    Continuation continuation = xbpVar.e;
                    Object invoke2 = obj3 == bcp.e ? ((Function1) continuation).invoke(zbpVar) : ((Function2) continuation).invoke(invoke, zbpVar);
                    return invoke2 == nm6Var ? nm6Var : invoke2;
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            if (ve7.b()) {
                throw dar.a(th, zbpVar);
            }
            throw th;
        }
        zbpVar = new zbp(this, cg6Var);
        Object obj22 = zbpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zbpVar.l;
    }

    public final void i(xbp xbpVar, boolean z) {
        Object obj = xbpVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (atomicReferenceFieldUpdater.get(this) instanceof xbp) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((xbp) it.next()).a == obj) {
                        wb8.h(hrg.n(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        xbpVar.b.invoke(obj, this, xbpVar.d);
        if (this.e != bcp.d) {
            atomicReferenceFieldUpdater.set(this, xbpVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(xbpVar);
        }
        xbpVar.g = this.c;
        xbpVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean j(Object obj, Object obj2) {
        return k(obj, obj2) == 0;
    }

    public final int k(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof yt3)) {
                if (Intrinsics.d(obj3, bcp.b) || (obj3 instanceof xbp)) {
                    return 3;
                }
                if (Intrinsics.d(obj3, bcp.c)) {
                    return 2;
                }
                if (Intrinsics.d(obj3, bcp.a)) {
                    List c = t75.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    b6e.l(obj3, "Unexpected state: ");
                    return 0;
                }
                ArrayList h0 = CollectionsKt.h0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, h0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            xbp f2 = f(obj);
            if (f2 != null) {
                pyc pycVar = f2.f;
                pyc pycVar2 = pycVar != null ? (pyc) pycVar.invoke(this, f2.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, f2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                yt3 yt3Var = (yt3) obj3;
                this.e = obj2;
                js3 d = yt3Var.d(Unit.a, pycVar2);
                if (d == null) {
                    this.e = bcp.d;
                    return 2;
                }
                yt3Var.r(d);
                return 0;
            }
            continue;
        }
    }
}
