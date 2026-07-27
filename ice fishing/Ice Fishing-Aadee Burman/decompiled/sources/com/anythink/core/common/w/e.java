package com.anythink.core.common.w;

import D.y;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.v;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.n;
import com.anythink.core.common.u;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.p;
import com.anythink.core.d.l;
import com.anythink.network.admob.AdmobATConst;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17056a = "e";

    /* renamed from: b, reason: collision with root package name */
    String f17057b;

    /* renamed from: c, reason: collision with root package name */
    bv f17058c;

    /* renamed from: d, reason: collision with root package name */
    n f17059d;

    /* renamed from: e, reason: collision with root package name */
    String f17060e;

    /* renamed from: f, reason: collision with root package name */
    int f17061f;

    /* renamed from: g, reason: collision with root package name */
    ATBaseAdAdapter f17062g;

    /* renamed from: h, reason: collision with root package name */
    c f17063h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f17064j;

    /* renamed from: k, reason: collision with root package name */
    long f17065k;

    /* renamed from: l, reason: collision with root package name */
    long f17066l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.core.common.t.b f17067m;

    /* renamed from: n, reason: collision with root package name */
    com.anythink.core.common.t.b f17068n;

    /* renamed from: o, reason: collision with root package name */
    d f17069o;

    /* renamed from: p, reason: collision with root package name */
    Boolean f17070p;

    /* renamed from: q, reason: collision with root package name */
    int f17071q;

    /* renamed from: r, reason: collision with root package name */
    String f17072r;

    /* renamed from: s, reason: collision with root package name */
    boolean f17073s;

    /* renamed from: com.anythink.core.common.w.e$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f17074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f17075b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f17076c;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, Map map) {
            this.f17074a = aTBaseAdAdapter;
            this.f17075b = bvVar;
            this.f17076c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context a9 = e.a(e.this);
            byte b9 = 0;
            if (a9 == null) {
                if (e.this.f17063h != null) {
                    b bVar = new b();
                    bVar.f17028c = 0;
                    bVar.f17030e = SystemClock.elapsedRealtime() - e.this.f17065k;
                    bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    e.this.a(this.f17074a, bVar);
                    return;
                }
                return;
            }
            e.a(e.this, a9, this.f17075b, this.f17074a);
            try {
                Map<String, Object> j6 = e.this.j();
                e.this.f17062g = this.f17074a;
                com.anythink.core.common.o.e.a().c();
                ATBaseAdAdapter aTBaseAdAdapter = this.f17074a;
                Map<String, Object> map = this.f17076c;
                e eVar = e.this;
                aTBaseAdAdapter.internalLoad(a9, map, j6, new com.anythink.core.common.w.a(eVar.f17059d, eVar.f17060e, map, new a(eVar, eVar, aTBaseAdAdapter, b9)));
                n trackingInfo = this.f17074a.getTrackingInfo();
                String internalNetworkPlacementId = this.f17074a.getInternalNetworkPlacementId();
                if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
                    trackingInfo.m(internalNetworkPlacementId);
                }
                c cVar = e.this.f17063h;
                if (cVar != null) {
                    cVar.a(trackingInfo, this.f17074a);
                }
            } catch (Throwable th) {
                b bVar2 = new b();
                bVar2.f17028c = 0;
                bVar2.f17030e = SystemClock.elapsedRealtime() - e.this.f17065k;
                bVar2.f17029d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                e.this.a(this.f17074a, bVar2);
            }
        }
    }

    public class a implements ATCustomLoadListener {

        /* renamed from: a, reason: collision with root package name */
        ATBaseAdAdapter f17082a;

        /* renamed from: b, reason: collision with root package name */
        e f17083b;

        public /* synthetic */ a(e eVar, e eVar2, ATBaseAdAdapter aTBaseAdAdapter, byte b9) {
            this(eVar2, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(final BaseAd... baseAdArr) {
            com.anythink.core.common.o.e.a().d();
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.w.e.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATBaseAdAdapter aTBaseAdAdapter;
                    synchronized (a.this) {
                        try {
                            a aVar = a.this;
                            e eVar = aVar.f17083b;
                            if (eVar != null && (aTBaseAdAdapter = aVar.f17082a) != null) {
                                eVar.a(aTBaseAdAdapter, baseAdArr);
                                a aVar2 = a.this;
                                aVar2.f17083b = null;
                                aVar2.f17082a = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            e.d(e.this);
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.w.e.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        try {
                            a aVar = a.this;
                            e eVar = aVar.f17083b;
                            if (eVar != null && aVar.f17082a != null) {
                                eVar.p();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(final String str, final String str2) {
            com.anythink.core.common.o.e.a().d();
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.w.e.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        try {
                            a aVar = a.this;
                            if (aVar.f17083b != null && aVar.f17082a != null) {
                                b bVar = new b();
                                bVar.f17028c = 0;
                                bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                a aVar2 = a.this;
                                bVar.f17030e = elapsedRealtime - e.this.f17065k;
                                aVar2.f17083b.a(aVar2.f17082a, bVar);
                                a aVar3 = a.this;
                                aVar3.f17083b = null;
                                aVar3.f17082a = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        private a(e eVar, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f17083b = eVar;
            this.f17082a = aTBaseAdAdapter;
        }
    }

    public e(bv bvVar, int i) {
        this.f17058c = bvVar;
        this.f17071q = i;
        this.f17060e = bvVar.z();
        this.f17072r = this.f17060e + "_" + hashCode();
    }

    private void g() {
        if (this.f17067m != null) {
            com.anythink.core.common.t.d.a().b(this.f17067m);
            this.f17067m = null;
        }
    }

    private void h() {
        if (this.f17068n != null) {
            com.anythink.core.common.t.d.a().b(this.f17068n);
            this.f17068n = null;
        }
    }

    private Map<String, Object> i() {
        d dVar = this.f17069o;
        l lVar = dVar.f17052e;
        String str = dVar.f17050c;
        if (lVar == null) {
            return new HashMap();
        }
        n nVar = this.f17059d;
        Map<String, Object> a9 = lVar.a(this.f17057b, str, this.f17058c, nVar != null ? nVar.a() : null);
        int g4 = this.f17058c.g();
        if (g4 == 2) {
            com.anythink.core.d.b g9 = y.g(com.anythink.core.d.d.a(this.f17069o.f17048a));
            if (g9 != null) {
                a9.put(j.w.f12626n, Boolean.valueOf(g9.v() == 1));
            }
            if (lVar.l() == 1) {
                a9.put(j.w.f12629q, Integer.valueOf(lVar.l()));
            } else {
                a9.put(j.w.f12629q, Integer.valueOf(this.f17058c.az()));
            }
        } else if (g4 == 6) {
            JSONObject a10 = p.a(this.f17069o.f17048a, str, this.f17057b, lVar.aq(), this.f17061f);
            if (lVar.aP() == 1) {
                a9.put("tp_info", a10.toString());
            }
        } else if (g4 == 22) {
            com.anythink.core.common.v.f.a(lVar, a9, this.f17058c, this.f17069o.i);
        } else if (g4 == 76) {
            a9.put("internal_vast_load_timeout", Long.valueOf(this.f17058c.w()));
        }
        if (!ak.a(this.f17058c) || this.f17069o.f17052e.aK() != 1) {
            return a9;
        }
        bo a11 = com.anythink.core.a.a.a(this.f17069o.f17048a).a(this.f17057b, this.f17069o.f17052e.aq());
        a9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_LOAD_SEQ, Integer.valueOf(a11 != null ? a11.f13722c : 0));
        synchronized (u.a().a(this.f17057b)) {
            try {
                String a12 = u.a().a(this.f17057b, this.f17058c.g());
                if (!TextUtils.isEmpty(a12)) {
                    a9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.CONTENT, a12);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> j() {
        Map<String, Object> map = this.f17069o.f17053f;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f17058c.g() == 2) {
            Object obj = map.get(AdmobATConst.CONTENT_URLS);
            String str = "";
            try {
                Object obj2 = map.get(AdmobATConst.CONTENT_KEYWORDS);
                if (obj2 instanceof List) {
                    str = obj2.toString();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if ((obj instanceof List) || !TextUtils.isEmpty(str)) {
                com.anythink.core.common.u.e.a(this.f17057b, this.f17059d, AdmobATConst.CONTENT_URLS, obj, str);
            }
        }
        return map;
    }

    private Context k() {
        Context context = this.f17069o.f17049b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17056a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    private boolean l() {
        return !this.f17073s || this.f17064j || r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        if (l()) {
            return;
        }
        this.i = true;
        String str = this.f17060e;
        c cVar = this.f17063h;
        if (cVar != null) {
            cVar.a(this.f17072r, str);
        }
    }

    private com.anythink.core.common.t.b n() {
        return new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.w.e.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.w.e.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.m();
                    }
                });
            }
        };
    }

    private void o() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = elapsedRealtime - this.f17065k;
        this.f17066l = j6;
        n nVar = this.f17059d;
        if (nVar != null) {
            nVar.q(j6);
            this.f17059d.k(elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        g();
    }

    private void q() {
        this.f17062g = null;
    }

    private boolean r() {
        return this.f17070p != null;
    }

    private long s() {
        return this.f17065k;
    }

    private boolean t() {
        return this.i;
    }

    public final boolean d() {
        return (r() && this.i) ? false : true;
    }

    public final bv f() {
        return this.f17058c;
    }

    private void b(long j6) {
        if (j6 == -1) {
            return;
        }
        this.f17067m = n();
        com.anythink.core.common.t.d.a().a(this.f17067m, j6, false);
    }

    public static /* synthetic */ void d(e eVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = elapsedRealtime - eVar.f17065k;
        eVar.f17066l = j6;
        n nVar = eVar.f17059d;
        if (nVar != null) {
            nVar.q(j6);
            eVar.f17059d.k(elapsedRealtime);
        }
    }

    public final String a() {
        return this.f17072r;
    }

    public final Boolean c() {
        return this.f17070p;
    }

    public final int e() {
        return this.f17071q;
    }

    public final void a(d dVar) {
        this.f17069o = dVar;
        this.f17057b = dVar.f17051d;
        this.f17059d = dVar.f17055h;
        this.f17061f = dVar.f17054g;
    }

    public final synchronized void b() {
        if (l()) {
            return;
        }
        this.f17070p = Boolean.FALSE;
        this.f17064j = true;
        b bVar = new b();
        bVar.f17028c = 0;
        bVar.f17030e = SystemClock.elapsedRealtime() - this.f17065k;
        bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        a(this.f17062g, bVar);
    }

    public final void a(c cVar) {
        this.f17063h = cVar;
    }

    public final void a(bv bvVar) {
        boolean z3;
        com.anythink.core.common.h.c cVar;
        BaseAd baseAd;
        ATBaseAdAdapter aTBaseAdAdapter;
        com.anythink.core.common.h.p pVar;
        String str;
        boolean z6 = true;
        this.f17073s = true;
        ad R8 = this.f17058c.R();
        if (R8 != null && R8.p()) {
            if (this.f17063h != null) {
                b bVar = new b();
                bVar.f17028c = 0;
                bVar.f17030e = 0L;
                bVar.f17029d = ErrorCode.getErrorCode(ErrorCode.biddingResultHasShow, "", "Bidding result has been used");
                bVar.f17033h = 1;
                a((ATBaseAdAdapter) null, bVar);
                return;
            }
            return;
        }
        if (this.f17058c.o() && this.f17058c.R() != null && !TextUtils.isEmpty(this.f17069o.f17050c)) {
            this.f17058c.R().b(this.f17069o.f17050c);
        }
        bw a9 = com.anythink.core.common.a.a().a(this.f17057b, this.f17058c);
        if (a9 != null) {
            com.anythink.core.common.h.j a10 = a9.a(this.f17058c.R());
            int d2 = a10.d();
            if (this.f17058c.n() == 1) {
                cVar = a10.e();
                if (cVar != null) {
                    this.f17058c.toString();
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                com.anythink.core.common.h.c a11 = a10.a();
                if (a10.c() && a11 != null) {
                    if (com.anythink.core.common.v.l.a(this.f17058c, bvVar) >= 0) {
                        p.a(bvVar);
                        this.f17058c.toString();
                    } else if (d2 >= this.f17058c.ay()) {
                        this.f17058c.toString();
                    }
                    z3 = true;
                    cVar = a11;
                }
                z3 = false;
                cVar = a11;
            }
            this.f17058c.toString();
        } else {
            this.f17058c.toString();
            z3 = false;
            cVar = null;
        }
        if (z3) {
            c cVar2 = this.f17063h;
            if (cVar2 != null) {
                cVar2.a(cVar.e().getTrackingInfo(), cVar.e());
            }
            this.f17058c.toString();
            a(cVar.e(), this.f17058c, cVar);
            return;
        }
        this.f17058c.toString();
        if (R8 == null || !R8.f13437t) {
            z6 = false;
            baseAd = null;
            aTBaseAdAdapter = null;
        } else {
            com.anythink.core.b.c.b bVar2 = R8.f13436s;
            if (bVar2 != null) {
                aTBaseAdAdapter = bVar2.a();
                baseAd = bVar2.b();
            } else {
                baseAd = null;
                aTBaseAdAdapter = null;
            }
            R8.f13436s = null;
        }
        if (aTBaseAdAdapter != null || z6) {
            pVar = null;
        } else {
            pVar = com.anythink.core.common.v.u.a(this.f17058c);
            aTBaseAdAdapter = pVar != null ? pVar.f14035a : null;
        }
        if (aTBaseAdAdapter == null) {
            if (this.f17063h != null) {
                b bVar3 = new b();
                bVar3.f17028c = 0;
                bVar3.f17030e = z6 ? this.f17058c.p() : 0L;
                if (z6) {
                    str = "";
                } else {
                    str = this.f17058c.m() + " does not exist!";
                }
                if (pVar != null) {
                    str = pVar.a(str);
                }
                bVar3.f17029d = ErrorCode.getErrorCode(z6 ? ErrorCode.c2sBiddingCacheError : ErrorCode.adapterNotExistError, "", str);
                a((ATBaseAdAdapter) null, bVar3);
                return;
            }
            return;
        }
        n a12 = aj.a(aTBaseAdAdapter, this.f17059d, this.f17058c);
        this.f17059d = a12;
        a12.m(ak.a(this.f17058c, (ATBaseAdAdapter) null));
        c cVar3 = this.f17063h;
        if (cVar3 != null) {
            cVar3.a(aTBaseAdAdapter, String.valueOf(this.f17069o.f17052e.aq()));
        }
        c cVar4 = this.f17063h;
        if (cVar4 != null) {
            cVar4.a(this.f17059d);
        }
        long H8 = this.f17058c.H();
        if (H8 != -1) {
            this.f17067m = n();
            com.anythink.core.common.t.d.a().a(this.f17067m, H8, false);
        }
        long w6 = this.f17058c.w();
        if (w6 != -1) {
            this.f17068n = n();
            com.anythink.core.common.t.d.a().a(this.f17068n, w6, false);
        }
        this.f17065k = SystemClock.elapsedRealtime();
        Context context = this.f17069o.f17049b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z6) {
            c cVar5 = this.f17063h;
            if (cVar5 != null) {
                cVar5.a(this.f17059d, aTBaseAdAdapter);
            }
            if (baseAd != null) {
                a(aTBaseAdAdapter, baseAd);
                return;
            } else {
                a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        bv bvVar2 = this.f17058c;
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17069o.f17052e.aq());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, bvVar2, i);
        if (TextUtils.equals(valueOf, "2")) {
            t.b().b(anonymousClass1);
        } else {
            com.anythink.core.common.v.b.b.a().b(anonymousClass1);
        }
    }

    private void a(long j6) {
        if (j6 == -1) {
            return;
        }
        this.f17068n = n();
        com.anythink.core.common.t.d.a().a(this.f17068n, j6, false);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar) {
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17069o.f17052e.aq());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, bvVar, i);
        if (TextUtils.equals(valueOf, "2")) {
            t.b().b(anonymousClass1);
        } else {
            com.anythink.core.common.v.b.b.a().b(anonymousClass1);
        }
    }

    private void a(Context context, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.d.b.aY()) {
            v a9 = v.a(t.b().g());
            try {
                boolean b9 = a9.b(bvVar.g());
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(this.f17069o.f17048a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f17062g = aTBaseAdAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
        try {
            if (l()) {
                return;
            }
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            long p9 = unitGroupInfo.q() == 2 ? unitGroupInfo.p() : 0L;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f17059d.r((elapsedRealtime - this.f17065k) + p9);
            this.f17059d.l(elapsedRealtime);
            g();
            h();
            this.f17062g = null;
            this.f17070p = Boolean.TRUE;
            if (this.i) {
                this.f17059d.f14026u = 1;
            }
            c cVar = this.f17063h;
            if (cVar != null) {
                cVar.a(this.f17072r, aTBaseAdAdapter, baseAdArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.c cVar) {
        try {
            if (l()) {
                return;
            }
            g();
            h();
            this.f17062g = null;
            this.f17070p = Boolean.TRUE;
            if (this.i) {
                this.f17059d.f14026u = 1;
            }
            c cVar2 = this.f17063h;
            if (cVar2 != null) {
                cVar2.a(this.f17072r, aTBaseAdAdapter, bvVar, cVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(final ATBaseAdAdapter aTBaseAdAdapter, b bVar) {
        try {
            if (l()) {
                return;
            }
            g();
            h();
            if (aTBaseAdAdapter != null) {
                t.b().b(new Runnable() { // from class: com.anythink.core.common.w.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                            if (aTBaseAdAdapter2 != null) {
                                aTBaseAdAdapter2.internalDestory();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
            this.f17062g = null;
            this.f17070p = Boolean.FALSE;
            boolean z3 = this.f17064j;
            if (z3) {
                this.f17059d.f14026u = 2;
            } else if (this.i) {
                this.f17059d.f14026u = 1;
            }
            if (!z3) {
                long currentTimeMillis = System.currentTimeMillis();
                com.anythink.core.common.c.a().a(this.f17060e, currentTimeMillis);
                com.anythink.core.common.c.a().a(this.f17060e, currentTimeMillis, bVar.f17029d);
            }
            bVar.f17031f = this.f17059d;
            bVar.f17032g = this.f17058c;
            c cVar = this.f17063h;
            if (cVar != null) {
                cVar.a(this.f17072r, aTBaseAdAdapter, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Context a(e eVar) {
        Context context = eVar.f17069o.f17049b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17056a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    public static /* synthetic */ void a(e eVar, Context context, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.d.b.aY()) {
            v a9 = v.a(t.b().g());
            try {
                boolean b9 = a9.b(bvVar.g());
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(eVar.f17069o.f17048a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
