package androidx.fragment.app;

import D.C0296o;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.InterfaceC0451c;
import androidx.lifecycle.EnumC0497o;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishingapp.icefishing.AbstractC4404f;
import com.icefishingapp.icefishing.C5275R;
import g1.C4522b;
import i0.C4577b;
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
import x0.C5181c;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: A, reason: collision with root package name */
    public e.h f4838A;

    /* renamed from: B, reason: collision with root package name */
    public e.h f4839B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayDeque f4840C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4841D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4842E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4843F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4844G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4845H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f4846I;
    public ArrayList J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f4847K;

    /* renamed from: L, reason: collision with root package name */
    public S f4848L;

    /* renamed from: M, reason: collision with root package name */
    public final G0.c f4849M;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4851b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4853d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4854e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.G f4856g;

    /* renamed from: l, reason: collision with root package name */
    public final C2991bm f4860l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f4861m;

    /* renamed from: n, reason: collision with root package name */
    public final D f4862n;

    /* renamed from: o, reason: collision with root package name */
    public final D f4863o;

    /* renamed from: p, reason: collision with root package name */
    public final D f4864p;

    /* renamed from: q, reason: collision with root package name */
    public final D f4865q;

    /* renamed from: r, reason: collision with root package name */
    public final F f4866r;

    /* renamed from: s, reason: collision with root package name */
    public int f4867s;

    /* renamed from: t, reason: collision with root package name */
    public C0479w f4868t;

    /* renamed from: u, reason: collision with root package name */
    public S0.f f4869u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0475s f4870v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0475s f4871w;

    /* renamed from: x, reason: collision with root package name */
    public final G f4872x;

    /* renamed from: y, reason: collision with root package name */
    public final M2.i f4873y;

    /* renamed from: z, reason: collision with root package name */
    public e.h f4874z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4850a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final S0.n f4852c = new S0.n(3);

    /* renamed from: f, reason: collision with root package name */
    public final B f4855f = new B(this);

    /* renamed from: h, reason: collision with root package name */
    public final E f4857h = new E(this);
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f4858j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    public final Map f4859k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.D] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.D] */
    public N() {
        Collections.synchronizedMap(new HashMap());
        this.f4860l = new C2991bm(this);
        this.f4861m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f4862n = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4819b;

            {
                this.f4819b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        N n9 = this.f4819b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4819b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0296o c0296o = (C0296o) obj;
                        N n11 = this.f4819b;
                        if (n11.G()) {
                            boolean z3 = c0296o.f481a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o6 = (D.O) obj;
                        N n12 = this.f4819b;
                        if (n12.G()) {
                            boolean z6 = o6.f462a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 1;
        this.f4863o = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4819b;

            {
                this.f4819b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        N n9 = this.f4819b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4819b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0296o c0296o = (C0296o) obj;
                        N n11 = this.f4819b;
                        if (n11.G()) {
                            boolean z3 = c0296o.f481a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o6 = (D.O) obj;
                        N n12 = this.f4819b;
                        if (n12.G()) {
                            boolean z6 = o6.f462a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 2;
        this.f4864p = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4819b;

            {
                this.f4819b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        N n9 = this.f4819b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4819b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0296o c0296o = (C0296o) obj;
                        N n11 = this.f4819b;
                        if (n11.G()) {
                            boolean z3 = c0296o.f481a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o6 = (D.O) obj;
                        N n12 = this.f4819b;
                        if (n12.G()) {
                            boolean z6 = o6.f462a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 3;
        this.f4865q = new N.a(this) { // from class: androidx.fragment.app.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N f4819b;

            {
                this.f4819b = this;
            }

            @Override // N.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        N n9 = this.f4819b;
                        if (n9.G()) {
                            n9.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        N n10 = this.f4819b;
                        if (n10.G() && num.intValue() == 80) {
                            n10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        C0296o c0296o = (C0296o) obj;
                        N n11 = this.f4819b;
                        if (n11.G()) {
                            boolean z3 = c0296o.f481a;
                            n11.m(false);
                            break;
                        }
                        break;
                    default:
                        D.O o6 = (D.O) obj;
                        N n12 = this.f4819b;
                        if (n12.G()) {
                            boolean z6 = o6.f462a;
                            n12.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f4866r = new F(this);
        this.f4867s = -1;
        this.f4872x = new G(this);
        this.f4873y = new M2.i(13);
        this.f4840C = new ArrayDeque();
        this.f4849M = new G0.c(18, this);
    }

    public static boolean E(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean F(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        abstractComponentCallbacksC0475s.getClass();
        Iterator it = abstractComponentCallbacksC0475s.f5039M.f4852c.k().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = (AbstractComponentCallbacksC0475s) it.next();
            if (abstractComponentCallbacksC0475s2 != null) {
                z3 = F(abstractComponentCallbacksC0475s2);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (abstractComponentCallbacksC0475s == null) {
            return true;
        }
        if (abstractComponentCallbacksC0475s.f5047U) {
            return abstractComponentCallbacksC0475s.f5037K == null || H(abstractComponentCallbacksC0475s.f5040N);
        }
        return false;
    }

    public static boolean I(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (abstractComponentCallbacksC0475s == null) {
            return true;
        }
        N n9 = abstractComponentCallbacksC0475s.f5037K;
        return abstractComponentCallbacksC0475s.equals(n9.f4871w) && I(n9.f4870v);
    }

    public static void X(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (E(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0475s);
        }
        if (abstractComponentCallbacksC0475s.f5044R) {
            abstractComponentCallbacksC0475s.f5044R = false;
            abstractComponentCallbacksC0475s.f5054o0 = !abstractComponentCallbacksC0475s.f5054o0;
        }
    }

    public final ViewGroup A(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0475s.f5049W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0475s.f5042P <= 0 || !this.f4869u.r()) {
            return null;
        }
        View o6 = this.f4869u.o(abstractComponentCallbacksC0475s.f5042P);
        if (o6 instanceof ViewGroup) {
            return (ViewGroup) o6;
        }
        return null;
    }

    public final G B() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4870v;
        return abstractComponentCallbacksC0475s != null ? abstractComponentCallbacksC0475s.f5037K.B() : this.f4872x;
    }

    public final M2.i C() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4870v;
        return abstractComponentCallbacksC0475s != null ? abstractComponentCallbacksC0475s.f5037K.C() : this.f4873y;
    }

    public final void D(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (E(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0475s);
        }
        if (abstractComponentCallbacksC0475s.f5044R) {
            return;
        }
        abstractComponentCallbacksC0475s.f5044R = true;
        abstractComponentCallbacksC0475s.f5054o0 = true ^ abstractComponentCallbacksC0475s.f5054o0;
        W(abstractComponentCallbacksC0475s);
    }

    public final boolean G() {
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4870v;
        if (abstractComponentCallbacksC0475s == null) {
            return true;
        }
        return abstractComponentCallbacksC0475s.i() && this.f4870v.f().G();
    }

    public final void J(int i, boolean z3) {
        HashMap hashMap;
        C0479w c0479w;
        if (this.f4868t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i != this.f4867s) {
            this.f4867s = i;
            S0.n nVar = this.f4852c;
            Iterator it = ((ArrayList) nVar.f2802u).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) nVar.f2803v;
                if (!hasNext) {
                    break;
                }
                V v9 = (V) hashMap.get(((AbstractComponentCallbacksC0475s) it.next()).f5066x);
                if (v9 != null) {
                    v9.k();
                }
            }
            for (V v10 : hashMap.values()) {
                if (v10 != null) {
                    v10.k();
                    AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v10.f4907c;
                    if (abstractComponentCallbacksC0475s.f5032E && !abstractComponentCallbacksC0475s.k()) {
                        nVar.n(v10);
                    }
                }
            }
            Y();
            if (this.f4841D && (c0479w = this.f4868t) != null && this.f4867s == 7) {
                c0479w.f5079x.invalidateMenu();
                this.f4841D = false;
            }
        }
    }

    public final void K() {
        if (this.f4868t == null) {
            return;
        }
        this.f4842E = false;
        this.f4843F = false;
        this.f4848L.f4890f = false;
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null) {
                abstractComponentCallbacksC0475s.f5039M.K();
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i, int i6) {
        x(false);
        w(true);
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4871w;
        if (abstractComponentCallbacksC0475s != null && i < 0 && abstractComponentCallbacksC0475s.c().L()) {
            return true;
        }
        boolean N8 = N(this.f4846I, this.J, i, i6);
        if (N8) {
            this.f4851b = true;
            try {
                P(this.f4846I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4845H) {
            this.f4845H = false;
            Y();
        }
        ((HashMap) this.f4852c.f2803v).values().removeAll(Collections.singleton(null));
        return N8;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i, int i6) {
        boolean z3 = (i6 & 1) != 0;
        ArrayList arrayList3 = this.f4853d;
        int i9 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i9 = z3 ? 0 : this.f4853d.size() - 1;
            } else {
                int size = this.f4853d.size() - 1;
                while (size >= 0) {
                    C0458a c0458a = (C0458a) this.f4853d.get(size);
                    if (i >= 0 && i == c0458a.f4945r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i9 = size;
                } else if (z3) {
                    i9 = size;
                    while (i9 > 0) {
                        C0458a c0458a2 = (C0458a) this.f4853d.get(i9 - 1);
                        if (i < 0 || i != c0458a2.f4945r) {
                            break;
                        }
                        i9--;
                    }
                } else if (size != this.f4853d.size() - 1) {
                    i9 = size + 1;
                }
            }
        }
        if (i9 < 0) {
            return false;
        }
        for (int size2 = this.f4853d.size() - 1; size2 >= i9; size2--) {
            arrayList.add((C0458a) this.f4853d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (E(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0475s + " nesting=" + abstractComponentCallbacksC0475s.J);
        }
        boolean k9 = abstractComponentCallbacksC0475s.k();
        if (abstractComponentCallbacksC0475s.f5045S && k9) {
            return;
        }
        S0.n nVar = this.f4852c;
        synchronized (((ArrayList) nVar.f2802u)) {
            ((ArrayList) nVar.f2802u).remove(abstractComponentCallbacksC0475s);
        }
        abstractComponentCallbacksC0475s.f5031D = false;
        if (F(abstractComponentCallbacksC0475s)) {
            this.f4841D = true;
        }
        abstractComponentCallbacksC0475s.f5032E = true;
        W(abstractComponentCallbacksC0475s);
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
        int i6 = 0;
        while (i < size) {
            if (!((C0458a) arrayList.get(i)).f4942o) {
                if (i6 != i) {
                    y(arrayList, arrayList2, i6, i);
                }
                i6 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i6 < size && ((Boolean) arrayList2.get(i6)).booleanValue() && !((C0458a) arrayList.get(i6)).f4942o) {
                        i6++;
                    }
                }
                y(arrayList, arrayList2, i, i6);
                i = i6 - 1;
            }
            i++;
        }
        if (i6 != size) {
            y(arrayList, arrayList2, i6, size);
        }
    }

    public final void Q(Bundle bundle) {
        int i;
        C2991bm c2991bm;
        int i6;
        V v9;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f4868t.f5076u.getClassLoader());
                this.f4859k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f4868t.f5076u.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        S0.n nVar = this.f4852c;
        HashMap hashMap2 = (HashMap) nVar.f2804w;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        P p9 = (P) bundle.getParcelable(com.anythink.core.express.b.a.f17526b);
        if (p9 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) nVar.f2803v;
        hashMap3.clear();
        Iterator it = p9.f4876n.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = 2;
            c2991bm = this.f4860l;
            if (!hasNext) {
                break;
            }
            Bundle r9 = nVar.r((String) it.next(), null);
            if (r9 != null) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = (AbstractComponentCallbacksC0475s) this.f4848L.f4885a.get(((U) r9.getParcelable(com.anythink.core.express.b.a.f17526b)).f4899u);
                if (abstractComponentCallbacksC0475s != null) {
                    if (E(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0475s);
                    }
                    v9 = new V(c2991bm, nVar, abstractComponentCallbacksC0475s, r9);
                } else {
                    v9 = new V(this.f4860l, this.f4852c, this.f4868t.f5076u.getClassLoader(), B(), r9);
                }
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = v9.f4907c;
                abstractComponentCallbacksC0475s2.f5060u = r9;
                abstractComponentCallbacksC0475s2.f5037K = this;
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0475s2.f5066x + "): " + abstractComponentCallbacksC0475s2);
                }
                v9.m(this.f4868t.f5076u.getClassLoader());
                nVar.m(v9);
                v9.f4909e = this.f4867s;
            }
        }
        S s9 = this.f4848L;
        s9.getClass();
        Iterator it2 = new ArrayList(s9.f4885a.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = (AbstractComponentCallbacksC0475s) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0475s3.f5066x) == null) {
                if (E(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0475s3 + " that was not found in the set of active Fragments " + p9.f4876n);
                }
                this.f4848L.d(abstractComponentCallbacksC0475s3);
                abstractComponentCallbacksC0475s3.f5037K = this;
                V v10 = new V(c2991bm, nVar, abstractComponentCallbacksC0475s3);
                v10.f4909e = 1;
                v10.k();
                abstractComponentCallbacksC0475s3.f5032E = true;
                v10.k();
            }
        }
        ArrayList<String> arrayList = p9.f4877u;
        ((ArrayList) nVar.f2802u).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0475s h9 = nVar.h(str3);
                if (h9 == null) {
                    throw new IllegalStateException(D.y.o("No instantiated fragment for (", str3, ")"));
                }
                if (E(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h9);
                }
                nVar.f(h9);
            }
        }
        if (p9.f4878v != null) {
            this.f4853d = new ArrayList(p9.f4878v.length);
            int i9 = 0;
            while (true) {
                C0459b[] c0459bArr = p9.f4878v;
                if (i9 >= c0459bArr.length) {
                    break;
                }
                C0459b c0459b = c0459bArr[i9];
                c0459b.getClass();
                C0458a c0458a = new C0458a(this);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = c0459b.f4961n;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    W w6 = new W();
                    int i12 = i10 + 1;
                    int i13 = i;
                    w6.f4910a = iArr[i10];
                    if (E(i13)) {
                        Log.v("FragmentManager", "Instantiate " + c0458a + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    w6.f4917h = EnumC0497o.values()[c0459b.f4963v[i11]];
                    w6.i = EnumC0497o.values()[c0459b.f4964w[i11]];
                    int i14 = i10 + 2;
                    w6.f4912c = iArr[i12] != 0;
                    int i15 = iArr[i14];
                    w6.f4913d = i15;
                    int i16 = iArr[i10 + 3];
                    w6.f4914e = i16;
                    int i17 = i10 + 5;
                    int i18 = iArr[i10 + 4];
                    w6.f4915f = i18;
                    i10 += 6;
                    int i19 = iArr[i17];
                    w6.f4916g = i19;
                    c0458a.f4930b = i15;
                    c0458a.f4931c = i16;
                    c0458a.f4932d = i18;
                    c0458a.f4933e = i19;
                    c0458a.b(w6);
                    i11++;
                    i = i13;
                }
                int i20 = i;
                c0458a.f4934f = c0459b.f4965x;
                c0458a.f4936h = c0459b.f4966y;
                c0458a.f4935g = true;
                c0458a.i = c0459b.f4954A;
                c0458a.f4937j = c0459b.f4955B;
                c0458a.f4938k = c0459b.f4956C;
                c0458a.f4939l = c0459b.f4957D;
                c0458a.f4940m = c0459b.f4958E;
                c0458a.f4941n = c0459b.f4959F;
                c0458a.f4942o = c0459b.f4960G;
                c0458a.f4945r = c0459b.f4967z;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList2 = c0459b.f4962u;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i21);
                    if (str4 != null) {
                        ((W) c0458a.f4929a.get(i21)).f4911b = nVar.h(str4);
                    }
                    i21++;
                }
                c0458a.c(1);
                if (E(i20)) {
                    StringBuilder i22 = AbstractC4404f.i(i9, "restoreAllState: back stack #", " (index ");
                    i22.append(c0458a.f4945r);
                    i22.append("): ");
                    i22.append(c0458a);
                    Log.v("FragmentManager", i22.toString());
                    PrintWriter printWriter = new PrintWriter(new Y());
                    c0458a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4853d.add(c0458a);
                i9++;
                i = i20;
            }
            i6 = 0;
        } else {
            i6 = 0;
            this.f4853d = null;
        }
        this.i.set(p9.f4879w);
        String str5 = p9.f4880x;
        if (str5 != null) {
            AbstractComponentCallbacksC0475s h10 = nVar.h(str5);
            this.f4871w = h10;
            q(h10);
        }
        ArrayList arrayList3 = p9.f4881y;
        if (arrayList3 != null) {
            for (int i23 = i6; i23 < arrayList3.size(); i23++) {
                this.f4858j.put((String) arrayList3.get(i23), (C0460c) p9.f4882z.get(i23));
            }
        }
        this.f4840C = new ArrayDeque(p9.f4875A);
    }

    public final Bundle R() {
        int i;
        ArrayList arrayList;
        C0459b[] c0459bArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0467j c0467j = (C0467j) it.next();
            if (c0467j.f4995e) {
                if (E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0467j.f4995e = false;
                c0467j.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0467j) it2.next()).e();
        }
        x(true);
        this.f4842E = true;
        this.f4848L.f4890f = true;
        S0.n nVar = this.f4852c;
        nVar.getClass();
        HashMap hashMap = (HashMap) nVar.f2803v;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (V v9 : hashMap.values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
                String str = abstractComponentCallbacksC0475s.f5066x;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = v9.f4907c;
                if (abstractComponentCallbacksC0475s2.f5052n == -1 && (bundle = abstractComponentCallbacksC0475s2.f5060u) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(com.anythink.core.express.b.a.f17526b, new U(abstractComponentCallbacksC0475s2));
                if (abstractComponentCallbacksC0475s2.f5052n > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0475s2.t(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    v9.f4905a.K(abstractComponentCallbacksC0475s2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0475s2.f5063v0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle R8 = abstractComponentCallbacksC0475s2.f5039M.R();
                    if (!R8.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", R8);
                    }
                    if (abstractComponentCallbacksC0475s2.f5050X != null) {
                        v9.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0475s2.f5062v;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0475s2.f5064w;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0475s2.f5068y;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                nVar.r(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0475s.f5066x);
                if (E(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0475s + ": " + abstractComponentCallbacksC0475s.f5060u);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f4852c.f2804w;
        if (!hashMap2.isEmpty()) {
            S0.n nVar2 = this.f4852c;
            synchronized (((ArrayList) nVar2.f2802u)) {
                try {
                    if (((ArrayList) nVar2.f2802u).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) nVar2.f2802u).size());
                        Iterator it3 = ((ArrayList) nVar2.f2802u).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = (AbstractComponentCallbacksC0475s) it3.next();
                            arrayList.add(abstractComponentCallbacksC0475s3.f5066x);
                            if (E(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0475s3.f5066x + "): " + abstractComponentCallbacksC0475s3);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f4853d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0459bArr = null;
            } else {
                c0459bArr = new C0459b[size];
                for (i = 0; i < size; i++) {
                    c0459bArr[i] = new C0459b((C0458a) this.f4853d.get(i));
                    if (E(2)) {
                        StringBuilder i6 = AbstractC4404f.i(i, "saveAllState: adding back stack #", ": ");
                        i6.append(this.f4853d.get(i));
                        Log.v("FragmentManager", i6.toString());
                    }
                }
            }
            P p9 = new P();
            p9.f4880x = null;
            ArrayList arrayList4 = new ArrayList();
            p9.f4881y = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            p9.f4882z = arrayList5;
            p9.f4876n = arrayList2;
            p9.f4877u = arrayList;
            p9.f4878v = c0459bArr;
            p9.f4879w = this.i.get();
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s4 = this.f4871w;
            if (abstractComponentCallbacksC0475s4 != null) {
                p9.f4880x = abstractComponentCallbacksC0475s4.f5066x;
            }
            arrayList4.addAll(this.f4858j.keySet());
            arrayList5.addAll(this.f4858j.values());
            p9.f4875A = new ArrayList(this.f4840C);
            bundle2.putParcelable(com.anythink.core.express.b.a.f17526b, p9);
            for (String str2 : this.f4859k.keySet()) {
                bundle2.putBundle(u1.h.f("result_", str2), (Bundle) this.f4859k.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(u1.h.f("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (E(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void S() {
        synchronized (this.f4850a) {
            try {
                if (this.f4850a.size() == 1) {
                    this.f4868t.f5077v.removeCallbacks(this.f4849M);
                    this.f4868t.f5077v.post(this.f4849M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        ViewGroup A9 = A(abstractComponentCallbacksC0475s);
        if (A9 == null || !(A9 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A9).setDrawDisappearingViewsLast(!z3);
    }

    public final void U(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, EnumC0497o enumC0497o) {
        if (abstractComponentCallbacksC0475s.equals(this.f4852c.h(abstractComponentCallbacksC0475s.f5066x)) && (abstractComponentCallbacksC0475s.f5038L == null || abstractComponentCallbacksC0475s.f5037K == this)) {
            abstractComponentCallbacksC0475s.f5057r0 = enumC0497o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0475s + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (abstractComponentCallbacksC0475s != null) {
            if (!abstractComponentCallbacksC0475s.equals(this.f4852c.h(abstractComponentCallbacksC0475s.f5066x)) || (abstractComponentCallbacksC0475s.f5038L != null && abstractComponentCallbacksC0475s.f5037K != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0475s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = this.f4871w;
        this.f4871w = abstractComponentCallbacksC0475s;
        q(abstractComponentCallbacksC0475s2);
        q(this.f4871w);
    }

    public final void W(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        ViewGroup A9 = A(abstractComponentCallbacksC0475s);
        if (A9 != null) {
            r rVar = abstractComponentCallbacksC0475s.f5053n0;
            if ((rVar == null ? 0 : rVar.f5021e) + (rVar == null ? 0 : rVar.f5020d) + (rVar == null ? 0 : rVar.f5019c) + (rVar == null ? 0 : rVar.f5018b) > 0) {
                if (A9.getTag(C5275R.id.visible_removing_fragment_view_tag) == null) {
                    A9.setTag(C5275R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0475s);
                }
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = (AbstractComponentCallbacksC0475s) A9.getTag(C5275R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0475s.f5053n0;
                boolean z3 = rVar2 != null ? rVar2.f5017a : false;
                if (abstractComponentCallbacksC0475s2.f5053n0 == null) {
                    return;
                }
                abstractComponentCallbacksC0475s2.b().f5017a = z3;
            }
        }
    }

    public final void Y() {
        Iterator it = this.f4852c.j().iterator();
        while (it.hasNext()) {
            V v9 = (V) it.next();
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
            if (abstractComponentCallbacksC0475s.Y) {
                if (this.f4851b) {
                    this.f4845H = true;
                } else {
                    abstractComponentCallbacksC0475s.Y = false;
                    v9.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y());
        C0479w c0479w = this.f4868t;
        if (c0479w == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e9) {
                Log.e("FragmentManager", "Failed dumping state", e9);
                throw illegalStateException;
            }
        }
        try {
            c0479w.f5079x.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final V a(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        String str = abstractComponentCallbacksC0475s.f5056q0;
        if (str != null) {
            f0.d.c(abstractComponentCallbacksC0475s, str);
        }
        if (E(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0475s);
        }
        V f3 = f(abstractComponentCallbacksC0475s);
        abstractComponentCallbacksC0475s.f5037K = this;
        S0.n nVar = this.f4852c;
        nVar.m(f3);
        if (!abstractComponentCallbacksC0475s.f5045S) {
            nVar.f(abstractComponentCallbacksC0475s);
            abstractComponentCallbacksC0475s.f5032E = false;
            if (abstractComponentCallbacksC0475s.f5050X == null) {
                abstractComponentCallbacksC0475s.f5054o0 = false;
            }
            if (F(abstractComponentCallbacksC0475s)) {
                this.f4841D = true;
            }
        }
        return f3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [I7.a, kotlin.jvm.internal.g] */
    /* JADX WARN: Type inference failed for: r1v10, types: [I7.a, kotlin.jvm.internal.g] */
    public final void a0() {
        synchronized (this.f4850a) {
            try {
                if (!this.f4850a.isEmpty()) {
                    E e9 = this.f4857h;
                    e9.f4820a = true;
                    ?? r12 = e9.f4822c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    return;
                }
                E e10 = this.f4857h;
                ArrayList arrayList = this.f4853d;
                e10.f4820a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f4870v);
                ?? r02 = e10.f4822c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0479w c0479w, S0.f fVar, AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (this.f4868t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f4868t = c0479w;
        this.f4869u = fVar;
        this.f4870v = abstractComponentCallbacksC0475s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4861m;
        if (abstractComponentCallbacksC0475s != 0) {
            copyOnWriteArrayList.add(new H(abstractComponentCallbacksC0475s));
        } else if (c0479w != null) {
            copyOnWriteArrayList.add(c0479w);
        }
        if (this.f4870v != null) {
            a0();
        }
        if (c0479w != null) {
            androidx.activity.G onBackPressedDispatcher = c0479w.f5079x.getOnBackPressedDispatcher();
            this.f4856g = onBackPressedDispatcher;
            onBackPressedDispatcher.a(abstractComponentCallbacksC0475s != 0 ? abstractComponentCallbacksC0475s : c0479w, this.f4857h);
        }
        if (abstractComponentCallbacksC0475s != 0) {
            S s9 = abstractComponentCallbacksC0475s.f5037K.f4848L;
            HashMap hashMap = s9.f4886b;
            S s10 = (S) hashMap.get(abstractComponentCallbacksC0475s.f5066x);
            if (s10 == null) {
                s10 = new S(s9.f4888d);
                hashMap.put(abstractComponentCallbacksC0475s.f5066x, s10);
            }
            this.f4848L = s10;
        } else if (c0479w != null) {
            this.f4848L = (S) new Z2.e(c0479w.f5079x.getViewModelStore(), S.f4884g).r(S.class);
        } else {
            this.f4848L = new S(false);
        }
        S s11 = this.f4848L;
        s11.f4890f = this.f4842E || this.f4843F;
        this.f4852c.f2805x = s11;
        C0479w c0479w2 = this.f4868t;
        if (c0479w2 != null && abstractComponentCallbacksC0475s == 0) {
            C5181c savedStateRegistry = c0479w2.f5079x.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0476t(1, this));
            Bundle a9 = savedStateRegistry.a("android:support:fragments");
            if (a9 != null) {
                Q(a9);
            }
        }
        C0479w c0479w3 = this.f4868t;
        if (c0479w3 != null) {
            e.i activityResultRegistry = c0479w3.f5079x.getActivityResultRegistry();
            String f3 = u1.h.f("FragmentManager:", abstractComponentCallbacksC0475s != 0 ? u1.h.g(new StringBuilder(), abstractComponentCallbacksC0475s.f5066x, ":") : "");
            this.f4874z = activityResultRegistry.c(AbstractC4404f.f(f3, "StartActivityForResult"), new I(2), new I0.j(15, this));
            this.f4838A = activityResultRegistry.c(AbstractC4404f.f(f3, "StartIntentSenderForResult"), new I(0), new C4522b(11, this));
            this.f4839B = activityResultRegistry.c(AbstractC4404f.f(f3, "RequestPermissions"), new I(1), new F1.a(9, this));
        }
        C0479w c0479w4 = this.f4868t;
        if (c0479w4 != null) {
            c0479w4.f5079x.addOnConfigurationChangedListener(this.f4862n);
        }
        C0479w c0479w5 = this.f4868t;
        if (c0479w5 != null) {
            c0479w5.f5079x.addOnTrimMemoryListener(this.f4863o);
        }
        C0479w c0479w6 = this.f4868t;
        if (c0479w6 != null) {
            c0479w6.f5079x.addOnMultiWindowModeChangedListener(this.f4864p);
        }
        C0479w c0479w7 = this.f4868t;
        if (c0479w7 != null) {
            c0479w7.f5079x.addOnPictureInPictureModeChangedListener(this.f4865q);
        }
        C0479w c0479w8 = this.f4868t;
        if (c0479w8 == null || abstractComponentCallbacksC0475s != 0) {
            return;
        }
        c0479w8.f5079x.addMenuProvider(this.f4866r);
    }

    public final void c(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (E(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0475s);
        }
        if (abstractComponentCallbacksC0475s.f5045S) {
            abstractComponentCallbacksC0475s.f5045S = false;
            if (abstractComponentCallbacksC0475s.f5031D) {
                return;
            }
            this.f4852c.f(abstractComponentCallbacksC0475s);
            if (E(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0475s);
            }
            if (F(abstractComponentCallbacksC0475s)) {
                this.f4841D = true;
            }
        }
    }

    public final void d() {
        this.f4851b = false;
        this.J.clear();
        this.f4846I.clear();
    }

    public final HashSet e() {
        C0467j c0467j;
        HashSet hashSet = new HashSet();
        Iterator it = this.f4852c.j().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((V) it.next()).f4907c.f5049W;
            if (viewGroup != null) {
                M2.i factory = C();
                kotlin.jvm.internal.h.e(factory, "factory");
                Object tag = viewGroup.getTag(C5275R.id.special_effects_controller_view_tag);
                if (tag instanceof C0467j) {
                    c0467j = (C0467j) tag;
                } else {
                    c0467j = new C0467j(viewGroup);
                    viewGroup.setTag(C5275R.id.special_effects_controller_view_tag, c0467j);
                }
                hashSet.add(c0467j);
            }
        }
        return hashSet;
    }

    public final V f(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        String str = abstractComponentCallbacksC0475s.f5066x;
        S0.n nVar = this.f4852c;
        V v9 = (V) ((HashMap) nVar.f2803v).get(str);
        if (v9 != null) {
            return v9;
        }
        V v10 = new V(this.f4860l, nVar, abstractComponentCallbacksC0475s);
        v10.m(this.f4868t.f5076u.getClassLoader());
        v10.f4909e = this.f4867s;
        return v10;
    }

    public final void g(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (E(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0475s);
        }
        if (abstractComponentCallbacksC0475s.f5045S) {
            return;
        }
        abstractComponentCallbacksC0475s.f5045S = true;
        if (abstractComponentCallbacksC0475s.f5031D) {
            if (E(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0475s);
            }
            S0.n nVar = this.f4852c;
            synchronized (((ArrayList) nVar.f2802u)) {
                ((ArrayList) nVar.f2802u).remove(abstractComponentCallbacksC0475s);
            }
            abstractComponentCallbacksC0475s.f5031D = false;
            if (F(abstractComponentCallbacksC0475s)) {
                this.f4841D = true;
            }
            W(abstractComponentCallbacksC0475s);
        }
    }

    public final void h(boolean z3) {
        if (z3 && this.f4868t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null) {
                abstractComponentCallbacksC0475s.f5048V = true;
                if (z3) {
                    abstractComponentCallbacksC0475s.f5039M.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f4867s >= 1) {
            for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
                if (abstractComponentCallbacksC0475s != null) {
                    if (!abstractComponentCallbacksC0475s.f5044R ? abstractComponentCallbacksC0475s.f5039M.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f4867s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null && H(abstractComponentCallbacksC0475s)) {
                if (!abstractComponentCallbacksC0475s.f5044R ? abstractComponentCallbacksC0475s.f5039M.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0475s);
                    z3 = true;
                }
            }
        }
        if (this.f4854e != null) {
            for (int i = 0; i < this.f4854e.size(); i++) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = (AbstractComponentCallbacksC0475s) this.f4854e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0475s2)) {
                    abstractComponentCallbacksC0475s2.getClass();
                }
            }
        }
        this.f4854e = arrayList;
        return z3;
    }

    public final void k() {
        boolean z3 = true;
        this.f4844G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0467j) it.next()).e();
        }
        C0479w c0479w = this.f4868t;
        S0.n nVar = this.f4852c;
        if (c0479w != null) {
            z3 = ((S) nVar.f2805x).f4889e;
        } else {
            AbstractActivityC0480x abstractActivityC0480x = c0479w.f5076u;
            if (abstractActivityC0480x != null) {
                z3 = true ^ abstractActivityC0480x.isChangingConfigurations();
            }
        }
        if (z3) {
            Iterator it2 = this.f4858j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0460c) it2.next()).f4969n) {
                    S s9 = (S) nVar.f2805x;
                    s9.getClass();
                    if (E(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    s9.c(str);
                }
            }
        }
        t(-1);
        C0479w c0479w2 = this.f4868t;
        if (c0479w2 != null) {
            c0479w2.f5079x.removeOnTrimMemoryListener(this.f4863o);
        }
        C0479w c0479w3 = this.f4868t;
        if (c0479w3 != null) {
            c0479w3.f5079x.removeOnConfigurationChangedListener(this.f4862n);
        }
        C0479w c0479w4 = this.f4868t;
        if (c0479w4 != null) {
            c0479w4.f5079x.removeOnMultiWindowModeChangedListener(this.f4864p);
        }
        C0479w c0479w5 = this.f4868t;
        if (c0479w5 != null) {
            c0479w5.f5079x.removeOnPictureInPictureModeChangedListener(this.f4865q);
        }
        C0479w c0479w6 = this.f4868t;
        if (c0479w6 != null && this.f4870v == null) {
            c0479w6.f5079x.removeMenuProvider(this.f4866r);
        }
        this.f4868t = null;
        this.f4869u = null;
        this.f4870v = null;
        if (this.f4856g != null) {
            Iterator it3 = this.f4857h.f4821b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0451c) it3.next()).cancel();
            }
            this.f4856g = null;
        }
        e.h hVar = this.f4874z;
        if (hVar != null) {
            hVar.f37088a.e(hVar.f37089b);
            e.h hVar2 = this.f4838A;
            hVar2.f37088a.e(hVar2.f37089b);
            e.h hVar3 = this.f4839B;
            hVar3.f37088a.e(hVar3.f37089b);
        }
    }

    public final void l(boolean z3) {
        if (z3 && this.f4868t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null) {
                abstractComponentCallbacksC0475s.f5048V = true;
                if (z3) {
                    abstractComponentCallbacksC0475s.f5039M.l(true);
                }
            }
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f4868t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null && z3) {
                abstractComponentCallbacksC0475s.f5039M.m(true);
            }
        }
    }

    public final void n() {
        Iterator it = this.f4852c.k().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = (AbstractComponentCallbacksC0475s) it.next();
            if (abstractComponentCallbacksC0475s != null) {
                abstractComponentCallbacksC0475s.j();
                abstractComponentCallbacksC0475s.f5039M.n();
            }
        }
    }

    public final boolean o() {
        if (this.f4867s >= 1) {
            for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
                if (abstractComponentCallbacksC0475s != null) {
                    if (!abstractComponentCallbacksC0475s.f5044R ? abstractComponentCallbacksC0475s.f5039M.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f4867s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null && !abstractComponentCallbacksC0475s.f5044R) {
                abstractComponentCallbacksC0475s.f5039M.p();
            }
        }
    }

    public final void q(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        if (abstractComponentCallbacksC0475s != null) {
            if (abstractComponentCallbacksC0475s.equals(this.f4852c.h(abstractComponentCallbacksC0475s.f5066x))) {
                abstractComponentCallbacksC0475s.f5037K.getClass();
                boolean I8 = I(abstractComponentCallbacksC0475s);
                Boolean bool = abstractComponentCallbacksC0475s.f5030C;
                if (bool == null || bool.booleanValue() != I8) {
                    abstractComponentCallbacksC0475s.f5030C = Boolean.valueOf(I8);
                    O o6 = abstractComponentCallbacksC0475s.f5039M;
                    o6.a0();
                    o6.q(o6.f4871w);
                }
            }
        }
    }

    public final void r(boolean z3) {
        if (z3 && this.f4868t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null && z3) {
                abstractComponentCallbacksC0475s.f5039M.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f4867s < 1) {
            return false;
        }
        boolean z3 = false;
        for (AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s : this.f4852c.l()) {
            if (abstractComponentCallbacksC0475s != null && H(abstractComponentCallbacksC0475s)) {
                if (!abstractComponentCallbacksC0475s.f5044R ? abstractComponentCallbacksC0475s.f5039M.s() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final void t(int i) {
        try {
            this.f4851b = true;
            for (V v9 : ((HashMap) this.f4852c.f2803v).values()) {
                if (v9 != null) {
                    v9.f4909e = i;
                }
            }
            J(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0467j) it.next()).e();
            }
            this.f4851b = false;
            x(true);
        } catch (Throwable th) {
            this.f4851b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4870v;
        if (abstractComponentCallbacksC0475s != null) {
            sb.append(abstractComponentCallbacksC0475s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4870v)));
            sb.append("}");
        } else {
            C0479w c0479w = this.f4868t;
            if (c0479w != null) {
                sb.append(c0479w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4868t)));
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
        String f3 = AbstractC4404f.f(str, "    ");
        S0.n nVar = this.f4852c;
        nVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) nVar.f2803v;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (V v9 : hashMap.values()) {
                printWriter.print(str);
                if (v9 != null) {
                    AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = v9.f4907c;
                    printWriter.println(abstractComponentCallbacksC0475s);
                    abstractComponentCallbacksC0475s.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0475s.f5041O));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0475s.f5042P));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0475s.f5043Q);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5052n);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5066x);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0475s.J);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5031D);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5032E);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5033F);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0475s.f5034G);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5044R);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5045S);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5047U);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0475s.f5046T);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0475s.f5051Z);
                    if (abstractComponentCallbacksC0475s.f5037K != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5037K);
                    }
                    if (abstractComponentCallbacksC0475s.f5038L != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5038L);
                    }
                    if (abstractComponentCallbacksC0475s.f5040N != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5040N);
                    }
                    if (abstractComponentCallbacksC0475s.f5068y != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5068y);
                    }
                    if (abstractComponentCallbacksC0475s.f5060u != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5060u);
                    }
                    if (abstractComponentCallbacksC0475s.f5062v != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5062v);
                    }
                    if (abstractComponentCallbacksC0475s.f5064w != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5064w);
                    }
                    Object obj = abstractComponentCallbacksC0475s.f5069z;
                    if (obj == null) {
                        N n9 = abstractComponentCallbacksC0475s.f5037K;
                        obj = (n9 == null || (str2 = abstractComponentCallbacksC0475s.f5028A) == null) ? null : n9.f4852c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5029B);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0475s.f5053n0;
                    printWriter.println(rVar == null ? false : rVar.f5017a);
                    r rVar2 = abstractComponentCallbacksC0475s.f5053n0;
                    if ((rVar2 == null ? 0 : rVar2.f5018b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0475s.f5053n0;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f5018b);
                    }
                    r rVar4 = abstractComponentCallbacksC0475s.f5053n0;
                    if ((rVar4 == null ? 0 : rVar4.f5019c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0475s.f5053n0;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f5019c);
                    }
                    r rVar6 = abstractComponentCallbacksC0475s.f5053n0;
                    if ((rVar6 == null ? 0 : rVar6.f5020d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0475s.f5053n0;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f5020d);
                    }
                    r rVar8 = abstractComponentCallbacksC0475s.f5053n0;
                    if ((rVar8 == null ? 0 : rVar8.f5021e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0475s.f5053n0;
                        printWriter.println(rVar9 == null ? 0 : rVar9.f5021e);
                    }
                    if (abstractComponentCallbacksC0475s.f5049W != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5049W);
                    }
                    if (abstractComponentCallbacksC0475s.f5050X != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0475s.f5050X);
                    }
                    if (abstractComponentCallbacksC0475s.d() != null) {
                        s.l lVar = ((C4577b) new Z2.e(abstractComponentCallbacksC0475s.getViewModelStore(), C4577b.f38026b).r(C4577b.class)).f38027a;
                        if (lVar.f40444v > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (lVar.f40444v > 0) {
                                if (lVar.f40443u[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(lVar.f40442n[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0475s.f5039M + ":");
                    abstractComponentCallbacksC0475s.f5039M.u(AbstractC4404f.f(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) nVar.f2802u;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = (AbstractComponentCallbacksC0475s) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0475s2.toString());
            }
        }
        ArrayList arrayList2 = this.f4854e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i6 = 0; i6 < size2; i6++) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = (AbstractComponentCallbacksC0475s) this.f4854e.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0475s3.toString());
            }
        }
        ArrayList arrayList3 = this.f4853d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C0458a c0458a = (C0458a) this.f4853d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0458a.toString());
                c0458a.f(f3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f4850a) {
            try {
                int size4 = this.f4850a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size4; i10++) {
                        Object obj2 = (L) this.f4850a.get(i10);
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
        printWriter.println(this.f4868t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4869u);
        if (this.f4870v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4870v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4867s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4842E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4843F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4844G);
        if (this.f4841D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4841D);
        }
    }

    public final void v(L l9, boolean z3) {
        if (!z3) {
            if (this.f4868t == null) {
                if (!this.f4844G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f4842E || this.f4843F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4850a) {
            try {
                if (this.f4868t == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f4850a.add(l9);
                    S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z3) {
        if (this.f4851b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4868t == null) {
            if (!this.f4844G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4868t.f5077v.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && (this.f4842E || this.f4843F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4846I == null) {
            this.f4846I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean x(boolean z3) {
        boolean z6;
        w(z3);
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f4846I;
            ArrayList arrayList2 = this.J;
            synchronized (this.f4850a) {
                if (this.f4850a.isEmpty()) {
                    z6 = false;
                } else {
                    try {
                        int size = this.f4850a.size();
                        z6 = false;
                        for (int i = 0; i < size; i++) {
                            z6 |= ((L) this.f4850a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z6) {
                break;
            }
            z9 = true;
            this.f4851b = true;
            try {
                P(this.f4846I, this.J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4845H) {
            this.f4845H = false;
            Y();
        }
        ((HashMap) this.f4852c.f2803v).values().removeAll(Collections.singleton(null));
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x04c0, code lost:
    
        r10 = (androidx.fragment.app.a0) r10;
        r7.f4995e = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ArrayList arrayList, ArrayList arrayList2, int i, int i6) {
        Object obj;
        ViewGroup viewGroup;
        boolean z3;
        int i9;
        boolean z6;
        boolean z9;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12 = ((C0458a) arrayList.get(i)).f4942o;
        ArrayList arrayList3 = this.f4847K;
        if (arrayList3 == null) {
            this.f4847K = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f4847K;
        S0.n nVar = this.f4852c;
        arrayList4.addAll(nVar.l());
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = this.f4871w;
        int i13 = i;
        boolean z13 = false;
        while (true) {
            int i14 = 1;
            if (i13 >= i6) {
                boolean z14 = z12;
                this.f4847K.clear();
                if (!z14 && this.f4867s >= 1) {
                    for (int i15 = i; i15 < i6; i15++) {
                        Iterator it = ((C0458a) arrayList.get(i15)).f4929a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = ((W) it.next()).f4911b;
                            if (abstractComponentCallbacksC0475s2 != null && abstractComponentCallbacksC0475s2.f5037K != null) {
                                nVar.m(f(abstractComponentCallbacksC0475s2));
                            }
                        }
                    }
                }
                for (int i16 = i; i16 < i6; i16++) {
                    C0458a c0458a = (C0458a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                        c0458a.c(-1);
                        ArrayList arrayList5 = c0458a.f4929a;
                        boolean z15 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            W w6 = (W) arrayList5.get(size);
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s3 = w6.f4911b;
                            if (abstractComponentCallbacksC0475s3 != null) {
                                if (abstractComponentCallbacksC0475s3.f5053n0 != null) {
                                    abstractComponentCallbacksC0475s3.b().f5017a = z15;
                                }
                                int i17 = c0458a.f4934f;
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
                                if (abstractComponentCallbacksC0475s3.f5053n0 != null || i18 != 0) {
                                    abstractComponentCallbacksC0475s3.b();
                                    abstractComponentCallbacksC0475s3.f5053n0.f5022f = i18;
                                }
                                abstractComponentCallbacksC0475s3.b();
                                abstractComponentCallbacksC0475s3.f5053n0.getClass();
                            }
                            int i20 = w6.f4910a;
                            N n9 = c0458a.f4943p;
                            switch (i20) {
                                case 1:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    z15 = true;
                                    n9.T(abstractComponentCallbacksC0475s3, true);
                                    n9.O(abstractComponentCallbacksC0475s3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w6.f4910a);
                                case 3:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    n9.a(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 4:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    n9.getClass();
                                    X(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 5:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    n9.T(abstractComponentCallbacksC0475s3, true);
                                    n9.D(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 6:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    n9.c(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 7:
                                    abstractComponentCallbacksC0475s3.A(w6.f4913d, w6.f4914e, w6.f4915f, w6.f4916g);
                                    n9.T(abstractComponentCallbacksC0475s3, true);
                                    n9.g(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 8:
                                    n9.V(null);
                                    z15 = true;
                                case 9:
                                    n9.V(abstractComponentCallbacksC0475s3);
                                    z15 = true;
                                case 10:
                                    n9.U(abstractComponentCallbacksC0475s3, w6.f4917h);
                                    z15 = true;
                            }
                        }
                    } else {
                        c0458a.c(1);
                        ArrayList arrayList6 = c0458a.f4929a;
                        int size2 = arrayList6.size();
                        for (int i21 = 0; i21 < size2; i21++) {
                            W w9 = (W) arrayList6.get(i21);
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s4 = w9.f4911b;
                            if (abstractComponentCallbacksC0475s4 != null) {
                                if (abstractComponentCallbacksC0475s4.f5053n0 != null) {
                                    abstractComponentCallbacksC0475s4.b().f5017a = false;
                                }
                                int i22 = c0458a.f4934f;
                                if (abstractComponentCallbacksC0475s4.f5053n0 != null || i22 != 0) {
                                    abstractComponentCallbacksC0475s4.b();
                                    abstractComponentCallbacksC0475s4.f5053n0.f5022f = i22;
                                }
                                abstractComponentCallbacksC0475s4.b();
                                abstractComponentCallbacksC0475s4.f5053n0.getClass();
                            }
                            int i23 = w9.f4910a;
                            N n10 = c0458a.f4943p;
                            switch (i23) {
                                case 1:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.T(abstractComponentCallbacksC0475s4, false);
                                    n10.a(abstractComponentCallbacksC0475s4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w9.f4910a);
                                case 3:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.O(abstractComponentCallbacksC0475s4);
                                case 4:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.D(abstractComponentCallbacksC0475s4);
                                case 5:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.T(abstractComponentCallbacksC0475s4, false);
                                    X(abstractComponentCallbacksC0475s4);
                                case 6:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.g(abstractComponentCallbacksC0475s4);
                                case 7:
                                    abstractComponentCallbacksC0475s4.A(w9.f4913d, w9.f4914e, w9.f4915f, w9.f4916g);
                                    n10.T(abstractComponentCallbacksC0475s4, false);
                                    n10.c(abstractComponentCallbacksC0475s4);
                                case 8:
                                    n10.V(abstractComponentCallbacksC0475s4);
                                case 9:
                                    n10.V(null);
                                case 10:
                                    n10.U(abstractComponentCallbacksC0475s4, w9.i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i6 - 1)).booleanValue();
                for (int i24 = i; i24 < i6; i24++) {
                    C0458a c0458a2 = (C0458a) arrayList.get(i24);
                    if (booleanValue) {
                        for (int size3 = c0458a2.f4929a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s5 = ((W) c0458a2.f4929a.get(size3)).f4911b;
                            if (abstractComponentCallbacksC0475s5 != null) {
                                f(abstractComponentCallbacksC0475s5).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0458a2.f4929a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s6 = ((W) it2.next()).f4911b;
                            if (abstractComponentCallbacksC0475s6 != null) {
                                f(abstractComponentCallbacksC0475s6).k();
                            }
                        }
                    }
                }
                J(this.f4867s, true);
                HashSet hashSet = new HashSet();
                for (int i25 = i; i25 < i6; i25++) {
                    Iterator it3 = ((C0458a) arrayList.get(i25)).f4929a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s7 = ((W) it3.next()).f4911b;
                        if (abstractComponentCallbacksC0475s7 != null && (viewGroup = abstractComponentCallbacksC0475s7.f5049W) != null) {
                            hashSet.add(C0467j.f(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0467j c0467j = (C0467j) it4.next();
                    c0467j.f4994d = booleanValue;
                    synchronized (c0467j.f4992b) {
                        try {
                            c0467j.g();
                            ArrayList arrayList7 = c0467j.f4992b;
                            ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    a0 a0Var = (a0) obj;
                                    View view = a0Var.f4948c.f5050X;
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
                                    if (a0Var.f4946a != 2 || c9 == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0467j.c();
                }
                for (int i26 = i; i26 < i6; i26++) {
                    C0458a c0458a3 = (C0458a) arrayList.get(i26);
                    if (((Boolean) arrayList2.get(i26)).booleanValue() && c0458a3.f4945r >= 0) {
                        c0458a3.f4945r = -1;
                    }
                    c0458a3.getClass();
                }
                return;
            }
            C0458a c0458a4 = (C0458a) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                z3 = z12;
                i9 = i13;
                z6 = z13;
                int i27 = 1;
                ArrayList arrayList8 = this.f4847K;
                ArrayList arrayList9 = c0458a4.f4929a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    W w10 = (W) arrayList9.get(size4);
                    int i28 = w10.f4910a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 8:
                                    abstractComponentCallbacksC0475s = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0475s = w10.f4911b;
                                    break;
                                case 10:
                                    w10.i = w10.f4917h;
                                    break;
                            }
                            size4--;
                            i27 = 1;
                        }
                        arrayList8.add(w10.f4911b);
                        size4--;
                        i27 = 1;
                    }
                    arrayList8.remove(w10.f4911b);
                    size4--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f4847K;
                int i29 = 0;
                while (true) {
                    ArrayList arrayList11 = c0458a4.f4929a;
                    if (i29 < arrayList11.size()) {
                        W w11 = (W) arrayList11.get(i29);
                        int i30 = w11.f4910a;
                        if (i30 != i14) {
                            z9 = z12;
                            if (i30 != 2) {
                                if (i30 == 3 || i30 == 6) {
                                    arrayList10.remove(w11.f4911b);
                                    AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s8 = w11.f4911b;
                                    if (abstractComponentCallbacksC0475s8 == abstractComponentCallbacksC0475s) {
                                        arrayList11.add(i29, new W(9, abstractComponentCallbacksC0475s8));
                                        i29++;
                                        i11 = i13;
                                        z10 = z13;
                                        i10 = 1;
                                        abstractComponentCallbacksC0475s = null;
                                    }
                                } else if (i30 == 7) {
                                    i10 = 1;
                                } else if (i30 == 8) {
                                    arrayList11.add(i29, new W(9, abstractComponentCallbacksC0475s, 0));
                                    w11.f4912c = true;
                                    i29++;
                                    abstractComponentCallbacksC0475s = w11.f4911b;
                                }
                                i11 = i13;
                                z10 = z13;
                                i10 = 1;
                            } else {
                                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s9 = w11.f4911b;
                                int i31 = abstractComponentCallbacksC0475s9.f5042P;
                                int size5 = arrayList10.size() - 1;
                                boolean z16 = false;
                                while (size5 >= 0) {
                                    int i32 = size5;
                                    AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s10 = (AbstractComponentCallbacksC0475s) arrayList10.get(size5);
                                    int i33 = i13;
                                    if (abstractComponentCallbacksC0475s10.f5042P != i31) {
                                        z11 = z13;
                                    } else if (abstractComponentCallbacksC0475s10 == abstractComponentCallbacksC0475s9) {
                                        z11 = z13;
                                        z16 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0475s10 == abstractComponentCallbacksC0475s) {
                                            z11 = z13;
                                            i12 = 0;
                                            arrayList11.add(i29, new W(9, abstractComponentCallbacksC0475s10, 0));
                                            i29++;
                                            abstractComponentCallbacksC0475s = null;
                                        } else {
                                            z11 = z13;
                                            i12 = 0;
                                        }
                                        W w12 = new W(3, abstractComponentCallbacksC0475s10, i12);
                                        w12.f4913d = w11.f4913d;
                                        w12.f4915f = w11.f4915f;
                                        w12.f4914e = w11.f4914e;
                                        w12.f4916g = w11.f4916g;
                                        arrayList11.add(i29, w12);
                                        arrayList10.remove(abstractComponentCallbacksC0475s10);
                                        i29++;
                                        abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s;
                                    }
                                    size5 = i32 - 1;
                                    z13 = z11;
                                    i13 = i33;
                                }
                                i11 = i13;
                                z10 = z13;
                                i10 = 1;
                                if (z16) {
                                    arrayList11.remove(i29);
                                    i29--;
                                } else {
                                    w11.f4910a = 1;
                                    w11.f4912c = true;
                                    arrayList10.add(abstractComponentCallbacksC0475s9);
                                }
                            }
                            i29 += i10;
                            i14 = i10;
                            z12 = z9;
                            z13 = z10;
                            i13 = i11;
                        } else {
                            z9 = z12;
                            i10 = i14;
                        }
                        i11 = i13;
                        z10 = z13;
                        arrayList10.add(w11.f4911b);
                        i29 += i10;
                        i14 = i10;
                        z12 = z9;
                        z13 = z10;
                        i13 = i11;
                    } else {
                        z3 = z12;
                        i9 = i13;
                        z6 = z13;
                    }
                }
            }
            z13 = z6 || c0458a4.f4935g;
            i13 = i9 + 1;
            z12 = z3;
        }
    }

    public final AbstractComponentCallbacksC0475s z(int i) {
        S0.n nVar = this.f4852c;
        ArrayList arrayList = (ArrayList) nVar.f2802u;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = (AbstractComponentCallbacksC0475s) arrayList.get(size);
            if (abstractComponentCallbacksC0475s != null && abstractComponentCallbacksC0475s.f5041O == i) {
                return abstractComponentCallbacksC0475s;
            }
        }
        for (V v9 : ((HashMap) nVar.f2803v).values()) {
            if (v9 != null) {
                AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = v9.f4907c;
                if (abstractComponentCallbacksC0475s2.f5041O == i) {
                    return abstractComponentCallbacksC0475s2;
                }
            }
        }
        return null;
    }
}
