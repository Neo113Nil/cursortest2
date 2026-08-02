package com.yandex.plus.pay.ui.core.mobile.view.payment.promos;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fq2;
import defpackage.opn;
import defpackage.qp8;
import defpackage.s9f;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c extends opn {
    public static final /* synthetic */ s9f[] z = {new yxm(c.class, "promoCard", "getPromoCard()Lcom/google/android/material/card/MaterialCardView;", 0), f1d.c(ern.a, c.class, "primaryPromoText", "getPrimaryPromoText()Landroid/widget/TextView;", 0), new yxm(c.class, "secondaryPromoText", "getSecondaryPromoText()Landroid/widget/TextView;", 0), new yxm(c.class, "promoImage", "getPromoImage()Landroid/widget/ImageView;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final /* synthetic */ e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, View view) {
        super(view);
        this.y = eVar;
        this.u = new com.yandex.plus.bdui.plus.content.controller.f(new b(view, 0));
        com.yandex.plus.bdui.plus.content.controller.f fVar = new com.yandex.plus.bdui.plus.content.controller.f(new b(view, 1));
        this.v = fVar;
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = new com.yandex.plus.bdui.plus.content.controller.f(new b(view, 2));
        this.w = fVar2;
        this.x = new com.yandex.plus.bdui.plus.content.controller.f(new b(view, 3));
        s9f[] s9fVarArr = z;
        ((TextView) fVar.g(s9fVarArr[1])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
        ((TextView) fVar2.g(s9fVarArr[2])).setMovementMethod(new com.yandex.plus.home.common.ui.a());
    }

    public final void t(f fVar) {
        fVar.getClass();
        View view = this.a;
        view.getClass();
        e eVar = this.y;
        com.yandex.plus.core.imageloader.b bVar = eVar.g;
        r1.E(view, new fq2(19, eVar, fVar));
        com.yandex.plus.ui.core.theme.a aVar = eVar.f;
        Context context = view.getContext();
        context.getClass();
        v vVar = fVar.e;
        k kVar = u.r(context, aVar) ? vVar.b : vVar.a;
        s9f[] s9fVarArr = z;
        s9f s9fVar = s9fVarArr[0];
        com.yandex.plus.bdui.plus.content.controller.f fVar2 = this.u;
        MaterialCardView materialCardView = (MaterialCardView) fVar2.g(s9fVar);
        float dimension = ((MaterialCardView) fVar2.g(s9fVarArr[0])).getContext().getResources().getDimension(R.dimen.pay_sdk_promo_card_corner_radius);
        String str = null;
        materialCardView.setBackground(kVar != null ? com.yandex.plus.bdui.plus.analytics.b.B(kVar, dimension, dimension, dimension, dimension) : null);
        materialCardView.setOutlineProvider(new qp8(dimension));
        materialCardView.setClipToOutline(true);
        ImageView imageView = (ImageView) this.x.g(s9fVarArr[3]);
        if (imageView != null) {
            ((com.yandex.plus.coil.b) bVar).a(imageView);
            y yVar = fVar.d;
            if (yVar != null) {
                Context context2 = imageView.getContext();
                context2.getClass();
                str = u.r(context2, aVar) ? yVar.b : yVar.a;
            }
            if (str != null) {
                imageView.setVisibility(0);
                ((com.yandex.plus.coil.b) bVar).b(str).i(imageView);
            } else {
                imageView.setVisibility(8);
            }
        }
        ((TextView) this.v.g(s9fVarArr[1])).setText(fVar.b);
        r1.F((TextView) this.w.g(s9fVarArr[2]), fVar.c);
    }
}
