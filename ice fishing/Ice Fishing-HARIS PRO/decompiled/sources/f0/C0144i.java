package f0;

import android.util.Log;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144i {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f2933a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.q f2934b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.q f2935c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2936d;
    public final O1.i e;

    /* renamed from: f, reason: collision with root package name */
    public final O1.i f2937f;

    /* renamed from: g, reason: collision with root package name */
    public final N f2938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f2939h;

    public C0144i(z zVar, N n2) {
        D1.i.e(n2, "navigator");
        this.f2939h = zVar;
        this.f2933a = new ReentrantLock(true);
        O1.q qVar = new O1.q(u1.o.f4473a);
        this.f2934b = qVar;
        O1.q qVar2 = new O1.q(u1.q.f4475a);
        this.f2935c = qVar2;
        this.e = new O1.i(qVar);
        this.f2937f = new O1.i(qVar2);
        this.f2938g = n2;
    }

    public final void a(C0141f c0141f) {
        D1.i.e(c0141f, "backStackEntry");
        ReentrantLock reentrantLock = this.f2933a;
        reentrantLock.lock();
        try {
            O1.q qVar = this.f2934b;
            Collection collection = (Collection) qVar.f();
            D1.i.e(collection, "<this>");
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(c0141f);
            qVar.g(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0141f c0141f) {
        C0150o c0150o;
        D1.i.e(c0141f, "entry");
        z zVar = this.f2939h;
        boolean a2 = D1.i.a(zVar.f3026y.get(c0141f), Boolean.TRUE);
        O1.q qVar = this.f2935c;
        Set set = (Set) qVar.f();
        D1.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(u1.s.E(set.size()));
        boolean z2 = false;
        for (Object obj : set) {
            boolean z3 = true;
            if (!z2 && D1.i.a(obj, c0141f)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj);
            }
        }
        qVar.g(linkedHashSet);
        zVar.f3026y.remove(c0141f);
        u1.e eVar = zVar.f3010g;
        boolean contains = eVar.contains(c0141f);
        O1.q qVar2 = zVar.i;
        if (contains) {
            if (this.f2936d) {
                return;
            }
            zVar.w();
            zVar.f3011h.g(u1.g.Z(eVar));
            qVar2.g(zVar.s());
            return;
        }
        zVar.v(c0141f);
        if (c0141f.f2925h.f2048c.compareTo(EnumC0097n.f2040c) >= 0) {
            c0141f.f(EnumC0097n.f2038a);
        }
        String str = c0141f.f2923f;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator it = eVar.iterator();
            while (it.hasNext()) {
                if (D1.i.a(((C0141f) it.next()).f2923f, str)) {
                    break;
                }
            }
        }
        if (!a2 && (c0150o = zVar.f3016o) != null) {
            D1.i.e(str, "backStackEntryId");
            U u2 = (U) c0150o.f2957b.remove(str);
            if (u2 != null) {
                u2.a();
            }
        }
        zVar.w();
        qVar2.g(zVar.s());
    }

    public final void c(C0141f c0141f) {
        int i;
        ReentrantLock reentrantLock = this.f2933a;
        reentrantLock.lock();
        try {
            ArrayList Z2 = u1.g.Z((Collection) ((O1.q) this.e.f852a).f());
            ListIterator listIterator = Z2.listIterator(Z2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (D1.i.a(((C0141f) listIterator.previous()).f2923f, c0141f.f2923f)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            Z2.set(i, c0141f);
            this.f2934b.g(Z2);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(C0141f c0141f, boolean z2) {
        D1.i.e(c0141f, "popUpTo");
        z zVar = this.f2939h;
        N b2 = zVar.f3022u.b(c0141f.f2920b.f2988a);
        zVar.f3026y.put(c0141f, Boolean.valueOf(z2));
        if (!b2.equals(this.f2938g)) {
            Object obj = zVar.f3023v.get(b2);
            D1.i.b(obj);
            ((C0144i) obj).d(c0141f, z2);
            return;
        }
        C0145j c0145j = zVar.f3025x;
        if (c0145j != null) {
            c0145j.g(c0141f);
            e(c0141f);
            return;
        }
        u1.e eVar = zVar.f3010g;
        int indexOf = eVar.indexOf(c0141f);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0141f + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != eVar.f4471c) {
            zVar.p(((C0141f) eVar.get(i)).f2920b.f2994h, true, false);
        }
        z.r(zVar, c0141f);
        e(c0141f);
        zVar.x();
        zVar.b();
    }

    public final void e(C0141f c0141f) {
        D1.i.e(c0141f, "popUpTo");
        ReentrantLock reentrantLock = this.f2933a;
        reentrantLock.lock();
        try {
            O1.q qVar = this.f2934b;
            Iterable iterable = (Iterable) qVar.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (D1.i.a((C0141f) obj, c0141f)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            qVar.g(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f(C0141f c0141f, boolean z2) {
        Object obj;
        D1.i.e(c0141f, "popUpTo");
        O1.q qVar = this.f2935c;
        Iterable iterable = (Iterable) qVar.f();
        boolean z3 = iterable instanceof Collection;
        O1.i iVar = this.e;
        if (!z3 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0141f) it.next()) == c0141f) {
                    Iterable iterable2 = (Iterable) ((O1.q) iVar.f852a).f();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0141f) it2.next()) == c0141f) {
                        }
                    }
                    return;
                }
            }
        }
        qVar.g(u1.v.E((Set) qVar.f(), c0141f));
        List list = (List) ((O1.q) iVar.f852a).f();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0141f c0141f2 = (C0141f) obj;
            if (!D1.i.a(c0141f2, c0141f)) {
                O1.h hVar = iVar.f852a;
                if (((List) ((O1.q) hVar).f()).lastIndexOf(c0141f2) < ((List) ((O1.q) hVar).f()).lastIndexOf(c0141f)) {
                    break;
                }
            }
        }
        C0141f c0141f3 = (C0141f) obj;
        if (c0141f3 != null) {
            qVar.g(u1.v.E((Set) qVar.f(), c0141f3));
        }
        d(c0141f, z2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [C1.l, D1.j] */
    public final void g(C0141f c0141f) {
        D1.i.e(c0141f, "backStackEntry");
        z zVar = this.f2939h;
        N b2 = zVar.f3022u.b(c0141f.f2920b.f2988a);
        if (!b2.equals(this.f2938g)) {
            Object obj = zVar.f3023v.get(b2);
            if (obj == null) {
                throw new IllegalStateException(D1.h.h(new StringBuilder("NavigatorBackStack for "), c0141f.f2920b.f2988a, " should already be created").toString());
            }
            ((C0144i) obj).g(c0141f);
            return;
        }
        ?? r02 = zVar.f3024w;
        if (r02 != 0) {
            r02.g(c0141f);
            a(c0141f);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0141f.f2920b + " outside of the call to navigate(). ");
        }
    }

    public final void h(C0141f c0141f) {
        O1.q qVar = this.f2935c;
        Iterable iterable = (Iterable) qVar.f();
        boolean z2 = iterable instanceof Collection;
        O1.i iVar = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0141f) it.next()) == c0141f) {
                    Iterable iterable2 = (Iterable) ((O1.q) iVar.f852a).f();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C0141f) it2.next()) == c0141f) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C0141f c0141f2 = (C0141f) u1.g.S((List) ((O1.q) iVar.f852a).f());
        if (c0141f2 != null) {
            qVar.g(u1.v.E((Set) qVar.f(), c0141f2));
        }
        qVar.g(u1.v.E((Set) qVar.f(), c0141f));
        g(c0141f);
    }
}
