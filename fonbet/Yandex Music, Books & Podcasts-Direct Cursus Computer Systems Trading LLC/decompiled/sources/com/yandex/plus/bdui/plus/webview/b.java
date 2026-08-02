package com.yandex.plus.bdui.plus.webview;

import android.webkit.JavascriptInterface;
import defpackage.r0w;
import defpackage.rar;
import defpackage.tf6;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final com.yandex.plus.bdui.plus.auth.a b;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a c;
    public final r0w d;
    public final tf6 e;
    public final com.yandex.plus.log.api.b f;
    public rar g;

    public b(com.yandex.plus.bdui.plus.auth.a aVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar2, r0w r0wVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.b = aVar;
        this.c = aVar2;
        this.d = r0wVar;
        this.e = tf6Var;
        this.f = bVar;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "authManager";
    }

    @JavascriptInterface
    public final void authorize(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        rar rarVar = this.g;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.g = null;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.f;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "AuthorizeContract", "authorize(); start authorize");
        }
        this.b.a(this.e, new com.yandex.passport.internal.ui.sloth.ebs.i(7, this, str2, str));
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void c() {
        rar rarVar = this.g;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.g = null;
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void h() {
        rar rarVar = this.g;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.g = null;
    }

    public final void x(String str) {
        com.yandex.plus.webview.core.d w = w();
        if (w != null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar = this.f;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "AuthorizeContract", "authorize(); redirect to fail url = " + str);
            }
            this.d.invoke(w, str);
        }
    }
}
