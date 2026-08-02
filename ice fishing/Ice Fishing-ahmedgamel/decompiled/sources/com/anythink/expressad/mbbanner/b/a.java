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
    private static String f20762b = "BannerController";

    /* renamed from: a, reason: collision with root package name */
    i f20763a;

    /* renamed from: c, reason: collision with root package name */
    private String f20764c;

    /* renamed from: d, reason: collision with root package name */
    private String f20765d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20766e;

    /* renamed from: f, reason: collision with root package name */
    private int f20767f;

    /* renamed from: g, reason: collision with root package name */
    private TemplateBannerView f20768g;

    /* renamed from: h, reason: collision with root package name */
    private int f20769h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f20770j;

    /* renamed from: l, reason: collision with root package name */
    private h f20772l;

    /* renamed from: m, reason: collision with root package name */
    private e f20773m;

    /* renamed from: n, reason: collision with root package name */
    private c f20774n;

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.expressad.f.c f20775o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20776p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20777q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20778r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20779s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20780t;

    /* renamed from: k, reason: collision with root package name */
    private int f20771k = -1;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.expressad.mbbanner.a.c.c f20781u = new com.anythink.expressad.mbbanner.a.c.c() { // from class: com.anythink.expressad.mbbanner.b.a.1
        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(List<d> list) {
            if (a.this.f20772l != null) {
                a.this.f20772l.a();
            }
            String unused = a.f20762b;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void b() {
            if (a.this.f20772l != null) {
                h unused = a.this.f20772l;
                a.this.f20780t = true;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f20765d;
                a9.a(2, a.this.f20764c);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void c() {
            if (a.this.f20772l != null) {
                h unused = a.this.f20772l;
                a.this.f20780t = false;
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused2 = a.this.f20765d;
                String str = a.this.f20764c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f20769h, a.this.f20770j * 1000);
                b unused3 = a.this.f20782v;
                a9.a(3, str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void d() {
            if (a.this.f20772l != null) {
                a.this.f20772l.f();
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar, boolean z6) {
            if (a.this.f20772l == null || z6) {
                return;
            }
            a.this.f20772l.b();
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(String str) {
            a.this.a(str);
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(d dVar) {
            if (a.this.f20772l != null) {
                a.this.f20772l.a(dVar);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a() {
            if (a.this.f20772l != null) {
                h unused = a.this.f20772l;
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.c
        public final void a(boolean z6) {
            if (!z6) {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String unused = a.this.f20765d;
                String str = a.this.f20764c;
                new com.anythink.expressad.mbbanner.a.b.d(a.this.i + "x" + a.this.f20769h, a.this.f20770j * 1000);
                b unused2 = a.this.f20782v;
                a9.a(3, str);
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a a10 = com.anythink.expressad.mbbanner.a.d.a.a();
            String unused3 = a.this.f20765d;
            a10.a(2, a.this.f20764c);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private b f20782v = new b() { // from class: com.anythink.expressad.mbbanner.b.a.2
        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a(e eVar) {
            a.this.f20773m = eVar;
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void b() {
            if (a.this.f20772l != null) {
                a.this.f20772l.a(com.anythink.expressad.mbbanner.a.a.f20599c);
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
            if (a.this.f20772l != null) {
                a.this.f20772l.a(str);
            }
        }

        @Override // com.anythink.expressad.mbbanner.a.c.b
        public final void a() {
            e unused = a.this.f20773m;
            if (a.this.f20768g != null) {
                try {
                    a.this.f20779s = true;
                    a.this.i();
                } catch (Throwable th) {
                    a.this.f20779s = false;
                    if (a.this.f20772l != null) {
                        a.this.f20772l.a("startShowBanner fail:" + th.getMessage());
                    }
                    String unused2 = a.f20762b;
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
        this.f20768g = templateBannerView;
        if (iVar != null) {
            this.f20769h = iVar.a();
            this.i = iVar.b();
        }
        this.f20763a = iVar;
        this.f20764c = str2;
        this.f20765d = TextUtils.isEmpty(str) ? "" : str;
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20764c);
        this.f20775o = c9;
        if (c9 == null) {
            this.f20775o = com.anythink.expressad.f.c.c(this.f20764c);
        }
        if (this.f20771k == -1) {
            int b9 = this.f20775o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20770j = b9;
        }
        if (this.f20767f == 0) {
            boolean z6 = this.f20775o.d() == 1;
            this.f20766e = z6;
            c cVar = this.f20774n;
            if (cVar != null) {
                cVar.a(z6);
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
        TemplateBannerView templateBannerView = this.f20768g;
        if (templateBannerView != null) {
            if (!this.f20776p || !this.f20777q || this.f20780t || aa.a(templateBannerView, 1)) {
                com.anythink.expressad.mbbanner.a.d.a.a().a(2, this.f20764c);
            } else {
                com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
                String str = this.f20764c;
                new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20769h, this.f20770j * 1000);
                a9.a(3, str);
            }
            if (this.f20776p) {
                return;
            }
            com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f20764c);
            com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20764c);
        }
    }

    private void m() {
        l();
        c cVar = this.f20774n;
        if (cVar != null) {
            cVar.b(this.f20776p);
            this.f20774n.c(this.f20777q);
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
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20764c);
        this.f20775o = c9;
        if (c9 == null) {
            this.f20775o = com.anythink.expressad.f.c.c(this.f20764c);
        }
        if (this.f20771k == -1) {
            int b9 = this.f20775o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20770j = b9;
        }
        if (this.f20767f == 0) {
            boolean z6 = this.f20775o.d() == 1;
            this.f20766e = z6;
            c cVar = this.f20774n;
            if (cVar != null) {
                cVar.a(z6);
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
        com.anythink.expressad.f.c c9 = com.anythink.expressad.f.b.c(com.anythink.expressad.foundation.b.a.c().f(), this.f20764c);
        this.f20775o = c9;
        if (c9 == null) {
            this.f20775o = com.anythink.expressad.f.c.c(this.f20764c);
        }
        if (this.f20771k == -1) {
            int b9 = this.f20775o.b();
            if (b9 > 0) {
                int i = b9 >= 10 ? 180 : 10;
                b9 = i;
            }
            this.f20770j = b9;
        }
        if (this.f20767f == 0) {
            boolean z6 = this.f20775o.d() == 1;
            this.f20766e = z6;
            c cVar = this.f20774n;
            if (cVar != null) {
                cVar.a(z6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f20778r || !this.f20779s) {
            return;
        }
        if (this.f20773m != null) {
            if (this.f20774n == null) {
                this.f20774n = new c(this.f20768g, this.f20781u, this.f20765d, this.f20764c, this.f20766e, this.f20775o);
            }
            this.f20774n.a(this.f20763a);
            this.f20774n.b(this.f20776p);
            this.f20774n.c(this.f20777q);
            this.f20774n.a(this.f20766e, this.f20767f);
            this.f20774n.a(this.f20773m);
        } else {
            a(com.anythink.expressad.mbbanner.a.a.f20604h);
        }
        this.f20779s = false;
    }

    public final void c() {
        this.f20778r = true;
        if (this.f20772l != null) {
            this.f20772l = null;
        }
        if (this.f20782v != null) {
            this.f20782v = null;
        }
        if (this.f20781u != null) {
            this.f20781u = null;
        }
        if (this.f20768g != null) {
            this.f20768g = null;
        }
        com.anythink.expressad.mbbanner.a.d.a.a().a(4, this.f20764c);
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20764c);
        com.anythink.expressad.mbbanner.a.d.a.a().b();
        c cVar = this.f20774n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f20764c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20769h, this.f20770j * 1000);
        a9.a(4, str);
    }

    public final void e() {
        com.anythink.expressad.mbbanner.a.d.a a9 = com.anythink.expressad.mbbanner.a.d.a.a();
        String str = this.f20764c;
        new com.anythink.expressad.mbbanner.a.b.d(this.i + "x" + this.f20769h, this.f20770j * 1000);
        a9.a(3, str);
    }

    public final String b() {
        e eVar = this.f20773m;
        if (eVar != null) {
            return l.a(eVar.f19467K);
        }
        return "";
    }

    public final String a() {
        e eVar = this.f20773m;
        if (eVar != null && eVar.f() != null) {
            return this.f20773m.f();
        }
        return "";
    }

    public final void b(boolean z6) {
        this.f20776p = z6;
        m();
        i();
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f20769h = iVar.a();
            this.i = iVar.b();
        }
    }

    public final void a(boolean z6) {
        this.f20766e = z6;
        this.f20767f = z6 ? 1 : 2;
    }

    public final void a(e eVar) {
        this.f20773m = eVar;
        com.anythink.expressad.mbbanner.a.d.a.a().a(this.f20765d, this.f20764c, eVar, this.f20782v);
    }

    public final void a(h hVar) {
        this.f20772l = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        h hVar = this.f20772l;
        if (hVar != null) {
            hVar.a(str);
        }
    }

    public final void c(boolean z6) {
        this.f20777q = z6;
        m();
    }

    public final void a(int i, int i4, int i6, int i9) {
        c cVar = this.f20774n;
        if (cVar != null) {
            cVar.a(i, i4, i6, i9);
        }
    }
}
