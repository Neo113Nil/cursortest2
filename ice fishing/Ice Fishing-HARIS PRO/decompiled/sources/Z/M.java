package Z;

import a0.AbstractC0082d;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0097n;
import androidx.navigation.fragment.FragmentNavigator;
import b.C0108d;
import b.InterfaceC0107c;
import c0.C0120a;
import com.lumenpath.harispro.hrnavigator.R;
import e0.C0128a;
import f0.C0141f;
import f0.C0144i;
import h.AbstractActivityC0168i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0233d;
import r.C0343k;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: A, reason: collision with root package name */
    public F.i f1422A;

    /* renamed from: B, reason: collision with root package name */
    public F.i f1423B;

    /* renamed from: C, reason: collision with root package name */
    public F.i f1424C;

    /* renamed from: D, reason: collision with root package name */
    public ArrayDeque f1425D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1426E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1427F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1428G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1429H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1430I;
    public ArrayList J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f1431K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f1432L;

    /* renamed from: M, reason: collision with root package name */
    public P f1433M;

    /* renamed from: N, reason: collision with root package name */
    public final B0.j f1434N;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1436b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1438d;
    public ArrayList e;

    /* renamed from: g, reason: collision with root package name */
    public b.u f1440g;

    /* renamed from: h, reason: collision with root package name */
    public final D f1441h;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1443l;

    /* renamed from: m, reason: collision with root package name */
    public final F.i f1444m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1445n;

    /* renamed from: o, reason: collision with root package name */
    public final A f1446o;

    /* renamed from: p, reason: collision with root package name */
    public final A f1447p;

    /* renamed from: q, reason: collision with root package name */
    public final A f1448q;

    /* renamed from: r, reason: collision with root package name */
    public final A f1449r;

    /* renamed from: s, reason: collision with root package name */
    public final E f1450s;

    /* renamed from: t, reason: collision with root package name */
    public int f1451t;

    /* renamed from: u, reason: collision with root package name */
    public C0074w f1452u;

    /* renamed from: v, reason: collision with root package name */
    public R.j f1453v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0070s f1454w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0070s f1455x;

    /* renamed from: y, reason: collision with root package name */
    public final F f1456y;

    /* renamed from: z, reason: collision with root package name */
    public final S0.e f1457z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1435a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final B.k f1437c = new B.k(2);

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C0077z f1439f = new LayoutInflaterFactory2C0077z(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f1442k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Z.A] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Z.A] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Z.A] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Z.A] */
    public M() {
        final int i = 0;
        this.f1441h = new D(i, this);
        Collections.synchronizedMap(new HashMap());
        this.f1444m = new F.i(this);
        this.f1445n = new CopyOnWriteArrayList();
        this.f1446o = new N.a(this) { // from class: Z.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f1403b;

            {
                this.f1403b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        M m2 = this.f1403b;
                        if (m2.H()) {
                            m2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m3 = this.f1403b;
                        if (m3.H() && num.intValue() == 80) {
                            m3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        D.g gVar = (D.g) obj;
                        M m4 = this.f1403b;
                        if (m4.H()) {
                            m4.m(gVar.f120a, false);
                            break;
                        }
                        break;
                    default:
                        D.h hVar = (D.h) obj;
                        M m5 = this.f1403b;
                        if (m5.H()) {
                            m5.r(hVar.f121a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1447p = new N.a(this) { // from class: Z.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f1403b;

            {
                this.f1403b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        M m2 = this.f1403b;
                        if (m2.H()) {
                            m2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m3 = this.f1403b;
                        if (m3.H() && num.intValue() == 80) {
                            m3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        D.g gVar = (D.g) obj;
                        M m4 = this.f1403b;
                        if (m4.H()) {
                            m4.m(gVar.f120a, false);
                            break;
                        }
                        break;
                    default:
                        D.h hVar = (D.h) obj;
                        M m5 = this.f1403b;
                        if (m5.H()) {
                            m5.r(hVar.f121a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1448q = new N.a(this) { // from class: Z.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f1403b;

            {
                this.f1403b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        M m2 = this.f1403b;
                        if (m2.H()) {
                            m2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m3 = this.f1403b;
                        if (m3.H() && num.intValue() == 80) {
                            m3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        D.g gVar = (D.g) obj;
                        M m4 = this.f1403b;
                        if (m4.H()) {
                            m4.m(gVar.f120a, false);
                            break;
                        }
                        break;
                    default:
                        D.h hVar = (D.h) obj;
                        M m5 = this.f1403b;
                        if (m5.H()) {
                            m5.r(hVar.f121a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1449r = new N.a(this) { // from class: Z.A

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ M f1403b;

            {
                this.f1403b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        M m2 = this.f1403b;
                        if (m2.H()) {
                            m2.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        M m3 = this.f1403b;
                        if (m3.H() && num.intValue() == 80) {
                            m3.l(false);
                            break;
                        }
                        break;
                    case 2:
                        D.g gVar = (D.g) obj;
                        M m4 = this.f1403b;
                        if (m4.H()) {
                            m4.m(gVar.f120a, false);
                            break;
                        }
                        break;
                    default:
                        D.h hVar = (D.h) obj;
                        M m5 = this.f1403b;
                        if (m5.H()) {
                            m5.r(hVar.f121a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1450s = new E(this);
        this.f1451t = -1;
        this.f1456y = new F(this);
        this.f1457z = new S0.e(16);
        this.f1425D = new ArrayDeque();
        this.f1434N = new B0.j(7, this);
    }

    public static boolean G(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        abstractComponentCallbacksC0070s.getClass();
        Iterator it = abstractComponentCallbacksC0070s.f1616u.f1437c.i().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) it.next();
            if (abstractComponentCallbacksC0070s2 != null) {
                z2 = G(abstractComponentCallbacksC0070s2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (abstractComponentCallbacksC0070s == null) {
            return true;
        }
        return abstractComponentCallbacksC0070s.f1581C && (abstractComponentCallbacksC0070s.f1614s == null || I(abstractComponentCallbacksC0070s.f1617v));
    }

    public static boolean J(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (abstractComponentCallbacksC0070s == null) {
            return true;
        }
        M m2 = abstractComponentCallbacksC0070s.f1614s;
        return abstractComponentCallbacksC0070s.equals(m2.f1455x) && J(m2.f1454w);
    }

    public static void Z(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0070s);
        }
        if (abstractComponentCallbacksC0070s.f1621z) {
            abstractComponentCallbacksC0070s.f1621z = false;
            abstractComponentCallbacksC0070s.J = !abstractComponentCallbacksC0070s.J;
        }
    }

    public final AbstractComponentCallbacksC0070s A(int i) {
        B.k kVar = this.f1437c;
        ArrayList arrayList = (ArrayList) kVar.f30c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) arrayList.get(size);
            if (abstractComponentCallbacksC0070s != null && abstractComponentCallbacksC0070s.f1618w == i) {
                return abstractComponentCallbacksC0070s;
            }
        }
        for (T t2 : ((HashMap) kVar.f28a).values()) {
            if (t2 != null) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = t2.f1485c;
                if (abstractComponentCallbacksC0070s2.f1618w == i) {
                    return abstractComponentCallbacksC0070s2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0070s B(String str) {
        B.k kVar = this.f1437c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) kVar.f30c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) arrayList.get(size);
                if (abstractComponentCallbacksC0070s != null && str.equals(abstractComponentCallbacksC0070s.f1620y)) {
                    return abstractComponentCallbacksC0070s;
                }
            }
        }
        if (str != null) {
            for (T t2 : ((HashMap) kVar.f28a).values()) {
                if (t2 != null) {
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = t2.f1485c;
                    if (str.equals(abstractComponentCallbacksC0070s2.f1620y)) {
                        return abstractComponentCallbacksC0070s2;
                    }
                }
            }
        } else {
            kVar.getClass();
        }
        return null;
    }

    public final ViewGroup C(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0070s.f1583E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0070s.f1619x > 0 && this.f1453v.Y()) {
            View X2 = this.f1453v.X(abstractComponentCallbacksC0070s.f1619x);
            if (X2 instanceof ViewGroup) {
                return (ViewGroup) X2;
            }
        }
        return null;
    }

    public final F D() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1454w;
        return abstractComponentCallbacksC0070s != null ? abstractComponentCallbacksC0070s.f1614s.D() : this.f1456y;
    }

    public final S0.e E() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1454w;
        return abstractComponentCallbacksC0070s != null ? abstractComponentCallbacksC0070s.f1614s.E() : this.f1457z;
    }

    public final void F(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0070s);
        }
        if (abstractComponentCallbacksC0070s.f1621z) {
            return;
        }
        abstractComponentCallbacksC0070s.f1621z = true;
        abstractComponentCallbacksC0070s.J = true ^ abstractComponentCallbacksC0070s.J;
        Y(abstractComponentCallbacksC0070s);
    }

    public final boolean H() {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1454w;
        if (abstractComponentCallbacksC0070s == null) {
            return true;
        }
        return abstractComponentCallbacksC0070s.n() && this.f1454w.j().H();
    }

    public final boolean K() {
        return this.f1427F || this.f1428G;
    }

    public final void L(int i, boolean z2) {
        HashMap hashMap;
        C0074w c0074w;
        if (this.f1452u == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1451t) {
            this.f1451t = i;
            B.k kVar = this.f1437c;
            Iterator it = ((ArrayList) kVar.f30c).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) kVar.f28a;
                if (!hasNext) {
                    break;
                }
                T t2 = (T) hashMap.get(((AbstractComponentCallbacksC0070s) it.next()).e);
                if (t2 != null) {
                    t2.k();
                }
            }
            for (T t3 : hashMap.values()) {
                if (t3 != null) {
                    t3.k();
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t3.f1485c;
                    if (abstractComponentCallbacksC0070s.f1607l && !abstractComponentCallbacksC0070s.p()) {
                        if (abstractComponentCallbacksC0070s.f1608m && !((HashMap) kVar.f29b).containsKey(abstractComponentCallbacksC0070s.e)) {
                            kVar.o(t3.o(), abstractComponentCallbacksC0070s.e);
                        }
                        kVar.l(t3);
                    }
                }
            }
            a0();
            if (this.f1426E && (c0074w = this.f1452u) != null && this.f1451t == 7) {
                c0074w.e.invalidateOptionsMenu();
                this.f1426E = false;
            }
        }
    }

    public final void M() {
        if (this.f1452u == null) {
            return;
        }
        this.f1427F = false;
        this.f1428G = false;
        this.f1433M.f1471g = false;
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                abstractComponentCallbacksC0070s.f1616u.M();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i, int i2) {
        x(false);
        w(true);
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1455x;
        if (abstractComponentCallbacksC0070s != null && i < 0 && abstractComponentCallbacksC0070s.g().N()) {
            return true;
        }
        boolean P2 = P(this.J, this.f1431K, null, i, i2);
        if (P2) {
            this.f1436b = true;
            try {
                R(this.J, this.f1431K);
            } finally {
                d();
            }
        }
        c0();
        if (this.f1430I) {
            this.f1430I = false;
            a0();
        }
        ((HashMap) this.f1437c.f28a).values().removeAll(Collections.singleton(null));
        return P2;
    }

    public final boolean P(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int z2 = z(str, i, (i2 & 1) != 0);
        if (z2 < 0) {
            return false;
        }
        for (int size = this.f1438d.size() - 1; size >= z2; size--) {
            arrayList.add((C0053a) this.f1438d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0070s + " nesting=" + abstractComponentCallbacksC0070s.f1613r);
        }
        boolean p2 = abstractComponentCallbacksC0070s.p();
        if (abstractComponentCallbacksC0070s.f1579A && p2) {
            return;
        }
        B.k kVar = this.f1437c;
        synchronized (((ArrayList) kVar.f30c)) {
            ((ArrayList) kVar.f30c).remove(abstractComponentCallbacksC0070s);
        }
        abstractComponentCallbacksC0070s.f1606k = false;
        if (G(abstractComponentCallbacksC0070s)) {
            this.f1426E = true;
        }
        abstractComponentCallbacksC0070s.f1607l = true;
        Y(abstractComponentCallbacksC0070s);
    }

    public final void R(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0053a) arrayList.get(i)).f1523p) {
                if (i2 != i) {
                    y(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0053a) arrayList.get(i2)).f1523p) {
                        i2++;
                    }
                }
                y(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            y(arrayList, arrayList2, i2, size);
        }
    }

    public final void S(Bundle bundle) {
        F.i iVar;
        T t2;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1452u.f1629b.getClassLoader());
                this.f1442k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1452u.f1629b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        B.k kVar = this.f1437c;
        HashMap hashMap2 = (HashMap) kVar.f29b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        N n2 = (N) bundle.getParcelable("state");
        if (n2 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) kVar.f28a;
        hashMap3.clear();
        Iterator it = n2.f1458a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iVar = this.f1444m;
            if (!hasNext) {
                break;
            }
            Bundle o2 = kVar.o(null, (String) it.next());
            if (o2 != null) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) this.f1433M.f1467b.get(((S) o2.getParcelable("state")).f1473b);
                if (abstractComponentCallbacksC0070s != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0070s);
                    }
                    t2 = new T(iVar, kVar, abstractComponentCallbacksC0070s, o2);
                } else {
                    t2 = new T(this.f1444m, this.f1437c, this.f1452u.f1629b.getClassLoader(), D(), o2);
                }
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = t2.f1485c;
                abstractComponentCallbacksC0070s2.f1600b = o2;
                abstractComponentCallbacksC0070s2.f1614s = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0070s2.e + "): " + abstractComponentCallbacksC0070s2);
                }
                t2.m(this.f1452u.f1629b.getClassLoader());
                kVar.k(t2);
                t2.e = this.f1451t;
            }
        }
        P p2 = this.f1433M;
        p2.getClass();
        Iterator it2 = new ArrayList(p2.f1467b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = (AbstractComponentCallbacksC0070s) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0070s3.e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0070s3 + " that was not found in the set of active Fragments " + n2.f1458a);
                }
                this.f1433M.f(abstractComponentCallbacksC0070s3);
                abstractComponentCallbacksC0070s3.f1614s = this;
                T t3 = new T(iVar, kVar, abstractComponentCallbacksC0070s3);
                t3.e = 1;
                t3.k();
                abstractComponentCallbacksC0070s3.f1607l = true;
                t3.k();
            }
        }
        ArrayList<String> arrayList = n2.f1459b;
        ((ArrayList) kVar.f30c).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0070s d2 = kVar.d(str3);
                if (d2 == null) {
                    throw new IllegalStateException(D1.h.g("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + d2);
                }
                kVar.a(d2);
            }
        }
        if (n2.f1460c != null) {
            this.f1438d = new ArrayList(n2.f1460c.length);
            int i = 0;
            while (true) {
                C0054b[] c0054bArr = n2.f1460c;
                if (i >= c0054bArr.length) {
                    break;
                }
                C0054b c0054b = c0054bArr[i];
                c0054b.getClass();
                C0053a c0053a = new C0053a(this);
                c0054b.a(c0053a);
                c0053a.f1526s = c0054b.f1533g;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = c0054b.f1529b;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((U) c0053a.f1511a.get(i2)).f1488b = kVar.d(str4);
                    }
                    i2++;
                }
                c0053a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + c0053a.f1526s + "): " + c0053a);
                    PrintWriter printWriter = new PrintWriter(new W());
                    c0053a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1438d.add(c0053a);
                i++;
            }
        } else {
            this.f1438d = null;
        }
        this.i.set(n2.f1461d);
        String str5 = n2.e;
        if (str5 != null) {
            AbstractComponentCallbacksC0070s d3 = kVar.d(str5);
            this.f1455x = d3;
            q(d3);
        }
        ArrayList arrayList3 = n2.f1462f;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.j.put((String) arrayList3.get(i3), (C0055c) n2.f1463g.get(i3));
            }
        }
        this.f1425D = new ArrayDeque(n2.f1464h);
    }

    public final Bundle T() {
        int i;
        ArrayList arrayList;
        C0054b[] c0054bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0063k c0063k = (C0063k) it.next();
            if (c0063k.e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0063k.e = false;
                c0063k.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0063k) it2.next()).f();
        }
        x(true);
        this.f1427F = true;
        this.f1433M.f1471g = true;
        B.k kVar = this.f1437c;
        kVar.getClass();
        HashMap hashMap = (HashMap) kVar.f28a;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (T t2 : hashMap.values()) {
            if (t2 != null) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
                kVar.o(t2.o(), abstractComponentCallbacksC0070s.e);
                arrayList2.add(abstractComponentCallbacksC0070s.e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0070s + ": " + abstractComponentCallbacksC0070s.f1600b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f1437c.f29b;
        if (!hashMap2.isEmpty()) {
            B.k kVar2 = this.f1437c;
            synchronized (((ArrayList) kVar2.f30c)) {
                try {
                    if (((ArrayList) kVar2.f30c).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) kVar2.f30c).size());
                        Iterator it3 = ((ArrayList) kVar2.f30c).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) it3.next();
                            arrayList.add(abstractComponentCallbacksC0070s2.e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0070s2.e + "): " + abstractComponentCallbacksC0070s2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f1438d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0054bArr = null;
            } else {
                c0054bArr = new C0054b[size];
                for (i = 0; i < size; i++) {
                    c0054bArr[i] = new C0054b((C0053a) this.f1438d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1438d.get(i));
                    }
                }
            }
            N n2 = new N();
            n2.e = null;
            ArrayList arrayList4 = new ArrayList();
            n2.f1462f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            n2.f1463g = arrayList5;
            n2.f1458a = arrayList2;
            n2.f1459b = arrayList;
            n2.f1460c = c0054bArr;
            n2.f1461d = this.i.get();
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = this.f1455x;
            if (abstractComponentCallbacksC0070s3 != null) {
                n2.e = abstractComponentCallbacksC0070s3.e;
            }
            arrayList4.addAll(this.j.keySet());
            arrayList5.addAll(this.j.values());
            n2.f1464h = new ArrayList(this.f1425D);
            bundle.putParcelable("state", n2);
            for (String str : this.f1442k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f1442k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void U() {
        synchronized (this.f1435a) {
            try {
                if (this.f1435a.size() == 1) {
                    this.f1452u.f1630c.removeCallbacks(this.f1434N);
                    this.f1452u.f1630c.post(this.f1434N);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, boolean z2) {
        ViewGroup C2 = C(abstractComponentCallbacksC0070s);
        if (C2 == null || !(C2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) C2).setDrawDisappearingViewsLast(!z2);
    }

    public final void W(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, EnumC0097n enumC0097n) {
        if (abstractComponentCallbacksC0070s.equals(this.f1437c.d(abstractComponentCallbacksC0070s.e)) && (abstractComponentCallbacksC0070s.f1615t == null || abstractComponentCallbacksC0070s.f1614s == this)) {
            abstractComponentCallbacksC0070s.f1591N = enumC0097n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0070s + " is not an active fragment of FragmentManager " + this);
    }

    public final void X(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (abstractComponentCallbacksC0070s != null) {
            if (!abstractComponentCallbacksC0070s.equals(this.f1437c.d(abstractComponentCallbacksC0070s.e)) || (abstractComponentCallbacksC0070s.f1615t != null && abstractComponentCallbacksC0070s.f1614s != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0070s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = this.f1455x;
        this.f1455x = abstractComponentCallbacksC0070s;
        q(abstractComponentCallbacksC0070s2);
        q(this.f1455x);
    }

    public final void Y(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        ViewGroup C2 = C(abstractComponentCallbacksC0070s);
        if (C2 != null) {
            r rVar = abstractComponentCallbacksC0070s.f1587I;
            if ((rVar == null ? 0 : rVar.e) + (rVar == null ? 0 : rVar.f1573d) + (rVar == null ? 0 : rVar.f1572c) + (rVar == null ? 0 : rVar.f1571b) > 0) {
                if (C2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    C2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0070s);
                }
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) C2.getTag(R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0070s.f1587I;
                boolean z2 = rVar2 != null ? rVar2.f1570a : false;
                if (abstractComponentCallbacksC0070s2.f1587I == null) {
                    return;
                }
                abstractComponentCallbacksC0070s2.f().f1570a = z2;
            }
        }
    }

    public final T a(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        String str = abstractComponentCallbacksC0070s.f1590M;
        if (str != null) {
            AbstractC0082d.c(abstractComponentCallbacksC0070s, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0070s);
        }
        T f2 = f(abstractComponentCallbacksC0070s);
        abstractComponentCallbacksC0070s.f1614s = this;
        B.k kVar = this.f1437c;
        kVar.k(f2);
        if (!abstractComponentCallbacksC0070s.f1579A) {
            kVar.a(abstractComponentCallbacksC0070s);
            abstractComponentCallbacksC0070s.f1607l = false;
            if (abstractComponentCallbacksC0070s.f1584F == null) {
                abstractComponentCallbacksC0070s.J = false;
            }
            if (G(abstractComponentCallbacksC0070s)) {
                this.f1426E = true;
            }
        }
        return f2;
    }

    public final void a0() {
        Iterator it = this.f1437c.h().iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
            if (abstractComponentCallbacksC0070s.f1585G) {
                if (this.f1436b) {
                    this.f1430I = true;
                } else {
                    abstractComponentCallbacksC0070s.f1585G = false;
                    t2.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0074w c0074w, R.j jVar, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (this.f1452u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1452u = c0074w;
        this.f1453v = jVar;
        this.f1454w = abstractComponentCallbacksC0070s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1445n;
        if (abstractComponentCallbacksC0070s != 0) {
            copyOnWriteArrayList.add(new G(abstractComponentCallbacksC0070s));
        } else if (c0074w != null) {
            copyOnWriteArrayList.add(c0074w);
        }
        if (this.f1454w != null) {
            c0();
        }
        if (c0074w != null) {
            b.u i = c0074w.e.i();
            this.f1440g = i;
            i.a(abstractComponentCallbacksC0070s != 0 ? abstractComponentCallbacksC0070s : c0074w, this.f1441h);
        }
        if (abstractComponentCallbacksC0070s != 0) {
            P p2 = abstractComponentCallbacksC0070s.f1614s.f1433M;
            HashMap hashMap = p2.f1468c;
            P p3 = (P) hashMap.get(abstractComponentCallbacksC0070s.e);
            if (p3 == null) {
                p3 = new P(p2.e);
                hashMap.put(abstractComponentCallbacksC0070s.e, p3);
            }
            this.f1433M = p3;
        } else if (c0074w != null) {
            androidx.lifecycle.U c2 = c0074w.e.c();
            O o2 = P.f1466h;
            D1.i.e(c2, "store");
            C0120a c0120a = C0120a.f2339b;
            D1.i.e(c0120a, "defaultCreationExtras");
            M0.h hVar = new M0.h(c2, o2, c0120a);
            D1.e a2 = D1.o.a(P.class);
            String t2 = R.j.t(a2);
            if (t2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f1433M = (P) hVar.f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2));
        } else {
            this.f1433M = new P(false);
        }
        this.f1433M.f1471g = K();
        this.f1437c.f31d = this.f1433M;
        C0074w c0074w2 = this.f1452u;
        if (c0074w2 != null && abstractComponentCallbacksC0070s == 0) {
            C0233d b2 = c0074w2.b();
            b2.f("android:support:fragments", new B(0, this));
            Bundle c3 = b2.c("android:support:fragments");
            if (c3 != null) {
                S(c3);
            }
        }
        C0074w c0074w3 = this.f1452u;
        if (c0074w3 != null) {
            AbstractActivityC0168i abstractActivityC0168i = c0074w3.e;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0070s != 0 ? D1.h.h(new StringBuilder(), abstractComponentCallbacksC0070s.e, ":") : "");
            String f2 = D1.h.f(str, "StartActivityForResult");
            H h2 = new H(2);
            C c4 = new C(this, 1);
            C0108d c0108d = abstractActivityC0168i.j;
            this.f1422A = c0108d.b(f2, h2, c4);
            this.f1423B = c0108d.b(D1.h.f(str, "StartIntentSenderForResult"), new H(0), new C(this, 2));
            this.f1424C = c0108d.b(D1.h.f(str, "RequestPermissions"), new H(1), new C(this, 0));
        }
        C0074w c0074w4 = this.f1452u;
        if (c0074w4 != null) {
            c0074w4.e.g(this.f1446o);
        }
        C0074w c0074w5 = this.f1452u;
        if (c0074w5 != null) {
            c0074w5.e.f2289l.add(this.f1447p);
        }
        C0074w c0074w6 = this.f1452u;
        if (c0074w6 != null) {
            c0074w6.e.f2291n.add(this.f1448q);
        }
        C0074w c0074w7 = this.f1452u;
        if (c0074w7 != null) {
            c0074w7.e.f2292o.add(this.f1449r);
        }
        C0074w c0074w8 = this.f1452u;
        if (c0074w8 == null || abstractComponentCallbacksC0070s != 0) {
            return;
        }
        AbstractActivityC0168i abstractActivityC0168i2 = c0074w8.e;
        E e = this.f1450s;
        M0.h hVar2 = abstractActivityC0168i2.f2283c;
        ((CopyOnWriteArrayList) hVar2.f617c).add(e);
        ((Runnable) hVar2.f616b).run();
    }

    public final void b0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new W());
        C0074w c0074w = this.f1452u;
        if (c0074w == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            c0074w.e.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void c(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0070s);
        }
        if (abstractComponentCallbacksC0070s.f1579A) {
            abstractComponentCallbacksC0070s.f1579A = false;
            if (abstractComponentCallbacksC0070s.f1606k) {
                return;
            }
            this.f1437c.a(abstractComponentCallbacksC0070s);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0070s);
            }
            if (G(abstractComponentCallbacksC0070s)) {
                this.f1426E = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.f1435a) {
            try {
                if (!this.f1435a.isEmpty()) {
                    this.f1441h.b(true);
                    return;
                }
                D d2 = this.f1441h;
                ArrayList arrayList = this.f1438d;
                d2.b((arrayList != null ? arrayList.size() : 0) > 0 && J(this.f1454w));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f1436b = false;
        this.f1431K.clear();
        this.J.clear();
    }

    public final HashSet e() {
        C0063k c0063k;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1437c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((T) it.next()).f1485c.f1583E;
            if (viewGroup != null) {
                D1.i.e(E(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0063k) {
                    c0063k = (C0063k) tag;
                } else {
                    c0063k = new C0063k(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0063k);
                }
                hashSet.add(c0063k);
            }
        }
        return hashSet;
    }

    public final T f(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        String str = abstractComponentCallbacksC0070s.e;
        B.k kVar = this.f1437c;
        T t2 = (T) ((HashMap) kVar.f28a).get(str);
        if (t2 != null) {
            return t2;
        }
        T t3 = new T(this.f1444m, kVar, abstractComponentCallbacksC0070s);
        t3.m(this.f1452u.f1629b.getClassLoader());
        t3.e = this.f1451t;
        return t3;
    }

    public final void g(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0070s);
        }
        if (abstractComponentCallbacksC0070s.f1579A) {
            return;
        }
        abstractComponentCallbacksC0070s.f1579A = true;
        if (abstractComponentCallbacksC0070s.f1606k) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0070s);
            }
            B.k kVar = this.f1437c;
            synchronized (((ArrayList) kVar.f30c)) {
                ((ArrayList) kVar.f30c).remove(abstractComponentCallbacksC0070s);
            }
            abstractComponentCallbacksC0070s.f1606k = false;
            if (G(abstractComponentCallbacksC0070s)) {
                this.f1426E = true;
            }
            Y(abstractComponentCallbacksC0070s);
        }
    }

    public final void h(boolean z2) {
        if (z2 && this.f1452u != null) {
            b0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                abstractComponentCallbacksC0070s.f1582D = true;
                if (z2) {
                    abstractComponentCallbacksC0070s.f1616u.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f1451t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                if (!abstractComponentCallbacksC0070s.f1621z ? abstractComponentCallbacksC0070s.f1616u.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1451t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null && I(abstractComponentCallbacksC0070s)) {
                if (!abstractComponentCallbacksC0070s.f1621z ? abstractComponentCallbacksC0070s.f1616u.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0070s);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) this.e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0070s2)) {
                    abstractComponentCallbacksC0070s2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void k() {
        boolean z2 = true;
        this.f1429H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0063k) it.next()).f();
        }
        C0074w c0074w = this.f1452u;
        B.k kVar = this.f1437c;
        if (c0074w != null) {
            z2 = ((P) kVar.f31d).f1470f;
        } else {
            AbstractActivityC0168i abstractActivityC0168i = c0074w.f1629b;
            if (abstractActivityC0168i != null) {
                z2 = true ^ abstractActivityC0168i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C0055c) it2.next()).f1539a.iterator();
                while (it3.hasNext()) {
                    ((P) kVar.f31d).d((String) it3.next(), false);
                }
            }
        }
        t(-1);
        C0074w c0074w2 = this.f1452u;
        if (c0074w2 != null) {
            AbstractActivityC0168i abstractActivityC0168i2 = c0074w2.e;
            abstractActivityC0168i2.f2289l.remove(this.f1447p);
        }
        C0074w c0074w3 = this.f1452u;
        if (c0074w3 != null) {
            AbstractActivityC0168i abstractActivityC0168i3 = c0074w3.e;
            abstractActivityC0168i3.f2288k.remove(this.f1446o);
        }
        C0074w c0074w4 = this.f1452u;
        if (c0074w4 != null) {
            AbstractActivityC0168i abstractActivityC0168i4 = c0074w4.e;
            abstractActivityC0168i4.f2291n.remove(this.f1448q);
        }
        C0074w c0074w5 = this.f1452u;
        if (c0074w5 != null) {
            AbstractActivityC0168i abstractActivityC0168i5 = c0074w5.e;
            abstractActivityC0168i5.f2292o.remove(this.f1449r);
        }
        C0074w c0074w6 = this.f1452u;
        if (c0074w6 != null && this.f1454w == null) {
            AbstractActivityC0168i abstractActivityC0168i6 = c0074w6.e;
            E e = this.f1450s;
            M0.h hVar = abstractActivityC0168i6.f2283c;
            ((CopyOnWriteArrayList) hVar.f617c).remove(e);
            if (((HashMap) hVar.f618d).remove(e) != null) {
                throw new ClassCastException();
            }
            ((Runnable) hVar.f616b).run();
        }
        this.f1452u = null;
        this.f1453v = null;
        this.f1454w = null;
        if (this.f1440g != null) {
            Iterator it4 = this.f1441h.f2302b.iterator();
            while (it4.hasNext()) {
                ((InterfaceC0107c) it4.next()).cancel();
            }
            this.f1440g = null;
        }
        F.i iVar = this.f1422A;
        if (iVar != null) {
            iVar.J();
            this.f1423B.J();
            this.f1424C.J();
        }
    }

    public final void l(boolean z2) {
        if (z2 && this.f1452u != null) {
            b0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                abstractComponentCallbacksC0070s.f1582D = true;
                if (z2) {
                    abstractComponentCallbacksC0070s.f1616u.l(true);
                }
            }
        }
    }

    public final void m(boolean z2, boolean z3) {
        if (z3 && this.f1452u != null) {
            b0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null && z3) {
                abstractComponentCallbacksC0070s.f1616u.m(z2, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f1437c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) it.next();
            if (abstractComponentCallbacksC0070s != null) {
                abstractComponentCallbacksC0070s.o();
                abstractComponentCallbacksC0070s.f1616u.n();
            }
        }
    }

    public final boolean o() {
        if (this.f1451t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                if (!abstractComponentCallbacksC0070s.f1621z ? abstractComponentCallbacksC0070s.f1616u.o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1451t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null && !abstractComponentCallbacksC0070s.f1621z) {
                abstractComponentCallbacksC0070s.f1616u.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        if (abstractComponentCallbacksC0070s != null) {
            if (abstractComponentCallbacksC0070s.equals(this.f1437c.d(abstractComponentCallbacksC0070s.e))) {
                abstractComponentCallbacksC0070s.f1614s.getClass();
                boolean J = J(abstractComponentCallbacksC0070s);
                Boolean bool = abstractComponentCallbacksC0070s.j;
                if (bool == null || bool.booleanValue() != J) {
                    abstractComponentCallbacksC0070s.j = Boolean.valueOf(J);
                    M m2 = abstractComponentCallbacksC0070s.f1616u;
                    m2.c0();
                    m2.q(m2.f1455x);
                }
            }
        }
    }

    public final void r(boolean z2, boolean z3) {
        if (z3 && this.f1452u != null) {
            b0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null && z3) {
                abstractComponentCallbacksC0070s.f1616u.r(z2, true);
            }
        }
    }

    public final boolean s() {
        if (this.f1451t < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : this.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null && I(abstractComponentCallbacksC0070s)) {
                if (!abstractComponentCallbacksC0070s.f1621z ? abstractComponentCallbacksC0070s.f1616u.s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t(int i) {
        try {
            this.f1436b = true;
            for (T t2 : ((HashMap) this.f1437c.f28a).values()) {
                if (t2 != null) {
                    t2.e = i;
                }
            }
            L(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0063k) it.next()).f();
            }
            this.f1436b = false;
            x(true);
        } catch (Throwable th) {
            this.f1436b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1454w;
        if (abstractComponentCallbacksC0070s != null) {
            sb.append(abstractComponentCallbacksC0070s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1454w)));
            sb.append("}");
        } else {
            C0074w c0074w = this.f1452u;
            if (c0074w != null) {
                sb.append(c0074w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1452u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String f2 = D1.h.f(str, "    ");
        B.k kVar = this.f1437c;
        kVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) kVar.f28a;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (T t2 : hashMap.values()) {
                printWriter.print(str);
                if (t2 != null) {
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
                    printWriter.println(abstractComponentCallbacksC0070s);
                    abstractComponentCallbacksC0070s.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0070s.f1618w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0070s.f1619x));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0070s.f1620y);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1599a);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0070s.e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0070s.f1613r);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1606k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1607l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1609n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0070s.f1610o);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1621z);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1579A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1581C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0070s.f1580B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0070s.f1586H);
                    if (abstractComponentCallbacksC0070s.f1614s != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1614s);
                    }
                    if (abstractComponentCallbacksC0070s.f1615t != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1615t);
                    }
                    if (abstractComponentCallbacksC0070s.f1617v != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1617v);
                    }
                    if (abstractComponentCallbacksC0070s.f1603f != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1603f);
                    }
                    if (abstractComponentCallbacksC0070s.f1600b != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1600b);
                    }
                    if (abstractComponentCallbacksC0070s.f1601c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1601c);
                    }
                    if (abstractComponentCallbacksC0070s.f1602d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1602d);
                    }
                    Object obj = abstractComponentCallbacksC0070s.f1604g;
                    if (obj == null) {
                        M m2 = abstractComponentCallbacksC0070s.f1614s;
                        obj = (m2 == null || (str2 = abstractComponentCallbacksC0070s.f1605h) == null) ? null : m2.f1437c.d(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0070s.i);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0070s.f1587I;
                    printWriter.println(rVar == null ? false : rVar.f1570a);
                    r rVar2 = abstractComponentCallbacksC0070s.f1587I;
                    if ((rVar2 == null ? 0 : rVar2.f1571b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0070s.f1587I;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f1571b);
                    }
                    r rVar4 = abstractComponentCallbacksC0070s.f1587I;
                    if ((rVar4 == null ? 0 : rVar4.f1572c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0070s.f1587I;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f1572c);
                    }
                    r rVar6 = abstractComponentCallbacksC0070s.f1587I;
                    if ((rVar6 == null ? 0 : rVar6.f1573d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0070s.f1587I;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f1573d);
                    }
                    r rVar8 = abstractComponentCallbacksC0070s.f1587I;
                    if ((rVar8 == null ? 0 : rVar8.e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0070s.f1587I;
                        printWriter.println(rVar9 == null ? 0 : rVar9.e);
                    }
                    if (abstractComponentCallbacksC0070s.f1583E != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1583E);
                    }
                    if (abstractComponentCallbacksC0070s.f1584F != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0070s.f1584F);
                    }
                    if (abstractComponentCallbacksC0070s.h() != null) {
                        androidx.lifecycle.U c2 = abstractComponentCallbacksC0070s.c();
                        O o2 = C0128a.f2836c;
                        D1.i.e(c2, "store");
                        C0120a c0120a = C0120a.f2339b;
                        D1.i.e(c0120a, "defaultCreationExtras");
                        M0.h hVar = new M0.h(c2, o2, c0120a);
                        D1.e a2 = D1.o.a(C0128a.class);
                        String t3 = R.j.t(a2);
                        if (t3 == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        C0343k c0343k = ((C0128a) hVar.f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t3))).f2837b;
                        if (c0343k.e() > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (c0343k.e() > 0) {
                                if (c0343k.f(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(c0343k.c(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0070s.f1616u + ":");
                    abstractComponentCallbacksC0070s.f1616u.u(D1.h.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) kVar.f30c;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = (AbstractComponentCallbacksC0070s) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0070s2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = (AbstractComponentCallbacksC0070s) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0070s3.toString());
            }
        }
        ArrayList arrayList3 = this.f1438d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0053a c0053a = (C0053a) this.f1438d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0053a.toString());
                c0053a.f(f2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1435a) {
            try {
                int size4 = this.f1435a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (J) this.f1435a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1452u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1453v);
        if (this.f1454w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1454w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1451t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1427F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1428G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1429H);
        if (this.f1426E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1426E);
        }
    }

    public final void v(J j, boolean z2) {
        if (!z2) {
            if (this.f1452u == null) {
                if (!this.f1429H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (K()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1435a) {
            try {
                if (this.f1452u == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1435a.add(j);
                    U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z2) {
        if (this.f1436b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1452u == null) {
            if (!this.f1429H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1452u.f1630c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && K()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.J == null) {
            this.J = new ArrayList();
            this.f1431K = new ArrayList();
        }
    }

    public final boolean x(boolean z2) {
        boolean z3;
        w(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.J;
            ArrayList arrayList2 = this.f1431K;
            synchronized (this.f1435a) {
                if (this.f1435a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1435a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((J) this.f1435a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                break;
            }
            z4 = true;
            this.f1436b = true;
            try {
                R(this.J, this.f1431K);
            } finally {
                d();
            }
        }
        c0();
        if (this.f1430I) {
            this.f1430I = false;
            a0();
        }
        ((HashMap) this.f1437c.f28a).values().removeAll(Collections.singleton(null));
        return z4;
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        ViewGroup viewGroup;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        Object obj2;
        h0.k kVar;
        boolean z2;
        Iterator it;
        Object obj3;
        String str;
        Iterator it2;
        h0.k kVar2;
        Object obj4;
        ArrayList arrayList4;
        B.k kVar3;
        B.k kVar4;
        B.k kVar5;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        boolean z3 = ((C0053a) arrayList5.get(i)).f1523p;
        ArrayList arrayList7 = this.f1432L;
        if (arrayList7 == null) {
            this.f1432L = new ArrayList();
        } else {
            arrayList7.clear();
        }
        ArrayList arrayList8 = this.f1432L;
        B.k kVar6 = this.f1437c;
        arrayList8.addAll(kVar6.j());
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.f1455x;
        int i6 = i;
        boolean z4 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                B.k kVar7 = kVar6;
                this.f1432L.clear();
                if (!z3 && this.f1451t >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it3 = ((C0053a) arrayList.get(i8)).f1511a.iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s2 = ((U) it3.next()).f1488b;
                            if (abstractComponentCallbacksC0070s2 == null || abstractComponentCallbacksC0070s2.f1614s == null) {
                                kVar3 = kVar7;
                            } else {
                                kVar3 = kVar7;
                                kVar3.k(f(abstractComponentCallbacksC0070s2));
                            }
                            kVar7 = kVar3;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0053a c0053a = (C0053a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0053a.c(-1);
                        ArrayList arrayList9 = c0053a.f1511a;
                        for (int size = arrayList9.size() - 1; size >= 0; size--) {
                            U u2 = (U) arrayList9.get(size);
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s3 = u2.f1488b;
                            if (abstractComponentCallbacksC0070s3 != null) {
                                abstractComponentCallbacksC0070s3.f1608m = c0053a.f1527t;
                                if (abstractComponentCallbacksC0070s3.f1587I != null) {
                                    abstractComponentCallbacksC0070s3.f().f1570a = true;
                                }
                                int i10 = c0053a.f1515f;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 4100;
                                        i12 = 8197;
                                        if (i10 != 8197) {
                                            if (i10 == 4099) {
                                                i11 = 4099;
                                            } else if (i10 != 4100) {
                                                i11 = 0;
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                if (abstractComponentCallbacksC0070s3.f1587I != null || i11 != 0) {
                                    abstractComponentCallbacksC0070s3.f();
                                    abstractComponentCallbacksC0070s3.f1587I.f1574f = i11;
                                }
                                abstractComponentCallbacksC0070s3.f();
                                abstractComponentCallbacksC0070s3.f1587I.getClass();
                            }
                            int i13 = u2.f1487a;
                            M m2 = c0053a.f1524q;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.V(abstractComponentCallbacksC0070s3, true);
                                    m2.Q(abstractComponentCallbacksC0070s3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u2.f1487a);
                                case 3:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.a(abstractComponentCallbacksC0070s3);
                                case 4:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.getClass();
                                    Z(abstractComponentCallbacksC0070s3);
                                case 5:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.V(abstractComponentCallbacksC0070s3, true);
                                    m2.F(abstractComponentCallbacksC0070s3);
                                case 6:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.c(abstractComponentCallbacksC0070s3);
                                case 7:
                                    abstractComponentCallbacksC0070s3.K(u2.f1490d, u2.e, u2.f1491f, u2.f1492g);
                                    m2.V(abstractComponentCallbacksC0070s3, true);
                                    m2.g(abstractComponentCallbacksC0070s3);
                                case 8:
                                    m2.X(null);
                                case 9:
                                    m2.X(abstractComponentCallbacksC0070s3);
                                case 10:
                                    m2.W(abstractComponentCallbacksC0070s3, u2.f1493h);
                            }
                        }
                    } else {
                        c0053a.c(1);
                        ArrayList arrayList10 = c0053a.f1511a;
                        int size2 = arrayList10.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            U u3 = (U) arrayList10.get(i14);
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s4 = u3.f1488b;
                            if (abstractComponentCallbacksC0070s4 != null) {
                                abstractComponentCallbacksC0070s4.f1608m = c0053a.f1527t;
                                if (abstractComponentCallbacksC0070s4.f1587I != null) {
                                    abstractComponentCallbacksC0070s4.f().f1570a = false;
                                }
                                int i15 = c0053a.f1515f;
                                if (abstractComponentCallbacksC0070s4.f1587I != null || i15 != 0) {
                                    abstractComponentCallbacksC0070s4.f();
                                    abstractComponentCallbacksC0070s4.f1587I.f1574f = i15;
                                }
                                abstractComponentCallbacksC0070s4.f();
                                abstractComponentCallbacksC0070s4.f1587I.getClass();
                            }
                            int i16 = u3.f1487a;
                            M m3 = c0053a.f1524q;
                            switch (i16) {
                                case 1:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.V(abstractComponentCallbacksC0070s4, false);
                                    m3.a(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u3.f1487a);
                                case 3:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.Q(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 4:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.F(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 5:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.V(abstractComponentCallbacksC0070s4, false);
                                    Z(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 6:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.g(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 7:
                                    arrayList4 = arrayList10;
                                    abstractComponentCallbacksC0070s4.K(u3.f1490d, u3.e, u3.f1491f, u3.f1492g);
                                    m3.V(abstractComponentCallbacksC0070s4, false);
                                    m3.c(abstractComponentCallbacksC0070s4);
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 8:
                                    m3.X(abstractComponentCallbacksC0070s4);
                                    arrayList4 = arrayList10;
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 9:
                                    m3.X(null);
                                    arrayList4 = arrayList10;
                                    i14++;
                                    arrayList10 = arrayList4;
                                case 10:
                                    m3.W(abstractComponentCallbacksC0070s4, u3.i);
                                    arrayList4 = arrayList10;
                                    i14++;
                                    arrayList10 = arrayList4;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                if (z4 && (arrayList3 = this.f1443l) != null && !arrayList3.isEmpty()) {
                    LinkedHashSet<AbstractComponentCallbacksC0070s> linkedHashSet2 = new LinkedHashSet();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C0053a c0053a2 = (C0053a) it4.next();
                        HashSet hashSet = new HashSet();
                        for (int i17 = 0; i17 < c0053a2.f1511a.size(); i17++) {
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s5 = ((U) c0053a2.f1511a.get(i17)).f1488b;
                            if (abstractComponentCallbacksC0070s5 != null && c0053a2.f1516g) {
                                hashSet.add(abstractComponentCallbacksC0070s5);
                            }
                        }
                        linkedHashSet2.addAll(hashSet);
                    }
                    Iterator it5 = this.f1443l.iterator();
                    while (true) {
                        String str2 = "fragment";
                        if (it5.hasNext()) {
                            h0.k kVar8 = (h0.k) it5.next();
                            for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s6 : linkedHashSet2) {
                                kVar8.getClass();
                                D1.i.e(abstractComponentCallbacksC0070s6, "fragment");
                                if (booleanValue) {
                                    C0144i c0144i = kVar8.f3261a;
                                    List list = (List) ((O1.q) c0144i.e.f852a).f();
                                    it2 = it5;
                                    ListIterator listIterator = list.listIterator(list.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            Object previous = listIterator.previous();
                                            ListIterator listIterator2 = listIterator;
                                            obj4 = previous;
                                            if (!D1.i.a(((C0141f) previous).f2923f, abstractComponentCallbacksC0070s6.f1620y)) {
                                                listIterator = listIterator2;
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    C0141f c0141f = (C0141f) obj4;
                                    kVar8.f3262b.getClass();
                                    if (FragmentNavigator.n()) {
                                        kVar2 = kVar8;
                                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + abstractComponentCallbacksC0070s6 + " associated with entry " + c0141f);
                                    } else {
                                        kVar2 = kVar8;
                                    }
                                    if (c0141f != null) {
                                        O1.q qVar = c0144i.f2935c;
                                        qVar.g(u1.v.E((Set) qVar.f(), c0141f));
                                        if (!c0144i.f2939h.f3010g.contains(c0141f)) {
                                            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                                        }
                                        c0141f.f(EnumC0097n.f2041d);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    it2 = it5;
                                    kVar2 = kVar8;
                                }
                                it5 = it2;
                                kVar8 = kVar2;
                            }
                        } else {
                            Iterator it6 = this.f1443l.iterator();
                            while (it6.hasNext()) {
                                h0.k kVar9 = (h0.k) it6.next();
                                Iterator it7 = linkedHashSet2.iterator();
                                while (it7.hasNext()) {
                                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s7 = (AbstractComponentCallbacksC0070s) it7.next();
                                    kVar9.getClass();
                                    D1.i.e(abstractComponentCallbacksC0070s7, str2);
                                    C0144i c0144i2 = kVar9.f3261a;
                                    Iterator it8 = it6;
                                    ArrayList U2 = u1.g.U((Collection) ((O1.q) c0144i2.e.f852a).f(), (Iterable) ((O1.q) c0144i2.f2937f.f852a).f());
                                    ListIterator listIterator3 = U2.listIterator(U2.size());
                                    while (true) {
                                        if (listIterator3.hasPrevious()) {
                                            obj2 = listIterator3.previous();
                                            ListIterator listIterator4 = listIterator3;
                                            linkedHashSet = linkedHashSet2;
                                            if (!D1.i.a(((C0141f) obj2).f2923f, abstractComponentCallbacksC0070s7.f1620y)) {
                                                listIterator3 = listIterator4;
                                                linkedHashSet2 = linkedHashSet;
                                            }
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            obj2 = null;
                                        }
                                    }
                                    C0141f c0141f2 = (C0141f) obj2;
                                    FragmentNavigator fragmentNavigator = kVar9.f3262b;
                                    if (booleanValue && fragmentNavigator.f2079g.isEmpty() && abstractComponentCallbacksC0070s7.f1607l) {
                                        kVar = kVar9;
                                        z2 = true;
                                    } else {
                                        kVar = kVar9;
                                        z2 = false;
                                    }
                                    Iterator it9 = fragmentNavigator.f2079g.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            obj3 = it9.next();
                                            Iterator it10 = it9;
                                            it = it7;
                                            if (!D1.i.a(((t1.d) obj3).f4378a, abstractComponentCallbacksC0070s7.f1620y)) {
                                                it9 = it10;
                                                it7 = it;
                                            }
                                        } else {
                                            it = it7;
                                            obj3 = null;
                                        }
                                    }
                                    t1.d dVar = (t1.d) obj3;
                                    if (dVar != null) {
                                        fragmentNavigator.f2079g.remove(dVar);
                                    }
                                    if (z2 || !FragmentNavigator.n()) {
                                        str = str2;
                                    } else {
                                        str = str2;
                                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0070s7 + " associated with entry " + c0141f2);
                                    }
                                    boolean z5 = dVar != null && ((Boolean) dVar.f4379b).booleanValue();
                                    if (!booleanValue && !z5 && c0141f2 == null) {
                                        throw new IllegalArgumentException(("The fragment " + abstractComponentCallbacksC0070s7 + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                                    }
                                    if (c0141f2 != null) {
                                        fragmentNavigator.l(abstractComponentCallbacksC0070s7, c0141f2, c0144i2);
                                        if (z2) {
                                            if (FragmentNavigator.n()) {
                                                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + abstractComponentCallbacksC0070s7 + " popping associated entry " + c0141f2 + " via system back");
                                            }
                                            c0144i2.f(c0141f2, false);
                                            it6 = it8;
                                            kVar9 = kVar;
                                            linkedHashSet2 = linkedHashSet;
                                            str2 = str;
                                            it7 = it;
                                        }
                                    }
                                    it6 = it8;
                                    kVar9 = kVar;
                                    linkedHashSet2 = linkedHashSet;
                                    str2 = str;
                                    it7 = it;
                                }
                            }
                        }
                    }
                }
                for (int i18 = i; i18 < i2; i18++) {
                    C0053a c0053a3 = (C0053a) arrayList.get(i18);
                    if (booleanValue) {
                        for (int size3 = c0053a3.f1511a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s8 = ((U) c0053a3.f1511a.get(size3)).f1488b;
                            if (abstractComponentCallbacksC0070s8 != null) {
                                f(abstractComponentCallbacksC0070s8).k();
                            }
                        }
                    } else {
                        Iterator it11 = c0053a3.f1511a.iterator();
                        while (it11.hasNext()) {
                            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s9 = ((U) it11.next()).f1488b;
                            if (abstractComponentCallbacksC0070s9 != null) {
                                f(abstractComponentCallbacksC0070s9).k();
                            }
                        }
                    }
                }
                L(this.f1451t, true);
                HashSet hashSet2 = new HashSet();
                for (int i19 = i; i19 < i2; i19++) {
                    Iterator it12 = ((C0053a) arrayList.get(i19)).f1511a.iterator();
                    while (it12.hasNext()) {
                        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s10 = ((U) it12.next()).f1488b;
                        if (abstractComponentCallbacksC0070s10 != null && (viewGroup = abstractComponentCallbacksC0070s10.f1583E) != null) {
                            hashSet2.add(C0063k.g(viewGroup, this));
                        }
                    }
                }
                Iterator it13 = hashSet2.iterator();
                while (it13.hasNext()) {
                    C0063k c0063k = (C0063k) it13.next();
                    c0063k.f1562d = booleanValue;
                    synchronized (c0063k.f1560b) {
                        try {
                            c0063k.h();
                            ArrayList arrayList11 = c0063k.f1560b;
                            ListIterator listIterator5 = arrayList11.listIterator(arrayList11.size());
                            while (true) {
                                if (listIterator5.hasPrevious()) {
                                    obj = listIterator5.previous();
                                    Y y2 = (Y) obj;
                                    View view = y2.f1505c.f1584F;
                                    D1.i.d(view, "operation.fragment.mView");
                                    int f2 = R.j.f(view);
                                    if (y2.f1503a != 2 || f2 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c0063k.e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0063k.d();
                }
                for (int i20 = i; i20 < i2; i20++) {
                    C0053a c0053a4 = (C0053a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue() && c0053a4.f1526s >= 0) {
                        c0053a4.f1526s = -1;
                    }
                    c0053a4.getClass();
                }
                if (!z4 || this.f1443l == null) {
                    return;
                }
                for (int i21 = 0; i21 < this.f1443l.size(); i21++) {
                    ((h0.k) this.f1443l.get(i21)).getClass();
                }
                return;
            }
            C0053a c0053a5 = (C0053a) arrayList5.get(i6);
            if (((Boolean) arrayList6.get(i6)).booleanValue()) {
                kVar4 = kVar6;
                int i22 = 1;
                ArrayList arrayList12 = this.f1432L;
                ArrayList arrayList13 = c0053a5.f1511a;
                int size4 = arrayList13.size() - 1;
                while (size4 >= 0) {
                    U u4 = (U) arrayList13.get(size4);
                    int i23 = u4.f1487a;
                    if (i23 != i22) {
                        if (i23 != 3) {
                            switch (i23) {
                                case 8:
                                    abstractComponentCallbacksC0070s = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0070s = u4.f1488b;
                                    break;
                                case 10:
                                    u4.i = u4.f1493h;
                                    break;
                            }
                            size4--;
                            i22 = 1;
                        }
                        arrayList12.add(u4.f1488b);
                        size4--;
                        i22 = 1;
                    }
                    arrayList12.remove(u4.f1488b);
                    size4--;
                    i22 = 1;
                }
            } else {
                ArrayList arrayList14 = this.f1432L;
                int i24 = 0;
                while (true) {
                    ArrayList arrayList15 = c0053a5.f1511a;
                    if (i24 < arrayList15.size()) {
                        U u5 = (U) arrayList15.get(i24);
                        int i25 = u5.f1487a;
                        if (i25 != i7) {
                            if (i25 != 2) {
                                if (i25 == 3 || i25 == 6) {
                                    arrayList14.remove(u5.f1488b);
                                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s11 = u5.f1488b;
                                    if (abstractComponentCallbacksC0070s11 == abstractComponentCallbacksC0070s) {
                                        arrayList15.add(i24, new U(9, abstractComponentCallbacksC0070s11));
                                        i24++;
                                        kVar5 = kVar6;
                                        i3 = 1;
                                        abstractComponentCallbacksC0070s = null;
                                    }
                                } else if (i25 == 7) {
                                    kVar5 = kVar6;
                                    i3 = 1;
                                } else if (i25 == 8) {
                                    arrayList15.add(i24, new U(9, abstractComponentCallbacksC0070s, 0));
                                    u5.f1489c = true;
                                    i24++;
                                    abstractComponentCallbacksC0070s = u5.f1488b;
                                }
                                kVar5 = kVar6;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s12 = u5.f1488b;
                                int i26 = abstractComponentCallbacksC0070s12.f1619x;
                                int size5 = arrayList14.size() - 1;
                                boolean z6 = false;
                                while (size5 >= 0) {
                                    B.k kVar10 = kVar6;
                                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s13 = (AbstractComponentCallbacksC0070s) arrayList14.get(size5);
                                    if (abstractComponentCallbacksC0070s13.f1619x != i26) {
                                        i4 = i26;
                                    } else if (abstractComponentCallbacksC0070s13 == abstractComponentCallbacksC0070s12) {
                                        i4 = i26;
                                        z6 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0070s13 == abstractComponentCallbacksC0070s) {
                                            i4 = i26;
                                            arrayList15.add(i24, new U(9, abstractComponentCallbacksC0070s13, 0));
                                            i24++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0070s = null;
                                        } else {
                                            i4 = i26;
                                            i5 = 0;
                                        }
                                        U u6 = new U(3, abstractComponentCallbacksC0070s13, i5);
                                        u6.f1490d = u5.f1490d;
                                        u6.f1491f = u5.f1491f;
                                        u6.e = u5.e;
                                        u6.f1492g = u5.f1492g;
                                        arrayList15.add(i24, u6);
                                        arrayList14.remove(abstractComponentCallbacksC0070s13);
                                        i24++;
                                        abstractComponentCallbacksC0070s = abstractComponentCallbacksC0070s;
                                    }
                                    size5--;
                                    i26 = i4;
                                    kVar6 = kVar10;
                                }
                                kVar5 = kVar6;
                                i3 = 1;
                                if (z6) {
                                    arrayList15.remove(i24);
                                    i24--;
                                } else {
                                    u5.f1487a = 1;
                                    u5.f1489c = true;
                                    arrayList14.add(abstractComponentCallbacksC0070s12);
                                }
                            }
                            i24 += i3;
                            i7 = i3;
                            kVar6 = kVar5;
                        } else {
                            kVar5 = kVar6;
                            i3 = i7;
                        }
                        arrayList14.add(u5.f1488b);
                        i24 += i3;
                        i7 = i3;
                        kVar6 = kVar5;
                    } else {
                        kVar4 = kVar6;
                    }
                }
            }
            z4 = z4 || c0053a5.f1516g;
            i6++;
            arrayList5 = arrayList;
            arrayList6 = arrayList2;
            kVar6 = kVar4;
        }
    }

    public final int z(String str, int i, boolean z2) {
        ArrayList arrayList = this.f1438d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z2) {
                return 0;
            }
            return this.f1438d.size() - 1;
        }
        int size = this.f1438d.size() - 1;
        while (size >= 0) {
            C0053a c0053a = (C0053a) this.f1438d.get(size);
            if ((str != null && str.equals(c0053a.i)) || (i >= 0 && i == c0053a.f1526s)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z2) {
            if (size == this.f1438d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0053a c0053a2 = (C0053a) this.f1438d.get(size - 1);
            if ((str == null || !str.equals(c0053a2.i)) && (i < 0 || i != c0053a2.f1526s)) {
                return size;
            }
            size--;
        }
        return size;
    }
}
