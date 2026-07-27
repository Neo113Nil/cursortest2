package com.anythink.core.common;

import D.y;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATRequestingInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.common.a.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.j;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.w.a.a;
import com.anythink.core.mg.api.MgComparedResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class g {

    /* renamed from: A, reason: collision with root package name */
    boolean f13174A;

    /* renamed from: G, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13180G;

    /* renamed from: I, reason: collision with root package name */
    com.anythink.core.common.w.g f13182I;
    c.a J;

    /* renamed from: M, reason: collision with root package name */
    bv f13185M;

    /* renamed from: N, reason: collision with root package name */
    double f13186N;

    /* renamed from: P, reason: collision with root package name */
    bv f13188P;

    /* renamed from: T, reason: collision with root package name */
    private h f13192T;

    /* renamed from: b, reason: collision with root package name */
    protected WeakReference<Context> f13194b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13195c;

    /* renamed from: e, reason: collision with root package name */
    protected cb f13197e;

    /* renamed from: f, reason: collision with root package name */
    protected String f13198f;

    /* renamed from: g, reason: collision with root package name */
    protected String f13199g;

    /* renamed from: h, reason: collision with root package name */
    Map<String, Object> f13200h;
    com.anythink.core.common.h.n i;

    /* renamed from: j, reason: collision with root package name */
    protected ar f13201j;

    /* renamed from: k, reason: collision with root package name */
    protected com.anythink.core.common.d.c f13202k;

    /* renamed from: o, reason: collision with root package name */
    boolean f13206o;

    /* renamed from: p, reason: collision with root package name */
    boolean f13207p;

    /* renamed from: s, reason: collision with root package name */
    String f13210s;

    /* renamed from: u, reason: collision with root package name */
    long f13212u;

    /* renamed from: v, reason: collision with root package name */
    int f13213v;

    /* renamed from: w, reason: collision with root package name */
    int f13214w;

    /* renamed from: R, reason: collision with root package name */
    private final String f13190R = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    protected String f13196d = "";

    /* renamed from: l, reason: collision with root package name */
    boolean f13203l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f13204m = false;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f13205n = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f13208q = false;

    /* renamed from: r, reason: collision with root package name */
    boolean f13209r = false;

    /* renamed from: x, reason: collision with root package name */
    Object f13215x = new Object();

    /* renamed from: y, reason: collision with root package name */
    bv f13216y = null;

    /* renamed from: z, reason: collision with root package name */
    boolean f13217z = false;

    /* renamed from: B, reason: collision with root package name */
    bv f13175B = null;

    /* renamed from: C, reason: collision with root package name */
    bv f13176C = null;

    /* renamed from: F, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13179F = null;

    /* renamed from: L, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13184L = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.g.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.a();
                }
            });
        }
    };

    /* renamed from: O, reason: collision with root package name */
    boolean f13187O = false;

    /* renamed from: Q, reason: collision with root package name */
    boolean f13189Q = false;

    /* renamed from: a, reason: collision with root package name */
    protected Context f13193a = com.anythink.core.common.d.t.b().g();

    /* renamed from: t, reason: collision with root package name */
    AdError f13211t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");

    /* renamed from: D, reason: collision with root package name */
    protected Map<String, com.anythink.core.common.w.e> f13177D = new ConcurrentHashMap();

    /* renamed from: E, reason: collision with root package name */
    List<bv> f13178E = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: H, reason: collision with root package name */
    com.anythink.core.common.w.j f13181H = new com.anythink.core.common.w.j();

    /* renamed from: K, reason: collision with root package name */
    List<ATBaseAdAdapter> f13183K = new ArrayList();

    /* renamed from: S, reason: collision with root package name */
    private final com.anythink.core.mg.a.a f13191S = new com.anythink.core.mg.a.a();

    /* renamed from: com.anythink.core.common.g$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.t.b {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f13179F = null;
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.j();
                }
            }, 2);
        }
    }

    /* renamed from: com.anythink.core.common.g$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.core.common.t.b {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.p();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f13258a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f13259b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f13260c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f13261d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f13262e = 5;
    }

    public g(Context context) {
        this.f13194b = new WeakReference<>(context);
    }

    private synchronized boolean A() {
        if (this.f13182I.c() == 0) {
            if (this.f13182I.d() == 0) {
                return true;
            }
        }
        return false;
    }

    private void B() {
        if (this.f13184L != null) {
            com.anythink.core.common.t.d.a().b(this.f13184L);
        }
    }

    private com.anythink.core.common.h.c C() {
        com.anythink.core.common.h.c a9 = com.anythink.core.common.a.a().a(this.f13193a, this.f13199g);
        if (a9 != null) {
            return a9;
        }
        c.a aVar = this.J;
        return aVar != null ? aVar.a() : a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f13183K.size() == 0) {
            return;
        }
        synchronized (this.f13183K) {
            try {
                Iterator<ATBaseAdAdapter> it = this.f13183K.iterator();
                while (it.hasNext()) {
                    it.next().destory();
                }
                this.f13183K.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E() {
        if (this.f13182I.u()) {
            List<bv> b9 = this.f13182I.b(1);
            if (b9.size() > 0) {
                a(b9, 1);
            }
        }
    }

    public static /* synthetic */ boolean a(int i) {
        return i == 3 || i == 5;
    }

    private static boolean b(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        try {
            com.anythink.core.common.h.c C8 = C();
            this.f13209r = true;
            if (this.f13205n || C8 == null) {
                return;
            }
            bv unitGroupInfo = C8.e() != null ? C8.e().getUnitGroupInfo() : null;
            a(unitGroupInfo, com.anythink.core.common.v.p.a(unitGroupInfo), true);
            a(9, unitGroupInfo);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void k() {
        if (this.f13206o) {
            this.f13182I.b(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4.f13181H.b() == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x0027, B:7:0x0031, B:10:0x004a, B:12:0x0058, B:13:0x0067, B:15:0x006e, B:20:0x0074, B:22:0x003a, B:24:0x0042), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void l() {
        try {
            bv a9 = this.f13182I.a(false);
            bv s9 = s();
            this.f13182I.m();
            this.f13197e.g();
            com.anythink.core.common.v.l.a(a9, s9);
            this.f13181H.c();
            this.f13181H.b();
            if (this.f13203l) {
                if (this.f13214w >= this.f13197e.g()) {
                    if (com.anythink.core.common.v.l.a(a9, s9) > 0) {
                    }
                    this.f13206o = true;
                    k();
                    if (this.f13182I.m() == 0) {
                        com.anythink.core.common.w.g.a(this.f13193a, this.f13199g);
                        com.anythink.core.common.w.g.a(this.f13199g);
                        r();
                    }
                    q();
                    if (!this.f13206o || z()) {
                        r();
                    }
                }
            }
            if (!this.f13181H.c()) {
            }
            this.f13206o = true;
            k();
            if (this.f13182I.m() == 0) {
            }
            q();
            if (!this.f13206o) {
            }
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void m() {
        if (this.J != null) {
            com.anythink.core.common.h.n af = this.i.af();
            aj.a(af, this.J.d(), 0, true);
            this.J.a(this.f13198f, af);
        }
    }

    private void n() {
        if (this.f13197e.i() >= 0) {
            this.f13179F = new AnonymousClass3();
            this.f13197e.i();
            com.anythink.core.common.t.d.a().a(this.f13179F, this.f13197e.i(), false);
        }
    }

    private com.anythink.core.common.t.b o() {
        return new AnonymousClass4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        if (!this.f13205n && this.f13182I.e() > 0) {
            this.f13180G = null;
            bv f3 = this.f13182I.f();
            f3.toString();
            this.f13182I.a(f3);
            this.f13182I.e();
            this.f13182I.o();
            b(f3, 2);
        }
    }

    private synchronized void q() {
        final ad R8;
        if (!this.f13181H.g() && this.f13181H.e()) {
            if (this.f13181H.b()) {
                return;
            }
            if (this.i.ah()) {
                return;
            }
            final bv b9 = this.f13182I.b(this.f13203l);
            if (b9 != null && (R8 = b9.R()) != null) {
                this.f13181H.h();
                com.anythink.core.mg.a.a aVar = this.f13191S;
                if (aVar != null) {
                    MgComparedResult a9 = aVar.a();
                    if (a9 == null) {
                        this.f13191S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.7
                            @Override // com.anythink.core.mg.a.b
                            public final void a(MgComparedResult mgComparedResult) {
                                g.b(R8, b9, mgComparedResult);
                            }
                        });
                        return;
                    } else {
                        b(R8, b9, a9);
                        return;
                    }
                }
                b(R8, b9, null);
            }
            return;
        }
        this.f13181H.g();
        this.f13181H.e();
    }

    private synchronized void r() {
        if (!this.f13181H.e()) {
            this.f13181H.e();
        } else {
            if (this.f13181H.b()) {
                return;
            }
            this.f13182I.a(this.i.af());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bv s() {
        bv bvVar;
        if (this.f13197e.j() == 2) {
            synchronized (this.f13177D) {
                bvVar = com.anythink.core.common.w.g.a(this.f13177D);
            }
        } else {
            bvVar = null;
        }
        bv v9 = this.f13182I.v();
        return com.anythink.core.common.v.l.a(bvVar, v9) < 0 ? bvVar : v9;
    }

    private synchronized void t() {
        this.f13182I.h();
        if (this.f13180G != null) {
            com.anythink.core.common.t.d.a().b(this.f13180G);
            this.f13180G = null;
        }
    }

    private synchronized boolean u() {
        if (this.f13182I.k()) {
            return false;
        }
        if (this.f13181H.c()) {
            return false;
        }
        bv bvVar = this.f13216y;
        if (bvVar != null && bvVar.br()) {
            return false;
        }
        this.f13181H.f();
        this.f13189Q = true;
        List<bv> l9 = this.f13182I.l();
        this.f13182I.b(l9);
        a(8, l9, new j.a() { // from class: com.anythink.core.common.g.9
            @Override // com.anythink.core.common.j.a
            public final void a(String str) {
            }

            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list, List<bv> list2, boolean z3) {
                for (bv bvVar2 : list) {
                    g.this.d(bvVar2);
                    bvVar2.C(8);
                    g.this.f13182I.a(bvVar2);
                    g.this.b(bvVar2, 3);
                }
                if (list2 != null) {
                    Iterator<bv> it = list2.iterator();
                    while (it.hasNext()) {
                        g.this.b(it.next());
                    }
                }
                g gVar = g.this;
                gVar.f13189Q = false;
                gVar.c((com.anythink.core.common.w.e) null);
            }
        });
        return true;
    }

    private synchronized void v() {
        if (this.f13203l) {
            if (this.f13181H.c()) {
                return;
            }
            bv bvVar = this.f13216y;
            if (bvVar == null || !bvVar.br()) {
                List<bv> list = this.f13178E;
                if (list != null && list.size() != 0) {
                    if (this.f13207p) {
                        return;
                    }
                    this.f13207p = true;
                    a(7, this.f13178E, new j.a() { // from class: com.anythink.core.common.g.10
                        @Override // com.anythink.core.common.j.a
                        public final void a(String str) {
                        }

                        @Override // com.anythink.core.common.j.a
                        public final void a(String str, List<bv> list2, List<bv> list3, boolean z3) {
                            if (g.this.f13181H.c()) {
                                String unused = g.this.f13190R;
                                for (bv bvVar2 : list2) {
                                    g.this.f13182I.e(bvVar2);
                                    com.anythink.core.common.w.g.b(bvVar2, g.this.i);
                                }
                                return;
                            }
                            g gVar = g.this;
                            if (gVar.f13214w < gVar.f13197e.g()) {
                                String unused2 = g.this.f13190R;
                                g.this.a(list2, (List<bv>) null, (List<bv>) null, list3);
                                g.this.l();
                                return;
                            }
                            String unused3 = g.this.f13190R;
                            bv a9 = g.this.f13182I.a(false);
                            int size = list2.size();
                            ArrayList arrayList = new ArrayList(size);
                            ArrayList arrayList2 = new ArrayList(size);
                            for (int i = 0; i < size; i++) {
                                bv bvVar3 = list2.get(i);
                                g.this.f13182I.e(bvVar3);
                                if (com.anythink.core.common.v.l.a(bvVar3, a9) < 0) {
                                    arrayList.add(bvVar3);
                                } else {
                                    arrayList2.add(bvVar3);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                bv bvVar4 = (bv) it.next();
                                g.this.d(bvVar4);
                                bvVar4.C(7);
                                g.this.f13182I.a(bvVar4);
                                g.this.b(bvVar4, 5);
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                com.anythink.core.common.w.g.b((bv) it2.next(), g.this.i);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean w() {
        if (this.f13180G == null || !A()) {
            return false;
        }
        com.anythink.core.common.t.d.a().b(this.f13180G);
        this.f13180G.run();
        this.f13180G = null;
        return true;
    }

    private void x() {
        f((bv) null);
    }

    private void y() {
        com.anythink.core.common.h.c C8 = C();
        if (C8 == null) {
            f((bv) null);
            return;
        }
        bv unitGroupInfo = C8.e() != null ? C8.e().getUnitGroupInfo() : null;
        a(unitGroupInfo, com.anythink.core.common.v.p.a(unitGroupInfo), true);
        a(9, unitGroupInfo);
    }

    private synchronized boolean z() {
        this.f13182I.c();
        this.f13182I.d();
        this.f13182I.e();
        this.f13182I.i();
        Objects.toString(this.f13216y);
        Objects.toString(this.f13188P);
        Objects.toString(this.f13176C);
        return this.f13182I.t();
    }

    public final c.a h() {
        return this.J;
    }

    public final com.anythink.core.d.l i() {
        return this.f13197e.a();
    }

    /* renamed from: com.anythink.core.common.g$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.core.common.w.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f13231a;

        public AnonymousClass6(bv bvVar) {
            this.f13231a = bvVar;
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar) {
            com.anythink.core.common.u.c.a(g.this.f13193a).a(1, nVar);
            ab.a(nVar, j.r.f12529a, j.r.f12542o, "");
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
            g.a(g.this, nVar, aTBaseAdAdapter);
            if (this.f13231a.aJ() == 1) {
                g.a(g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
            g.this.a(aTBaseAdAdapter, str);
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, String str2) {
            g.this.a(str);
            if (this.f13231a.aJ() == 1) {
                g.this.D();
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.c cVar) {
            g.this.a(str, aTBaseAdAdapter, cVar.f(), bvVar);
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter q8 = com.anythink.core.common.d.t.b().q(g.this.f13199g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (q8 != null && q8.isAdFilter(com.anythink.core.common.d.l.a(aTBaseAdAdapter, 3), baseAd)) {
                com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                bVar.f17028c = 8;
                bVar.f17030e = aTBaseAdAdapter.getTrackingInfo().ab();
                bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                bVar.f17031f = aTBaseAdAdapter.getTrackingInfo();
                bVar.f17032g = aTBaseAdAdapter.getUnitGroupInfo();
                g.this.a(str, bVar);
            } else {
                g.this.a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            }
            if (this.f13231a.aJ() == 1) {
                g.b(g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.w.b bVar) {
            g.this.a(str, bVar);
            if (aTBaseAdAdapter == null || aTBaseAdAdapter.getUnitGroupInfo() == null) {
                return;
            }
            aTBaseAdAdapter.getUnitGroupInfo();
            if (this.f13231a.aJ() == 1) {
                g.b(g.this, aTBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(bv bvVar) {
        this.f13182I.d(bvVar);
        com.anythink.core.common.w.g.a(this.f13193a, this.f13199g, this.f13198f, null, bvVar);
        this.f13182I.e(bvVar);
        this.f13182I.c(bvVar);
        g(bvVar);
    }

    private synchronized void e(bv bvVar) {
        bvVar.z();
        if (this.f13181H.b()) {
            return;
        }
        if (this.i.ah()) {
            return;
        }
        com.anythink.core.common.w.g.i(bvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(bv bvVar) {
        this.f13205n = true;
        this.f13204m = false;
        if (this.f13184L != null) {
            com.anythink.core.common.t.d.a().b(this.f13184L);
        }
        com.anythink.core.common.u.e.a(this.i.af(), this.f13211t, bvVar);
        if (!this.f13187O) {
            a(this.f13211t);
        }
        f();
    }

    public final void g() {
        List<com.anythink.core.common.w.f> j6 = this.f13182I.j();
        synchronized (j6) {
            try {
                if (j6.size() > 0) {
                    bv a9 = j6.remove(0).a();
                    if (this.f13205n) {
                        if (this.f13214w >= this.f13197e.g()) {
                            if (com.anythink.core.common.v.l.a(a9, this.f13216y) < 0) {
                            }
                        }
                    }
                    this.f13182I.a(a9);
                    b(a9, 4);
                }
                if (j6.size() > 0) {
                    for (com.anythink.core.common.w.f fVar : j6) {
                        bv a10 = fVar.a();
                        if (!this.f13205n || this.f13214w < this.f13197e.g() || com.anythink.core.common.v.l.a(a10, this.f13216y) < 0) {
                            int b9 = fVar.b();
                            if (b9 == 1) {
                                a(a10, 1);
                                c(b9);
                            } else if (b9 == 2) {
                                a(a10, 2);
                                c(b9);
                            } else if (b9 == 3) {
                                this.f13182I.a(a10);
                                b(a10, 3);
                            }
                        }
                    }
                }
                j6.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        l();
    }

    private synchronized void c(int i) {
        int o6;
        try {
            if (i != 2) {
                o6 = this.f13182I.n();
            } else {
                o6 = this.f13182I.o();
            }
            if (o6 == 0) {
                a(this.f13182I.b(i), i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bv bvVar) {
        this.f13211t.putNetworkErrorMsg(bvVar.z(), bvVar.g(), bvVar.h(), ErrorCode.getErrorCode(ErrorCode.noADError, "", bvVar.F()));
        this.f13182I.c(bvVar);
    }

    private void c(bv bvVar) {
        if (bvVar != null) {
            try {
                if (bvVar.g() == 22) {
                    this.f13182I.f(bvVar);
                    com.anythink.core.common.w.g.a(bvVar, this.i);
                }
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void d(com.anythink.core.common.w.e eVar) {
        bv bvVar;
        ATRequestingInfo aTRequestingInfo;
        if (this.f13187O) {
            ar arVar = this.f13201j;
            if (arVar != null) {
                arVar.f13550f = null;
            }
            return;
        }
        ar arVar2 = this.f13201j;
        if (arVar2 != null && arVar2.f13550f != null) {
            boolean z3 = true;
            if (this.f13175B == null) {
                bvVar = this.f13216y;
            } else if (eVar == null || eVar.f() == null || eVar.c() == null) {
                z3 = false;
                bvVar = null;
            } else {
                bv f3 = eVar.f();
                if (com.anythink.core.common.v.l.a(f3, this.f13175B) < 0) {
                    if (eVar.c().booleanValue()) {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f3);
                        bvVar = f3;
                    } else {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f3);
                    }
                }
                z3 = false;
                bvVar = f3;
            }
            if (z3) {
                this.f13175B = bvVar;
                aTRequestingInfo = this.f13182I.d(bvVar, this.i);
                if (aTRequestingInfo != null) {
                    this.f13201j.f13550f.onAdMultipleLoaded(aTRequestingInfo);
                }
            } else {
                aTRequestingInfo = null;
            }
            if (aTRequestingInfo == null && this.f13182I.a(this.f13203l, this.f13175B)) {
                this.f13201j.f13550f.onAdMultipleLoaded(null);
                this.f13201j.f13550f = null;
            }
        }
    }

    public final void b() {
        long a9 = this.f13182I.a(this.f13203l, this.f13197e.a().K());
        if (a9 > -1) {
            this.f13180G = new AnonymousClass4();
        }
        if (this.f13182I.g() && this.f13203l) {
            u();
        }
        a(this.f13182I.s(), 1);
        if (this.f13180G != null) {
            com.anythink.core.common.t.d.a().a(this.f13180G, a9, false);
        }
        if (this.J != null) {
            com.anythink.core.common.h.n af = this.i.af();
            aj.a(af, this.J.d(), 0, true);
            this.J.a(this.f13198f, af);
        }
    }

    public final void e() {
        synchronized (this.f13215x) {
            this.f13203l = true;
            this.f13208q = true;
            c((com.anythink.core.common.w.e) null);
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.f13209r != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r2.f13205n != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        a(-1, r2.f13216y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        if (com.anythink.core.common.v.l.a(r2.f13216y, r0) > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c(com.anythink.core.common.w.e eVar) {
        try {
            bv s9 = s();
            if (this.f13217z) {
                if (!this.f13203l) {
                    if (this.f13208q) {
                    }
                }
            } else if (this.f13203l) {
                if (this.f13189Q) {
                    return;
                }
                if (this.f13180G != null && A()) {
                    com.anythink.core.common.t.d.a().b(this.f13180G);
                    this.f13180G.run();
                    this.f13180G = null;
                } else if (z() && !this.f13205n) {
                    y();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        ConcurrentHashMap concurrentHashMap;
        try {
            this.f13181H.a();
            synchronized (this.f13177D) {
                concurrentHashMap = new ConcurrentHashMap(this.f13177D);
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.anythink.core.common.w.e eVar = (com.anythink.core.common.w.e) ((Map.Entry) it.next()).getValue();
                if (eVar != null) {
                    eVar.b();
                }
            }
            if (!this.f13205n) {
                this.f13205n = true;
                y();
            }
            l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f() {
        this.f13187O = true;
        u a9 = u.a();
        String str = this.f13199g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13197e.a().aq());
        f a10 = a9.a(str, sb.toString());
        if (a10 != null) {
            a10.a(this.f13198f);
            return;
        }
        y.w("AdManage is null--notifycancel", "Id:" + this.f13199g + "--format:" + this.f13197e.a().aq());
    }

    private void e(int i) {
        com.anythink.core.d.l a9;
        ab.a("Mediation", "placementId:" + this.f13199g + ";result_callback:success;loadType:" + this.f13201j.f13547c + ";");
        v.a(this.f13193a).a(this.f13199g, this.f13198f, true);
        ar arVar = this.f13201j;
        if (arVar != null && arVar.f13549e != null) {
            try {
                cb cbVar = this.f13197e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13199g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13197e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = this.f13201j;
                        arVar2.f13549e.a(1, arVar2, this.f13197e, e9.f13988a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13201j;
            arVar3.f13549e.a(this.f13174A ? 1 : 2, arVar3, this.f13197e, i);
            this.f13201j.f13549e = null;
        }
        com.anythink.core.c.b.a().a(this.f13199g, this.f13198f, this.f13197e.a().ay(), this.f13201j, this.f13182I.b().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final bv bvVar, final int i) {
        final com.anythink.core.common.w.e eVar = new com.anythink.core.common.w.e(bvVar, i);
        final String a9 = eVar.a();
        this.f13177D.put(a9, eVar);
        this.f13182I.a(1, i);
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.5
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                synchronized (g.this) {
                    try {
                        if (g.this.f13181H.b()) {
                            g.this.f13177D.remove(a9);
                            return;
                        }
                        if (ak.a(bvVar) && TextUtils.isEmpty(u.a().a(g.this.f13199g, bvVar.g()))) {
                            u.a().a(g.this.f13199g, bvVar.g(), bvVar.k());
                        }
                        boolean a10 = g.a(i);
                        com.anythink.core.common.h.n af = g.this.i.af();
                        if (a10) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bvVar.g());
                            str = sb.toString();
                        } else {
                            str = g.this.f13210s;
                        }
                        af.s(str);
                        aj.a(af, bvVar, g.this.f13213v, true);
                        af.o(SystemClock.elapsedRealtime() - g.this.f13212u);
                        if (g.this.a(af, bvVar, i, a9)) {
                            return;
                        }
                        String unused = g.this.f13190R;
                        bvVar.toString();
                        boolean a11 = com.anythink.core.common.w.g.a(g.this.f13199g, bvVar, af);
                        g.this.f13213v++;
                        if (a11) {
                            com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                            bVar.f17028c = 6;
                            bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            bVar.f17030e = 0L;
                            bVar.f17031f = af;
                            bVar.f17032g = bvVar;
                            g.this.a(a9, bVar);
                            return;
                        }
                        int ao = bvVar.ao();
                        if (ao > 0) {
                            af.f14025t = ao;
                        } else {
                            g gVar = g.this;
                            if (gVar.f13204m && gVar.f13214w < gVar.f13197e.g()) {
                                af.f14025t = 5;
                            }
                        }
                        g.a(g.this, eVar, af, bvVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void a(Map<String, Object> map) {
        this.f13200h = map;
    }

    private void a(com.anythink.core.common.h.n nVar) {
        this.i = nVar;
    }

    private void b(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13202k;
        if (cVar != null) {
            cVar.onAdSourceLoadFilled(nVar);
        }
        a(nVar, (AdError) null, a.b.f16984b, aTBaseAdAdapter.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 4);
    }

    public final void a(com.anythink.core.common.d.c cVar) {
        this.f13202k = cVar;
    }

    public final void a(ar arVar) {
        this.f13201j = arVar;
    }

    private synchronized void a(List<bv> list, int i) {
        if (!this.f13181H.b() && !this.f13181H.c() && list != null && list.size() != 0) {
            this.f13182I.a(list);
            this.f13182I.d();
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), i);
            }
        }
    }

    public final boolean c() {
        if (this.f13205n) {
            return true;
        }
        return this.f13203l && this.f13182I.c() == 0 && this.f13182I.m() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(ad adVar, bv bvVar, MgComparedResult mgComparedResult) {
        int i;
        if (mgComparedResult != null) {
            if (mgComparedResult.isMgWin()) {
                i = 0;
            } else if (mgComparedResult.isCompared()) {
                i = 34;
            }
            if (i <= 0) {
                com.anythink.core.b.d.c.a(adVar, bvVar, i);
                return;
            }
            return;
        }
        i = 2;
        if (i <= 0) {
        }
    }

    private void d(int i) {
        com.anythink.core.d.l a9;
        u();
        if (this.f13187O) {
            return;
        }
        ab.a("Mediation", "placementId:" + this.f13199g + ";result_callback:success;loadType:" + this.f13201j.f13547c + ";");
        v.a(this.f13193a).a(this.f13199g, this.f13198f, true);
        ar arVar = this.f13201j;
        if (arVar != null && arVar.f13549e != null) {
            try {
                cb cbVar = this.f13197e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13199g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13197e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = this.f13201j;
                        arVar2.f13549e.a(1, arVar2, this.f13197e, e9.f13988a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13201j;
            arVar3.f13549e.a(this.f13174A ? 1 : 2, arVar3, this.f13197e, i);
            this.f13201j.f13549e = null;
        }
        com.anythink.core.c.b.a().a(this.f13199g, this.f13198f, this.f13197e.a().ay(), this.f13201j, this.f13182I.b().a());
    }

    private void g(bv bvVar) {
        if (bvVar != null && com.anythink.core.common.w.g.j(bvVar) > com.anythink.core.common.v.p.a(this.f13188P)) {
            bvVar.toString();
            this.f13188P = bvVar;
        }
    }

    private void b(com.anythink.core.common.w.e eVar) {
        if (eVar.c() == null || !eVar.c().booleanValue() || eVar.e() == 2 || !eVar.c().booleanValue()) {
            return;
        }
        this.f13214w++;
    }

    private synchronized void a(bv bvVar, int i) {
        this.f13182I.b(bvVar, i);
    }

    private synchronized void a(bv bvVar) {
        this.f13182I.b(bvVar);
    }

    private void b(long j6) {
        com.anythink.core.common.t.d.a().a(this.f13184L, j6, false);
    }

    private void b(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13183K) {
            this.f13183K.remove(aTBaseAdAdapter);
        }
    }

    public final void a(List<bv> list, List<bv> list2, List<bv> list3, List<bv> list4) {
        boolean a9;
        String str;
        synchronized (this.f13215x) {
            if (list2 != null) {
                try {
                    Iterator<bv> it = list2.iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (list4 != null && !list4.isEmpty()) {
                for (bv bvVar : list4) {
                    if (bvVar != null) {
                        try {
                            if (bvVar.g() == 22) {
                                this.f13182I.f(bvVar);
                                com.anythink.core.common.w.g.a(bvVar, this.i);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (list3 != null) {
                this.f13178E.addAll(list3);
            }
            if (list != null && list.size() != 0) {
                this.f13181H.f();
                h hVar = this.f13192T;
                boolean e9 = hVar == null ? false : hVar.e();
                h hVar2 = this.f13192T;
                boolean d2 = hVar2 == null ? false : hVar2.d();
                if (!this.f13203l && d2 && e9) {
                    a(list);
                    return;
                }
                bv bvVar2 = list.get(0);
                boolean a10 = com.anythink.core.common.w.g.a(bvVar2, this.f13181H);
                if (e9 && !d2) {
                    a9 = this.f13182I.a(bvVar2, false);
                } else {
                    a9 = this.f13182I.a(bvVar2, true);
                }
                if (a10 || a9) {
                    if (!this.f13205n) {
                        str = "1";
                    } else {
                        str = this.f13204m ? "2" : "3";
                    }
                    String str2 = str;
                    String str3 = "1";
                    if (a10) {
                        str3 = "1";
                    } else if (a9) {
                        str3 = "2";
                    }
                    com.anythink.core.common.u.e.a(this.i, bvVar2.g(), bvVar2.z(), com.anythink.core.common.v.p.a(bvVar2), com.anythink.core.common.v.p.b(bvVar2), str2, str3, bvVar2.bt(), bvVar2.bu());
                    if (bvVar2.an()) {
                        this.f13185M = bvVar2;
                    }
                    d(bvVar2);
                    list.remove(0);
                    this.f13182I.a(bvVar2);
                    b(bvVar2, 3);
                }
                a(list);
                E();
            }
        }
    }

    public static /* synthetic */ void b(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13183K) {
                gVar.f13183K.remove(aTBaseAdAdapter);
            }
        }
    }

    public final void d() {
        this.f13208q = true;
        c((com.anythink.core.common.w.e) null);
    }

    private void a(List<bv> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (bv bvVar : list) {
            d(bvVar);
            a(bvVar, 1);
        }
    }

    public final void a(com.anythink.core.common.w.h hVar) {
        this.f13182I = new com.anythink.core.common.w.g(hVar);
        this.f13203l = hVar.i;
        this.f13198f = hVar.f17117b;
        this.f13199g = hVar.f17116a;
        this.f13197e = hVar.f17118c;
        this.f13195c = hVar.f17124j;
        this.f13210s = com.anythink.core.common.w.g.c(hVar.f17119d);
    }

    public final void a(h hVar) {
        this.f13192T = hVar;
        this.f13212u = SystemClock.elapsedRealtime();
        com.anythink.core.common.t.d.a().a(this.f13184L, this.f13197e.h(), false);
        if (this.f13197e.i() >= 0) {
            this.f13179F = new AnonymousClass3();
            this.f13197e.i();
            com.anythink.core.common.t.d.a().a(this.f13179F, this.f13197e.i(), false);
        }
    }

    private void a(long j6) {
        if (this.f13180G != null) {
            com.anythink.core.common.t.d.a().a(this.f13180G, j6, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(com.anythink.core.common.h.n nVar, bv bvVar, int i, String str) {
        com.anythink.core.common.h.i c9 = u.a().c(this.f13199g);
        if (c9 == null || !c9.a(bvVar)) {
            return false;
        }
        ab.a(this.f13199g, nVar, "Can't Load On Showing", bvVar, -1, -1);
        com.anythink.core.common.u.e.a(nVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
        u.a().a(this.f13199g, c9.a(), this.f13198f);
        this.f13182I.a(bvVar, i);
        a(bvVar);
        this.f13182I.a(i);
        this.f13177D.remove(str);
        this.f13182I.a(-1, i);
        a(this.f13182I.b(i), i);
        return true;
    }

    private void a(com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17048a = this.f13193a;
        dVar.f17049b = this.f13194b;
        dVar.f17050c = this.f13198f;
        dVar.f17051d = this.f13199g;
        dVar.f17052e = this.f13197e.a();
        dVar.f17053f = this.f13200h;
        dVar.f17054g = this.f13213v;
        dVar.f17055h = nVar;
        dVar.i = this.f13182I.r();
        eVar.a(dVar);
        eVar.a(new AnonymousClass6(bvVar));
        eVar.a(this.f13176C);
    }

    private void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13202k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            a(nVar, (AdError) null, a.b.f16983a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, bv bvVar) {
        com.anythink.core.common.d.c cVar = this.f13202k;
        if (cVar != null) {
            cVar.onAdSourceLoadFail(nVar, adError);
        }
        a(nVar, adError, a.b.f16985c, bvVar);
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, int i, bv bvVar) {
        String str;
        String str2;
        if (nVar == null) {
            return;
        }
        if (nVar.K() && i == a.b.f16983a) {
            nVar.M();
            return;
        }
        com.anythink.core.common.w.a.b.d dVar = (com.anythink.core.common.w.a.b.d) com.anythink.core.common.w.a.a.d.a(nVar.aI(), com.anythink.core.common.w.a.b.d.class);
        if (dVar != null) {
            if (adError != null) {
                str = adError.getPlatformCode();
                str2 = adError.getPlatformMSG();
            } else {
                str = "";
                str2 = "";
            }
            dVar.a(al.a(nVar, str, str2, i));
        }
        com.anythink.core.a.c.a();
        if (i == a.b.f16983a) {
            com.anythink.core.a.c.a(this.f13193a, bvVar, nVar.aI());
            return;
        }
        if (i == a.b.f16985c) {
            com.anythink.core.a.c.b(this.f13193a, bvVar, nVar.aI());
        } else if (i == a.b.f16984b) {
            Context context = this.f13193a;
            nVar.aI();
            com.anythink.core.a.c.b(context, bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, bv bvVar) {
        try {
            try {
                com.anythink.core.common.w.e remove = this.f13177D.remove(str);
                if (remove == null) {
                    return;
                }
                a(remove, aTBaseAdAdapter, bvVar, aTBaseAdAdapter.getTrackingInfo(), true, baseAd);
                bvVar.toString();
                a(bvVar);
                t();
                b(aTBaseAdAdapter.getTrackingInfo(), aTBaseAdAdapter);
                bvVar.z();
                a(remove);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        Throwable th;
        BaseAd[] baseAdArr;
        MgComparedResult a9;
        try {
            if (aTBaseAdAdapter != null) {
                try {
                    aTBaseAdAdapter.getTrackingInfo().M();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            com.anythink.core.common.w.e remove = this.f13177D.remove(str);
            if (remove == null) {
                return;
            }
            com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            unitGroupInfo.toString();
            a(unitGroupInfo);
            t();
            if (list == null || list.size() <= 0) {
                baseAdArr = null;
            } else {
                baseAdArr = new BaseAd[list.size()];
                list.toArray(baseAdArr);
            }
            a(remove, aTBaseAdAdapter, unitGroupInfo, trackingInfo, false, baseAdArr);
            if (unitGroupInfo.H() != -1 && trackingInfo.aa() > 0) {
                com.anythink.core.common.u.e.a(trackingInfo);
            }
            e(unitGroupInfo);
            b(aTBaseAdAdapter.getTrackingInfo(), aTBaseAdAdapter);
            if (com.anythink.core.common.v.p.e(unitGroupInfo.d()) == 0) {
                this.i.b(SystemClock.elapsedRealtime());
            } else {
                this.i.a(SystemClock.elapsedRealtime());
            }
            com.anythink.core.mg.a.a aVar = this.f13191S;
            if (aVar != null && (a9 = aVar.a()) != null && a9.isMgWin()) {
                double uSDEcpm = a9.getMgAdInfo() != null ? a9.getMgAdInfo().getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d && com.anythink.core.common.v.p.a(unitGroupInfo) < uSDEcpm) {
                    ad R8 = unitGroupInfo.R();
                    if (unitGroupInfo.o() && R8 != null) {
                        com.anythink.core.b.d.c.a(R8, new aw(2, unitGroupInfo, trackingInfo), true, 35);
                    }
                    com.anythink.core.common.u.e.b(trackingInfo, "1");
                    com.anythink.core.common.u.c.a(this.f13193a).a(2, trackingInfo);
                    ab.a(trackingInfo, j.r.f12530b, j.r.f12540m, "");
                    a(remove);
                }
            }
            com.anythink.core.common.a.a().a(this.f13199g, aTBaseAdAdapter, list, unitGroupInfo.u(), this.f13197e.p());
            com.anythink.core.common.u.c.a(this.f13193a).a(2, trackingInfo);
            ab.a(trackingInfo, j.r.f12530b, j.r.f12540m, "");
            a(remove);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized void a(bv bvVar, com.anythink.core.common.h.n nVar) {
        bvVar.z();
        com.anythink.core.common.w.g.c(bvVar, nVar);
    }

    private void a(com.anythink.core.common.w.e eVar, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.n nVar, boolean z3, BaseAd... baseAdArr) {
        nVar.m(ak.a(bvVar, aTBaseAdAdapter));
        double a9 = eVar.e() != 2 ? com.anythink.core.common.v.p.a(bvVar) : 0.0d;
        a(bvVar, a9, z3);
        com.anythink.core.b.d.c.a(aTBaseAdAdapter, bvVar, nVar, baseAdArr);
        this.f13182I.h(bvVar);
        double d2 = this.f13186N;
        if (d2 <= 0.0d) {
            nVar.f14027v = 0;
        } else if (d2 < a9) {
            nVar.f14027v = 2;
        } else {
            nVar.f14027v = 1;
        }
        com.anythink.core.common.w.g.a(this.f13193a, this.f13199g, this.f13198f, bvVar, null);
    }

    private void a(com.anythink.core.common.w.e eVar) {
        boolean d2 = eVar.d();
        if (d2) {
            this.f13182I.a(-1, eVar.e());
        }
        b(eVar);
        c(eVar);
        if (this.J != null && this.f13182I.b().a() != this.J.d() && com.anythink.core.common.v.l.a(this.f13216y, this.J.d()) <= 0) {
            com.anythink.core.common.v.p.a(this.f13216y);
            com.anythink.core.common.v.p.a(this.J.d());
            this.J.c();
        }
        if (!d2) {
            l();
            return;
        }
        eVar.e();
        this.f13182I.a(eVar.e());
        a(this.f13182I.b(eVar.e()), eVar.e());
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final int i, bv bvVar) {
        boolean z3;
        t();
        if (this.f13179F != null) {
            com.anythink.core.common.t.d.a().b(this.f13179F);
            this.f13179F = null;
        }
        c.a aVar = this.J;
        if (aVar != null && ((aVar.d() == this.f13182I.b().a() || com.anythink.core.common.v.l.a(this.J.d(), this.f13216y) < 0) && this.J.b())) {
            a(this.J.d(), com.anythink.core.common.v.p.a(this.J.d()), true);
            i = this.J.d().br() ? 13 : 11;
        }
        bv bvVar2 = this.f13216y;
        if (bvVar2 != null && bvVar2.br()) {
            i = 13;
        }
        if (i != 5 && i != 13) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    z3 = false;
                    break;
            }
            this.f13205n = true;
            this.f13204m = true;
            if (this.f13184L != null) {
                com.anythink.core.common.t.d.a().b(this.f13184L);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f13212u;
            final com.anythink.core.common.h.n af = this.i.af();
            af.b(true);
            af.r(j6);
            af.l(elapsedRealtime);
            if (!this.f13174A) {
                af.b(2);
            } else {
                af.b(1);
            }
            if (z3) {
                af.L(i);
            }
            if (bvVar != null) {
                af.a(bvVar);
            }
            com.anythink.core.common.w.g.a(this.f13193a, this.f13199g);
            com.anythink.core.common.w.g.a(this.f13199g);
            if (this.f13191S == null) {
                com.anythink.core.common.v.q.a(Thread.currentThread().getStackTrace());
                z();
                this.f13191S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.8
                    @Override // com.anythink.core.mg.a.b
                    public final void a(MgComparedResult mgComparedResult) {
                        com.anythink.core.common.u.e.b(af, mgComparedResult != null ? mgComparedResult.isCpTimeout() ? 3 : 2 : 0);
                        if (mgComparedResult == null || !mgComparedResult.isMgWin()) {
                            com.anythink.core.common.u.c.a(g.this.f13193a).a(12, af);
                            g.a(g.this, i);
                            return;
                        }
                        com.anythink.core.common.a.a().c(g.this.f13199g);
                        g.this.f13211t = ErrorCode.getErrorCode(ErrorCode.compareFailedError, "", "");
                        bv s9 = g.this.s();
                        MgComparedResult a9 = g.this.f13191S.a();
                        if (com.anythink.core.common.v.p.a(s9) <= ((a9 == null || a9.getMgAdInfo() == null) ? 0.0d : a9.getMgAdInfo().getUSDEcpm())) {
                            s9 = null;
                        }
                        g.this.f(s9);
                    }
                });
                this.f13191S.a(this.f13201j, this.f13188P);
                return;
            }
            this.f13211t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "The MgComparePriceHandler can not be null.");
            f((bv) null);
            return;
        }
        z3 = true;
        this.f13205n = true;
        this.f13204m = true;
        if (this.f13184L != null) {
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j62 = elapsedRealtime2 - this.f13212u;
        final com.anythink.core.common.h.n af2 = this.i.af();
        af2.b(true);
        af2.r(j62);
        af2.l(elapsedRealtime2);
        if (!this.f13174A) {
        }
        if (z3) {
        }
        if (bvVar != null) {
        }
        com.anythink.core.common.w.g.a(this.f13193a, this.f13199g);
        com.anythink.core.common.w.g.a(this.f13199g);
        if (this.f13191S == null) {
        }
    }

    private void a(int i, List<bv> list, final j.a aVar) {
        boolean z3 = this.f13185M != null || ak.a(this.f13178E);
        com.anythink.core.common.h.a aVar2 = new com.anythink.core.common.h.a();
        aVar2.f13327b = this.f13193a;
        aVar2.f13328c = this.f13201j;
        aVar2.f13329d = this.f13198f;
        aVar2.f13330e = this.f13199g;
        aVar2.f13331f = this.f13197e.a().aq();
        aVar2.f13332g = this.f13197e.k();
        aVar2.f13333h = this.f13197e.l();
        i.a();
        aVar2.f13336l = i.a(this.f13197e.a(), z3);
        i.a();
        aVar2.f13339o = i.a(this.f13197e.a());
        i.a();
        aVar2.f13340p = i.b(this.f13197e.a());
        aVar2.f13334j = list;
        aVar2.f13338n = this.f13197e;
        aVar2.f13343s = this.i;
        aVar2.f13341q = this.f13200h;
        aVar2.f13346v = this.f13182I.p();
        aVar2.f13347w = this.f13182I.q();
        aVar2.f13348x = this.f13182I.r();
        aVar2.f13337m = z3;
        aVar2.f13344t = i;
        aVar2.f13345u = this.f13182I.a(list, this.f13188P);
        aVar2.f13349y = this.f13182I.a();
        com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar2);
        bVar.a(ATSDK.isNetworkLogDebug());
        bVar.a(new j.a() { // from class: com.anythink.core.common.g.2
            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list2, List<bv> list3, boolean z6) {
                j.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str, list2, list3, z6);
                }
            }

            @Override // com.anythink.core.common.j.a
            public final void a(String str) {
                j.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        });
    }

    public final synchronized void a(String str, com.anythink.core.common.w.b bVar) {
        try {
            com.anythink.core.common.h.n nVar = bVar.f17031f;
            bv bvVar = bVar.f17032g;
            AdError adError = bVar.f17029d;
            long j6 = bVar.f17030e;
            int i = bVar.f17033h;
            String M8 = nVar.M();
            com.anythink.core.common.w.e remove = this.f13177D.remove(str);
            if (remove == null) {
                return;
            }
            bvVar.toString();
            a(bvVar);
            this.f13211t.putNetworkErrorMsg(M8, nVar.Y(), nVar.aF(), adError);
            if (i == 0) {
                com.anythink.core.common.u.e.a(nVar, bVar.f17028c, adError, j6);
            } else {
                StringBuilder sb = new StringBuilder("requestId=");
                sb.append(this.f13198f);
                sb.append(", networkFirmId=");
                sb.append(nVar.Y());
                sb.append(", adSourceId=");
                sb.append(nVar.M());
                sb.append(", format=");
                sb.append(nVar.aK());
                ad R8 = bvVar.R();
                if (R8 != null) {
                    sb.append(", hasShow=");
                    sb.append(R8.p());
                    sb.append(", bidId=");
                    sb.append(R8.token);
                    sb.append(", tpBidId=");
                    sb.append(R8.f13425g);
                }
                com.anythink.core.common.u.e.b("unexpected request failed", sb.toString(), com.anythink.core.common.d.t.b().r());
            }
            if (j6 > 0) {
                com.anythink.core.common.d.c cVar = this.f13202k;
                if (cVar != null) {
                    cVar.onAdSourceLoadFail(nVar, adError);
                }
                a(nVar, adError, a.b.f16985c, bvVar);
            }
            ab.a(nVar, j.r.f12530b, j.r.f12541n, adError.printStackTrace());
            a(bvVar, this.i);
            a(remove);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        if (this.f13181H.b()) {
            return;
        }
        a(this.f13177D.get(str));
    }

    public final synchronized void a(double d2, bv bvVar) {
        try {
            D();
            if (!this.f13181H.g() && bvVar != null && bvVar.o()) {
                this.f13181H.h();
            }
            if (d2 > this.f13186N) {
                this.f13186N = d2;
            }
            int aq = this.f13197e.a().aq();
            if (aq == 0 || aq == 2) {
                return;
            }
            this.f13181H.d();
            u a9 = u.a();
            String str = this.f13199g;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13197e.a().aq());
            f a10 = a9.a(str, sb.toString());
            if (a10 != null) {
                a10.a(this.f13198f);
            } else {
                com.anythink.core.common.u.e.b("AdManage is null--notifyimpression", "Id:" + this.f13199g + "--format:" + this.f13197e.a().aq(), com.anythink.core.common.d.t.b().r());
            }
            if (!this.f13205n) {
                a(10, bvVar);
            }
            l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
        if (aTBaseAdAdapter != null) {
            str.getClass();
            switch (str) {
                case "0":
                    aTBaseAdAdapter.setRequestNum(aTBaseAdAdapter.getUnitGroupInfo().x());
                    break;
                case "4":
                    aTBaseAdAdapter.setFetchAdTimeout(this.f13201j.f13552h);
                    break;
                case "50":
                    com.anythink.core.common.d.c cVar = this.f13201j.f13548d;
                    if (cVar instanceof com.anythink.core.common.d.d) {
                        ((com.anythink.core.common.d.d) cVar).onPrepareAdapterLoad(aTBaseAdAdapter);
                        break;
                    }
                    break;
            }
        }
    }

    private void a(AdError adError) {
        n nVar;
        ab.a("Mediation", "placementId:" + this.f13199g + ";result_callback:fail;loadType:" + this.f13201j.f13547c + ";");
        v.a(this.f13193a).a(this.f13199g, this.f13198f, false);
        ar arVar = this.f13201j;
        if (arVar == null || (nVar = arVar.f13549e) == null) {
            return;
        }
        nVar.a(2, arVar, this.f13197e, adError);
        this.f13201j.f13549e = null;
    }

    private void a(bv bvVar, double d2, boolean z3) {
        if (bvVar == null) {
            return;
        }
        this.f13217z = true;
        g(bvVar);
        if (d2 == 0.0d) {
            if (this.f13216y == null && (!z3 || !this.f13174A)) {
                this.f13174A = !z3;
            }
        } else if (com.anythink.core.common.v.l.a(bvVar, this.f13216y) < 0) {
            this.f13216y = bvVar;
            if (!z3 || !this.f13174A) {
                this.f13174A = !z3;
            }
        }
        bv bvVar2 = this.f13176C;
        if (bvVar2 == null || com.anythink.core.common.v.l.a(bvVar2, bvVar) < 0) {
            this.f13176C = bvVar;
        }
        boolean g4 = this.f13182I.g(bvVar);
        if (this.f13205n && this.f13204m && g4) {
            com.anythink.core.c.b.a().a(this.f13199g, this.f13198f, this.f13197e.a().ay(), this.f13201j, this.f13182I.b().a());
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13183K) {
            this.f13183K.add(aTBaseAdAdapter);
        }
    }

    private String a(com.anythink.core.common.h.n nVar, bv bvVar) {
        StringBuilder sb = new StringBuilder("requestId=");
        sb.append(this.f13198f);
        sb.append(", networkFirmId=");
        sb.append(nVar.Y());
        sb.append(", adSourceId=");
        sb.append(nVar.M());
        sb.append(", format=");
        sb.append(nVar.aK());
        ad R8 = bvVar.R();
        if (R8 != null) {
            sb.append(", hasShow=");
            sb.append(R8.p());
            sb.append(", bidId=");
            sb.append(R8.token);
            sb.append(", tpBidId=");
            sb.append(R8.f13425g);
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17048a = gVar.f13193a;
        dVar.f17049b = gVar.f13194b;
        dVar.f17050c = gVar.f13198f;
        dVar.f17051d = gVar.f13199g;
        dVar.f17052e = gVar.f13197e.a();
        dVar.f17053f = gVar.f13200h;
        dVar.f17054g = gVar.f13213v;
        dVar.f17055h = nVar;
        dVar.i = gVar.f13182I.r();
        eVar.a(dVar);
        eVar.a(gVar.new AnonymousClass6(bvVar));
        eVar.a(gVar.f13176C);
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = gVar.f13202k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            gVar.a(nVar, (AdError) null, a.b.f16983a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    public static /* synthetic */ void a(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13183K) {
                gVar.f13183K.add(aTBaseAdAdapter);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, int i) {
        com.anythink.core.d.l a9;
        gVar.u();
        if (gVar.f13187O) {
            return;
        }
        ab.a("Mediation", "placementId:" + gVar.f13199g + ";result_callback:success;loadType:" + gVar.f13201j.f13547c + ";");
        v.a(gVar.f13193a).a(gVar.f13199g, gVar.f13198f, true);
        ar arVar = gVar.f13201j;
        if (arVar != null && arVar.f13549e != null) {
            try {
                cb cbVar = gVar.f13197e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = gVar.f13199g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(gVar.f13197e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, gVar.i);
                            f.b(a9, gVar.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = gVar.f13201j;
                        arVar2.f13549e.a(1, arVar2, gVar.f13197e, e9.f13988a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            gVar.d((com.anythink.core.common.w.e) null);
            ar arVar3 = gVar.f13201j;
            arVar3.f13549e.a(gVar.f13174A ? 1 : 2, arVar3, gVar.f13197e, i);
            gVar.f13201j.f13549e = null;
        }
        com.anythink.core.c.b.a().a(gVar.f13199g, gVar.f13198f, gVar.f13197e.a().ay(), gVar.f13201j, gVar.f13182I.b().a());
    }
}
