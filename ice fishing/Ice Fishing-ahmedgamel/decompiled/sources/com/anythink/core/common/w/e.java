package com.anythink.core.common.w;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.IceFishing.LiveIceFishing.k;
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
    public static final String f17843a = "e";

    /* renamed from: b, reason: collision with root package name */
    String f17844b;

    /* renamed from: c, reason: collision with root package name */
    bv f17845c;

    /* renamed from: d, reason: collision with root package name */
    n f17846d;

    /* renamed from: e, reason: collision with root package name */
    String f17847e;

    /* renamed from: f, reason: collision with root package name */
    int f17848f;

    /* renamed from: g, reason: collision with root package name */
    ATBaseAdAdapter f17849g;

    /* renamed from: h, reason: collision with root package name */
    c f17850h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f17851j;

    /* renamed from: k, reason: collision with root package name */
    long f17852k;

    /* renamed from: l, reason: collision with root package name */
    long f17853l;

    /* renamed from: m, reason: collision with root package name */
    com.anythink.core.common.t.b f17854m;

    /* renamed from: n, reason: collision with root package name */
    com.anythink.core.common.t.b f17855n;

    /* renamed from: o, reason: collision with root package name */
    d f17856o;

    /* renamed from: p, reason: collision with root package name */
    Boolean f17857p;

    /* renamed from: q, reason: collision with root package name */
    int f17858q;

    /* renamed from: r, reason: collision with root package name */
    String f17859r;

    /* renamed from: s, reason: collision with root package name */
    boolean f17860s;

    /* renamed from: com.anythink.core.common.w.e$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ATBaseAdAdapter f17861a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ bv f17862b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f17863c;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, Map map) {
            this.f17861a = aTBaseAdAdapter;
            this.f17862b = bvVar;
            this.f17863c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context a9 = e.a(e.this);
            byte b9 = 0;
            if (a9 == null) {
                if (e.this.f17850h != null) {
                    b bVar = new b();
                    bVar.f17815c = 0;
                    bVar.f17817e = SystemClock.elapsedRealtime() - e.this.f17852k;
                    bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    e.this.a(this.f17861a, bVar);
                    return;
                }
                return;
            }
            e.a(e.this, a9, this.f17862b, this.f17861a);
            try {
                Map<String, Object> j6 = e.this.j();
                e.this.f17849g = this.f17861a;
                com.anythink.core.common.o.e.a().c();
                ATBaseAdAdapter aTBaseAdAdapter = this.f17861a;
                Map<String, Object> map = this.f17863c;
                e eVar = e.this;
                aTBaseAdAdapter.internalLoad(a9, map, j6, new com.anythink.core.common.w.a(eVar.f17846d, eVar.f17847e, map, new a(eVar, eVar, aTBaseAdAdapter, b9)));
                n trackingInfo = this.f17861a.getTrackingInfo();
                String internalNetworkPlacementId = this.f17861a.getInternalNetworkPlacementId();
                if (!TextUtils.isEmpty(internalNetworkPlacementId)) {
                    trackingInfo.m(internalNetworkPlacementId);
                }
                c cVar = e.this.f17850h;
                if (cVar != null) {
                    cVar.a(trackingInfo, this.f17861a);
                }
            } catch (Throwable th) {
                b bVar2 = new b();
                bVar2.f17815c = 0;
                bVar2.f17817e = SystemClock.elapsedRealtime() - e.this.f17852k;
                bVar2.f17816d = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                e.this.a(this.f17861a, bVar2);
            }
        }
    }

    public class a implements ATCustomLoadListener {

        /* renamed from: a, reason: collision with root package name */
        ATBaseAdAdapter f17869a;

        /* renamed from: b, reason: collision with root package name */
        e f17870b;

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
                            e eVar = aVar.f17870b;
                            if (eVar != null && (aTBaseAdAdapter = aVar.f17869a) != null) {
                                eVar.a(aTBaseAdAdapter, baseAdArr);
                                a aVar2 = a.this;
                                aVar2.f17870b = null;
                                aVar2.f17869a = null;
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
                            e eVar = aVar.f17870b;
                            if (eVar != null && aVar.f17869a != null) {
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
                            if (aVar.f17870b != null && aVar.f17869a != null) {
                                b bVar = new b();
                                bVar.f17815c = 0;
                                bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                a aVar2 = a.this;
                                bVar.f17817e = elapsedRealtime - e.this.f17852k;
                                aVar2.f17870b.a(aVar2.f17869a, bVar);
                                a aVar3 = a.this;
                                aVar3.f17870b = null;
                                aVar3.f17869a = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        private a(e eVar, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f17870b = eVar;
            this.f17869a = aTBaseAdAdapter;
        }
    }

    public e(bv bvVar, int i) {
        this.f17845c = bvVar;
        this.f17858q = i;
        this.f17847e = bvVar.z();
        this.f17859r = this.f17847e + "_" + hashCode();
    }

    private void g() {
        if (this.f17854m != null) {
            com.anythink.core.common.t.d.a().b(this.f17854m);
            this.f17854m = null;
        }
    }

    private void h() {
        if (this.f17855n != null) {
            com.anythink.core.common.t.d.a().b(this.f17855n);
            this.f17855n = null;
        }
    }

    private Map<String, Object> i() {
        d dVar = this.f17856o;
        l lVar = dVar.f17839e;
        String str = dVar.f17837c;
        if (lVar == null) {
            return new HashMap();
        }
        n nVar = this.f17846d;
        Map<String, Object> a9 = lVar.a(this.f17844b, str, this.f17845c, nVar != null ? nVar.a() : null);
        int g9 = this.f17845c.g();
        if (g9 == 2) {
            com.anythink.core.d.b k9 = k.k(com.anythink.core.d.d.a(this.f17856o.f17835a));
            if (k9 != null) {
                a9.put(j.w.f13412n, Boolean.valueOf(k9.v() == 1));
            }
            if (lVar.l() == 1) {
                a9.put(j.w.f13415q, Integer.valueOf(lVar.l()));
            } else {
                a9.put(j.w.f13415q, Integer.valueOf(this.f17845c.az()));
            }
        } else if (g9 == 6) {
            JSONObject a10 = p.a(this.f17856o.f17835a, str, this.f17844b, lVar.aq(), this.f17848f);
            if (lVar.aP() == 1) {
                a9.put("tp_info", a10.toString());
            }
        } else if (g9 == 22) {
            com.anythink.core.common.v.f.a(lVar, a9, this.f17845c, this.f17856o.i);
        } else if (g9 == 76) {
            a9.put("internal_vast_load_timeout", Long.valueOf(this.f17845c.w()));
        }
        if (!ak.a(this.f17845c) || this.f17856o.f17839e.aK() != 1) {
            return a9;
        }
        bo a11 = com.anythink.core.a.a.a(this.f17856o.f17835a).a(this.f17844b, this.f17856o.f17839e.aq());
        a9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_LOAD_SEQ, Integer.valueOf(a11 != null ? a11.f14508c : 0));
        synchronized (u.a().a(this.f17844b)) {
            try {
                String a12 = u.a().a(this.f17844b, this.f17845c.g());
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
        Map<String, Object> map = this.f17856o.f17840f;
        if (map == null) {
            return new HashMap(2);
        }
        if (this.f17845c.g() == 2) {
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
                com.anythink.core.common.u.e.a(this.f17844b, this.f17846d, AdmobATConst.CONTENT_URLS, obj, str);
            }
        }
        return map;
    }

    private Context k() {
        Context context = this.f17856o.f17836b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17843a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    private boolean l() {
        return !this.f17860s || this.f17851j || r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        if (l()) {
            return;
        }
        this.i = true;
        String str = this.f17847e;
        c cVar = this.f17850h;
        if (cVar != null) {
            cVar.a(this.f17859r, str);
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
        long j6 = elapsedRealtime - this.f17852k;
        this.f17853l = j6;
        n nVar = this.f17846d;
        if (nVar != null) {
            nVar.q(j6);
            this.f17846d.k(elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        g();
    }

    private void q() {
        this.f17849g = null;
    }

    private boolean r() {
        return this.f17857p != null;
    }

    private long s() {
        return this.f17852k;
    }

    private boolean t() {
        return this.i;
    }

    public final boolean d() {
        return (r() && this.i) ? false : true;
    }

    public final bv f() {
        return this.f17845c;
    }

    private void b(long j6) {
        if (j6 == -1) {
            return;
        }
        this.f17854m = n();
        com.anythink.core.common.t.d.a().a(this.f17854m, j6, false);
    }

    public static /* synthetic */ void d(e eVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = elapsedRealtime - eVar.f17852k;
        eVar.f17853l = j6;
        n nVar = eVar.f17846d;
        if (nVar != null) {
            nVar.q(j6);
            eVar.f17846d.k(elapsedRealtime);
        }
    }

    public final String a() {
        return this.f17859r;
    }

    public final Boolean c() {
        return this.f17857p;
    }

    public final int e() {
        return this.f17858q;
    }

    public final void a(d dVar) {
        this.f17856o = dVar;
        this.f17844b = dVar.f17838d;
        this.f17846d = dVar.f17842h;
        this.f17848f = dVar.f17841g;
    }

    public final synchronized void b() {
        if (l()) {
            return;
        }
        this.f17857p = Boolean.FALSE;
        this.f17851j = true;
        b bVar = new b();
        bVar.f17815c = 0;
        bVar.f17817e = SystemClock.elapsedRealtime() - this.f17852k;
        bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        a(this.f17849g, bVar);
    }

    public final void a(c cVar) {
        this.f17850h = cVar;
    }

    public final void a(bv bvVar) {
        boolean z6;
        com.anythink.core.common.h.c cVar;
        BaseAd baseAd;
        ATBaseAdAdapter aTBaseAdAdapter;
        com.anythink.core.common.h.p pVar;
        String str;
        boolean z9 = true;
        this.f17860s = true;
        ad R8 = this.f17845c.R();
        if (R8 != null && R8.p()) {
            if (this.f17850h != null) {
                b bVar = new b();
                bVar.f17815c = 0;
                bVar.f17817e = 0L;
                bVar.f17816d = ErrorCode.getErrorCode(ErrorCode.biddingResultHasShow, "", "Bidding result has been used");
                bVar.f17820h = 1;
                a((ATBaseAdAdapter) null, bVar);
                return;
            }
            return;
        }
        if (this.f17845c.o() && this.f17845c.R() != null && !TextUtils.isEmpty(this.f17856o.f17837c)) {
            this.f17845c.R().b(this.f17856o.f17837c);
        }
        bw a9 = com.anythink.core.common.a.a().a(this.f17844b, this.f17845c);
        if (a9 != null) {
            com.anythink.core.common.h.j a10 = a9.a(this.f17845c.R());
            int d9 = a10.d();
            if (this.f17845c.n() == 1) {
                cVar = a10.e();
                if (cVar != null) {
                    this.f17845c.toString();
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                com.anythink.core.common.h.c a11 = a10.a();
                if (a10.c() && a11 != null) {
                    if (com.anythink.core.common.v.l.a(this.f17845c, bvVar) >= 0) {
                        p.a(bvVar);
                        this.f17845c.toString();
                    } else if (d9 >= this.f17845c.ay()) {
                        this.f17845c.toString();
                    }
                    z6 = true;
                    cVar = a11;
                }
                z6 = false;
                cVar = a11;
            }
            this.f17845c.toString();
        } else {
            this.f17845c.toString();
            z6 = false;
            cVar = null;
        }
        if (z6) {
            c cVar2 = this.f17850h;
            if (cVar2 != null) {
                cVar2.a(cVar.e().getTrackingInfo(), cVar.e());
            }
            this.f17845c.toString();
            a(cVar.e(), this.f17845c, cVar);
            return;
        }
        this.f17845c.toString();
        if (R8 == null || !R8.f14223t) {
            z9 = false;
            baseAd = null;
            aTBaseAdAdapter = null;
        } else {
            com.anythink.core.b.c.b bVar2 = R8.f14222s;
            if (bVar2 != null) {
                aTBaseAdAdapter = bVar2.a();
                baseAd = bVar2.b();
            } else {
                baseAd = null;
                aTBaseAdAdapter = null;
            }
            R8.f14222s = null;
        }
        if (aTBaseAdAdapter != null || z9) {
            pVar = null;
        } else {
            pVar = com.anythink.core.common.v.u.a(this.f17845c);
            aTBaseAdAdapter = pVar != null ? pVar.f14821a : null;
        }
        if (aTBaseAdAdapter == null) {
            if (this.f17850h != null) {
                b bVar3 = new b();
                bVar3.f17815c = 0;
                bVar3.f17817e = z9 ? this.f17845c.p() : 0L;
                if (z9) {
                    str = "";
                } else {
                    str = this.f17845c.m() + " does not exist!";
                }
                if (pVar != null) {
                    str = pVar.a(str);
                }
                bVar3.f17816d = ErrorCode.getErrorCode(z9 ? ErrorCode.c2sBiddingCacheError : ErrorCode.adapterNotExistError, "", str);
                a((ATBaseAdAdapter) null, bVar3);
                return;
            }
            return;
        }
        n a12 = aj.a(aTBaseAdAdapter, this.f17846d, this.f17845c);
        this.f17846d = a12;
        a12.m(ak.a(this.f17845c, (ATBaseAdAdapter) null));
        c cVar3 = this.f17850h;
        if (cVar3 != null) {
            cVar3.a(aTBaseAdAdapter, String.valueOf(this.f17856o.f17839e.aq()));
        }
        c cVar4 = this.f17850h;
        if (cVar4 != null) {
            cVar4.a(this.f17846d);
        }
        long H8 = this.f17845c.H();
        if (H8 != -1) {
            this.f17854m = n();
            com.anythink.core.common.t.d.a().a(this.f17854m, H8, false);
        }
        long w3 = this.f17845c.w();
        if (w3 != -1) {
            this.f17855n = n();
            com.anythink.core.common.t.d.a().a(this.f17855n, w3, false);
        }
        this.f17852k = SystemClock.elapsedRealtime();
        Context context = this.f17856o.f17836b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z9) {
            c cVar5 = this.f17850h;
            if (cVar5 != null) {
                cVar5.a(this.f17846d, aTBaseAdAdapter);
            }
            if (baseAd != null) {
                a(aTBaseAdAdapter, baseAd);
                return;
            } else {
                a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        bv bvVar2 = this.f17845c;
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17856o.f17839e.aq());
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
        this.f17855n = n();
        com.anythink.core.common.t.d.a().a(this.f17855n, j6, false);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar) {
        Map<String, Object> i = i();
        String valueOf = String.valueOf(this.f17856o.f17839e.aq());
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
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(this.f17856o.f17835a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f17849g = aTBaseAdAdapter;
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
            this.f17846d.r((elapsedRealtime - this.f17852k) + p9);
            this.f17846d.l(elapsedRealtime);
            g();
            h();
            this.f17849g = null;
            this.f17857p = Boolean.TRUE;
            if (this.i) {
                this.f17846d.f14812u = 1;
            }
            c cVar = this.f17850h;
            if (cVar != null) {
                cVar.a(this.f17859r, aTBaseAdAdapter, baseAdArr);
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
            this.f17849g = null;
            this.f17857p = Boolean.TRUE;
            if (this.i) {
                this.f17846d.f14812u = 1;
            }
            c cVar2 = this.f17850h;
            if (cVar2 != null) {
                cVar2.a(this.f17859r, aTBaseAdAdapter, bvVar, cVar);
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
            this.f17849g = null;
            this.f17857p = Boolean.FALSE;
            boolean z6 = this.f17851j;
            if (z6) {
                this.f17846d.f14812u = 2;
            } else if (this.i) {
                this.f17846d.f14812u = 1;
            }
            if (!z6) {
                long currentTimeMillis = System.currentTimeMillis();
                com.anythink.core.common.c.a().a(this.f17847e, currentTimeMillis);
                com.anythink.core.common.c.a().a(this.f17847e, currentTimeMillis, bVar.f17816d);
            }
            bVar.f17818f = this.f17846d;
            bVar.f17819g = this.f17845c;
            c cVar = this.f17850h;
            if (cVar != null) {
                cVar.a(this.f17859r, aTBaseAdAdapter, bVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ Context a(e eVar) {
        Context context = eVar.f17856o.f17836b.get();
        if (!(context instanceof Activity)) {
            context = t.b().M();
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(f17843a, "requestContext = ".concat(String.valueOf(context)));
        }
        return context;
    }

    public static /* synthetic */ void a(e eVar, Context context, bv bvVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.d.b.aY()) {
            v a9 = v.a(t.b().g());
            try {
                boolean b9 = a9.b(bvVar.g());
                if (a9.b(bvVar.g(), b9) && aTBaseAdAdapter.internalSetUserDataConsent(context, b9, ATSDK.isEUTraffic(eVar.f17856o.f17835a))) {
                    a9.a(bvVar.g(), b9);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
