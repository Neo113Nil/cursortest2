package defpackage;

import com.yandex.go.places.webview.impl.navigation.common.a;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;

/* loaded from: classes6.dex */
public final class vf41 {
    public final an41 a;

    public vf41(an41 an41Var) {
        this.a = an41Var;
    }

    public static WebContainerModalView a(vf41 vf41Var, UiWebViewConfig uiWebViewConfig, uf41 uf41Var, a aVar, to41 to41Var, int i) {
        if ((i & 2) != 0) {
            uf41Var = null;
        }
        bi41 bi41Var = aVar;
        if ((i & 4) != 0) {
            bi41Var = bi41.D4;
        }
        bi41 bi41Var2 = bi41Var;
        yf41 yf41Var = o501.w;
        if ((i & 64) != 0) {
            to41Var = to41.a;
        }
        to41 to41Var2 = to41Var;
        unh unhVar = ms41.a;
        an41 an41Var = vf41Var.a;
        jy31 jy31Var = new jy31(2, uf41Var);
        WebViewContainerImpl c = id00.e(an41Var.a, uiWebViewConfig, bi41Var2, dp41.a, to41Var2, unhVar).c();
        c.setOnCloseRequested(jy31Var);
        return new WebContainerModalView(uiWebViewConfig, c, uf41Var, new fg41(yf41Var));
    }
}
