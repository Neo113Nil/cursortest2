package com.anythink.core.common.w;

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
    public static final String f17214a = "e";

    /* renamed from: b, reason: collision with root package name */
    String f17215b;

    /* renamed from: c, reason: collision with root package name */
    bv f17216c;

    /* renamed from: d, reason: collision with root package name */
    n f17217d;

    /* renamed from: e, reason: collision with root package name */
    String f17218e;

    /* renamed from: f, reason: collision with root package name */
    int f17219f;

    /* renamed from: g, reason: collision with root package name */
    ATBaseAdAdapter f17220g;

    /* renamed from: h, reason: collision with root package name */
    c f17221h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f17222j;

    /* renamed from: k, reason: collision with root package name */
    long f17223k;

    /* renamed from: l, reason: collision with root package name */
    long f17224l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.core.common.t.b f17225m;

    /* renamed from: n, reason: collision with root package name */
    com.anythink.core.common.t.b f17226n;

    /* renamed from: o, reason: collision with root package name */
    d f17227o;

    /* renamed from: p, reason: collision with root package name */
    Boolean f17228p;

    /* renamed from: q, reason: collision with root package name */
    int f17229q;

    /* renamed from: r, reason: collision with root package name */
    String f17230r;

    /* renamed from: s, reason: collision with root package name */
    boolean f17231s;

    /* renamed from: com.anythink.core.common.w.e$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f17232a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f17233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f17234c;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, Map map) {
            this.f17232a = aTBaseAdAdapter;
            this.f17233b = bvVar;
            this.f17234c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context a9 = e.a(e.this);
            byte b9 = 0;
            if (a9 == null) {
                if (e.this.f17221h != null) {
                    b bVar = new b();
                    bVar.f17186c = 0;
                    bVar.f17188e = SystemClock.elapsedRealtime() - e.this.f17223k;
                    bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    e.this.a(this.f17232a, bVar);
                    return;
                }
                return;
            }
            e.a(e.this, a9, this.f17233b, this.f17232a);
            try {
                Map<String, Object> j9 = e.this.j();
                e.this.f17220g = this.f17232a;
                com.anythink.core.common.o.e.a().c();
                ATBaseAdAdapter aTBaseAdAdapter = this.f17232a;
                Map<String, Object> map = this.f17234c;
                e eVar = e.this;
                aTBaseAdAdapter.internalLoad(a9, map, j9, new com.anythink.core.common.w.a(eVar.f17217d, eVar.f17218e, map, new a(eVar, eVar, aTBaseAdAdapter, b9)));
                n trackingInfo = this.f17232a.getTrackingInfo();
                String internalNetworkPlacementId = this.f17232a.getInternalNetworkPlacementId();
                if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
                    trackingInfo.m(internalNetworkPlacementId);
                }
                c cVar = e.this.f17221h;
                if (cVar != null) {
                    cVar.a(trackingInfo, this.f17232a);
                }
            } catch (Throwable th) {
                b bVar2 = new b();
                bVar2.f17186c = 0;
                bVar2.f17188e = SystemClock.elapsedRealtime() - e.this.f17223k;
                bVar2.f17187d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                e.this.a(this.f17232a, bVar2);
            }
        }
    }

    public class a implements ATCustomLoadListener {

        /* renamed from: a, reason: collision with root package name */
        ATBaseAdAdapter f17240a;

        /* renamed from: b, reason: collision with root package name */
        e f17241b;

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
                            e eVar = aVar.f17241b;
                            if (eVar != null && (aTBaseAdAdapter = aVar.f17240a) != null) {
                                eVar.a(aTBaseAdAdapter, baseAdArr);
                                a aVar2 = a.this;
                                aVar2.f17241b = null;
                                aVar2.f17240a = null;
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
                            e eVar = aVar.f17241b;
                            if (eVar != null && aVar.f17240a != null) {
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
                            if (aVar.f17241b != null && aVar.f17240a != null) {
                                b bVar = new b();
                                bVar.f17186c = 0;
                                bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                a aVar2 = a.this;
                                bVar.f17188e = elapsedRealtime - e.this.f17223k;
                                aVar2.f17241b.a(aVar2.f17240a, bVar);
                                a aVar3 = a.this;
                                aVar3.f17241b = null;
                                aVar3.f17240a = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        private a(e eVar, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f17241b = eVar;
            this.f17240a = aTBaseAdAdapter;
        }
    }

    public e(bv bvVar, int i) {
        this.f17216c = bvVar;
        this.f17229q = i;
        this.f17218e = bvVar.z();
        this.f17230r = this.f17218e + "_" + hashCode();
    }

    private void g() {
        if (this.f17225m != null) {
            com.anythink.core.common.t.d.a().b(this.f17225m);
            this.f17225m = null;
        }
    }

    private void h() {
        if (this.f17226n != null) {
            com.anythink.core.common.t.d.a().b(this.f17226n);
            this.f17226n = null;
        }
    }

    private Map<String, Object> i() {
        d dVar = this.f17227o;
        l lVar = dVar.f17210e;
        String str = dVar.f17208c;
        if (lVar == null) {
            return new HashMap();
        }
        n nVar = this.f17217d;
        Map<String, Object> a9 = lVar.a(this.f17215b, str, this.f17216c, nVar != null ? nVar.a() : null);
        int g9 = this.f17216c.g();
        if (g9 == 2) {
            com.anythink.core.d.b k6 = com.anythink.basead.b.c.i.k(com.anythink.core.d.d.a(this.f17227o.f17206a));
            if (k6 != null) {
                a9.put(j.w.f12783n, Boolean.valueOf(k6.v() == 1));
            }
            if (lVar.l() == 1) {
                a9.put(j.w.f12786q, Integer.valueOf(lVar.l()));
            } else {
                a9.put(j.w.f12786q, Integer.valueOf(this.f17216c.az()));
            }
        } else if (g9 == 6) {
            JSONObject a10 = p.a(this.f17227o.f17206a, str, this.f17215b, lVar.aq(), this.f17219f);
            if (lVar.aP() == 1) {
                a9.put("tp_info", a10.toString());
            }
        } else if (g9 == 22) {
            com.anythink.core.common.v.f.a(lVar, a9, this.f17216c, this.f17227o.i);
        } else if (g9 == 76) {
            a9.put("internal_vast_load_timeout", Long.valueOf(this.f17216c.w()));
        }
        if (!ak.a(this.f17216c) || this.f17227o.f17210e.aK() != 1) {
            return a9;
        }
        bo a11 = com.anythink.core.a.a.a(this.f17227o.f17206a).a(this.f17215b, this.f17227o.f17210e.aq());
        a9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_LOAD_SEQ, Integer.valueOf(a11 != null ? a11.f13879c : 0));
        synchronized (u.a().a(this.f17215b)) {
            try {
                String a12 = u.a().a(this.f17215b, this.f17216c.g());
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
        Map<String, Object> map = this.f17227o.f17211f;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f17216c.g() == 2) {
            Object obj = map.get(AdmobATConst.CONTENT_URLS);
            String str = "";
            try {
                Object obj2 = map.get(AdmobATConst.CONTENT_KEYWORDS);
                if (obj2 instanceof List) {
                    str = obj2.toString();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            if ((obj instanceof List) || !TextUtils.isEmpty(str)) {
                com.anythink.core.common.u.e.a(this.f17215b, this.f17217d, AdmobATConst.CONTENT_URLS, obj, str);
            }
        }
        return map;
    }

    private Context k() {
        Context context = this.f17227o.f17207b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17214a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    private boolean l() {
        return !this.f17231s || this.f17222j || r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        if (l()) {
            return;
        }
        this.i = true;
        String str = this.f17218e;
        c cVar = this.f17221h;
        if (cVar != null) {
            cVar.a(this.f17230r, str);
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
        long j9 = elapsedRealtime - this.f17223k;
        this.f17224l = j9;
        n nVar = this.f17217d;
        if (nVar != null) {
            nVar.q(j9);
            this.f17217d.k(elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        g();
    }

    private void q() {
        this.f17220g = null;
    }

    private boolean r() {
        return this.f17228p != null;
    }

    private long s() {
        return this.f17223k;
    }

    private boolean t() {
        return this.i;
    }

    public final boolean d() {
        return (r() && this.i) ? false : true;
    }

    public final bv f() {
        return this.f17216c;
    }

    private void b(long j9) {
        if (j9 == -1) {
            return;
        }
        this.f17225m = n();
        com.anythink.core.common.t.d.a().a(this.f17225m, j9, false);
    }

    public static /* synthetic */ void d(e eVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = elapsedRealtime - eVar.f17223k;
        eVar.f17224l = j9;
        n nVar = eVar.f17217d;
        if (nVar != null) {
            nVar.q(j9);
            eVar.f17217d.k(elapsedRealtime);
        }
    }

    public final String a() {
        return this.f17230r;
    }

    public final Boolean c() {
        return this.f17228p;
    }

    public final int e() {
        return this.f17229q;
    }

    public final void a(d dVar) {
        this.f17227o = dVar;
        this.f17215b = dVar.f17209d;
        this.f17217d = dVar.f17213h;
        this.f17219f = dVar.f17212g;
    }

    public final synchronized void b() {
        if (l()) {
            return;
        }
        this.f17228p = Boolean.FALSE;
        this.f17222j = true;
        b bVar = new b();
        bVar.f17186c = 0;
        bVar.f17188e = SystemClock.elapsedRealtime() - this.f17223k;
        bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        a(this.f17220g, bVar);
    }

    public final void a(c cVar) {
        this.f17221h = cVar;
    }

    public final void a(bv bvVar) {
        boolean z8;
        com.anythink.core.common.h.c cVar;
        BaseAd baseAd;
        ATBaseAdAdapter aTBaseAdAdapter;
        com.anythink.core.common.h.p pVar;
        String str;
        boolean z9 = true;
        this.f17231s = true;
        ad R8 = this.f17216c.R();
        if (R8 != null && R8.p()) {
            if (this.f17221h != null) {
                b bVar = new b();
                bVar.f17186c = 0;
                bVar.f17188e = 0L;
                bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.biddingResultHasShow, "", "Bidding result has been used");
                bVar.f17191h = 1;
                a((ATBaseAdAdapter) null, bVar);
                return;
            }
            return;
        }
        if (this.f17216c.o() && this.f17216c.R() != null && !TextUtils.isEmpty(this.f17227o.f17208c)) {
            this.f17216c.R().b(this.f17227o.f17208c);
        }
        bw a9 = com.anythink.core.common.a.a().a(this.f17215b, this.f17216c);
        if (a9 != null) {
            com.anythink.core.common.h.j a10 = a9.a(this.f17216c.R());
            int d2 = a10.d();
            if (this.f17216c.n() == 1) {
                cVar = a10.e();
                if (cVar != null) {
                    this.f17216c.toString();
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                com.anythink.core.common.h.c a11 = a10.a();
                if (a10.c() && a11 != null) {
                    if (com.anythink.core.common.v.l.a(this.f17216c, bvVar) >= 0) {
                        p.a(bvVar);
                        this.f17216c.toString();
                    } else if (d2 >= this.f17216c.ay()) {
                        this.f17216c.toString();
                    }
                    z8 = true;
                    cVar = a11;
                }
                z8 = false;
                cVar = a11;
            }
            this.f17216c.toString();
        } else {
            this.f17216c.toString();
            z8 = false;
            cVar = null;
        }
        if (z8) {
            c cVar2 = this.f17221h;
            if (cVar2 != null) {
                cVar2.a(cVar.e().getTrackingInfo(), cVar.e());
            }
            this.f17216c.toString();
            a(cVar.e(), this.f17216c, cVar);
            return;
        }
        this.f17216c.toString();
        if (R8 == null || !R8.f13594t) {
            z9 = false;
            baseAd = null;
            aTBaseAdAdapter = null;
        } else {
            com.anythink.core.b.c.b bVar2 = R8.f13593s;
            if (bVar2 != null) {
                aTBaseAdAdapter = bVar2.a();
                baseAd = bVar2.b();
            } else {
                baseAd = null;
                aTBaseAdAdapter = null;
            }
            R8.f13593s = null;
        }
        if (aTBaseAdAdapter != null || z9) {
            pVar = null;
        } else {
            pVar = com.anythink.core.common.v.u.a(this.f17216c);
            aTBaseAdAdapter = pVar != null ? pVar.f14192a : null;
        }
        if (aTBaseAdAdapter == null) {
            if (this.f17221h != null) {
                b bVar3 = new b();
                bVar3.f17186c = 0;
                bVar3.f17188e = z9 ? this.f17216c.p() : 0L;
                if (z9) {
                    str = "";
                } else {
                    str = this.f17216c.m() + " does not exist!";
                }
                if (pVar != null) {
                    str = pVar.a(str);
                }
                bVar3.f17187d = ErrorCode.getErrorCode(z9 ? ErrorCode.c2sBiddingCacheError : ErrorCode.adapterNotExistError, "", str);
                a((ATBaseAdAdapter) null, bVar3);
                return;
            }
            return;
        }
        n a12 = aj.a(aTBaseAdAdapter, this.f17217d, this.f17216c);
        this.f17217d = a12;
        a12.m(ak.a(this.f17216c, (ATBaseAdAdapter) null));
        c cVar3 = this.f17221h;
        if (cVar3 != null) {
            cVar3.a(aTBaseAdAdapter, String.valueOf(this.f17227o.f17210e.aq()));
        }
        c cVar4 = this.f17221h;
        if (cVar4 != null) {
            cVar4.a(this.f17217d);
        }
        long H6 = this.f17216c.H();
        if (H6 != -1) {
            this.f17225m = n();
            com.anythink.core.common.t.d.a().a(this.f17225m, H6, false);
        }
        long w9 = this.f17216c.w();
        if (w9 != -1) {
            this.f17226n = n();
            com.anythink.core.common.t.d.a().a(this.f17226n, w9, false);
        }
        this.f17223k = SystemClock.elapsedRealtime();
        Context context = this.f17227o.f17207b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z9) {
            c cVar5 = this.f17221h;
            if (cVar5 != null) {
                cVar5.a(this.f17217d, aTBaseAdAdapter);
            }
            if (baseAd != null) {
                a(aTBaseAdAdapter, baseAd);
                return;
            } else {
                a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        bv bvVar2 = this.f17216c;
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17227o.f17210e.aq());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, bvVar2, i);
        if (TextUtils.equals(valueOf, "2")) {
            t.b().b(anonymousClass1);
        } else {
            com.anythink.core.common.v.b.b.a().b(anonymousClass1);
        }
    }

    private void a(long j9) {
        if (j9 == -1) {
            return;
        }
        this.f17226n = n();
        com.anythink.core.common.t.d.a().a(this.f17226n, j9, false);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar) {
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17227o.f17210e.aq());
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
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(this.f17227o.f17206a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f17220g = aTBaseAdAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
        try {
            if (l()) {
                return;
            }
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            long p6 = unitGroupInfo.q() == 2 ? unitGroupInfo.p() : 0L;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f17217d.r((elapsedRealtime - this.f17223k) + p6);
            this.f17217d.l(elapsedRealtime);
            g();
            h();
            this.f17220g = null;
            this.f17228p = Boolean.TRUE;
            if (this.i) {
                this.f17217d.f14183u = 1;
            }
            c cVar = this.f17221h;
            if (cVar != null) {
                cVar.a(this.f17230r, aTBaseAdAdapter, baseAdArr);
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
            this.f17220g = null;
            this.f17228p = Boolean.TRUE;
            if (this.i) {
                this.f17217d.f14183u = 1;
            }
            c cVar2 = this.f17221h;
            if (cVar2 != null) {
                cVar2.a(this.f17230r, aTBaseAdAdapter, bvVar, cVar);
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
            this.f17220g = null;
            this.f17228p = Boolean.FALSE;
            boolean z8 = this.f17222j;
            if (z8) {
                this.f17217d.f14183u = 2;
            } else if (this.i) {
                this.f17217d.f14183u = 1;
            }
            if (!z8) {
                long currentTimeMillis = System.currentTimeMillis();
                com.anythink.core.common.c.a().a(this.f17218e, currentTimeMillis);
                com.anythink.core.common.c.a().a(this.f17218e, currentTimeMillis, bVar.f17187d);
            }
            bVar.f17189f = this.f17217d;
            bVar.f17190g = this.f17216c;
            c cVar = this.f17221h;
            if (cVar != null) {
                cVar.a(this.f17230r, aTBaseAdAdapter, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Context a(e eVar) {
        Context context = eVar.f17227o.f17207b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17214a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    public static /* synthetic */ void a(e eVar, Context context, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.d.b.aY()) {
            v a9 = v.a(t.b().g());
            try {
                boolean b9 = a9.b(bvVar.g());
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(eVar.f17227o.f17206a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
