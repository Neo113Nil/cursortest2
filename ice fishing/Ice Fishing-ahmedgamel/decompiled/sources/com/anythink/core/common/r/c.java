package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.n;
import com.anythink.core.d.l;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f16837l = "c";

    /* renamed from: a, reason: collision with root package name */
    String f16838a;

    /* renamed from: b, reason: collision with root package name */
    h f16839b;

    /* renamed from: c, reason: collision with root package name */
    int f16840c;

    /* renamed from: d, reason: collision with root package name */
    d f16841d;

    /* renamed from: e, reason: collision with root package name */
    int f16842e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16843f;

    /* renamed from: g, reason: collision with root package name */
    long f16844g;

    /* renamed from: h, reason: collision with root package name */
    String f16845h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    Boolean f16846j;

    /* renamed from: k, reason: collision with root package name */
    com.anythink.core.common.t.b f16847k;

    /* renamed from: m, reason: collision with root package name */
    private ATAdRequest f16848m;

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
        this.f16838a = str;
        StringBuilder c9 = AbstractC5050e.c(str, "_");
        c9.append(hashCode());
        this.f16845h = c9.toString();
    }

    private Boolean f() {
        return this.f16846j;
    }

    private void g() {
        if (this.f16843f && this.f16844g != -1) {
            this.f16847k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16847k, this.f16844g, false);
        }
    }

    private void h() {
        if (this.f16847k != null) {
            this.f16839b.toString();
            com.anythink.core.common.t.d.a().b(this.f16847k);
        }
    }

    private com.anythink.core.common.f i() {
        return com.anythink.core.common.f.a(t.b().g(), this.f16838a, String.valueOf(this.f16842e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        h();
        d dVar = this.f16841d;
        if (dVar != null) {
            dVar.a(this.f16845h, this.f16839b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        d dVar = this.f16841d;
        if (dVar != null) {
            dVar.b(this.f16845h, this.f16839b);
        }
    }

    private ar l() {
        com.anythink.core.common.h.d dVar;
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f14333c = this.f16840c;
        arVar.a(this.f16848m);
        h hVar = this.f16839b;
        if (hVar != null) {
            n nVar = hVar.f16874g;
            ar arVar2 = hVar.f16873f;
            l lVar = hVar.f16875h;
            g gVar = hVar.f16876j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f14331a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16840c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16839b.i);
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
        h hVar = this.f16839b;
        if (hVar != null) {
            hVar.toString();
        }
        com.anythink.core.common.f a9 = com.anythink.core.common.f.a(t.b().g(), this.f16838a, String.valueOf(this.f16842e));
        if (this.f16843f && this.f16844g != -1) {
            this.f16847k = new AnonymousClass1();
            com.anythink.core.common.t.d.a().a(this.f16847k, this.f16844g, false);
        }
        ar arVar = new ar();
        arVar.a(t.b().M());
        arVar.f14333c = this.f16840c;
        arVar.a(this.f16848m);
        h hVar2 = this.f16839b;
        if (hVar2 != null) {
            n nVar = hVar2.f16874g;
            ar arVar2 = hVar2.f16873f;
            l lVar = hVar2.f16875h;
            g gVar = hVar2.f16876j;
            if (arVar2 != null) {
                dVar = arVar2.i;
                if (dVar == null) {
                    dVar = new com.anythink.core.common.h.d();
                }
                dVar.a(arVar2.f14331a);
            } else {
                dVar = new com.anythink.core.common.h.d();
                if (this.f16840c == 17) {
                    dVar.b(nVar != null ? 1 : 2);
                }
            }
            dVar.a(this.f16839b.i);
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
        a9.a(t.b().g(), String.valueOf(this.f16842e), this.f16838a, arVar, new com.anythink.core.common.d.a() { // from class: com.anythink.core.common.r.c.2
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
        return this.f16840c;
    }

    public final String e() {
        return this.f16838a;
    }

    public final boolean b() {
        return this.f16846j == null || !this.i;
    }

    public final void a(b bVar) {
        h hVar = bVar.f16831a;
        this.f16839b = hVar;
        this.f16840c = bVar.f16832b;
        this.f16842e = hVar.f16868a;
        this.f16841d = bVar.f16835e;
        this.f16843f = bVar.f16833c;
        this.f16844g = bVar.f16834d;
        this.f16848m = bVar.f16836f;
    }

    public final String a() {
        return this.f16845h;
    }

    private void a(Boolean bool) {
        this.f16846j = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(AdError adError) {
        h();
        d dVar = this.f16841d;
        if (dVar != null) {
            dVar.a(this.f16845h, this.f16839b, adError);
        }
    }
}
