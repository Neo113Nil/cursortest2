package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class e extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.a0 c;
    public final String d;
    public final String e;
    public final com.yandex.passport.common.account.a f;

    public e(z zVar) {
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
        String string = bundle.getString("social-token");
        if (string == null) {
            xq0.q("social-token is missing");
            throw null;
        }
        this.d = string;
        String string2 = bundle.getString("application-id");
        if (string2 == null) {
            xq0.q("application-id is missing");
            throw null;
        }
        this.e = string2;
        String string3 = bundle.getString("master-token");
        this.f = new com.yandex.passport.common.account.a((string3 == null || string3.length() <= 0 || string3.equals("-")) ? null : string3);
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        Uri e = e();
        String str = this.c.d().a;
        String str2 = this.f.a;
        String str3 = this.e;
        str3.getClass();
        e.getClass();
        String str4 = this.d;
        str4.getClass();
        String builder = Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/bind_by_token").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("application", str3).appendQueryParameter("retpath", e.toString()).appendQueryParameter("provider", str).appendQueryParameter("provider_token", str4).appendQueryParameter("token", str2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("passthrough_errors", "UserDeniedError").toString();
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
