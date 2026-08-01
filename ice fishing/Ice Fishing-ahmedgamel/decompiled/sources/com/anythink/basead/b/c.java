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
    public static final int f5866a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5867b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5868c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5869d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5870e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5871f = 7;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5872g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5873h = 1;
    w i;

    /* renamed from: k, reason: collision with root package name */
    Context f5875k;

    /* renamed from: l, reason: collision with root package name */
    x f5876l;

    /* renamed from: m, reason: collision with root package name */
    IOfferClickHandler f5877m;

    /* renamed from: n, reason: collision with root package name */
    boolean f5878n;

    /* renamed from: o, reason: collision with root package name */
    s f5879o;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.basead.b.b.k f5882r;

    /* renamed from: s, reason: collision with root package name */
    private com.anythink.basead.b.b.b f5883s;

    /* renamed from: t, reason: collision with root package name */
    private a.C0006a f5884t;

    /* renamed from: u, reason: collision with root package name */
    private com.anythink.basead.b.b.h f5885u;

    /* renamed from: v, reason: collision with root package name */
    private com.anythink.basead.b.b.d f5886v;

    /* renamed from: w, reason: collision with root package name */
    private com.anythink.basead.b.b.c f5887w;

    /* renamed from: x, reason: collision with root package name */
    private com.anythink.basead.b.b.i f5888x;

    /* renamed from: y, reason: collision with root package name */
    private o f5889y;

    /* renamed from: z, reason: collision with root package name */
    private com.anythink.basead.b.b.g f5890z;

    /* renamed from: p, reason: collision with root package name */
    private final String f5880p = "c";

    /* renamed from: q, reason: collision with root package name */
    private final int f5881q = 10;

    /* renamed from: j, reason: collision with root package name */
    boolean f5874j = false;

    /* renamed from: com.anythink.basead.b.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.d.j f5891a;

        public AnonymousClass1(com.anythink.basead.d.j jVar) {
            this.f5891a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.f5885u.a().a()) {
                return;
            }
            c cVar = c.this;
            int f3 = e.f(cVar.i, cVar.f5876l);
            if (f3 == 1) {
                c.this.f5887w.a(c.this.f5887w.d(), com.anythink.basead.b.b.e.HANDLE_SUCCESS_WITH_WEB_CLICK);
                n a9 = c.this.f5886v.a();
                c cVar2 = c.this;
                com.anythink.core.common.u.e.a(cVar2.i, cVar2.f5876l, 1, a9.a() ? 1 : 2);
                return;
            }
            if (f3 > 1) {
                c cVar3 = c.this;
                com.anythink.core.common.u.e.a(cVar3.i, cVar3.f5876l, f3, 0);
            }
            com.anythink.basead.d.j jVar = this.f5891a;
            if (!jVar.f6217m) {
                c cVar4 = c.this;
                if (cVar4.f5878n && e.a(cVar4.i, cVar4.f5876l.f14168o, jVar, 1)) {
                    c cVar5 = c.this;
                    cVar5.f5879o.openDataConfirmDialog(cVar5.f5875k, cVar5.i, cVar5.f5876l, new com.anythink.core.common.k.a() { // from class: com.anythink.basead.b.c.1.1
                        @Override // com.anythink.core.common.k.a
                        public final void a(boolean z3) {
                            if (z3) {
                                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.1.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c.a(c.this, anonymousClass1.f5891a);
                                    }
                                }, 2);
                            } else if (c.this.f5883s != null) {
                                c.this.f5883s.c();
                            }
                        }
                    });
                    return;
                }
            }
            c.a(c.this, this.f5891a);
        }
    }

    /* renamed from: com.anythink.basead.b.c$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.core.common.k.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.basead.b.b.e f5895a;

        public AnonymousClass2(com.anythink.basead.b.b.e eVar) {
            this.f5895a = eVar;
        }

        @Override // com.anythink.core.common.k.a
        public final void a(boolean z3) {
            if (z3) {
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.b.c.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        c.this.a(anonymousClass2.f5895a);
                    }
                }, 2);
            } else if (c.this.f5883s != null) {
                c.this.f5883s.c();
            }
        }
    }

    public interface a {
        void a();

        void a(boolean z3);

        boolean a(String str, IOfferClickHandler iOfferClickHandler);

        void b();

        void c();
    }

    public c(Context context, x xVar, w wVar, View view) {
        boolean z3 = false;
        this.f5878n = false;
        this.i = wVar;
        this.f5876l = xVar;
        this.f5875k = context.getApplicationContext();
        this.i.h(xVar.f14158d);
        this.f5877m = new OfferClickHandler();
        this.f5882r = new com.anythink.basead.b.b.k(wVar, xVar);
        this.f5883s = new com.anythink.basead.b.b.b();
        a.C0006a c0006a = new a.C0006a();
        this.f5884t = c0006a;
        c0006a.f5749a = this.f5875k;
        c0006a.f5750b = this.i;
        c0006a.f5751c = this.f5876l;
        c0006a.f5752d = this.f5882r;
        c0006a.f5753e = this.f5883s;
        c0006a.f5754f = this.f5877m;
        this.f5885u = new com.anythink.basead.b.b.h(c0006a);
        this.f5886v = new com.anythink.basead.b.b.d(this.f5884t);
        this.f5887w = new com.anythink.basead.b.b.c(this.f5884t);
        this.f5888x = new com.anythink.basead.b.b.i(this.f5884t);
        this.f5889y = new o(this.f5884t);
        this.f5890z = new com.anythink.basead.b.b.g(this.f5884t);
        if (view != null) {
            this.f5886v.a(new WeakReference<>(view));
        }
        this.f5886v.a(this.f5887w);
        this.f5887w.a(this.f5886v);
        s c9 = t.b().c();
        this.f5879o = c9;
        if (c9 != null && c9.a()) {
            z3 = true;
        }
        this.f5878n = z3;
    }

    private void b(com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (this.f5876l.f14168o.v() != 2) {
            eVar = this.f5886v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && this.f5876l.f14168o.v() == 1) {
            return;
        }
        if (jVar.f6217m || !this.f5878n || eVar == eVar2 || !e.a(this.i, this.f5876l.f14168o, jVar, 4)) {
            a(eVar);
        } else {
            this.f5879o.openDataConfirmDialog(this.f5875k, this.i, this.f5876l, new AnonymousClass2(eVar));
        }
    }

    public final void a(a aVar) {
        com.anythink.basead.b.b.b bVar = this.f5883s;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    public final x c() {
        return this.f5876l;
    }

    public final void d() {
        this.f5874j = true;
        com.anythink.basead.b.b.b bVar = this.f5883s;
        if (bVar != null) {
            bVar.f();
            this.f5883s = null;
        }
        com.anythink.basead.b.b.d dVar = this.f5886v;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final boolean a() {
        com.anythink.basead.b.b.b bVar = this.f5883s;
        if (bVar != null) {
            return bVar.e();
        }
        return false;
    }

    public final void a(com.anythink.basead.d.j jVar) {
        com.anythink.basead.d.a aVar;
        if (this.f5874j || a()) {
            return;
        }
        com.anythink.basead.b.b.k kVar = this.f5882r;
        if (kVar != null) {
            kVar.a(jVar);
        }
        com.anythink.basead.b.b.b bVar = this.f5883s;
        if (bVar != null) {
            bVar.d();
        }
        if (jVar != null && (aVar = jVar.i) != null) {
            int i = aVar.f6120n;
            int i6 = aVar.f6121o;
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
        String d2 = this.f5887w.d();
        if (K7 == 1) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f5888x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f5887w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K7 == 2) {
            a10 = this.f5887w.a(d2, eVar);
        } else if (K7 == 3) {
            a10 = this.f5887w.a(d2, eVar);
        } else if (K7 == 4) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f5888x.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f5887w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K7 == 6) {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f5889y.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f5887w.a(d2, eVar);
            }
            a10 = a9;
        } else if (K7 != 7) {
            a10 = this.f5887w.a(d2, eVar);
        } else {
            a9 = eVar != com.anythink.basead.b.b.e.HANDLE_SUCCESS ? this.f5890z.a() : null;
            if (a9 == null || !a9.a()) {
                a10 = this.f5887w.a(d2, eVar);
            }
            a10 = a9;
        }
        com.anythink.basead.b.b.b bVar = this.f5883s;
        if (bVar != null) {
            bVar.c();
        }
        if (a10 == null || a10.a()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.c.3
            @Override // java.lang.Runnable
            public final void run() {
                Context g4 = t.b().g();
                if (g4 != null) {
                    Context applicationContext = g4.getApplicationContext();
                    try {
                        Toast.makeText(applicationContext.getApplicationContext(), q.a(applicationContext, "myoffer_click_no_response", com.anythink.expressad.foundation.h.k.f19636g), 0).show();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static /* synthetic */ void a(c cVar, com.anythink.basead.d.j jVar) {
        com.anythink.basead.b.b.e eVar = com.anythink.basead.b.b.e.NO_HANDLE;
        if (cVar.f5876l.f14168o.v() != 2) {
            eVar = cVar.f5886v.a().a() ? com.anythink.basead.b.b.e.HANDLE_SUCCESS : com.anythink.basead.b.b.e.HANDLE_FAIL;
        }
        com.anythink.basead.b.b.e eVar2 = com.anythink.basead.b.b.e.HANDLE_SUCCESS;
        if (eVar == eVar2 && cVar.f5876l.f14168o.v() == 1) {
            return;
        }
        if (!jVar.f6217m && cVar.f5878n && eVar != eVar2 && e.a(cVar.i, cVar.f5876l.f14168o, jVar, 4)) {
            cVar.f5879o.openDataConfirmDialog(cVar.f5875k, cVar.i, cVar.f5876l, cVar.new AnonymousClass2(eVar));
        } else {
            cVar.a(eVar);
        }
    }
}
