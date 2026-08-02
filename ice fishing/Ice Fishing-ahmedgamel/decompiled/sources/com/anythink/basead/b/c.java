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
    public static final int f6652a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6653b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6654c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6655d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6656e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6657f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final int f6658g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f6659h = 1;
    w i;

    /* renamed from: k, reason: collision with root package name */
    Context f6661k;

    /* renamed from: l, reason: collision with root package name */
    x f6662l;

    /* renamed from: m, reason: collision with root package name */
    IOfferClickHandler f6663m;

    /* renamed from: n, reason: collision with root package name */
    boolean f6664n;

    /* renamed from: o, reason: collision with root package name */
    s f6665o;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.b.b.k f6668r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.basead.b.b.b f6669s;

    /* renamed from: t, reason: collision with root package name */
    private a.C0006a f6670t;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.basead.b.b.h f6671u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.basead.b.b.d f6672v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.b.b.c f6673w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.b.b.i f6674x;

    /* renamed from: y, reason: collision with root package name */
    private o f6675y;

    /* renamed from: z, reason: collision with root package name */
    private com.anythink.basead.b.b.g f6676z;

    /* renamed from: p, reason: collision with root package name */
    private final String f6666p = "c";

    /* renamed from: q, reason: collision with root package name */
    private final int f6667q = 10;

    /* renamed from: j, reason: collision with root package name */
    boolean f6660j = false;

    /* renamed from: com.anythink.basead.b.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.d.j f6677a;

        public AnonymousClass1(com.anythink.basead.d.j jVar) {
            this.f6677a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f6671u.a().a()) {
                return;
            }
            c cVar = c.this;
            int f2 = e.f(cVar.i, cVar.f6662l);
            if (f2 == 1) {
                c.this.f6673w.a(c.this.f6673w.d(), com.anythink.basead.b.b.e.HANDLE_SUCCESS_WITH_WEB_CLICK);
                n a9 = c.this.f6672v.a();
                c cVar2 = c.this;
                com.anythink.core.common.u.e.a(cVar2.i, cVar2.f6662l, 1, a9.a() ? 1 : 2);
                return;
            }
            if (f2 > 1) {
                c cVar3 = c.this;
                com.anythink.core.common.u.e.a(cVar3.i, cVar3.f6662l, f2, 0);
            }
            com.anythink.basead.d.j jVar = this.f6677a;
            if (!jVar.f7003m) {
                c cVar4 = c.this;
                if (cVar4.f6664n && e.a(cVar4.i, cVar4.f6662l.f14954o, jVar, 1)) {
                    c cVar5 = c.this;
                    cVar5.f6665o.openDataConfirmDialog(cVar5.f6661k, cVar5.i, cVar5.f6662l, new com.anythink.core.common.k.a() { // from class: com.anythink.basead.b.c.1.1
                        @Override // com.anythink.core.common.k.a
                        public final void a(boolean z6) {
                            if (z6) {
                                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.1.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c.a(c.this, anonymousClass1.f6677a);
                                    }
                                }, 2);
                            } else if (c.this.f6669s != null) {
                                c.this.f6669s.c();
                            }
                        }
                    });
                    return;
                }
            }
            c.a(c.this, this.f6677a);
        }
    }

    /* renamed from: com.anythink.basead.b.c$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.core.common.k.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.b.b.e f6681a;

        public AnonymousClass2(com.anythink.basead.b.b.e eVar) {
            this.f6681a = eVar;
        }

        @Override // com.anythink.core.common.k.a
        public final void a(boolean z6) {
            if (z6) {
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        c.this.a(anonymousClass2.f6681a);
                    }
                }, 2);
            } else if (c.this.f6669s != null) {
                c.this.f6669s.c();
            }
        }
    }

    public interface a {
        void a();

        void a(boolean z6);

        boolean a(String str, IOfferClickHandler iOfferClickHandler);

        void b();

        void c();
    }

    public c(Context context, x xVar, w wVar, View view) {
        boolean z6 = false;
        this.f6664n = false;
        this.i = wVar;
        this.f6662l = xVar;
        this.f6661k = context.getApplicationContext();
        this.i.h(xVar.f14944d);
        this.f6663m = new OfferClickHandler();
        this.f6668r = new com.anythink.basead.b.b.k(wVar, xVar);
        this.f6669s = new com.anythink.basead.b.b.b();
        a.C0006a c0006a = new a.C0006a();
        this.f6670t = c0006a;
        c0006a.f6535a = this.f6661k;
        c0006a.f6536b = this.i;
        c0006a.f6537c = this.f6662l;
        c0006a.f6538d = this.f6668r;
        c0006a.f6539e = this.f6669s;
        c0006a.f6540f = this.f6663m;
        this.f6671u = new com.anythink.basead.b.b.h(c0006a);
        this.f6672v = new com.anythink.basead.b.b.d(this.f6670t);
        this.f6673w = new com.anythink.basead.b.b.c(this.f6670t);
        this.f6674x = new com.anythink.basead.b.b.i(this.f6670t);
        this.f6675y = new o(this.f6670t);
        this.f6676z = new com.anythink.basead.b.b.g(this.f6670t);
        if (view != null) {
            this.f6672v.a(new WeakReference<>(view));
        }
        this.f6672v.a(this.f6673w);
        this.f6673w.a(this.f6672v);
        s c9 = t.b().c();
        this.f6665o = c9;
        if (c9 != null && c9.a()) {
            z6 = true;
        }
        this.f6664n = z6;
    }

    private void b(com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (this.f6662l.f14954o.v() != 2) {
            eVar = this.f6672v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && this.f6662l.f14954o.v() == 1) {
            return;
        }
        if (jVar.f7003m || !this.f6664n || eVar == eVar2 || !e.a(this.i, this.f6662l.f14954o, jVar, 4)) {
            a(eVar);
        } else {
            this.f6665o.openDataConfirmDialog(this.f6661k, this.i, this.f6662l, new AnonymousClass2(eVar));
        }
    }

    public final void a(a aVar) {
        com.anythink.basead.b.b.b bVar = this.f6669s;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    public final x c() {
        return this.f6662l;
    }

    public final void d() {
        this.f6660j = true;
        com.anythink.basead.b.b.b bVar = this.f6669s;
        if (bVar != null) {
            bVar.f();
            this.f6669s = null;
        }
        com.anythink.basead.b.b.d dVar = this.f6672v;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final boolean a() {
        com.anythink.basead.b.b.b bVar = this.f6669s;
        if (bVar != null) {
            return bVar.e();
        }
        return false;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        com.anythink.basead.d.a aVar;
        if (this.f6660j || a()) {
            return;
        }
        com.anythink.basead.b.b.k kVar = this.f6668r;
        if (kVar != null) {
            kVar.a(jVar);
        }
        com.anythink.basead.b.b.b bVar = this.f6669s;
        if (bVar != null) {
            bVar.d();
        }
        if (jVar != null && (aVar = jVar.i) != null) {
            int i = aVar.f6906n;
            int i4 = aVar.f6907o;
        }
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass1(jVar), 2);
    }

    public final w b() {
        return this.i;
    }

    public final void a(com.anythink.basead.b.b.e eVar) {
        n a9;
        n a10;
        int K7 = this.i.K();
        String d9 = this.f6673w.d();
        if (K7 == 1) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6674x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6673w.a(d9, eVar);
            }
            a10 = a9;
        } else if (K7 == 2) {
            a10 = this.f6673w.a(d9, eVar);
        } else if (K7 == 3) {
            a10 = this.f6673w.a(d9, eVar);
        } else if (K7 == 4) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6674x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6673w.a(d9, eVar);
            }
            a10 = a9;
        } else if (K7 == 6) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6675y.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6673w.a(d9, eVar);
            }
            a10 = a9;
        } else if (K7 != 7) {
            a10 = this.f6673w.a(d9, eVar);
        } else {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f6676z.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f6673w.a(d9, eVar);
            }
            a10 = a9;
        }
        com.anythink.basead.b.b.b bVar = this.f6669s;
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
                        Toast.makeText(applicationContext.getApplicationContext(), q.a(applicationContext, "myoffer_click_no_response", com.anythink.expressad.foundation.h.k.f20423g), 0).show();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (cVar.f6662l.f14954o.v() != 2) {
            eVar = cVar.f6672v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && cVar.f6662l.f14954o.v() == 1) {
            return;
        }
        if (!jVar.f7003m && cVar.f6664n && eVar != eVar2 && e.a(cVar.i, cVar.f6662l.f14954o, jVar, 4)) {
            cVar.f6665o.openDataConfirmDialog(cVar.f6661k, cVar.i, cVar.f6662l, cVar.new AnonymousClass2(eVar));
        } else {
            cVar.a(eVar);
        }
    }
}
