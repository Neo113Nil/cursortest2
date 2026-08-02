package com.yandex.plus.webview.core;

import android.content.Context;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.bev;
import defpackage.ddv;
import defpackage.ezc;
import defpackage.pyc;
import defpackage.qq6;
import defpackage.xdv;
import defpackage.ywf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public class h implements d {
    public final WebView a;
    public final com.yandex.plus.log.api.b b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final ezc f;
    public final Function2 g;
    public final Function2 h;

    /* JADX WARN: Multi-variable type inference failed */
    public h(WebView webView, com.yandex.plus.log.api.b bVar, i iVar, Function1 function1, Function1 function12, Function2 function2, Function1 function13, pyc pycVar, Function2 function22, com.yandex.plus.webview.internal.c cVar, Function2 function23, com.yandex.plus.core.network.ssl.a aVar, boolean z, boolean z2, int i) {
        f fVar = new f();
        Function1 bVar2 = (i & 16) != 0 ? new com.yandex.plus.pay.ui.common.internal.error.content.b(20) : function1;
        com.yandex.plus.webview.internal.c cVar2 = (i & 1024) != 0 ? null : cVar;
        webView.getClass();
        bVar.getClass();
        iVar.getClass();
        aVar.getClass();
        this.a = webView;
        this.b = bVar;
        this.c = bVar2;
        this.d = function12;
        this.e = function13;
        this.f = (ezc) function22;
        this.g = cVar2;
        this.h = function23;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "WebViewControllerImpl", "init()");
        }
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.a;
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "WebViewControllerImpl", "enableWebViewDebugging()");
        }
        Context context = webView.getContext();
        context.getClass();
        if ((context.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "WebViewControllerImpl", "WebView debug enabled");
            }
        }
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "WebViewControllerImpl", "applyWebViewSettings()");
        }
        fVar.a(webView);
        bVar2.invoke(new g(this));
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "WebViewControllerImpl", "overrideChromeClient()");
        }
        Context context2 = webView.getContext();
        context2.getClass();
        webView.setWebChromeClient(new com.yandex.passport.internal.ui.challenge.vpn.d(context2, function12, function2));
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "WebViewControllerImpl", "overrideWebViewClient()");
        }
        b bVar3 = c.a;
        final int i2 = 0;
        Function1 function14 = new Function1(this) { // from class: com.yandex.plus.webview.core.e
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [ezc, kotlin.jvm.functions.Function2] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        com.yandex.plus.webview.core.resource.a aVar4 = (com.yandex.plus.webview.core.resource.a) obj;
                        aVar4.getClass();
                        h hVar = this.b;
                        ?? r1 = hVar.f;
                        break;
                    case 1:
                        String str = (String) obj;
                        str.getClass();
                        h hVar2 = this.b;
                        Function2 function24 = hVar2.g;
                        if (function24 != null) {
                            function24.invoke(hVar2.a, str);
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        str2.getClass();
                        h hVar3 = this.b;
                        Function2 function25 = hVar3.h;
                        if (function25 != null) {
                            function25.invoke(hVar3.a, str2);
                        }
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 1;
        Function1 function15 = new Function1(this) { // from class: com.yandex.plus.webview.core.e
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [ezc, kotlin.jvm.functions.Function2] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        com.yandex.plus.webview.core.resource.a aVar4 = (com.yandex.plus.webview.core.resource.a) obj;
                        aVar4.getClass();
                        h hVar = this.b;
                        ?? r1 = hVar.f;
                        break;
                    case 1:
                        String str = (String) obj;
                        str.getClass();
                        h hVar2 = this.b;
                        Function2 function24 = hVar2.g;
                        if (function24 != null) {
                            function24.invoke(hVar2.a, str);
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        str2.getClass();
                        h hVar3 = this.b;
                        Function2 function25 = hVar3.h;
                        if (function25 != null) {
                            function25.invoke(hVar3.a, str2);
                        }
                        break;
                }
                return Unit.a;
            }
        };
        final int i4 = 2;
        webView.setWebViewClient((WebViewClient) bVar3.i(iVar, function14, function15, new Function1(this) { // from class: com.yandex.plus.webview.core.e
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [ezc, kotlin.jvm.functions.Function2] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        com.yandex.plus.webview.core.resource.a aVar4 = (com.yandex.plus.webview.core.resource.a) obj;
                        aVar4.getClass();
                        h hVar = this.b;
                        ?? r1 = hVar.f;
                        break;
                    case 1:
                        String str = (String) obj;
                        str.getClass();
                        h hVar2 = this.b;
                        Function2 function24 = hVar2.g;
                        if (function24 != null) {
                            function24.invoke(hVar2.a, str);
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        str2.getClass();
                        h hVar3 = this.b;
                        Function2 function25 = hVar3.h;
                        if (function25 != null) {
                            function25.invoke(hVar3.a, str2);
                        }
                        break;
                }
                return Unit.a;
            }
        }, function13, pycVar, aVar, Boolean.valueOf(z), bVar));
        webView.setVerticalScrollBarEnabled(z2);
        webView.setHorizontalScrollBarEnabled(z2);
    }

    @Override // com.yandex.plus.webview.core.d
    public void a() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "onPause()");
        }
        this.a.onPause();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void b(String str) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "evaluateJavaScript()");
        }
        this.a.evaluateJavascript(str, null);
    }

    @Override // com.yandex.plus.webview.core.d
    public final boolean c() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "back()");
        }
        WebView webView = this.a;
        if (!webView.canGoBack()) {
            return false;
        }
        webView.goBack();
        return true;
    }

    @Override // com.yandex.plus.webview.core.d
    public final void d() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "clearHistory()");
        }
        this.a.clearHistory();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void e() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "goBack()");
        }
        this.a.goBack();
    }

    @Override // com.yandex.plus.webview.core.d
    public void f() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "reload()");
        }
        this.a.reload();
    }

    @Override // com.yandex.plus.webview.core.d
    public final boolean g() {
        return this.a.canGoBack();
    }

    @Override // com.yandex.plus.webview.core.d
    public final String h() {
        String userAgentString = this.a.getSettings().getUserAgentString();
        userAgentString.getClass();
        return userAgentString;
    }

    @Override // com.yandex.plus.webview.core.d
    public final WebBackForwardList i() {
        WebBackForwardList copyBackForwardList = this.a.copyBackForwardList();
        copyBackForwardList.getClass();
        return copyBackForwardList;
    }

    @Override // com.yandex.plus.webview.core.d
    public final String j() {
        String url = this.a.getUrl();
        return url == null ? "about:blank" : url;
    }

    @Override // com.yandex.plus.webview.core.d
    public void k() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "stopLoading()");
        }
        this.a.stopLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.plus.webview.core.d
    public void n(String str, Map map) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "loadUrl() url=".concat(str));
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        this.a.loadUrl(str, map);
    }

    @Override // com.yandex.plus.webview.core.d
    public void onResume() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "WebViewControllerImpl", "onResume()");
        }
        this.a.onResume();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void setAudioMuted(boolean z) {
        if (ywf.z("MUTE_AUDIO")) {
            int i = ddv.a;
            if (xdv.c.b()) {
                bev.a.createWebView(this.a).setAudioMuted(z);
            } else {
                qq6.d("This method is not supported by the current version of the framework and the current WebView APK");
            }
        }
    }
}
