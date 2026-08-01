package com.anythink.core.common.n.b.a.a;

import com.anythink.core.common.n.b.a.a.c;
import com.anythink.core.common.n.b.a.c.h;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    final f f14870a;

    /* renamed from: com.anythink.core.common.n.b.a.a.a$1, reason: invalid class name */
    public class AnonymousClass1 implements com.anythink.core.common.n.c.w {

        /* renamed from: a, reason: collision with root package name */
        boolean f14871a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.n.c.e f14872b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f14873c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.n.c.d f14874d;

        public AnonymousClass1(com.anythink.core.common.n.c.e eVar, b bVar, com.anythink.core.common.n.c.d dVar) {
            this.f14872b = eVar;
            this.f14873c = bVar;
            this.f14874d = dVar;
        }

        @Override // com.anythink.core.common.n.c.w
        public final x a() {
            return this.f14872b.a();
        }

        @Override // com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j6) {
            try {
                long a_ = this.f14872b.a_(cVar, j6);
                if (a_ != -1) {
                    cVar.a(this.f14874d.c(), cVar.b() - a_, a_);
                    this.f14874d.A();
                    return a_;
                }
                if (!this.f14871a) {
                    this.f14871a = true;
                    this.f14874d.close();
                }
                return -1L;
            } catch (IOException e9) {
                if (this.f14871a) {
                    throw e9;
                }
                this.f14871a = true;
                this.f14873c.a();
                throw e9;
            }
        }

        @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f14871a && !com.anythink.core.common.n.b.a.c.a(this, TimeUnit.MILLISECONDS)) {
                this.f14871a = true;
                this.f14873c.a();
            }
            this.f14872b.close();
        }
    }

    public a(f fVar) {
        this.f14870a = fVar;
    }

    private static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    @Override // com.anythink.core.common.n.b.w
    public final af a(w.a aVar) {
        v b9;
        f fVar = this.f14870a;
        af a9 = fVar != null ? fVar.a(aVar.a()) : null;
        c a10 = new c.a(System.currentTimeMillis(), aVar.a(), a9).a();
        ad adVar = a10.f14876a;
        af afVar = a10.f14877b;
        f fVar2 = this.f14870a;
        if (fVar2 != null) {
            fVar2.a(a10);
        }
        if (a9 != null && afVar == null) {
            com.anythink.core.common.n.b.a.c.a(a9.g());
        }
        if (adVar == null && afVar == null) {
            return new af.a().a(aVar.a()).a(ab.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(com.anythink.core.common.n.b.a.c.f15039d).a(-1L).b(System.currentTimeMillis()).a();
        }
        if (adVar == null) {
            return afVar.h().b(a(afVar)).a();
        }
        try {
            af a11 = aVar.a(adVar);
            if (a11 == null && a9 != null) {
            }
            if (afVar != null) {
                if (a11.c() == 304) {
                    af.a h9 = afVar.h();
                    u f3 = afVar.f();
                    u f9 = a11.f();
                    u.a aVar2 = new u.a();
                    int a12 = f3.a();
                    for (int i = 0; i < a12; i++) {
                        String a13 = f3.a(i);
                        String b10 = f3.b(i);
                        if ((!"Warning".equalsIgnoreCase(a13) || !b10.startsWith("1")) && (b(a13) || !a(a13) || f9.a(a13) == null)) {
                            com.anythink.core.common.n.b.a.a.f14869a.a(aVar2, a13, b10);
                        }
                    }
                    int a14 = f9.a();
                    for (int i6 = 0; i6 < a14; i6++) {
                        String a15 = f9.a(i6);
                        if (!b(a15) && a(a15)) {
                            com.anythink.core.common.n.b.a.a.f14869a.a(aVar2, a15, f9.b(i6));
                        }
                    }
                    af a16 = h9.a(aVar2.a()).a(a11.l()).b(a11.m()).b(a(afVar)).a(a(a11)).a();
                    a11.g().close();
                    this.f14870a.a();
                    this.f14870a.a(afVar, a16);
                    return a16;
                }
                com.anythink.core.common.n.b.a.c.a(afVar.g());
            }
            af a17 = a11.h().b(a(afVar)).a(a(a11)).a();
            if (this.f14870a != null) {
                if (com.anythink.core.common.n.b.a.c.e.d(a17) && c.a(a17, adVar)) {
                    b a18 = this.f14870a.a(a17);
                    if (a18 != null && (b9 = a18.b()) != null) {
                        return a17.h().a(new h(a17.a("Content-Type"), a17.g().b(), n.a(new AnonymousClass1(a17.g().c(), a18, n.a(b9))))).a();
                    }
                } else if (com.anythink.core.common.n.b.a.c.f.a(adVar.b())) {
                    try {
                        this.f14870a.b(adVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return a17;
        } finally {
            if (a9 != null) {
                com.anythink.core.common.n.b.a.c.a(a9.g());
            }
        }
    }

    private static af a(af afVar) {
        return (afVar == null || afVar.g() == null) ? afVar : afVar.h().a((ag) null).a();
    }

    private af a(b bVar, af afVar) {
        v b9;
        if (bVar == null || (b9 = bVar.b()) == null) {
            return afVar;
        }
        return afVar.h().a(new h(afVar.a("Content-Type"), afVar.g().b(), n.a(new AnonymousClass1(afVar.g().c(), bVar, n.a(b9))))).a();
    }

    private static u a(u uVar, u uVar2) {
        u.a aVar = new u.a();
        int a9 = uVar.a();
        for (int i = 0; i < a9; i++) {
            String a10 = uVar.a(i);
            String b9 = uVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a10) || !b9.startsWith("1")) && (b(a10) || !a(a10) || uVar2.a(a10) == null)) {
                com.anythink.core.common.n.b.a.a.f14869a.a(aVar, a10, b9);
            }
        }
        int a11 = uVar2.a();
        for (int i6 = 0; i6 < a11; i6++) {
            String a12 = uVar2.a(i6);
            if (!b(a12) && a(a12)) {
                com.anythink.core.common.n.b.a.a.f14869a.a(aVar, a12, uVar2.b(i6));
            }
        }
        return aVar.a();
    }

    private static boolean a(String str) {
        return ("Connection".equalsIgnoreCase(str) || com.anythink.expressad.foundation.g.f.g.b.f19340c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
