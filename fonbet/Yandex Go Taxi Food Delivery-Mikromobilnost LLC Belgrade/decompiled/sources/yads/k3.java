package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.kgx;
import defpackage.qha1;
import defpackage.r581;

/* loaded from: classes7.dex */
public final class k3 extends WebChromeClient {
    public static final /* synthetic */ kgx[] b = {qha1.a(k3.class, "context", "getContext()Landroid/content/Context;")};
    public final r581 a;

    public k3(Context context) {
        this.a = new r581(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        r581 r581Var = this.a;
        kgx kgxVar = b[0];
    }
}
