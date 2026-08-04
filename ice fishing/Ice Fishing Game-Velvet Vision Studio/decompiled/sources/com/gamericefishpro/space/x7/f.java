package com.gamericefishpro.space.x7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.f1.u;
import com.gamericefishpro.space.q0.n;
import com.gamericefishpro.space.w.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final g a;
    public final c b;

    public f(g router, c cookieKeeper) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(cookieKeeper, "cookieKeeper");
        this.a = router;
        this.b = cookieKeeper;
    }

    public final WebView a(final Context context, u webViews, FrameLayout container, com.gamericefishpro.space.v7.c onProgress, w onFileChooser, com.gamericefishpro.space.e.e onValidated) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webViews, "webViews");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onFileChooser, "onFileChooser");
        Intrinsics.checkNotNullParameter(onValidated, "onValidated");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setLayerType(2, null);
        webView.setVerticalScrollBarEnabled(false);
        webView.setFocusableInTouchMode(true);
        webView.setFocusable(true);
        webView.setSaveEnabled(true);
        this.b.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        webView.setDownloadListener(new DownloadListener() { // from class: com.gamericefishpro.space.x7.d
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Context context2 = context;
                try {
                    Intrinsics.b(str);
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception unused) {
                }
            }
        });
        this.a.getClass();
        h config = new h();
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(config, "config");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(0);
        String userAgentString = settings.getUserAgentString();
        Intrinsics.checkNotNullExpressionValue(userAgentString, "getUserAgentString(...)");
        settings.setUserAgentString(kotlin.text.d.i(userAgentString, "; wv", ""));
        webView.setWebChromeClient(new a(new com.gamericefishpro.space.b1.d(new com.gamericefishpro.space.a5.b(webView, webViews, onProgress, 4), onFileChooser, new com.gamericefishpro.space.l7.a(this, context, webViews, container, onProgress, onFileChooser, onValidated), new q0(29, webViews, container), new m1(1, onValidated))));
        webView.setWebViewClient(new b(new com.gamericefishpro.space.tb.u(new e(0), new n(11))));
        webViews.add(webView);
        container.addView(webView);
        return webView;
    }
}
