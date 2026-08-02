package com.plaid.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C0095a6;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class Q4 extends C0313w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(C0148d4 c0148d4) {
        super(c0148d4);
        c0148d4.getClass();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        super.onReceivedError(webView, i, str, str2);
        if (400 > i || i >= 500 || i == 408 || i == 404) {
            C0095a6.a.b(C0095a6.a, new C0248o5(str), "onReceivedError");
        } else {
            C0095a6.a.a(C0095a6.a, new C0248o5(str), "onReceivedError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        if (StringsKt.contains((CharSequence) lowerCase, (CharSequence) "/favicon.ico", false)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e) {
                C0095a6.a.a(C0095a6.a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        if (str == null) {
            return false;
        }
        try {
            return this.a.a(str);
        } catch (Exception e) {
            C0095a6.a.a(C0095a6.a, e);
            return true;
        }
    }
}
