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
    long f6745b;

    /* renamed from: c, reason: collision with root package name */
    String f6746c;

    /* renamed from: d, reason: collision with root package name */
    a.C0095a f6747d;

    /* renamed from: e, reason: collision with root package name */
    private String f6748e;

    /* renamed from: f, reason: collision with root package name */
    private String f6749f;

    /* renamed from: g, reason: collision with root package name */
    private String f6750g;

    /* renamed from: h, reason: collision with root package name */
    private int f6751h;
    private w i;

    /* renamed from: j, reason: collision with root package name */
    private y f6752j;

    /* renamed from: k, reason: collision with root package name */
    private x f6753k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f6754l;

    /* renamed from: a, reason: collision with root package name */
    final String f6744a = "g";

    /* renamed from: m, reason: collision with root package name */
    private long f6755m = 0;

    public g(String str, final w wVar, y yVar, final x xVar) {
        this.f6746c = "";
        this.f6748e = wVar.E();
        this.i = wVar;
        this.f6752j = yVar;
        this.f6753k = xVar;
        this.f6749f = str;
        this.f6750g = wVar.v();
        this.f6751h = wVar.b();
        if (wVar instanceof bj) {
            this.f6746c = ((bj) wVar).aD();
        }
        this.f6754l = com.anythink.core.common.res.b.c.a().a(this.f6748e);
        this.f6745b = 0L;
        if (TextUtils.equals(String.valueOf(yVar.F()), "4") && yVar.aJ() != 1 && yVar.ac() > 0) {
            this.f6745b = yVar.x();
        }
        this.f6754l.a(new com.anythink.core.common.res.b.b(this.f6752j.ac(), this.f6752j.ae(), this.f6745b));
        this.f6754l.a(new a.b() { // from class: com.anythink.basead.b.c.g.1
            @Override // com.anythink.core.common.res.b.a.b
            public final boolean a(int i, long j6, long j9) {
                if (i < g.this.f6752j.ac()) {
                    return false;
                }
                if (g.this.f6747d != null) {
                    com.anythink.core.common.u.e.a(wVar, xVar, true, "", j9, j6, System.currentTimeMillis() - g.this.f6755m, g.this.f6747d.b(), g.this.f6747d.c(), g.this.f6747d.d());
                } else {
                    com.anythink.core.common.u.e.a(wVar, xVar, j9, j6, System.currentTimeMillis() - g.this.f6755m);
                }
                e.a().a(g.this.f6748e, i);
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
                    gVar.f6747d = c0095a;
                    long j6 = gVar.f6745b;
                    if (j6 <= 0 || j6 != c0095a.a()) {
                        return;
                    }
                    String unused = g.this.f6750g;
                    String unused2 = g.this.f6748e;
                    c0095a.b();
                    c0095a.d();
                    g.this.f6752j.Q(g.this.f6747d.d());
                }
            }
        });
        this.f6754l.f16970k = new a.c() { // from class: com.anythink.basead.b.c.g.2
            @Override // com.anythink.core.common.res.b.a.c
            public final void a() {
                com.anythink.basead.b.b.a(30, wVar, new j("", ""));
            }

            @Override // com.anythink.core.common.res.b.a.c
            public final void a(String str2, String str3) {
                e.a().a(g.this.f6748e, com.anythink.basead.d.g.a(str2, str3));
            }
        };
    }

    public final void a() {
        this.f6755m = System.currentTimeMillis();
        this.f6754l.e();
    }
}
