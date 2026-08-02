package defpackage;

import android.view.ViewGroup;
import com.yandex.plus.webview.api.WebViewContainer;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class qq41 {
    public static final /* synthetic */ kgx[] c;
    public final WebViewContainer a;
    public final wv5 b;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("footerContainer", 0, "getFooterContainer()Landroid/view/ViewGroup;", qq41.class);
        qoi0.a.getClass();
        c = new kgx[]{propertyReference1Impl};
    }

    public qq41(WebViewContainer webViewContainer) {
        this.a = webViewContainer;
        this.b = new wv5(new l9f0(webViewContainer, dah0.plus_webview_footer_container, 21));
        bvf0.c(null);
    }

    public static final ViewGroup a(qq41 qq41Var) {
        return (ViewGroup) qq41Var.b.a(c[0]);
    }
}
