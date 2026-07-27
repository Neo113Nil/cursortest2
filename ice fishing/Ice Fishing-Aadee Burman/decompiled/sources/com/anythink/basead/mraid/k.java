package com.anythink.basead.mraid;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.anythink.core.common.v.z;

/* loaded from: classes.dex */
public final class k extends com.anythink.core.express.web.b {

    /* renamed from: a, reason: collision with root package name */
    final String f9658a = "k";

    /* renamed from: b, reason: collision with root package name */
    String f9659b;

    /* renamed from: c, reason: collision with root package name */
    e f9660c;

    public k(String str) {
        this.f9659b = str;
    }

    private void a(e eVar) {
        this.f9660c = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.basead.mraid.k.1
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
        e eVar;
        try {
            if (!TextUtils.equals(str, this.f9659b) && (eVar = this.f9660c) != null) {
                eVar.open(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
