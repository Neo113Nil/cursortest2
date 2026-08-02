package com.anythink.core.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bw;
import com.anythink.core.common.h.p;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f12920b;

    /* renamed from: a, reason: collision with root package name */
    private final String f12921a = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, a> f12922c = new ConcurrentHashMap();

    public class a {

        /* renamed from: b, reason: collision with root package name */
        private bv f12924b;

        /* renamed from: c, reason: collision with root package name */
        private ATBaseAdAdapter f12925c;

        /* renamed from: d, reason: collision with root package name */
        private BaseAd f12926d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.h.c f12927e;

        /* renamed from: f, reason: collision with root package name */
        private String f12928f;

        /* renamed from: g, reason: collision with root package name */
        private com.anythink.core.common.h.n f12929g;

        public a() {
        }

        private com.anythink.core.common.h.n f() {
            return this.f12929g;
        }

        public final synchronized void c() {
            String unused = c.this.f12921a;
            this.f12925c = null;
            this.f12926d = null;
            this.f12927e = null;
        }

        public final bv d() {
            return this.f12924b;
        }

        public final synchronized com.anythink.core.common.h.c e() {
            return this.f12927e;
        }

        public final synchronized boolean b() {
            String unused = c.this.f12921a;
            return a() != null;
        }

        public final synchronized void a(String str, com.anythink.core.common.h.n nVar) {
            String unused = c.this.f12921a;
            this.f12928f = str;
            this.f12929g = nVar;
        }

        public final synchronized com.anythink.core.common.h.c a() {
            boolean internalIsAdReady;
            String unused = c.this.f12921a;
            ATBaseAdAdapter aTBaseAdAdapter = this.f12925c;
            com.anythink.core.common.h.n nVar = this.f12929g;
            if (aTBaseAdAdapter == null) {
                return null;
            }
            if (nVar == null) {
                return null;
            }
            com.anythink.core.common.h.c cVar = this.f12927e;
            if (cVar != null) {
                if (!cVar.k()) {
                    String unused2 = c.this.f12921a;
                    return null;
                }
                String unused3 = c.this.f12921a;
                return this.f12927e;
            }
            this.f12926d = null;
            if (TextUtils.equals(nVar.aK(), "0")) {
                BaseAd baseAdObject = this.f12925c.getBaseAdObject(t.b().g());
                this.f12926d = baseAdObject;
                internalIsAdReady = baseAdObject != null;
            } else {
                internalIsAdReady = this.f12925c.internalIsAdReady();
            }
            String unused4 = c.this.f12921a;
            if (internalIsAdReady) {
                this.f12929g.L(12);
                this.f12929g.m(ak.a(this.f12924b, this.f12925c));
                aj.a(this.f12925c, this.f12929g, this.f12924b);
                BaseAd baseAd = this.f12926d;
                if (baseAd != null) {
                    baseAd.setTrackingInfo(this.f12925c.getTrackingInfo().af());
                }
                this.f12924b.R().b(this.f12928f);
                com.anythink.core.b.d.c.a(this.f12925c, this.f12924b, this.f12929g, this.f12926d);
                com.anythink.core.common.h.c cVar2 = new com.anythink.core.common.h.c();
                this.f12927e = cVar2;
                cVar2.a(this.f12925c);
                this.f12927e.c(System.currentTimeMillis());
                this.f12927e.b(this.f12924b.u());
                this.f12927e.a(this.f12924b.G());
                this.f12927e.a("3");
                BaseAd baseAd2 = this.f12926d;
                if (baseAd2 != null) {
                    this.f12927e.a(baseAd2);
                }
            }
            return this.f12927e;
        }
    }

    private c() {
    }

    public static c a() {
        if (f12920b == null) {
            synchronized (c.class) {
                try {
                    if (f12920b == null) {
                        f12920b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12920b;
    }

    public final a a(Context context, String str, String str2, bv bvVar, com.anythink.core.d.l lVar, Map<String, Object> map, ATAdRequest aTAdRequest) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.IceFishing.LiveIceFishing.k.l());
        if ((k9 != null && !k9.S() && k9.t() != 1) || bvVar == null) {
            return null;
        }
        bw a9 = com.anythink.core.common.a.a().a(str, bvVar);
        if (a9 != null && a9.a((ad) null).b() != null) {
            return null;
        }
        a aVar = this.f12922c.get(str);
        if (aVar != null && aVar.f12925c != null) {
            return aVar;
        }
        ad a10 = com.anythink.core.b.f.a().a(str, bvVar);
        if (a10 != null) {
            a10.a();
        }
        if (a10 != null && !a10.a()) {
            bvVar.a(a10, 0, 2, 1);
            p a11 = u.a(bvVar);
            ATBaseAdAdapter aTBaseAdAdapter = a11 != null ? a11.f14821a : null;
            if (aTBaseAdAdapter != null && aTBaseAdAdapter.internalInitNetworkObjectByPlacementId(context, lVar.a(str, str2, bvVar, aTAdRequest), map)) {
                a aVar2 = new a();
                aVar2.f12925c = aTBaseAdAdapter;
                aVar2.f12924b = bvVar;
                this.f12922c.put(str, aVar2);
                return aVar2;
            }
        }
        return null;
    }

    public final synchronized com.anythink.core.common.h.c a(String str) {
        a aVar;
        com.anythink.core.common.h.c e9;
        if (TextUtils.isEmpty(str) || (aVar = this.f12922c.get(str)) == null || aVar.f12925c == null || (e9 = aVar.e()) == null || !e9.k()) {
            return null;
        }
        com.anythink.core.common.v.p.a(aVar.d());
        return e9;
    }

    public final synchronized void a(String str, String str2) {
        a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = this.f12922c.get(str)) != null && aVar.f12924b != null && aVar.f12924b.z().equals(str2)) {
            aVar.c();
            this.f12922c.remove(str);
        }
    }
}
