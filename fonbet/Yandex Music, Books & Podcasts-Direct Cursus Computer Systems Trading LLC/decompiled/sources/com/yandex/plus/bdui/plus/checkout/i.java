package com.yandex.plus.bdui.plus.checkout;

import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.f96;
import defpackage.s9f;
import defpackage.zne;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements com.yandex.plus.core.insets.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zneVar.getClass();
                ((com.yandex.plus.divkit.impl.p) obj).a(new com.yandex.plus.divkit.api.m("safeAreaTop", zneVar.b), new com.yandex.plus.divkit.api.m("safeAreaBottom", zneVar.d), new com.yandex.plus.divkit.api.m("safeAreaLeft", zneVar.a), new com.yandex.plus.divkit.api.m("safeAreaRight", zneVar.c));
                break;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g gVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g) obj;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q;
                zneVar.getClass();
                int i2 = zneVar.d;
                f96 f96Var = new f96();
                com.yandex.passport.internal.core.accounts.h hVar = gVar.j;
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.g.q;
                f96Var.f((ConstraintLayout) hVar.x(s9fVarArr2[0]));
                if (i2 > 0) {
                    f96Var.h(gVar.A().getId(), 4, 0, 4, i2);
                    WebView webView = gVar.A().getWebView();
                    webView.scrollTo(webView.getScrollX(), webView.getContentHeight());
                } else {
                    f96Var.h(gVar.A().getId(), 4, gVar.y().getId(), 3, r1.k(R.dimen.pay_sdk_margin_large, gVar.A()));
                }
                f96Var.b((ConstraintLayout) hVar.x(s9fVarArr2[0]));
                break;
        }
    }
}
