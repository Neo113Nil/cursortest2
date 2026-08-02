package com.yandex.passport.sloth.ui.webview;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.dzf;
import defpackage.kyf;
import defpackage.uyf;

/* loaded from: classes4.dex */
public final class h implements uyf {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ i b;

    public h(WebView webView, i iVar) {
        this.a = webView;
        this.b = iVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        int i = g.a[kyfVar.ordinal()];
        WebView webView = this.a;
        if (i == 1) {
            webView.onResume();
            return;
        }
        if (i == 2) {
            webView.onPause();
            return;
        }
        if (i != 3) {
            return;
        }
        this.b.g = true;
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.setWebChromeClient(null);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("about:blank");
        webView.stopLoading();
        webView.destroy();
    }
}
