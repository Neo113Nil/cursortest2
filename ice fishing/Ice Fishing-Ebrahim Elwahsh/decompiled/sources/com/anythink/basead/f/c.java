package com.anythink.basead.f;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d.j;
import com.anythink.basead.f.a.a;
import com.anythink.basead.f.e.a;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.z;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected Context f9048a;

    /* renamed from: b, reason: collision with root package name */
    protected x f9049b;

    /* renamed from: c, reason: collision with root package name */
    protected d f9050c;

    /* renamed from: d, reason: collision with root package name */
    protected bj f9051d;

    /* renamed from: e, reason: collision with root package name */
    protected com.anythink.basead.g.a f9052e;

    /* renamed from: f, reason: collision with root package name */
    protected String f9053f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.basead.f.c.d f9054g;

    /* renamed from: h, reason: collision with root package name */
    protected com.anythink.basead.f.b.c f9055h;
    private b i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9056j = false;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Object> f9057k;

    /* renamed from: com.anythink.basead.f.c$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0037a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.g.c f9061b;

        public AnonymousClass2(String str, com.anythink.basead.g.c cVar) {
            this.f9060a = str;
            this.f9061b = cVar;
        }

        @Override // com.anythink.basead.f.a.a.InterfaceC0037a
        public final void a(com.anythink.basead.f.b.d dVar) {
        }

        @Override // com.anythink.basead.f.a.a.InterfaceC0037a
        public final void a(r rVar) {
            com.anythink.core.common.u.b.a().a(this.f9060a).f13789c = System.currentTimeMillis();
            c.this.a(rVar);
            com.anythink.basead.g.c cVar = this.f9061b;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
            if (!TextUtils.isEmpty(rVar.ad())) {
                z.a().a(t.b().g(), rVar.ad());
            }
            if (TextUtils.isEmpty(rVar.at())) {
                return;
            }
            com.anythink.basead.b.e.a.a().a(t.b().g(), rVar.at());
        }

        @Override // com.anythink.basead.f.a.a.InterfaceC0037a
        public final void a(r rVar, com.anythink.basead.f.b.d dVar) {
            c cVar = c.this;
            cVar.f9051d = rVar;
            c.a(cVar, dVar);
            c cVar2 = c.this;
            cVar2.f9055h = cVar2.a(rVar, cVar2.f9049b, dVar);
            String str = "";
            com.anythink.basead.b.b.a(33, rVar, new j(c.this.f9049b, ""));
            com.anythink.core.common.u.b.a().a(this.f9060a, System.currentTimeMillis());
            if (TextUtils.equals(String.valueOf(c.this.f9049b.f14320j), "0")) {
                str = (c.this.f9049b.f14326p || dVar != null) ? "1" : "0";
            }
            com.anythink.core.common.u.e.a(rVar, c.this.f9049b, str, com.anythink.core.common.u.b.a().a(this.f9060a), true, com.anythink.basead.b.e.d(rVar, c.this.f9049b));
            com.anythink.core.common.u.b.a().b(this.f9060a);
            c.a(c.this);
            com.anythink.basead.g.c cVar3 = this.f9061b;
            if (cVar3 != null) {
                cVar3.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.f.a.a.InterfaceC0037a
        public final void a(r rVar, com.anythink.basead.d.f fVar) {
            com.anythink.core.common.u.b.a().a(this.f9060a, System.currentTimeMillis());
            String str = "0";
            if (TextUtils.equals(String.valueOf(c.this.f9049b.f14320j), "0")) {
                if (c.this.f9049b.f14326p) {
                    str = "1";
                }
            } else {
                str = "";
            }
            com.anythink.core.common.u.e.a(rVar, c.this.f9049b, str, com.anythink.core.common.u.b.a().a(this.f9060a), false, com.anythink.basead.b.e.d(rVar, c.this.f9049b));
            com.anythink.core.common.u.b.a().b(this.f9060a);
            c.a(c.this, rVar, fVar, this.f9061b, true);
        }
    }

    /* renamed from: com.anythink.basead.f.c$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9065a;

        static {
            int[] iArr = new int[b.values().length];
            f9065a = iArr;
            try {
                iArr[b.ADX_OFFER_REQUEST_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9065a[b.ONLINE_API_OFFER_REQUEST_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a {
        void onAdCacheLoaded();
    }

    public enum b {
        ADX_OFFER_REQUEST_TYPE,
        ONLINE_API_OFFER_REQUEST_TYPE;

        private static /* synthetic */ b[] a() {
            return new b[]{ADX_OFFER_REQUEST_TYPE, ONLINE_API_OFFER_REQUEST_TYPE};
        }
    }

    /* renamed from: com.anythink.basead.f.c$c, reason: collision with other inner class name */
    public class C0039c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9070a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9071b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9072c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f9073d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f9074e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f9075f = 6;

        private C0039c() {
        }
    }

    public c(Context context, b bVar, x xVar) {
        this.f9048a = context.getApplicationContext();
        this.i = bVar;
        this.f9049b = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r5.onAdLoadFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6304B));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.anythink.basead.g.c cVar) {
        try {
            x xVar = this.f9049b;
            if (xVar != null && !TextUtils.isEmpty(xVar.f14313b) && !TextUtils.isEmpty(this.f9049b.f14312a)) {
                com.anythink.core.common.u.b.a();
                String a9 = com.anythink.core.common.u.b.a(this.f9049b);
                com.anythink.core.common.u.b.a().a(a9).f13787a = System.currentTimeMillis();
                com.anythink.basead.f.a.a.a(this.f9048a).a(this.f9049b, new AnonymousClass2(a9, cVar));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.onAdLoadFailed(com.anythink.basead.d.g.a("-9999", th.getMessage()));
            }
        }
    }

    public final boolean c() {
        bj bjVar;
        int i = AnonymousClass4.f9065a[this.i.ordinal()];
        if (i != 1) {
            if (i != 2 || (bjVar = this.f9051d) == null || !(bjVar instanceof bi) || bjVar.ay()) {
                return false;
            }
            if (this.f9056j) {
                return true;
            }
            if (com.anythink.basead.b.c.d.a(this.f9051d, this.f9049b)) {
                this.f9056j = true;
                return true;
            }
            return false;
        }
        if (this.f9051d == null) {
            this.f9051d = com.anythink.basead.f.a.a.a(this.f9048a).a(this.f9049b);
        }
        bj bjVar2 = this.f9051d;
        if (bjVar2 == null || bjVar2.ay()) {
            return false;
        }
        if (this.f9055h == null) {
            this.f9055h = a(this.f9051d, this.f9049b, null);
        }
        if (this.f9056j) {
            return true;
        }
        com.anythink.basead.f.b.c cVar = this.f9055h;
        if (cVar == null || !cVar.a()) {
            return false;
        }
        this.f9056j = true;
        return true;
    }

    public final w d() {
        return this.f9051d;
    }

    public final Map<String, Object> e() {
        return this.f9057k;
    }

    public final int f() {
        return com.anythink.basead.b.e.d(this.f9051d, this.f9049b);
    }

    public final boolean g() {
        y yVar;
        x xVar = this.f9049b;
        return xVar == null || (yVar = xVar.f14325o) == null || yVar.bI() <= 0;
    }

    /* renamed from: com.anythink.basead.f.c$3, reason: invalid class name */
    public class AnonymousClass3 implements a.InterfaceC0040a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.g.c f9063a;

        public AnonymousClass3(com.anythink.basead.g.c cVar) {
            this.f9063a = cVar;
        }

        @Override // com.anythink.basead.f.e.a.InterfaceC0040a
        public final void a() {
            com.anythink.basead.g.c cVar = this.f9063a;
            if (cVar != null) {
                cVar.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.f.e.a.InterfaceC0040a
        public final void a(bi biVar) {
            c cVar = c.this;
            cVar.f9051d = biVar;
            com.anythink.basead.b.b.a(33, c.this.f9051d, new j(cVar.f9049b, ""));
            c.a(c.this);
            com.anythink.basead.g.c cVar2 = this.f9063a;
            if (cVar2 != null) {
                cVar2.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.f.e.a.InterfaceC0040a
        public final void a(bi biVar, com.anythink.basead.d.f fVar) {
            c.a(c.this, biVar, fVar, this.f9063a, false);
        }
    }

    public static /* synthetic */ boolean a(c cVar) {
        cVar.f9056j = true;
        return true;
    }

    public final void a(String str) {
        this.f9053f = str;
    }

    public final void a(d dVar) {
        this.f9050c = dVar;
        x xVar = this.f9049b;
        y yVar = xVar.f14325o;
        if (yVar instanceof bk) {
            bk bkVar = (bk) yVar;
            boolean z8 = xVar.f14317f == 66;
            if (bkVar == null || dVar == null) {
                return;
            }
            bkVar.z(dVar.a());
            if (!z8) {
                bkVar.A(dVar.b());
            }
            bkVar.e(dVar.d());
            bkVar.t(dVar.c());
            bkVar.s(dVar.e());
            bkVar.b(dVar.f());
            bkVar.r(dVar.g());
            bkVar.c(dVar.h());
            bkVar.d(dVar.i());
            bkVar.f(dVar.j());
            bkVar.f(dVar.k());
            bkVar.aF(dVar.l());
        }
    }

    public void b() {
        com.anythink.basead.f.b.c cVar = this.f9055h;
        if (cVar != null) {
            cVar.b();
        }
        this.f9051d = null;
    }

    private void c(com.anythink.basead.g.c cVar) {
        try {
            com.anythink.basead.f.e.a.a(this.f9048a).a(this.f9049b, this.f9053f, new AnonymousClass3(cVar));
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.onAdLoadFailed(com.anythink.basead.d.g.a("-9999", th.getMessage()));
            }
        }
    }

    public final void a(com.anythink.basead.g.a aVar) {
        this.f9052e = aVar;
        com.anythink.basead.f.b.c cVar = this.f9055h;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public final void a(com.anythink.basead.g.c cVar) {
        int i = AnonymousClass4.f9065a[this.i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            try {
                com.anythink.basead.f.e.a.a(this.f9048a).a(this.f9049b, this.f9053f, new AnonymousClass3(cVar));
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                cVar.onAdLoadFailed(com.anythink.basead.d.g.a("-9999", th.getMessage()));
                return;
            }
        }
        try {
            x xVar = this.f9049b;
            if (xVar != null && !TextUtils.isEmpty(xVar.f14313b) && !TextUtils.isEmpty(this.f9049b.f14312a)) {
                com.anythink.core.common.u.b.a();
                String a9 = com.anythink.core.common.u.b.a(this.f9049b);
                com.anythink.core.common.u.b.a().a(a9).f13787a = System.currentTimeMillis();
                com.anythink.basead.f.a.a.a(this.f9048a).a(this.f9049b, new AnonymousClass2(a9, cVar));
                return;
            }
            cVar.onAdLoadFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6304B));
        } catch (Throwable th2) {
            th2.printStackTrace();
            cVar.onAdLoadFailed(com.anythink.basead.d.g.a("-9999", th2.getMessage()));
        }
    }

    private void a() {
        a((a) null);
    }

    public final void a(final a aVar) {
        if (AnonymousClass4.f9065a[this.i.ordinal()] != 1) {
            return;
        }
        if (c()) {
            com.anythink.basead.f.f.a.a(this.f9049b, this.f9051d);
            if (aVar != null) {
                aVar.onAdCacheLoaded();
                return;
            }
            return;
        }
        if (this.f9049b != null) {
            com.anythink.basead.f.a.a.a(this.f9048a).a(this.f9051d, this.f9049b, new a.InterfaceC0037a() { // from class: com.anythink.basead.f.c.1
                @Override // com.anythink.basead.f.a.a.InterfaceC0037a
                public final void a(r rVar) {
                }

                @Override // com.anythink.basead.f.a.a.InterfaceC0037a
                public final void a(r rVar, com.anythink.basead.d.f fVar) {
                }

                @Override // com.anythink.basead.f.a.a.InterfaceC0037a
                public final void a(com.anythink.basead.f.b.d dVar) {
                    c.a(c.this, dVar);
                }

                @Override // com.anythink.basead.f.a.a.InterfaceC0037a
                public final void a(r rVar, com.anythink.basead.f.b.d dVar) {
                    c cVar = c.this;
                    com.anythink.basead.f.f.a.a(cVar.f9049b, cVar.f9051d);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onAdCacheLoaded();
                    }
                }
            });
        }
    }

    public final String a(bj bjVar) {
        return this.f9049b.f14313b + this.f9049b.f14314c + this.f9049b.f14317f + bjVar.v() + System.currentTimeMillis();
    }

    private void a(com.anythink.basead.f.b.d dVar) {
        if (dVar == null || !(dVar instanceof com.anythink.basead.f.c.c)) {
            return;
        }
        this.f9054g = com.anythink.basead.f.c.a.a() ? com.anythink.basead.f.c.a.b().a(this.f9048a, this.f9049b, this.f9051d, (com.anythink.basead.f.c.c) dVar) : null;
    }

    private void a(w wVar, com.anythink.basead.d.f fVar, com.anythink.basead.g.c cVar, boolean z8) {
        if (wVar != null) {
            com.anythink.basead.b.b.a(34, wVar, new j(this.f9049b, ""));
        }
        if (wVar instanceof bi) {
            com.anythink.core.basead.b.a();
            Context g9 = t.b().g();
            com.anythink.core.basead.b.a();
            com.anythink.core.basead.b.b(g9, com.anythink.core.basead.b.a(this.f9049b));
        }
        if (z8) {
            try {
                com.anythink.core.common.a.a.a().b(t.b().g(), this.f9049b.f14312a);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.onAdLoadFailed(fVar);
        }
    }

    public final void a(r rVar) {
        if (rVar.f() == 1) {
            com.anythink.core.common.a.d.a().b();
            if (q.a(this.f9048a, rVar.I())) {
                rVar.aE();
                rVar.I();
                com.anythink.core.common.a.d.a().c(rVar);
            } else {
                rVar.aE();
                rVar.I();
                com.anythink.core.common.a.d.a().a(rVar);
            }
        }
    }

    public final void a(Map<String, Object> map) {
        this.f9057k = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.anythink.basead.f.b.c a(bj bjVar, x xVar, com.anythink.basead.f.b.d dVar) {
        if (!TextUtils.isEmpty(((r) this.f9051d).d())) {
            com.anythink.basead.f.c.d dVar2 = this.f9054g;
            if (dVar2 != null) {
                return new com.anythink.basead.f.b.b(dVar2);
            }
            return null;
        }
        if (TextUtils.equals(bjVar.aD(), com.anythink.basead.f.d.b.f9099a)) {
            if (dVar instanceof com.anythink.basead.f.b.c) {
                return (com.anythink.basead.f.b.c) dVar;
            }
            return null;
        }
        return new com.anythink.basead.f.b.a(bjVar, xVar);
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.f.b.d dVar) {
        if (dVar == null || !(dVar instanceof com.anythink.basead.f.c.c)) {
            return;
        }
        cVar.f9054g = com.anythink.basead.f.c.a.a() ? com.anythink.basead.f.c.a.b().a(cVar.f9048a, cVar.f9049b, cVar.f9051d, (com.anythink.basead.f.c.c) dVar) : null;
    }

    public static /* synthetic */ void a(c cVar, w wVar, com.anythink.basead.d.f fVar, com.anythink.basead.g.c cVar2, boolean z8) {
        if (wVar != null) {
            com.anythink.basead.b.b.a(34, wVar, new j(cVar.f9049b, ""));
        }
        if (wVar instanceof bi) {
            com.anythink.core.basead.b.a();
            Context g9 = t.b().g();
            com.anythink.core.basead.b.a();
            com.anythink.core.basead.b.b(g9, com.anythink.core.basead.b.a(cVar.f9049b));
        }
        if (z8) {
            try {
                com.anythink.core.common.a.a.a().b(t.b().g(), cVar.f9049b.f14312a);
            } catch (Throwable unused) {
            }
        }
        if (cVar2 != null) {
            cVar2.onAdLoadFailed(fVar);
        }
    }
}
