package defpackage;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.passport.common.browser.c;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.entities.h;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.challenge.vpn.e;
import com.yandex.passport.internal.ui.challenge.vpn.v;
import com.yandex.passport.internal.ui.challenge.vpn.y;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.domik.samlsso.g;
import java.util.HashSet;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes5.dex */
public final class d4n extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                super.onPageFinished(webView, str);
                lbv lbvVar = (lbv) this.b;
                if (!lbvVar.j && (progressDialog = lbvVar.e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = lbvVar.g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                kbv kbvVar = lbvVar.d;
                if (kbvVar != null) {
                    kbvVar.setVisibility(0);
                }
                ImageView imageView = lbvVar.f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                lbvVar.k = true;
                break;
            case 2:
                super.onPageFinished(webView, str);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "VpnChallengeScreen onPageFinished url=" + str, 8);
                }
                if (webView != null) {
                    webView.evaluateJavascript("\n(function() {\n    window.close = function() {\n        window.nativeAMAndroid.onClose();\n    };\n    window.settings = function() {\n        window.nativeAMAndroid.onSettings();\n    };\n    window.reload = function() {\n        window.nativeAMAndroid.onReload();\n    };\n    return true;\n})();\n", new e());
                }
                ((y) this.b).a(v.a);
                break;
            case 3:
                com.yandex.passport.internal.ui.domik.samlsso.e eVar = (com.yandex.passport.internal.ui.domik.samlsso.e) this.b;
                super.onPageFinished(webView, str);
                if (str != null) {
                    Context requireContext = eVar.requireContext();
                    requireContext.getClass();
                    if (str.equals(c.b(requireContext))) {
                        g gVar = (g) eVar.g;
                        gVar.getClass();
                        String valueOf = String.valueOf(gVar.v);
                        CookieManager.getInstance().flush();
                        String cookie = CookieManager.getInstance().getCookie(valueOf);
                        Continuation continuation = null;
                        if (cookie != null) {
                            com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(com.yandex.plus.core.network.api.utils.a.P(com.yandex.plus.core.network.api.utils.a.L(gVar.r.d.a)).d());
                            a.getClass();
                            h hVar = new h(a, null, null, "https://yandex.ru/", cookie);
                            d dVar = gVar.w;
                            gVar.l.m(Boolean.TRUE);
                            x97.y(ot0.F(gVar), null, null, new we(gVar, hVar, dVar, continuation, 9), 3);
                            break;
                        } else if (a.a.isEnabled()) {
                            a.c(b.e, null, "Cookies parse error, url: ".concat(str), 8);
                            break;
                        }
                    }
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                iwe iweVar = (iwe) ((cr) obj).d;
                if (iweVar != null) {
                    YaRotatingProgress yaRotatingProgress = (YaRotatingProgress) iweVar.c;
                    yaRotatingProgress.c = false;
                    yaRotatingProgress.removeCallbacks(yaRotatingProgress.e);
                    yaRotatingProgress.d = false;
                    yaRotatingProgress.removeCallbacks(yaRotatingProgress.f);
                    jyr jyrVar = sht.a;
                    yaRotatingProgress.setVisibility(8);
                    break;
                }
                break;
            case 1:
                webView.getClass();
                str.getClass();
                HashSet hashSet = j3c.a;
                super.onPageStarted(webView, str, bitmap);
                lbv lbvVar = (lbv) obj;
                if (!lbvVar.j && (progressDialog = lbvVar.e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            case 2:
                super.onPageStarted(webView, str, bitmap);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "VpnChallengeScreen onPageStarted url=" + str, 8);
                    break;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 2:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (a.a.isEnabled()) {
                    b bVar = b.e;
                    StringBuilder sb = new StringBuilder("VpnChallengeScreen onReceivedError url=");
                    sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                    sb.append(" code=");
                    sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                    sb.append(" description=");
                    sb.append((Object) (webResourceError != null ? webResourceError.getDescription() : null));
                    a.c(bVar, null, sb.toString(), 8);
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 2:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (a.a.isEnabled()) {
                    b bVar = b.e;
                    StringBuilder sb = new StringBuilder("VpnChallengeScreen onReceivedHttpError url=");
                    sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                    sb.append(" code=");
                    sb.append(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
                    sb.append(" reason=");
                    sb.append(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
                    a.c(bVar, null, sb.toString(), 8);
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
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                ((ioi) ((jyr) ((cr) this.b).e).getValue()).a(sslError, sslErrorHandler, new u5i(10));
                break;
            case 1:
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((lbv) this.b).d(new a3c(null, -11, null));
                break;
            case 2:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                if (a.a.isEnabled()) {
                    a.c(b.e, null, "VpnChallengeScreen onReceivedSslError error=" + sslError, 8);
                    break;
                }
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        switch (this.a) {
            case 1:
                lbv lbvVar = (lbv) this.b;
                webView.getClass();
                str.getClass();
                HashSet hashSet = j3c.a;
                Uri parse = Uri.parse(str);
                parse.getClass();
                boolean z = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
                if (!kotlin.text.c.v(str, lbvVar.b, false)) {
                    if (kotlin.text.c.v(str, "fbconnect://cancel", false)) {
                        lbvVar.cancel();
                        return true;
                    }
                    if (!z && !StringsKt.M(str, "touch", false)) {
                        try {
                            lbvVar.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                    return false;
                }
                Bundle b = lbvVar.b(str);
                String string = b.getString("error");
                if (string == null) {
                    string = b.getString("error_type");
                }
                String string2 = b.getString("error_msg");
                if (string2 == null) {
                    string2 = b.getString("error_message");
                }
                if (string2 == null) {
                    string2 = b.getString("error_description");
                }
                String string3 = b.getString("error_code");
                if (string3 != null && !gvt.D(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused2) {
                    }
                    if (!gvt.D(string) && gvt.D(string2) && i == -1) {
                        hbv hbvVar = lbvVar.c;
                        if (hbvVar == null || lbvVar.i) {
                            return true;
                        }
                        lbvVar.i = true;
                        hbvVar.h(b, null);
                        lbvVar.dismiss();
                        return true;
                    }
                    if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        lbvVar.cancel();
                        return true;
                    }
                    if (i != 4201) {
                        lbvVar.cancel();
                        return true;
                    }
                    lbvVar.d(new l3c(new g3c(i, string, string2), string2));
                    return true;
                }
                i = -1;
                if (!gvt.D(string)) {
                }
                if (string == null) {
                }
                if (i != 4201) {
                }
                break;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                str2.getClass();
                super.onReceivedError(webView, i, str, str2);
                ((lbv) this.b).d(new a3c(str, i, str2));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        switch (this.a) {
            case 0:
                Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                if (url == null || (scheme = url.getScheme()) == null || !kotlin.text.c.v(scheme, "bank", false)) {
                    break;
                } else {
                    Context context = (Context) ((cr) this.b).b;
                    context.getClass();
                    try {
                        context.startActivity(new Intent("android.intent.action.VIEW", url));
                        break;
                    } catch (ActivityNotFoundException unused) {
                        hag.x(context, R.string.error_open_bank_application, 0);
                        return true;
                    }
                }
                break;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
