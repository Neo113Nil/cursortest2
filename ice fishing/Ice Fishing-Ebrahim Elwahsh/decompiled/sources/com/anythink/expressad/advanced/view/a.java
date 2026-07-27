package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.core.common.res.d;
import com.anythink.core.common.v.al;
import com.anythink.core.common.v.z;
import com.anythink.core.express.web.b;
import com.anythink.expressad.advanced.d.c;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    String f18084a;

    /* renamed from: b, reason: collision with root package name */
    com.anythink.expressad.advanced.d.a f18085b;

    /* renamed from: d, reason: collision with root package name */
    private c f18087d;

    /* renamed from: c, reason: collision with root package name */
    private final String f18086c = "NativeAdvancedWebViewClient";

    /* renamed from: e, reason: collision with root package name */
    private final String f18088e = com.anythink.core.express.a.a.b("YkRXhr5AWBPfNgzuH7JQ+2Ha");

    /* renamed from: f, reason: collision with root package name */
    private final String f18089f = com.anythink.core.express.a.a.b("Y+xgWkl2");

    public a(String str, com.anythink.expressad.advanced.d.a aVar, c cVar) {
        this.f18084a = str;
        this.f18085b = aVar;
        this.f18087d = cVar;
    }

    private WebResourceResponse a(WebView webView, String str) {
        Uri parse;
        String scheme;
        if (!TextUtils.isEmpty(str) && this.f18087d != null) {
            try {
                String replace = str.startsWith("file") ? str.replace("file://", "") : "";
                if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (scheme = parse.getScheme()) != null && !TextUtils.isEmpty(scheme) && (scheme.equals(this.f18089f) || scheme.equals("mb-h5"))) {
                    replace = this.f18087d.a(URLDecoder.decode(Uri.parse(str).getQueryParameter("uri")));
                }
                Context context = webView.getContext();
                if (context == null) {
                    context = com.anythink.expressad.foundation.b.a.c().e();
                }
                boolean a9 = al.a(replace, d.a(context).a(4));
                boolean z8 = com.anythink.expressad.a.f17776a;
                if (!TextUtils.isEmpty(replace) && a9 && !replace.contains("127.0.0.1") && !replace.startsWith("http")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Access-Control-Allow-Origin", "*");
                    WebResourceResponse webResourceResponse = new WebResourceResponse(o.f8605e, com.anythink.expressad.foundation.g.a.bR, new FileInputStream(replace));
                    webResourceResponse.setResponseHeaders(hashMap);
                    return webResourceResponse;
                }
                return null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    public final void b() {
        if (this.f18087d != null) {
            this.f18087d = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.view.a.1
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
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str);
    }

    @Override // com.anythink.core.express.web.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            try {
                WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
                if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.b.c.a.f18356c) {
                    com.anythink.expressad.foundation.d.d dVar = ((NativeAdvancedJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                    windVaneWebView.getUrl();
                    com.anythink.expressad.b.c.a.a(dVar);
                    return false;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            com.anythink.expressad.advanced.d.a aVar = this.f18085b;
            if (aVar == null) {
                return true;
            }
            aVar.a(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl().toString());
    }

    private boolean a(String str) {
        Uri parse;
        String scheme;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (scheme = parse.getScheme()) == null || TextUtils.isEmpty(scheme)) {
            return false;
        }
        return scheme.equals(this.f18089f) || scheme.equals("mb-h5");
    }
}
