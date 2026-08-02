package com.anythink.expressad.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.z;
import com.anythink.core.express.web.BaseWebView;
import com.anythink.core.express.web.b;
import com.anythink.expressad.foundation.d.d;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f20785a;

    /* renamed from: b, reason: collision with root package name */
    List<d> f20786b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.expressad.mbbanner.a.c.a f20787c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20788d = "BannerWebViewClient";

    public a(String str, List<d> list, com.anythink.expressad.mbbanner.a.c.a aVar) {
        this.f20785a = str;
        this.f20786b = list;
        this.f20787c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.view.a.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.anythink.core.express.web.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > com.anythink.expressad.b.c.a.f18985c) {
                d dVar = this.f20786b.get(0);
                baseWebView.getUrl();
                com.anythink.expressad.b.c.a.a(dVar);
                return false;
            }
            if (this.f20786b.size() > 1) {
                t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.anythink.expressad.mbbanner.a.c.a aVar = this.f20787c;
            if (aVar != null) {
                aVar.a(false, str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
