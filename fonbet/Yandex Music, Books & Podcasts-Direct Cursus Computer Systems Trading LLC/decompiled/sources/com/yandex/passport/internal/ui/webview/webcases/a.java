package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a extends l {
    public final com.yandex.passport.common.core.b a;
    public final String b;
    public final Uri c;
    public final Uri d;
    public final boolean e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final boolean i;

    public a(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        Bundle bundle = zVar.d;
        hVar.getClass();
        this.a = bVar;
        com.yandex.passport.internal.network.client.j b = hVar.b(bVar);
        Uri d = b.d();
        this.c = d;
        Uri build = d.buildUpon().appendPath("cancel").build();
        build.getClass();
        this.d = build;
        this.i = bundle.getBoolean("show_settings_button", true);
        this.e = bundle.getBoolean("finish_without_dialog_on_error", false);
        this.f = bundle.getInt("lottie_spinner_res_id", -1) != -1 ? Integer.valueOf(bundle.getInt("lottie_spinner_res_id", -1)) : null;
        this.g = bundle.getInt("background_res_id", -1) != -1 ? Integer.valueOf(bundle.getInt("background_res_id", -1)) : null;
        this.h = bundle.getBoolean("skip_back_button", false);
        boolean z = bundle.getBoolean("show_skip_button", true);
        String string = bundle.getString("origin");
        String uri = d.toString();
        uri.getClass();
        Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath("auth/smarttv").appendQueryParameter("retpath", uri);
        Locale b2 = ((com.yandex.passport.internal.ui.lang.a) b.d).b();
        int i = com.yandex.passport.common.ui.lang.a.a;
        String language = b2.getLanguage();
        language.getClass();
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("language", language).appendQueryParameter(CommonUrlParts.APP_ID, ((com.yandex.passport.internal.common.d) b.f).a());
        if (z) {
            appendQueryParameter2.appendQueryParameter("skip", "1");
        }
        if (string != null) {
            appendQueryParameter2.appendQueryParameter("origin", string);
        }
        String builder = appendQueryParameter2.toString();
        builder.getClass();
        this.b = builder;
        CookieManager.getInstance().setCookie(builder, "mda=0");
        CookieManager.getInstance().flush();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final boolean f() {
        return this.i;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String h(Resources resources) {
        resources.getClass();
        return "";
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final boolean i(WebViewActivity webViewActivity, int i) {
        webViewActivity.getClass();
        boolean z = this.e;
        if (z) {
            Intent intent = new Intent();
            String string = webViewActivity.getString(i);
            string.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("passport-login-error-text", string);
            intent.putExtras(bundle);
            webViewActivity.setResult(5, intent);
            webViewActivity.finish();
        }
        return z;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final void j(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        if (l.a(uri, this.d)) {
            webViewActivity.setResult(4);
            webViewActivity.finish();
        } else if (l.a(uri, this.c)) {
            l.b(webViewActivity, this.a, uri);
        }
    }
}
