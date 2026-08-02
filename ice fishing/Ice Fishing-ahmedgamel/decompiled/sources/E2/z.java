package E2;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.RD;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class z extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final C0305b f889a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f890b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f891c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f892d;

    /* renamed from: e, reason: collision with root package name */
    public WebViewClient f893e;

    /* renamed from: f, reason: collision with root package name */
    public WebView f894f;

    public z(WebView webView, C0305b c0305b, C3383ig c3383ig) {
        this.f894f = webView;
        this.f889a = c0305b;
        this.f890b = c3383ig;
    }

    public static boolean y() {
        if (((Boolean) AbstractC2823Ua.f28723a.r()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z6 = false;
                boolean z9 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(z.class.getName())) {
                        if (!z6 || !z9) {
                            z6 = true;
                        }
                    } else if (z6) {
                        z9 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void a(WebView webView, String str, boolean z6) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.doUpdateVisitedHistory(webView, str, z6);
    }

    public final void b(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onFormResubmission(webView, message, message2);
    }

    public final void c(WebView webView, String str) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onLoadResource(webView, str);
    }

    public final void d(WebView webView, String str) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z6) {
        if (y()) {
            return;
        }
        a(webView, str, z6);
    }

    public final void e(WebView webView, String str) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageFinished(webView, str);
    }

    public final void f(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onPageStarted(webView, str, bitmap);
    }

    public final void g(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public final void h(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, i, str, str2);
    }

    public final void i(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void j(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public final void k(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public final void l(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public final void m(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public final boolean n(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return false;
        }
        onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        return onRenderProcessGone;
    }

    public final void o(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (y()) {
            return;
        }
        b(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (y()) {
            return;
        }
        c(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (y()) {
            return;
        }
        d(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (y()) {
            return;
        }
        x();
        e(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (y()) {
            return;
        }
        x();
        f(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (y()) {
            return;
        }
        g(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (y()) {
            return;
        }
        h(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (y()) {
            return;
        }
        j(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (y()) {
            return;
        }
        k(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (y()) {
            return;
        }
        l(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (y()) {
            return;
        }
        m(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!y()) {
            return n(webView, renderProcessGoneDetail);
        }
        synchronized (this.f891c) {
            try {
                WebView webView2 = this.f894f;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.f894f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ScheduledFuture scheduledFuture = this.f892d;
        if (scheduledFuture == null) {
            return true;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (y()) {
            return;
        }
        o(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f2, float f9) {
        if (y()) {
            return;
        }
        p(webView, f2, f9);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (y()) {
            return;
        }
        q(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (y()) {
            return;
        }
        r(webView, keyEvent);
    }

    public final void p(WebView webView, float f2, float f9) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onScaleChanged(webView, f2, f9);
    }

    public final void q(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onTooManyRedirects(webView, message, message2);
    }

    public final void r(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return;
        }
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
    }

    public final WebResourceResponse s(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (y()) {
            return null;
        }
        return s(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (y()) {
            return false;
        }
        return u(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (y()) {
            return false;
        }
        return v(webView, webResourceRequest);
    }

    public final WebResourceResponse t(WebView webView, String str) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return null;
        }
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    public final boolean u(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public final boolean v(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final boolean w(WebView webView, String str) {
        WebViewClient webViewClient = this.f893e;
        if (webViewClient == null) {
            return false;
        }
        return webViewClient.shouldOverrideUrlLoading(webView, str);
    }

    public final void x() {
        synchronized (this.f891c) {
            try {
                WebView webView = this.f894f;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.ib), this.f889a.b()), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (y()) {
            return;
        }
        i(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (y()) {
            return null;
        }
        return t(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (y()) {
            return false;
        }
        return w(webView, str);
    }
}
