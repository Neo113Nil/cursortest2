package com.anythink.basead.b;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.anythink.basead.b.b.a;
import com.anythink.basead.b.b.n;
import com.anythink.basead.b.b.o;
import com.anythink.basead.handler.OfferClickHandler;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6023a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6024b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6025c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6026d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6027e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6028f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6029g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6030h = 1;
    w i;

    /* renamed from: k, reason: collision with root package name */
    Context f6032k;

    /* renamed from: l, reason: collision with root package name */
    x f6033l;

    /* renamed from: m, reason: collision with root package name */
    IOfferClickHandler f6034m;

    /* renamed from: n, reason: collision with root package name */
    boolean f6035n;

    /* renamed from: o, reason: collision with root package name */
    s f6036o;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.b.b.k f6039r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.basead.b.b.b f6040s;

    /* renamed from: t, reason: collision with root package name */
    private a.C0005a f6041t;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.basead.b.b.h f6042u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.basead.b.b.d f6043v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.b.b.c f6044w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.b.b.i f6045x;

    /* renamed from: y, reason: collision with root package name */
    private o f6046y;

    /* renamed from: z, reason: collision with root package name */
    private com.anythink.basead.b.b.g f6047z;

    /* renamed from: p, reason: collision with root package name */
    private final String f6037p = "c";

    /* renamed from: q, reason: collision with root package name */
    private final int f6038q = 10;

    /* renamed from: j, reason: collision with root package name */
    boolean f6031j = false;

    /* renamed from: com.anythink.basead.b.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.d.j f6048a;

        public AnonymousClass1(com.anythink.basead.d.j jVar) {
            this.f6048a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f6042u.a().a()) {
                return;
            }
            c cVar = c.this;
            int f6 = e.f(cVar.i, cVar.f6033l);
            if (f6 == 1) {
                c.this.f6044w.a(c.this.f6044w.d(), com.anythink.basead.b.b.e.HANDLE_SUCCESS_WITH_WEB_CLICK);
                n a9 = c.this.f6043v.a();
                c cVar2 = c.this;
                com.anythink.core.common.u.e.a(cVar2.i, cVar2.f6033l, 1, a9.a() ? 1 : 2);
                return;
            }
            if (f6 > 1) {
                c cVar3 = c.this;
                com.anythink.core.common.u.e.a(cVar3.i, cVar3.f6033l, f6, 0);
            }
            com.anythink.basead.d.j jVar = this.f6048a;
            if (!jVar.f6374m) {
                c cVar4 = c.this;
                if (cVar4.f6035n && e.a(cVar4.i, cVar4.f6033l.f14325o, jVar, 1)) {
                    c cVar5 = c.this;
                    cVar5.f6036o.openDataConfirmDialog(cVar5.f6032k, cVar5.i, cVar5.f6033l, new com.anythink.core.common.k.a() { // from class: com.anythink.basead.b.c.1.1
                        @Override // com.anythink.core.common.k.a
                        public final void a(boolean z8) {
                            if (z8) {
                                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.1.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c.a(c.this, anonymousClass1.f6048a);
                                    }
                                }, 2);
                            } else if (c.this.f6040s != null) {
                                c.this.f6040s.c();
                            }
                        }
                    });
                    return;
                }
            }
            c.a(c.this, this.f6048a);
        }
    }

    /* renamed from: com.anythink.basead.b.c$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.core.common.k.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.b.b.e f6052a;

        public AnonymousClass2(com.anythink.basead.b.b.e eVar) {
            this.f6052a = eVar;
        }

        @Override // com.anythink.core.common.k.a
        public final void a(boolean z8) {
            if (z8) {
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        c.this.a(anonymousClass2.f6052a);
                    }
                }, 2);
            } else if (c.this.f6040s != null) {
                c.this.f6040s.c();
            }
        }
    }

    public interface a {
        void a();

        void a(boolean z8);

        boolean a(String str, IOfferClickHandler iOfferClickHandler);

        void b();

        void c();
    }

    public c(Context context, x xVar, w wVar, View view) {
        boolean z8 = false;
        this.f6035n = false;
        this.i = wVar;
        this.f6033l = xVar;
        this.f6032k = context.getApplicationContext();
        this.i.h(xVar.f14315d);
        this.f6034m = new OfferClickHandler();
        this.f6039r = new com.anythink.basead.b.b.k(wVar, xVar);
        this.f6040s = new com.anythink.basead.b.b.b();
        a.C0005a c0005a = new a.C0005a();
        this.f6041t = c0005a;
        c0005a.f5906a = this.f6032k;
        c0005a.f5907b = this.i;
        c0005a.f5908c = this.f6033l;
        c0005a.f5909d = this.f6039r;
        c0005a.f5910e = this.f6040s;
        c0005a.f5911f = this.f6034m;
        this.f6042u = new com.anythink.basead.b.b.h(c0005a);
        this.f6043v = new com.anythink.basead.b.b.d(this.f6041t);
        this.f6044w = new com.anythink.basead.b.b.c(this.f6041t);
        this.f6045x = new com.anythink.basead.b.b.i(this.f6041t);
        this.f6046y = new o(this.f6041t);
        this.f6047z = new com.anythink.basead.b.b.g(this.f6041t);
        if (view != null) {
            this.f6043v.a(new WeakReference<>(view));
        }
        this.f6043v.a(this.f6044w);
        this.f6044w.a(this.f6043v);
        s c4 = t.b().c();
        this.f6036o = c4;
        if (c4 != null && c4.a()) {
            z8 = true;
        }
        this.f6035n = z8;
    }

    private void b(com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (this.f6033l.f14325o.v() != 2) {
            eVar = this.f6043v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && this.f6033l.f14325o.v() == 1) {
            return;
        }
        if (jVar.f6374m || !this.f6035n || eVar == eVar2 || !e.a(this.i, this.f6033l.f14325o, jVar, 4)) {
            a(eVar);
        } else {
            this.f6036o.openDataConfirmDialog(this.f6032k, this.i, this.f6033l, new AnonymousClass2(eVar));
        }
    }

    public final void a(a aVar) {
        com.anythink.basead.b.b.b bVar = this.f6040s;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    public final x c() {
        return this.f6033l;
    }

    public final void d() {
        this.f6031j = true;
        com.anythink.basead.b.b.b bVar = this.f6040s;
        if (bVar != null) {
            bVar.f();
            this.f6040s = null;
        }
        com.anythink.basead.b.b.d dVar = this.f6043v;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final boolean a() {
        com.anythink.basead.b.b.b bVar = this.f6040s;
        if (bVar != null) {
            return bVar.e();
        }
        return false;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        com.anythink.basead.d.a aVar;
        if (this.f6031j || a()) {
            return;
        }
        com.anythink.basead.b.b.k kVar = this.f6039r;
        if (kVar != null) {
            kVar.a(jVar);
        }
        com.anythink.basead.b.b.b bVar = this.f6040s;
        if (bVar != null) {
            bVar.d();
        }
        if (jVar != null && (aVar = jVar.i) != null) {
            int i = aVar.f6277n;
            int i4 = aVar.f6278o;
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(jVar), 2);
    }

    public final w b() {
        return this.i;
    }

    public final void a(com.anythink.basead.b.b.e eVar) {
        n a9;
        n a10;
        int K8 = this.i.K();
        String d2 = this.f6044w.d();
        if (K8 == 1) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6045x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6044w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K8 == 2) {
            a10 = this.f6044w.a(d2, eVar);
        } else if (K8 == 3) {
            a10 = this.f6044w.a(d2, eVar);
        } else if (K8 == 4) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6045x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6044w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K8 == 6) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6046y.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6044w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K8 != 7) {
            a10 = this.f6044w.a(d2, eVar);
        } else {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6047z.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6044w.a(d2, eVar);
            }
            a10 = a9;
        }
        com.anythink.basead.b.b.b bVar = this.f6040s;
        if (bVar != null) {
            bVar.c();
        }
        if (a10 == null || a10.a()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.3
            @Override // java.lang.Runnable
            public final void run() {
                Context g9 = t.b().g();
                if (g9 != null) {
                    Context applicationContext = g9.getApplicationContext();
                    try {
                        Toast.makeText(applicationContext.getApplicationContext(), q.a(applicationContext, "myoffer_click_no_response", com.anythink.expressad.foundation.h.k.f19794g), 0).show();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (cVar.f6033l.f14325o.v() != 2) {
            eVar = cVar.f6043v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && cVar.f6033l.f14325o.v() == 1) {
            return;
        }
        if (!jVar.f6374m && cVar.f6035n && eVar != eVar2 && e.a(cVar.i, cVar.f6033l.f14325o, jVar, 4)) {
            cVar.f6036o.openDataConfirmDialog(cVar.f6032k, cVar.i, cVar.f6033l, cVar.new AnonymousClass2(eVar));
        } else {
            cVar.a(eVar);
        }
    }
}
