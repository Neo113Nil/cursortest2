package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.internal.ui.challenge.vpn.u;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.passport.internal.util.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ki7 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ki7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 0:
                gv3 gv3Var = (gv3) this.c;
                String a = gxd.a(str);
                uiq uiqVar = (uiq) gv3Var;
                uiqVar.getClass();
                zdv zdvVar = (zdv) uiqVar.b;
                g0c y = zdvVar.y();
                hgv n = zdvVar.getN();
                n.getClass();
                int ordinal = n.ordinal();
                String s = hrg.s("Завершение загрузки WebView 3DS по адресу ", a, " (", ordinal != 0 ? ordinal != 1 ? "" : "оформление кредита" : "форма 3DS", "), размер страницы nil");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("webview_url", new jkr(a));
                linkedHashMap.put("webview_html_size", new jkr("nil"));
                linkedHashMap.put("webview_tag", new jkr(n.a));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(s));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar, "event_name", "webview_load_finished", "webview_load_finished", vtmVar);
                x60 x60Var = (x60) y;
                x60Var.getClass();
                x60Var.a(j);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 0:
                gv3 gv3Var = (gv3) this.c;
                String a = gxd.a(str);
                uiq uiqVar = (uiq) gv3Var;
                uiqVar.getClass();
                zdv zdvVar = (zdv) uiqVar.b;
                g0c y = zdvVar.y();
                hgv n = zdvVar.getN();
                n.getClass();
                int ordinal = n.ordinal();
                String s = hrg.s("Загрузка конкретной страницы в вебвью по адресу ", a, " (", ordinal != 0 ? ordinal != 1 ? "" : "оформление кредита" : "форма 3DS", ")");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("webview_url", new jkr(a));
                linkedHashMap.put("webview_tag", new jkr(n.a));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(s));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar, "event_name", "webview_load_started", "webview_load_started", vtmVar);
                x60 x60Var = (x60) y;
                x60Var.getClass();
                x60Var.a(j);
                Bundle arguments = zdvVar.getArguments();
                if (arguments != null && arguments.getBoolean("handle_deeplink") && gxd.a.contains(a) && a.equals("yandexbank://deeplink/close")) {
                    zdvVar.requireActivity().getSupportFragmentManager().T();
                    break;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 0:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceResponse != null) {
                    gv3 gv3Var = (gv3) this.c;
                    List list = gxd.a;
                    String a = gxd.a(webResourceRequest.getUrl().toString());
                    int statusCode = webResourceResponse.getStatusCode();
                    uiq uiqVar = (uiq) gv3Var;
                    uiqVar.getClass();
                    zdv zdvVar = (zdv) uiqVar.b;
                    g0c y = zdvVar.y();
                    String valueOf = String.valueOf(statusCode);
                    hgv n = zdvVar.getN();
                    valueOf.getClass();
                    n.getClass();
                    int ordinal = n.ordinal();
                    String o = su4.o(f1d.m("HTTP ошибка в вебвью с кодом ", valueOf, " при загрузке страницы по адресу ", a, " ("), ordinal != 0 ? ordinal != 1 ? "" : "оформление кредита" : "форма 3DS", ")");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    linkedHashMap.put("webview_url", new jkr(a));
                    linkedHashMap.put(Constants.KEY_VALUE, new jkr(valueOf));
                    linkedHashMap.put("webview_tag", new jkr(n.a));
                    linkedHashMap.put(DeviceService.KEY_DESC, new jkr(o));
                    vtm vtmVar = new vtm((Map) linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = su4.g(1, ci0Var.a);
                    vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(vtmVar, "event_name", "webview_error_http_code", "webview_error_http_code", vtmVar);
                    x60 x60Var = (x60) y;
                    x60Var.getClass();
                    x60Var.a(j);
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 0:
                sslErrorHandler.getClass();
                sslError.getClass();
                ((mi7) this.b).g(sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        switch (this.a) {
            case 1:
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    return true;
                }
                y yVar = (y) this.b;
                Activity activity = (Activity) this.c;
                String uri = url.toString();
                uri.getClass();
                yVar.a(new u(uri));
                if (activity == null) {
                    return true;
                }
                a.a(activity, new Intent("android.intent.action.VIEW", url));
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }
}
