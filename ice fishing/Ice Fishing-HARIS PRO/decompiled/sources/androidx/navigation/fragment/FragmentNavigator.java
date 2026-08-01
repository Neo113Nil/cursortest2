package androidx.navigation.fragment;

import B.b;
import D1.e;
import D1.i;
import K1.n;
import O1.q;
import Q1.o;
import R.j;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import Z.F;
import Z.K;
import Z.L;
import a.AbstractC0078a;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.navigation.fragment.FragmentNavigator;
import c0.C0120a;
import c0.C0123d;
import f0.C0134C;
import f0.C0141f;
import f0.C0143h;
import f0.C0144i;
import f0.M;
import f0.N;
import f0.w;
import h0.k;
import h0.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import o.C0312c;
import o.C0315f;
import t1.d;
import u1.g;
import u1.h;
import u1.m;

@M("fragment")
/* loaded from: classes.dex */
public class FragmentNavigator extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f2076c;

    /* renamed from: d, reason: collision with root package name */
    public final Z.M f2077d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2078f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2079g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final C0143h f2080h = new C0143h(1, this);
    public final n i = new n(1, this);

    public static final class a extends Q {

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f2081b;

        @Override // androidx.lifecycle.Q
        public final void b() {
            WeakReference weakReference = this.f2081b;
            if (weakReference == null) {
                i.i("completeTransition");
                throw null;
            }
            C1.a aVar = (C1.a) weakReference.get();
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    public FragmentNavigator(Context context, Z.M m2, int i) {
        this.f2076c = context;
        this.f2077d = m2;
        this.e = i;
    }

    public static void k(FragmentNavigator fragmentNavigator, String str, boolean z2, int i) {
        int E2;
        int i2 = 0;
        if ((i & 2) != 0) {
            z2 = false;
        }
        boolean z3 = (i & 4) != 0;
        ArrayList arrayList = fragmentNavigator.f2079g;
        if (z3) {
            i.e(arrayList, "<this>");
            int E3 = h.E(arrayList);
            if (E3 >= 0) {
                int i3 = 0;
                while (true) {
                    Object obj = arrayList.get(i2);
                    d dVar = (d) obj;
                    i.e(dVar, "it");
                    if (!i.a(dVar.f4378a, str)) {
                        if (i3 != i2) {
                            arrayList.set(i3, obj);
                        }
                        i3++;
                    }
                    if (i2 == E3) {
                        break;
                    } else {
                        i2++;
                    }
                }
                i2 = i3;
            }
            if (i2 < arrayList.size() && i2 <= (E2 = h.E(arrayList))) {
                while (true) {
                    arrayList.remove(E2);
                    if (E2 == i2) {
                        break;
                    } else {
                        E2--;
                    }
                }
            }
        }
        arrayList.add(new d(str, Boolean.valueOf(z2)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // f0.N
    public final w a() {
        return new h0.h(this);
    }

    @Override // f0.N
    public final void d(List list, C0134C c0134c) {
        Z.M m2 = this.f2077d;
        if (m2.K()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0141f c0141f = (C0141f) it.next();
            boolean isEmpty = ((List) ((q) b().e.f852a).f()).isEmpty();
            if (c0134c == null || isEmpty || !c0134c.f2861b || !this.f2078f.remove(c0141f.f2923f)) {
                C0053a m3 = m(c0141f, c0134c);
                if (!isEmpty) {
                    C0141f c0141f2 = (C0141f) g.S((List) ((q) b().e.f852a).f());
                    if (c0141f2 != null) {
                        k(this, c0141f2.f2923f, false, 6);
                    }
                    String str = c0141f.f2923f;
                    k(this, str, false, 6);
                    if (!m3.f1517h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    m3.f1516g = true;
                    m3.i = str;
                }
                m3.d(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c0141f);
                }
                b().h(c0141f);
            } else {
                m2.v(new L(m2, c0141f.f2923f, 0), false);
                b().h(c0141f);
            }
        }
    }

    @Override // f0.N
    public final void e(final C0144i c0144i) {
        this.f2892a = c0144i;
        this.f2893b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        Z.Q q2 = new Z.Q() { // from class: h0.g
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [h0.m, java.lang.Object] */
            @Override // Z.Q
            public final void a(Z.M m2, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
                Object obj;
                Object obj2;
                C0144i c0144i2 = C0144i.this;
                FragmentNavigator fragmentNavigator = this;
                D1.i.e(fragmentNavigator, "this$0");
                D1.i.e(m2, "<anonymous parameter 0>");
                D1.i.e(abstractComponentCallbacksC0070s, "fragment");
                List list = (List) ((q) c0144i2.e.f852a).f();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = listIterator.previous();
                        if (D1.i.a(((C0141f) obj2).f2923f, abstractComponentCallbacksC0070s.f1620y)) {
                            break;
                        }
                    }
                }
                C0141f c0141f = (C0141f) obj2;
                if (FragmentNavigator.n()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + abstractComponentCallbacksC0070s + " associated with entry " + c0141f + " to FragmentManager " + fragmentNavigator.f2077d);
                }
                if (c0141f != null) {
                    final o oVar = new o(fragmentNavigator, abstractComponentCallbacksC0070s, c0141f, 1);
                    ?? r4 = new A() { // from class: h0.m
                        @Override // androidx.lifecycle.A
                        public final /* synthetic */ void a(Object obj3) {
                            o.this.g(obj3);
                        }

                        public final boolean equals(Object obj3) {
                            if (!(obj3 instanceof A) || !(obj3 instanceof m)) {
                                return false;
                            }
                            return o.this.equals(o.this);
                        }

                        public final int hashCode() {
                            return o.this.hashCode();
                        }
                    };
                    z zVar = abstractComponentCallbacksC0070s.f1594Q;
                    zVar.getClass();
                    z.a("observe");
                    if (abstractComponentCallbacksC0070s.f1592O.f2048c != EnumC0097n.f2038a) {
                        x xVar = new x(zVar, abstractComponentCallbacksC0070s, r4);
                        C0315f c0315f = zVar.f2061b;
                        C0312c a2 = c0315f.a(r4);
                        if (a2 != null) {
                            obj = a2.f4118b;
                        } else {
                            C0312c c0312c = new C0312c(r4, xVar);
                            c0315f.f4127d++;
                            C0312c c0312c2 = c0315f.f4125b;
                            if (c0312c2 == null) {
                                c0315f.f4124a = c0312c;
                                c0315f.f4125b = c0312c;
                            } else {
                                c0312c2.f4119c = c0312c;
                                c0312c.f4120d = c0312c2;
                                c0315f.f4125b = c0312c;
                            }
                        }
                        y yVar = (y) obj;
                        if (yVar != null && !yVar.d(abstractComponentCallbacksC0070s)) {
                            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                        }
                        if (yVar == null) {
                            abstractComponentCallbacksC0070s.f1592O.a(xVar);
                        }
                    }
                    abstractComponentCallbacksC0070s.f1592O.a(fragmentNavigator.f2080h);
                    fragmentNavigator.l(abstractComponentCallbacksC0070s, c0141f, c0144i2);
                }
            }
        };
        Z.M m2 = this.f2077d;
        m2.f1445n.add(q2);
        k kVar = new k(c0144i, this);
        if (m2.f1443l == null) {
            m2.f1443l = new ArrayList();
        }
        m2.f1443l.add(kVar);
    }

    @Override // f0.N
    public final void f(C0141f c0141f) {
        Z.M m2 = this.f2077d;
        if (m2.K()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0053a m3 = m(c0141f, null);
        List list = (List) ((q) b().e.f852a).f();
        if (list.size() > 1) {
            C0141f c0141f2 = (C0141f) g.O(list, h.E(list) - 1);
            if (c0141f2 != null) {
                k(this, c0141f2.f2923f, false, 6);
            }
            String str = c0141f.f2923f;
            k(this, str, true, 4);
            m2.v(new K(m2, str, -1), false);
            k(this, str, false, 2);
            if (!m3.f1517h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            m3.f1516g = true;
            m3.i = str;
        }
        m3.d(false);
        b().c(c0141f);
    }

    @Override // f0.N
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f2078f;
            linkedHashSet.clear();
            m.J(stringArrayList, linkedHashSet);
        }
    }

    @Override // f0.N
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f2078f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC0078a.d(new d("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC] */
    @Override // f0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C0141f c0141f, boolean z2) {
        int i;
        boolean z3;
        i.e(c0141f, "popUpTo");
        Z.M m2 = this.f2077d;
        if (m2.K()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((q) b().e.f852a).f();
        int indexOf = list.indexOf(c0141f);
        List subList = list.subList(indexOf, list.size());
        C0141f c0141f2 = (C0141f) g.M(list);
        C0141f c0141f3 = (C0141f) g.O(list, indexOf - 1);
        int i2 = 0;
        if (c0141f3 != null) {
            k(this, c0141f3.f2923f, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            C0141f c0141f4 = (C0141f) obj;
            ArrayList arrayList2 = this.f2079g;
            i.e(arrayList2, "<this>");
            l lVar = l.f3263b;
            String str = c0141f4.f2923f;
            Iterator it = arrayList2.iterator();
            int i3 = i2;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object g2 = lVar.g(it.next());
                if (i3 < 0) {
                    h.H();
                    throw null;
                }
                if (i.a(str, g2)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (!(i >= 0)) {
                if (i.a(c0141f4.f2923f, c0141f2.f2923f)) {
                    z3 = false;
                    if (!z3) {
                        arrayList.add(obj);
                    }
                    i2 = 0;
                }
            }
            z3 = true;
            if (!z3) {
            }
            i2 = 0;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((C0141f) it2.next()).f2923f, true, 4);
        }
        if (z2) {
            for (C0141f c0141f5 : g.V(subList)) {
                if (i.a(c0141f5, c0141f2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c0141f5);
                } else {
                    m2.v(new L(m2, c0141f5.f2923f, 1), false);
                    this.f2078f.add(c0141f5.f2923f);
                }
            }
        } else {
            m2.v(new K(m2, c0141f.f2923f, -1), false);
        }
        if (n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + c0141f + " with savedState " + z2);
        }
        b().f(c0141f, z2);
    }

    public final void l(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, C0141f c0141f, C0144i c0144i) {
        i.e(abstractComponentCallbacksC0070s, "fragment");
        U c2 = abstractComponentCallbacksC0070s.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e a2 = D1.o.a(a.class);
        if (linkedHashMap.containsKey(a2)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + j.t(a2) + '.').toString());
        }
        linkedHashMap.put(a2, new C0123d(a2));
        Collection values = linkedHashMap.values();
        i.e(values, "initializers");
        C0123d[] c0123dArr = (C0123d[]) values.toArray(new C0123d[0]);
        b bVar = new b((C0123d[]) Arrays.copyOf(c0123dArr, c0123dArr.length));
        C0120a c0120a = C0120a.f2339b;
        i.e(c0120a, "defaultCreationExtras");
        M0.h hVar = new M0.h(c2, bVar, c0120a);
        e a3 = D1.o.a(a.class);
        String t2 = j.t(a3);
        if (t2 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) hVar.f(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2))).f2081b = new WeakReference(new h0.i(c0141f, c0144i, this, abstractComponentCallbacksC0070s));
    }

    public final C0053a m(C0141f c0141f, C0134C c0134c) {
        w wVar = c0141f.f2920b;
        i.c(wVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle e = c0141f.e();
        String str = ((h0.h) wVar).f3255k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char charAt = str.charAt(0);
        Context context = this.f2076c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        Z.M m2 = this.f2077d;
        F D2 = m2.D();
        context.getClassLoader();
        AbstractComponentCallbacksC0070s a2 = D2.a(str);
        i.d(a2, "fragmentManager.fragment…t.classLoader, className)");
        a2.L(e);
        C0053a c0053a = new C0053a(m2);
        int i = c0134c != null ? c0134c.f2864f : -1;
        int i2 = c0134c != null ? c0134c.f2865g : -1;
        int i3 = c0134c != null ? c0134c.f2866h : -1;
        int i4 = c0134c != null ? c0134c.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            c0053a.f1512b = i;
            c0053a.f1513c = i2;
            c0053a.f1514d = i3;
            c0053a.e = i5;
        }
        int i6 = this.e;
        if (i6 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c0053a.e(i6, a2, c0141f.f2923f, 2);
        c0053a.g(a2);
        c0053a.f1523p = true;
        return c0053a;
    }
}
