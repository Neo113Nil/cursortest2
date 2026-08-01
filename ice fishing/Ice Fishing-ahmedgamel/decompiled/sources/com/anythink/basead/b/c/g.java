package com.anythink.basead.b.c;

import android.text.TextUtils;
import com.anythink.basead.d.j;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b.a;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    long f5959b;

    /* renamed from: c, reason: collision with root package name */
    String f5960c;

    /* renamed from: d, reason: collision with root package name */
    a.C0095a f5961d;

    /* renamed from: e, reason: collision with root package name */
    private String f5962e;

    /* renamed from: f, reason: collision with root package name */
    private String f5963f;

    /* renamed from: g, reason: collision with root package name */
    private String f5964g;

    /* renamed from: h, reason: collision with root package name */
    private int f5965h;
    private w i;

    /* renamed from: j, reason: collision with root package name */
    private y f5966j;

    /* renamed from: k, reason: collision with root package name */
    private x f5967k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f5968l;

    /* renamed from: a, reason: collision with root package name */
    final String f5958a = "g";

    /* renamed from: m, reason: collision with root package name */
    private long f5969m = 0;

    public g(String str, final w wVar, y yVar, final x xVar) {
        this.f5960c = "";
        this.f5962e = wVar.E();
        this.i = wVar;
        this.f5966j = yVar;
        this.f5967k = xVar;
        this.f5963f = str;
        this.f5964g = wVar.v();
        this.f5965h = wVar.b();
        if (wVar instanceof bj) {
            this.f5960c = ((bj) wVar).aD();
        }
        this.f5968l = com.anythink.core.common.res.b.c.a().a(this.f5962e);
        this.f5959b = 0L;
        if (TextUtils.equals(String.valueOf(yVar.F()), "4") && yVar.aJ() != 1 && yVar.ac() > 0) {
            this.f5959b = yVar.x();
        }
        this.f5968l.a(new com.anythink.core.common.res.b.b(this.f5966j.ac(), this.f5966j.ae(), this.f5959b));
        this.f5968l.a(new a.b() { // from class: com.anythink.basead.b.c.g.1
            @Override // com.anythink.core.common.res.b.a.b
            public final boolean a(int i, long j6, long j9) {
                if (i < g.this.f5966j.ac()) {
                    return false;
                }
                if (g.this.f5961d != null) {
                    com.anythink.core.common.u.e.a(wVar, xVar, true, "", j9, j6, System.currentTimeMillis() - g.this.f5969m, g.this.f5961d.b(), g.this.f5961d.c(), g.this.f5961d.d());
                } else {
                    com.anythink.core.common.u.e.a(wVar, xVar, j9, j6, System.currentTimeMillis() - g.this.f5969m);
                }
                e.a().a(g.this.f5962e, i);
                return true;
            }

            @Override // com.anythink.core.common.res.b.a.b
            public final void a(String str2, String str3) {
                com.anythink.core.common.u.e.a(wVar, xVar, str3);
            }

            @Override // com.anythink.core.common.res.b.a.b
            public final void a(a.C0095a c0095a) {
                if (c0095a != null) {
                    g gVar = g.this;
                    gVar.f5961d = c0095a;
                    long j6 = gVar.f5959b;
                    if (j6 <= 0 || j6 != c0095a.a()) {
                        return;
                    }
                    String unused = g.this.f5964g;
                    String unused2 = g.this.f5962e;
                    c0095a.b();
                    c0095a.d();
                    g.this.f5966j.Q(g.this.f5961d.d());
                }
            }
        });
        this.f5968l.f16183k = new a.c() { // from class: com.anythink.basead.b.c.g.2
            @Override // com.anythink.core.common.res.b.a.c
            public final void a() {
                com.anythink.basead.b.b.a(30, wVar, new j("", ""));
            }

            @Override // com.anythink.core.common.res.b.a.c
            public final void a(String str2, String str3) {
                e.a().a(g.this.f5962e, com.anythink.basead.d.g.a(str2, str3));
            }
        };
    }

    public final void a() {
        this.f5969m = System.currentTimeMillis();
        this.f5968l.e();
    }
}
