package E2;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import r2.C4906k;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f887n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f888u;

    public /* synthetic */ y(z zVar, int i) {
        this.f887n = i;
        this.f888u = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient e9;
        switch (this.f887n) {
            case 0:
                z zVar = this.f888u;
                synchronized (zVar.f891c) {
                    WebView webView = zVar.f894f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        w2.D d9 = C4906k.f40186C.f40191c;
                        if (Build.VERSION.SDK_INT < 26) {
                            if (com.bumptech.glide.f.m("GET_WEB_VIEW_CLIENT")) {
                                try {
                                    e9 = H0.e.e(webView);
                                } catch (RuntimeException e10) {
                                    C4906k.f40186C.f40196h.d("AdUtil.getWebViewClient", e10);
                                }
                            }
                            throw new IllegalStateException("getWebViewClient not supported");
                        }
                        e9 = webView.getWebViewClient();
                        if (e9 == zVar) {
                            return;
                        }
                        if (e9 != null) {
                            zVar.f893e = e9;
                        }
                        webView.setWebViewClient(zVar);
                        zVar.x();
                        return;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
            default:
                z zVar2 = this.f888u;
                zVar2.f890b.execute(new y(zVar2, 0));
                return;
        }
    }
}
