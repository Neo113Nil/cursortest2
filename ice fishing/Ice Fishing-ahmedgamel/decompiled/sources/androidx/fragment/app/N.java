package androidx.fragment.app;

import D.C0284n;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.InterfaceC0455c;
import androidx.lifecycle.EnumC0501o;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;
import i0.C4582b;
import i1.C4585b;
import i1.C4586c;
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
import w.AbstractC5128c;
import x0.C5180c;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: A, reason: collision with root package name */
    public e.h f4806A;

    /* renamed from: B, reason: collision with root package name */
    public e.h f4807B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f4808C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4809D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4810E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4811F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4812G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4813H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f4814I;
    public ArrayList J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f4815K;

    /* renamed from: L, reason: collision with root package name */
    public S f4816L;

    /* renamed from: M, reason: collision with root package name */
    public final G0.c f4817M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4819b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4821d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4822e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.G f4824g;

    /* renamed from: l, reason: collision with root package name */
    public final S0.e f4828l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f4829m;

    /* renamed from: n, reason: collision with root package name */
    public final D f4830n;

    /* renamed from: o, reason: collision with root package name */
    public final D f4831o;

    /* renamed from: p, reason: collision with root package name */
    public final D f4832p;

    /* renamed from: q, reason: collision with root package name */
    public final D f4833q;

    /* renamed from: r, reason: collision with root package name */
    public final F f4834r;

    /* renamed from: s, reason: collision with root package name */
    public int f4835s;

    /* renamed from: t, reason: collision with root package name */
    public C0483w f4836t;

    /* renamed from: u, reason: collision with root package name */
    public X2.a f4837u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0479s f4838v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0479s f4839w;

    /* renamed from: x, reason: collision with root package name */
    public final G f4840x;

    /* renamed from: y, reason: collision with root package name */
    public final c4.e f4841y;

    /* renamed from: z, reason: collision with root package name */
    public e.h f4842z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4818a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final l4.q f4820c = new l4.q(3);

    /* renamed from: f, reason: collision with root package name */
    public final B f4823f = new B(this);

    /* renamed from: h, reason: collision with root package name */
    public final E f4825h = new E(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f4826j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f4827k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.D] */
    public N() {
        Collections.synchronizedMap(new HashMap());
        this.f4828l = new S0.e(this);
        this.f4829m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f4830n = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4787b;

            {
                this.f4787b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        N n9 = this.f4787b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4787b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0284n c0284n = (C0284n) obj;
                        N n11 = this.f4787b;
                        if (n11.G()) {
                            boolean z6 = c0284n.f376a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.N n12 = (D.N) obj;
                        N n13 = this.f4787b;
                        if (n13.G()) {
                            boolean z9 = n12.f359a;
                            n13.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f4831o = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4787b;

            {
                this.f4787b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        N n9 = this.f4787b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4787b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0284n c0284n = (C0284n) obj;
                        N n11 = this.f4787b;
                        if (n11.G()) {
                            boolean z6 = c0284n.f376a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.N n12 = (D.N) obj;
                        N n13 = this.f4787b;
                        if (n13.G()) {
                            boolean z9 = n12.f359a;
                            n13.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 2;
        this.f4832p = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4787b;

            {
                this.f4787b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        N n9 = this.f4787b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4787b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0284n c0284n = (C0284n) obj;
                        N n11 = this.f4787b;
                        if (n11.G()) {
                            boolean z6 = c0284n.f376a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.N n12 = (D.N) obj;
                        N n13 = this.f4787b;
                        if (n13.G()) {
                            boolean z9 = n12.f359a;
                            n13.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 3;
        this.f4833q = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4787b;

            {
                this.f4787b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        N n9 = this.f4787b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4787b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0284n c0284n = (C0284n) obj;
                        N n11 = this.f4787b;
                        if (n11.G()) {
                            boolean z6 = c0284n.f376a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.N n12 = (D.N) obj;
                        N n13 = this.f4787b;
                        if (n13.G()) {
                            boolean z9 = n12.f359a;
                            n13.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f4834r = new F(this);
        this.f4835s = -1;
        this.f4840x = new G(this);
        this.f4841y = new c4.e();
        this.f4808C = new ArrayDeque();
        this.f4817M = new G0.c(17, this);
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        abstractComponentCallbacksC0479s.getClass();
        Iterator it = abstractComponentCallbacksC0479s.f5007M.f4820c.e().iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = (AbstractComponentCallbacksC0479s) it.next();
            if (abstractComponentCallbacksC0479s2 != null) {
                z6 = F(abstractComponentCallbacksC0479s2);
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (abstractComponentCallbacksC0479s == null) {
            return true;
        }
        if (abstractComponentCallbacksC0479s.f5015U) {
            return abstractComponentCallbacksC0479s.f5005K == null || H(abstractComponentCallbacksC0479s.f5008N);
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (abstractComponentCallbacksC0479s == null) {
            return true;
        }
        N n9 = abstractComponentCallbacksC0479s.f5005K;
        return abstractComponentCallbacksC0479s.equals(n9.f4839w) && I(n9.f4838v);
    }

    public static void X(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (E(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0479s);
        }
        if (abstractComponentCallbacksC0479s.f5012R) {
            abstractComponentCallbacksC0479s.f5012R = false;
            abstractComponentCallbacksC0479s.f5021j0 = !abstractComponentCallbacksC0479s.f5021j0;
        }
    }

    public final ViewGroup A(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0479s.f5017W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0479s.f5010P <= 0 || !this.f4837u.o()) {
            return null;
        }
        View n9 = this.f4837u.n(abstractComponentCallbacksC0479s.f5010P);
        if (n9 instanceof ViewGroup) {
            return (ViewGroup) n9;
        }
        return null;
    }

    public final G B() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4838v;
        return abstractComponentCallbacksC0479s != null ? abstractComponentCallbacksC0479s.f5005K.B() : this.f4840x;
    }

    public final c4.e C() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4838v;
        return abstractComponentCallbacksC0479s != null ? abstractComponentCallbacksC0479s.f5005K.C() : this.f4841y;
    }

    public final void D(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (E(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0479s);
        }
        if (abstractComponentCallbacksC0479s.f5012R) {
            return;
        }
        abstractComponentCallbacksC0479s.f5012R = true;
        abstractComponentCallbacksC0479s.f5021j0 = true ^ abstractComponentCallbacksC0479s.f5021j0;
        W(abstractComponentCallbacksC0479s);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4838v;
        if (abstractComponentCallbacksC0479s == null) {
            return true;
        }
        return abstractComponentCallbacksC0479s.i() && this.f4838v.f().G();
    }

    public final void J(int i, boolean z6) {
        HashMap hashMap;
        C0483w c0483w;
        if (this.f4836t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i != this.f4835s) {
            this.f4835s = i;
            l4.q qVar = this.f4820c;
            Iterator it = ((ArrayList) qVar.f38945n).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) qVar.f38946u;
                if (!hasNext) {
                    break;
                }
                V v9 = (V) hashMap.get(((AbstractComponentCallbacksC0479s) it.next()).f5034x);
                if (v9 != null) {
                    v9.k();
                }
            }
            for (V v10 : hashMap.values()) {
                if (v10 != null) {
                    v10.k();
                    AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v10.f4875c;
                    if (abstractComponentCallbacksC0479s.f5000E && !abstractComponentCallbacksC0479s.k()) {
                        qVar.k(v10);
                    }
                }
            }
            Y();
            if (this.f4809D && (c0483w = this.f4836t) != null && this.f4835s == 7) {
                c0483w.f5045D.invalidateMenu();
                this.f4809D = false;
            }
        }
    }

    public final void K() {
        if (this.f4836t == null) {
            return;
        }
        this.f4810E = false;
        this.f4811F = false;
        this.f4816L.f4858f = false;
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null) {
                abstractComponentCallbacksC0479s.f5007M.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i4) {
        x(false);
        w(true);
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4839w;
        if (abstractComponentCallbacksC0479s != null && i < 0 && abstractComponentCallbacksC0479s.c().L()) {
            return true;
        }
        boolean N8 = N(this.f4814I, this.J, i, i4);
        if (N8) {
            this.f4819b = true;
            try {
                P(this.f4814I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4813H) {
            this.f4813H = false;
            Y();
        }
        ((HashMap) this.f4820c.f38946u).values().removeAll(Collections.singleton(null));
        return N8;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        boolean z6 = (i4 & 1) != 0;
        ArrayList arrayList3 = this.f4821d;
        int i6 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i6 = z6 ? 0 : this.f4821d.size() - 1;
            } else {
                int size = this.f4821d.size() - 1;
                while (size >= 0) {
                    C0462a c0462a = (C0462a) this.f4821d.get(size);
                    if (i >= 0 && i == c0462a.f4913r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i6 = size;
                } else if (z6) {
                    i6 = size;
                    while (i6 > 0) {
                        C0462a c0462a2 = (C0462a) this.f4821d.get(i6 - 1);
                        if (i < 0 || i != c0462a2.f4913r) {
                            break;
                        }
                        i6--;
                    }
                } else if (size != this.f4821d.size() - 1) {
                    i6 = size + 1;
                }
            }
        }
        if (i6 < 0) {
            return false;
        }
        for (int size2 = this.f4821d.size() - 1; size2 >= i6; size2--) {
            arrayList.add((C0462a) this.f4821d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (E(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0479s + " nesting=" + abstractComponentCallbacksC0479s.J);
        }
        boolean k9 = abstractComponentCallbacksC0479s.k();
        if (abstractComponentCallbacksC0479s.f5013S && k9) {
            return;
        }
        l4.q qVar = this.f4820c;
        synchronized (((ArrayList) qVar.f38945n)) {
            ((ArrayList) qVar.f38945n).remove(abstractComponentCallbacksC0479s);
        }
        abstractComponentCallbacksC0479s.f4999D = false;
        if (F(abstractComponentCallbacksC0479s)) {
            this.f4809D = true;
        }
        abstractComponentCallbacksC0479s.f5000E = true;
        W(abstractComponentCallbacksC0479s);
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
            if (!((C0462a) arrayList.get(i)).f4910o) {
                if (i4 != i) {
                    y(arrayList, arrayList2, i4, i);
                }
                i4 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0462a) arrayList.get(i4)).f4910o) {
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
        S0.e eVar;
        int i4;
        V v9;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f4836t.f5042A.getClassLoader());
                this.f4827k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f4836t.f5042A.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        l4.q qVar = this.f4820c;
        HashMap hashMap2 = (HashMap) qVar.f38947v;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        P p9 = (P) bundle.getParcelable(com.anythink.core.express.b.a.f18313b);
        if (p9 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) qVar.f38946u;
        hashMap3.clear();
        Iterator it = p9.f4844n.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = 2;
            eVar = this.f4828l;
            if (!hasNext) {
                break;
            }
            Bundle n9 = qVar.n((String) it.next(), null);
            if (n9 != null) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = (AbstractComponentCallbacksC0479s) this.f4816L.f4853a.get(((U) n9.getParcelable(com.anythink.core.express.b.a.f18313b)).f4867u);
                if (abstractComponentCallbacksC0479s != null) {
                    if (E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0479s);
                    }
                    v9 = new V(eVar, qVar, abstractComponentCallbacksC0479s, n9);
                } else {
                    v9 = new V(this.f4828l, this.f4820c, this.f4836t.f5042A.getClassLoader(), B(), n9);
                }
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = v9.f4875c;
                abstractComponentCallbacksC0479s2.f5031u = n9;
                abstractComponentCallbacksC0479s2.f5005K = this;
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0479s2.f5034x + "): " + abstractComponentCallbacksC0479s2);
                }
                v9.m(this.f4836t.f5042A.getClassLoader());
                qVar.j(v9);
                v9.f4877e = this.f4835s;
            }
        }
        S s9 = this.f4816L;
        s9.getClass();
        Iterator it2 = new ArrayList(s9.f4853a.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = (AbstractComponentCallbacksC0479s) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0479s3.f5034x) == null) {
                if (E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0479s3 + " that was not found in the set of active Fragments " + p9.f4844n);
                }
                this.f4816L.d(abstractComponentCallbacksC0479s3);
                abstractComponentCallbacksC0479s3.f5005K = this;
                V v10 = new V(eVar, qVar, abstractComponentCallbacksC0479s3);
                v10.f4877e = 1;
                v10.k();
                abstractComponentCallbacksC0479s3.f5000E = true;
                v10.k();
            }
        }
        ArrayList<String> arrayList = p9.f4845u;
        ((ArrayList) qVar.f38945n).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0479s b9 = qVar.b(str3);
                if (b9 == null) {
                    throw new IllegalStateException(D.x.l("No instantiated fragment for (", str3, ")"));
                }
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b9);
                }
                qVar.a(b9);
            }
        }
        if (p9.f4846v != null) {
            this.f4821d = new ArrayList(p9.f4846v.length);
            int i6 = 0;
            while (true) {
                C0463b[] c0463bArr = p9.f4846v;
                if (i6 >= c0463bArr.length) {
                    break;
                }
                C0463b c0463b = c0463bArr[i6];
                c0463b.getClass();
                C0462a c0462a = new C0462a(this);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int[] iArr = c0463b.f4929n;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    W w3 = new W();
                    int i11 = i9 + 1;
                    int i12 = i;
                    w3.f4878a = iArr[i9];
                    if (E(i12)) {
                        Log.v("FragmentManager", "Instantiate " + c0462a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    w3.f4885h = EnumC0501o.values()[c0463b.f4931v[i10]];
                    w3.i = EnumC0501o.values()[c0463b.f4932w[i10]];
                    int i13 = i9 + 2;
                    w3.f4880c = iArr[i11] != 0;
                    int i14 = iArr[i13];
                    w3.f4881d = i14;
                    int i15 = iArr[i9 + 3];
                    w3.f4882e = i15;
                    int i16 = i9 + 5;
                    int i17 = iArr[i9 + 4];
                    w3.f4883f = i17;
                    i9 += 6;
                    int i18 = iArr[i16];
                    w3.f4884g = i18;
                    c0462a.f4898b = i14;
                    c0462a.f4899c = i15;
                    c0462a.f4900d = i17;
                    c0462a.f4901e = i18;
                    c0462a.b(w3);
                    i10++;
                    i = i12;
                }
                int i19 = i;
                c0462a.f4902f = c0463b.f4933x;
                c0462a.f4904h = c0463b.f4934y;
                c0462a.f4903g = true;
                c0462a.i = c0463b.f4922A;
                c0462a.f4905j = c0463b.f4923B;
                c0462a.f4906k = c0463b.f4924C;
                c0462a.f4907l = c0463b.f4925D;
                c0462a.f4908m = c0463b.f4926E;
                c0462a.f4909n = c0463b.f4927F;
                c0462a.f4910o = c0463b.f4928G;
                c0462a.f4913r = c0463b.f4935z;
                int i20 = 0;
                while (true) {
                    ArrayList arrayList2 = c0463b.f4930u;
                    if (i20 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i20);
                    if (str4 != null) {
                        ((W) c0462a.f4897a.get(i20)).f4879b = qVar.b(str4);
                    }
                    i20++;
                }
                c0462a.c(1);
                if (E(i19)) {
                    StringBuilder k9 = Wv.k(i6, "restoreAllState: back stack #", " (index ");
                    k9.append(c0462a.f4913r);
                    k9.append("): ");
                    k9.append(c0462a);
                    Log.v("FragmentManager", k9.toString());
                    PrintWriter printWriter = new PrintWriter(new Y());
                    c0462a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4821d.add(c0462a);
                i6++;
                i = i19;
            }
            i4 = 0;
        } else {
            i4 = 0;
            this.f4821d = null;
        }
        this.i.set(p9.f4847w);
        String str5 = p9.f4848x;
        if (str5 != null) {
            AbstractComponentCallbacksC0479s b10 = qVar.b(str5);
            this.f4839w = b10;
            q(b10);
        }
        ArrayList arrayList3 = p9.f4849y;
        if (arrayList3 != null) {
            for (int i21 = i4; i21 < arrayList3.size(); i21++) {
                this.f4826j.put((String) arrayList3.get(i21), (C0464c) p9.f4850z.get(i21));
            }
        }
        this.f4808C = new ArrayDeque(p9.f4843A);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0463b[] c0463bArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0471j c0471j = (C0471j) it.next();
            if (c0471j.f4963e) {
                if (E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0471j.f4963e = false;
                c0471j.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0471j) it2.next()).e();
        }
        x(true);
        this.f4810E = true;
        this.f4816L.f4858f = true;
        l4.q qVar = this.f4820c;
        qVar.getClass();
        HashMap hashMap = (HashMap) qVar.f38946u;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (V v9 : hashMap.values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
                String str = abstractComponentCallbacksC0479s.f5034x;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = v9.f4875c;
                if (abstractComponentCallbacksC0479s2.f5024n == -1 && (bundle = abstractComponentCallbacksC0479s2.f5031u) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(com.anythink.core.express.b.a.f18313b, new U(abstractComponentCallbacksC0479s2));
                if (abstractComponentCallbacksC0479s2.f5024n > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0479s2.t(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    v9.f4873a.r(abstractComponentCallbacksC0479s2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0479s2.f5028q0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle R8 = abstractComponentCallbacksC0479s2.f5007M.R();
                    if (!R8.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", R8);
                    }
                    if (abstractComponentCallbacksC0479s2.f5018X != null) {
                        v9.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0479s2.f5032v;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0479s2.f5033w;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0479s2.f5035y;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                qVar.n(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0479s.f5034x);
                if (E(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0479s + ": " + abstractComponentCallbacksC0479s.f5031u);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f4820c.f38947v;
        if (!hashMap2.isEmpty()) {
            l4.q qVar2 = this.f4820c;
            synchronized (((ArrayList) qVar2.f38945n)) {
                try {
                    if (((ArrayList) qVar2.f38945n).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) qVar2.f38945n).size());
                        Iterator it3 = ((ArrayList) qVar2.f38945n).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = (AbstractComponentCallbacksC0479s) it3.next();
                            arrayList.add(abstractComponentCallbacksC0479s3.f5034x);
                            if (E(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0479s3.f5034x + "): " + abstractComponentCallbacksC0479s3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f4821d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0463bArr = null;
            } else {
                c0463bArr = new C0463b[size];
                for (i = 0; i < size; i++) {
                    c0463bArr[i] = new C0463b((C0462a) this.f4821d.get(i));
                    if (E(2)) {
                        StringBuilder k9 = Wv.k(i, "saveAllState: adding back stack #", ": ");
                        k9.append(this.f4821d.get(i));
                        Log.v("FragmentManager", k9.toString());
                    }
                }
            }
            P p9 = new P();
            p9.f4848x = null;
            ArrayList arrayList4 = new ArrayList();
            p9.f4849y = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            p9.f4850z = arrayList5;
            p9.f4844n = arrayList2;
            p9.f4845u = arrayList;
            p9.f4846v = c0463bArr;
            p9.f4847w = this.i.get();
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s4 = this.f4839w;
            if (abstractComponentCallbacksC0479s4 != null) {
                p9.f4848x = abstractComponentCallbacksC0479s4.f5034x;
            }
            arrayList4.addAll(this.f4826j.keySet());
            arrayList5.addAll(this.f4826j.values());
            p9.f4843A = new ArrayList(this.f4808C);
            bundle2.putParcelable(com.anythink.core.express.b.a.f18313b, p9);
            for (String str2 : this.f4827k.keySet()) {
                bundle2.putBundle(AbstractC5128c.f("result_", str2), (Bundle) this.f4827k.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(AbstractC5128c.f("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (E(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void S() {
        synchronized (this.f4818a) {
            try {
                if (this.f4818a.size() == 1) {
                    this.f4836t.f5043B.removeCallbacks(this.f4817M);
                    this.f4836t.f5043B.post(this.f4817M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, boolean z6) {
        ViewGroup A9 = A(abstractComponentCallbacksC0479s);
        if (A9 == null || !(A9 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A9).setDrawDisappearingViewsLast(!z6);
    }

    public final void U(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, EnumC0501o enumC0501o) {
        if (abstractComponentCallbacksC0479s.equals(this.f4820c.b(abstractComponentCallbacksC0479s.f5034x)) && (abstractComponentCallbacksC0479s.f5006L == null || abstractComponentCallbacksC0479s.f5005K == this)) {
            abstractComponentCallbacksC0479s.m0 = enumC0501o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0479s + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (abstractComponentCallbacksC0479s != null) {
            if (!abstractComponentCallbacksC0479s.equals(this.f4820c.b(abstractComponentCallbacksC0479s.f5034x)) || (abstractComponentCallbacksC0479s.f5006L != null && abstractComponentCallbacksC0479s.f5005K != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0479s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = this.f4839w;
        this.f4839w = abstractComponentCallbacksC0479s;
        q(abstractComponentCallbacksC0479s2);
        q(this.f4839w);
    }

    public final void W(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        ViewGroup A9 = A(abstractComponentCallbacksC0479s);
        if (A9 != null) {
            r rVar = abstractComponentCallbacksC0479s.f5020i0;
            if ((rVar == null ? 0 : rVar.f4989e) + (rVar == null ? 0 : rVar.f4988d) + (rVar == null ? 0 : rVar.f4987c) + (rVar == null ? 0 : rVar.f4986b) > 0) {
                if (A9.getTag(C5248R.id.visible_removing_fragment_view_tag) == null) {
                    A9.setTag(C5248R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0479s);
                }
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = (AbstractComponentCallbacksC0479s) A9.getTag(C5248R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0479s.f5020i0;
                boolean z6 = rVar2 != null ? rVar2.f4985a : false;
                if (abstractComponentCallbacksC0479s2.f5020i0 == null) {
                    return;
                }
                abstractComponentCallbacksC0479s2.b().f4985a = z6;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f4820c.d().iterator();
        while (it.hasNext()) {
            V v9 = (V) it.next();
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
            if (abstractComponentCallbacksC0479s.Y) {
                if (this.f4819b) {
                    this.f4813H = true;
                } else {
                    abstractComponentCallbacksC0479s.Y = false;
                    v9.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y());
        C0483w c0483w = this.f4836t;
        if (c0483w == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e9) {
                Log.e("FragmentManager", "Failed dumping state", e9);
                throw illegalStateException;
            }
        }
        try {
            c0483w.f5045D.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final V a(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        String str = abstractComponentCallbacksC0479s.f5023l0;
        if (str != null) {
            f0.d.c(abstractComponentCallbacksC0479s, str);
        }
        if (E(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0479s);
        }
        V f2 = f(abstractComponentCallbacksC0479s);
        abstractComponentCallbacksC0479s.f5005K = this;
        l4.q qVar = this.f4820c;
        qVar.j(f2);
        if (!abstractComponentCallbacksC0479s.f5013S) {
            qVar.a(abstractComponentCallbacksC0479s);
            abstractComponentCallbacksC0479s.f5000E = false;
            if (abstractComponentCallbacksC0479s.f5018X == null) {
                abstractComponentCallbacksC0479s.f5021j0 = false;
            }
            if (F(abstractComponentCallbacksC0479s)) {
                this.f4809D = true;
            }
        }
        return f2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [I7.a, kotlin.jvm.internal.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [I7.a, kotlin.jvm.internal.g] */
    public final void a0() {
        synchronized (this.f4818a) {
            try {
                if (!this.f4818a.isEmpty()) {
                    E e9 = this.f4825h;
                    e9.f4788a = true;
                    ?? r1 = e9.f4790c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                E e10 = this.f4825h;
                ArrayList arrayList = this.f4821d;
                e10.f4788a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f4838v);
                ?? r02 = e10.f4790c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0483w c0483w, X2.a aVar, AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (this.f4836t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4836t = c0483w;
        this.f4837u = aVar;
        this.f4838v = abstractComponentCallbacksC0479s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4829m;
        if (abstractComponentCallbacksC0479s != 0) {
            copyOnWriteArrayList.add(new H(abstractComponentCallbacksC0479s));
        } else if (c0483w != null) {
            copyOnWriteArrayList.add(c0483w);
        }
        if (this.f4838v != null) {
            a0();
        }
        if (c0483w != null) {
            androidx.activity.G onBackPressedDispatcher = c0483w.f5045D.getOnBackPressedDispatcher();
            this.f4824g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(abstractComponentCallbacksC0479s != 0 ? abstractComponentCallbacksC0479s : c0483w, this.f4825h);
        }
        if (abstractComponentCallbacksC0479s != 0) {
            S s9 = abstractComponentCallbacksC0479s.f5005K.f4816L;
            HashMap hashMap = s9.f4854b;
            S s10 = (S) hashMap.get(abstractComponentCallbacksC0479s.f5034x);
            if (s10 == null) {
                s10 = new S(s9.f4856d);
                hashMap.put(abstractComponentCallbacksC0479s.f5034x, s10);
            }
            this.f4816L = s10;
        } else if (c0483w != null) {
            this.f4816L = (S) new b3.e(c0483w.f5045D.getViewModelStore(), S.f4852g).u(S.class);
        } else {
            this.f4816L = new S(false);
        }
        S s11 = this.f4816L;
        s11.f4858f = this.f4810E || this.f4811F;
        this.f4820c.f38948w = s11;
        C0483w c0483w2 = this.f4836t;
        if (c0483w2 != null && abstractComponentCallbacksC0479s == 0) {
            C5180c savedStateRegistry = c0483w2.f5045D.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0480t(1, this));
            Bundle a9 = savedStateRegistry.a("android:support:fragments");
            if (a9 != null) {
                Q(a9);
            }
        }
        C0483w c0483w3 = this.f4836t;
        if (c0483w3 != null) {
            e.i activityResultRegistry = c0483w3.f5045D.getActivityResultRegistry();
            String f2 = AbstractC5128c.f("FragmentManager:", abstractComponentCallbacksC0479s != 0 ? Wv.i(new StringBuilder(), abstractComponentCallbacksC0479s.f5034x, ":") : "");
            this.f4842z = activityResultRegistry.c(Wv.g(f2, "StartActivityForResult"), new I(2), new C4585b(16, this));
            this.f4806A = activityResultRegistry.c(Wv.g(f2, "StartIntentSenderForResult"), new I(0), new C4586c(12, this));
            this.f4807B = activityResultRegistry.c(Wv.g(f2, "RequestPermissions"), new I(1), new I0.j(16, this));
        }
        C0483w c0483w4 = this.f4836t;
        if (c0483w4 != null) {
            c0483w4.f5045D.addOnConfigurationChangedListener(this.f4830n);
        }
        C0483w c0483w5 = this.f4836t;
        if (c0483w5 != null) {
            c0483w5.f5045D.addOnTrimMemoryListener(this.f4831o);
        }
        C0483w c0483w6 = this.f4836t;
        if (c0483w6 != null) {
            c0483w6.f5045D.addOnMultiWindowModeChangedListener(this.f4832p);
        }
        C0483w c0483w7 = this.f4836t;
        if (c0483w7 != null) {
            c0483w7.f5045D.addOnPictureInPictureModeChangedListener(this.f4833q);
        }
        C0483w c0483w8 = this.f4836t;
        if (c0483w8 == null || abstractComponentCallbacksC0479s != 0) {
            return;
        }
        c0483w8.f5045D.addMenuProvider(this.f4834r);
    }

    public final void c(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (E(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0479s);
        }
        if (abstractComponentCallbacksC0479s.f5013S) {
            abstractComponentCallbacksC0479s.f5013S = false;
            if (abstractComponentCallbacksC0479s.f4999D) {
                return;
            }
            this.f4820c.a(abstractComponentCallbacksC0479s);
            if (E(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0479s);
            }
            if (F(abstractComponentCallbacksC0479s)) {
                this.f4809D = true;
            }
        }
    }

    public final void d() {
        this.f4819b = false;
        this.J.clear();
        this.f4814I.clear();
    }

    public final HashSet e() {
        C0471j c0471j;
        HashSet hashSet = new HashSet();
        Iterator it = this.f4820c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((V) it.next()).f4875c.f5017W;
            if (viewGroup != null) {
                c4.e factory = C();
                kotlin.jvm.internal.h.e(factory, "factory");
                Object tag = viewGroup.getTag(C5248R.id.special_effects_controller_view_tag);
                if (tag instanceof C0471j) {
                    c0471j = (C0471j) tag;
                } else {
                    c0471j = new C0471j(viewGroup);
                    viewGroup.setTag(C5248R.id.special_effects_controller_view_tag, c0471j);
                }
                hashSet.add(c0471j);
            }
        }
        return hashSet;
    }

    public final V f(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        String str = abstractComponentCallbacksC0479s.f5034x;
        l4.q qVar = this.f4820c;
        V v9 = (V) ((HashMap) qVar.f38946u).get(str);
        if (v9 != null) {
            return v9;
        }
        V v10 = new V(this.f4828l, qVar, abstractComponentCallbacksC0479s);
        v10.m(this.f4836t.f5042A.getClassLoader());
        v10.f4877e = this.f4835s;
        return v10;
    }

    public final void g(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (E(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0479s);
        }
        if (abstractComponentCallbacksC0479s.f5013S) {
            return;
        }
        abstractComponentCallbacksC0479s.f5013S = true;
        if (abstractComponentCallbacksC0479s.f4999D) {
            if (E(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0479s);
            }
            l4.q qVar = this.f4820c;
            synchronized (((ArrayList) qVar.f38945n)) {
                ((ArrayList) qVar.f38945n).remove(abstractComponentCallbacksC0479s);
            }
            abstractComponentCallbacksC0479s.f4999D = false;
            if (F(abstractComponentCallbacksC0479s)) {
                this.f4809D = true;
            }
            W(abstractComponentCallbacksC0479s);
        }
    }

    public final void h(boolean z6) {
        if (z6 && this.f4836t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null) {
                abstractComponentCallbacksC0479s.f5016V = true;
                if (z6) {
                    abstractComponentCallbacksC0479s.f5007M.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f4835s >= 1) {
            for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
                if (abstractComponentCallbacksC0479s != null) {
                    if (!abstractComponentCallbacksC0479s.f5012R ? abstractComponentCallbacksC0479s.f5007M.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f4835s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null && H(abstractComponentCallbacksC0479s)) {
                if (!abstractComponentCallbacksC0479s.f5012R ? abstractComponentCallbacksC0479s.f5007M.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0479s);
                    z6 = true;
                }
            }
        }
        if (this.f4822e != null) {
            for (int i = 0; i < this.f4822e.size(); i++) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = (AbstractComponentCallbacksC0479s) this.f4822e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0479s2)) {
                    abstractComponentCallbacksC0479s2.getClass();
                }
            }
        }
        this.f4822e = arrayList;
        return z6;
    }

    public final void k() {
        boolean z6 = true;
        this.f4812G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0471j) it.next()).e();
        }
        C0483w c0483w = this.f4836t;
        l4.q qVar = this.f4820c;
        if (c0483w != null) {
            z6 = ((S) qVar.f38948w).f4857e;
        } else {
            AbstractActivityC0484x abstractActivityC0484x = c0483w.f5042A;
            if (abstractActivityC0484x != null) {
                z6 = true ^ abstractActivityC0484x.isChangingConfigurations();
            }
        }
        if (z6) {
            Iterator it2 = this.f4826j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0464c) it2.next()).f4937n) {
                    S s9 = (S) qVar.f38948w;
                    s9.getClass();
                    if (E(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    s9.c(str);
                }
            }
        }
        t(-1);
        C0483w c0483w2 = this.f4836t;
        if (c0483w2 != null) {
            c0483w2.f5045D.removeOnTrimMemoryListener(this.f4831o);
        }
        C0483w c0483w3 = this.f4836t;
        if (c0483w3 != null) {
            c0483w3.f5045D.removeOnConfigurationChangedListener(this.f4830n);
        }
        C0483w c0483w4 = this.f4836t;
        if (c0483w4 != null) {
            c0483w4.f5045D.removeOnMultiWindowModeChangedListener(this.f4832p);
        }
        C0483w c0483w5 = this.f4836t;
        if (c0483w5 != null) {
            c0483w5.f5045D.removeOnPictureInPictureModeChangedListener(this.f4833q);
        }
        C0483w c0483w6 = this.f4836t;
        if (c0483w6 != null && this.f4838v == null) {
            c0483w6.f5045D.removeMenuProvider(this.f4834r);
        }
        this.f4836t = null;
        this.f4837u = null;
        this.f4838v = null;
        if (this.f4824g != null) {
            Iterator it3 = this.f4825h.f4789b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0455c) it3.next()).cancel();
            }
            this.f4824g = null;
        }
        e.h hVar = this.f4842z;
        if (hVar != null) {
            hVar.f37196a.e(hVar.f37197b);
            e.h hVar2 = this.f4806A;
            hVar2.f37196a.e(hVar2.f37197b);
            e.h hVar3 = this.f4807B;
            hVar3.f37196a.e(hVar3.f37197b);
        }
    }

    public final void l(boolean z6) {
        if (z6 && this.f4836t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null) {
                abstractComponentCallbacksC0479s.f5016V = true;
                if (z6) {
                    abstractComponentCallbacksC0479s.f5007M.l(true);
                }
            }
        }
    }

    public final void m(boolean z6) {
        if (z6 && this.f4836t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null && z6) {
                abstractComponentCallbacksC0479s.f5007M.m(true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f4820c.e().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = (AbstractComponentCallbacksC0479s) it.next();
            if (abstractComponentCallbacksC0479s != null) {
                abstractComponentCallbacksC0479s.j();
                abstractComponentCallbacksC0479s.f5007M.n();
            }
        }
    }

    public final boolean o() {
        if (this.f4835s >= 1) {
            for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
                if (abstractComponentCallbacksC0479s != null) {
                    if (!abstractComponentCallbacksC0479s.f5012R ? abstractComponentCallbacksC0479s.f5007M.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f4835s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null && !abstractComponentCallbacksC0479s.f5012R) {
                abstractComponentCallbacksC0479s.f5007M.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        if (abstractComponentCallbacksC0479s != null) {
            if (abstractComponentCallbacksC0479s.equals(this.f4820c.b(abstractComponentCallbacksC0479s.f5034x))) {
                abstractComponentCallbacksC0479s.f5005K.getClass();
                boolean I8 = I(abstractComponentCallbacksC0479s);
                Boolean bool = abstractComponentCallbacksC0479s.f4998C;
                if (bool == null || bool.booleanValue() != I8) {
                    abstractComponentCallbacksC0479s.f4998C = Boolean.valueOf(I8);
                    O o4 = abstractComponentCallbacksC0479s.f5007M;
                    o4.a0();
                    o4.q(o4.f4839w);
                }
            }
        }
    }

    public final void r(boolean z6) {
        if (z6 && this.f4836t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null && z6) {
                abstractComponentCallbacksC0479s.f5007M.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f4835s < 1) {
            return false;
        }
        boolean z6 = false;
        for (AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s : this.f4820c.f()) {
            if (abstractComponentCallbacksC0479s != null && H(abstractComponentCallbacksC0479s)) {
                if (!abstractComponentCallbacksC0479s.f5012R ? abstractComponentCallbacksC0479s.f5007M.s() : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void t(int i) {
        try {
            this.f4819b = true;
            for (V v9 : ((HashMap) this.f4820c.f38946u).values()) {
                if (v9 != null) {
                    v9.f4877e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0471j) it.next()).e();
            }
            this.f4819b = false;
            x(true);
        } catch (Throwable th) {
            this.f4819b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4838v;
        if (abstractComponentCallbacksC0479s != null) {
            sb.append(abstractComponentCallbacksC0479s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4838v)));
            sb.append("}");
        } else {
            C0483w c0483w = this.f4836t;
            if (c0483w != null) {
                sb.append(c0483w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4836t)));
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
        String g9 = Wv.g(str, "    ");
        l4.q qVar = this.f4820c;
        qVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) qVar.f38946u;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (V v9 : hashMap.values()) {
                printWriter.print(str);
                if (v9 != null) {
                    AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
                    printWriter.println(abstractComponentCallbacksC0479s);
                    abstractComponentCallbacksC0479s.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0479s.f5009O));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0479s.f5010P));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0479s.f5011Q);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5024n);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5034x);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0479s.J);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0479s.f4999D);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5000E);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5001F);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0479s.f5002G);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5012R);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5013S);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5015U);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0479s.f5014T);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0479s.f5019Z);
                    if (abstractComponentCallbacksC0479s.f5005K != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5005K);
                    }
                    if (abstractComponentCallbacksC0479s.f5006L != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5006L);
                    }
                    if (abstractComponentCallbacksC0479s.f5008N != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5008N);
                    }
                    if (abstractComponentCallbacksC0479s.f5035y != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5035y);
                    }
                    if (abstractComponentCallbacksC0479s.f5031u != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5031u);
                    }
                    if (abstractComponentCallbacksC0479s.f5032v != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5032v);
                    }
                    if (abstractComponentCallbacksC0479s.f5033w != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5033w);
                    }
                    Object obj = abstractComponentCallbacksC0479s.f5036z;
                    if (obj == null) {
                        N n9 = abstractComponentCallbacksC0479s.f5005K;
                        obj = (n9 == null || (str2 = abstractComponentCallbacksC0479s.f4996A) == null) ? null : n9.f4820c.b(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0479s.f4997B);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0479s.f5020i0;
                    printWriter.println(rVar == null ? false : rVar.f4985a);
                    r rVar2 = abstractComponentCallbacksC0479s.f5020i0;
                    if ((rVar2 == null ? 0 : rVar2.f4986b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0479s.f5020i0;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f4986b);
                    }
                    r rVar4 = abstractComponentCallbacksC0479s.f5020i0;
                    if ((rVar4 == null ? 0 : rVar4.f4987c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0479s.f5020i0;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f4987c);
                    }
                    r rVar6 = abstractComponentCallbacksC0479s.f5020i0;
                    if ((rVar6 == null ? 0 : rVar6.f4988d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0479s.f5020i0;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f4988d);
                    }
                    r rVar8 = abstractComponentCallbacksC0479s.f5020i0;
                    if ((rVar8 == null ? 0 : rVar8.f4989e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0479s.f5020i0;
                        printWriter.println(rVar9 == null ? 0 : rVar9.f4989e);
                    }
                    if (abstractComponentCallbacksC0479s.f5017W != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5017W);
                    }
                    if (abstractComponentCallbacksC0479s.f5018X != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0479s.f5018X);
                    }
                    if (abstractComponentCallbacksC0479s.d() != null) {
                        s.l lVar = ((C4582b) new b3.e(abstractComponentCallbacksC0479s.getViewModelStore(), C4582b.f38143b).u(C4582b.class)).f38144a;
                        if (lVar.f40280v > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f40280v > 0) {
                                if (lVar.f40279u[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f40278n[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0479s.f5007M + ":");
                    abstractComponentCallbacksC0479s.f5007M.u(Wv.g(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) qVar.f38945n;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = (AbstractComponentCallbacksC0479s) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0479s2.toString());
            }
        }
        ArrayList arrayList2 = this.f4822e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = (AbstractComponentCallbacksC0479s) this.f4822e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0479s3.toString());
            }
        }
        ArrayList arrayList3 = this.f4821d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                C0462a c0462a = (C0462a) this.f4821d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0462a.toString());
                c0462a.f(g9, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f4818a) {
            try {
                int size4 = this.f4818a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size4; i9++) {
                        Object obj2 = (L) this.f4818a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
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
        printWriter.println(this.f4836t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4837u);
        if (this.f4838v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4838v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4835s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4810E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4811F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4812G);
        if (this.f4809D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4809D);
        }
    }

    public final void v(L l9, boolean z6) {
        if (!z6) {
            if (this.f4836t == null) {
                if (!this.f4812G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f4810E || this.f4811F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4818a) {
            try {
                if (this.f4836t == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4818a.add(l9);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z6) {
        if (this.f4819b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4836t == null) {
            if (!this.f4812G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4836t.f5043B.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && (this.f4810E || this.f4811F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4814I == null) {
            this.f4814I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z6) {
        boolean z9;
        w(z6);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f4814I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f4818a) {
                if (this.f4818a.isEmpty()) {
                    z9 = false;
                } else {
                    try {
                        int size = this.f4818a.size();
                        z9 = false;
                        for (int i = 0; i < size; i++) {
                            z9 |= ((L) this.f4818a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z9) {
                break;
            }
            z10 = true;
            this.f4819b = true;
            try {
                P(this.f4814I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4813H) {
            this.f4813H = false;
            Y();
        }
        ((HashMap) this.f4820c.f38946u).values().removeAll(Collections.singleton(null));
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x04c0, code lost:
    
        r10 = (androidx.fragment.app.a0) r10;
        r7.f4963e = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i4) {
        Object obj;
        ViewGroup viewGroup;
        boolean z6;
        int i6;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = ((C0462a) arrayList.get(i)).f4910o;
        ArrayList arrayList3 = this.f4815K;
        if (arrayList3 == null) {
            this.f4815K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f4815K;
        l4.q qVar = this.f4820c;
        arrayList4.addAll(qVar.f());
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = this.f4839w;
        int i12 = i;
        boolean z14 = false;
        while (true) {
            int i13 = 1;
            if (i12 >= i4) {
                boolean z15 = z13;
                this.f4815K.clear();
                if (!z15 && this.f4835s >= 1) {
                    for (int i14 = i; i14 < i4; i14++) {
                        Iterator it = ((C0462a) arrayList.get(i14)).f4897a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = ((W) it.next()).f4879b;
                            if (abstractComponentCallbacksC0479s2 != null && abstractComponentCallbacksC0479s2.f5005K != null) {
                                qVar.j(f(abstractComponentCallbacksC0479s2));
                            }
                        }
                    }
                }
                for (int i15 = i; i15 < i4; i15++) {
                    C0462a c0462a = (C0462a) arrayList.get(i15);
                    if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                        c0462a.c(-1);
                        ArrayList arrayList5 = c0462a.f4897a;
                        boolean z16 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            W w3 = (W) arrayList5.get(size);
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s3 = w3.f4879b;
                            if (abstractComponentCallbacksC0479s3 != null) {
                                if (abstractComponentCallbacksC0479s3.f5020i0 != null) {
                                    abstractComponentCallbacksC0479s3.b().f4985a = z16;
                                }
                                int i16 = c0462a.f4902f;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                                if (abstractComponentCallbacksC0479s3.f5020i0 != null || i17 != 0) {
                                    abstractComponentCallbacksC0479s3.b();
                                    abstractComponentCallbacksC0479s3.f5020i0.f4990f = i17;
                                }
                                abstractComponentCallbacksC0479s3.b();
                                abstractComponentCallbacksC0479s3.f5020i0.getClass();
                            }
                            int i19 = w3.f4878a;
                            N n9 = c0462a.f4911p;
                            switch (i19) {
                                case 1:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    z16 = true;
                                    n9.T(abstractComponentCallbacksC0479s3, true);
                                    n9.O(abstractComponentCallbacksC0479s3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w3.f4878a);
                                case 3:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    n9.a(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 4:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    n9.getClass();
                                    X(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 5:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    n9.T(abstractComponentCallbacksC0479s3, true);
                                    n9.D(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 6:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    n9.c(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 7:
                                    abstractComponentCallbacksC0479s3.A(w3.f4881d, w3.f4882e, w3.f4883f, w3.f4884g);
                                    n9.T(abstractComponentCallbacksC0479s3, true);
                                    n9.g(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 8:
                                    n9.V(null);
                                    z16 = true;
                                case 9:
                                    n9.V(abstractComponentCallbacksC0479s3);
                                    z16 = true;
                                case 10:
                                    n9.U(abstractComponentCallbacksC0479s3, w3.f4885h);
                                    z16 = true;
                            }
                        }
                    } else {
                        c0462a.c(1);
                        ArrayList arrayList6 = c0462a.f4897a;
                        int size2 = arrayList6.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            W w6 = (W) arrayList6.get(i20);
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s4 = w6.f4879b;
                            if (abstractComponentCallbacksC0479s4 != null) {
                                if (abstractComponentCallbacksC0479s4.f5020i0 != null) {
                                    abstractComponentCallbacksC0479s4.b().f4985a = false;
                                }
                                int i21 = c0462a.f4902f;
                                if (abstractComponentCallbacksC0479s4.f5020i0 != null || i21 != 0) {
                                    abstractComponentCallbacksC0479s4.b();
                                    abstractComponentCallbacksC0479s4.f5020i0.f4990f = i21;
                                }
                                abstractComponentCallbacksC0479s4.b();
                                abstractComponentCallbacksC0479s4.f5020i0.getClass();
                            }
                            int i22 = w6.f4878a;
                            N n10 = c0462a.f4911p;
                            switch (i22) {
                                case 1:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.T(abstractComponentCallbacksC0479s4, false);
                                    n10.a(abstractComponentCallbacksC0479s4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w6.f4878a);
                                case 3:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.O(abstractComponentCallbacksC0479s4);
                                case 4:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.D(abstractComponentCallbacksC0479s4);
                                case 5:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.T(abstractComponentCallbacksC0479s4, false);
                                    X(abstractComponentCallbacksC0479s4);
                                case 6:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.g(abstractComponentCallbacksC0479s4);
                                case 7:
                                    abstractComponentCallbacksC0479s4.A(w6.f4881d, w6.f4882e, w6.f4883f, w6.f4884g);
                                    n10.T(abstractComponentCallbacksC0479s4, false);
                                    n10.c(abstractComponentCallbacksC0479s4);
                                case 8:
                                    n10.V(abstractComponentCallbacksC0479s4);
                                case 9:
                                    n10.V(null);
                                case 10:
                                    n10.U(abstractComponentCallbacksC0479s4, w6.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i23 = i; i23 < i4; i23++) {
                    C0462a c0462a2 = (C0462a) arrayList.get(i23);
                    if (booleanValue) {
                        for (int size3 = c0462a2.f4897a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s5 = ((W) c0462a2.f4897a.get(size3)).f4879b;
                            if (abstractComponentCallbacksC0479s5 != null) {
                                f(abstractComponentCallbacksC0479s5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0462a2.f4897a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s6 = ((W) it2.next()).f4879b;
                            if (abstractComponentCallbacksC0479s6 != null) {
                                f(abstractComponentCallbacksC0479s6).k();
                            }
                        }
                    }
                }
                J(this.f4835s, true);
                HashSet hashSet = new HashSet();
                for (int i24 = i; i24 < i4; i24++) {
                    Iterator it3 = ((C0462a) arrayList.get(i24)).f4897a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s7 = ((W) it3.next()).f4879b;
                        if (abstractComponentCallbacksC0479s7 != null && (viewGroup = abstractComponentCallbacksC0479s7.f5017W) != null) {
                            hashSet.add(C0471j.f(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0471j c0471j = (C0471j) it4.next();
                    c0471j.f4962d = booleanValue;
                    synchronized (c0471j.f4960b) {
                        try {
                            c0471j.g();
                            ArrayList arrayList7 = c0471j.f4960b;
                            ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    a0 a0Var = (a0) obj;
                                    View view = a0Var.f4916c.f5018X;
                                    kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
                                    char c9 = 4;
                                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                        int visibility = view.getVisibility();
                                        if (visibility == 0) {
                                            c9 = 2;
                                        } else if (visibility != 4) {
                                            if (visibility != 8) {
                                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
                                            c9 = 3;
                                        }
                                    }
                                    if (a0Var.f4914a != 2 || c9 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0471j.c();
                }
                for (int i25 = i; i25 < i4; i25++) {
                    C0462a c0462a3 = (C0462a) arrayList.get(i25);
                    if (((Boolean) arrayList2.get(i25)).booleanValue() && c0462a3.f4913r >= 0) {
                        c0462a3.f4913r = -1;
                    }
                    c0462a3.getClass();
                }
                return;
            }
            C0462a c0462a4 = (C0462a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                z6 = z13;
                i6 = i12;
                z9 = z14;
                int i26 = 1;
                ArrayList arrayList8 = this.f4815K;
                ArrayList arrayList9 = c0462a4.f4897a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    W w9 = (W) arrayList9.get(size4);
                    int i27 = w9.f4878a;
                    if (i27 != i26) {
                        if (i27 != 3) {
                            switch (i27) {
                                case 8:
                                    abstractComponentCallbacksC0479s = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0479s = w9.f4879b;
                                    break;
                                case 10:
                                    w9.i = w9.f4885h;
                                    break;
                            }
                            size4--;
                            i26 = 1;
                        }
                        arrayList8.add(w9.f4879b);
                        size4--;
                        i26 = 1;
                    }
                    arrayList8.remove(w9.f4879b);
                    size4--;
                    i26 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f4815K;
                int i28 = 0;
                while (true) {
                    ArrayList arrayList11 = c0462a4.f4897a;
                    if (i28 < arrayList11.size()) {
                        W w10 = (W) arrayList11.get(i28);
                        int i29 = w10.f4878a;
                        if (i29 != i13) {
                            z10 = z13;
                            if (i29 != 2) {
                                if (i29 == 3 || i29 == 6) {
                                    arrayList10.remove(w10.f4879b);
                                    AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s8 = w10.f4879b;
                                    if (abstractComponentCallbacksC0479s8 == abstractComponentCallbacksC0479s) {
                                        arrayList11.add(i28, new W(9, abstractComponentCallbacksC0479s8));
                                        i28++;
                                        i10 = i12;
                                        z11 = z14;
                                        i9 = 1;
                                        abstractComponentCallbacksC0479s = null;
                                    }
                                } else if (i29 == 7) {
                                    i9 = 1;
                                } else if (i29 == 8) {
                                    arrayList11.add(i28, new W(9, abstractComponentCallbacksC0479s, 0));
                                    w10.f4880c = true;
                                    i28++;
                                    abstractComponentCallbacksC0479s = w10.f4879b;
                                }
                                i10 = i12;
                                z11 = z14;
                                i9 = 1;
                            } else {
                                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s9 = w10.f4879b;
                                int i30 = abstractComponentCallbacksC0479s9.f5010P;
                                int size5 = arrayList10.size() - 1;
                                boolean z17 = false;
                                while (size5 >= 0) {
                                    int i31 = size5;
                                    AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s10 = (AbstractComponentCallbacksC0479s) arrayList10.get(size5);
                                    int i32 = i12;
                                    if (abstractComponentCallbacksC0479s10.f5010P != i30) {
                                        z12 = z14;
                                    } else if (abstractComponentCallbacksC0479s10 == abstractComponentCallbacksC0479s9) {
                                        z12 = z14;
                                        z17 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0479s10 == abstractComponentCallbacksC0479s) {
                                            z12 = z14;
                                            i11 = 0;
                                            arrayList11.add(i28, new W(9, abstractComponentCallbacksC0479s10, 0));
                                            i28++;
                                            abstractComponentCallbacksC0479s = null;
                                        } else {
                                            z12 = z14;
                                            i11 = 0;
                                        }
                                        W w11 = new W(3, abstractComponentCallbacksC0479s10, i11);
                                        w11.f4881d = w10.f4881d;
                                        w11.f4883f = w10.f4883f;
                                        w11.f4882e = w10.f4882e;
                                        w11.f4884g = w10.f4884g;
                                        arrayList11.add(i28, w11);
                                        arrayList10.remove(abstractComponentCallbacksC0479s10);
                                        i28++;
                                        abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s;
                                    }
                                    size5 = i31 - 1;
                                    z14 = z12;
                                    i12 = i32;
                                }
                                i10 = i12;
                                z11 = z14;
                                i9 = 1;
                                if (z17) {
                                    arrayList11.remove(i28);
                                    i28--;
                                } else {
                                    w10.f4878a = 1;
                                    w10.f4880c = true;
                                    arrayList10.add(abstractComponentCallbacksC0479s9);
                                }
                            }
                            i28 += i9;
                            i13 = i9;
                            z13 = z10;
                            z14 = z11;
                            i12 = i10;
                        } else {
                            z10 = z13;
                            i9 = i13;
                        }
                        i10 = i12;
                        z11 = z14;
                        arrayList10.add(w10.f4879b);
                        i28 += i9;
                        i13 = i9;
                        z13 = z10;
                        z14 = z11;
                        i12 = i10;
                    } else {
                        z6 = z13;
                        i6 = i12;
                        z9 = z14;
                    }
                }
            }
            z14 = z9 || c0462a4.f4903g;
            i12 = i6 + 1;
            z13 = z6;
        }
    }

    public final AbstractComponentCallbacksC0479s z(int i) {
        l4.q qVar = this.f4820c;
        ArrayList arrayList = (ArrayList) qVar.f38945n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = (AbstractComponentCallbacksC0479s) arrayList.get(size);
            if (abstractComponentCallbacksC0479s != null && abstractComponentCallbacksC0479s.f5009O == i) {
                return abstractComponentCallbacksC0479s;
            }
        }
        for (V v9 : ((HashMap) qVar.f38946u).values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s2 = v9.f4875c;
                if (abstractComponentCallbacksC0479s2.f5009O == i) {
                    return abstractComponentCallbacksC0479s2;
                }
            }
        }
        return null;
    }
}
