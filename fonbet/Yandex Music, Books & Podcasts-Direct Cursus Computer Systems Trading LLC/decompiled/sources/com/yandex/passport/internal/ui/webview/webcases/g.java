package com.yandex.passport.internal.ui.webview.webcases;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class g extends l {
    public final com.yandex.passport.common.core.b a;
    public final com.yandex.passport.internal.network.client.h b;
    public final Bundle c;

    public g(z zVar) {
        zVar.getClass();
        com.yandex.passport.common.core.b bVar = zVar.c;
        com.yandex.passport.internal.network.client.h hVar = zVar.b;
        Bundle bundle = zVar.d;
        zVar.a.getPackageName().getClass();
        hVar.getClass();
        this.a = bVar;
        this.b = hVar;
        this.c = bundle;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final Uri e() {
        return this.b.b(this.a).d();
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String g() {
        com.yandex.passport.internal.network.client.j b = this.b.b(this.a);
        String string = this.c.getString("key-login");
        Uri e = e();
        e.getClass();
        Uri.Builder appendEncodedPath = Uri.parse(b.a()).buildUpon().appendEncodedPath("restoration");
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) b.f;
        Uri.Builder appendQueryParameter = appendEncodedPath.appendQueryParameter("gps_package_name", dVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, dVar.a()).appendQueryParameter("retpath", e.toString());
        if (string != null && !StringsKt.U(string)) {
            appendQueryParameter.appendQueryParameter(LegacyAccountType.STRING_LOGIN, string);
        }
        String builder = appendQueryParameter.toString();
        builder.getClass();
        return builder;
    }

    @Override // com.yandex.passport.internal.ui.webview.webcases.l
    public final String h(Resources resources) {
        resources.getClass();
        String string = resources.getString(R.string.passport_restore_password_title);
        string.getClass();
        return string;
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
