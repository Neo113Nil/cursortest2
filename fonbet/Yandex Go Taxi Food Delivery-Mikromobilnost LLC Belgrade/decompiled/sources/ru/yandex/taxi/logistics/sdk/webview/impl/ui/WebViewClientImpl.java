package ru.yandex.taxi.logistics.sdk.webview.impl.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.bm41;
import defpackage.cvu0;
import defpackage.lr41;
import defpackage.tm41;
import defpackage.zax;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/webview/impl/ui/WebViewClientImpl;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "Ltm41;", ConfigConstants.CONFIG, "<init>", "(Landroid/content/Context;Ltm41;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", "url", "Landroid/graphics/Bitmap;", "favicon", "Lzy11;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Landroid/webkit/WebResourceResponse;", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/content/Context;", "Ltm41;", "sdk-webview"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebViewClientImpl extends WebViewClient {
    public static final int $stable = 8;
    private final tm41 config;
    private final Context context;

    public WebViewClientImpl(Context context, tm41 tm41Var) {
        this.context = context;
        this.config = tm41Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        this.config.c.onFinish();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if (((zax) this.config.a.z) == null || view == null) {
            return;
        }
        view.evaluateJavascript("javascript:\nwindow.taxi = window.taxi || {};\nwindow.taxi.app = window.TaxiAppBridge;", null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        bm41 bm41Var = this.config.c;
        CharSequence description = error.getDescription();
        bm41Var.j(description != null ? description.toString() : null, request.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        super.onReceivedHttpError(view, request, errorResponse);
        boolean z = false;
        if (errorResponse == null || errorResponse.getStatusCode() != 401) {
            bm41 bm41Var = this.config.c;
            if (request != null && request.isForMainFrame()) {
                z = true;
            }
            bm41Var.b(z);
            return;
        }
        bm41 bm41Var2 = this.config.c;
        if (request != null && request.isForMainFrame()) {
            z = true;
        }
        bm41Var2.l(z);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        if (request != null && (url = request.getUrl()) != null) {
            String uri = url.toString();
            if (cvu0.x(uri, "http://", false) || cvu0.x(uri, "https://", false)) {
                this.config.c.e(uri);
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", url);
                    if (intent.resolveActivity(this.context.getPackageManager()) != null) {
                        this.context.startActivity(intent);
                        return true;
                    }
                } catch (Exception e) {
                    ((lr41) this.config.b.w).error("Failed to open external url: ".concat(uri), e);
                    return true;
                }
            }
        }
        return false;
    }
}
