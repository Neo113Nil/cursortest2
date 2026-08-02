package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b6e;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class d extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final com.yandex.passport.internal.a0 c;
    public final String d;
    public final String e;

    public d(z zVar) {
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
        String string2 = bundle.getString("application-client-id");
        if (string2 != null) {
            this.e = string2;
        } else {
            xq0.q("application-client-id is missing");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final byte[] d() {
        try {
            return this.b.b(this.a).c(this.d);
        } catch (Exception e) {
            b6e.q(e);
            return null;
        }
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
        String str2 = this.e;
        str2.getClass();
        Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth/social/native_start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.d) b.f).a()).appendQueryParameter("provider", str).appendQueryParameter("application", str2).appendQueryParameter("retpath", uri).appendQueryParameter("place", "query").appendQueryParameter("display", "touch");
        String d = b.e.d();
        if (d != null) {
            appendQueryParameter.appendQueryParameter("device_id", d);
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
            String queryParameter = uri.getQueryParameter("x_token");
            if (queryParameter == null || queryParameter.length() == 0) {
                webViewActivity.setResult(0);
            } else {
                Intent intent = new Intent();
                intent.putExtra("master-token", queryParameter);
                webViewActivity.setResult(-1, intent);
            }
            webViewActivity.finish();
        }
    }
}
