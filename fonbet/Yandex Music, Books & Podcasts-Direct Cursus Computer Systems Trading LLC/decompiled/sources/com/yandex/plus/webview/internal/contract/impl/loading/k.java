package com.yandex.plus.webview.internal.contract.impl.loading;

import defpackage.a4g;
import defpackage.btf;
import defpackage.gld;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.tf6;
import defpackage.uop;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes5.dex */
public final class k extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.api.a, com.yandex.plus.webview.api.container.a, com.yandex.plus.webview.core.i {
    public final /* synthetic */ com.yandex.plus.webview.api.contract.container.a b;
    public final long c;
    public final n d;
    public final Set e;
    public final ArrayList f;
    public final tf6 g;
    public final jyr h;

    public k(long j, n nVar, com.yandex.plus.webview.api.g gVar, kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.b = new com.yandex.plus.webview.api.contract.container.a();
        this.c = j;
        this.d = nVar;
        this.e = uop.b(com.yandex.plus.webview.api.container.b.b);
        this.f = new ArrayList();
        this.g = gld.e(aVar.plus(a4g.n()));
        this.h = btf.b(new com.yandex.plus.pay.internal.d(14, this, gVar));
    }

    public static final com.yandex.plus.webview.internal.container.a x(k kVar) {
        com.yandex.plus.webview.api.container.b bVar = com.yandex.plus.webview.api.container.b.b;
        com.yandex.plus.webview.api.contract.container.a aVar = kVar.b;
        aVar.getClass();
        Reference reference = (Reference) aVar.b.get(bVar);
        if (reference != null) {
            return (com.yandex.plus.webview.internal.container.a) reference.get();
        }
        return null;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        y().i(str);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void c() {
        com.yandex.plus.bdui.plus.analytics.b.d(this.g);
        y().g();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            y().h(new com.yandex.plus.webview.core.j(k5r.i(i, "ssl_error: errorCode="), str));
        }
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void g() {
        com.yandex.plus.bdui.plus.analytics.b.d(this.g);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void h() {
        com.yandex.plus.bdui.plus.analytics.b.d(this.g);
        y().f();
    }

    @Override // com.yandex.plus.webview.api.container.a
    public final void j(com.yandex.plus.webview.api.container.b bVar, com.yandex.plus.webview.internal.container.a aVar) {
        this.b.j(bVar, aVar);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            y().h(new com.yandex.plus.webview.core.j(k5r.i(i, "loading_other_error: errorCode="), str));
        }
    }

    @Override // com.yandex.plus.webview.api.container.a
    public final Set n() {
        return this.e;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        str.getClass();
        y().j(str);
    }

    @Override // com.yandex.plus.webview.api.contract.b, com.yandex.plus.webview.api.contract.d
    public final void t(com.yandex.plus.webview.internal.f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        super.t(fVar, fVar2);
        y().e(fVar2);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (z) {
            y().h(new com.yandex.plus.webview.core.j(k5r.i(i, "loading_http_error: errorCode="), str));
        }
    }

    public final h y() {
        return (h) this.h.getValue();
    }
}
