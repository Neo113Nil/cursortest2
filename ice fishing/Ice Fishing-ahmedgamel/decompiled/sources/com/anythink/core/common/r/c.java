package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.n;
import com.anythink.core.d.l;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f16050l = "c";

    /* renamed from: a, reason: collision with root package name */
    String f16051a;

    /* renamed from: b, reason: collision with root package name */
    h f16052b;

    /* renamed from: c, reason: collision with root package name */
    int f16053c;

    /* renamed from: d, reason: collision with root package name */
    d f16054d;

    /* renamed from: e, reason: collision with root package name */
    int f16055e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16056f;

    /* renamed from: g, reason: collision with root package name */
    long f16057g;

    /* renamed from: h, reason: collision with root package name */
    String f16058h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    Boolean f16059j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.t.b f16060k;

    /* renamed from: m, reason: collision with root package name */
    private ATAdRequest f16061m;

    /* renamed from: com.anythink.core.common.r.c$1, reason: invalid class name */
    public class AnonymousClass1 implements com.anythink.core.common.t.b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.k();
        }
    }

    public c(String str) {
        this.f16051a = str;
        StringBuilder c9 = AbstractC5049e.c(str, "_");
        c9.append(hashCode());
        this.f16058h = c9.toString();
    }

    private Boolean f() {
        return this.f16059j;
    }

    private void g() {
        if (this.f16056f && this.f16057g != -1) {
            this.f16060k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16060k, this.f16057g, false);
        }
    }

    private void h() {
        if (this.f16060k != null) {
            this.f16052b.toString();
            com.anythink.core.common.t.d.a().b(this.f16060k);
        }
    }

    private com.anythink.core.common.f i() {
        return com.anythink.core.common.f.a(t.b().g(), this.f16051a, String.valueOf(this.f16055e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        h();
        d dVar = this.f16054d;
        if (dVar != null) {
            dVar.a(this.f16058h, this.f16052b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        d dVar = this.f16054d;
        if (dVar != null) {
            dVar.b(this.f16058h, this.f16052b);
        }
    }

    private ar l() {
        com.anythink.core.common.h.d dVar;
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f13547c = this.f16053c;
        arVar.a(this.f16061m);
        h hVar = this.f16052b;
        if (hVar != null) {
            n nVar = hVar.f16087g;
            ar arVar2 = hVar.f16086f;
            l lVar = hVar.f16088h;
            g gVar = hVar.f16089j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f13545a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16053c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16052b.i);
            if (nVar != null) {
                dVar.a(nVar.aI(), nVar.Z(), nVar.aG());
            } else if (lVar != null) {
                dVar.a(lVar.i(), lVar.ay(), lVar.ai());
            }
            if (gVar != null) {
                dVar.b(gVar.h());
                dVar.a(gVar.f());
                dVar.a(gVar.i());
            }
        } else {
            dVar = null;
        }
        arVar.i = dVar;
        return arVar;
    }

    public final void c() {
        com.anythink.core.common.h.d dVar;
        h hVar = this.f16052b;
        if (hVar != null) {
            hVar.toString();
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().g(), this.f16051a, String.valueOf(this.f16055e));
        if (this.f16056f && this.f16057g != -1) {
            this.f16060k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16060k, this.f16057g, false);
        }
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f13547c = this.f16053c;
        arVar.a(this.f16061m);
        h hVar2 = this.f16052b;
        if (hVar2 != null) {
            n nVar = hVar2.f16087g;
            ar arVar2 = hVar2.f16086f;
            l lVar = hVar2.f16088h;
            g gVar = hVar2.f16089j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f13545a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16053c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16052b.i);
            if (nVar != null) {
                dVar.a(nVar.aI(), nVar.Z(), nVar.aG());
            } else if (lVar != null) {
                dVar.a(lVar.i(), lVar.ay(), lVar.ai());
            }
            if (gVar != null) {
                dVar.b(gVar.h());
                dVar.a(gVar.f());
                dVar.a(gVar.i());
            }
        } else {
            dVar = null;
        }
        arVar.i = dVar;
        a9.a(t.b().g(), String.valueOf(this.f16055e), this.f16051a, arVar, new com.anythink.core.common.d.a() { // from class: com.anythink.core.common.r.c.2
            @Override // com.anythink.core.common.d.a
            public final void onAdLoadFail(AdError adError) {
                c.this.a(adError);
            }

            @Override // com.anythink.core.common.d.a
            public final void onAdLoaded() {
                c.this.j();
            }
        });
    }

    public final int d() {
        return this.f16053c;
    }

    public final String e() {
        return this.f16051a;
    }

    public final boolean b() {
        return this.f16059j == null || !this.i;
    }

    public final void a(b bVar) {
        h hVar = bVar.f16044a;
        this.f16052b = hVar;
        this.f16053c = bVar.f16045b;
        this.f16055e = hVar.f16081a;
        this.f16054d = bVar.f16048e;
        this.f16056f = bVar.f16046c;
        this.f16057g = bVar.f16047d;
        this.f16061m = bVar.f16049f;
    }

    public final String a() {
        return this.f16058h;
    }

    private void a(Boolean bool) {
        this.f16059j = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(AdError adError) {
        h();
        d dVar = this.f16054d;
        if (dVar != null) {
            dVar.a(this.f16058h, this.f16052b, adError);
        }
    }
}
