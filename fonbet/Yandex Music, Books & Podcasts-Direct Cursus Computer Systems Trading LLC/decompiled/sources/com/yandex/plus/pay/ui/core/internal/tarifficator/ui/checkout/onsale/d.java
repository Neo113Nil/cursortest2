package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale;

import android.view.View;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.i;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d extends opn {
    public static final /* synthetic */ s9f[] x = {new yxm(d.class, "headlineTextView", "getHeadlineTextView()Landroid/widget/TextView;", 0), f1d.c(ern.a, d.class, "productView", "getProductView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/product/ProductView;", 0)};
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d u;
    public final f v;
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.d w;

    public d(com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar, View view) {
        super(view);
        this.v = new f(new i(view, 15));
        s9f s9fVar = x[1];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.onsale_product_view);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView");
            }
            this.w = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.d((ProductView) findViewById, (com.yandex.plus.core.imageloader.b) bVar.f, (fkn) bVar.g, new com.yandex.plus.bdui.templating.render.a(12, this, bVar));
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }
}
