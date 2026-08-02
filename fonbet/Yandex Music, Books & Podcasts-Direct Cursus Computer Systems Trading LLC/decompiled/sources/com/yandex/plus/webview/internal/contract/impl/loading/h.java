package com.yandex.plus.webview.internal.contract.impl.loading;

import defpackage.my1;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class h {
    public final long a;
    public final j b;
    public final j c;
    public g d = e.a;

    public h(long j, j jVar, j jVar2) {
        this.a = j;
        this.b = jVar;
        this.c = jVar2;
    }

    public final void a(String str, Exception exc) {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b bVar;
        if (this.d instanceof b) {
            return;
        }
        b(str);
        this.d = c.a;
        k kVar = this.b.a;
        n nVar = kVar.d;
        if (nVar != null) {
            com.yandex.plus.webview.internal.container.a x = k.x(kVar);
            com.yandex.plus.webview.core.d w = kVar.w();
            com.yandex.plus.webview.core.d w2 = kVar.w();
            if (w2 != null) {
                bVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b(0, w2, com.yandex.plus.webview.core.d.class, "reload", "reload()V", 0, 14);
            } else {
                bVar = null;
            }
            nVar.a(str, x, w, exc, bVar);
        }
    }

    public final void b(String str) {
        if (this.d.equals(e.a)) {
            this.d = d.a;
            k kVar = this.b.a;
            n nVar = kVar.d;
            if (nVar != null) {
                k.x(kVar);
                kVar.w();
                nVar.c();
            }
        }
    }

    public final void c(String str) {
        if (this.d instanceof b) {
            return;
        }
        b(str);
        this.d = f.a;
        k kVar = this.b.a;
        n nVar = kVar.d;
        if (nVar != null) {
            k.x(kVar);
            nVar.b(kVar.w());
        }
    }

    public final void d(String str, boolean z) {
        k kVar = this.c.a;
        if (z) {
            Iterator it = kVar.f.iterator();
            while (it.hasNext()) {
                ((com.yandex.plus.webview.api.contract.i) it.next()).onReady();
            }
            c(str);
            return;
        }
        Iterator it2 = kVar.f.iterator();
        while (it2.hasNext()) {
            ((com.yandex.plus.webview.api.contract.i) it2.next()).i();
        }
        a(str, new my1("Loading timed out!"));
    }

    public abstract void e(com.yandex.passport.legacy.lx.f fVar);

    public abstract void f();

    public abstract void g();

    public void h(com.yandex.plus.webview.core.j jVar) {
        a(jVar.a, jVar);
    }

    public abstract void i(String str);

    public abstract void j(String str);
}
