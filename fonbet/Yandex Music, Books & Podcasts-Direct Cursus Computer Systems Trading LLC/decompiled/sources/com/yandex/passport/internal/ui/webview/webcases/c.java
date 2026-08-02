package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class c extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.a0 c;

    public c(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        Bundle bundle = zVar.d;
        hVar.getClass();
        this.a = bVar;
        this.b = hVar;
        com.yandex.passport.internal.a0 a0Var = (com.yandex.passport.internal.a0) bundle.getParcelable("social-provider");
        if (a0Var != null) {
            this.c = a0Var;
        } else {
            xq0.q("social-provider is missing");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        com.yandex.passport.internal.a0 a0Var = this.c;
        String str = a0Var.d().a;
        String uri = e().toString();
        uri.getClass();
        return b.b(str, uri, a0Var.c, a0Var.e);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, e())) {
            if (TextUtils.equals(uri.getQueryParameter("status"), "ok")) {
                com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(this.a);
                String uri2 = uri.toString();
                uri2.getClass();
                com.yandex.passport.internal.entities.h hVar = new com.yandex.passport.internal.entities.h(P, uri2, null, 22);
                Intent intent = new Intent();
                intent.putExtra("webview-result", hVar);
                webViewActivity.setResult(-1, intent);
            } else {
                webViewActivity.setResult(0);
            }
            webViewActivity.finish();
        }
    }
}
