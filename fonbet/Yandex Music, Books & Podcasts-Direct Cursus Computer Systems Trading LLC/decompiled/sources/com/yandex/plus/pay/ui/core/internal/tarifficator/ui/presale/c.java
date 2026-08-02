package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.h;
import defpackage.ern;
import defpackage.f1d;
import defpackage.oj4;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public static final /* synthetic */ s9f[] i = {new yxm(c.class, "cardView", "getCardView()Lcom/google/android/material/card/MaterialCardView;", 0), f1d.c(ern.a, c.class, "periodTextView", "getPeriodTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "benefitTextView", "getBenefitTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "priceTextView", "getPriceTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "priceDescriptionTextView", "getPriceDescriptionTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "button", "getButton()Landroid/widget/Button;", 0), new yxm(c.class, "additionalButtonTextTextView", "getAdditionalButtonTextTextView()Landroid/widget/TextView;", 0)};
    public final PresaleOfferView a;
    public final f b;
    public final f c;
    public final f d;
    public final f e;
    public final f f;
    public final f g;
    public final f h;

    public c(PresaleOfferView presaleOfferView, com.yandex.plus.pay.ui.design.api.api.a aVar, Function0 function0) {
        presaleOfferView.getClass();
        aVar.getClass();
        this.a = presaleOfferView;
        this.b = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 20));
        this.c = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 21));
        f fVar = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 22));
        this.d = fVar;
        this.e = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 23));
        this.f = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 24));
        f fVar2 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 25));
        this.g = fVar2;
        this.h = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.a(presaleOfferView, 26));
        float dimension = presaleOfferView.getContext().getResources().getDimension(R.dimen.pay_sdk_medium_corner_size);
        Context context = presaleOfferView.getContext();
        context.getClass();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.pay_sdk_presale_offer_card_gradient_top_space);
        Context context2 = presaleOfferView.getContext();
        context2.getClass();
        Drawable y = com.yandex.plus.bdui.plus.analytics.b.y(((com.yandex.plus.pay.ui.design.plus.api.a) aVar).a(context2), dimension);
        Drawable background = a().getBackground();
        a().setBackground(new LayerDrawable(new Drawable[]{y, new InsetDrawable(background, 0, dimensionPixelSize, 0, 0)}));
        a().setClipToOutline(false);
        a().setOutlineProvider(new oj4(3, background));
        float dimension2 = presaleOfferView.getContext().getResources().getDimension(R.dimen.pay_sdk_small_corner_size);
        Context context3 = presaleOfferView.getContext();
        context3.getClass();
        int b = com.yandex.plus.home.common.utils.a.b(context3, R.attr.pay_sdk_successColor);
        s9f[] s9fVarArr = i;
        ((TextView) fVar.g(s9fVarArr[2])).setBackground(com.yandex.plus.bdui.plus.analytics.b.y(new ColorDrawable(b), dimension2));
        r1.E((Button) fVar2.g(s9fVarArr[5]), new h(4, function0));
    }

    public final MaterialCardView a() {
        return (MaterialCardView) this.b.g(i[0]);
    }
}
