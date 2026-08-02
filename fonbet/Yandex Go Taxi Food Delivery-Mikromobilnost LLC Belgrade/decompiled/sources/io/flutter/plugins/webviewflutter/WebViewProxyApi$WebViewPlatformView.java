package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.js41;
import defpackage.m2v;
import defpackage.ny61;
import defpackage.qwc0;
import defpackage.scc;
import defpackage.tt5;
import defpackage.w4u;
import defpackage.xv10;
import defpackage.zsb0;
import defpackage.zy11;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugins.webviewflutter.WebViewProxyApi$WebViewPlatformView;
import kotlin.Result;

/* loaded from: classes4.dex */
public class WebViewProxyApi$WebViewPlatformView extends WebView implements qwc0 {
    private final b api;
    private WebChromeClientProxyApi$SecureWebChromeClient currentWebChromeClient;
    private WebViewClient currentWebViewClient;

    public WebViewProxyApi$WebViewPlatformView(b bVar) {
        super((Context) bVar.a.w);
        this.api = bVar;
        this.currentWebViewClient = new WebViewClient();
        this.currentWebChromeClient = new WebChromeClientProxyApi$SecureWebChromeClient();
        setWebViewClient(this.currentWebViewClient);
        setWebChromeClient(this.currentWebChromeClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onScrollChanged$0(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onScrollChanged$1(int i, int i2, int i3, int i4) {
        b bVar = this.api;
        long j = i;
        long j2 = i2;
        long j3 = i3;
        long j4 = i4;
        js41 js41Var = new js41(2);
        xv10 xv10Var = bVar.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onScrollChanged$0(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", xv10Var.f(), null).z(scc.g(this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)), new zsb0(21, js41Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugins.webviewflutter.WebViewProxyApi$WebViewPlatformView] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewParent] */
    private FlutterView tryFindFlutterView() {
        while (this.getParent() != null) {
            this = this.getParent();
            if (this instanceof FlutterView) {
                return (FlutterView) this;
            }
        }
        return null;
    }

    @Override // defpackage.qwc0
    public void dispose() {
    }

    @Override // defpackage.qwc0
    public View getView() {
        return this;
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.currentWebChromeClient;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.api.a.getClass();
        FlutterView tryFindFlutterView = tryFindFlutterView();
        if (tryFindFlutterView != null) {
            tryFindFlutterView.setImportantForAutofill(1);
        }
    }

    @Override // defpackage.qwc0
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // defpackage.qwc0
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // defpackage.qwc0
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // defpackage.qwc0
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(final int i, final int i2, final int i3, final int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.api.a.n(new Runnable() { // from class: ps41
            @Override // java.lang.Runnable
            public final void run() {
                WebViewProxyApi$WebViewPlatformView.this.lambda$onScrollChanged$1(i, i2, i3, i4);
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof WebChromeClientProxyApi$SecureWebChromeClient)) {
            ny61.f("Client must be a SecureWebChromeClient.");
            return;
        }
        WebChromeClientProxyApi$SecureWebChromeClient webChromeClientProxyApi$SecureWebChromeClient = (WebChromeClientProxyApi$SecureWebChromeClient) webChromeClient;
        this.currentWebChromeClient = webChromeClientProxyApi$SecureWebChromeClient;
        webChromeClientProxyApi$SecureWebChromeClient.setWebViewClient(this.currentWebViewClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.currentWebViewClient = webViewClient;
        this.currentWebChromeClient.setWebViewClient(webViewClient);
    }
}
