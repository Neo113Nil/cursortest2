package androidx.fragment.app;

import D.C0295o;
import a.AbstractC0415a;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.InterfaceC0461c;
import androidx.lifecycle.EnumC0507o;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;
import f0.AbstractC4489d;
import g1.C4523c;
import g1.C4524d;
import i0.C4572b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC5051n;
import x0.C5202c;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: A, reason: collision with root package name */
    public e.h f4950A;

    /* renamed from: B, reason: collision with root package name */
    public e.h f4951B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f4952C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4953D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4954E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4955F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4956G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4957H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f4958I;
    public ArrayList J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f4959K;

    /* renamed from: L, reason: collision with root package name */
    public S f4960L;

    /* renamed from: M, reason: collision with root package name */
    public final F3.C f4961M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4963b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4965d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4966e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.G f4968g;

    /* renamed from: l, reason: collision with root package name */
    public final S0.c f4972l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f4973m;

    /* renamed from: n, reason: collision with root package name */
    public final D f4974n;

    /* renamed from: o, reason: collision with root package name */
    public final D f4975o;

    /* renamed from: p, reason: collision with root package name */
    public final D f4976p;

    /* renamed from: q, reason: collision with root package name */
    public final D f4977q;

    /* renamed from: r, reason: collision with root package name */
    public final F f4978r;

    /* renamed from: s, reason: collision with root package name */
    public int f4979s;

    /* renamed from: t, reason: collision with root package name */
    public C0489w f4980t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0415a f4981u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0485s f4982v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0485s f4983w;

    /* renamed from: x, reason: collision with root package name */
    public final G f4984x;

    /* renamed from: y, reason: collision with root package name */
    public final W3.e f4985y;

    /* renamed from: z, reason: collision with root package name */
    public e.h f4986z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4962a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final S0.i f4964c = new S0.i(3);

    /* renamed from: f, reason: collision with root package name */
    public final B f4967f = new B(this);

    /* renamed from: h, reason: collision with root package name */
    public final E f4969h = new E(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f4970j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f4971k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.D] */
    public N() {
        Collections.synchronizedMap(new HashMap());
        this.f4972l = new S0.c(this);
        this.f4973m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f4974n = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4931b;

            {
                this.f4931b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        N n9 = this.f4931b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4931b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0295o c0295o = (C0295o) obj;
                        N n11 = this.f4931b;
                        if (n11.G()) {
                            boolean z8 = c0295o.f536a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o9 = (D.O) obj;
                        N n12 = this.f4931b;
                        if (n12.G()) {
                            boolean z9 = o9.f517a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f4975o = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4931b;

            {
                this.f4931b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        N n9 = this.f4931b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4931b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0295o c0295o = (C0295o) obj;
                        N n11 = this.f4931b;
                        if (n11.G()) {
                            boolean z8 = c0295o.f536a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o9 = (D.O) obj;
                        N n12 = this.f4931b;
                        if (n12.G()) {
                            boolean z9 = o9.f517a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 2;
        this.f4976p = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4931b;

            {
                this.f4931b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        N n9 = this.f4931b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4931b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0295o c0295o = (C0295o) obj;
                        N n11 = this.f4931b;
                        if (n11.G()) {
                            boolean z8 = c0295o.f536a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o9 = (D.O) obj;
                        N n12 = this.f4931b;
                        if (n12.G()) {
                            boolean z9 = o9.f517a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 3;
        this.f4977q = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4931b;

            {
                this.f4931b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        N n9 = this.f4931b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4931b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0295o c0295o = (C0295o) obj;
                        N n11 = this.f4931b;
                        if (n11.G()) {
                            boolean z8 = c0295o.f536a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o9 = (D.O) obj;
                        N n12 = this.f4931b;
                        if (n12.G()) {
                            boolean z9 = o9.f517a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f4978r = new F(this);
        this.f4979s = -1;
        this.f4984x = new G(this);
        this.f4985y = new W3.e(12);
        this.f4952C = new ArrayDeque();
        this.f4961M = new F3.C(15, this);
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        abstractComponentCallbacksC0485s.getClass();
        Iterator it = abstractComponentCallbacksC0485s.f5151M.f4964c.k().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = (AbstractComponentCallbacksC0485s) it.next();
            if (abstractComponentCallbacksC0485s2 != null) {
                z8 = F(abstractComponentCallbacksC0485s2);
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (abstractComponentCallbacksC0485s == null) {
            return true;
        }
        if (abstractComponentCallbacksC0485s.f5159U) {
            return abstractComponentCallbacksC0485s.f5149K == null || H(abstractComponentCallbacksC0485s.f5152N);
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (abstractComponentCallbacksC0485s == null) {
            return true;
        }
        N n9 = abstractComponentCallbacksC0485s.f5149K;
        return abstractComponentCallbacksC0485s.equals(n9.f4983w) && I(n9.f4982v);
    }

    public static void X(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (E(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0485s);
        }
        if (abstractComponentCallbacksC0485s.f5156R) {
            abstractComponentCallbacksC0485s.f5156R = false;
            abstractComponentCallbacksC0485s.f5166o0 = !abstractComponentCallbacksC0485s.f5166o0;
        }
    }

    public final ViewGroup A(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0485s.f5161W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0485s.f5154P <= 0 || !this.f4981u.u()) {
            return null;
        }
        View t9 = this.f4981u.t(abstractComponentCallbacksC0485s.f5154P);
        if (t9 instanceof ViewGroup) {
            return (ViewGroup) t9;
        }
        return null;
    }

    public final G B() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4982v;
        return abstractComponentCallbacksC0485s != null ? abstractComponentCallbacksC0485s.f5149K.B() : this.f4984x;
    }

    public final W3.e C() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4982v;
        return abstractComponentCallbacksC0485s != null ? abstractComponentCallbacksC0485s.f5149K.C() : this.f4985y;
    }

    public final void D(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (E(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0485s);
        }
        if (abstractComponentCallbacksC0485s.f5156R) {
            return;
        }
        abstractComponentCallbacksC0485s.f5156R = true;
        abstractComponentCallbacksC0485s.f5166o0 = true ^ abstractComponentCallbacksC0485s.f5166o0;
        W(abstractComponentCallbacksC0485s);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4982v;
        if (abstractComponentCallbacksC0485s == null) {
            return true;
        }
        return abstractComponentCallbacksC0485s.i() && this.f4982v.f().G();
    }

    public final void J(int i, boolean z8) {
        HashMap hashMap;
        C0489w c0489w;
        if (this.f4980t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z8 || i != this.f4979s) {
            this.f4979s = i;
            S0.i iVar = this.f4964c;
            Iterator it = ((ArrayList) iVar.f2901u).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) iVar.f2902v;
                if (!hasNext) {
                    break;
                }
                V v6 = (V) hashMap.get(((AbstractComponentCallbacksC0485s) it.next()).f5178x);
                if (v6 != null) {
                    v6.k();
                }
            }
            for (V v9 : hashMap.values()) {
                if (v9 != null) {
                    v9.k();
                    AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v9.f5019c;
                    if (abstractComponentCallbacksC0485s.f5144E && !abstractComponentCallbacksC0485s.k()) {
                        iVar.p(v9);
                    }
                }
            }
            Y();
            if (this.f4953D && (c0489w = this.f4980t) != null && this.f4979s == 7) {
                c0489w.f5191x.invalidateMenu();
                this.f4953D = false;
            }
        }
    }

    public final void K() {
        if (this.f4980t == null) {
            return;
        }
        this.f4954E = false;
        this.f4955F = false;
        this.f4960L.f5002f = false;
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null) {
                abstractComponentCallbacksC0485s.f5151M.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i4) {
        x(false);
        w(true);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4983w;
        if (abstractComponentCallbacksC0485s != null && i < 0 && abstractComponentCallbacksC0485s.c().L()) {
            return true;
        }
        boolean N8 = N(this.f4958I, this.J, i, i4);
        if (N8) {
            this.f4963b = true;
            try {
                P(this.f4958I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4957H) {
            this.f4957H = false;
            Y();
        }
        ((HashMap) this.f4964c.f2902v).values().removeAll(Collections.singleton(null));
        return N8;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        boolean z8 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.f4965d;
        int i9 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i9 = z8 ? 0 : this.f4965d.size() - 1;
            } else {
                int size = this.f4965d.size() - 1;
                while (size >= 0) {
                    C0468a c0468a = (C0468a) this.f4965d.get(size);
                    if (i >= 0 && i == c0468a.f5057r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i9 = size;
                } else if (z8) {
                    i9 = size;
                    while (i9 > 0) {
                        C0468a c0468a2 = (C0468a) this.f4965d.get(i9 - 1);
                        if (i < 0 || i != c0468a2.f5057r) {
                            break;
                        }
                        i9--;
                    }
                } else if (size != this.f4965d.size() - 1) {
                    i9 = size + 1;
                }
            }
        }
        if (i9 < 0) {
            return false;
        }
        for (int size2 = this.f4965d.size() - 1; size2 >= i9; size2--) {
            arrayList.add((C0468a) this.f4965d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (E(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0485s + " nesting=" + abstractComponentCallbacksC0485s.J);
        }
        boolean k6 = abstractComponentCallbacksC0485s.k();
        if (abstractComponentCallbacksC0485s.f5157S && k6) {
            return;
        }
        S0.i iVar = this.f4964c;
        synchronized (((ArrayList) iVar.f2901u)) {
            ((ArrayList) iVar.f2901u).remove(abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5143D = false;
        if (F(abstractComponentCallbacksC0485s)) {
            this.f4953D = true;
        }
        abstractComponentCallbacksC0485s.f5144E = true;
        W(abstractComponentCallbacksC0485s);
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i < size) {
            if (!((C0468a) arrayList.get(i)).f5054o) {
                if (i4 != i) {
                    y(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0468a) arrayList.get(i4)).f5054o) {
                        i4++;
                    }
                }
                y(arrayList, arrayList2, i, i4);
                i = i4 - 1;
            }
            i++;
        }
        if (i4 != size) {
            y(arrayList, arrayList2, i4, size);
        }
    }

    public final void Q(Bundle bundle) {
        int i;
        S0.c cVar;
        int i4;
        V v6;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f4980t.f5188u.getClassLoader());
                this.f4971k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f4980t.f5188u.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        S0.i iVar = this.f4964c;
        HashMap hashMap2 = (HashMap) iVar.f2903w;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        P p6 = (P) bundle.getParcelable(com.anythink.core.express.b.a.f17684b);
        if (p6 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) iVar.f2902v;
        hashMap3.clear();
        Iterator it = p6.f4988n.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = 2;
            cVar = this.f4972l;
            if (!hasNext) {
                break;
            }
            Bundle q6 = iVar.q((String) it.next(), null);
            if (q6 != null) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = (AbstractComponentCallbacksC0485s) this.f4960L.f4997a.get(((U) q6.getParcelable(com.anythink.core.express.b.a.f17684b)).f5011u);
                if (abstractComponentCallbacksC0485s != null) {
                    if (E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0485s);
                    }
                    v6 = new V(cVar, iVar, abstractComponentCallbacksC0485s, q6);
                } else {
                    v6 = new V(this.f4972l, this.f4964c, this.f4980t.f5188u.getClassLoader(), B(), q6);
                }
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = v6.f5019c;
                abstractComponentCallbacksC0485s2.f5172u = q6;
                abstractComponentCallbacksC0485s2.f5149K = this;
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0485s2.f5178x + "): " + abstractComponentCallbacksC0485s2);
                }
                v6.m(this.f4980t.f5188u.getClassLoader());
                iVar.o(v6);
                v6.f5021e = this.f4979s;
            }
        }
        S s3 = this.f4960L;
        s3.getClass();
        Iterator it2 = new ArrayList(s3.f4997a.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = (AbstractComponentCallbacksC0485s) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0485s3.f5178x) == null) {
                if (E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0485s3 + " that was not found in the set of active Fragments " + p6.f4988n);
                }
                this.f4960L.d(abstractComponentCallbacksC0485s3);
                abstractComponentCallbacksC0485s3.f5149K = this;
                V v9 = new V(cVar, iVar, abstractComponentCallbacksC0485s3);
                v9.f5021e = 1;
                v9.k();
                abstractComponentCallbacksC0485s3.f5144E = true;
                v9.k();
            }
        }
        ArrayList<String> arrayList = p6.f4989u;
        ((ArrayList) iVar.f2901u).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0485s f6 = iVar.f(str3);
                if (f6 == null) {
                    throw new IllegalStateException(D.y.k("No instantiated fragment for (", str3, ")"));
                }
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + f6);
                }
                iVar.d(f6);
            }
        }
        if (p6.f4990v != null) {
            this.f4965d = new ArrayList(p6.f4990v.length);
            int i9 = 0;
            while (true) {
                C0469b[] c0469bArr = p6.f4990v;
                if (i9 >= c0469bArr.length) {
                    break;
                }
                C0469b c0469b = c0469bArr[i9];
                c0469b.getClass();
                C0468a c0468a = new C0468a(this);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = c0469b.f5073n;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    W w9 = new W();
                    int i12 = i10 + 1;
                    int i13 = i;
                    w9.f5022a = iArr[i10];
                    if (E(i13)) {
                        Log.v("FragmentManager", "Instantiate " + c0468a + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    w9.f5029h = EnumC0507o.values()[c0469b.f5075v[i11]];
                    w9.i = EnumC0507o.values()[c0469b.f5076w[i11]];
                    int i14 = i10 + 2;
                    w9.f5024c = iArr[i12] != 0;
                    int i15 = iArr[i14];
                    w9.f5025d = i15;
                    int i16 = iArr[i10 + 3];
                    w9.f5026e = i16;
                    int i17 = i10 + 5;
                    int i18 = iArr[i10 + 4];
                    w9.f5027f = i18;
                    i10 += 6;
                    int i19 = iArr[i17];
                    w9.f5028g = i19;
                    c0468a.f5042b = i15;
                    c0468a.f5043c = i16;
                    c0468a.f5044d = i18;
                    c0468a.f5045e = i19;
                    c0468a.b(w9);
                    i11++;
                    i = i13;
                }
                int i20 = i;
                c0468a.f5046f = c0469b.f5077x;
                c0468a.f5048h = c0469b.f5078y;
                c0468a.f5047g = true;
                c0468a.i = c0469b.f5066A;
                c0468a.f5049j = c0469b.f5067B;
                c0468a.f5050k = c0469b.f5068C;
                c0468a.f5051l = c0469b.f5069D;
                c0468a.f5052m = c0469b.f5070E;
                c0468a.f5053n = c0469b.f5071F;
                c0468a.f5054o = c0469b.f5072G;
                c0468a.f5057r = c0469b.f5079z;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList2 = c0469b.f5074u;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i21);
                    if (str4 != null) {
                        ((W) c0468a.f5041a.get(i21)).f5023b = iVar.f(str4);
                    }
                    i21++;
                }
                c0468a.c(1);
                if (E(i20)) {
                    StringBuilder l9 = CL.l(i9, "restoreAllState: back stack #", " (index ");
                    l9.append(c0468a.f5057r);
                    l9.append("): ");
                    l9.append(c0468a);
                    Log.v("FragmentManager", l9.toString());
                    PrintWriter printWriter = new PrintWriter(new Y());
                    c0468a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4965d.add(c0468a);
                i9++;
                i = i20;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.f4965d = null;
        }
        this.i.set(p6.f4991w);
        String str5 = p6.f4992x;
        if (str5 != null) {
            AbstractComponentCallbacksC0485s f9 = iVar.f(str5);
            this.f4983w = f9;
            q(f9);
        }
        ArrayList arrayList3 = p6.f4993y;
        if (arrayList3 != null) {
            for (int i22 = i4; i22 < arrayList3.size(); i22++) {
                this.f4970j.put((String) arrayList3.get(i22), (C0470c) p6.f4994z.get(i22));
            }
        }
        this.f4952C = new ArrayDeque(p6.f4987A);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0469b[] c0469bArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0477j c0477j = (C0477j) it.next();
            if (c0477j.f5107e) {
                if (E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0477j.f5107e = false;
                c0477j.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0477j) it2.next()).e();
        }
        x(true);
        this.f4954E = true;
        this.f4960L.f5002f = true;
        S0.i iVar = this.f4964c;
        iVar.getClass();
        HashMap hashMap = (HashMap) iVar.f2902v;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (V v6 : hashMap.values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
                String str = abstractComponentCallbacksC0485s.f5178x;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = v6.f5019c;
                if (abstractComponentCallbacksC0485s2.f5164n == -1 && (bundle = abstractComponentCallbacksC0485s2.f5172u) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(com.anythink.core.express.b.a.f17684b, new U(abstractComponentCallbacksC0485s2));
                if (abstractComponentCallbacksC0485s2.f5164n > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0485s2.t(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    v6.f5017a.m(abstractComponentCallbacksC0485s2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0485s2.f5175v0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle R8 = abstractComponentCallbacksC0485s2.f5151M.R();
                    if (!R8.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", R8);
                    }
                    if (abstractComponentCallbacksC0485s2.f5162X != null) {
                        v6.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0485s2.f5174v;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0485s2.f5176w;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0485s2.f5180y;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                iVar.q(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0485s.f5178x);
                if (E(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0485s + ": " + abstractComponentCallbacksC0485s.f5172u);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f4964c.f2903w;
        if (!hashMap2.isEmpty()) {
            S0.i iVar2 = this.f4964c;
            synchronized (((ArrayList) iVar2.f2901u)) {
                try {
                    if (((ArrayList) iVar2.f2901u).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) iVar2.f2901u).size());
                        Iterator it3 = ((ArrayList) iVar2.f2901u).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = (AbstractComponentCallbacksC0485s) it3.next();
                            arrayList.add(abstractComponentCallbacksC0485s3.f5178x);
                            if (E(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0485s3.f5178x + "): " + abstractComponentCallbacksC0485s3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f4965d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0469bArr = null;
            } else {
                c0469bArr = new C0469b[size];
                for (i = 0; i < size; i++) {
                    c0469bArr[i] = new C0469b((C0468a) this.f4965d.get(i));
                    if (E(2)) {
                        StringBuilder l9 = CL.l(i, "saveAllState: adding back stack #", ": ");
                        l9.append(this.f4965d.get(i));
                        Log.v("FragmentManager", l9.toString());
                    }
                }
            }
            P p6 = new P();
            p6.f4992x = null;
            ArrayList arrayList4 = new ArrayList();
            p6.f4993y = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            p6.f4994z = arrayList5;
            p6.f4988n = arrayList2;
            p6.f4989u = arrayList;
            p6.f4990v = c0469bArr;
            p6.f4991w = this.i.get();
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s4 = this.f4983w;
            if (abstractComponentCallbacksC0485s4 != null) {
                p6.f4992x = abstractComponentCallbacksC0485s4.f5178x;
            }
            arrayList4.addAll(this.f4970j.keySet());
            arrayList5.addAll(this.f4970j.values());
            p6.f4987A = new ArrayList(this.f4952C);
            bundle2.putParcelable(com.anythink.core.express.b.a.f17684b, p6);
            for (String str2 : this.f4971k.keySet()) {
                bundle2.putBundle(AbstractC5051n.f("result_", str2), (Bundle) this.f4971k.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(AbstractC5051n.f("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (E(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void S() {
        synchronized (this.f4962a) {
            try {
                if (this.f4962a.size() == 1) {
                    this.f4980t.f5189v.removeCallbacks(this.f4961M);
                    this.f4980t.f5189v.post(this.f4961M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, boolean z8) {
        ViewGroup A8 = A(abstractComponentCallbacksC0485s);
        if (A8 == null || !(A8 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A8).setDrawDisappearingViewsLast(!z8);
    }

    public final void U(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, EnumC0507o enumC0507o) {
        if (abstractComponentCallbacksC0485s.equals(this.f4964c.f(abstractComponentCallbacksC0485s.f5178x)) && (abstractComponentCallbacksC0485s.f5150L == null || abstractComponentCallbacksC0485s.f5149K == this)) {
            abstractComponentCallbacksC0485s.f5169r0 = enumC0507o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0485s + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (abstractComponentCallbacksC0485s != null) {
            if (!abstractComponentCallbacksC0485s.equals(this.f4964c.f(abstractComponentCallbacksC0485s.f5178x)) || (abstractComponentCallbacksC0485s.f5150L != null && abstractComponentCallbacksC0485s.f5149K != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0485s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = this.f4983w;
        this.f4983w = abstractComponentCallbacksC0485s;
        q(abstractComponentCallbacksC0485s2);
        q(this.f4983w);
    }

    public final void W(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        ViewGroup A8 = A(abstractComponentCallbacksC0485s);
        if (A8 != null) {
            r rVar = abstractComponentCallbacksC0485s.f5165n0;
            if ((rVar == null ? 0 : rVar.f5133e) + (rVar == null ? 0 : rVar.f5132d) + (rVar == null ? 0 : rVar.f5131c) + (rVar == null ? 0 : rVar.f5130b) > 0) {
                if (A8.getTag(C5284R.id.visible_removing_fragment_view_tag) == null) {
                    A8.setTag(C5284R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0485s);
                }
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = (AbstractComponentCallbacksC0485s) A8.getTag(C5284R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0485s.f5165n0;
                boolean z8 = rVar2 != null ? rVar2.f5129a : false;
                if (abstractComponentCallbacksC0485s2.f5165n0 == null) {
                    return;
                }
                abstractComponentCallbacksC0485s2.b().f5129a = z8;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f4964c.i().iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
            if (abstractComponentCallbacksC0485s.Y) {
                if (this.f4963b) {
                    this.f4957H = true;
                } else {
                    abstractComponentCallbacksC0485s.Y = false;
                    v6.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y());
        C0489w c0489w = this.f4980t;
        if (c0489w == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
                throw illegalStateException;
            }
        }
        try {
            c0489w.f5191x.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw illegalStateException;
        }
    }

    public final V a(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        String str = abstractComponentCallbacksC0485s.f5168q0;
        if (str != null) {
            AbstractC4489d.c(abstractComponentCallbacksC0485s, str);
        }
        if (E(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0485s);
        }
        V f6 = f(abstractComponentCallbacksC0485s);
        abstractComponentCallbacksC0485s.f5149K = this;
        S0.i iVar = this.f4964c;
        iVar.o(f6);
        if (!abstractComponentCallbacksC0485s.f5157S) {
            iVar.d(abstractComponentCallbacksC0485s);
            abstractComponentCallbacksC0485s.f5144E = false;
            if (abstractComponentCallbacksC0485s.f5162X == null) {
                abstractComponentCallbacksC0485s.f5166o0 = false;
            }
            if (F(abstractComponentCallbacksC0485s)) {
                this.f4953D = true;
            }
        }
        return f6;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E7.a, kotlin.jvm.internal.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [E7.a, kotlin.jvm.internal.g] */
    public final void a0() {
        synchronized (this.f4962a) {
            try {
                if (!this.f4962a.isEmpty()) {
                    E e6 = this.f4969h;
                    e6.f4932a = true;
                    ?? r12 = e6.f4934c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    return;
                }
                E e9 = this.f4969h;
                ArrayList arrayList = this.f4965d;
                e9.f4932a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f4982v);
                ?? r02 = e9.f4934c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0489w c0489w, AbstractC0415a abstractC0415a, AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (this.f4980t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4980t = c0489w;
        this.f4981u = abstractC0415a;
        this.f4982v = abstractComponentCallbacksC0485s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4973m;
        if (abstractComponentCallbacksC0485s != 0) {
            copyOnWriteArrayList.add(new H(abstractComponentCallbacksC0485s));
        } else if (c0489w != null) {
            copyOnWriteArrayList.add(c0489w);
        }
        if (this.f4982v != null) {
            a0();
        }
        if (c0489w != null) {
            androidx.activity.G onBackPressedDispatcher = c0489w.f5191x.getOnBackPressedDispatcher();
            this.f4968g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(abstractComponentCallbacksC0485s != 0 ? abstractComponentCallbacksC0485s : c0489w, this.f4969h);
        }
        if (abstractComponentCallbacksC0485s != 0) {
            S s3 = abstractComponentCallbacksC0485s.f5149K.f4960L;
            HashMap hashMap = s3.f4998b;
            S s6 = (S) hashMap.get(abstractComponentCallbacksC0485s.f5178x);
            if (s6 == null) {
                s6 = new S(s3.f5000d);
                hashMap.put(abstractComponentCallbacksC0485s.f5178x, s6);
            }
            this.f4960L = s6;
        } else if (c0489w != null) {
            this.f4960L = (S) new Y2.e(c0489w.f5191x.getViewModelStore(), S.f4996g).t(S.class);
        } else {
            this.f4960L = new S(false);
        }
        S s9 = this.f4960L;
        s9.f5002f = this.f4954E || this.f4955F;
        this.f4964c.f2904x = s9;
        C0489w c0489w2 = this.f4980t;
        if (c0489w2 != null && abstractComponentCallbacksC0485s == 0) {
            C5202c savedStateRegistry = c0489w2.f5191x.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0486t(1, this));
            Bundle a9 = savedStateRegistry.a("android:support:fragments");
            if (a9 != null) {
                Q(a9);
            }
        }
        C0489w c0489w3 = this.f4980t;
        if (c0489w3 != null) {
            e.i activityResultRegistry = c0489w3.f5191x.getActivityResultRegistry();
            String f6 = AbstractC5051n.f("FragmentManager:", abstractComponentCallbacksC0485s != 0 ? AbstractC5051n.g(new StringBuilder(), abstractComponentCallbacksC0485s.f5178x, ":") : "");
            this.f4986z = activityResultRegistry.c(CL.j(f6, "StartActivityForResult"), new I(2), new C4524d(11, this));
            this.f4950A = activityResultRegistry.c(CL.j(f6, "StartIntentSenderForResult"), new I(0), new h4.c(15, this));
            this.f4951B = activityResultRegistry.c(CL.j(f6, "RequestPermissions"), new I(1), new C4523c(14, this));
        }
        C0489w c0489w4 = this.f4980t;
        if (c0489w4 != null) {
            c0489w4.f5191x.addOnConfigurationChangedListener(this.f4974n);
        }
        C0489w c0489w5 = this.f4980t;
        if (c0489w5 != null) {
            c0489w5.f5191x.addOnTrimMemoryListener(this.f4975o);
        }
        C0489w c0489w6 = this.f4980t;
        if (c0489w6 != null) {
            c0489w6.f5191x.addOnMultiWindowModeChangedListener(this.f4976p);
        }
        C0489w c0489w7 = this.f4980t;
        if (c0489w7 != null) {
            c0489w7.f5191x.addOnPictureInPictureModeChangedListener(this.f4977q);
        }
        C0489w c0489w8 = this.f4980t;
        if (c0489w8 == null || abstractComponentCallbacksC0485s != 0) {
            return;
        }
        c0489w8.f5191x.addMenuProvider(this.f4978r);
    }

    public final void c(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (E(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0485s);
        }
        if (abstractComponentCallbacksC0485s.f5157S) {
            abstractComponentCallbacksC0485s.f5157S = false;
            if (abstractComponentCallbacksC0485s.f5143D) {
                return;
            }
            this.f4964c.d(abstractComponentCallbacksC0485s);
            if (E(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0485s);
            }
            if (F(abstractComponentCallbacksC0485s)) {
                this.f4953D = true;
            }
        }
    }

    public final void d() {
        this.f4963b = false;
        this.J.clear();
        this.f4958I.clear();
    }

    public final HashSet e() {
        C0477j c0477j;
        HashSet hashSet = new HashSet();
        Iterator it = this.f4964c.i().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((V) it.next()).f5019c.f5161W;
            if (viewGroup != null) {
                W3.e factory = C();
                kotlin.jvm.internal.h.e(factory, "factory");
                Object tag = viewGroup.getTag(C5284R.id.special_effects_controller_view_tag);
                if (tag instanceof C0477j) {
                    c0477j = (C0477j) tag;
                } else {
                    c0477j = new C0477j(viewGroup);
                    viewGroup.setTag(C5284R.id.special_effects_controller_view_tag, c0477j);
                }
                hashSet.add(c0477j);
            }
        }
        return hashSet;
    }

    public final V f(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        String str = abstractComponentCallbacksC0485s.f5178x;
        S0.i iVar = this.f4964c;
        V v6 = (V) ((HashMap) iVar.f2902v).get(str);
        if (v6 != null) {
            return v6;
        }
        V v9 = new V(this.f4972l, iVar, abstractComponentCallbacksC0485s);
        v9.m(this.f4980t.f5188u.getClassLoader());
        v9.f5021e = this.f4979s;
        return v9;
    }

    public final void g(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (E(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0485s);
        }
        if (abstractComponentCallbacksC0485s.f5157S) {
            return;
        }
        abstractComponentCallbacksC0485s.f5157S = true;
        if (abstractComponentCallbacksC0485s.f5143D) {
            if (E(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0485s);
            }
            S0.i iVar = this.f4964c;
            synchronized (((ArrayList) iVar.f2901u)) {
                ((ArrayList) iVar.f2901u).remove(abstractComponentCallbacksC0485s);
            }
            abstractComponentCallbacksC0485s.f5143D = false;
            if (F(abstractComponentCallbacksC0485s)) {
                this.f4953D = true;
            }
            W(abstractComponentCallbacksC0485s);
        }
    }

    public final void h(boolean z8) {
        if (z8 && this.f4980t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null) {
                abstractComponentCallbacksC0485s.f5160V = true;
                if (z8) {
                    abstractComponentCallbacksC0485s.f5151M.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f4979s >= 1) {
            for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
                if (abstractComponentCallbacksC0485s != null) {
                    if (!abstractComponentCallbacksC0485s.f5156R ? abstractComponentCallbacksC0485s.f5151M.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f4979s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null && H(abstractComponentCallbacksC0485s)) {
                if (!abstractComponentCallbacksC0485s.f5156R ? abstractComponentCallbacksC0485s.f5151M.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0485s);
                    z8 = true;
                }
            }
        }
        if (this.f4966e != null) {
            for (int i = 0; i < this.f4966e.size(); i++) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = (AbstractComponentCallbacksC0485s) this.f4966e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0485s2)) {
                    abstractComponentCallbacksC0485s2.getClass();
                }
            }
        }
        this.f4966e = arrayList;
        return z8;
    }

    public final void k() {
        boolean z8 = true;
        this.f4956G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0477j) it.next()).e();
        }
        C0489w c0489w = this.f4980t;
        S0.i iVar = this.f4964c;
        if (c0489w != null) {
            z8 = ((S) iVar.f2904x).f5001e;
        } else {
            AbstractActivityC0490x abstractActivityC0490x = c0489w.f5188u;
            if (abstractActivityC0490x != null) {
                z8 = true ^ abstractActivityC0490x.isChangingConfigurations();
            }
        }
        if (z8) {
            Iterator it2 = this.f4970j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0470c) it2.next()).f5081n) {
                    S s3 = (S) iVar.f2904x;
                    s3.getClass();
                    if (E(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    s3.c(str);
                }
            }
        }
        t(-1);
        C0489w c0489w2 = this.f4980t;
        if (c0489w2 != null) {
            c0489w2.f5191x.removeOnTrimMemoryListener(this.f4975o);
        }
        C0489w c0489w3 = this.f4980t;
        if (c0489w3 != null) {
            c0489w3.f5191x.removeOnConfigurationChangedListener(this.f4974n);
        }
        C0489w c0489w4 = this.f4980t;
        if (c0489w4 != null) {
            c0489w4.f5191x.removeOnMultiWindowModeChangedListener(this.f4976p);
        }
        C0489w c0489w5 = this.f4980t;
        if (c0489w5 != null) {
            c0489w5.f5191x.removeOnPictureInPictureModeChangedListener(this.f4977q);
        }
        C0489w c0489w6 = this.f4980t;
        if (c0489w6 != null && this.f4982v == null) {
            c0489w6.f5191x.removeMenuProvider(this.f4978r);
        }
        this.f4980t = null;
        this.f4981u = null;
        this.f4982v = null;
        if (this.f4968g != null) {
            Iterator it3 = this.f4969h.f4933b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0461c) it3.next()).cancel();
            }
            this.f4968g = null;
        }
        e.h hVar = this.f4986z;
        if (hVar != null) {
            hVar.f37219a.e(hVar.f37220b);
            e.h hVar2 = this.f4950A;
            hVar2.f37219a.e(hVar2.f37220b);
            e.h hVar3 = this.f4951B;
            hVar3.f37219a.e(hVar3.f37220b);
        }
    }

    public final void l(boolean z8) {
        if (z8 && this.f4980t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null) {
                abstractComponentCallbacksC0485s.f5160V = true;
                if (z8) {
                    abstractComponentCallbacksC0485s.f5151M.l(true);
                }
            }
        }
    }

    public final void m(boolean z8) {
        if (z8 && this.f4980t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null && z8) {
                abstractComponentCallbacksC0485s.f5151M.m(true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f4964c.k().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = (AbstractComponentCallbacksC0485s) it.next();
            if (abstractComponentCallbacksC0485s != null) {
                abstractComponentCallbacksC0485s.j();
                abstractComponentCallbacksC0485s.f5151M.n();
            }
        }
    }

    public final boolean o() {
        if (this.f4979s >= 1) {
            for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
                if (abstractComponentCallbacksC0485s != null) {
                    if (!abstractComponentCallbacksC0485s.f5156R ? abstractComponentCallbacksC0485s.f5151M.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f4979s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null && !abstractComponentCallbacksC0485s.f5156R) {
                abstractComponentCallbacksC0485s.f5151M.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        if (abstractComponentCallbacksC0485s != null) {
            if (abstractComponentCallbacksC0485s.equals(this.f4964c.f(abstractComponentCallbacksC0485s.f5178x))) {
                abstractComponentCallbacksC0485s.f5149K.getClass();
                boolean I2 = I(abstractComponentCallbacksC0485s);
                Boolean bool = abstractComponentCallbacksC0485s.f5142C;
                if (bool == null || bool.booleanValue() != I2) {
                    abstractComponentCallbacksC0485s.f5142C = Boolean.valueOf(I2);
                    O o9 = abstractComponentCallbacksC0485s.f5151M;
                    o9.a0();
                    o9.q(o9.f4983w);
                }
            }
        }
    }

    public final void r(boolean z8) {
        if (z8 && this.f4980t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null && z8) {
                abstractComponentCallbacksC0485s.f5151M.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f4979s < 1) {
            return false;
        }
        boolean z8 = false;
        for (AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s : this.f4964c.l()) {
            if (abstractComponentCallbacksC0485s != null && H(abstractComponentCallbacksC0485s)) {
                if (!abstractComponentCallbacksC0485s.f5156R ? abstractComponentCallbacksC0485s.f5151M.s() : false) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final void t(int i) {
        try {
            this.f4963b = true;
            for (V v6 : ((HashMap) this.f4964c.f2902v).values()) {
                if (v6 != null) {
                    v6.f5021e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0477j) it.next()).e();
            }
            this.f4963b = false;
            x(true);
        } catch (Throwable th) {
            this.f4963b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4982v;
        if (abstractComponentCallbacksC0485s != null) {
            sb.append(abstractComponentCallbacksC0485s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4982v)));
            sb.append("}");
        } else {
            C0489w c0489w = this.f4980t;
            if (c0489w != null) {
                sb.append(c0489w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4980t)));
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
        String j9 = CL.j(str, "    ");
        S0.i iVar = this.f4964c;
        iVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) iVar.f2902v;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (V v6 : hashMap.values()) {
                printWriter.print(str);
                if (v6 != null) {
                    AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
                    printWriter.println(abstractComponentCallbacksC0485s);
                    abstractComponentCallbacksC0485s.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0485s.f5153O));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0485s.f5154P));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0485s.f5155Q);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5164n);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5178x);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0485s.J);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5143D);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5144E);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5145F);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0485s.f5146G);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5156R);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5157S);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5159U);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0485s.f5158T);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0485s.f5163Z);
                    if (abstractComponentCallbacksC0485s.f5149K != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5149K);
                    }
                    if (abstractComponentCallbacksC0485s.f5150L != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5150L);
                    }
                    if (abstractComponentCallbacksC0485s.f5152N != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5152N);
                    }
                    if (abstractComponentCallbacksC0485s.f5180y != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5180y);
                    }
                    if (abstractComponentCallbacksC0485s.f5172u != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5172u);
                    }
                    if (abstractComponentCallbacksC0485s.f5174v != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5174v);
                    }
                    if (abstractComponentCallbacksC0485s.f5176w != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5176w);
                    }
                    Object obj = abstractComponentCallbacksC0485s.f5181z;
                    if (obj == null) {
                        N n9 = abstractComponentCallbacksC0485s.f5149K;
                        obj = (n9 == null || (str2 = abstractComponentCallbacksC0485s.f5140A) == null) ? null : n9.f4964c.f(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5141B);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0485s.f5165n0;
                    printWriter.println(rVar == null ? false : rVar.f5129a);
                    r rVar2 = abstractComponentCallbacksC0485s.f5165n0;
                    if ((rVar2 == null ? 0 : rVar2.f5130b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0485s.f5165n0;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f5130b);
                    }
                    r rVar4 = abstractComponentCallbacksC0485s.f5165n0;
                    if ((rVar4 == null ? 0 : rVar4.f5131c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0485s.f5165n0;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f5131c);
                    }
                    r rVar6 = abstractComponentCallbacksC0485s.f5165n0;
                    if ((rVar6 == null ? 0 : rVar6.f5132d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0485s.f5165n0;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f5132d);
                    }
                    r rVar8 = abstractComponentCallbacksC0485s.f5165n0;
                    if ((rVar8 == null ? 0 : rVar8.f5133e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0485s.f5165n0;
                        printWriter.println(rVar9 == null ? 0 : rVar9.f5133e);
                    }
                    if (abstractComponentCallbacksC0485s.f5161W != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5161W);
                    }
                    if (abstractComponentCallbacksC0485s.f5162X != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0485s.f5162X);
                    }
                    if (abstractComponentCallbacksC0485s.d() != null) {
                        s.l lVar = ((C4572b) new Y2.e(abstractComponentCallbacksC0485s.getViewModelStore(), C4572b.f38273b).t(C4572b.class)).f38274a;
                        if (lVar.f40413v > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f40413v > 0) {
                                if (lVar.f40412u[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f40411n[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0485s.f5151M + ":");
                    abstractComponentCallbacksC0485s.f5151M.u(CL.j(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) iVar.f2901u;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = (AbstractComponentCallbacksC0485s) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0485s2.toString());
            }
        }
        ArrayList arrayList2 = this.f4966e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = (AbstractComponentCallbacksC0485s) this.f4966e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0485s3.toString());
            }
        }
        ArrayList arrayList3 = this.f4965d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C0468a c0468a = (C0468a) this.f4965d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0468a.toString());
                c0468a.f(j9, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f4962a) {
            try {
                int size4 = this.f4962a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size4; i10++) {
                        Object obj2 = (L) this.f4962a.get(i10);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
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
        printWriter.println(this.f4980t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4981u);
        if (this.f4982v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4982v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4979s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4954E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4955F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4956G);
        if (this.f4953D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4953D);
        }
    }

    public final void v(L l9, boolean z8) {
        if (!z8) {
            if (this.f4980t == null) {
                if (!this.f4956G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f4954E || this.f4955F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4962a) {
            try {
                if (this.f4980t == null) {
                    if (!z8) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4962a.add(l9);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z8) {
        if (this.f4963b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4980t == null) {
            if (!this.f4956G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4980t.f5189v.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z8 && (this.f4954E || this.f4955F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4958I == null) {
            this.f4958I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z8) {
        boolean z9;
        w(z8);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f4958I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f4962a) {
                if (this.f4962a.isEmpty()) {
                    z9 = false;
                } else {
                    try {
                        int size = this.f4962a.size();
                        z9 = false;
                        for (int i = 0; i < size; i++) {
                            z9 |= ((L) this.f4962a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z9) {
                break;
            }
            z10 = true;
            this.f4963b = true;
            try {
                P(this.f4958I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4957H) {
            this.f4957H = false;
            Y();
        }
        ((HashMap) this.f4964c.f2902v).values().removeAll(Collections.singleton(null));
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x04c0, code lost:
    
        r10 = (androidx.fragment.app.a0) r10;
        r7.f5107e = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        Object obj;
        ViewGroup viewGroup;
        boolean z8;
        int i9;
        boolean z9;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13 = ((C0468a) arrayList.get(i)).f5054o;
        ArrayList arrayList3 = this.f4959K;
        if (arrayList3 == null) {
            this.f4959K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f4959K;
        S0.i iVar = this.f4964c;
        arrayList4.addAll(iVar.l());
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f4983w;
        int i13 = i;
        boolean z14 = false;
        while (true) {
            int i14 = 1;
            if (i13 >= i4) {
                boolean z15 = z13;
                this.f4959K.clear();
                if (!z15 && this.f4979s >= 1) {
                    for (int i15 = i; i15 < i4; i15++) {
                        Iterator it = ((C0468a) arrayList.get(i15)).f5041a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = ((W) it.next()).f5023b;
                            if (abstractComponentCallbacksC0485s2 != null && abstractComponentCallbacksC0485s2.f5149K != null) {
                                iVar.o(f(abstractComponentCallbacksC0485s2));
                            }
                        }
                    }
                }
                for (int i16 = i; i16 < i4; i16++) {
                    C0468a c0468a = (C0468a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                        c0468a.c(-1);
                        ArrayList arrayList5 = c0468a.f5041a;
                        boolean z16 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            W w9 = (W) arrayList5.get(size);
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = w9.f5023b;
                            if (abstractComponentCallbacksC0485s3 != null) {
                                if (abstractComponentCallbacksC0485s3.f5165n0 != null) {
                                    abstractComponentCallbacksC0485s3.b().f5129a = z16;
                                }
                                int i17 = c0468a.f5046f;
                                int i18 = 8194;
                                int i19 = 4097;
                                if (i17 != 4097) {
                                    if (i17 != 8194) {
                                        i18 = 4100;
                                        i19 = 8197;
                                        if (i17 != 8197) {
                                            if (i17 == 4099) {
                                                i18 = 4099;
                                            } else if (i17 != 4100) {
                                                i18 = 0;
                                            }
                                        }
                                    }
                                    i18 = i19;
                                }
                                if (abstractComponentCallbacksC0485s3.f5165n0 != null || i18 != 0) {
                                    abstractComponentCallbacksC0485s3.b();
                                    abstractComponentCallbacksC0485s3.f5165n0.f5134f = i18;
                                }
                                abstractComponentCallbacksC0485s3.b();
                                abstractComponentCallbacksC0485s3.f5165n0.getClass();
                            }
                            int i20 = w9.f5022a;
                            N n9 = c0468a.f5055p;
                            switch (i20) {
                                case 1:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    z16 = true;
                                    n9.T(abstractComponentCallbacksC0485s3, true);
                                    n9.O(abstractComponentCallbacksC0485s3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w9.f5022a);
                                case 3:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    n9.a(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 4:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    n9.getClass();
                                    X(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 5:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    n9.T(abstractComponentCallbacksC0485s3, true);
                                    n9.D(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 6:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    n9.c(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 7:
                                    abstractComponentCallbacksC0485s3.A(w9.f5025d, w9.f5026e, w9.f5027f, w9.f5028g);
                                    n9.T(abstractComponentCallbacksC0485s3, true);
                                    n9.g(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 8:
                                    n9.V(null);
                                    z16 = true;
                                case 9:
                                    n9.V(abstractComponentCallbacksC0485s3);
                                    z16 = true;
                                case 10:
                                    n9.U(abstractComponentCallbacksC0485s3, w9.f5029h);
                                    z16 = true;
                            }
                        }
                    } else {
                        c0468a.c(1);
                        ArrayList arrayList6 = c0468a.f5041a;
                        int size2 = arrayList6.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            W w10 = (W) arrayList6.get(i21);
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s4 = w10.f5023b;
                            if (abstractComponentCallbacksC0485s4 != null) {
                                if (abstractComponentCallbacksC0485s4.f5165n0 != null) {
                                    abstractComponentCallbacksC0485s4.b().f5129a = false;
                                }
                                int i22 = c0468a.f5046f;
                                if (abstractComponentCallbacksC0485s4.f5165n0 != null || i22 != 0) {
                                    abstractComponentCallbacksC0485s4.b();
                                    abstractComponentCallbacksC0485s4.f5165n0.f5134f = i22;
                                }
                                abstractComponentCallbacksC0485s4.b();
                                abstractComponentCallbacksC0485s4.f5165n0.getClass();
                            }
                            int i23 = w10.f5022a;
                            N n10 = c0468a.f5055p;
                            switch (i23) {
                                case 1:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.T(abstractComponentCallbacksC0485s4, false);
                                    n10.a(abstractComponentCallbacksC0485s4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w10.f5022a);
                                case 3:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.O(abstractComponentCallbacksC0485s4);
                                case 4:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.D(abstractComponentCallbacksC0485s4);
                                case 5:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.T(abstractComponentCallbacksC0485s4, false);
                                    X(abstractComponentCallbacksC0485s4);
                                case 6:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.g(abstractComponentCallbacksC0485s4);
                                case 7:
                                    abstractComponentCallbacksC0485s4.A(w10.f5025d, w10.f5026e, w10.f5027f, w10.f5028g);
                                    n10.T(abstractComponentCallbacksC0485s4, false);
                                    n10.c(abstractComponentCallbacksC0485s4);
                                case 8:
                                    n10.V(abstractComponentCallbacksC0485s4);
                                case 9:
                                    n10.V(null);
                                case 10:
                                    n10.U(abstractComponentCallbacksC0485s4, w10.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i24 = i; i24 < i4; i24++) {
                    C0468a c0468a2 = (C0468a) arrayList.get(i24);
                    if (booleanValue) {
                        for (int size3 = c0468a2.f5041a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s5 = ((W) c0468a2.f5041a.get(size3)).f5023b;
                            if (abstractComponentCallbacksC0485s5 != null) {
                                f(abstractComponentCallbacksC0485s5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0468a2.f5041a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s6 = ((W) it2.next()).f5023b;
                            if (abstractComponentCallbacksC0485s6 != null) {
                                f(abstractComponentCallbacksC0485s6).k();
                            }
                        }
                    }
                }
                J(this.f4979s, true);
                HashSet hashSet = new HashSet();
                for (int i25 = i; i25 < i4; i25++) {
                    Iterator it3 = ((C0468a) arrayList.get(i25)).f5041a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s7 = ((W) it3.next()).f5023b;
                        if (abstractComponentCallbacksC0485s7 != null && (viewGroup = abstractComponentCallbacksC0485s7.f5161W) != null) {
                            hashSet.add(C0477j.f(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0477j c0477j = (C0477j) it4.next();
                    c0477j.f5106d = booleanValue;
                    synchronized (c0477j.f5104b) {
                        try {
                            c0477j.g();
                            ArrayList arrayList7 = c0477j.f5104b;
                            ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    a0 a0Var = (a0) obj;
                                    View view = a0Var.f5060c.f5162X;
                                    kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                    char c4 = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility == 0) {
                                            c4 = 2;
                                        } else if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                            c4 = 3;
                                        }
                                    }
                                    if (a0Var.f5058a != 2 || c4 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0477j.c();
                }
                for (int i26 = i; i26 < i4; i26++) {
                    C0468a c0468a3 = (C0468a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue() && c0468a3.f5057r >= 0) {
                        c0468a3.f5057r = -1;
                    }
                    c0468a3.getClass();
                }
                return;
            }
            C0468a c0468a4 = (C0468a) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                z8 = z13;
                i9 = i13;
                z9 = z14;
                int i27 = 1;
                ArrayList arrayList8 = this.f4959K;
                ArrayList arrayList9 = c0468a4.f5041a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    W w11 = (W) arrayList9.get(size4);
                    int i28 = w11.f5022a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 8:
                                    abstractComponentCallbacksC0485s = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0485s = w11.f5023b;
                                    break;
                                case 10:
                                    w11.i = w11.f5029h;
                                    break;
                            }
                            size4--;
                            i27 = 1;
                        }
                        arrayList8.add(w11.f5023b);
                        size4--;
                        i27 = 1;
                    }
                    arrayList8.remove(w11.f5023b);
                    size4--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f4959K;
                int i29 = 0;
                while (true) {
                    ArrayList arrayList11 = c0468a4.f5041a;
                    if (i29 < arrayList11.size()) {
                        W w12 = (W) arrayList11.get(i29);
                        int i30 = w12.f5022a;
                        if (i30 != i14) {
                            z10 = z13;
                            if (i30 != 2) {
                                if (i30 == 3 || i30 == 6) {
                                    arrayList10.remove(w12.f5023b);
                                    AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s8 = w12.f5023b;
                                    if (abstractComponentCallbacksC0485s8 == abstractComponentCallbacksC0485s) {
                                        arrayList11.add(i29, new W(9, abstractComponentCallbacksC0485s8));
                                        i29++;
                                        i11 = i13;
                                        z11 = z14;
                                        i10 = 1;
                                        abstractComponentCallbacksC0485s = null;
                                    }
                                } else if (i30 == 7) {
                                    i10 = 1;
                                } else if (i30 == 8) {
                                    arrayList11.add(i29, new W(9, abstractComponentCallbacksC0485s, 0));
                                    w12.f5024c = true;
                                    i29++;
                                    abstractComponentCallbacksC0485s = w12.f5023b;
                                }
                                i11 = i13;
                                z11 = z14;
                                i10 = 1;
                            } else {
                                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s9 = w12.f5023b;
                                int i31 = abstractComponentCallbacksC0485s9.f5154P;
                                int size5 = arrayList10.size() - 1;
                                boolean z17 = false;
                                while (size5 >= 0) {
                                    int i32 = size5;
                                    AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s10 = (AbstractComponentCallbacksC0485s) arrayList10.get(size5);
                                    int i33 = i13;
                                    if (abstractComponentCallbacksC0485s10.f5154P != i31) {
                                        z12 = z14;
                                    } else if (abstractComponentCallbacksC0485s10 == abstractComponentCallbacksC0485s9) {
                                        z12 = z14;
                                        z17 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0485s10 == abstractComponentCallbacksC0485s) {
                                            z12 = z14;
                                            i12 = 0;
                                            arrayList11.add(i29, new W(9, abstractComponentCallbacksC0485s10, 0));
                                            i29++;
                                            abstractComponentCallbacksC0485s = null;
                                        } else {
                                            z12 = z14;
                                            i12 = 0;
                                        }
                                        W w13 = new W(3, abstractComponentCallbacksC0485s10, i12);
                                        w13.f5025d = w12.f5025d;
                                        w13.f5027f = w12.f5027f;
                                        w13.f5026e = w12.f5026e;
                                        w13.f5028g = w12.f5028g;
                                        arrayList11.add(i29, w13);
                                        arrayList10.remove(abstractComponentCallbacksC0485s10);
                                        i29++;
                                        abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s;
                                    }
                                    size5 = i32 - 1;
                                    z14 = z12;
                                    i13 = i33;
                                }
                                i11 = i13;
                                z11 = z14;
                                i10 = 1;
                                if (z17) {
                                    arrayList11.remove(i29);
                                    i29--;
                                } else {
                                    w12.f5022a = 1;
                                    w12.f5024c = true;
                                    arrayList10.add(abstractComponentCallbacksC0485s9);
                                }
                            }
                            i29 += i10;
                            i14 = i10;
                            z13 = z10;
                            z14 = z11;
                            i13 = i11;
                        } else {
                            z10 = z13;
                            i10 = i14;
                        }
                        i11 = i13;
                        z11 = z14;
                        arrayList10.add(w12.f5023b);
                        i29 += i10;
                        i14 = i10;
                        z13 = z10;
                        z14 = z11;
                        i13 = i11;
                    } else {
                        z8 = z13;
                        i9 = i13;
                        z9 = z14;
                    }
                }
            }
            z14 = z9 || c0468a4.f5047g;
            i13 = i9 + 1;
            z13 = z8;
        }
    }

    public final AbstractComponentCallbacksC0485s z(int i) {
        S0.i iVar = this.f4964c;
        ArrayList arrayList = (ArrayList) iVar.f2901u;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = (AbstractComponentCallbacksC0485s) arrayList.get(size);
            if (abstractComponentCallbacksC0485s != null && abstractComponentCallbacksC0485s.f5153O == i) {
                return abstractComponentCallbacksC0485s;
            }
        }
        for (V v6 : ((HashMap) iVar.f2902v).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = v6.f5019c;
                if (abstractComponentCallbacksC0485s2.f5153O == i) {
                    return abstractComponentCallbacksC0485s2;
                }
            }
        }
        return null;
    }
}
