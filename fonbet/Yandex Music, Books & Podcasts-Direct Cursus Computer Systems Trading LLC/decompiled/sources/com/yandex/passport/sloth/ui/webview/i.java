package com.yandex.passport.sloth.ui.webview;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.passport.sloth.data.k0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.ui.b1;
import com.yandex.passport.sloth.ui.dependencies.p;
import com.yandex.passport.sloth.ui.n0;
import com.yandex.passport.sloth.ui.q0;
import com.yandex.passport.sloth.ui.s;
import com.yandex.passport.sloth.ui.s0;
import defpackage.agv;
import defpackage.gtm;
import defpackage.gzf;
import defpackage.lyf;
import defpackage.nyf;
import defpackage.sh4;
import defpackage.tah;
import defpackage.uah;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class i extends WebViewClient {
    public static final String l = com.yandex.plus.core.network.api.utils.a.A("PassportSDK/7.54.1.754014992");
    public static final Object m = uah.e(new Pair("js", "application/javascript"), new Pair("woff", "font/woff"), new Pair("woff2", "font/woff2"));
    public final s0 a;
    public final nyf b;
    public final b1 c;
    public final p d;
    public final agv e;
    public o0 f;
    public boolean g;
    public boolean h;
    public s i;
    public k j;
    public s k;

    public i(s0 s0Var, gzf gzfVar, b1 b1Var, com.yandex.passport.common.common.a aVar, p pVar, agv agvVar) {
        s0Var.getClass();
        gzfVar.getClass();
        b1Var.getClass();
        aVar.getClass();
        pVar.getClass();
        agvVar.getClass();
        this.a = s0Var;
        this.b = gzfVar;
        this.c = b1Var;
        this.d = pVar;
        this.e = agvVar;
        n0 n0Var = s0Var.a;
        WebView webView = n0Var.f;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getUserAgentString());
        sb.append(' ');
        sb.append(l);
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar;
        sb2.append(dVar.a());
        sb2.append('/');
        sb2.append(dVar.b());
        sb.append(com.yandex.plus.core.network.api.utils.a.A(sb2.toString()));
        settings.setUserAgentString(sb.toString());
        webView.setClipToOutline(true);
        webView.setWebViewClient(this);
        webView.setWebChromeClient(new sh4(this));
        CookieManager.getInstance().setAcceptThirdPartyCookies(n0Var.f, true);
        gzfVar.a(new h(webView, this));
    }

    public final void a(Function1 function1) {
        WebView webView = this.a.a.f;
        if (!Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            webView.post(new gtm(17, this, function1, webView));
        } else if (this.b.b() != lyf.a) {
            function1.invoke(webView);
        }
    }

    public final void b(int i, String str) {
        this.h = true;
        if (-6 == i || -2 == i || -7 == i) {
            s sVar = this.k;
            if (sVar != null) {
                sVar.invoke(b.a);
                return;
            }
            return;
        }
        s sVar2 = this.k;
        if (sVar2 != null) {
            str.getClass();
            sVar2.invoke(new d(i, str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if ((StringsKt.M(str, "https://passport.yandex-team.ru/auth", false) || StringsKt.M(str, "https://passport.yandex-team.ru/pwl/auth", false) || StringsKt.M(str, "https://oauth.yandex.ru/authorize", false) || StringsKt.M(str, "https://oauth-test.yandex.ru/authorize", false) || StringsKt.M(str, "https://passport.yango-team.com/auth", false) || StringsKt.M(str, "https://passport.yango-team.com/pwl/auth", false) || StringsKt.M(str, "https://passport-test.yango.com", false) || (this.f instanceof k0)) && !this.h) {
            this.a.b(q0.d);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        this.h = false;
        s sVar = this.i;
        if (sVar == null || !((Boolean) sVar.invoke(str)).booleanValue()) {
            return;
        }
        webView.stopLoading();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            b(errorCode, uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object dVar;
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        if (webResourceRequest.isForMainFrame()) {
            this.h = true;
            s sVar = this.k;
            if (sVar != null) {
                int statusCode = webResourceResponse.getStatusCode();
                if (400 <= statusCode && statusCode < 500) {
                    dVar = c.a;
                } else if (500 > statusCode || statusCode >= 600) {
                    int statusCode2 = webResourceResponse.getStatusCode();
                    Uri url = webResourceRequest.getUrl();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    dVar = new d(statusCode2, com.yandex.passport.common.url.a.a(url));
                } else {
                    dVar = c.b;
                }
                sVar.invoke(dVar);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceivedSslError, error=" + sslError, 8);
        }
        this.e.b(sslError, new com.yandex.passport.internal.core.accounts.h(sslErrorHandler, webView, sslError, this, 5));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        s sVar = this.k;
        if (sVar == null) {
            return true;
        }
        sVar.invoke(c.c);
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        String str2;
        k kVar;
        webView.getClass();
        webResourceRequest.getClass();
        WebResourceResponse webResourceResponse = null;
        if (!Intrinsics.d(webResourceRequest.getMethod(), ServiceCommand.TYPE_GET) || (kVar = this.j) == null) {
            str = null;
        } else {
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            str = (String) kVar.invoke(uri);
        }
        if (str != null) {
            AssetManager assets = webView.getContext().getAssets();
            assets.getClass();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Found cache in bundle: ".concat(str), 8);
            }
            try {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (fileExtensionFromUrl != null) {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = (String) m.get(fileExtensionFromUrl);
                    }
                    str2 = mimeTypeFromExtension;
                } else {
                    str2 = null;
                }
                webResourceResponse = new WebResourceResponse(str2, "utf-8", 200, "OK", tah.b(new Pair("Access-Control-Allow-Origin", "*")), assets.open(str));
            } catch (Exception unused) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Error while loading cache from bundle: ".concat(str), 8);
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        s sVar;
        webView.getClass();
        webResourceRequest.getClass();
        if (!webResourceRequest.isForMainFrame() || (sVar = this.i) == null) {
            return false;
        }
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        return ((Boolean) sVar.invoke(uri)).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        b(i, str2);
    }
}
