package com.yandex.plus.webview.api.contract;

import android.webkit.JavascriptInterface;
import defpackage.a4g;
import defpackage.gld;
import defpackage.tf6;
import defpackage.xq0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class a extends b implements com.yandex.plus.webview.core.javascript.a, com.yandex.plus.webview.api.javascript.a, com.yandex.plus.webview.api.javascript.b {
    public final com.yandex.plus.webview.api.contract.message.d b;
    public final com.yandex.passport.internal.core.accounts.h c;
    public final tf6 d;

    public a(com.yandex.plus.webview.api.contract.message.d dVar, com.yandex.passport.internal.core.accounts.h hVar, kotlinx.coroutines.a aVar) {
        aVar.getClass();
        this.b = dVar;
        this.c = hVar;
        this.d = gld.e(aVar.plus(a4g.n()));
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public void g() {
        com.yandex.plus.bdui.plus.analytics.b.d(this.d);
    }

    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        this.b.onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.contract.b, com.yandex.plus.webview.api.contract.d
    public final void t(com.yandex.plus.webview.internal.f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        super.t(fVar, fVar2);
        com.yandex.plus.webview.api.contract.message.d dVar = this.b;
        dVar.getClass();
        tf6 tf6Var = this.d;
        tf6Var.getClass();
        dVar.d = tf6Var;
        x(dVar);
        com.yandex.passport.internal.core.accounts.h hVar = this.c;
        if (hVar != null) {
            com.yandex.passport.sloth.ui.c cVar = new com.yandex.passport.sloth.ui.c(18, this);
            hVar.d = tf6Var;
            hVar.e = cVar;
        }
    }

    @Override // com.yandex.plus.webview.api.javascript.b
    public final void v(Object obj) {
        com.yandex.passport.internal.core.accounts.h hVar = this.c;
        if (hVar != null) {
            hVar.v(obj);
        } else {
            xq0.q("Sending messages is not supported by this contract");
        }
    }

    public abstract void x(com.yandex.plus.webview.api.contract.message.d dVar);
}
