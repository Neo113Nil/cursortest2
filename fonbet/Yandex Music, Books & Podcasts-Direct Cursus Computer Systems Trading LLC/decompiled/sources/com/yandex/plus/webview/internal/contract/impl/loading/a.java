package com.yandex.plus.webview.internal.contract.impl.loading;

import defpackage.mm6;
import defpackage.rar;
import defpackage.vdr;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class a extends h {
    public static final xdr i = ydr.a(Boolean.FALSE);
    public final mm6 e;
    public Function0 f;
    public vdr g;
    public rar h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j, j jVar, j jVar2, mm6 mm6Var) {
        super(j, jVar, jVar2);
        mm6Var.getClass();
        this.e = mm6Var;
        this.f = new com.yandex.plus.paymentsdk.api.d(9);
        this.g = i;
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void e(com.yandex.passport.legacy.lx.f fVar) {
        this.f = new com.yandex.plus.pay.internal.d(13, this, fVar);
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void f() {
        rar rarVar = this.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
        this.d = e.a;
        this.g = (vdr) this.f.invoke();
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void g() {
        rar rarVar = this.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
        this.g = i;
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void h(com.yandex.plus.webview.core.j jVar) {
        rar rarVar = this.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
        a(jVar.a, jVar);
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void i(String str) {
        str.getClass();
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.h
    public final void j(String str) {
        str.getClass();
        if (this.d instanceof b) {
            return;
        }
        rar rarVar = this.h;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.h = null;
        b(str);
        if (((Boolean) this.g.getValue()).booleanValue()) {
            c(str);
        } else {
            this.h = x97.y(this.e, null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, str, continuation, 20), 3);
        }
    }

    public abstract vdr k(com.yandex.passport.legacy.lx.f fVar);
}
