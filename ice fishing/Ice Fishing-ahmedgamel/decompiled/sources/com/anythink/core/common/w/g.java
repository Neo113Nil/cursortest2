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
import com.google.android.gms.internal.ads.Wv;
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
    public static final String f17880a = "g";

    /* renamed from: b, reason: collision with root package name */
    final int f17881b;

    /* renamed from: c, reason: collision with root package name */
    int f17882c;

    /* renamed from: d, reason: collision with root package name */
    int f17883d;

    /* renamed from: e, reason: collision with root package name */
    long f17884e;

    /* renamed from: q, reason: collision with root package name */
    bz f17895q;

    /* renamed from: r, reason: collision with root package name */
    bq f17896r;

    /* renamed from: s, reason: collision with root package name */
    i f17897s;

    /* renamed from: t, reason: collision with root package name */
    ac f17898t;

    /* renamed from: u, reason: collision with root package name */
    ac f17899u;

    /* renamed from: v, reason: collision with root package name */
    double f17900v;

    /* renamed from: w, reason: collision with root package name */
    private List<bv> f17901w;

    /* renamed from: m, reason: collision with root package name */
    volatile int f17891m = 0;

    /* renamed from: n, reason: collision with root package name */
    volatile int f17892n = 0;

    /* renamed from: o, reason: collision with root package name */
    volatile int f17893o = 0;

    /* renamed from: p, reason: collision with root package name */
    volatile int f17894p = 0;

    /* renamed from: f, reason: collision with root package name */
    List<bv> f17885f = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: g, reason: collision with root package name */
    List<bv> f17886g = Collections.synchronizedList(new ArrayList(5));

    /* renamed from: h, reason: collision with root package name */
    List<bv> f17887h = Collections.synchronizedList(new ArrayList(2));
    List<f> i = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: l, reason: collision with root package name */
    List<bv> f17890l = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: j, reason: collision with root package name */
    List<bv> f17888j = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: k, reason: collision with root package name */
    List<bv> f17889k = Collections.synchronizedList(new ArrayList(2));

    public g(h hVar) {
        this.f17882c = 1;
        this.f17885f.addAll(hVar.f17906d);
        this.f17888j.addAll(hVar.f17908f);
        this.f17889k.addAll(hVar.f17909g);
        this.f17900v = hVar.f17910h;
        this.f17890l.addAll(hVar.f17917p);
        this.f17897s = hVar.f17913l;
        this.f17898t = hVar.f17915n;
        this.f17899u = hVar.f17916o;
        this.f17881b = hVar.f17905c.g();
        this.f17882c = hVar.f17905c.e();
        this.f17883d = hVar.f17905c.f();
        this.f17884e = hVar.f17905c.i();
        List<bv> list = hVar.f17907e;
        if (list != null) {
            this.f17887h.addAll(list);
        }
        this.f17901w = Collections.synchronizedList(new ArrayList(3));
        this.f17895q = hVar.f17912k;
        this.f17896r = hVar.f17914m;
    }

    private bv A() {
        bv bvVar;
        f fVar;
        synchronized (this.i) {
            try {
                bvVar = (this.i.size() <= 0 || (fVar = this.i.get(0)) == null) ? null : fVar.f17878a;
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
        return this.f17885f;
    }

    private bv x() {
        if (this.f17885f.size() > 0) {
            return this.f17885f.get(0);
        }
        return null;
    }

    private List<bv> y() {
        return this.f17886g;
    }

    private List<bv> z() {
        return this.f17887h;
    }

    public final i a() {
        return this.f17897s;
    }

    public final ac b() {
        return this.f17898t;
    }

    public final int c() {
        return this.f17885f.size();
    }

    public final int d() {
        return this.f17886g.size();
    }

    public final int e() {
        return this.f17887h.size();
    }

    public final bv f() {
        return this.f17887h.remove(0);
    }

    public final boolean g() {
        return this.f17887h.size() == 0 && this.f17885f.size() == 0;
    }

    public final void h() {
        this.f17887h.clear();
    }

    public final int i() {
        return this.i.size();
    }

    public final List<f> j() {
        return this.i;
    }

    public final boolean k() {
        List<bv> list = this.f17888j;
        if (list == null && this.f17889k == null) {
            return true;
        }
        return list.size() == 0 && this.f17889k.size() == 0;
    }

    public final List<bv> l() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(this.f17888j);
        arrayList.addAll(this.f17889k);
        this.f17888j.clear();
        this.f17889k.clear();
        return arrayList;
    }

    public final int m() {
        return this.f17891m;
    }

    public final int n() {
        return this.f17892n;
    }

    public final int o() {
        return this.f17893o;
    }

    public final bz p() {
        return this.f17895q;
    }

    public final bq q() {
        return this.f17896r;
    }

    public final ac r() {
        return this.f17899u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.util.List, java.util.List<com.anythink.core.common.h.bv>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.List<com.anythink.core.common.h.bv>] */
    public final List<bv> s() {
        ?? arrayList;
        int i = this.f17882c;
        if (i == 1 || i == 3) {
            arrayList = new ArrayList();
            int min = Math.min(this.f17883d, this.f17885f.size());
            for (int i4 = 0; i4 < min; i4++) {
                arrayList.add(this.f17885f.get(i4));
            }
        } else {
            arrayList = i == 2 ? b(1) : 0;
        }
        if (arrayList != 0) {
            arrayList.size();
        }
        if (arrayList != 0 && arrayList.size() > 0) {
            this.f17885f.removeAll(arrayList);
        }
        return arrayList;
    }

    public final boolean t() {
        return this.f17885f.size() == 0 && this.f17887h.size() == 0 && this.i.size() == 0 && this.f17886g.size() == 0;
    }

    public final boolean u() {
        return this.f17892n < this.f17883d;
    }

    public final bv v() {
        bv x9 = x();
        bv A9 = A();
        return l.a(x9, A9) < 0 ? x9 : A9;
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
        return (bvVar.an() && a9 == 10000.0d && (R8 = bvVar.R()) != null) ? R8.f14218o : a9;
    }

    public final void a(List<bv> list) {
        this.f17886g.addAll(list);
    }

    public final void b(bv bvVar) {
        this.f17886g.remove(bvVar);
    }

    public final void c(bv bvVar) {
        this.f17890l.remove(bvVar);
    }

    public final void d(bv bvVar) {
        i iVar = this.f17897s;
        if (iVar != null) {
            iVar.a(bvVar);
        }
    }

    public final void e(bv bvVar) {
        ad R8;
        if (bvVar == null || !bvVar.o() || (R8 = bvVar.R()) == null) {
            return;
        }
        R8.a(this.f17898t);
    }

    public final void f(bv bvVar) {
        ad S8;
        if (bvVar == null || !bvVar.o() || (S8 = bvVar.S()) == null) {
            return;
        }
        S8.a(this.f17898t);
    }

    public final boolean g(bv bvVar) {
        ac acVar = this.f17898t;
        boolean z6 = false;
        if (acVar != null && bvVar != null) {
            bv a9 = acVar.a();
            if (a9 == null || l.a(bvVar, a9) < 0 || (l.a(bvVar, a9) == 0 && bvVar.ax() < a9.ax())) {
                z6 = true;
            }
            if (z6) {
                this.f17898t.a(bvVar);
            }
            if (a9 == null) {
                return z6;
            }
            if (z6) {
                this.f17898t.b(a9);
                return z6;
            }
            bv b9 = this.f17898t.b();
            if (b9 == null || l.a(bvVar, b9) < 0 || (l.a(bvVar, b9) == 0 && bvVar.ax() < b9.ax())) {
                this.f17898t.b(bvVar);
            }
        }
        return z6;
    }

    public final void h(bv bvVar) {
        synchronized (this.f17901w) {
            try {
                if (this.f17901w.size() == 0) {
                    this.f17901w.add(bvVar);
                } else {
                    double a9 = p.a(bvVar);
                    int i = 0;
                    while (true) {
                        if (i >= this.f17901w.size()) {
                            break;
                        }
                        if (a9 > p.a(this.f17901w.get(i))) {
                            this.f17901w.add(i, bvVar);
                            break;
                        } else {
                            if (i == this.f17901w.size() - 1) {
                                this.f17901w.add(bvVar);
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
                str = Wv.g(str, ",");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i).g());
            str = Wv.g(str, sb.toString());
        }
        return str;
    }

    private boolean k(bv bvVar) {
        return a(bvVar, true);
    }

    public final void a(bv bvVar) {
        this.f17886g.add(bvVar);
    }

    public final void b(List<bv> list) {
        this.f17890l.addAll(list);
    }

    public final void a(bv bvVar, int i) {
        synchronized (this.i) {
            try {
                Iterator<f> it = this.i.iterator();
                int i4 = 0;
                while (it.hasNext() && l.a(it.next().f17878a, bvVar) < 0) {
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
            list = this.f17885f;
        } else {
            list = this.f17887h;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int i4 = 0;
            bv bvVar = list.get(0);
            if (i == 2) {
                arrayList.add(bvVar);
            } else {
                bv a9 = a(true);
                int i6 = this.f17882c;
                if (i6 == 1) {
                    int i9 = this.f17883d - this.f17892n;
                    list.size();
                    int min2 = Math.min(i9, list.size());
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
                } else if (i6 == 2) {
                    boolean z6 = l.a(bvVar, a9) < 0;
                    if (this.f17894p == 0 && z6) {
                        double a10 = p.a(bvVar);
                        int size = list.size();
                        while (i4 < size) {
                            bv bvVar3 = list.get(i4);
                            if (p.a(bvVar3) == a10) {
                                arrayList.add(bvVar3);
                            }
                            i4++;
                        }
                        this.f17894p = arrayList.size();
                    }
                } else if (i6 == 3 && this.f17892n == 0 && (min = Math.min(this.f17883d, list.size())) > 0) {
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
        synchronized (this.f17886g) {
            try {
                list = null;
                for (bv bvVar2 : this.f17886g) {
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
        if (this.f17890l.size() > 0) {
            synchronized (this.f17890l) {
                try {
                    list2 = null;
                    for (bv bvVar3 : this.f17890l) {
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
        int d9 = bvVar.d();
        return d9 == 4 || d9 == 3;
    }

    public final void a(int i, int i4) {
        this.f17891m += i;
        if (i4 != 2) {
            this.f17892n += i;
        } else {
            this.f17893o += i;
        }
    }

    public final void a(int i) {
        if (this.f17882c == 2 && i == 1) {
            this.f17894p--;
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

    private double c(boolean z6) {
        synchronized (this.f17901w) {
            try {
                int size = this.f17901w.size();
                if (size == 0) {
                    return 0.0d;
                }
                int i = this.f17881b - 1;
                int i4 = size - 1;
                if (z6 && i4 < i) {
                    return 0.0d;
                }
                return p.a(this.f17901w.get(Math.min(i, i4)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bv a(boolean z6) {
        synchronized (this.f17901w) {
            try {
                int size = this.f17901w.size();
                if (size == 0) {
                    return null;
                }
                int i = this.f17881b - 1;
                int i4 = size - 1;
                if (z6 && i4 < i) {
                    return null;
                }
                bv bvVar = this.f17901w.get(Math.min(i, i4));
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
        synchronized (this.f17901w) {
            a(arrayList, this.f17901w);
        }
        synchronized (this.f17886g) {
            a(arrayList, this.f17886g);
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
                list = this.f17885f;
            } else {
                list = this.f17887h;
            }
            synchronized (list) {
                p.a(list, bvVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final bv b(boolean z6) {
        bv a9;
        if (!z6 || (a9 = this.f17898t.a()) == null) {
            return null;
        }
        if (!a9.o()) {
            a9.toString();
            return null;
        }
        if (a9.av() == 1) {
            return null;
        }
        synchronized (this.f17886g) {
            for (bv bvVar : this.f17886g) {
                if (l.a(bvVar, a9) < 0) {
                    bvVar.toString();
                    return null;
                }
            }
            synchronized (this.i) {
                Iterator<f> it = this.i.iterator();
                while (it.hasNext()) {
                    bv bvVar2 = it.next().f17878a;
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

    private static void a(bv bvVar, n nVar, boolean z6, int i) {
        ad R8 = bvVar.R();
        if (R8 != null) {
            com.anythink.core.b.d.c.a(R8, new aw(2, bvVar, nVar), z6, i);
        }
    }

    private void a(List<bv> list, List<bv> list2) {
        int as;
        int size = list2.size();
        int size2 = this.f17901w.size();
        for (int i = 0; i < size; i++) {
            bv bvVar = list2.get(i);
            if (bvVar.o() && (as = bvVar.as()) > 0 && as <= size2 && l.a(bvVar, this.f17901w.get(as - 1)) > 0) {
                list.add(bvVar);
            }
        }
    }

    public final boolean a(bv bvVar, boolean z6) {
        Iterator<bv> it;
        double d9;
        if (bvVar.br()) {
            return true;
        }
        double a9 = p.a(bvVar);
        double c9 = c(true);
        synchronized (this.f17886g) {
            try {
                it = this.f17886g.iterator();
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                if (!it.hasNext()) {
                    d9 = 0.0d;
                    break;
                }
                bv next = it.next();
                d9 = p.a(next);
                if (z6) {
                    if (next.o() && d9 > p.a(bvVar)) {
                        break;
                    }
                } else if (d9 > p.a(bvVar)) {
                    break;
                }
                throw th;
            }
        }
        return a9 > Math.max(c9, d9);
    }

    public final void b(n nVar) {
        bv bvVar;
        synchronized (this.f17885f) {
            try {
                for (bv bvVar2 : this.f17885f) {
                    if (bvVar2 != null && bvVar2.o()) {
                        b(bvVar2, nVar);
                    }
                }
                this.f17885f.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.i) {
            try {
                for (f fVar : this.i) {
                    if (fVar != null && (bvVar = fVar.f17878a) != null && bvVar.o()) {
                        b(fVar.f17878a, nVar);
                    }
                }
                this.i.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f17887h) {
            this.f17887h.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r4 != 7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(bv bvVar, j jVar) {
        boolean z6 = bvVar.af() == 1;
        if (z6) {
            int q8 = bvVar.q();
            if (q8 != 1 && q8 != 3) {
                if (q8 == 6) {
                    if (jVar.f17925g) {
                        return false;
                    }
                    jVar.f17925g = true;
                    return z6;
                }
            }
            if (jVar.f17924f) {
                return false;
            }
            jVar.f17924f = true;
        }
        return z6;
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
        boolean z6 = false;
        try {
            if (bvVar.o()) {
                ad R8 = bvVar.R();
                com.anythink.core.b.f.a().a(str, R8);
                if (R8 != null && R8.a()) {
                    z6 = true;
                }
                if (z6 && R8 != null) {
                    com.anythink.core.b.d.c.a(R8, new aw(1, bvVar, nVar), true, 25);
                }
            }
        } catch (Throwable unused) {
        }
        return z6;
    }

    public static void b(bv bvVar, n nVar) {
        if (bvVar != null && bvVar.o() && bvVar.P() == 2) {
            a(bvVar, nVar.af(), true, 22);
        }
    }

    public final long a(boolean z6, long j6) {
        if (this.f17887h.size() <= 0) {
            return -1L;
        }
        if (this.f17885f.size() == 0 && z6) {
            return 0L;
        }
        return j6;
    }

    public static bv a(Map<String, e> map) {
        bv bvVar;
        Iterator<Map.Entry<String, e>> it = map.entrySet().iterator();
        bv bvVar2 = null;
        if (it != null) {
            while (it.hasNext()) {
                e value = it.next().getValue();
                if (value != null && !value.i && (bvVar = value.f17845c) != null && (bvVar2 == null || l.a(bvVar, bvVar2) < 0)) {
                    bvVar2 = bvVar;
                }
            }
        }
        return bvVar2;
    }

    public final boolean a(boolean z6, bv bvVar) {
        bv bvVar2;
        if (!z6) {
            return false;
        }
        synchronized (this.f17886g) {
            try {
                bvVar2 = null;
                for (bv bvVar3 : this.f17886g) {
                    if (l.a(bvVar3, bvVar2) < 0) {
                        bvVar2 = bvVar3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bv v9 = v();
        if (l.a(bvVar2, v9) >= 0) {
            bvVar2 = v9;
        }
        return l.a(bvVar, bvVar2) <= 0;
    }

    public final Map<String, Double> a(List<bv> list, bv bvVar) {
        HashMap hashMap = new HashMap();
        double d9 = this.f17900v;
        double a9 = p.a(bvVar);
        if (a9 > d9) {
            d9 = a9;
        }
        if (list != null) {
            for (bv bvVar2 : list) {
                double ar = bvVar2.ar();
                String z6 = bvVar2.z();
                if (ar <= d9) {
                    ar = d9;
                }
                hashMap.put(z6, Double.valueOf(ar));
            }
        }
        return hashMap;
    }
}
