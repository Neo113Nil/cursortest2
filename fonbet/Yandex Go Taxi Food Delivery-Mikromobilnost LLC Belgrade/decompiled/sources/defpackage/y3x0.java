package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.provider.ContactsContract;
import android.webkit.PermissionRequest;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.p;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.yandex.quark.webchat.f;
import com.yandex.quark.webchat.g;
import defpackage.b64;
import defpackage.bst;
import defpackage.bvu0;
import defpackage.d790;
import defpackage.eja1;
import defpackage.hst;
import defpackage.i1r;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jyj0;
import defpackage.ke00;
import defpackage.o1b1;
import defpackage.pey;
import defpackage.pl91;
import defpackage.se41;
import defpackage.syj0;
import defpackage.tje;
import defpackage.ue41;
import defpackage.unr0;
import defpackage.vng;
import defpackage.we41;
import defpackage.y3x0;
import defpackage.zwf0;
import defpackage.zxa0;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class y3x0 implements hg41 {
    public final Context a;
    public final qgz b;
    public final bst c;
    public final xa20 d;
    public final WebView e;
    public f f;
    public g g;
    public azq h;
    public final ArrayList i;
    public boolean j;
    public final ArrayList k;

    public y3x0(Context context, boolean z, qgz qgzVar, bst bstVar, xa20 xa20Var, boolean z2) {
        this.a = context;
        this.b = qgzVar;
        this.c = bstVar;
        this.d = xa20Var;
        WebView webView = new WebView(context);
        this.e = webView;
        this.i = new ArrayList();
        this.k = new ArrayList();
        WebSettings settings = webView.getSettings();
        settings.setMixedContentMode(0);
        settings.setSupportMultipleWindows(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDomStorageEnabled(true);
        if (z2) {
            ServiceWorkerWebSettings serviceWorkerWebSettings = ServiceWorkerController.getInstance().getServiceWorkerWebSettings();
            serviceWorkerWebSettings.setAllowContentAccess(true);
            serviceWorkerWebSettings.setAllowFileAccess(true);
            serviceWorkerWebSettings.setBlockNetworkLoads(false);
        }
        WebView.setWebContentsDebuggingEnabled(z);
        webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.quark.contracts.web.internal.SystemWebContentView$3
            @Override // android.webkit.WebViewClient
            public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible(view, url);
                f fVar = y3x0.this.f;
                if (fVar != null) {
                    se41 se41Var = fVar.g;
                    se41Var.c.e("WebChatViewController", "Page fcp: " + url);
                    if (fVar.f) {
                        return;
                    }
                    o1b1.b(se41Var.p, "WebChat.PageCommitVisible", fVar.a);
                    se41Var.d.b(new d790(url, 1));
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                y3x0 y3x0Var = y3x0.this;
                if (y3x0Var.j) {
                    y3x0Var.e.clearHistory();
                    y3x0.this.j = false;
                }
                y3x0 y3x0Var2 = y3x0.this;
                f fVar = y3x0Var2.f;
                if (fVar != null) {
                    se41 se41Var = fVar.g;
                    if (!fVar.e && !fVar.f) {
                        fVar.e = true;
                        o1b1.b(se41Var.p, "WebChat.PageFinished", fVar.a);
                    }
                    se41Var.c.e("WebChatViewController", "Page finished: " + url);
                    se41Var.E.h(y3x0Var2.e.canGoBack());
                    se41Var.d.b(new d790(url, 0));
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                y3x0 y3x0Var = y3x0.this;
                f fVar = y3x0Var.f;
                if (fVar != null) {
                    fVar.a(y3x0Var, url);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                f fVar;
                Integer l;
                if (!request.isForMainFrame() || (fVar = y3x0.this.f) == null) {
                    return;
                }
                int errorCode = error.getErrorCode();
                String uri = request.getUrl().toString();
                String obj = error.getDescription().toString();
                boolean z3 = true;
                fVar.f = true;
                se41 se41Var = fVar.g;
                zwf0 zwf0Var = se41Var.c;
                StringBuilder u = b64.u(errorCode, "Page error: ", uri, Extension.FIX_SPACE, Extension.FIX_SPACE);
                u.append(obj);
                zwf0Var.f("WebChatViewController", u.toString());
                r0 r0Var = se41Var.z;
                int i = 0;
                if (!jl40.l(r0Var.getValue(), we41.a)) {
                    if (j73.y(new Integer[]{-6, -11, -2, -8, -5, -1}, Integer.valueOf(errorCode))) {
                        z3 = false;
                    }
                }
                String queryParameter = Uri.parse(uri).getQueryParameter("manual_refresh_param");
                if (queryParameter != null && (l = bvu0.l(10, queryParameter)) != null) {
                    i = l.intValue();
                }
                r0Var.m(null, new ue41(z3, errorCode, i));
                se41Var.d.b(new d790(errorCode + Extension.COLON_SPACE + obj, 2));
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                Iterator it = y3x0.this.i.iterator();
                while (it.hasNext()) {
                    i1r i1rVar = (i1r) it.next();
                    request.getUrl();
                    i1rVar.getClass();
                }
                return super.shouldInterceptRequest(view, request);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.quark.contracts.web.internal.SystemWebContentView$4
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                Object obj = resultMsg != null ? resultMsg.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                WebView webView2 = new WebView(y3x0.this.a);
                final y3x0 y3x0Var = y3x0.this;
                webView2.setWebViewClient(new WebViewClient() { // from class: com.yandex.quark.contracts.web.internal.SystemWebContentView$4$onCreateWindow$newWebView$1$1
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
                    
                        if (r9.a(r11) != false) goto L86;
                     */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // android.webkit.WebViewClient
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                        String decode;
                        String authority;
                        Object obj2;
                        bst bstVar2 = y3x0.this.c;
                        Uri url = request.getUrl();
                        Context context2 = bstVar2.a;
                        String scheme = url.getScheme();
                        if (scheme != null) {
                            switch (scheme.hashCode()) {
                                case -1183762788:
                                    if (scheme.equals("intent")) {
                                        try {
                                            Intent parseUri = Intent.parseUri(url.toString(), 0);
                                            String str = parseUri.getPackage();
                                            if (str != null && str.length() != 0 && ((authority = url.getAuthority()) == null || authority.length() == 0)) {
                                                Intent addCategory = new Intent().setPackage(str).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
                                                PackageManager packageManager = context2.getPackageManager();
                                                if (a.E(packageManager.queryIntentActivities(addCategory, 0))) {
                                                    addCategory = packageManager.getLaunchIntentForPackage(str);
                                                }
                                                if (addCategory != null) {
                                                    break;
                                                }
                                            }
                                            if ((context2.getPackageManager().resolveActivity(parseUri, 0) == null || !bstVar2.a(parseUri)) && (decode = Uri.decode(parseUri.getStringExtra("browser_fallback_url"))) != null) {
                                                Uri parse = Uri.parse(decode);
                                                try {
                                                    String queryParameter = parse.getQueryParameter("url");
                                                    Uri parse2 = queryParameter != null ? Uri.parse(queryParameter) : null;
                                                    if (parse2 == null) {
                                                        parse2 = parse;
                                                    }
                                                    Intent intent = new Intent("android.intent.action.VIEW", parse2);
                                                    intent.setFlags(SelfTester_JCP.IMITA);
                                                    context2.startActivity(intent);
                                                    break;
                                                } catch (ActivityNotFoundException e) {
                                                    hst hstVar = jst.e;
                                                    ke00 a = hstVar.b.a();
                                                    if (a != null && a.b(15)) {
                                                        a.a(15, "IntentUrlOpener", e, unr0.n(parse, "Failed to find corresponding activity for opening "), hstVar.a);
                                                        break;
                                                    }
                                                }
                                            }
                                        } catch (URISyntaxException e2) {
                                            hst hstVar2 = jst.e;
                                            ke00 a2 = hstVar2.b.a();
                                            if (a2 != null && a2.b(15)) {
                                                String message = e2.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                a2.a(15, "IntentUrlOpener", e2, message, hstVar2.a);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case -567451565:
                                    if (scheme.equals(ContactsFragment.WEBVIEW_NAME)) {
                                        Intent intent2 = new Intent("android.intent.action.VIEW");
                                        intent2.setData(ContactsContract.Contacts.CONTENT_URI);
                                        intent2.setFlags(SelfTester_JCP.IMITA);
                                        bstVar2.b(intent2);
                                        break;
                                    }
                                    break;
                                case -68673716:
                                    if (scheme.equals("permissions-settings")) {
                                        syj0 b = bstVar2.b.b(url);
                                        jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
                                        if (jyj0Var != null && (obj2 = jyj0Var.a) != null) {
                                            hst hstVar3 = jst.e;
                                            ke00 a3 = hstVar3.b.a();
                                            if (a3 != null && a3.b(15)) {
                                                a3.a(15, null, null, unr0.n(url, "Failed to open settings by uri "), hstVar3.a);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 114715:
                                    if (scheme.equals("tel")) {
                                        Intent intent3 = context2.checkSelfPermission("android.permission.CALL_PHONE") == 0 ? new Intent("android.intent.action.CALL", url) : new Intent("android.intent.action.DIAL", url);
                                        intent3.setFlags(SelfTester_JCP.IMITA);
                                        bstVar2.b(intent3);
                                        break;
                                    }
                                    break;
                            }
                            view2.destroy();
                            return true;
                        }
                        Intent intent4 = new Intent("android.intent.action.VIEW", url);
                        intent4.setFlags(SelfTester_JCP.IMITA);
                        bstVar2.b(intent4);
                        view2.destroy();
                        return true;
                    }
                });
                webViewTransport.setWebView(webView2);
                resultMsg.sendToTarget();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                String[] resources = request.getResources();
                ArrayList arrayList = new ArrayList();
                for (String str : resources) {
                    zxa0 b = pl91.b(str);
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                pey o = vng.o(y3x0.this.e);
                p s = o != null ? eja1.s(o) : null;
                if (s != null) {
                    tje.N(s, null, null, new SystemWebContentView$4$onPermissionRequest$1(y3x0.this, arrayList, request, null), 3);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                pey o = vng.o(y3x0.this.e);
                p s = o != null ? eja1.s(o) : null;
                if (s == null) {
                    return true;
                }
                tje.N(s, null, null, new SystemWebContentView$4$onShowFileChooser$1(y3x0.this, fileChooserParams, filePathCallback, null), 3);
                return true;
            }
        });
    }
}
