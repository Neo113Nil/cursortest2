package defpackage;

import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.resources.core.a;

/* loaded from: classes2.dex */
public final class wu41 {
    public final WebViewToolbar a;
    public final View b;
    public final zsz0 c;
    public final sls d;
    public final sls e;
    public final String f;

    public wu41(WebViewToolbar webViewToolbar, lld0 lld0Var, View view, zsz0 zsz0Var, sls slsVar, sls slsVar2) {
        this.a = webViewToolbar;
        this.b = view;
        this.c = zsz0Var;
        this.d = slsVar;
        this.e = slsVar2;
        boolean z = zsz0Var.a;
        boolean z2 = zsz0Var.b;
        if (z && z2) {
            webViewToolbar.setVisibility(0);
            webViewToolbar.setIsDashVisible(true);
            view.setVisibility(8);
        } else {
            webViewToolbar.setIsDashVisible(false);
            webViewToolbar.setVisibility(z ? 0 : 8);
            view.setVisibility(z2 ? 0 : 8);
        }
        this.f = bb1.t(((a) lld0Var).a(zyh0.Home_ContentPlaceholder_SimpleWebView_Toolbar_Title), webViewToolbar);
    }

    public final void a(vu41 vu41Var) {
        WebViewToolbar webViewToolbar = this.a;
        if (webViewToolbar.getVisibility() == 0) {
            webViewToolbar.setTitle(vu41Var.b);
            zsz0 zsz0Var = this.c;
            if (zsz0Var.d && vu41Var.c) {
                webViewToolbar.showBackStartIcon();
                webViewToolbar.setOnStartIconClickListener(this.d);
            } else {
                webViewToolbar.hideStartIcon();
            }
            if (!zsz0Var.c) {
                webViewToolbar.hideEndIcon();
            } else {
                webViewToolbar.showCloseEndIcon();
                webViewToolbar.setOnEndIconClickListener(this.e);
            }
        }
    }
}
