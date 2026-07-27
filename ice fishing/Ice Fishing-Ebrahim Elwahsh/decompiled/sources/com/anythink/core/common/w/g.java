package com.anythink.core.common.w;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATRequestingInfo;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.l;
import com.anythink.core.common.v.p;
import com.anythink.core.common.x;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17251a = "g";

    /* renamed from: b, reason: collision with root package name */
    final int f17252b;

    /* renamed from: c, reason: collision with root package name */
    int f17253c;

    /* renamed from: d, reason: collision with root package name */
    int f17254d;

    /* renamed from: e, reason: collision with root package name */
    long f17255e;

    /* renamed from: q, reason: collision with root package name */
    bz f17266q;

    /* renamed from: r, reason: collision with root package name */
    bq f17267r;

    /* renamed from: s, reason: collision with root package name */
    i f17268s;

    /* renamed from: t, reason: collision with root package name */
    ac f17269t;

    /* renamed from: u, reason: collision with root package name */
    ac f17270u;

    /* renamed from: v, reason: collision with root package name */
    double f17271v;

    /* renamed from: w, reason: collision with root package name */
    private List<bv> f17272w;

    /* renamed from: m, reason: collision with root package name */
    volatile int f17262m = 0;

    /* renamed from: n, reason: collision with root package name */
    volatile int f17263n = 0;

    /* renamed from: o, reason: collision with root package name */
    volatile int f17264o = 0;

    /* renamed from: p, reason: collision with root package name */
    volatile int f17265p = 0;

    /* renamed from: f, reason: collision with root package name */
    List<bv> f17256f = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: g, reason: collision with root package name */
    List<bv> f17257g = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: h, reason: collision with root package name */
    List<bv> f17258h = Collections.synchronizedList(new ArrayList(2));
    List<f> i = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: l, reason: collision with root package name */
    List<bv> f17261l = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: j, reason: collision with root package name */
    List<bv> f17259j = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: k, reason: collision with root package name */
    List<bv> f17260k = Collections.synchronizedList(new ArrayList(2));

    public g(h hVar) {
        this.f17253c = 1;
        this.f17256f.addAll(hVar.f17277d);
        this.f17259j.addAll(hVar.f17279f);
        this.f17260k.addAll(hVar.f17280g);
        this.f17271v = hVar.f17281h;
        this.f17261l.addAll(hVar.f17288p);
        this.f17268s = hVar.f17284l;
        this.f17269t = hVar.f17286n;
        this.f17270u = hVar.f17287o;
        this.f17252b = hVar.f17276c.g();
        this.f17253c = hVar.f17276c.e();
        this.f17254d = hVar.f17276c.f();
        this.f17255e = hVar.f17276c.i();
        List<bv> list = hVar.f17278e;
        if (list != null) {
            this.f17258h.addAll(list);
        }
        this.f17272w = Collections.synchronizedList(new ArrayList(3));
        this.f17266q = hVar.f17283k;
        this.f17267r = hVar.f17285m;
    }

    private bv A() {
        bv bvVar;
        f fVar;
        synchronized (this.i) {
            try {
                bvVar = (this.i.size() <= 0 || (fVar = this.i.get(0)) == null) ? null : fVar.f17249a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bvVar;
    }

    private double B() {
        return c(false);
    }

    private bv C() {
        return a(false);
    }

    private double D() {
        return c(true);
    }

    private bv E() {
        return a(true);
    }

    private double F() {
        return Math.max(p.a(x()), p.a(A()));
    }

    private List<bv> w() {
        return this.f17256f;
    }

    private bv x() {
        if (this.f17256f.size() > 0) {
            return this.f17256f.get(0);
        }
        return null;
    }

    private List<bv> y() {
        return this.f17257g;
    }

    private List<bv> z() {
        return this.f17258h;
    }

    public final i a() {
        return this.f17268s;
    }

    public final ac b() {
        return this.f17269t;
    }

    public final int c() {
        return this.f17256f.size();
    }

    public final int d() {
        return this.f17257g.size();
    }

    public final int e() {
        return this.f17258h.size();
    }

    public final bv f() {
        return this.f17258h.remove(0);
    }

    public final boolean g() {
        return this.f17258h.size() == 0 && this.f17256f.size() == 0;
    }

    public final void h() {
        this.f17258h.clear();
    }

    public final int i() {
        return this.i.size();
    }

    public final List<f> j() {
        return this.i;
    }

    public final boolean k() {
        List<bv> list = this.f17259j;
        if (list == null && this.f17260k == null) {
            return true;
        }
        return list.size() == 0 && this.f17260k.size() == 0;
    }

    public final List<bv> l() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(this.f17259j);
        arrayList.addAll(this.f17260k);
        this.f17259j.clear();
        this.f17260k.clear();
        return arrayList;
    }

    public final int m() {
        return this.f17262m;
    }

    public final int n() {
        return this.f17263n;
    }

    public final int o() {
        return this.f17264o;
    }

    public final bz p() {
        return this.f17266q;
    }

    public final bq q() {
        return this.f17267r;
    }

    public final ac r() {
        return this.f17270u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.util.List, java.util.List<com.anythink.core.common.h.bv>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.List<com.anythink.core.common.h.bv>] */
    public final List<bv> s() {
        ?? arrayList;
        int i = this.f17253c;
        if (i == 1 || i == 3) {
            arrayList = new ArrayList();
            int min = Math.min(this.f17254d, this.f17256f.size());
            for (int i4 = 0; i4 < min; i4++) {
                arrayList.add(this.f17256f.get(i4));
            }
        } else {
            arrayList = i == 2 ? b(1) : 0;
        }
        if (arrayList != 0) {
            arrayList.size();
        }
        if (arrayList != 0 && arrayList.size() > 0) {
            this.f17256f.removeAll(arrayList);
        }
        return arrayList;
    }

    public final boolean t() {
        return this.f17256f.size() == 0 && this.f17258h.size() == 0 && this.i.size() == 0 && this.f17257g.size() == 0;
    }

    public final boolean u() {
        return this.f17263n < this.f17254d;
    }

    public final bv v() {
        bv x3 = x();
        bv A8 = A();
        return l.a(x3, A8) < 0 ? x3 : A8;
    }

    public static void i(bv bvVar) {
        ad R8;
        if (!l(bvVar) || bvVar.aO() == 2 || (R8 = bvVar.R()) == null) {
            return;
        }
        bvVar.toString();
        com.anythink.core.b.d.c.a(R8, bvVar, 3);
    }

    public static double j(bv bvVar) {
        ad R8;
        double a9 = p.a(bvVar);
        return (bvVar.an() && a9 == 10000.0d && (R8 = bvVar.R()) != null) ? R8.f13589o : a9;
    }

    public final void a(List<bv> list) {
        this.f17257g.addAll(list);
    }

    public final void b(bv bvVar) {
        this.f17257g.remove(bvVar);
    }

    public final void c(bv bvVar) {
        this.f17261l.remove(bvVar);
    }

    public final void d(bv bvVar) {
        i iVar = this.f17268s;
        if (iVar != null) {
            iVar.a(bvVar);
        }
    }

    public final void e(bv bvVar) {
        ad R8;
        if (bvVar == null || !bvVar.o() || (R8 = bvVar.R()) == null) {
            return;
        }
        R8.a(this.f17269t);
    }

    public final void f(bv bvVar) {
        ad S8;
        if (bvVar == null || !bvVar.o() || (S8 = bvVar.S()) == null) {
            return;
        }
        S8.a(this.f17269t);
    }

    public final boolean g(bv bvVar) {
        ac acVar = this.f17269t;
        boolean z8 = false;
        if (acVar != null && bvVar != null) {
            bv a9 = acVar.a();
            if (a9 == null || l.a(bvVar, a9) < 0 || (l.a(bvVar, a9) == 0 && bvVar.ax() < a9.ax())) {
                z8 = true;
            }
            if (z8) {
                this.f17269t.a(bvVar);
            }
            if (a9 == null) {
                return z8;
            }
            if (z8) {
                this.f17269t.b(a9);
                return z8;
            }
            bv b9 = this.f17269t.b();
            if (b9 == null || l.a(bvVar, b9) < 0 || (l.a(bvVar, b9) == 0 && bvVar.ax() < b9.ax())) {
                this.f17269t.b(bvVar);
            }
        }
        return z8;
    }

    public final void h(bv bvVar) {
        synchronized (this.f17272w) {
            try {
                if (this.f17272w.size() == 0) {
                    this.f17272w.add(bvVar);
                } else {
                    double a9 = p.a(bvVar);
                    int i = 0;
                    while (true) {
                        if (i >= this.f17272w.size()) {
                            break;
                        }
                        if (a9 > p.a(this.f17272w.get(i))) {
                            this.f17272w.add(i, bvVar);
                            break;
                        } else {
                            if (i == this.f17272w.size() - 1) {
                                this.f17272w.add(bvVar);
                                break;
                            }
                            i++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String c(List<bv> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                str = CL.j(str, ",");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i).g());
            str = CL.j(str, sb.toString());
        }
        return str;
    }

    private boolean k(bv bvVar) {
        return a(bvVar, true);
    }

    public final void a(bv bvVar) {
        this.f17257g.add(bvVar);
    }

    public final void b(List<bv> list) {
        this.f17261l.addAll(list);
    }

    public final void a(bv bvVar, int i) {
        synchronized (this.i) {
            try {
                Iterator<f> it = this.i.iterator();
                int i4 = 0;
                while (it.hasNext() && l.a(it.next().f17249a, bvVar) < 0) {
                    i4++;
                }
                this.i.add(i4, new f(bvVar, i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<bv> b(int i) {
        List<bv> list;
        int min;
        if (i != 2) {
            list = this.f17256f;
        } else {
            list = this.f17258h;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int i4 = 0;
            bv bvVar = list.get(0);
            if (i == 2) {
                arrayList.add(bvVar);
            } else {
                bv a9 = a(true);
                int i9 = this.f17253c;
                if (i9 == 1) {
                    int i10 = this.f17254d - this.f17263n;
                    list.size();
                    int min2 = Math.min(i10, list.size());
                    if (min2 > 0) {
                        while (i4 < min2) {
                            bv bvVar2 = list.get(i4);
                            if (l.a(bvVar2, a9) >= 0) {
                                break;
                            }
                            arrayList.add(bvVar2);
                            i4++;
                        }
                    }
                } else if (i9 == 2) {
                    boolean z8 = l.a(bvVar, a9) < 0;
                    if (this.f17265p == 0 && z8) {
                        double a10 = p.a(bvVar);
                        int size = list.size();
                        while (i4 < size) {
                            bv bvVar3 = list.get(i4);
                            if (p.a(bvVar3) == a10) {
                                arrayList.add(bvVar3);
                            }
                            i4++;
                        }
                        this.f17265p = arrayList.size();
                    }
                } else if (i9 == 3 && this.f17263n == 0 && (min = Math.min(this.f17254d, list.size())) > 0) {
                    while (i4 < min) {
                        bv bvVar4 = list.get(i4);
                        if (l.a(bvVar4, a9) >= 0) {
                            break;
                        }
                        arrayList.add(bvVar4);
                        i4++;
                    }
                    arrayList.size();
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
        }
        return arrayList;
    }

    public final ATRequestingInfo d(bv bvVar, n nVar) {
        List list;
        List list2;
        synchronized (this.f17257g) {
            try {
                list = null;
                for (bv bvVar2 : this.f17257g) {
                    if (l.a(bvVar2, bvVar) < 0) {
                        Objects.toString(bvVar2);
                        n af = nVar.af();
                        aj.a(af, bvVar2, 0, false);
                        com.anythink.core.common.d.l a9 = com.anythink.core.common.d.l.a(af, (com.anythink.core.common.d.f) null, 2);
                        if (a9 != null) {
                            if (list == null) {
                                list = Collections.synchronizedList(new ArrayList());
                            }
                            list.add(a9);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null && list.size() > 0) {
            Collections.sort(list, new Comparator<ATAdInfo>() { // from class: com.anythink.core.common.w.g.1
                private static int a(ATAdInfo aTAdInfo, ATAdInfo aTAdInfo2) {
                    if (aTAdInfo.getEcpm() > aTAdInfo2.getEcpm()) {
                        return -1;
                    }
                    return aTAdInfo.getEcpm() < aTAdInfo2.getEcpm() ? 1 : 0;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(ATAdInfo aTAdInfo, ATAdInfo aTAdInfo2) {
                    ATAdInfo aTAdInfo3 = aTAdInfo;
                    ATAdInfo aTAdInfo4 = aTAdInfo2;
                    if (aTAdInfo3.getEcpm() > aTAdInfo4.getEcpm()) {
                        return -1;
                    }
                    return aTAdInfo3.getEcpm() < aTAdInfo4.getEcpm() ? 1 : 0;
                }
            });
        }
        if (this.f17261l.size() > 0) {
            synchronized (this.f17261l) {
                try {
                    list2 = null;
                    for (bv bvVar3 : this.f17261l) {
                        Objects.toString(bvVar3);
                        n af2 = nVar.af();
                        aj.a(af2, bvVar3, 0, false);
                        aj.a(af2);
                        com.anythink.core.common.d.l a10 = com.anythink.core.common.d.l.a(af2, (com.anythink.core.common.d.f) null);
                        if (a10 != null) {
                            if (list2 == null) {
                                list2 = Collections.synchronizedList(new ArrayList());
                            }
                            list2.add(a10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            list2 = null;
        }
        if (list == null && list2 == null) {
            return null;
        }
        return new com.anythink.core.common.h.b(list, list2);
    }

    private static boolean l(bv bvVar) {
        if (bvVar == null) {
            return false;
        }
        int d2 = bvVar.d();
        return d2 == 4 || d2 == 3;
    }

    public final void a(int i, int i4) {
        this.f17262m += i;
        if (i4 != 2) {
            this.f17263n += i;
        } else {
            this.f17264o += i;
        }
    }

    public final void a(int i) {
        if (this.f17253c == 2 && i == 1) {
            this.f17265p--;
        }
    }

    public static void a(bv bvVar, n nVar) {
        ad S8;
        if (bvVar == null || !bvVar.o() || (S8 = bvVar.S()) == null) {
            return;
        }
        String errorMsg = S8.getErrorMsg();
        if (TextUtils.isEmpty(errorMsg) || !errorMsg.contains("200000")) {
            return;
        }
        com.anythink.core.b.d.c.a(S8, new aw(5, bvVar, nVar), true, 31);
    }

    private double c(boolean z8) {
        synchronized (this.f17272w) {
            try {
                int size = this.f17272w.size();
                if (size == 0) {
                    return 0.0d;
                }
                int i = this.f17252b - 1;
                int i4 = size - 1;
                if (z8 && i4 < i) {
                    return 0.0d;
                }
                return p.a(this.f17272w.get(Math.min(i, i4)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bv a(boolean z8) {
        synchronized (this.f17272w) {
            try {
                int size = this.f17272w.size();
                if (size == 0) {
                    return null;
                }
                int i = this.f17252b - 1;
                int i4 = size - 1;
                if (z8 && i4 < i) {
                    return null;
                }
                bv bvVar = this.f17272w.get(Math.min(i, i4));
                p.a(bvVar);
                return bvVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(bv bvVar, n nVar) {
        if (l(bvVar)) {
            bvVar.toString();
            n af = nVar.af();
            ad R8 = bvVar.R();
            if (R8 != null) {
                com.anythink.core.b.d.c.a(R8, new aw(5, bvVar, af), true, 24);
            }
        }
    }

    public final void a(n nVar) {
        ArrayList arrayList = new ArrayList(5);
        synchronized (this.f17272w) {
            a(arrayList, this.f17272w);
        }
        synchronized (this.f17257g) {
            a(arrayList, this.f17257g);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((bv) it.next(), nVar, false, 21);
        }
    }

    public final synchronized void b(bv bvVar, int i) {
        List<bv> list;
        try {
            if (i != 2) {
                list = this.f17256f;
            } else {
                list = this.f17258h;
            }
            synchronized (list) {
                p.a(list, bvVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final bv b(boolean z8) {
        bv a9;
        if (!z8 || (a9 = this.f17269t.a()) == null) {
            return null;
        }
        if (!a9.o()) {
            a9.toString();
            return null;
        }
        if (a9.av() == 1) {
            return null;
        }
        synchronized (this.f17257g) {
            for (bv bvVar : this.f17257g) {
                if (l.a(bvVar, a9) < 0) {
                    bvVar.toString();
                    return null;
                }
            }
            synchronized (this.i) {
                Iterator<f> it = this.i.iterator();
                while (it.hasNext()) {
                    bv bvVar2 = it.next().f17249a;
                    if (l.a(bvVar2, a9) < 0) {
                        bvVar2.toString();
                        return null;
                    }
                }
                a9.toString();
                return a9;
            }
        }
    }

    private static void a(bv bvVar, n nVar, boolean z8, int i) {
        ad R8 = bvVar.R();
        if (R8 != null) {
            com.anythink.core.b.d.c.a(R8, new aw(2, bvVar, nVar), z8, i);
        }
    }

    private void a(List<bv> list, List<bv> list2) {
        int as;
        int size = list2.size();
        int size2 = this.f17272w.size();
        for (int i = 0; i < size; i++) {
            bv bvVar = list2.get(i);
            if (bvVar.o() && (as = bvVar.as()) > 0 && as <= size2 && l.a(bvVar, this.f17272w.get(as - 1)) > 0) {
                list.add(bvVar);
            }
        }
    }

    public final boolean a(bv bvVar, boolean z8) {
        Iterator<bv> it;
        double d2;
        if (bvVar.br()) {
            return true;
        }
        double a9 = p.a(bvVar);
        double c4 = c(true);
        synchronized (this.f17257g) {
            try {
                it = this.f17257g.iterator();
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                if (!it.hasNext()) {
                    d2 = 0.0d;
                    break;
                }
                bv next = it.next();
                d2 = p.a(next);
                if (z8) {
                    if (next.o() && d2 > p.a(bvVar)) {
                        break;
                    }
                } else if (d2 > p.a(bvVar)) {
                    break;
                }
                throw th;
            }
        }
        return a9 > Math.max(c4, d2);
    }

    public final void b(n nVar) {
        bv bvVar;
        synchronized (this.f17256f) {
            try {
                for (bv bvVar2 : this.f17256f) {
                    if (bvVar2 != null && bvVar2.o()) {
                        b(bvVar2, nVar);
                    }
                }
                this.f17256f.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.i) {
            try {
                for (f fVar : this.i) {
                    if (fVar != null && (bvVar = fVar.f17249a) != null && bvVar.o()) {
                        b(fVar.f17249a, nVar);
                    }
                }
                this.i.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f17258h) {
            this.f17258h.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r4 != 7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(bv bvVar, j jVar) {
        boolean z8 = bvVar.af() == 1;
        if (z8) {
            int q6 = bvVar.q();
            if (q6 != 1 && q6 != 3) {
                if (q6 == 6) {
                    if (jVar.f17296g) {
                        return false;
                    }
                    jVar.f17296g = true;
                    return z8;
                }
            }
            if (jVar.f17295f) {
                return false;
            }
            jVar.f17295f = true;
        }
        return z8;
    }

    public static void a(Context context, String str, String str2, bv bvVar, bv bvVar2) {
        bz.a aVar;
        bz.a aVar2 = null;
        if (bvVar != null) {
            bz.a aVar3 = new bz.a(bvVar, bvVar.R());
            aVar = null;
            aVar2 = aVar3;
        } else {
            aVar = bvVar2 != null ? new bz.a(bvVar2, bvVar2.R()) : null;
        }
        x.a(context).a(str, str2, aVar2, aVar);
    }

    public static void a(Context context, String str) {
        x.a(context).a(str);
    }

    public static void a(String str) {
        com.anythink.core.common.d.a().b(str);
    }

    public static boolean a(String str, bv bvVar, n nVar) {
        boolean z8 = false;
        try {
            if (bvVar.o()) {
                ad R8 = bvVar.R();
                com.anythink.core.b.f.a().a(str, R8);
                if (R8 != null && R8.a()) {
                    z8 = true;
                }
                if (z8 && R8 != null) {
                    com.anythink.core.b.d.c.a(R8, new aw(1, bvVar, nVar), true, 25);
                }
            }
        } catch (Throwable unused) {
        }
        return z8;
    }

    public static void b(bv bvVar, n nVar) {
        if (bvVar != null && bvVar.o() && bvVar.P() == 2) {
            a(bvVar, nVar.af(), true, 22);
        }
    }

    public final long a(boolean z8, long j9) {
        if (this.f17258h.size() <= 0) {
            return -1L;
        }
        if (this.f17256f.size() == 0 && z8) {
            return 0L;
        }
        return j9;
    }

    public static bv a(Map<String, e> map) {
        bv bvVar;
        Iterator<Map.Entry<String, e>> it = map.entrySet().iterator();
        bv bvVar2 = null;
        if (it != null) {
            while (it.hasNext()) {
                e value = it.next().getValue();
                if (value != null && !value.i && (bvVar = value.f17216c) != null && (bvVar2 == null || l.a(bvVar, bvVar2) < 0)) {
                    bvVar2 = bvVar;
                }
            }
        }
        return bvVar2;
    }

    public final boolean a(boolean z8, bv bvVar) {
        bv bvVar2;
        if (!z8) {
            return false;
        }
        synchronized (this.f17257g) {
            try {
                bvVar2 = null;
                for (bv bvVar3 : this.f17257g) {
                    if (l.a(bvVar3, bvVar2) < 0) {
                        bvVar2 = bvVar3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bv v6 = v();
        if (l.a(bvVar2, v6) >= 0) {
            bvVar2 = v6;
        }
        return l.a(bvVar, bvVar2) <= 0;
    }

    public final Map<String, Double> a(List<bv> list, bv bvVar) {
        HashMap hashMap = new HashMap();
        double d2 = this.f17271v;
        double a9 = p.a(bvVar);
        if (a9 > d2) {
            d2 = a9;
        }
        if (list != null) {
            for (bv bvVar2 : list) {
                double ar = bvVar2.ar();
                String z8 = bvVar2.z();
                if (ar <= d2) {
                    ar = d2;
                }
                hashMap.put(z8, Double.valueOf(ar));
            }
        }
        return hashMap;
    }
}
