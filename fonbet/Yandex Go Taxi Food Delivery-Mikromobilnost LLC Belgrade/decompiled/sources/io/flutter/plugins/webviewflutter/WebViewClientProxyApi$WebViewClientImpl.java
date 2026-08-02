package io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.gm41;
import defpackage.hek0;
import defpackage.hpo0;
import defpackage.htb0;
import defpackage.im41;
import defpackage.m2v;
import defpackage.r941;
import defpackage.scc;
import defpackage.te5;
import defpackage.tt5;
import defpackage.w4u;
import defpackage.xv10;
import defpackage.yno;
import defpackage.zsb0;
import defpackage.zy11;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import kotlin.Result;

/* loaded from: classes4.dex */
public class WebViewClientProxyApi$WebViewClientImpl extends WebViewClient {
    private final im41 api;
    private boolean returnValueForShouldOverrideUrlLoading = false;

    public WebViewClientProxyApi$WebViewClientImpl(im41 im41Var) {
        this.api = im41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$doUpdateVisitedHistory$10(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$doUpdateVisitedHistory$11(WebView webView, String str, boolean z) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(19);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$doUpdateVisitedHistory$10(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", xv10Var.f(), null).z(scc.g(this, webView, str, Boolean.valueOf(z)), new htb0(6, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onFormResubmission$14(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onFormResubmission$15(WebView webView, Message message, Message message2) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(12);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onFormResubmission$14(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", xv10Var.f(), null).z(scc.g(this, webView, message, message2), new htb0(3, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onLoadResource$16(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onLoadResource$17(WebView webView, String str) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(17);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onLoadResource$16(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", xv10Var.f(), null).z(scc.g(this, webView, str), new zsb0(24, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onPageCommitVisible$18(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onPageCommitVisible$19(WebView webView, String str) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(20);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onPageCommitVisible$18(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", xv10Var.f(), null).z(scc.g(this, webView, str), new zsb0(29, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onPageFinished$2(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onPageFinished$3(WebView webView, String str) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(25);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onPageFinished$2(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", xv10Var.f(), null).z(scc.g(this, webView, str), new htb0(1, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onPageStarted$0(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onPageStarted$1(WebView webView, String str) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(16);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onPageStarted$0(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", xv10Var.f(), null).z(scc.g(this, webView, str), new zsb0(26, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedClientCertRequest$20(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedClientCertRequest$21(WebView webView, ClientCertRequest clientCertRequest) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(23);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedClientCertRequest$20(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", xv10Var.f(), null).z(scc.g(this, webView, clientCertRequest), new zsb0(27, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedError$6(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedError$7(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(18);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedError$6(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", xv10Var.f(), null).z(scc.g(this, webView, webResourceRequest, webResourceError), new htb0(0, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedHttpAuthRequest$12(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedHttpAuthRequest$13(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(13);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedHttpAuthRequest$12(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", xv10Var.f(), null).z(scc.g(this, webView, httpAuthHandler, str, str2), new htb0(2, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedHttpError$4(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedHttpError$5(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(22);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedHttpError$4(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", xv10Var.f(), null).z(scc.g(this, webView, webResourceRequest, webResourceResponse), new htb0(7, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedLoginRequest$22(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedLoginRequest$23(WebView webView, String str, String str2, String str3) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(15);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedLoginRequest$22(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", xv10Var.f(), null).z(scc.g(this, webView, str, str2, str3), new zsb0(25, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onReceivedSslError$24(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onReceivedSslError$25(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(24);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onReceivedSslError$24(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", xv10Var.f(), null).z(scc.g(this, webView, sslErrorHandler, sslError), new htb0(4, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onScaleChanged$26(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onScaleChanged$27(WebView webView, float f, float f2) {
        im41 im41Var = this.api;
        double d = f;
        double d2 = f2;
        r941 r941Var = new r941(21);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onScaleChanged$26(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", xv10Var.f(), null).z(scc.g(this, webView, Double.valueOf(d), Double.valueOf(d2)), new htb0(5, r941Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$shouldOverrideUrlLoading$8(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$shouldOverrideUrlLoading$9(WebView webView, WebResourceRequest webResourceRequest) {
        im41 im41Var = this.api;
        r941 r941Var = new r941(14);
        xv10 xv10Var = im41Var.a;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$shouldOverrideUrlLoading$8(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", xv10Var.f(), null).z(scc.g(this, webView, webResourceRequest), new zsb0(23, r941Var));
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.api.a.n(new yno(this, webView, str, z, 4));
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.api.a.n(new hek0(this, webView, message, message2, 11));
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        this.api.a.n(new gm41(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        this.api.a.n(new gm41(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.api.a.n(new gm41(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.api.a.n(new gm41(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.api.a.n(new hpo0(24, this, webView, clientCertRequest));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.api.a.n(new hek0(this, webView, webResourceRequest, webResourceError, 13));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.api.a.n(new te5(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.api.a.n(new hek0(this, webView, webResourceRequest, webResourceResponse, 14));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.api.a.n(new te5(this, webView, str, str2, str3, 5));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.api.a.n(new hek0(this, webView, sslErrorHandler, sslError, 12));
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(final WebView webView, final float f, final float f2) {
        this.api.a.n(new Runnable() { // from class: hm41
            @Override // java.lang.Runnable
            public final void run() {
                WebViewClientProxyApi$WebViewClientImpl.this.lambda$onScaleChanged$27(webView, f, f2);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public void setReturnValueForShouldOverrideUrlLoading(boolean z) {
        this.returnValueForShouldOverrideUrlLoading = z;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.api.a.n(new hpo0(23, this, webView, webResourceRequest));
        return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
    }
}
