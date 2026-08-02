package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.aq71;
import defpackage.cvu0;
import defpackage.g371;
import defpackage.kgx;
import defpackage.qha1;
import defpackage.r581;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class l3 extends WebViewClient {
    public static final /* synthetic */ kgx[] d = {qha1.a(l3.class, "context", "getContext()Landroid/content/Context;")};
    public final r581 a;
    public final aq71 b = new aq71();
    public final g371 c = new g371();

    public l3(Context context) {
        this.a = new r581(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        r581 r581Var = this.a;
        kgx kgxVar = d[0];
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        r581 r581Var = this.a;
        kgx kgxVar = d[0];
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        aq71 aq71Var = this.b;
        Context context = webView.getContext();
        aq71Var.getClass();
        if (aq71.a(context, sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r6.c.a(r7.getContext(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r8) == false) goto L18;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str != null && str.length() > 0) {
            if (str.length() != 0) {
                String k = new Regex("http(s?)://").k(str, "");
                b93.c.getClass();
                b93[] b93VarArr = {b93.d, b93.e, b93.f, b93.g};
                for (int i = 0; i < 4; i++) {
                    if (cvu0.x(k, b93VarArr[i].b, false)) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
