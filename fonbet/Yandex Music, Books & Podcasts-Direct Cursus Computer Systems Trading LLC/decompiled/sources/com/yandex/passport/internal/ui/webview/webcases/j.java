package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class j extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.a0 c;
    public final com.yandex.passport.common.account.a d;

    public j(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        Bundle bundle = zVar.d;
        hVar.getClass();
        this.a = bVar;
        this.b = hVar;
        com.yandex.passport.internal.a0 a0Var = (com.yandex.passport.internal.a0) bundle.getParcelable("social-provider");
        if (a0Var == null) {
            xq0.q("social-provider is missing");
            throw null;
        }
        this.c = a0Var;
        String string = bundle.getString("master-token");
        this.d = new com.yandex.passport.common.account.a((string == null || string.length() <= 0 || string.equals("-")) ? null : string);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        String str = this.c.d().a;
        String uri = e().toString();
        uri.getClass();
        String builder = Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("bind", "1").appendQueryParameter("yandex_token", this.d.a).appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("provider", str).appendQueryParameter("retpath", uri).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError").toString();
        builder.getClass();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, e())) {
            l.c(webViewActivity, uri);
        }
    }
}
