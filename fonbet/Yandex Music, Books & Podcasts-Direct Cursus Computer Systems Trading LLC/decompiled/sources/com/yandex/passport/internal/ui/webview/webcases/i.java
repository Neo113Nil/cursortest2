package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class i extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.a0 c;
    public final String d;

    public i(z zVar) {
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
        this.d = bundle.getString("native-application", null);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        String str = this.c.d().a;
        Uri e = e();
        e.getClass();
        Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth/social/start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("provider", str).appendQueryParameter("retpath", e.toString()).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError");
        String str2 = this.d;
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("application", str2);
        }
        String builder = appendQueryParameter.toString();
        builder.getClass();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, e())) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
