package com.yandex.passport.internal.ui.webview.webcases;

import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.internal.ui.webview.WebViewActivity;

/* loaded from: classes4.dex */
public final class b0 extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final Uri c;
    public final Uri d;

    public b0(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        hVar.getClass();
        this.a = bVar;
        this.b = hVar;
        Uri d = hVar.b(bVar).d();
        this.c = d;
        Uri build = d.buildUpon().appendPath("cancel").build();
        build.getClass();
        this.d = build;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        String uri = this.c.toString();
        uri.getClass();
        String uri2 = this.d.toString();
        uri2.getClass();
        String builder = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth").appendQueryParameter("retpath", uri).appendQueryParameter("backpath", uri2).toString();
        builder.getClass();
        CookieManager.getInstance().setCookie(builder, "mda=0");
        CookieManager.getInstance().flush();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, this.d)) {
            webViewActivity.finish();
        } else if (l.a(uri, this.c)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
