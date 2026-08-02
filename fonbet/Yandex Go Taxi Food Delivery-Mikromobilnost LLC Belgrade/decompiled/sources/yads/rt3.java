package yads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.gq81;
import defpackage.pj61;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class rt3 extends WebViewClient {
    public final /* synthetic */ gq81 a;

    public rt3(gq81 gq81Var) {
        this.a = gq81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.toString();
        Objects.toString(webView);
        if (((WebView) this.a.b.get()) == webView) {
            gq81 gq81Var = this.a;
            gq81Var.getClass();
            gq81Var.b = new pj61(null);
        }
        webView.destroy();
        return true;
    }
}
