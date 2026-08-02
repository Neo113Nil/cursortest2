package defpackage;

import android.net.Uri;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.webview.core.PlusWebChromeClient;
import com.yandex.plus.webview.core.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class rn41 implements mn41 {
    public final WebView a;
    public final pgz b;
    public final tls c;
    public final tls d;
    public final wls e;
    public final tls f;
    public final wls g;
    public final wls h;
    public final wls i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [on41] */
    /* JADX WARN: Type inference failed for: r4v5, types: [on41] */
    /* JADX WARN: Type inference failed for: r5v3, types: [on41] */
    public rn41(WebView webView, pgz pgzVar, so41 so41Var, tls tlsVar, tls tlsVar2, wls wlsVar, tls tlsVar3, zls zlsVar, wls wlsVar2, sn41 sn41Var, wls wlsVar3, byt0 byt0Var, boolean z, boolean z2, int i) {
        new pn41();
        tls r941Var = (i & 16) != 0 ? new r941(26) : tlsVar;
        sn41 sn41Var2 = (i & 1024) != 0 ? null : sn41Var;
        this.a = webView;
        this.b = pgzVar;
        this.c = r941Var;
        this.d = tlsVar2;
        this.e = wlsVar;
        this.f = tlsVar3;
        this.g = wlsVar2;
        this.h = sn41Var2;
        this.i = wlsVar3;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "init()");
        }
        LogPriority logPriority2 = LogPriority.VERBOSE;
        if (pgzVar.e(logPriority2)) {
            pgzVar.a(logPriority2, "WebViewControllerImpl", "enableWebViewDebugging()");
        }
        final int i2 = 2;
        final int i3 = 1;
        if ((webView.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WebViewControllerImpl", "WebView debug enabled");
            }
        }
        if (pgzVar.e(logPriority2)) {
            pgzVar.a(logPriority2, "WebViewControllerImpl", "applyWebViewSettings()");
        }
        webView.setFocusable(1);
        webView.setFocusableInTouchMode(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        final int i4 = 0;
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        r941Var.invoke(new qn41(this));
        if (pgzVar.e(logPriority2)) {
            pgzVar.a(logPriority2, "WebViewControllerImpl", "overrideChromeClient()");
        }
        webView.setWebChromeClient(new PlusWebChromeClient(webView.getContext(), tlsVar2, wlsVar));
        if (pgzVar.e(logPriority2)) {
            pgzVar.a(logPriority2, "WebViewControllerImpl", "overrideWebViewClient()");
        }
        webView.setWebViewClient((WebViewClient) ((hms) a.a).a(so41Var, new tls(this) { // from class: on41
            public final /* synthetic */ rn41 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i5 = i4;
                zy11 zy11Var = zy11.a;
                rn41 rn41Var = this.b;
                switch (i5) {
                    case 0:
                        srd0 srd0Var = (srd0) obj;
                        wls wlsVar4 = rn41Var.g;
                        break;
                    case 1:
                        String str = (String) obj;
                        wls wlsVar5 = rn41Var.h;
                        if (wlsVar5 != null) {
                            wlsVar5.invoke(rn41Var.a, str);
                            break;
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        wls wlsVar6 = rn41Var.i;
                        if (wlsVar6 != null) {
                            wlsVar6.invoke(rn41Var.a, str2);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new tls(this) { // from class: on41
            public final /* synthetic */ rn41 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i5 = i3;
                zy11 zy11Var = zy11.a;
                rn41 rn41Var = this.b;
                switch (i5) {
                    case 0:
                        srd0 srd0Var = (srd0) obj;
                        wls wlsVar4 = rn41Var.g;
                        break;
                    case 1:
                        String str = (String) obj;
                        wls wlsVar5 = rn41Var.h;
                        if (wlsVar5 != null) {
                            wlsVar5.invoke(rn41Var.a, str);
                            break;
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        wls wlsVar6 = rn41Var.i;
                        if (wlsVar6 != null) {
                            wlsVar6.invoke(rn41Var.a, str2);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new tls(this) { // from class: on41
            public final /* synthetic */ rn41 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i5 = i2;
                zy11 zy11Var = zy11.a;
                rn41 rn41Var = this.b;
                switch (i5) {
                    case 0:
                        srd0 srd0Var = (srd0) obj;
                        wls wlsVar4 = rn41Var.g;
                        break;
                    case 1:
                        String str = (String) obj;
                        wls wlsVar5 = rn41Var.h;
                        if (wlsVar5 != null) {
                            wlsVar5.invoke(rn41Var.a, str);
                            break;
                        }
                        break;
                    default:
                        String str2 = (String) obj;
                        wls wlsVar6 = rn41Var.i;
                        if (wlsVar6 != null) {
                            wlsVar6.invoke(rn41Var.a, str2);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, tlsVar3, zlsVar, byt0Var, Boolean.valueOf(z), pgzVar));
        webView.setVerticalScrollBarEnabled(z2);
        webView.setHorizontalScrollBarEnabled(z2);
    }

    @Override // defpackage.mn41
    public final boolean a() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "back()");
        }
        WebView webView = this.a;
        if (!webView.canGoBack()) {
            return false;
        }
        webView.goBack();
        return true;
    }

    @Override // defpackage.mn41
    public final void b(String str) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "evaluateJavaScript()");
        }
        this.a.evaluateJavascript(str, null);
    }

    @Override // defpackage.mn41
    public final WebBackForwardList c() {
        return this.a.copyBackForwardList();
    }

    @Override // defpackage.mn41
    public final boolean canGoBack() {
        return this.a.canGoBack();
    }

    @Override // defpackage.mn41
    public final void clearHistory() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "clearHistory()");
        }
        this.a.clearHistory();
    }

    @Override // defpackage.mn41
    public final String d() {
        String url = this.a.getUrl();
        return url == null ? "about:blank" : url;
    }

    @Override // defpackage.mn41
    public final String getUserAgentString() {
        return this.a.getSettings().getUserAgentString();
    }

    @Override // defpackage.mn41
    public final void goBack() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "goBack()");
        }
        this.a.goBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mn41
    public void loadUrl(String str, Map map) {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "loadUrl() url=".concat(str));
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        this.a.loadUrl(str, map);
    }

    @Override // defpackage.mn41
    public void onPause() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "onPause()");
        }
        this.a.onPause();
    }

    @Override // defpackage.mn41
    public void onResume() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "onResume()");
        }
        this.a.onResume();
    }

    @Override // defpackage.mn41
    public void reload() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "reload()");
        }
        this.a.reload();
    }

    @Override // defpackage.mn41
    public final void setAudioMuted(boolean z) {
        if (hm91.d("MUTE_AUDIO")) {
            Uri uri = rm41.a;
            if (!qp41.P.a()) {
                throw qp41.a();
            }
            rm41.c(this.a).a.setAudioMuted(z);
        }
    }

    @Override // defpackage.mn41
    public void stopLoading() {
        LogPriority logPriority = LogPriority.DEBUG;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "WebViewControllerImpl", "stopLoading()");
        }
        this.a.stopLoading();
    }
}
