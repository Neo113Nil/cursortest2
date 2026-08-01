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
    private static String f19975b = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    i f19976a;

    /* renamed from: c, reason: collision with root package name */
    private String f19977c;

    /* renamed from: d, reason: collision with root package name */
    private String f19978d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19979e;

    /* renamed from: f, reason: collision with root package name */
    private int f19980f;

    /* renamed from: g, reason: collision with root package name */
    private TemplateBannerView f19981g;

    /* renamed from: h, reason: collision with root package name */
    private int f19982h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f19983j;

    /* renamed from: l, reason: collision with root package name */
    private h f19985l;

    /* renamed from: m, reason: collision with root package name */
    private e f19986m;

    /* renamed from: n, reason: collision with root package name */
    private c f19987n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.expressad.f.c f19988o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19989p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19990q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19991r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19992s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19993t;

    /* renamed from: k, reason: collision with root package name */
    private int f19984k = -1;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f19994u = new com.anythink.expressad.mbbanner.a.c.c() { // from class: com.anythink.expressad.mbbanner.b.a.1
        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(List<d> list) {
            if (a.this.f19985l != null) {
                a.this.f19985l.a();
            }
            String unused = a.f19975b;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void b() {
            if (a.this.f19985l != null) {
                h unused = a.this.f19985l;
                a.this.f19993t = true;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f19978d;
                a9.a(2, a.this.f19977c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void c() {
            if (a.this.f19985l != null) {
                h unused = a.this.f19985l;
                a.this.f19993t = false;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f19978d;
                String str = a.this.f19977c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f19982h, a.this.f19983j * 1000);
                b unused3 = a.this.f19995v;
                a9.a(3, str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void d() {
            if (a.this.f19985l != null) {
                a.this.f19985l.f();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar, boolean z3) {
            if (a.this.f19985l == null || z3) {
                return;
            }
            a.this.f19985l.b();
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(String str) {
            a.this.a(str);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar) {
            if (a.this.f19985l != null) {
                a.this.f19985l.a(dVar);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a() {
            if (a.this.f19985l != null) {
                h unused = a.this.f19985l;
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(boolean z3) {
            if (!z3) {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused = a.this.f19978d;
                String str = a.this.f19977c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f19982h, a.this.f19983j * 1000);
                b unused2 = a.this.f19995v;
                a9.a(3, str);
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
            String unused3 = a.this.f19978d;
            a10.a(2, a.this.f19977c);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private b f19995v = new b() { // from class: com.anythink.expressad.mbbanner.b.a.2
        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(e eVar) {
            a.this.f19986m = eVar;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void b() {
            if (a.this.f19985l != null) {
                a.this.f19985l.a(com.anythink.expressad.mbbanner.a.a.f19812c);
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
            if (a.this.f19985l != null) {
                a.this.f19985l.a(str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a() {
            e unused = a.this.f19986m;
            if (a.this.f19981g != null) {
                try {
                    a.this.f19992s = true;
                    a.this.i();
                } catch (Throwable th) {
                    a.this.f19992s = false;
                    if (a.this.f19985l != null) {
                        a.this.f19985l.a("startShowBanner fail:" + th.getMessage());
                    }
                    String unused2 = a.f19975b;
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
        this.f19981g = templateBannerView;
        if (iVar != null) {
            this.f19982h = iVar.a();
            this.i = iVar.b();
        }
        this.f19976a = iVar;
        this.f19977c = str2;
        this.f19978d = TextUtils.isEmpty(str) ? "" : str;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f19977c);
        this.f19988o = c9;
        if (c9 == null) {
            this.f19988o = com.anythink.expressad.f.c.c(this.f19977c);
        }
        if (this.f19984k == -1) {
            int b9 = this.f19988o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f19983j = b9;
        }
        if (this.f19980f == 0) {
            boolean z3 = this.f19988o.d() == 1;
            this.f19979e = z3;
            c cVar = this.f19987n;
            if (cVar != null) {
                cVar.a(z3);
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
        TemplateBannerView templateBannerView = this.f19981g;
        if (templateBannerView != null) {
            if (!this.f19989p || !this.f19990q || this.f19993t || aa.a(templateBannerView, 1)) {
                com.anythink.expressad.mbbanner.a.d.a.a().a(2, this.f19977c);
            } else {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String str = this.f19977c;
                new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f19982h, this.f19983j * 1000);
                a9.a(3, str);
            }
            if (this.f19989p) {
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f19977c);
            com.anythink.expressad.mbbanner.a.d.a.a().a(this.f19977c);
        }
    }

    private void m() {
        l();
        c cVar = this.f19987n;
        if (cVar != null) {
            cVar.b(this.f19989p);
            this.f19987n.c(this.f19990q);
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
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f19977c);
        this.f19988o = c9;
        if (c9 == null) {
            this.f19988o = com.anythink.expressad.f.c.c(this.f19977c);
        }
        if (this.f19984k == -1) {
            int b9 = this.f19988o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f19983j = b9;
        }
        if (this.f19980f == 0) {
            boolean z3 = this.f19988o.d() == 1;
            this.f19979e = z3;
            c cVar = this.f19987n;
            if (cVar != null) {
                cVar.a(z3);
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
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f19977c);
        this.f19988o = c9;
        if (c9 == null) {
            this.f19988o = com.anythink.expressad.f.c.c(this.f19977c);
        }
        if (this.f19984k == -1) {
            int b9 = this.f19988o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f19983j = b9;
        }
        if (this.f19980f == 0) {
            boolean z3 = this.f19988o.d() == 1;
            this.f19979e = z3;
            c cVar = this.f19987n;
            if (cVar != null) {
                cVar.a(z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f19991r || !this.f19992s) {
            return;
        }
        if (this.f19986m != null) {
            if (this.f19987n == null) {
                this.f19987n = new c(this.f19981g, this.f19994u, this.f19978d, this.f19977c, this.f19979e, this.f19988o);
            }
            this.f19987n.a(this.f19976a);
            this.f19987n.b(this.f19989p);
            this.f19987n.c(this.f19990q);
            this.f19987n.a(this.f19979e, this.f19980f);
            this.f19987n.a(this.f19986m);
        } else {
            a(com.anythink.expressad.mbbanner.a.a.f19817h);
        }
        this.f19992s = false;
    }

    public final void c() {
        this.f19991r = true;
        if (this.f19985l != null) {
            this.f19985l = null;
        }
        if (this.f19995v != null) {
            this.f19995v = null;
        }
        if (this.f19994u != null) {
            this.f19994u = null;
        }
        if (this.f19981g != null) {
            this.f19981g = null;
        }
        com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f19977c);
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f19977c);
        com.anythink.expressad.mbbanner.a.d.a.a().b();
        c cVar = this.f19987n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f19977c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f19982h, this.f19983j * 1000);
        a9.a(4, str);
    }

    public final void e() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f19977c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f19982h, this.f19983j * 1000);
        a9.a(3, str);
    }

    public final String b() {
        e eVar = this.f19986m;
        if (eVar != null) {
            return l.a(eVar.f18680K);
        }
        return "";
    }

    public final String a() {
        e eVar = this.f19986m;
        if (eVar != null && eVar.f() != null) {
            return this.f19986m.f();
        }
        return "";
    }

    public final void b(boolean z3) {
        this.f19989p = z3;
        m();
        i();
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f19982h = iVar.a();
            this.i = iVar.b();
        }
    }

    public final void a(boolean z3) {
        this.f19979e = z3;
        this.f19980f = z3 ? 1 : 2;
    }

    public final void a(e eVar) {
        this.f19986m = eVar;
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f19978d, this.f19977c, eVar, this.f19995v);
    }

    public final void a(h hVar) {
        this.f19985l = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        h hVar = this.f19985l;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    public final void c(boolean z3) {
        this.f19990q = z3;
        m();
    }

    public final void a(int i, int i6, int i9, int i10) {
        c cVar = this.f19987n;
        if (cVar != null) {
            cVar.a(i, i6, i9, i10);
        }
    }
}
