package com.yandex.plus.webview.internal.insets;

import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.ern;
import defpackage.s9f;
import defpackage.xdr;
import defpackage.ydr;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] d;
    public final WebViewContainer a;
    public final f b;
    public final xdr c;

    static {
        yxm yxmVar = new yxm(b.class, "footerContainer", "getFooterContainer()Landroid/view/ViewGroup;", 0);
        ern.a.getClass();
        d = new s9f[]{yxmVar};
    }

    public b(WebViewContainer webViewContainer) {
        webViewContainer.getClass();
        this.a = webViewContainer;
        this.b = new f(new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.b(webViewContainer, 7));
        this.c = ydr.a(null);
    }

    public final ViewGroup a() {
        return (ViewGroup) this.b.g(d[0]);
    }
}
