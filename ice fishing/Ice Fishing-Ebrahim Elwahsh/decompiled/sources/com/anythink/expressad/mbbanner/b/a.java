package com.anythink.expressad.mbbanner.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.e;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.mbbanner.a.c.b;
import com.anythink.expressad.mbbanner.a.d.c;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.i;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static String f20133b = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    i f20134a;

    /* renamed from: c, reason: collision with root package name */
    private String f20135c;

    /* renamed from: d, reason: collision with root package name */
    private String f20136d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20137e;

    /* renamed from: f, reason: collision with root package name */
    private int f20138f;

    /* renamed from: g, reason: collision with root package name */
    private TemplateBannerView f20139g;

    /* renamed from: h, reason: collision with root package name */
    private int f20140h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f20141j;

    /* renamed from: l, reason: collision with root package name */
    private h f20143l;

    /* renamed from: m, reason: collision with root package name */
    private e f20144m;

    /* renamed from: n, reason: collision with root package name */
    private c f20145n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.expressad.f.c f20146o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20147p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20148q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20149r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20150s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20151t;

    /* renamed from: k, reason: collision with root package name */
    private int f20142k = -1;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f20152u = new com.anythink.expressad.mbbanner.a.c.c() { // from class: com.anythink.expressad.mbbanner.b.a.1
        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(List<d> list) {
            if (a.this.f20143l != null) {
                a.this.f20143l.a();
            }
            String unused = a.f20133b;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void b() {
            if (a.this.f20143l != null) {
                h unused = a.this.f20143l;
                a.this.f20151t = true;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f20136d;
                a9.a(2, a.this.f20135c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void c() {
            if (a.this.f20143l != null) {
                h unused = a.this.f20143l;
                a.this.f20151t = false;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f20136d;
                String str = a.this.f20135c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f20140h, a.this.f20141j * 1000);
                b unused3 = a.this.f20153v;
                a9.a(3, str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void d() {
            if (a.this.f20143l != null) {
                a.this.f20143l.f();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar, boolean z8) {
            if (a.this.f20143l == null || z8) {
                return;
            }
            a.this.f20143l.b();
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(String str) {
            a.this.a(str);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar) {
            if (a.this.f20143l != null) {
                a.this.f20143l.a(dVar);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a() {
            if (a.this.f20143l != null) {
                h unused = a.this.f20143l;
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(boolean z8) {
            if (!z8) {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused = a.this.f20136d;
                String str = a.this.f20135c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f20140h, a.this.f20141j * 1000);
                b unused2 = a.this.f20153v;
                a9.a(3, str);
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
            String unused3 = a.this.f20136d;
            a10.a(2, a.this.f20135c);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private b f20153v = new b() { // from class: com.anythink.expressad.mbbanner.b.a.2
        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(e eVar) {
            a.this.f20144m = eVar;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void b() {
            if (a.this.f20143l != null) {
                a.this.f20143l.a(com.anythink.expressad.mbbanner.a.a.f19970c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(com.anythink.expressad.foundation.e.c cVar) {
            String str;
            str = "";
            if (cVar != null) {
                String a9 = cVar.a();
                str = TextUtils.isEmpty(a9) ? "" : a9;
                cVar.b();
                cVar.c();
            }
            if (a.this.f20143l != null) {
                a.this.f20143l.a(str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a() {
            e unused = a.this.f20144m;
            if (a.this.f20139g != null) {
                try {
                    a.this.f20150s = true;
                    a.this.i();
                } catch (Throwable th) {
                    a.this.f20150s = false;
                    if (a.this.f20143l != null) {
                        a.this.f20143l.a("startShowBanner fail:" + th.getMessage());
                    }
                    String unused2 = a.f20133b;
                    th.getMessage();
                }
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r3 > 180) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(TemplateBannerView templateBannerView, i iVar, String str, String str2) {
        this.f20139g = templateBannerView;
        if (iVar != null) {
            this.f20140h = iVar.a();
            this.i = iVar.b();
        }
        this.f20134a = iVar;
        this.f20135c = str2;
        this.f20136d = TextUtils.isEmpty(str) ? "" : str;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20135c);
        this.f20146o = c4;
        if (c4 == null) {
            this.f20146o = com.anythink.expressad.f.c.c(this.f20135c);
        }
        if (this.f20142k == -1) {
            int b9 = this.f20146o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20141j = b9;
        }
        if (this.f20138f == 0) {
            boolean z8 = this.f20146o.d() == 1;
            this.f20137e = z8;
            c cVar = this.f20145n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    private static int a(int i) {
        if (i > 0) {
            if (i < 10) {
                return 10;
            }
            if (i > 180) {
                return 180;
            }
        }
        return i;
    }

    private static boolean j() {
        return true;
    }

    private static void k() {
    }

    private void l() {
        TemplateBannerView templateBannerView = this.f20139g;
        if (templateBannerView != null) {
            if (!this.f20147p || !this.f20148q || this.f20151t || aa.a(templateBannerView, 1)) {
                com.anythink.expressad.mbbanner.a.d.a.a().a(2, this.f20135c);
            } else {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String str = this.f20135c;
                new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20140h, this.f20141j * 1000);
                a9.a(3, str);
            }
            if (this.f20147p) {
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f20135c);
            com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20135c);
        }
    }

    private void m() {
        l();
        c cVar = this.f20145n;
        if (cVar != null) {
            cVar.b(this.f20147p);
            this.f20145n.c(this.f20148q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 > 180) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20135c);
        this.f20146o = c4;
        if (c4 == null) {
            this.f20146o = com.anythink.expressad.f.c.c(this.f20135c);
        }
        if (this.f20142k == -1) {
            int b9 = this.f20146o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20141j = b9;
        }
        if (this.f20138f == 0) {
            boolean z8 = this.f20146o.d() == 1;
            this.f20137e = z8;
            c cVar = this.f20145n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 > 180) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c4 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20135c);
        this.f20146o = c4;
        if (c4 == null) {
            this.f20146o = com.anythink.expressad.f.c.c(this.f20135c);
        }
        if (this.f20142k == -1) {
            int b9 = this.f20146o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20141j = b9;
        }
        if (this.f20138f == 0) {
            boolean z8 = this.f20146o.d() == 1;
            this.f20137e = z8;
            c cVar = this.f20145n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f20149r || !this.f20150s) {
            return;
        }
        if (this.f20144m != null) {
            if (this.f20145n == null) {
                this.f20145n = new c(this.f20139g, this.f20152u, this.f20136d, this.f20135c, this.f20137e, this.f20146o);
            }
            this.f20145n.a(this.f20134a);
            this.f20145n.b(this.f20147p);
            this.f20145n.c(this.f20148q);
            this.f20145n.a(this.f20137e, this.f20138f);
            this.f20145n.a(this.f20144m);
        } else {
            a(com.anythink.expressad.mbbanner.a.a.f19975h);
        }
        this.f20150s = false;
    }

    public final void c() {
        this.f20149r = true;
        if (this.f20143l != null) {
            this.f20143l = null;
        }
        if (this.f20153v != null) {
            this.f20153v = null;
        }
        if (this.f20152u != null) {
            this.f20152u = null;
        }
        if (this.f20139g != null) {
            this.f20139g = null;
        }
        com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f20135c);
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20135c);
        com.anythink.expressad.mbbanner.a.d.a.a().b();
        c cVar = this.f20145n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f20135c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20140h, this.f20141j * 1000);
        a9.a(4, str);
    }

    public final void e() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f20135c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20140h, this.f20141j * 1000);
        a9.a(3, str);
    }

    public final String b() {
        e eVar = this.f20144m;
        if (eVar != null) {
            return l.a(eVar.f18838K);
        }
        return "";
    }

    public final String a() {
        e eVar = this.f20144m;
        if (eVar != null && eVar.f() != null) {
            return this.f20144m.f();
        }
        return "";
    }

    public final void b(boolean z8) {
        this.f20147p = z8;
        m();
        i();
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f20140h = iVar.a();
            this.i = iVar.b();
        }
    }

    public final void a(boolean z8) {
        this.f20137e = z8;
        this.f20138f = z8 ? 1 : 2;
    }

    public final void a(e eVar) {
        this.f20144m = eVar;
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20136d, this.f20135c, eVar, this.f20153v);
    }

    public final void a(h hVar) {
        this.f20143l = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        h hVar = this.f20143l;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    public final void c(boolean z8) {
        this.f20148q = z8;
        m();
    }

    public final void a(int i, int i4, int i9, int i10) {
        c cVar = this.f20145n;
        if (cVar != null) {
            cVar.a(i, i4, i9, i10);
        }
    }
}
