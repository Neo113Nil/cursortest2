package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.webview.WebViewActivity;

/* loaded from: classes4.dex */
public final class f extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final Bundle c;
    public final Uri d;

    public f(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        Bundle bundle = zVar.d;
        hVar.getClass();
        this.a = bVar;
        this.b = hVar;
        this.c = bundle;
        Uri.Builder appendEncodedPath = Uri.parse(hVar.b(bVar).a()).buildUpon().appendEncodedPath("profile");
        appendEncodedPath.appendQueryParameter("type", "am_challenge");
        String builder = appendEncodedPath.toString();
        builder.getClass();
        Uri parse = Uri.parse(builder);
        parse.getClass();
        this.d = parse;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        String str = (String) this.c.get("key-track-id");
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        if (str == null) {
            str = "";
        }
        String uri = this.d.toString();
        uri.getClass();
        String builder = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth").appendQueryParameter("track_id", str).appendQueryParameter("retpath", uri).toString();
        builder.getClass();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String h(Resources resources) {
        resources.getClass();
        String string = resources.getString(R.string.passport_required_web_error_webview_title);
        string.getClass();
        return string;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, this.d)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
