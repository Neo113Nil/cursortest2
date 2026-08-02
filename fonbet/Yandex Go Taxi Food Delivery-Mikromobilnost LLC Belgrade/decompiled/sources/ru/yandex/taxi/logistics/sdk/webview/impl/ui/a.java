package ru.yandex.taxi.logistics.sdk.webview.impl.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.viewinterop.b;
import defpackage.aii0;
import defpackage.aoh;
import defpackage.av41;
import defpackage.b3b1;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.cn41;
import defpackage.cvw;
import defpackage.did;
import defpackage.dn41;
import defpackage.er41;
import defpackage.fid;
import defpackage.fn41;
import defpackage.g6u;
import defpackage.gi7;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.ju41;
import defpackage.ko41;
import defpackage.ljs0;
import defpackage.o400;
import defpackage.o430;
import defpackage.oz40;
import defpackage.q8a1;
import defpackage.qhw0;
import defpackage.qq31;
import defpackage.s421;
import defpackage.sjh;
import defpackage.sl41;
import defpackage.sls;
import defpackage.tls;
import defpackage.tm41;
import defpackage.tpr;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.wm41;
import defpackage.x9o;
import defpackage.zax;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;
import ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi;

/* loaded from: classes5.dex */
public final class a implements wm41 {
    public final tm41 a;
    public final WebView b;
    public final ike c;
    public final ike d;

    public a(Context context, tm41 tm41Var) {
        sl41 sl41Var = tm41Var.a;
        this.a = tm41Var;
        final WebView webView = new WebView(context);
        this.b = webView;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        ike a2 = bvf0.a(cvw.U(a, g6uVar.x));
        this.c = a2;
        ike a3 = bvf0.a(cvw.U(jl40.a(), g6uVar));
        this.d = a3;
        s421 s421Var = tm41Var.b;
        String userAgent = ((av41) s421Var.x).getUserAgent();
        if (userAgent != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            webView.getSettings().setUserAgentString(userAgentString + " " + userAgent);
        }
        webView.setWebChromeClient(new WebChromeClient() { // from class: ru.yandex.taxi.logistics.sdk.webview.impl.ui.WebViewContainerImpl$setupWebView$1$2
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView webView2 = new WebView(view.getContext());
                final WebView webView3 = webView;
                webView2.setWebViewClient(new WebViewClient() { // from class: ru.yandex.taxi.logistics.sdk.webview.impl.ui.WebViewContainerImpl$setupWebView$1$2$onCreateWindow$1
                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                        Uri url = request != null ? request.getUrl() : null;
                        if (url != null) {
                            webView3.getContext().startActivity(new Intent("android.intent.action.VIEW", url));
                        }
                        if (view2 == null) {
                            return true;
                        }
                        view2.destroy();
                        return true;
                    }
                });
                Object obj = resultMsg != null ? resultMsg.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport != null) {
                    webViewTransport.setWebView(webView2);
                }
                if (resultMsg == null) {
                    return true;
                }
                resultMsg.sendToTarget();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                a.this.a.c.i(request);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                a.this.a.c.m(webView2, filePathCallback, fileChooserParams);
                return true;
            }
        });
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        m.b = true;
        settings.setSupportMultipleWindows(sl41Var.b);
        WebView.setWebContentsDebuggingEnabled(true);
        webView.setDownloadListener(new aoh(2, webView));
        zax zaxVar = (zax) sl41Var.z;
        if (zaxVar != null) {
            webView.addJavascriptInterface(zaxVar.a, "TaxiAppBridge");
        }
        gi7 gi7Var = (gi7) sl41Var.y;
        CallJsInterfaceApi callJsInterfaceApi = new CallJsInterfaceApi(webView);
        gi7Var.a(callJsInterfaceApi);
        webView.addOnAttachStateChangeListener(callJsInterfaceApi);
        webView.addJavascriptInterface(callJsInterfaceApi, "taxiApp");
        tm41Var.c.onStart();
        webView.setWebViewClient(new WebViewClientImpl(webView.getContext(), tm41Var));
        e.H(a2, new jqr((tpr) sl41Var.w, new WebViewContainerImpl$subscribeToUrl$1(this, null), 3));
        e.H(a3, new jqr(((ko41) s421Var.b).a(), new WebViewContainerImpl$subscribeToTheme$1(this, null), 3));
    }

    public final void a(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1903661657);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new cn41(this, 1);
                btsVar.o0(Q);
            }
            b3b1.a(false, (sls) Q, btsVar, 0, 1);
            tm41 tm41Var = this.a;
            s421 s421Var = tm41Var.b;
            sl41 sl41Var = tm41Var.a;
            oz40 b = f.b(((ju41) s421Var.c).getCurrentState(), btsVar);
            oz40 b2 = f.b(((ko41) tm41Var.b.b).a(), btsVar);
            int i4 = fn41.a[((WebViewState) b.getValue()).ordinal()];
            if (i4 == 1) {
                btsVar.e0(-237200000);
                Integer num = (Integer) sl41Var.A;
                boolean booleanValue = ((Boolean) b2.getValue()).booleanValue();
                boolean e2 = btsVar.e(this);
                Object Q2 = btsVar.Q();
                if (e2 || Q2 == o430Var) {
                    Q2 = new cn41(this, 2);
                    btsVar.o0(Q2);
                }
                q8a1.b(num, booleanValue, (sls) Q2, sl41Var.a, btsVar, 0);
                btsVar.t(false);
            } else if (i4 == 2) {
                btsVar.e0(-237189687);
                b(btsVar, i2 & 14);
                btsVar.t(false);
            } else {
                if (i4 != 3) {
                    throw unr0.y(-237201432, btsVar, false);
                }
                btsVar.e0(-237187802);
                boolean booleanValue2 = ((Boolean) b2.getValue()).booleanValue();
                x9o x9oVar = (x9o) sl41Var.x;
                boolean e3 = btsVar.e(this);
                Object Q3 = btsVar.Q();
                if (e3 || Q3 == o430Var) {
                    Q3 = new cn41(this, 3);
                    btsVar.o0(Q3);
                }
                sls slsVar = (sls) Q3;
                boolean e4 = btsVar.e(this);
                Object Q4 = btsVar.Q();
                if (e4 || Q4 == o430Var) {
                    Q4 = new cn41(this, 4);
                    btsVar.o0(Q4);
                }
                er41.b(booleanValue2, x9oVar, slsVar, (sls) Q4, btsVar, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dn41(this, i, i3);
        }
    }

    public final void b(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2069467082);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new qq31(8, this);
                btsVar.o0(Q);
            }
            b.a((tls) Q, ljs0.c, null, btsVar, 48, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dn41(this, i, i3);
        }
    }

    public final void c() {
        bvf0.j(this.c, null);
        bvf0.j(this.d, null);
        Object value = ((ju41) this.a.b.c).getCurrentState().a.getValue();
        WebViewState webViewState = WebViewState.LOADING;
        WebView webView = this.b;
        if (value == webViewState) {
            webView.stopLoading();
        }
        webView.destroy();
    }
}
