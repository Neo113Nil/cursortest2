package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.messenger.websdk.api.WebErrorException;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.messenger.websdk.internal.web.HttpErrorException;
import kotlin.Pair;
import kotlin.text.c;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public final class uh4 extends WebViewClient {
    public final fi4 a;
    public final agv b;
    public boolean c;
    public boolean d = true;

    public uh4(fi4 fi4Var, bgv bgvVar) {
        this.a = fi4Var;
        this.b = bgvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        fi4 fi4Var = this.a;
        fi4Var.getClass();
        t1f t1fVar = fi4Var.q;
        qdc qdcVar = fi4Var.h;
        String fragment = Uri.parse(str).getFragment();
        fi4Var.D = fragment == null ? yh4.c : fragment.equals("/") ? yh4.a : c.v(fragment, "/@/", false) ? yh4.d : (c.v(fragment, "/chats/", false) || c.v(fragment, "/user/", false)) ? yh4.b : yh4.c;
        fi4Var.k();
        if (webView.getProgress() == 100) {
            qdcVar.getClass();
            dwt.b(new zya(18, qdcVar, "wm_messenger_completely_loaded"));
            t1fVar.getClass();
            b2k b2kVar = (b2k) t1fVar.d;
            if (b2kVar != null) {
                b2kVar.c = Long.valueOf(SystemClock.elapsedRealtime());
            }
        }
        if (fi4Var.A || this.c || !this.d) {
            return;
        }
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_messenger_loaded"));
        t1fVar.getClass();
        b2k b2kVar2 = (b2k) t1fVar.d;
        if (b2kVar2 != null) {
            b2kVar2.b = Long.valueOf(SystemClock.elapsedRealtime());
        }
        this.c = true;
        fi4Var.t = false;
        h02 h02Var = fi4Var.d;
        jzi jziVar = new jzi(this);
        h02Var.getClass();
        qdc qdcVar2 = h02Var.c;
        qdcVar2.getClass();
        dwt.b(new zya(18, qdcVar2, "wm_auth_process"));
        String a = h02Var.a();
        if (a != null) {
            jziVar.v(a);
            return;
        }
        if (!h02Var.f) {
            jziVar.u(new NullPointerException("Auth token not initialized"));
            return;
        }
        String a2 = h02Var.e.a();
        if (a2 != null) {
            jziVar.v(a2);
        } else {
            h02Var.h.post(new qf0(5, h02Var, jziVar));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.d = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        Uri url = webResourceRequest.getUrl();
        url.getClass();
        fi4 fi4Var = this.a;
        if (y2x.C(url, fi4Var.K)) {
            return;
        }
        this.d = false;
        fi4Var.h.sendEvent("wm_messenger_load_error", tah.b(new Pair("isMainPageLoaded", Boolean.valueOf(fi4Var.A))));
        WebErrorException webErrorException = new WebErrorException(webResourceRequest.getUrl() + " -> " + webResourceError.getErrorCode() + StringUtil.SPACE + ((Object) webResourceError.getDescription()));
        if (fi4Var.A) {
            return;
        }
        fi4Var.j(fi4Var.k.a() ? new zh4(webErrorException) : new ci4(webErrorException));
        fi4Var.P.c();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri url = webResourceRequest.getUrl();
        url.getClass();
        fi4 fi4Var = this.a;
        if (y2x.C(url, fi4Var.K)) {
            return;
        }
        this.d = false;
        qdc qdcVar = fi4Var.h;
        Pair pair = new Pair("isMainPageLoaded", Boolean.valueOf(fi4Var.A));
        Object url2 = webResourceRequest.getUrl();
        if (url2 == null) {
            url2 = "";
        }
        qdcVar.sendEvent("wm_messenger_http_error", uah.e(pair, new Pair("url", url2)));
        if (fi4Var.A) {
            return;
        }
        fi4Var.j(new zh4(new HttpErrorException(webResourceRequest.getUrl() + " -> " + webResourceResponse.getStatusCode() + StringUtil.SPACE + webResourceResponse.getReasonPhrase())));
        fi4Var.P.c();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        agv agvVar = this.b;
        boolean b = agvVar != null ? agvVar.b(sslError, new xzi(sslErrorHandler)) : false;
        if (!b) {
            sslErrorHandler.cancel();
        }
        qdc qdcVar = this.a.h;
        Pair pair = new Pair("source", "webview");
        String url = sslError.getUrl();
        url.getClass();
        String host = Uri.parse(url).getHost();
        if (host == null) {
            host = sslError.getUrl();
        }
        Pair pair2 = new Pair("host", host);
        int primaryError = sslError.getPrimaryError();
        qdcVar.sendEvent("wm_ssl_error", uah.e(pair, pair2, new Pair("error_reason", primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? k5r.i(primaryError, "unknown_") : "invalid" : "date_invalid" : "untrusted" : "id_mismatch" : "expired" : "not_yet_valid"), new Pair("ya_certificates_enabled", Boolean.valueOf(agvVar != null)), new Pair("handled", Boolean.valueOf(b))));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        WebResourceResponse webResourceResponse;
        rdk rdkVar;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            fi4 fi4Var = this.a;
            fi4Var.getClass();
            if (y2x.C(url, fi4Var.K)) {
                mmo mmoVar = fi4Var.u;
                if (mmoVar != null && (rdkVar = (rdk) mmoVar.f) != null) {
                    dwt.b(new aw5(23, rdkVar, url));
                }
                webResourceResponse = new WebResourceResponse("text/plain", "utf-8", dwt.b);
                webResourceResponse.setStatusCodeAndReasonPhrase(NetworkRequestException.RESOURCE_NOT_FOUND, "handled by sdk");
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        t tVar;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        fi4 fi4Var = this.a;
        WebMessengerNavigationInterceptor webMessengerNavigationInterceptor = fi4Var.o;
        Intent intent = new Intent("android.intent.action.VIEW", url);
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            mmo mmoVar = fi4Var.u;
            if (mmoVar == null || (tVar = (t) mmoVar.d) == null) {
                return true;
            }
            tVar.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            kue kueVar = fi4Var.n;
            kueVar.getClass();
            kueVar.a("web", e, true);
            return true;
        }
    }
}
