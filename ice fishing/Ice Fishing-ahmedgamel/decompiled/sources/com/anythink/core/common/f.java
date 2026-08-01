package com.anythink.core.common;

import D.y;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.a.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bp;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bx;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.h.z;
import com.anythink.core.common.j;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.aj;
import com.anythink.core.d.n;
import com.anythink.core.debugger.CoreDebuggerManager;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    protected Context f13095a;

    /* renamed from: b, reason: collision with root package name */
    protected String f13096b;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f13098d;

    /* renamed from: g, reason: collision with root package name */
    n f13101g;
    com.anythink.core.common.p.c i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.core.common.p.d f13103j;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13107n;

    /* renamed from: o, reason: collision with root package name */
    private long f13108o;

    /* renamed from: q, reason: collision with root package name */
    private ATAdRequest f13110q;

    /* renamed from: r, reason: collision with root package name */
    private ar f13111r;

    /* renamed from: l, reason: collision with root package name */
    private final String f13105l = "f";

    /* renamed from: e, reason: collision with root package name */
    protected String f13099e = "";

    /* renamed from: m, reason: collision with root package name */
    private String f13106m = "";

    /* renamed from: p, reason: collision with root package name */
    private boolean f13109p = false;

    /* renamed from: f, reason: collision with root package name */
    protected int f13100f = 1;

    /* renamed from: k, reason: collision with root package name */
    h.d f13104k = new h.d() { // from class: com.anythink.core.common.f.5
        @Override // com.anythink.core.common.h.d
        public final void a(g gVar) {
            if (gVar != null) {
                gVar.b();
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    protected ConcurrentHashMap<String, g> f13097c = new ConcurrentHashMap<>(5);

    /* renamed from: h, reason: collision with root package name */
    final List<bx> f13102h = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: com.anythink.core.common.f$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.w.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ar f13125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13126b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13128d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13129e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.h.n f13130f;

        public AnonymousClass3(ar arVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
            this.f13125a = arVar;
            this.f13126b = context;
            this.f13127c = str;
            this.f13128d = str2;
            this.f13129e = lVar;
            this.f13130f = nVar;
        }

        @Override // com.anythink.core.common.w.b.b
        public final void a() {
            com.anythink.core.common.h.h hVar = this.f13125a.f13556m;
            if (hVar != null) {
                hVar.g(System.currentTimeMillis());
            }
            f.b(f.this, this.f13126b, this.f13127c, this.f13128d, this.f13129e, this.f13130f, this.f13125a);
        }
    }

    /* renamed from: com.anythink.core.common.f$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ar f13133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13136e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13137f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f13138g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ cb f13139h;
        final /* synthetic */ com.anythink.core.common.h.n i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ bz f13140j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ bq f13141k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ac f13142l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.w.i f13143m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Boolean f13144n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Double[] f13145o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f13146p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ h f13147q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f13148r;

        public AnonymousClass4(Context context, ar arVar, String str, String str2, com.anythink.core.d.l lVar, boolean z3, List list, cb cbVar, com.anythink.core.common.h.n nVar, bz bzVar, bq bqVar, ac acVar, com.anythink.core.common.w.i iVar, Boolean bool, Double[] dArr, boolean z6, h hVar, g gVar) {
            this.f13132a = context;
            this.f13133b = arVar;
            this.f13134c = str;
            this.f13135d = str2;
            this.f13136e = lVar;
            this.f13137f = z3;
            this.f13138g = list;
            this.f13139h = cbVar;
            this.i = nVar;
            this.f13140j = bzVar;
            this.f13141k = bqVar;
            this.f13142l = acVar;
            this.f13143m = iVar;
            this.f13144n = bool;
            this.f13145o = dArr;
            this.f13146p = z6;
            this.f13147q = hVar;
            this.f13148r = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Double d2;
            try {
                com.anythink.core.common.h.a aVar = new com.anythink.core.common.h.a();
                aVar.f13327b = this.f13132a;
                aVar.f13328c = this.f13133b;
                aVar.f13329d = this.f13134c;
                aVar.f13330e = this.f13135d;
                aVar.f13331f = this.f13136e.aq();
                aVar.f13332g = this.f13136e.ab();
                aVar.f13333h = this.f13136e.V();
                aVar.i = this.f13136e.E();
                i.a();
                aVar.f13336l = i.a(this.f13136e, this.f13137f);
                i.a();
                aVar.f13339o = i.a(this.f13136e);
                i.a();
                aVar.f13340p = i.b(this.f13136e);
                aVar.f13334j = this.f13138g;
                aVar.f13338n = this.f13139h;
                aVar.f13343s = this.i;
                aVar.f13346v = this.f13140j;
                aVar.f13347w = this.f13141k;
                aVar.f13348x = this.f13142l;
                aVar.f13341q = u.a().b(f.this.f13096b);
                aVar.f13337m = this.f13137f;
                ar arVar = this.f13133b;
                if (arVar.f13547c == 8) {
                    aVar.f13344t = 7;
                }
                aVar.f13349y = this.f13143m;
                aVar.f13321A = arVar.f13555l;
                aVar.f13322B = d.a().c(f.this.f13096b);
                Boolean bool = this.f13144n;
                int i = 0;
                if (bool != null && bool.booleanValue() && (d2 = this.f13145o[0]) != null) {
                    aVar.f13323C = d2.doubleValue();
                }
                if (this.f13146p && this.f13136e.bv() > 0) {
                    i = this.f13136e.bv();
                }
                aVar.f13324D = i;
                aVar.f13325E = this.f13136e.bE();
                aVar.f13326F = this.f13147q;
                com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar);
                bVar.a(ATSDK.isNetworkLogDebug());
                bVar.a(new j.a() { // from class: com.anythink.core.common.f.4.1
                    @Override // com.anythink.core.common.j.a
                    public final void a(String str, List<bv> list, List<bv> list2, boolean z3) {
                        boolean d9 = AnonymousClass4.this.f13139h.d();
                        ArrayList arrayList = null;
                        for (bv bvVar : list2) {
                            if (d9 && (bvVar.q() == 1 || bvVar.q() == 3)) {
                                if (bvVar.U() != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList(4);
                                    }
                                    bvVar.C(7);
                                    arrayList.add(bvVar);
                                }
                            }
                            if (!d9 && bvVar.p() != 0) {
                                c a9 = c.a();
                                a9.f12248c.put(bvVar.z(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        AnonymousClass4.this.f13148r.a(list, list2, arrayList, list2);
                        if (z3) {
                            AnonymousClass4.this.f13148r.e();
                        }
                    }

                    @Override // com.anythink.core.common.j.a
                    public final void a(String str) {
                        AnonymousClass4.this.f13148r.d();
                    }
                });
            } catch (Throwable th) {
                y.w("notifyBiddingFinish error", th.getMessage() + ", " + com.anythink.core.common.v.q.a(th.getStackTrace()));
                this.f13148r.e();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$7, reason: invalid class name */
    public class AnonymousClass7 implements com.anythink.core.common.d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.d.a[] f13154a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13155b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13156c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13157d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ar f13158e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13159f;

        public AnonymousClass7(com.anythink.core.common.d.a[] aVarArr, String str, String str2, String str3, ar arVar, com.anythink.core.d.l lVar) {
            this.f13154a = aVarArr;
            this.f13155b = str;
            this.f13156c = str2;
            this.f13157d = str3;
            this.f13158e = arVar;
            this.f13159f = lVar;
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            if (this.f13154a[0] != null) {
                com.anythink.core.common.u.e.a(this.f13155b, this.f13156c, (com.anythink.core.common.h.n) null, this.f13157d, this.f13158e.f13545a, this.f13159f, false, "0", "0", "");
                this.f13154a[0].onAdLoadFail(adError);
            }
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoaded() {
            if (this.f13154a[0] != null) {
                com.anythink.core.common.u.e.a(this.f13155b, this.f13156c, (com.anythink.core.common.h.n) null, this.f13157d, this.f13158e.f13545a, this.f13159f, true, "0", "1", "");
                this.f13154a[0].onAdLoaded();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$8, reason: invalid class name */
    public class AnonymousClass8 implements com.anythink.core.common.d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ar f13164d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13165e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.d.a[] f13166f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f13167g;

        public AnonymousClass8(String str, String str2, String str3, ar arVar, com.anythink.core.d.l lVar, com.anythink.core.common.d.a[] aVarArr, Context context) {
            this.f13161a = str;
            this.f13162b = str2;
            this.f13163c = str3;
            this.f13164d = arVar;
            this.f13165e = lVar;
            this.f13166f = aVarArr;
            this.f13167g = context;
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            com.anythink.core.common.h.c b9 = f.b(this.f13167g, this.f13162b, this.f13163c, this.f13164d);
            if (b9 == null) {
                w.a().b(this.f13162b, this.f13164d.b());
                com.anythink.core.common.u.e.a(this.f13161a, this.f13162b, (com.anythink.core.common.h.n) null, this.f13163c, this.f13164d.f13545a, this.f13165e, false, "0", "0", "");
                com.anythink.core.common.d.a aVar = this.f13166f[0];
                if (aVar != null) {
                    aVar.onAdLoadFail(adError);
                    return;
                }
                return;
            }
            ab.a("Shared", "placementId:" + this.f13161a + ";result_callback:success;");
            com.anythink.core.common.h.n i = b9.i();
            com.anythink.core.common.u.e.a(this.f13161a, this.f13162b, i, this.f13163c, this.f13164d.f13545a, this.f13165e, true, "1", "0", i != null ? i.aJ() : "");
            com.anythink.core.common.d.a aVar2 = this.f13166f[0];
            if (aVar2 != null) {
                aVar2.onAdLoaded();
            }
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoaded() {
            com.anythink.core.common.u.e.a(this.f13161a, this.f13162b, (com.anythink.core.common.h.n) null, this.f13163c, this.f13164d.f13545a, this.f13165e, true, "2", "1", "");
            com.anythink.core.common.d.a aVar = this.f13166f[0];
            if (aVar != null) {
                aVar.onAdLoaded();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$9, reason: invalid class name */
    public class AnonymousClass9 implements Comparator<com.anythink.core.common.h.c> {
        public AnonymousClass9() {
        }

        private static int a(com.anythink.core.common.h.c cVar, com.anythink.core.common.h.c cVar2) {
            return com.anythink.core.common.v.l.a(cVar.o(), cVar2.o());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.anythink.core.common.h.c cVar, com.anythink.core.common.h.c cVar2) {
            return com.anythink.core.common.v.l.a(cVar.o(), cVar2.o());
        }
    }

    private f(Context context, String str) {
        this.f13095a = context.getApplicationContext();
        this.f13096b = str;
        if (com.anythink.core.common.d.t.b().g() == null) {
            com.anythink.core.common.d.t.b().a(this.f13095a);
        }
    }

    public static /* synthetic */ boolean h(f fVar) {
        fVar.f13107n = false;
        return false;
    }

    public static /* synthetic */ long i(f fVar) {
        fVar.f13108o = 0L;
        return 0L;
    }

    private boolean k() {
        return System.currentTimeMillis() - this.f13108o <= com.anythink.basead.exoplayer.i.a.f7883f;
    }

    private ar l() {
        return this.f13111r;
    }

    private boolean m() {
        return !TextUtils.isEmpty(this.f13099e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.anythink.core.common.p.d dVar = this.f13103j;
        return dVar != null && dVar.b();
    }

    private void o() {
        com.anythink.core.common.p.d dVar = this.f13103j;
        if (dVar != null) {
            dVar.d();
        }
    }

    private void p() {
        com.anythink.core.common.p.d dVar = this.f13103j;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final int c() {
        List<bx> list = this.f13102h;
        int i = 0;
        if (list == null) {
            return 0;
        }
        synchronized (list) {
            try {
                Iterator<bx> it = this.f13102h.iterator();
                while (it.hasNext()) {
                    bx next = it.next();
                    if (next == null || !next.a()) {
                        it.remove();
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* renamed from: com.anythink.core.common.f$2, reason: invalid class name */
    public class AnonymousClass2 implements n.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.h.n f13120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ar f13122c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13123d;

        public AnonymousClass2(com.anythink.core.common.h.n nVar, String str, ar arVar, String str2) {
            this.f13120a = nVar;
            this.f13121b = str;
            this.f13122c = arVar;
            this.f13123d = str2;
        }

        @Override // com.anythink.core.d.n.b
        public final void a() {
            com.anythink.core.common.h.n nVar = this.f13120a;
            if (nVar != null) {
                nVar.g(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void b() {
            com.anythink.core.common.h.n nVar = this.f13120a;
            if (nVar != null) {
                nVar.h(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void a(com.anythink.core.d.l lVar) {
            com.anythink.core.common.h.n nVar;
            String unused = f.this.f13105l;
            if (lVar != null) {
                lVar.i();
            }
            synchronized (f.this) {
                try {
                    aj.a(this.f13120a, lVar);
                    if (!TextUtils.equals(String.valueOf(lVar != null ? lVar.aq() : 0), this.f13121b)) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.formatError, "", "Format corresponding to API: " + com.anythink.core.common.v.p.f(this.f13121b) + ", Format corresponding to placement strategy: " + com.anythink.core.common.v.p.f(String.valueOf(lVar.aq())));
                        f.this.a(this.f13122c, errorCode);
                        this.f13120a.b(false);
                        com.anythink.core.common.u.e.a(this.f13120a, errorCode);
                        f.this.f13098d = false;
                        return;
                    }
                    if (lVar != null && (nVar = this.f13120a) != null) {
                        nVar.i(SystemClock.elapsedRealtime());
                        if (lVar.bJ()) {
                            this.f13120a.a(2);
                        } else {
                            this.f13120a.a(1);
                        }
                    }
                    long j6 = 0;
                    long bH = lVar != null ? lVar.bH() : 0L;
                    int bI = lVar != null ? lVar.bI() : 0;
                    com.anythink.core.common.h.h hVar = this.f13122c.f13556m;
                    if (hVar != null) {
                        if (lVar == null || lVar.bJ()) {
                            j6 = bH;
                        }
                        hVar.e(j6);
                        hVar.f(System.currentTimeMillis());
                        hVar.a(bI);
                    }
                    f fVar = f.this;
                    f.a(fVar, fVar.f13095a, fVar.f13096b, this.f13123d, lVar, this.f13120a, this.f13122c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void b(com.anythink.core.d.l lVar) {
            if (lVar.ba()) {
                return;
            }
            f.this.b();
        }

        @Override // com.anythink.core.d.n.b
        public final void a(AdError adError) {
            String str = j.r.f12541n;
            String str2 = f.this.f13096b;
            String f3 = com.anythink.core.common.v.p.f(this.f13121b);
            String printStackTrace = adError.printStackTrace();
            if (ATSDK.isNetworkLogDebug()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NativeAdvancedJsUtils.f17906p, j.r.f12527E);
                    jSONObject.put("result", str);
                    jSONObject.put(com.anythink.expressad.videocommon.e.b.f22408v, str2);
                    jSONObject.put("adtype", f3);
                    jSONObject.put("errorMsg", printStackTrace);
                    ab.a("anythink_network", jSONObject.toString(), TextUtils.equals(j.r.f12541n, str));
                } catch (Throwable unused) {
                }
            }
            if (adError.getCode().equals(ErrorCode.statuError)) {
                adError = ErrorCode.getErrorCode(ErrorCode.placeStrategyError, adError.getPlatformCode(), adError.getPlatformMSG());
            }
            this.f13120a.L(5);
            f.this.a(true, this.f13120a, adError, this.f13122c);
        }
    }

    public final void b() {
        synchronized (this.f13102h) {
            this.f13102h.clear();
        }
    }

    public final void d() {
        List<bx> list = this.f13102h;
        if (list != null) {
            synchronized (list) {
                try {
                    this.f13102h.size();
                    if (this.f13102h.size() > 0) {
                        this.f13102h.remove(0);
                    }
                    this.f13102h.size();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        this.f13107n = false;
        this.f13108o = 0L;
        this.f13109p = false;
    }

    public final void f() {
        com.anythink.core.d.l b9 = com.anythink.core.d.n.a(this.f13095a).b(this.f13096b);
        if (this.f13107n || b9 == null) {
            return;
        }
        this.f13107n = true;
        this.f13108o = System.currentTimeMillis();
    }

    public final boolean g() {
        g gVar;
        if (this.f13098d) {
            return true;
        }
        return (TextUtils.isEmpty(this.f13099e) || (gVar = this.f13097c.get(this.f13099e)) == null || gVar.c()) ? false : true;
    }

    public final String h() {
        return this.f13099e;
    }

    public final ATAdRequest i() {
        return this.f13110q;
    }

    public final void j() {
        try {
            u.a().a(this.f13096b, com.anythink.core.common.v.p.a(new Throwable().getStackTrace()));
        } catch (Throwable unused) {
        }
    }

    public final g b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f13097c.get(str);
    }

    private void b(Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        boolean z3;
        boolean z6;
        boolean z9;
        bv bvVar;
        List<bv> list;
        bq bqVar;
        ac acVar;
        Map<String, Object> map;
        boolean z10;
        g gVar;
        boolean z11;
        boolean z12;
        ar arVar2 = arVar;
        lVar.A();
        String str3 = str;
        String str4 = str2;
        com.anythink.core.common.u.e.a("1", nVar, str4, str3, "", 0, lVar.aq(), 0L);
        cb cbVar = new cb(arVar2, lVar);
        if (nVar != null) {
            nVar.g(cbVar.e());
            nVar.h(cbVar.f());
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                z6 = true;
            }
        } catch (com.anythink.core.common.h.m e9) {
            e = e9;
            z3 = true;
        }
        try {
            if (lVar.bj()) {
                a(lVar, nVar);
                b(lVar, nVar);
                bp a9 = ae.a(lVar, nVar);
                com.anythink.core.common.h.n c9 = a9.c();
                if (a9.b() == 0) {
                    try {
                        c9.L(5);
                        if (a9.a().D() == 1) {
                            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                        }
                        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = true;
                        a(z6, nVar, th, arVar2);
                        return;
                    }
                }
                if (a9.i()) {
                    boolean k9 = a9.k();
                    ArrayList arrayList = new ArrayList(1);
                    ae.b(a9, arrayList);
                    List<bv> d2 = a9.d();
                    if (d2 != null && !d2.isEmpty()) {
                        ae.a(lVar, a9.c(), d2);
                    }
                    List<bv> a10 = ae.a(a9, a9.d());
                    a.a().b(str3);
                    boolean z13 = arrayList.size() > 0;
                    boolean z14 = !z13 && (a9.e() == null || a9.e().size() == 0);
                    nVar.f(SystemClock.elapsedRealtime());
                    if (z14 && ((a10 == null || a10.size() == 0) && ((a9.f() == null || a9.f().size() == 0) && ((a9.g() == null || a9.g().size() == 0) && (a9.h() == null || a9.h().size() == 0))))) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        nVar.L(6);
                        a(true, nVar, errorCode, arVar2);
                        this.f13098d = false;
                        return;
                    }
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.b(this.f13095a, str3, lVar);
                    Map<String, Object> b9 = u.a().b(this.f13096b);
                    Map<String, bz> map2 = x.a(this.f13095a).f17141a;
                    bz remove = map2 != null ? map2.remove(str3) : null;
                    bq a11 = v.a(this.f13095a).a(str3, str4);
                    ac a12 = d.a().a(str3);
                    ac acVar2 = new ac(str4);
                    boolean z15 = z14;
                    d.a().a(this.f13096b, acVar2);
                    nVar.b(true);
                    nVar.B(cbVar.f());
                    g gVar2 = new g(arVar2.a());
                    gVar2.f13200h = b9;
                    gVar2.i = nVar;
                    gVar2.a(arVar2);
                    gVar2.a(arVar2.f13548d);
                    this.f13099e = str4;
                    this.f13106m = nVar.aB();
                    List<bv> a13 = com.anythink.core.d.u.a(lVar, lVar.Y());
                    if (a13.size() > 0) {
                        z9 = false;
                        bvVar = a13.get(0);
                    } else {
                        z9 = false;
                        bvVar = null;
                    }
                    if (bvVar != null) {
                        for (bv bvVar2 : a9.e()) {
                            g gVar3 = gVar2;
                            if (bvVar2.z().equals(bvVar.z())) {
                                String str5 = str3;
                                String str6 = str4;
                                bqVar = a11;
                                list = a10;
                                acVar = a12;
                                z10 = z15;
                                z11 = k9;
                                z12 = false;
                                c.a a14 = com.anythink.core.common.a.c.a().a(context, str5, str6, bvVar2, lVar, b9, this.f13110q);
                                str3 = str5;
                                str4 = str6;
                                if (a14 != null) {
                                    bv d9 = a14.d();
                                    AdError a15 = ae.a(0, nVar, d9, (z) null);
                                    Objects.toString(a15);
                                    if (a15 != null) {
                                        com.anythink.core.common.a.c.a().a(str3, d9.z());
                                        gVar = gVar3;
                                    } else {
                                        gVar = gVar3;
                                        gVar.J = a14;
                                    }
                                    map = b9;
                                    nVar.d(SystemClock.elapsedRealtime());
                                } else {
                                    map = b9;
                                    gVar = gVar3;
                                }
                            } else {
                                list = a10;
                                bqVar = a11;
                                acVar = a12;
                                map = b9;
                                z10 = z15;
                                gVar = gVar3;
                                z11 = k9;
                                z12 = false;
                            }
                            b9 = map;
                            gVar2 = gVar;
                            a11 = bqVar;
                            a12 = acVar;
                            a10 = list;
                            z9 = z12;
                            k9 = z11;
                            z15 = z10;
                        }
                    }
                    bq bqVar2 = a11;
                    ac acVar3 = a12;
                    boolean z16 = z15;
                    boolean z17 = k9;
                    boolean z18 = z9;
                    List<bv> list2 = a10;
                    g gVar4 = gVar2;
                    com.anythink.core.common.u.c.a(this.f13095a).a(10, nVar);
                    Double[] dArr = new Double[1];
                    Boolean bn = lVar.bn();
                    if (a9.j() || (bn != null && bn.booleanValue())) {
                        com.anythink.core.common.h.c a16 = a.a().a(context, str3);
                        if (a16 != null) {
                            dArr[z18 ? 1 : 0] = Double.valueOf(a16.n());
                        }
                    }
                    a9.j();
                    com.anythink.core.common.w.i iVar = new com.anythink.core.common.w.i(list2);
                    com.anythink.core.common.w.h hVar = new com.anythink.core.common.w.h();
                    hVar.f17116a = str3;
                    hVar.f17117b = str4;
                    hVar.f17118c = cbVar;
                    hVar.f17119d = list2;
                    hVar.f17120e = a9.h();
                    hVar.i = z16;
                    hVar.f17124j = nVar.aE();
                    hVar.f17125k = remove;
                    hVar.f17127m = bqVar2;
                    hVar.f17126l = iVar;
                    hVar.f17129o = acVar3;
                    hVar.f17128n = acVar2;
                    hVar.f17121f = a9.f();
                    hVar.f17122g = a9.g();
                    Double d10 = dArr[z18 ? 1 : 0];
                    hVar.f17123h = d10 != null ? d10.doubleValue() : 0.0d;
                    hVar.f17130p = a9.e();
                    gVar4.a(hVar);
                    this.f13097c.put(str4, gVar4);
                    com.anythink.core.common.h.h hVar2 = arVar2.f13556m;
                    if (hVar2 != null) {
                        hVar2.h(System.currentTimeMillis());
                    }
                    com.anythink.core.common.u.e.a(arVar2.f13556m, nVar);
                    h hVar3 = new h(str3);
                    gVar4.a(hVar3);
                    hVar3.a(lVar, z17);
                    hVar3.a(this.f13104k);
                    hVar3.a(gVar4);
                    this.f13098d = z18;
                    if (!z16) {
                        List<bv> e10 = a9.e();
                        com.anythink.core.common.v.b.b a17 = com.anythink.core.common.v.b.b.a();
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, arVar2, str4, str3, lVar, z13, e10, cbVar, nVar, remove, bqVar2, acVar3, iVar, bn, dArr, z17, hVar3, gVar4);
                        arVar2 = arVar2;
                        a17.b(anonymousClass4);
                    }
                    int i = arVar2.f13547c;
                    if (i == 0 || i == 3) {
                        w.a().a(lVar, 15, arVar2, nVar);
                        return;
                    }
                    return;
                }
                c9.L(6);
                AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                throw new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace());
            }
            nVar.L(5);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (com.anythink.core.common.h.m e11) {
            e = e11;
            z3 = true;
            a(z3, nVar, e, arVar2);
        }
    }

    public final void a(com.anythink.core.common.p.c cVar) {
        this.i = cVar;
    }

    private void a(com.anythink.core.common.p.d dVar) {
        this.f13103j = dVar;
    }

    private static void c(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        if (lVar.bj()) {
            return;
        }
        nVar.L(5);
        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    private List<com.anythink.core.common.h.c> d(Context context) {
        if (a(false, false, (com.anythink.core.common.h.ae) null)) {
            return null;
        }
        return a.a().a(context, this.f13096b, false, false, true, (com.anythink.core.common.h.ae) null);
    }

    public final com.anythink.core.common.p.d a() {
        return this.f13103j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(Context context, String str, String str2) {
        char c9;
        f a9 = u.a().a(str, str2);
        if (a9 != null) {
            return a9;
        }
        synchronized (f.class) {
            if (a9 == null) {
                try {
                    a9 = new f(context, str);
                    int hashCode = str2.hashCode();
                    if (hashCode != 49) {
                        if (hashCode == 51 && str2.equals("3")) {
                            c9 = 1;
                            if (c9 != 0 || c9 == 1) {
                                a9.f13103j = new com.anythink.core.common.p.a(str, str2);
                            }
                            u.a().a(str, str2, a9);
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        a9.f13103j = new com.anythink.core.common.p.a(str, str2);
                        u.a().a(str, str2, a9);
                    } else {
                        if (str2.equals("1")) {
                            c9 = 0;
                            if (c9 != 0) {
                            }
                            a9.f13103j = new com.anythink.core.common.p.a(str, str2);
                            u.a().a(str, str2, a9);
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                        }
                        a9.f13103j = new com.anythink.core.common.p.a(str, str2);
                        u.a().a(str, str2, a9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a9;
    }

    private List<com.anythink.core.common.h.c> c(Context context) {
        return a.a().a(context, this.f13096b, false, false, true, (com.anythink.core.common.h.ae) null);
    }

    public final void c(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.6
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = f.this.f13097c.get(str);
                if (gVar != null) {
                    gVar.g();
                }
            }
        }, 2);
    }

    public static /* synthetic */ void c(f fVar) {
        com.anythink.core.common.p.d dVar = fVar.f13103j;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final void a(bx bxVar, com.anythink.core.d.l lVar) {
        com.anythink.core.d.l a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13096b);
        if (a9 != null) {
            if (lVar == null) {
                return;
            }
            if (!TextUtils.equals(a9.an(), lVar.an()) && !a9.ba()) {
                return;
            }
        }
        synchronized (this.f13102h) {
            this.f13102h.add(bxVar);
        }
    }

    public final void a(String str) {
        this.f13097c.remove(str);
    }

    public final void a(String str, double d2, bv bvVar) {
        g gVar = this.f13097c.get(str);
        if (gVar != null) {
            gVar.a(d2, bvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final Context context, final String str, final String str2, final ar arVar, final com.anythink.core.common.d.a aVar) {
        final long j6;
        final Map<String, Object> b9;
        int i;
        if (!com.anythink.core.common.d.t.b().z()) {
            com.anythink.core.common.d.t.b().f12746c = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (arVar != null) {
            long j9 = arVar.f13557n;
            if (j9 != 0) {
                j6 = j9;
                b9 = u.a().b(str2);
                final int[] iArr = {0};
                if (b9.containsKey(bu.f13759S)) {
                    try {
                        iArr[0] = ((Integer) b9.get(bu.f13759S)).intValue();
                    } catch (Throwable unused) {
                    }
                }
                i = arVar.f13547c;
                if (i != 0 || i == 3) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    u.a().a(str2, stackTrace);
                    if (!TextUtils.equals(str, "4")) {
                        u.a().a(str2, com.anythink.core.common.v.p.a(stackTrace));
                    }
                }
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.1
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x02b3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
                    /* JADX WARN: Removed duplicated region for block: B:161:0x01aa A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        String str3;
                        com.anythink.core.d.l lVar;
                        String str4;
                        boolean z3;
                        com.anythink.core.d.l lVar2;
                        com.anythink.core.common.h.n a9;
                        Map<String, Object> map;
                        int a10;
                        long currentTimeMillis;
                        synchronized (f.this) {
                            try {
                                com.anythink.core.common.d.t.b().b(f.this.f13095a);
                                if (!f.this.g() || arVar.f13547c == 0) {
                                    if (f.a(f.this) || arVar.f13547c != 5) {
                                        if (f.this.n() && arVar.f13547c == 0) {
                                            Log.e("anythink", "PlacementId(" + str2 + ") the load api calls are not allowed in Auto-load mode");
                                            return;
                                        }
                                        f fVar = f.this;
                                        if (fVar.f13101g == null) {
                                            fVar.f13101g = new n();
                                        }
                                        n nVar = f.this.f13101g;
                                        String str5 = str2;
                                        String str6 = str;
                                        nVar.f14768a = str5;
                                        nVar.f14769b = str6;
                                        nVar.a(aVar);
                                        ar arVar2 = arVar;
                                        f fVar2 = f.this;
                                        arVar2.f13549e = fVar2.f13101g;
                                        int i6 = arVar2.f13547c;
                                        if (i6 == 4 || i6 == 5) {
                                            fVar2.f13100f++;
                                        } else {
                                            fVar2.f13100f = 1;
                                        }
                                        f.c(fVar2);
                                        int i9 = arVar.f13547c;
                                        com.anythink.core.common.d.t.b().a(context, true);
                                        if (TextUtils.isEmpty(arVar.f13545a)) {
                                            str3 = com.anythink.core.common.v.p.a(context);
                                            arVar.f13545a = str3;
                                        } else {
                                            str3 = arVar.f13545a;
                                        }
                                        String str7 = str3;
                                        f fVar3 = f.this;
                                        String str8 = arVar.f13545a;
                                        com.anythink.core.common.d.a aVar2 = aVar;
                                        com.anythink.core.common.p.c cVar = fVar3.i;
                                        if (cVar != null) {
                                            cVar.a(str8, aVar2);
                                        }
                                        f.this.f13111r = arVar;
                                        f.this.f13110q = arVar.b();
                                        if (com.anythink.core.common.d.t.b().g() != null && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().p()) && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().q()) && !com.anythink.core.common.v.q.a(str2)) {
                                            Context g4 = com.anythink.core.common.d.t.b().g();
                                            String p9 = com.anythink.core.common.d.t.b().p();
                                            String q8 = com.anythink.core.common.d.t.b().q();
                                            boolean z6 = com.anythink.core.common.d.t.b().z();
                                            ar arVar3 = arVar;
                                            int i10 = arVar3.f13547c;
                                            com.anythink.core.common.h.h hVar = arVar3.f13556m;
                                            if (hVar != null) {
                                                hVar.b(System.currentTimeMillis());
                                            }
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            ar arVar4 = arVar;
                                            if (arVar4.f13557n != 0) {
                                                elapsedRealtime2 = arVar4.f13558o;
                                            }
                                            com.anythink.core.d.n a11 = com.anythink.core.d.n.a(context);
                                            com.anythink.core.d.l a12 = f.a(f.this, z6, b9);
                                            boolean h9 = a11.h(str2);
                                            if (!z6 && a12 == null) {
                                                a12 = i10 == 13 ? a11.d(str2) : i10 == 14 ? a11.e(str2) : a11.c(str2);
                                                com.anythink.core.d.l f3 = a11.f(str2);
                                                if (a12 == null && f3 != null) {
                                                    a12 = f3;
                                                }
                                                if (!com.anythink.core.d.n.a(a12)) {
                                                    lVar = a12;
                                                    str4 = q8;
                                                    z3 = true;
                                                    String unused2 = f.this.f13105l;
                                                    (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                                    long j10 = elapsedRealtime2;
                                                    String str9 = str2;
                                                    int i11 = iArr[0];
                                                    ar arVar5 = arVar;
                                                    lVar2 = lVar;
                                                    int i12 = 2;
                                                    a9 = aj.a(str7, str9, lVar2, i10, i11, arVar5.f13551g, arVar5.i, !h9 ? 1 : 2, arVar5.b());
                                                    a9.j(j6);
                                                    a9.c(j10);
                                                    a9.K(str);
                                                    map = b9;
                                                    if (map != null) {
                                                        a9.b(map);
                                                    }
                                                    if (lVar2 != null) {
                                                        try {
                                                            try {
                                                                f.a(lVar2, a9);
                                                                f.b(lVar2, a9);
                                                            } catch (Throwable th) {
                                                                th.printStackTrace();
                                                            }
                                                        } catch (com.anythink.core.common.h.m e9) {
                                                            f.this.a(true, a9, (Throwable) e9, arVar);
                                                            return;
                                                        }
                                                    }
                                                    if (arVar.d()) {
                                                        int c9 = f.this.c();
                                                        if (c9 > 0 && lVar2 != null) {
                                                            com.anythink.core.common.h.c a13 = a.a().a(context, str2);
                                                            if (a13 != null) {
                                                                String unused3 = f.this.f13105l;
                                                                lVar2.q();
                                                                if (c9 >= lVar2.q()) {
                                                                    a9.b(false);
                                                                    a9.L(4);
                                                                    bv o6 = a13.o();
                                                                    if (o6 != null) {
                                                                        a9.a(o6);
                                                                    }
                                                                    a9.b(1);
                                                                    com.anythink.core.common.u.c.a(g4).a(10, a9);
                                                                    com.anythink.core.common.u.c.a(g4).a(12, a9);
                                                                    f.this.f13098d = false;
                                                                    com.anythink.core.common.d.a aVar3 = aVar;
                                                                    if (aVar3 != null) {
                                                                        aVar3.onAdLoaded();
                                                                        f.this.f13101g.b(aVar);
                                                                    }
                                                                    return;
                                                                }
                                                                com.anythink.core.common.d.a aVar4 = aVar;
                                                                if (aVar4 != null) {
                                                                    aVar4.onAdLoaded();
                                                                    f.this.f13101g.b(aVar);
                                                                }
                                                                String unused4 = f.this.f13105l;
                                                                lVar2.q();
                                                                ar arVar6 = arVar;
                                                                int i13 = arVar6.f13547c;
                                                                arVar6.f13546b = i13;
                                                                a9.D(i13);
                                                                arVar.f13547c = 9;
                                                                a9.C(9);
                                                            } else {
                                                                f.this.b();
                                                            }
                                                        }
                                                    } else {
                                                        f.this.b();
                                                    }
                                                    if (lVar2 != null && f.this.f13107n) {
                                                        currentTimeMillis = System.currentTimeMillis() - f.this.f13108o;
                                                        if (currentTimeMillis > 0 && currentTimeMillis < lVar2.aD()) {
                                                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                            a9.L(7);
                                                            f.this.a(!f.this.f13109p, a9, new com.anythink.core.common.h.m(errorCode, errorCode.printStackTrace()), arVar);
                                                            f.this.f13109p = true;
                                                            return;
                                                        }
                                                    }
                                                    f.h(f.this);
                                                    f.i(f.this);
                                                    f.this.f13109p = false;
                                                    com.anythink.core.a.c.a();
                                                    a10 = com.anythink.core.a.c.a(g4, str);
                                                    if (a10 == -1) {
                                                        String str10 = ErrorCode.loadCappingError;
                                                        if (a10 == 9) {
                                                            str10 = ErrorCode.loadCappingError_Global;
                                                        } else if (a10 == 10) {
                                                            str10 = ErrorCode.loadCappingError_Format;
                                                        }
                                                        AdError errorCode2 = ErrorCode.getErrorCode(str10, "", "");
                                                        a9.L(a10);
                                                        f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace()), arVar);
                                                        return;
                                                    }
                                                    if (lVar2 != null && com.anythink.core.a.c.a().a(g4, str2, lVar2) != -1) {
                                                        AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                                        a9.L(a10);
                                                        f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode3, errorCode3.printStackTrace()), arVar);
                                                        return;
                                                    }
                                                    if (f.this.g()) {
                                                        Log.i("anythink", "Placement(" + str2 + ") is loading.");
                                                        e.a(arVar.f13551g, e.f12884c, str2, f.this.f13106m, f.this.f13099e);
                                                        return;
                                                    }
                                                    a11.g(str2);
                                                    f fVar4 = f.this;
                                                    fVar4.f13098d = true;
                                                    Iterator<g> it = fVar4.f13097c.values().iterator();
                                                    while (it.hasNext()) {
                                                        it.next().f();
                                                    }
                                                    if (!z6 && (lVar2 == null || lVar2.aR() || h9)) {
                                                        i12 = 3;
                                                    }
                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                    arVar.f13556m.c(currentTimeMillis2);
                                                    arVar.f13556m.d(currentTimeMillis2);
                                                    f.a(f.this, context, p9, str4, lVar2, arVar, a9, str, str7, i12, z3);
                                                    return;
                                                }
                                            }
                                            lVar = a12;
                                            str4 = q8;
                                            z3 = false;
                                            String unused22 = f.this.f13105l;
                                            (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                            long j102 = elapsedRealtime2;
                                            String str92 = str2;
                                            int i112 = iArr[0];
                                            ar arVar52 = arVar;
                                            lVar2 = lVar;
                                            int i122 = 2;
                                            a9 = aj.a(str7, str92, lVar2, i10, i112, arVar52.f13551g, arVar52.i, !h9 ? 1 : 2, arVar52.b());
                                            a9.j(j6);
                                            a9.c(j102);
                                            a9.K(str);
                                            map = b9;
                                            if (map != null) {
                                            }
                                            if (lVar2 != null) {
                                            }
                                            if (arVar.d()) {
                                            }
                                            if (lVar2 != null) {
                                                currentTimeMillis = System.currentTimeMillis() - f.this.f13108o;
                                                if (currentTimeMillis > 0) {
                                                    AdError errorCode4 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                    a9.L(7);
                                                    f.this.a(!f.this.f13109p, a9, new com.anythink.core.common.h.m(errorCode4, errorCode4.printStackTrace()), arVar);
                                                    f.this.f13109p = true;
                                                    return;
                                                }
                                            }
                                            f.h(f.this);
                                            f.i(f.this);
                                            f.this.f13109p = false;
                                            com.anythink.core.a.c.a();
                                            a10 = com.anythink.core.a.c.a(g4, str);
                                            if (a10 == -1) {
                                            }
                                        }
                                        f.this.a(arVar, ErrorCode.getErrorCode(ErrorCode.appIdOrPlaceIdEmpty, "", ""));
                                        if (com.anythink.core.common.d.t.b().F()) {
                                            Log.e("anythink", "Please check these params in your code (AppId: " + com.anythink.core.common.d.t.b().p() + ", AppKey: " + com.anythink.core.common.d.t.b().q() + ", PlacementId: " + str2 + ")");
                                        }
                                        f.this.f13098d = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }, 2);
            }
        }
        j6 = elapsedRealtime;
        b9 = u.a().b(str2);
        final int[] iArr2 = {0};
        if (b9.containsKey(bu.f13759S)) {
        }
        i = arVar.f13547c;
        if (i != 0) {
        }
        StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
        u.a().a(str2, stackTrace2);
        if (!TextUtils.equals(str, "4")) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.1
            /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x02b3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:150:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x01aa A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01f9 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str3;
                com.anythink.core.d.l lVar;
                String str4;
                boolean z3;
                com.anythink.core.d.l lVar2;
                com.anythink.core.common.h.n a9;
                Map<String, Object> map;
                int a10;
                long currentTimeMillis;
                synchronized (f.this) {
                    try {
                        com.anythink.core.common.d.t.b().b(f.this.f13095a);
                        if (!f.this.g() || arVar.f13547c == 0) {
                            if (f.a(f.this) || arVar.f13547c != 5) {
                                if (f.this.n() && arVar.f13547c == 0) {
                                    Log.e("anythink", "PlacementId(" + str2 + ") the load api calls are not allowed in Auto-load mode");
                                    return;
                                }
                                f fVar = f.this;
                                if (fVar.f13101g == null) {
                                    fVar.f13101g = new n();
                                }
                                n nVar = f.this.f13101g;
                                String str5 = str2;
                                String str6 = str;
                                nVar.f14768a = str5;
                                nVar.f14769b = str6;
                                nVar.a(aVar);
                                ar arVar2 = arVar;
                                f fVar2 = f.this;
                                arVar2.f13549e = fVar2.f13101g;
                                int i6 = arVar2.f13547c;
                                if (i6 == 4 || i6 == 5) {
                                    fVar2.f13100f++;
                                } else {
                                    fVar2.f13100f = 1;
                                }
                                f.c(fVar2);
                                int i9 = arVar.f13547c;
                                com.anythink.core.common.d.t.b().a(context, true);
                                if (TextUtils.isEmpty(arVar.f13545a)) {
                                    str3 = com.anythink.core.common.v.p.a(context);
                                    arVar.f13545a = str3;
                                } else {
                                    str3 = arVar.f13545a;
                                }
                                String str7 = str3;
                                f fVar3 = f.this;
                                String str8 = arVar.f13545a;
                                com.anythink.core.common.d.a aVar2 = aVar;
                                com.anythink.core.common.p.c cVar = fVar3.i;
                                if (cVar != null) {
                                    cVar.a(str8, aVar2);
                                }
                                f.this.f13111r = arVar;
                                f.this.f13110q = arVar.b();
                                if (com.anythink.core.common.d.t.b().g() != null && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().p()) && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().q()) && !com.anythink.core.common.v.q.a(str2)) {
                                    Context g4 = com.anythink.core.common.d.t.b().g();
                                    String p9 = com.anythink.core.common.d.t.b().p();
                                    String q8 = com.anythink.core.common.d.t.b().q();
                                    boolean z6 = com.anythink.core.common.d.t.b().z();
                                    ar arVar3 = arVar;
                                    int i10 = arVar3.f13547c;
                                    com.anythink.core.common.h.h hVar = arVar3.f13556m;
                                    if (hVar != null) {
                                        hVar.b(System.currentTimeMillis());
                                    }
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    ar arVar4 = arVar;
                                    if (arVar4.f13557n != 0) {
                                        elapsedRealtime2 = arVar4.f13558o;
                                    }
                                    com.anythink.core.d.n a11 = com.anythink.core.d.n.a(context);
                                    com.anythink.core.d.l a12 = f.a(f.this, z6, b9);
                                    boolean h9 = a11.h(str2);
                                    if (!z6 && a12 == null) {
                                        a12 = i10 == 13 ? a11.d(str2) : i10 == 14 ? a11.e(str2) : a11.c(str2);
                                        com.anythink.core.d.l f3 = a11.f(str2);
                                        if (a12 == null && f3 != null) {
                                            a12 = f3;
                                        }
                                        if (!com.anythink.core.d.n.a(a12)) {
                                            lVar = a12;
                                            str4 = q8;
                                            z3 = true;
                                            String unused22 = f.this.f13105l;
                                            (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                            long j102 = elapsedRealtime2;
                                            String str92 = str2;
                                            int i112 = iArr2[0];
                                            ar arVar52 = arVar;
                                            lVar2 = lVar;
                                            int i122 = 2;
                                            a9 = aj.a(str7, str92, lVar2, i10, i112, arVar52.f13551g, arVar52.i, !h9 ? 1 : 2, arVar52.b());
                                            a9.j(j6);
                                            a9.c(j102);
                                            a9.K(str);
                                            map = b9;
                                            if (map != null) {
                                                a9.b(map);
                                            }
                                            if (lVar2 != null) {
                                                try {
                                                    try {
                                                        f.a(lVar2, a9);
                                                        f.b(lVar2, a9);
                                                    } catch (Throwable th) {
                                                        th.printStackTrace();
                                                    }
                                                } catch (com.anythink.core.common.h.m e9) {
                                                    f.this.a(true, a9, (Throwable) e9, arVar);
                                                    return;
                                                }
                                            }
                                            if (arVar.d()) {
                                                int c9 = f.this.c();
                                                if (c9 > 0 && lVar2 != null) {
                                                    com.anythink.core.common.h.c a13 = a.a().a(context, str2);
                                                    if (a13 != null) {
                                                        String unused3 = f.this.f13105l;
                                                        lVar2.q();
                                                        if (c9 >= lVar2.q()) {
                                                            a9.b(false);
                                                            a9.L(4);
                                                            bv o6 = a13.o();
                                                            if (o6 != null) {
                                                                a9.a(o6);
                                                            }
                                                            a9.b(1);
                                                            com.anythink.core.common.u.c.a(g4).a(10, a9);
                                                            com.anythink.core.common.u.c.a(g4).a(12, a9);
                                                            f.this.f13098d = false;
                                                            com.anythink.core.common.d.a aVar3 = aVar;
                                                            if (aVar3 != null) {
                                                                aVar3.onAdLoaded();
                                                                f.this.f13101g.b(aVar);
                                                            }
                                                            return;
                                                        }
                                                        com.anythink.core.common.d.a aVar4 = aVar;
                                                        if (aVar4 != null) {
                                                            aVar4.onAdLoaded();
                                                            f.this.f13101g.b(aVar);
                                                        }
                                                        String unused4 = f.this.f13105l;
                                                        lVar2.q();
                                                        ar arVar6 = arVar;
                                                        int i13 = arVar6.f13547c;
                                                        arVar6.f13546b = i13;
                                                        a9.D(i13);
                                                        arVar.f13547c = 9;
                                                        a9.C(9);
                                                    } else {
                                                        f.this.b();
                                                    }
                                                }
                                            } else {
                                                f.this.b();
                                            }
                                            if (lVar2 != null && f.this.f13107n) {
                                                currentTimeMillis = System.currentTimeMillis() - f.this.f13108o;
                                                if (currentTimeMillis > 0 && currentTimeMillis < lVar2.aD()) {
                                                    AdError errorCode4 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                    a9.L(7);
                                                    f.this.a(!f.this.f13109p, a9, new com.anythink.core.common.h.m(errorCode4, errorCode4.printStackTrace()), arVar);
                                                    f.this.f13109p = true;
                                                    return;
                                                }
                                            }
                                            f.h(f.this);
                                            f.i(f.this);
                                            f.this.f13109p = false;
                                            com.anythink.core.a.c.a();
                                            a10 = com.anythink.core.a.c.a(g4, str);
                                            if (a10 == -1) {
                                                String str10 = ErrorCode.loadCappingError;
                                                if (a10 == 9) {
                                                    str10 = ErrorCode.loadCappingError_Global;
                                                } else if (a10 == 10) {
                                                    str10 = ErrorCode.loadCappingError_Format;
                                                }
                                                AdError errorCode2 = ErrorCode.getErrorCode(str10, "", "");
                                                a9.L(a10);
                                                f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace()), arVar);
                                                return;
                                            }
                                            if (lVar2 != null && com.anythink.core.a.c.a().a(g4, str2, lVar2) != -1) {
                                                AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                                a9.L(a10);
                                                f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode3, errorCode3.printStackTrace()), arVar);
                                                return;
                                            }
                                            if (f.this.g()) {
                                                Log.i("anythink", "Placement(" + str2 + ") is loading.");
                                                e.a(arVar.f13551g, e.f12884c, str2, f.this.f13106m, f.this.f13099e);
                                                return;
                                            }
                                            a11.g(str2);
                                            f fVar4 = f.this;
                                            fVar4.f13098d = true;
                                            Iterator<g> it = fVar4.f13097c.values().iterator();
                                            while (it.hasNext()) {
                                                it.next().f();
                                            }
                                            if (!z6 && (lVar2 == null || lVar2.aR() || h9)) {
                                                i122 = 3;
                                            }
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            arVar.f13556m.c(currentTimeMillis2);
                                            arVar.f13556m.d(currentTimeMillis2);
                                            f.a(f.this, context, p9, str4, lVar2, arVar, a9, str, str7, i122, z3);
                                            return;
                                        }
                                    }
                                    lVar = a12;
                                    str4 = q8;
                                    z3 = false;
                                    String unused222 = f.this.f13105l;
                                    (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                    long j1022 = elapsedRealtime2;
                                    String str922 = str2;
                                    int i1122 = iArr2[0];
                                    ar arVar522 = arVar;
                                    lVar2 = lVar;
                                    int i1222 = 2;
                                    a9 = aj.a(str7, str922, lVar2, i10, i1122, arVar522.f13551g, arVar522.i, !h9 ? 1 : 2, arVar522.b());
                                    a9.j(j6);
                                    a9.c(j1022);
                                    a9.K(str);
                                    map = b9;
                                    if (map != null) {
                                    }
                                    if (lVar2 != null) {
                                    }
                                    if (arVar.d()) {
                                    }
                                    if (lVar2 != null) {
                                        currentTimeMillis = System.currentTimeMillis() - f.this.f13108o;
                                        if (currentTimeMillis > 0) {
                                            AdError errorCode42 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                            a9.L(7);
                                            f.this.a(!f.this.f13109p, a9, new com.anythink.core.common.h.m(errorCode42, errorCode42.printStackTrace()), arVar);
                                            f.this.f13109p = true;
                                            return;
                                        }
                                    }
                                    f.h(f.this);
                                    f.i(f.this);
                                    f.this.f13109p = false;
                                    com.anythink.core.a.c.a();
                                    a10 = com.anythink.core.a.c.a(g4, str);
                                    if (a10 == -1) {
                                    }
                                }
                                f.this.a(arVar, ErrorCode.getErrorCode(ErrorCode.appIdOrPlaceIdEmpty, "", ""));
                                if (com.anythink.core.common.d.t.b().F()) {
                                    Log.e("anythink", "Please check these params in your code (AppId: " + com.anythink.core.common.d.t.b().p() + ", AppKey: " + com.anythink.core.common.d.t.b().q() + ", PlacementId: " + str2 + ")");
                                }
                                f.this.f13098d = false;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }, 2);
    }

    private void a(Context context, String str, String str2, com.anythink.core.d.l lVar, ar arVar, com.anythink.core.common.h.n nVar, String str3, String str4, int i, boolean z3) {
        com.anythink.core.d.n.a(context).a(lVar, str, str2, this.f13096b, arVar.f13551g, new AnonymousClass2(nVar, str3, arVar, str4), i, z3, arVar.b());
    }

    private void a(Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        if (nVar != null) {
            nVar.e(SystemClock.elapsedRealtime());
        }
        com.anythink.core.common.w.b.h hVar = new com.anythink.core.common.w.b.h(context, str, lVar, new AnonymousClass3(arVar, context, str, str2, lVar, nVar));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.anythink.core.common.w.b.e());
        new com.anythink.core.common.w.b.g(arrayList, hVar, 0).a(hVar);
    }

    private static void a(bp bpVar) {
        com.anythink.core.common.h.n c9 = bpVar.c();
        if (bpVar.b() == 0) {
            c9.L(5);
            if (bpVar.a().D() == 1) {
                throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
            }
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
        }
        if (bpVar.i()) {
            return;
        }
        c9.L(6);
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new com.anythink.core.common.h.m(errorCode, errorCode.printStackTrace());
    }

    public static void a(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        int a9 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(lVar, nVar.aI());
        if (a9 != -1) {
            String str = ErrorCode.outOfCapError;
            if (a9 != 2) {
                switch (a9) {
                    case 7:
                        str = ErrorCode.outOfCapError_day_Global;
                        break;
                    case 8:
                        str = ErrorCode.outOfCapError_day_Format;
                        break;
                    case 9:
                        str = ErrorCode.outOfCapError_hour_Global;
                        break;
                    case 10:
                        str = ErrorCode.outOfCapError_hour_Format;
                        break;
                }
            }
            nVar.L(1);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(str, "", ""), "Capping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z3, com.anythink.core.common.h.n nVar, Throwable th, ar arVar) {
        AdError errorCode;
        if (th instanceof com.anythink.core.common.h.m) {
            errorCode = ((com.anythink.core.common.h.m) th).f13988a;
        } else {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage());
        }
        a(z3, nVar, errorCode, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z3, com.anythink.core.common.h.n nVar, AdError adError, ar arVar) {
        this.f13098d = false;
        nVar.b(false);
        if (z3) {
            com.anythink.core.common.u.c.a(this.f13095a).a(10, nVar);
            com.anythink.core.common.u.e.a(nVar, adError);
        }
        a(arVar, adError);
    }

    public final void a(com.anythink.core.common.h.c cVar) {
        List<bx> list;
        if (cVar == null || (list = this.f13102h) == null) {
            return;
        }
        synchronized (list) {
            try {
                if (this.f13102h.size() > 0) {
                    this.f13102h.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        boolean g4 = g();
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        aeVar.a(map);
        aeVar.a(this.f13110q);
        com.anythink.core.common.h.c b9 = b(context, true, false, aeVar);
        ATAdStatusInfo aTAdStatusInfo = new ATAdStatusInfo(g4, b9 != null, b9 != null ? b9.p() : null);
        if (this.f13103j != null && System.currentTimeMillis() - this.f13108o > com.anythink.basead.exoplayer.i.a.f7883f && a(aTAdStatusInfo, 5) && (c() <= 0 || !aTAdStatusInfo.isReady())) {
            com.anythink.core.common.p.d dVar = this.f13103j;
            dVar.a(context, ((com.anythink.core.common.p.a) dVar).a(), 5);
        }
        return aTAdStatusInfo;
    }

    public final List<ATAdInfo> a(Context context, com.anythink.core.common.h.ae aeVar) {
        List<com.anythink.core.common.h.c> d2 = d(context);
        if (d2 == null || d2.size() <= 0) {
            return null;
        }
        return a(aeVar, d2);
    }

    private static List<ATAdInfo> a(com.anythink.core.common.h.ae aeVar, List<com.anythink.core.common.h.c> list) {
        com.anythink.core.common.h.n detail;
        com.anythink.core.common.h.n trackingInfo;
        ArrayList arrayList = new ArrayList(3);
        if (list != null && list.size() > 0) {
            Iterator<com.anythink.core.common.h.c> it = list.iterator();
            com.anythink.core.common.h.d dVar = null;
            while (it.hasNext()) {
                com.anythink.core.common.h.c next = it.next();
                if (aeVar != null) {
                    dVar = aeVar.b();
                }
                BaseAd f3 = next != null ? next.f() : null;
                ATBaseAdAdapter e9 = next != null ? next.e() : null;
                if (f3 != null) {
                    if (dVar != null && (detail = f3.getDetail()) != null) {
                        detail.a(dVar);
                    }
                    arrayList.add(com.anythink.core.common.d.l.a(f3, e9, 4));
                } else if (e9 != null) {
                    if (dVar != null && (trackingInfo = e9.getTrackingInfo()) != null) {
                        trackingInfo.a(dVar);
                    }
                    arrayList.add(com.anythink.core.common.d.l.a(e9, 4));
                }
            }
        }
        return arrayList;
    }

    public final com.anythink.core.common.h.c a(Context context, boolean z3, boolean z6, com.anythink.core.common.h.ae aeVar) {
        if (a(z6, z3, aeVar)) {
            return null;
        }
        return a.a().a(context, this.f13096b, z3, z6, aeVar);
    }

    private boolean a(boolean z3, boolean z6, com.anythink.core.common.h.ae aeVar) {
        Map<String, Object> a9 = aeVar != null ? aeVar.a() : null;
        com.anythink.core.common.h.d b9 = aeVar != null ? aeVar.b() : null;
        com.anythink.core.d.l a10 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13096b);
        String str = TextUtils.isEmpty(this.f13099e) ? "" : this.f13099e;
        if (a10 == null) {
            a10 = com.anythink.core.d.n.a(this.f13095a).a(this.f13096b);
        }
        com.anythink.core.d.l lVar = a10;
        if (lVar == null) {
            if (z3) {
                com.anythink.core.common.u.e.a(str, this.f13096b, lVar, 4, "", a9, aeVar);
            } else if (z6) {
                com.anythink.core.common.u.e.a(str, this.f13096b, false, 4, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
            }
            return true;
        }
        com.anythink.core.a.d.a();
        int a11 = com.anythink.core.a.d.a(this.f13096b, lVar);
        if (a11 != -1) {
            if (z3) {
                com.anythink.core.common.u.e.a(str, this.f13096b, lVar, a11, "", a9, aeVar);
            } else if (z6) {
                com.anythink.core.common.u.e.a(str, this.f13096b, false, a11, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
            }
            return true;
        }
        int a12 = com.anythink.core.a.a.a(this.f13095a).a(lVar, this.f13096b);
        if (a12 == -1) {
            return false;
        }
        if (z3) {
            com.anythink.core.common.u.e.a(str, this.f13096b, lVar, a12, "", a9, aeVar);
        } else if (z6) {
            com.anythink.core.common.u.e.a(str, this.f13096b, false, a12, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
        }
        return true;
    }

    public static void b(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        com.anythink.core.a.d.a();
        int a9 = com.anythink.core.a.d.a(nVar.aI(), lVar);
        if (a9 != -1) {
            nVar.L(2);
            String str = ErrorCode.inPacingError;
            if (a9 != 3) {
                if (a9 == 11) {
                    str = ErrorCode.inPacingError_Global;
                } else if (a9 == 12) {
                    str = ErrorCode.inPacingError_Format;
                }
            }
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(str, "", ""), "Pacing.");
        }
    }

    public final void b(Context context, String str, String str2, ar arVar, com.anythink.core.common.d.a aVar) {
        String str3;
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13096b);
            if (a9 != null && w.a().a(this.f13096b)) {
                Log.w("anythink", "Forbidden placement");
                if (aVar != null) {
                    aVar.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.sharedPlacementIdError, "", ""));
                    return;
                }
                return;
            }
            if (w.a().a(a9)) {
                String u3 = a9.u();
                com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
                a(dVar, str2, a9);
                arVar.i = dVar;
                com.anythink.core.common.d.a[] aVarArr = {aVar};
                if (a9.y() == 1) {
                    com.anythink.core.common.h.c b9 = b(context, u3, str, arVar);
                    if (b9 != null) {
                        String str4 = "";
                        str3 = u3;
                        String a10 = com.anythink.core.common.v.p.a(context);
                        arVar.f13545a = a10;
                        ab.a("Shared", "placementId:" + str2 + ";result_callback:success;");
                        com.anythink.core.common.h.n i = b9.i();
                        if (i != null) {
                            str4 = i.aJ();
                        }
                        com.anythink.core.common.u.e.a(str2, str3, i, str, a10, a9, true, "1", "2", str4);
                        com.anythink.core.common.d.a aVar2 = aVarArr[0];
                        if (aVar2 != null) {
                            aVar2.onAdLoaded();
                        }
                        aVarArr[0] = null;
                    } else {
                        str3 = u3;
                        w.a().b(str3, arVar.b());
                    }
                    a(context, str, str2, arVar, new AnonymousClass7(aVarArr, str2, str3, str, arVar, a9));
                    return;
                }
                a(context, str, str2, arVar, new AnonymousClass8(str2, u3, str, arVar, a9, aVarArr, context));
                return;
            }
        }
        a(context, str, str2, arVar, aVar);
    }

    private void a(String str, com.anythink.core.common.d.a aVar) {
        com.anythink.core.common.p.c cVar = this.i;
        if (cVar != null) {
            cVar.a(str, aVar);
        }
    }

    public final void a(ar arVar, AdError adError) {
        n nVar = this.f13101g;
        if (nVar != null) {
            nVar.a(1, arVar, (cb) null, adError);
        }
    }

    public final boolean a(ATAdStatusInfo aTAdStatusInfo, int i) {
        com.anythink.core.d.l a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13096b);
        if ((a9 != null && c() >= a9.q() && aTAdStatusInfo != null && aTAdStatusInfo.isReady()) || ATAdxSetting.getInstance().isAdxNetworkMode(this.f13096b)) {
            return false;
        }
        if (i == 6 || i == 18) {
            int g4 = a9.g();
            if (g4 != -1) {
                if (g4 == 1) {
                    return false;
                }
                if (i == 6 && g4 == 2) {
                    return true;
                }
                return i == 18 && g4 == 3;
            }
            if (i == 18) {
                return false;
            }
        }
        if (!n()) {
            return a9 != null && a9.ao() == 1;
        }
        if (a(i, a9 != null ? a9.bz() : null)) {
            return true;
        }
        return a9 != null && a9.ao() == 1 && (i == 5 || i == 6 || i == 7);
    }

    private boolean a(int i, List<String> list) {
        com.anythink.core.common.p.d dVar = this.f13103j;
        if (dVar != null) {
            return dVar.a(i, list);
        }
        return true;
    }

    public final void a(AdError adError) {
        com.anythink.core.common.p.d dVar = this.f13103j;
        if (dVar != null) {
            dVar.a(adError, this.f13100f, a((ATAdStatusInfo) null, 4));
        }
    }

    private static String a(com.anythink.core.common.h.x xVar) {
        return xVar.f14156b + xVar.f14157c + xVar.f14160f + System.currentTimeMillis();
    }

    public static String a(String str, String str2, String str3) {
        return str + str2 + str3 + System.currentTimeMillis();
    }

    public final List<ATAdInfo> a(Context context) {
        List<com.anythink.core.common.h.c> list = null;
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13096b);
            if (a9 != null && w.a().a(this.f13096b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (w.a().a(a9)) {
                String u3 = a9.u();
                w.a();
                f a10 = w.a(u3, String.valueOf(a9.aq()));
                com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
                com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
                if (a10 != null) {
                    a(dVar, this.f13096b, a9);
                    aeVar.a(dVar);
                    aeVar.a(a10.f13110q);
                    list = a10.d(context);
                }
                List<com.anythink.core.common.h.c> d2 = d(context);
                if (list == null) {
                    return a(aeVar, d2);
                }
                if (d2 != null && d2.size() != 0) {
                    d2.addAll(list);
                    Collections.sort(d2, new AnonymousClass9());
                    return a(aeVar, d2);
                }
                return a(aeVar, list);
            }
        }
        return a(context, (com.anythink.core.common.h.ae) null);
    }

    public final com.anythink.core.common.h.c b(Context context, boolean z3, boolean z6, com.anythink.core.common.h.ae aeVar) {
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13096b);
            if (a9 != null && w.a().a(this.f13096b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (a9 != null && w.a().a(a9)) {
                return a(context, z3, z6, aeVar, this, a9);
            }
        }
        return a(context, z3, z6, aeVar);
    }

    public final List<com.anythink.core.common.h.c> b(Context context) {
        com.anythink.core.d.l a9;
        List<com.anythink.core.common.h.c> c9;
        try {
            List<com.anythink.core.common.h.c> c10 = c(context);
            ArrayList arrayList = new ArrayList();
            if (c10 != null) {
                c10.size();
                arrayList.addAll(c10);
            }
            if (w.a().b() && (a9 = com.anythink.core.d.n.a(context).a(this.f13096b)) != null && w.a().a(a9)) {
                String u3 = a9.u();
                int aq = a9.aq();
                w.a();
                f a10 = w.a(u3, String.valueOf(aq));
                if (a10 != null && (c9 = a10.c(context)) != null && !c9.isEmpty()) {
                    c9.size();
                    arrayList.addAll(c9);
                }
            }
            return arrayList;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private void a(Context context, String str, String str2, ar arVar, com.anythink.core.common.d.a aVar, f fVar, com.anythink.core.d.l lVar) {
        String str3;
        String u3 = lVar.u();
        com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
        a(dVar, str2, lVar);
        arVar.i = dVar;
        com.anythink.core.common.d.a[] aVarArr = {aVar};
        if (lVar.y() == 1) {
            com.anythink.core.common.h.c b9 = b(context, u3, str, arVar);
            if (b9 != null) {
                String a9 = com.anythink.core.common.v.p.a(context);
                arVar.f13545a = a9;
                ab.a("Shared", "placementId:" + str2 + ";result_callback:success;");
                com.anythink.core.common.h.n i = b9.i();
                if (i != null) {
                    str3 = i.aJ();
                } else {
                    str3 = "";
                }
                com.anythink.core.common.u.e.a(str2, u3, i, str, a9, lVar, true, "1", "2", str3);
                com.anythink.core.common.d.a aVar2 = aVarArr[0];
                if (aVar2 != null) {
                    aVar2.onAdLoaded();
                }
                aVarArr[0] = null;
            } else {
                w.a().b(u3, arVar.b());
            }
            fVar.a(context, str, str2, arVar, new AnonymousClass7(aVarArr, str2, u3, str, arVar, lVar));
            return;
        }
        fVar.a(context, str, str2, arVar, new AnonymousClass8(str2, u3, str, arVar, lVar, aVarArr, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.anythink.core.common.h.c b(Context context, String str, String str2, ar arVar) {
        w.a();
        f a9 = w.a(str, str2);
        if (a9 == null) {
            return null;
        }
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        aeVar.a(arVar.f13551g);
        aeVar.a(arVar.i);
        aeVar.a(arVar.b());
        return a9.a(context, true, false, aeVar);
    }

    public static /* synthetic */ void b(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        boolean z3;
        boolean z6;
        boolean z9;
        bv bvVar;
        List<bv> list;
        bq bqVar;
        ac acVar;
        Map<String, Object> map;
        boolean z10;
        g gVar;
        boolean z11;
        boolean z12;
        ar arVar2 = arVar;
        lVar.A();
        String str3 = str;
        String str4 = str2;
        com.anythink.core.common.u.e.a("1", nVar, str4, str3, "", 0, lVar.aq(), 0L);
        cb cbVar = new cb(arVar2, lVar);
        if (nVar != null) {
            nVar.g(cbVar.e());
            nVar.h(cbVar.f());
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                z6 = true;
            }
        } catch (com.anythink.core.common.h.m e9) {
            e = e9;
            z3 = true;
        }
        try {
            if (lVar.bj()) {
                a(lVar, nVar);
                b(lVar, nVar);
                bp a9 = ae.a(lVar, nVar);
                com.anythink.core.common.h.n c9 = a9.c();
                if (a9.b() == 0) {
                    try {
                        c9.L(5);
                        if (a9.a().D() == 1) {
                            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                        }
                        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = true;
                        fVar.a(z6, nVar, th, arVar2);
                        return;
                    }
                }
                if (a9.i()) {
                    boolean k9 = a9.k();
                    ArrayList arrayList = new ArrayList(1);
                    ae.b(a9, arrayList);
                    List<bv> d2 = a9.d();
                    if (d2 != null && !d2.isEmpty()) {
                        ae.a(lVar, a9.c(), d2);
                    }
                    List<bv> a10 = ae.a(a9, a9.d());
                    a.a().b(str3);
                    boolean z13 = arrayList.size() > 0;
                    boolean z14 = !z13 && (a9.e() == null || a9.e().size() == 0);
                    nVar.f(SystemClock.elapsedRealtime());
                    if (z14 && ((a10 == null || a10.size() == 0) && ((a9.f() == null || a9.f().size() == 0) && ((a9.g() == null || a9.g().size() == 0) && (a9.h() == null || a9.h().size() == 0))))) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        nVar.L(6);
                        fVar.a(true, nVar, errorCode, arVar2);
                        fVar.f13098d = false;
                        return;
                    }
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.b(fVar.f13095a, str3, lVar);
                    Map<String, Object> b9 = u.a().b(fVar.f13096b);
                    Map<String, bz> map2 = x.a(fVar.f13095a).f17141a;
                    bz remove = map2 != null ? map2.remove(str3) : null;
                    bq a11 = v.a(fVar.f13095a).a(str3, str4);
                    ac a12 = d.a().a(str3);
                    ac acVar2 = new ac(str4);
                    boolean z15 = z14;
                    d.a().a(fVar.f13096b, acVar2);
                    nVar.b(true);
                    nVar.B(cbVar.f());
                    g gVar2 = new g(arVar2.a());
                    gVar2.f13200h = b9;
                    gVar2.i = nVar;
                    gVar2.a(arVar2);
                    gVar2.a(arVar2.f13548d);
                    fVar.f13099e = str4;
                    fVar.f13106m = nVar.aB();
                    List<bv> a13 = com.anythink.core.d.u.a(lVar, lVar.Y());
                    if (a13.size() > 0) {
                        z9 = false;
                        bvVar = a13.get(0);
                    } else {
                        z9 = false;
                        bvVar = null;
                    }
                    if (bvVar != null) {
                        for (bv bvVar2 : a9.e()) {
                            g gVar3 = gVar2;
                            if (bvVar2.z().equals(bvVar.z())) {
                                String str5 = str3;
                                String str6 = str4;
                                bqVar = a11;
                                list = a10;
                                acVar = a12;
                                z10 = z15;
                                z11 = k9;
                                z12 = false;
                                c.a a14 = com.anythink.core.common.a.c.a().a(context, str5, str6, bvVar2, lVar, b9, fVar.f13110q);
                                str3 = str5;
                                str4 = str6;
                                if (a14 != null) {
                                    bv d9 = a14.d();
                                    AdError a15 = ae.a(0, nVar, d9, (z) null);
                                    Objects.toString(a15);
                                    if (a15 != null) {
                                        com.anythink.core.common.a.c.a().a(str3, d9.z());
                                        gVar = gVar3;
                                    } else {
                                        gVar = gVar3;
                                        gVar.J = a14;
                                    }
                                    map = b9;
                                    nVar.d(SystemClock.elapsedRealtime());
                                } else {
                                    map = b9;
                                    gVar = gVar3;
                                }
                            } else {
                                list = a10;
                                bqVar = a11;
                                acVar = a12;
                                map = b9;
                                z10 = z15;
                                gVar = gVar3;
                                z11 = k9;
                                z12 = false;
                            }
                            b9 = map;
                            gVar2 = gVar;
                            a11 = bqVar;
                            a12 = acVar;
                            a10 = list;
                            z9 = z12;
                            k9 = z11;
                            z15 = z10;
                        }
                    }
                    bq bqVar2 = a11;
                    ac acVar3 = a12;
                    boolean z16 = z15;
                    boolean z17 = k9;
                    boolean z18 = z9;
                    List<bv> list2 = a10;
                    g gVar4 = gVar2;
                    com.anythink.core.common.u.c.a(fVar.f13095a).a(10, nVar);
                    Double[] dArr = new Double[1];
                    Boolean bn = lVar.bn();
                    if (a9.j() || (bn != null && bn.booleanValue())) {
                        com.anythink.core.common.h.c a16 = a.a().a(context, str3);
                        if (a16 != null) {
                            dArr[z18 ? 1 : 0] = Double.valueOf(a16.n());
                        }
                    }
                    a9.j();
                    com.anythink.core.common.w.i iVar = new com.anythink.core.common.w.i(list2);
                    com.anythink.core.common.w.h hVar = new com.anythink.core.common.w.h();
                    hVar.f17116a = str3;
                    hVar.f17117b = str4;
                    hVar.f17118c = cbVar;
                    hVar.f17119d = list2;
                    hVar.f17120e = a9.h();
                    hVar.i = z16;
                    hVar.f17124j = nVar.aE();
                    hVar.f17125k = remove;
                    hVar.f17127m = bqVar2;
                    hVar.f17126l = iVar;
                    hVar.f17129o = acVar3;
                    hVar.f17128n = acVar2;
                    hVar.f17121f = a9.f();
                    hVar.f17122g = a9.g();
                    Double d10 = dArr[z18 ? 1 : 0];
                    hVar.f17123h = d10 != null ? d10.doubleValue() : 0.0d;
                    hVar.f17130p = a9.e();
                    gVar4.a(hVar);
                    fVar.f13097c.put(str4, gVar4);
                    com.anythink.core.common.h.h hVar2 = arVar2.f13556m;
                    if (hVar2 != null) {
                        hVar2.h(System.currentTimeMillis());
                    }
                    com.anythink.core.common.u.e.a(arVar2.f13556m, nVar);
                    h hVar3 = new h(str3);
                    gVar4.a(hVar3);
                    hVar3.a(lVar, z17);
                    hVar3.a(fVar.f13104k);
                    hVar3.a(gVar4);
                    fVar.f13098d = z18;
                    if (!z16) {
                        List<bv> e10 = a9.e();
                        com.anythink.core.common.v.b.b a17 = com.anythink.core.common.v.b.b.a();
                        AnonymousClass4 anonymousClass4 = fVar.new AnonymousClass4(context, arVar2, str4, str3, lVar, z13, e10, cbVar, nVar, remove, bqVar2, acVar3, iVar, bn, dArr, z17, hVar3, gVar4);
                        arVar2 = arVar2;
                        a17.b(anonymousClass4);
                    }
                    int i = arVar2.f13547c;
                    if (i == 0 || i == 3) {
                        w.a().a(lVar, 15, arVar2, nVar);
                        return;
                    }
                    return;
                }
                c9.L(6);
                AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                throw new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace());
            }
            nVar.L(5);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (com.anythink.core.common.h.m e11) {
            e = e11;
            z3 = true;
            fVar.a(z3, nVar, e, arVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.anythink.core.common.h.c a(Context context, boolean z3, boolean z6, com.anythink.core.common.h.ae aeVar, f fVar, com.anythink.core.d.l lVar) {
        com.anythink.core.common.h.c cVar;
        boolean z9;
        String str;
        String str2;
        com.anythink.core.common.h.n nVar;
        boolean z10;
        String str3;
        boolean z11;
        com.anythink.core.common.h.c cVar2;
        com.anythink.core.common.h.n i;
        String str4;
        com.anythink.core.common.h.n nVar2;
        String u3 = lVar.u();
        int aq = lVar.aq();
        w.a();
        f a9 = w.a(u3, String.valueOf(aq));
        if (a9 != null) {
            com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
            a(dVar, this.f13096b, lVar);
            if (aeVar != null) {
                aeVar.a(dVar);
                aeVar.a(a9.f13110q);
            }
            cVar = a9.a(context, z3, z6, aeVar);
            if (cVar != null) {
                aj.a(this.f13096b, lVar, cVar.i());
            }
        } else {
            cVar = null;
        }
        com.anythink.core.common.h.c a10 = fVar.a(context, z3, z6, aeVar);
        String str5 = "";
        if (a10 == null) {
            z9 = false;
            str = "";
            str2 = str;
            nVar = null;
        } else {
            nVar = a10.i();
            if (nVar == null) {
                str = "";
                str2 = str;
                nVar = null;
            } else {
                str = nVar.aJ();
                str2 = String.valueOf(nVar.U());
            }
            z9 = true;
        }
        if (cVar != null) {
            com.anythink.core.common.h.n i6 = cVar.i();
            if (i6 != null) {
                str5 = i6.aJ();
            }
            z10 = false;
            str3 = u3;
            z11 = true;
        } else {
            w.a().b(u3, fVar.f13110q);
            w.a().a(lVar, 17, fVar.f13111r, nVar);
            z10 = false;
            str3 = u3;
            z11 = false;
        }
        if (cVar != null) {
            if (a10 != null) {
                if (com.anythink.core.common.v.l.a(cVar.o(), a10.o()) < 0) {
                    cVar.n();
                    a10.n();
                } else {
                    cVar.n();
                    a10.n();
                }
            }
            cVar2 = cVar;
            String str6 = this.f13096b;
            i = cVar2 != null ? cVar2.i() : null;
            if (!z9 || z11) {
                com.anythink.core.common.h.n nVar3 = i;
                str4 = str5;
                nVar2 = nVar3;
                z10 = true;
            } else {
                com.anythink.core.common.h.n nVar4 = i;
                str4 = str5;
                nVar2 = nVar4;
            }
            com.anythink.core.common.u.e.a(str6, str3, lVar, nVar2, z10, z9, z11, str, str4, str2);
            return cVar2;
        }
        cVar2 = a10;
        String str62 = this.f13096b;
        if (cVar2 != null) {
        }
        if (z9) {
        }
        com.anythink.core.common.h.n nVar32 = i;
        str4 = str5;
        nVar2 = nVar32;
        z10 = true;
        com.anythink.core.common.u.e.a(str62, str3, lVar, nVar2, z10, z9, z11, str, str4, str2);
        return cVar2;
    }

    private List<ATAdInfo> a(Context context, f fVar, com.anythink.core.d.l lVar) {
        List<com.anythink.core.common.h.c> list;
        String u3 = lVar.u();
        w.a();
        f a9 = w.a(u3, String.valueOf(lVar.aq()));
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
        if (a9 != null) {
            a(dVar, this.f13096b, lVar);
            aeVar.a(dVar);
            aeVar.a(a9.f13110q);
            list = a9.d(context);
        } else {
            list = null;
        }
        List<com.anythink.core.common.h.c> d2 = fVar.d(context);
        if (list == null) {
            return a(aeVar, d2);
        }
        if (d2 != null && d2.size() != 0) {
            d2.addAll(list);
            Collections.sort(d2, new AnonymousClass9());
            return a(aeVar, d2);
        }
        return a(aeVar, list);
    }

    private static void a(com.anythink.core.common.h.d dVar, String str, com.anythink.core.d.l lVar) {
        dVar.a(str, lVar.ay(), lVar.ai());
    }

    private com.anythink.core.d.l a(boolean z3, Map<String, Object> map) {
        if (!z3 && map != null) {
            Object obj = map.get(CoreDebuggerManager.f17498a);
            if (obj instanceof com.anythink.core.d.l) {
                return (com.anythink.core.d.l) obj;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean a(f fVar) {
        return !TextUtils.isEmpty(fVar.f13099e);
    }

    public static /* synthetic */ com.anythink.core.d.l a(f fVar, boolean z3, Map map) {
        if (z3 || map == null) {
            return null;
        }
        Object obj = map.get(CoreDebuggerManager.f17498a);
        String str = fVar.f13105l;
        if (obj instanceof com.anythink.core.d.l) {
            return (com.anythink.core.d.l) obj;
        }
        return null;
    }

    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, ar arVar, com.anythink.core.common.h.n nVar, String str3, String str4, int i, boolean z3) {
        com.anythink.core.d.n.a(context).a(lVar, str, str2, fVar.f13096b, arVar.f13551g, fVar.new AnonymousClass2(nVar, str3, arVar, str4), i, z3, arVar.b());
    }

    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        if (nVar != null) {
            nVar.e(SystemClock.elapsedRealtime());
        }
        com.anythink.core.common.w.b.h hVar = new com.anythink.core.common.w.b.h(context, str, lVar, fVar.new AnonymousClass3(arVar, context, str, str2, lVar, nVar));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.anythink.core.common.w.b.e());
        new com.anythink.core.common.w.b.g(arrayList, hVar, 0).a(hVar);
    }
}
