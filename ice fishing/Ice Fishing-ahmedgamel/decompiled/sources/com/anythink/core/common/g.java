package com.anythink.core.common;

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
    boolean f13960A;

    /* renamed from: G, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13966G;

    /* renamed from: I, reason: collision with root package name */
    com.anythink.core.common.w.g f13968I;
    c.a J;

    /* renamed from: M, reason: collision with root package name */
    bv f13971M;

    /* renamed from: N, reason: collision with root package name */
    double f13972N;

    /* renamed from: P, reason: collision with root package name */
    bv f13974P;

    /* renamed from: T, reason: collision with root package name */
    private h f13978T;

    /* renamed from: b, reason: collision with root package name */
    protected WeakReference<Context> f13980b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13981c;

    /* renamed from: e, reason: collision with root package name */
    protected cb f13983e;

    /* renamed from: f, reason: collision with root package name */
    protected String f13984f;

    /* renamed from: g, reason: collision with root package name */
    protected String f13985g;

    /* renamed from: h, reason: collision with root package name */
    Map<String, Object> f13986h;
    com.anythink.core.common.h.n i;

    /* renamed from: j, reason: collision with root package name */
    protected ar f13987j;

    /* renamed from: k, reason: collision with root package name */
    protected com.anythink.core.common.d.c f13988k;

    /* renamed from: o, reason: collision with root package name */
    boolean f13992o;

    /* renamed from: p, reason: collision with root package name */
    boolean f13993p;

    /* renamed from: s, reason: collision with root package name */
    String f13996s;

    /* renamed from: u, reason: collision with root package name */
    long f13998u;

    /* renamed from: v, reason: collision with root package name */
    int f13999v;

    /* renamed from: w, reason: collision with root package name */
    int f14000w;

    /* renamed from: R, reason: collision with root package name */
    private final String f13976R = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    protected String f13982d = "";

    /* renamed from: l, reason: collision with root package name */
    boolean f13989l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f13990m = false;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f13991n = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f13994q = false;

    /* renamed from: r, reason: collision with root package name */
    boolean f13995r = false;

    /* renamed from: x, reason: collision with root package name */
    Object f14001x = new Object();

    /* renamed from: y, reason: collision with root package name */
    bv f14002y = null;

    /* renamed from: z, reason: collision with root package name */
    boolean f14003z = false;

    /* renamed from: B, reason: collision with root package name */
    bv f13961B = null;

    /* renamed from: C, reason: collision with root package name */
    bv f13962C = null;

    /* renamed from: F, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13965F = null;

    /* renamed from: L, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13970L = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.g.1
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
    boolean f13973O = false;

    /* renamed from: Q, reason: collision with root package name */
    boolean f13975Q = false;

    /* renamed from: a, reason: collision with root package name */
    protected Context f13979a = com.anythink.core.common.d.t.b().g();

    /* renamed from: t, reason: collision with root package name */
    AdError f13997t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");

    /* renamed from: D, reason: collision with root package name */
    protected Map<String, com.anythink.core.common.w.e> f13963D = new ConcurrentHashMap();

    /* renamed from: E, reason: collision with root package name */
    List<bv> f13964E = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: H, reason: collision with root package name */
    com.anythink.core.common.w.j f13967H = new com.anythink.core.common.w.j();

    /* renamed from: K, reason: collision with root package name */
    List<ATBaseAdAdapter> f13969K = new ArrayList();

    /* renamed from: S, reason: collision with root package name */
    private final com.anythink.core.mg.a.a f13977S = new com.anythink.core.mg.a.a();

    /* renamed from: com.anythink.core.common.g$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.t.b {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f13965F = null;
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
        public static final int f14044a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14045b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14046c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f14047d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f14048e = 5;
    }

    public g(Context context) {
        this.f13980b = new WeakReference<>(context);
    }

    private synchronized boolean A() {
        if (this.f13968I.c() == 0) {
            if (this.f13968I.d() == 0) {
                return true;
            }
        }
        return false;
    }

    private void B() {
        if (this.f13970L != null) {
            com.anythink.core.common.t.d.a().b(this.f13970L);
        }
    }

    private com.anythink.core.common.h.c C() {
        com.anythink.core.common.h.c a9 = com.anythink.core.common.a.a().a(this.f13979a, this.f13985g);
        if (a9 != null) {
            return a9;
        }
        c.a aVar = this.J;
        return aVar != null ? aVar.a() : a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f13969K.size() == 0) {
            return;
        }
        synchronized (this.f13969K) {
            try {
                Iterator<ATBaseAdAdapter> it = this.f13969K.iterator();
                while (it.hasNext()) {
                    it.next().destory();
                }
                this.f13969K.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E() {
        if (this.f13968I.u()) {
            List<bv> b9 = this.f13968I.b(1);
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
            this.f13995r = true;
            if (this.f13991n || C8 == null) {
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
        if (this.f13992o) {
            this.f13968I.b(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4.f13967H.b() == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x0027, B:7:0x0031, B:10:0x004a, B:12:0x0058, B:13:0x0067, B:15:0x006e, B:20:0x0074, B:22:0x003a, B:24:0x0042), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void l() {
        try {
            bv a9 = this.f13968I.a(false);
            bv s9 = s();
            this.f13968I.m();
            this.f13983e.g();
            com.anythink.core.common.v.l.a(a9, s9);
            this.f13967H.c();
            this.f13967H.b();
            if (this.f13989l) {
                if (this.f14000w >= this.f13983e.g()) {
                    if (com.anythink.core.common.v.l.a(a9, s9) > 0) {
                    }
                    this.f13992o = true;
                    k();
                    if (this.f13968I.m() == 0) {
                        com.anythink.core.common.w.g.a(this.f13979a, this.f13985g);
                        com.anythink.core.common.w.g.a(this.f13985g);
                        r();
                    }
                    q();
                    if (!this.f13992o || z()) {
                        r();
                    }
                }
            }
            if (!this.f13967H.c()) {
            }
            this.f13992o = true;
            k();
            if (this.f13968I.m() == 0) {
            }
            q();
            if (!this.f13992o) {
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
            this.J.a(this.f13984f, af);
        }
    }

    private void n() {
        if (this.f13983e.i() >= 0) {
            this.f13965F = new AnonymousClass3();
            this.f13983e.i();
            com.anythink.core.common.t.d.a().a(this.f13965F, this.f13983e.i(), false);
        }
    }

    private com.anythink.core.common.t.b o() {
        return new AnonymousClass4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        if (!this.f13991n && this.f13968I.e() > 0) {
            this.f13966G = null;
            bv f2 = this.f13968I.f();
            f2.toString();
            this.f13968I.a(f2);
            this.f13968I.e();
            this.f13968I.o();
            b(f2, 2);
        }
    }

    private synchronized void q() {
        final ad R8;
        if (!this.f13967H.g() && this.f13967H.e()) {
            if (this.f13967H.b()) {
                return;
            }
            if (this.i.ah()) {
                return;
            }
            final bv b9 = this.f13968I.b(this.f13989l);
            if (b9 != null && (R8 = b9.R()) != null) {
                this.f13967H.h();
                com.anythink.core.mg.a.a aVar = this.f13977S;
                if (aVar != null) {
                    MgComparedResult a9 = aVar.a();
                    if (a9 == null) {
                        this.f13977S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.7
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
        this.f13967H.g();
        this.f13967H.e();
    }

    private synchronized void r() {
        if (!this.f13967H.e()) {
            this.f13967H.e();
        } else {
            if (this.f13967H.b()) {
                return;
            }
            this.f13968I.a(this.i.af());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bv s() {
        bv bvVar;
        if (this.f13983e.j() == 2) {
            synchronized (this.f13963D) {
                bvVar = com.anythink.core.common.w.g.a(this.f13963D);
            }
        } else {
            bvVar = null;
        }
        bv v9 = this.f13968I.v();
        return com.anythink.core.common.v.l.a(bvVar, v9) < 0 ? bvVar : v9;
    }

    private synchronized void t() {
        this.f13968I.h();
        if (this.f13966G != null) {
            com.anythink.core.common.t.d.a().b(this.f13966G);
            this.f13966G = null;
        }
    }

    private synchronized boolean u() {
        if (this.f13968I.k()) {
            return false;
        }
        if (this.f13967H.c()) {
            return false;
        }
        bv bvVar = this.f14002y;
        if (bvVar != null && bvVar.br()) {
            return false;
        }
        this.f13967H.f();
        this.f13975Q = true;
        List<bv> l9 = this.f13968I.l();
        this.f13968I.b(l9);
        a(8, l9, new j.a() { // from class: com.anythink.core.common.g.9
            @Override // com.anythink.core.common.j.a
            public final void a(String str) {
            }

            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list, List<bv> list2, boolean z6) {
                for (bv bvVar2 : list) {
                    g.this.d(bvVar2);
                    bvVar2.C(8);
                    g.this.f13968I.a(bvVar2);
                    g.this.b(bvVar2, 3);
                }
                if (list2 != null) {
                    Iterator<bv> it = list2.iterator();
                    while (it.hasNext()) {
                        g.this.b(it.next());
                    }
                }
                g gVar = g.this;
                gVar.f13975Q = false;
                gVar.c((com.anythink.core.common.w.e) null);
            }
        });
        return true;
    }

    private synchronized void v() {
        if (this.f13989l) {
            if (this.f13967H.c()) {
                return;
            }
            bv bvVar = this.f14002y;
            if (bvVar == null || !bvVar.br()) {
                List<bv> list = this.f13964E;
                if (list != null && list.size() != 0) {
                    if (this.f13993p) {
                        return;
                    }
                    this.f13993p = true;
                    a(7, this.f13964E, new j.a() { // from class: com.anythink.core.common.g.10
                        @Override // com.anythink.core.common.j.a
                        public final void a(String str) {
                        }

                        @Override // com.anythink.core.common.j.a
                        public final void a(String str, List<bv> list2, List<bv> list3, boolean z6) {
                            if (g.this.f13967H.c()) {
                                String unused = g.this.f13976R;
                                for (bv bvVar2 : list2) {
                                    g.this.f13968I.e(bvVar2);
                                    com.anythink.core.common.w.g.b(bvVar2, g.this.i);
                                }
                                return;
                            }
                            g gVar = g.this;
                            if (gVar.f14000w < gVar.f13983e.g()) {
                                String unused2 = g.this.f13976R;
                                g.this.a(list2, (List<bv>) null, (List<bv>) null, list3);
                                g.this.l();
                                return;
                            }
                            String unused3 = g.this.f13976R;
                            bv a9 = g.this.f13968I.a(false);
                            int size = list2.size();
                            ArrayList arrayList = new ArrayList(size);
                            ArrayList arrayList2 = new ArrayList(size);
                            for (int i = 0; i < size; i++) {
                                bv bvVar3 = list2.get(i);
                                g.this.f13968I.e(bvVar3);
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
                                g.this.f13968I.a(bvVar4);
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
        if (this.f13966G == null || !A()) {
            return false;
        }
        com.anythink.core.common.t.d.a().b(this.f13966G);
        this.f13966G.run();
        this.f13966G = null;
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
        this.f13968I.c();
        this.f13968I.d();
        this.f13968I.e();
        this.f13968I.i();
        Objects.toString(this.f14002y);
        Objects.toString(this.f13974P);
        Objects.toString(this.f13962C);
        return this.f13968I.t();
    }

    public final c.a h() {
        return this.J;
    }

    public final com.anythink.core.d.l i() {
        return this.f13983e.a();
    }

    /* renamed from: com.anythink.core.common.g$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.core.common.w.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f14017a;

        public AnonymousClass6(bv bvVar) {
            this.f14017a = bvVar;
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar) {
            com.anythink.core.common.u.c.a(g.this.f13979a).a(1, nVar);
            ab.a(nVar, j.r.f13315a, j.r.f13328o, "");
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
            g.a(g.this, nVar, aTBaseAdAdapter);
            if (this.f14017a.aJ() == 1) {
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
            if (this.f14017a.aJ() == 1) {
                g.this.D();
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.c cVar) {
            g.this.a(str, aTBaseAdAdapter, cVar.f(), bvVar);
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter q8 = com.anythink.core.common.d.t.b().q(g.this.f13985g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (q8 != null && q8.isAdFilter(com.anythink.core.common.d.l.a(aTBaseAdAdapter, 3), baseAd)) {
                com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                bVar.f17815c = 8;
                bVar.f17817e = aTBaseAdAdapter.getTrackingInfo().ab();
                bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                bVar.f17818f = aTBaseAdAdapter.getTrackingInfo();
                bVar.f17819g = aTBaseAdAdapter.getUnitGroupInfo();
                g.this.a(str, bVar);
            } else {
                g.this.a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            }
            if (this.f14017a.aJ() == 1) {
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
            if (this.f14017a.aJ() == 1) {
                g.b(g.this, aTBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(bv bvVar) {
        this.f13968I.d(bvVar);
        com.anythink.core.common.w.g.a(this.f13979a, this.f13985g, this.f13984f, null, bvVar);
        this.f13968I.e(bvVar);
        this.f13968I.c(bvVar);
        g(bvVar);
    }

    private synchronized void e(bv bvVar) {
        bvVar.z();
        if (this.f13967H.b()) {
            return;
        }
        if (this.i.ah()) {
            return;
        }
        com.anythink.core.common.w.g.i(bvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(bv bvVar) {
        this.f13991n = true;
        this.f13990m = false;
        if (this.f13970L != null) {
            com.anythink.core.common.t.d.a().b(this.f13970L);
        }
        com.anythink.core.common.u.e.a(this.i.af(), this.f13997t, bvVar);
        if (!this.f13973O) {
            a(this.f13997t);
        }
        f();
    }

    public final void g() {
        List<com.anythink.core.common.w.f> j6 = this.f13968I.j();
        synchronized (j6) {
            try {
                if (j6.size() > 0) {
                    bv a9 = j6.remove(0).a();
                    if (this.f13991n) {
                        if (this.f14000w >= this.f13983e.g()) {
                            if (com.anythink.core.common.v.l.a(a9, this.f14002y) < 0) {
                            }
                        }
                    }
                    this.f13968I.a(a9);
                    b(a9, 4);
                }
                if (j6.size() > 0) {
                    for (com.anythink.core.common.w.f fVar : j6) {
                        bv a10 = fVar.a();
                        if (!this.f13991n || this.f14000w < this.f13983e.g() || com.anythink.core.common.v.l.a(a10, this.f14002y) < 0) {
                            int b9 = fVar.b();
                            if (b9 == 1) {
                                a(a10, 1);
                                c(b9);
                            } else if (b9 == 2) {
                                a(a10, 2);
                                c(b9);
                            } else if (b9 == 3) {
                                this.f13968I.a(a10);
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
        int o4;
        try {
            if (i != 2) {
                o4 = this.f13968I.n();
            } else {
                o4 = this.f13968I.o();
            }
            if (o4 == 0) {
                a(this.f13968I.b(i), i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bv bvVar) {
        this.f13997t.putNetworkErrorMsg(bvVar.z(), bvVar.g(), bvVar.h(), ErrorCode.getErrorCode(ErrorCode.noADError, "", bvVar.F()));
        this.f13968I.c(bvVar);
    }

    private void c(bv bvVar) {
        if (bvVar != null) {
            try {
                if (bvVar.g() == 22) {
                    this.f13968I.f(bvVar);
                    com.anythink.core.common.w.g.a(bvVar, this.i);
                }
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void d(com.anythink.core.common.w.e eVar) {
        bv bvVar;
        ATRequestingInfo aTRequestingInfo;
        if (this.f13973O) {
            ar arVar = this.f13987j;
            if (arVar != null) {
                arVar.f14336f = null;
            }
            return;
        }
        ar arVar2 = this.f13987j;
        if (arVar2 != null && arVar2.f14336f != null) {
            boolean z6 = true;
            if (this.f13961B == null) {
                bvVar = this.f14002y;
            } else if (eVar == null || eVar.f() == null || eVar.c() == null) {
                z6 = false;
                bvVar = null;
            } else {
                bv f2 = eVar.f();
                if (com.anythink.core.common.v.l.a(f2, this.f13961B) < 0) {
                    if (eVar.c().booleanValue()) {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f2);
                        bvVar = f2;
                    } else {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f2);
                    }
                }
                z6 = false;
                bvVar = f2;
            }
            if (z6) {
                this.f13961B = bvVar;
                aTRequestingInfo = this.f13968I.d(bvVar, this.i);
                if (aTRequestingInfo != null) {
                    this.f13987j.f14336f.onAdMultipleLoaded(aTRequestingInfo);
                }
            } else {
                aTRequestingInfo = null;
            }
            if (aTRequestingInfo == null && this.f13968I.a(this.f13989l, this.f13961B)) {
                this.f13987j.f14336f.onAdMultipleLoaded(null);
                this.f13987j.f14336f = null;
            }
        }
    }

    public final void b() {
        long a9 = this.f13968I.a(this.f13989l, this.f13983e.a().K());
        if (a9 > -1) {
            this.f13966G = new AnonymousClass4();
        }
        if (this.f13968I.g() && this.f13989l) {
            u();
        }
        a(this.f13968I.s(), 1);
        if (this.f13966G != null) {
            com.anythink.core.common.t.d.a().a(this.f13966G, a9, false);
        }
        if (this.J != null) {
            com.anythink.core.common.h.n af = this.i.af();
            aj.a(af, this.J.d(), 0, true);
            this.J.a(this.f13984f, af);
        }
    }

    public final void e() {
        synchronized (this.f14001x) {
            this.f13989l = true;
            this.f13994q = true;
            c((com.anythink.core.common.w.e) null);
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.f13995r != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r2.f13991n != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        a(-1, r2.f14002y);
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
    
        if (com.anythink.core.common.v.l.a(r2.f14002y, r0) > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c(com.anythink.core.common.w.e eVar) {
        try {
            bv s9 = s();
            if (this.f14003z) {
                if (!this.f13989l) {
                    if (this.f13994q) {
                    }
                }
            } else if (this.f13989l) {
                if (this.f13975Q) {
                    return;
                }
                if (this.f13966G != null && A()) {
                    com.anythink.core.common.t.d.a().b(this.f13966G);
                    this.f13966G.run();
                    this.f13966G = null;
                } else if (z() && !this.f13991n) {
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
            this.f13967H.a();
            synchronized (this.f13963D) {
                concurrentHashMap = new ConcurrentHashMap(this.f13963D);
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.anythink.core.common.w.e eVar = (com.anythink.core.common.w.e) ((Map.Entry) it.next()).getValue();
                if (eVar != null) {
                    eVar.b();
                }
            }
            if (!this.f13991n) {
                this.f13991n = true;
                y();
            }
            l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f() {
        this.f13973O = true;
        u a9 = u.a();
        String str = this.f13985g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13983e.a().aq());
        f a10 = a9.a(str, sb.toString());
        if (a10 != null) {
            a10.a(this.f13984f);
            return;
        }
        com.IceFishing.LiveIceFishing.k.x("AdManage is null--notifycancel", "Id:" + this.f13985g + "--format:" + this.f13983e.a().aq());
    }

    private void e(int i) {
        com.anythink.core.d.l a9;
        ab.a("Mediation", "placementId:" + this.f13985g + ";result_callback:success;loadType:" + this.f13987j.f14333c + ";");
        v.a(this.f13979a).a(this.f13985g, this.f13984f, true);
        ar arVar = this.f13987j;
        if (arVar != null && arVar.f14335e != null) {
            try {
                cb cbVar = this.f13983e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13985g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13983e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = this.f13987j;
                        arVar2.f14335e.a(1, arVar2, this.f13983e, e9.f14774a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13987j;
            arVar3.f14335e.a(this.f13960A ? 1 : 2, arVar3, this.f13983e, i);
            this.f13987j.f14335e = null;
        }
        com.anythink.core.c.b.a().a(this.f13985g, this.f13984f, this.f13983e.a().ay(), this.f13987j, this.f13968I.b().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final bv bvVar, final int i) {
        final com.anythink.core.common.w.e eVar = new com.anythink.core.common.w.e(bvVar, i);
        final String a9 = eVar.a();
        this.f13963D.put(a9, eVar);
        this.f13968I.a(1, i);
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.5
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                synchronized (g.this) {
                    try {
                        if (g.this.f13967H.b()) {
                            g.this.f13963D.remove(a9);
                            return;
                        }
                        if (ak.a(bvVar) && TextUtils.isEmpty(u.a().a(g.this.f13985g, bvVar.g()))) {
                            u.a().a(g.this.f13985g, bvVar.g(), bvVar.k());
                        }
                        boolean a10 = g.a(i);
                        com.anythink.core.common.h.n af = g.this.i.af();
                        if (a10) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bvVar.g());
                            str = sb.toString();
                        } else {
                            str = g.this.f13996s;
                        }
                        af.s(str);
                        aj.a(af, bvVar, g.this.f13999v, true);
                        af.o(SystemClock.elapsedRealtime() - g.this.f13998u);
                        if (g.this.a(af, bvVar, i, a9)) {
                            return;
                        }
                        String unused = g.this.f13976R;
                        bvVar.toString();
                        boolean a11 = com.anythink.core.common.w.g.a(g.this.f13985g, bvVar, af);
                        g.this.f13999v++;
                        if (a11) {
                            com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                            bVar.f17815c = 6;
                            bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            bVar.f17817e = 0L;
                            bVar.f17818f = af;
                            bVar.f17819g = bvVar;
                            g.this.a(a9, bVar);
                            return;
                        }
                        int ao = bvVar.ao();
                        if (ao > 0) {
                            af.f14811t = ao;
                        } else {
                            g gVar = g.this;
                            if (gVar.f13990m && gVar.f14000w < gVar.f13983e.g()) {
                                af.f14811t = 5;
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
        this.f13986h = map;
    }

    private void a(com.anythink.core.common.h.n nVar) {
        this.i = nVar;
    }

    private void b(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13988k;
        if (cVar != null) {
            cVar.onAdSourceLoadFilled(nVar);
        }
        a(nVar, (AdError) null, a.b.f17771b, aTBaseAdAdapter.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 4);
    }

    public final void a(com.anythink.core.common.d.c cVar) {
        this.f13988k = cVar;
    }

    public final void a(ar arVar) {
        this.f13987j = arVar;
    }

    private synchronized void a(List<bv> list, int i) {
        if (!this.f13967H.b() && !this.f13967H.c() && list != null && list.size() != 0) {
            this.f13968I.a(list);
            this.f13968I.d();
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), i);
            }
        }
    }

    public final boolean c() {
        if (this.f13991n) {
            return true;
        }
        return this.f13989l && this.f13968I.c() == 0 && this.f13968I.m() == 0;
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
        if (this.f13973O) {
            return;
        }
        ab.a("Mediation", "placementId:" + this.f13985g + ";result_callback:success;loadType:" + this.f13987j.f14333c + ";");
        v.a(this.f13979a).a(this.f13985g, this.f13984f, true);
        ar arVar = this.f13987j;
        if (arVar != null && arVar.f14335e != null) {
            try {
                cb cbVar = this.f13983e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13985g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13983e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = this.f13987j;
                        arVar2.f14335e.a(1, arVar2, this.f13983e, e9.f14774a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13987j;
            arVar3.f14335e.a(this.f13960A ? 1 : 2, arVar3, this.f13983e, i);
            this.f13987j.f14335e = null;
        }
        com.anythink.core.c.b.a().a(this.f13985g, this.f13984f, this.f13983e.a().ay(), this.f13987j, this.f13968I.b().a());
    }

    private void g(bv bvVar) {
        if (bvVar != null && com.anythink.core.common.w.g.j(bvVar) > com.anythink.core.common.v.p.a(this.f13974P)) {
            bvVar.toString();
            this.f13974P = bvVar;
        }
    }

    private void b(com.anythink.core.common.w.e eVar) {
        if (eVar.c() == null || !eVar.c().booleanValue() || eVar.e() == 2 || !eVar.c().booleanValue()) {
            return;
        }
        this.f14000w++;
    }

    private synchronized void a(bv bvVar, int i) {
        this.f13968I.b(bvVar, i);
    }

    private synchronized void a(bv bvVar) {
        this.f13968I.b(bvVar);
    }

    private void b(long j6) {
        com.anythink.core.common.t.d.a().a(this.f13970L, j6, false);
    }

    private void b(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13969K) {
            this.f13969K.remove(aTBaseAdAdapter);
        }
    }

    public final void a(List<bv> list, List<bv> list2, List<bv> list3, List<bv> list4) {
        boolean a9;
        String str;
        synchronized (this.f14001x) {
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
                                this.f13968I.f(bvVar);
                                com.anythink.core.common.w.g.a(bvVar, this.i);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (list3 != null) {
                this.f13964E.addAll(list3);
            }
            if (list != null && list.size() != 0) {
                this.f13967H.f();
                h hVar = this.f13978T;
                boolean e9 = hVar == null ? false : hVar.e();
                h hVar2 = this.f13978T;
                boolean d9 = hVar2 == null ? false : hVar2.d();
                if (!this.f13989l && d9 && e9) {
                    a(list);
                    return;
                }
                bv bvVar2 = list.get(0);
                boolean a10 = com.anythink.core.common.w.g.a(bvVar2, this.f13967H);
                if (e9 && !d9) {
                    a9 = this.f13968I.a(bvVar2, false);
                } else {
                    a9 = this.f13968I.a(bvVar2, true);
                }
                if (a10 || a9) {
                    if (!this.f13991n) {
                        str = "1";
                    } else {
                        str = this.f13990m ? "2" : "3";
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
                        this.f13971M = bvVar2;
                    }
                    d(bvVar2);
                    list.remove(0);
                    this.f13968I.a(bvVar2);
                    b(bvVar2, 3);
                }
                a(list);
                E();
            }
        }
    }

    public static /* synthetic */ void b(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13969K) {
                gVar.f13969K.remove(aTBaseAdAdapter);
            }
        }
    }

    public final void d() {
        this.f13994q = true;
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
        this.f13968I = new com.anythink.core.common.w.g(hVar);
        this.f13989l = hVar.i;
        this.f13984f = hVar.f17904b;
        this.f13985g = hVar.f17903a;
        this.f13983e = hVar.f17905c;
        this.f13981c = hVar.f17911j;
        this.f13996s = com.anythink.core.common.w.g.c(hVar.f17906d);
    }

    public final void a(h hVar) {
        this.f13978T = hVar;
        this.f13998u = SystemClock.elapsedRealtime();
        com.anythink.core.common.t.d.a().a(this.f13970L, this.f13983e.h(), false);
        if (this.f13983e.i() >= 0) {
            this.f13965F = new AnonymousClass3();
            this.f13983e.i();
            com.anythink.core.common.t.d.a().a(this.f13965F, this.f13983e.i(), false);
        }
    }

    private void a(long j6) {
        if (this.f13966G != null) {
            com.anythink.core.common.t.d.a().a(this.f13966G, j6, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(com.anythink.core.common.h.n nVar, bv bvVar, int i, String str) {
        com.anythink.core.common.h.i c9 = u.a().c(this.f13985g);
        if (c9 == null || !c9.a(bvVar)) {
            return false;
        }
        ab.a(this.f13985g, nVar, "Can't Load On Showing", bvVar, -1, -1);
        com.anythink.core.common.u.e.a(nVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
        u.a().a(this.f13985g, c9.a(), this.f13984f);
        this.f13968I.a(bvVar, i);
        a(bvVar);
        this.f13968I.a(i);
        this.f13963D.remove(str);
        this.f13968I.a(-1, i);
        a(this.f13968I.b(i), i);
        return true;
    }

    private void a(com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17835a = this.f13979a;
        dVar.f17836b = this.f13980b;
        dVar.f17837c = this.f13984f;
        dVar.f17838d = this.f13985g;
        dVar.f17839e = this.f13983e.a();
        dVar.f17840f = this.f13986h;
        dVar.f17841g = this.f13999v;
        dVar.f17842h = nVar;
        dVar.i = this.f13968I.r();
        eVar.a(dVar);
        eVar.a(new AnonymousClass6(bvVar));
        eVar.a(this.f13962C);
    }

    private void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13988k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            a(nVar, (AdError) null, a.b.f17770a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, bv bvVar) {
        com.anythink.core.common.d.c cVar = this.f13988k;
        if (cVar != null) {
            cVar.onAdSourceLoadFail(nVar, adError);
        }
        a(nVar, adError, a.b.f17772c, bvVar);
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, int i, bv bvVar) {
        String str;
        String str2;
        if (nVar == null) {
            return;
        }
        if (nVar.K() && i == a.b.f17770a) {
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
        if (i == a.b.f17770a) {
            com.anythink.core.a.c.a(this.f13979a, bvVar, nVar.aI());
            return;
        }
        if (i == a.b.f17772c) {
            com.anythink.core.a.c.b(this.f13979a, bvVar, nVar.aI());
        } else if (i == a.b.f17771b) {
            Context context = this.f13979a;
            nVar.aI();
            com.anythink.core.a.c.b(context, bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, bv bvVar) {
        try {
            try {
                com.anythink.core.common.w.e remove = this.f13963D.remove(str);
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
            com.anythink.core.common.w.e remove = this.f13963D.remove(str);
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
            com.anythink.core.mg.a.a aVar = this.f13977S;
            if (aVar != null && (a9 = aVar.a()) != null && a9.isMgWin()) {
                double uSDEcpm = a9.getMgAdInfo() != null ? a9.getMgAdInfo().getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d && com.anythink.core.common.v.p.a(unitGroupInfo) < uSDEcpm) {
                    ad R8 = unitGroupInfo.R();
                    if (unitGroupInfo.o() && R8 != null) {
                        com.anythink.core.b.d.c.a(R8, new aw(2, unitGroupInfo, trackingInfo), true, 35);
                    }
                    com.anythink.core.common.u.e.b(trackingInfo, "1");
                    com.anythink.core.common.u.c.a(this.f13979a).a(2, trackingInfo);
                    ab.a(trackingInfo, j.r.f13316b, j.r.f13326m, "");
                    a(remove);
                }
            }
            com.anythink.core.common.a.a().a(this.f13985g, aTBaseAdAdapter, list, unitGroupInfo.u(), this.f13983e.p());
            com.anythink.core.common.u.c.a(this.f13979a).a(2, trackingInfo);
            ab.a(trackingInfo, j.r.f13316b, j.r.f13326m, "");
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

    private void a(com.anythink.core.common.w.e eVar, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.n nVar, boolean z6, BaseAd... baseAdArr) {
        nVar.m(ak.a(bvVar, aTBaseAdAdapter));
        double a9 = eVar.e() != 2 ? com.anythink.core.common.v.p.a(bvVar) : 0.0d;
        a(bvVar, a9, z6);
        com.anythink.core.b.d.c.a(aTBaseAdAdapter, bvVar, nVar, baseAdArr);
        this.f13968I.h(bvVar);
        double d9 = this.f13972N;
        if (d9 <= 0.0d) {
            nVar.f14813v = 0;
        } else if (d9 < a9) {
            nVar.f14813v = 2;
        } else {
            nVar.f14813v = 1;
        }
        com.anythink.core.common.w.g.a(this.f13979a, this.f13985g, this.f13984f, bvVar, null);
    }

    private void a(com.anythink.core.common.w.e eVar) {
        boolean d9 = eVar.d();
        if (d9) {
            this.f13968I.a(-1, eVar.e());
        }
        b(eVar);
        c(eVar);
        if (this.J != null && this.f13968I.b().a() != this.J.d() && com.anythink.core.common.v.l.a(this.f14002y, this.J.d()) <= 0) {
            com.anythink.core.common.v.p.a(this.f14002y);
            com.anythink.core.common.v.p.a(this.J.d());
            this.J.c();
        }
        if (!d9) {
            l();
            return;
        }
        eVar.e();
        this.f13968I.a(eVar.e());
        a(this.f13968I.b(eVar.e()), eVar.e());
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
        boolean z6;
        t();
        if (this.f13965F != null) {
            com.anythink.core.common.t.d.a().b(this.f13965F);
            this.f13965F = null;
        }
        c.a aVar = this.J;
        if (aVar != null && ((aVar.d() == this.f13968I.b().a() || com.anythink.core.common.v.l.a(this.J.d(), this.f14002y) < 0) && this.J.b())) {
            a(this.J.d(), com.anythink.core.common.v.p.a(this.J.d()), true);
            i = this.J.d().br() ? 13 : 11;
        }
        bv bvVar2 = this.f14002y;
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
                    z6 = false;
                    break;
            }
            this.f13991n = true;
            this.f13990m = true;
            if (this.f13970L != null) {
                com.anythink.core.common.t.d.a().b(this.f13970L);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = elapsedRealtime - this.f13998u;
            final com.anythink.core.common.h.n af = this.i.af();
            af.b(true);
            af.r(j6);
            af.l(elapsedRealtime);
            if (!this.f13960A) {
                af.b(2);
            } else {
                af.b(1);
            }
            if (z6) {
                af.L(i);
            }
            if (bvVar != null) {
                af.a(bvVar);
            }
            com.anythink.core.common.w.g.a(this.f13979a, this.f13985g);
            com.anythink.core.common.w.g.a(this.f13985g);
            if (this.f13977S == null) {
                com.anythink.core.common.v.q.a(Thread.currentThread().getStackTrace());
                z();
                this.f13977S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.8
                    @Override // com.anythink.core.mg.a.b
                    public final void a(MgComparedResult mgComparedResult) {
                        com.anythink.core.common.u.e.b(af, mgComparedResult != null ? mgComparedResult.isCpTimeout() ? 3 : 2 : 0);
                        if (mgComparedResult == null || !mgComparedResult.isMgWin()) {
                            com.anythink.core.common.u.c.a(g.this.f13979a).a(12, af);
                            g.a(g.this, i);
                            return;
                        }
                        com.anythink.core.common.a.a().c(g.this.f13985g);
                        g.this.f13997t = ErrorCode.getErrorCode(ErrorCode.compareFailedError, "", "");
                        bv s9 = g.this.s();
                        MgComparedResult a9 = g.this.f13977S.a();
                        if (com.anythink.core.common.v.p.a(s9) <= ((a9 == null || a9.getMgAdInfo() == null) ? 0.0d : a9.getMgAdInfo().getUSDEcpm())) {
                            s9 = null;
                        }
                        g.this.f(s9);
                    }
                });
                this.f13977S.a(this.f13987j, this.f13974P);
                return;
            }
            this.f13997t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "The MgComparePriceHandler can not be null.");
            f((bv) null);
            return;
        }
        z6 = true;
        this.f13991n = true;
        this.f13990m = true;
        if (this.f13970L != null) {
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j62 = elapsedRealtime2 - this.f13998u;
        final com.anythink.core.common.h.n af2 = this.i.af();
        af2.b(true);
        af2.r(j62);
        af2.l(elapsedRealtime2);
        if (!this.f13960A) {
        }
        if (z6) {
        }
        if (bvVar != null) {
        }
        com.anythink.core.common.w.g.a(this.f13979a, this.f13985g);
        com.anythink.core.common.w.g.a(this.f13985g);
        if (this.f13977S == null) {
        }
    }

    private void a(int i, List<bv> list, final j.a aVar) {
        boolean z6 = this.f13971M != null || ak.a(this.f13964E);
        com.anythink.core.common.h.a aVar2 = new com.anythink.core.common.h.a();
        aVar2.f14113b = this.f13979a;
        aVar2.f14114c = this.f13987j;
        aVar2.f14115d = this.f13984f;
        aVar2.f14116e = this.f13985g;
        aVar2.f14117f = this.f13983e.a().aq();
        aVar2.f14118g = this.f13983e.k();
        aVar2.f14119h = this.f13983e.l();
        i.a();
        aVar2.f14122l = i.a(this.f13983e.a(), z6);
        i.a();
        aVar2.f14125o = i.a(this.f13983e.a());
        i.a();
        aVar2.f14126p = i.b(this.f13983e.a());
        aVar2.f14120j = list;
        aVar2.f14124n = this.f13983e;
        aVar2.f14129s = this.i;
        aVar2.f14127q = this.f13986h;
        aVar2.f14132v = this.f13968I.p();
        aVar2.f14133w = this.f13968I.q();
        aVar2.f14134x = this.f13968I.r();
        aVar2.f14123m = z6;
        aVar2.f14130t = i;
        aVar2.f14131u = this.f13968I.a(list, this.f13974P);
        aVar2.f14135y = this.f13968I.a();
        com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar2);
        bVar.a(ATSDK.isNetworkLogDebug());
        bVar.a(new j.a() { // from class: com.anythink.core.common.g.2
            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list2, List<bv> list3, boolean z9) {
                j.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str, list2, list3, z9);
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
            com.anythink.core.common.h.n nVar = bVar.f17818f;
            bv bvVar = bVar.f17819g;
            AdError adError = bVar.f17816d;
            long j6 = bVar.f17817e;
            int i = bVar.f17820h;
            String M8 = nVar.M();
            com.anythink.core.common.w.e remove = this.f13963D.remove(str);
            if (remove == null) {
                return;
            }
            bvVar.toString();
            a(bvVar);
            this.f13997t.putNetworkErrorMsg(M8, nVar.Y(), nVar.aF(), adError);
            if (i == 0) {
                com.anythink.core.common.u.e.a(nVar, bVar.f17815c, adError, j6);
            } else {
                StringBuilder sb = new StringBuilder("requestId=");
                sb.append(this.f13984f);
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
                    sb.append(R8.f14211g);
                }
                com.anythink.core.common.u.e.b("unexpected request failed", sb.toString(), com.anythink.core.common.d.t.b().r());
            }
            if (j6 > 0) {
                com.anythink.core.common.d.c cVar = this.f13988k;
                if (cVar != null) {
                    cVar.onAdSourceLoadFail(nVar, adError);
                }
                a(nVar, adError, a.b.f17772c, bvVar);
            }
            ab.a(nVar, j.r.f13316b, j.r.f13327n, adError.printStackTrace());
            a(bvVar, this.i);
            a(remove);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        if (this.f13967H.b()) {
            return;
        }
        a(this.f13963D.get(str));
    }

    public final synchronized void a(double d9, bv bvVar) {
        try {
            D();
            if (!this.f13967H.g() && bvVar != null && bvVar.o()) {
                this.f13967H.h();
            }
            if (d9 > this.f13972N) {
                this.f13972N = d9;
            }
            int aq = this.f13983e.a().aq();
            if (aq == 0 || aq == 2) {
                return;
            }
            this.f13967H.d();
            u a9 = u.a();
            String str = this.f13985g;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13983e.a().aq());
            f a10 = a9.a(str, sb.toString());
            if (a10 != null) {
                a10.a(this.f13984f);
            } else {
                com.anythink.core.common.u.e.b("AdManage is null--notifyimpression", "Id:" + this.f13985g + "--format:" + this.f13983e.a().aq(), com.anythink.core.common.d.t.b().r());
            }
            if (!this.f13991n) {
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
                    aTBaseAdAdapter.setFetchAdTimeout(this.f13987j.f14338h);
                    break;
                case "50":
                    com.anythink.core.common.d.c cVar = this.f13987j.f14334d;
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
        ab.a("Mediation", "placementId:" + this.f13985g + ";result_callback:fail;loadType:" + this.f13987j.f14333c + ";");
        v.a(this.f13979a).a(this.f13985g, this.f13984f, false);
        ar arVar = this.f13987j;
        if (arVar == null || (nVar = arVar.f14335e) == null) {
            return;
        }
        nVar.a(2, arVar, this.f13983e, adError);
        this.f13987j.f14335e = null;
    }

    private void a(bv bvVar, double d9, boolean z6) {
        if (bvVar == null) {
            return;
        }
        this.f14003z = true;
        g(bvVar);
        if (d9 == 0.0d) {
            if (this.f14002y == null && (!z6 || !this.f13960A)) {
                this.f13960A = !z6;
            }
        } else if (com.anythink.core.common.v.l.a(bvVar, this.f14002y) < 0) {
            this.f14002y = bvVar;
            if (!z6 || !this.f13960A) {
                this.f13960A = !z6;
            }
        }
        bv bvVar2 = this.f13962C;
        if (bvVar2 == null || com.anythink.core.common.v.l.a(bvVar2, bvVar) < 0) {
            this.f13962C = bvVar;
        }
        boolean g9 = this.f13968I.g(bvVar);
        if (this.f13991n && this.f13990m && g9) {
            com.anythink.core.c.b.a().a(this.f13985g, this.f13984f, this.f13983e.a().ay(), this.f13987j, this.f13968I.b().a());
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13969K) {
            this.f13969K.add(aTBaseAdAdapter);
        }
    }

    private String a(com.anythink.core.common.h.n nVar, bv bvVar) {
        StringBuilder sb = new StringBuilder("requestId=");
        sb.append(this.f13984f);
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
            sb.append(R8.f14211g);
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17835a = gVar.f13979a;
        dVar.f17836b = gVar.f13980b;
        dVar.f17837c = gVar.f13984f;
        dVar.f17838d = gVar.f13985g;
        dVar.f17839e = gVar.f13983e.a();
        dVar.f17840f = gVar.f13986h;
        dVar.f17841g = gVar.f13999v;
        dVar.f17842h = nVar;
        dVar.i = gVar.f13968I.r();
        eVar.a(dVar);
        eVar.a(gVar.new AnonymousClass6(bvVar));
        eVar.a(gVar.f13962C);
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = gVar.f13988k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            gVar.a(nVar, (AdError) null, a.b.f17770a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    public static /* synthetic */ void a(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13969K) {
                gVar.f13969K.add(aTBaseAdAdapter);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, int i) {
        com.anythink.core.d.l a9;
        gVar.u();
        if (gVar.f13973O) {
            return;
        }
        ab.a("Mediation", "placementId:" + gVar.f13985g + ";result_callback:success;loadType:" + gVar.f13987j.f14333c + ";");
        v.a(gVar.f13979a).a(gVar.f13985g, gVar.f13984f, true);
        ar arVar = gVar.f13987j;
        if (arVar != null && arVar.f14335e != null) {
            try {
                cb cbVar = gVar.f13983e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = gVar.f13985g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(gVar.f13983e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, gVar.i);
                            f.b(a9, gVar.i);
                        }
                    } catch (com.anythink.core.common.h.m e9) {
                        ar arVar2 = gVar.f13987j;
                        arVar2.f14335e.a(1, arVar2, gVar.f13983e, e9.f14774a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            gVar.d((com.anythink.core.common.w.e) null);
            ar arVar3 = gVar.f13987j;
            arVar3.f14335e.a(gVar.f13960A ? 1 : 2, arVar3, gVar.f13983e, i);
            gVar.f13987j.f14335e = null;
        }
        com.anythink.core.c.b.a().a(gVar.f13985g, gVar.f13984f, gVar.f13983e.a().ay(), gVar.f13987j, gVar.f13968I.b().a());
    }
}
