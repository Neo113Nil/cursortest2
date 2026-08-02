package com.yandex.passport.internal.ui.webview.webcases;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class l {
    public static boolean a(Uri uri, Uri uri2) {
        uri.getClass();
        uri2.getClass();
        return Intrinsics.d(uri2.getHost(), uri.getHost()) && Intrinsics.d(uri2.getPath(), uri.getPath());
    }

    public static void b(WebViewActivity webViewActivity, com.yandex.passport.common.core.b bVar, Uri uri) {
        String str;
        webViewActivity.getClass();
        bVar.getClass();
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        CookieManager.getInstance().flush();
        String cookie = CookieManager.getInstance().getCookie(uri2);
        com.yandex.passport.internal.entities.h hVar = null;
        if (cookie != null) {
            String[] split = cookie.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                String[] split2 = split[i].split("=", 2);
                if (split2.length == 2 && split2[0].trim().equalsIgnoreCase("Session_id")) {
                    str = split2[1];
                    break;
                }
                i++;
            }
            if (str != null) {
                com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(bVar);
                com.yandex.passport.api.impl.b bVar2 = com.yandex.passport.api.impl.b.c;
                com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(P.d());
                a.getClass();
                hVar = new com.yandex.passport.internal.entities.h(a, null, null, uri2, cookie);
            }
        }
        if (hVar != null) {
            Intent intent = new Intent();
            intent.putExtra("webview-result", hVar);
            webViewActivity.setResult(-1, intent);
        } else {
            webViewActivity.setResult(0);
        }
        webViewActivity.finish();
    }

    public static void c(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        webViewActivity.setResult(Intrinsics.d(uri.getQueryParameter("status"), "ok") ? -1 : 0);
        webViewActivity.finish();
    }

    public byte[] d() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract Uri e();

    public boolean f() {
        return true;
    }

    public abstract String g();

    public String h(Resources resources) {
        resources.getClass();
        String string = resources.getString(R.string.passport_logging_in_proggress);
        string.getClass();
        return string;
    }

    public boolean i(WebViewActivity webViewActivity, int i) {
        webViewActivity.getClass();
        return false;
    }

    public abstract void j(WebViewActivity webViewActivity, Uri uri);

    public boolean k(WebViewActivity webViewActivity, Uri uri) {
        webViewActivity.getClass();
        uri.getClass();
        j(webViewActivity, uri);
        return a(uri, e());
    }
}
