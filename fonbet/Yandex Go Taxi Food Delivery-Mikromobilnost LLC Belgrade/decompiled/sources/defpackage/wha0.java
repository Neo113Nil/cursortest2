package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class wha0 extends x0 {
    public static final /* synthetic */ kgx[] S = {new PropertyReference1Impl("promoCard", 0, "getPromoCard()Lcom/google/android/material/card/MaterialCardView;", wha0.class), b64.x(qoi0.a, wha0.class, "primaryPromoText", "getPrimaryPromoText()Landroid/widget/TextView;", 0), new PropertyReference1Impl("secondaryPromoText", 0, "getSecondaryPromoText()Landroid/widget/TextView;", wha0.class), new PropertyReference1Impl("promoImage", 0, "getPromoImage()Landroid/widget/ImageView;", wha0.class)};
    public final wv5 N;
    public final wv5 O;
    public final wv5 P;
    public final wv5 Q;
    public final /* synthetic */ yha0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wha0(yha0 yha0Var, View view) {
        super(view);
        this.R = yha0Var;
        this.N = new wv5(new a450(view, y9h0.payment_promo_card, 15));
        wv5 wv5Var = new wv5(new a450(view, y9h0.payment_promo_primary_text, 16));
        this.O = wv5Var;
        wv5 wv5Var2 = new wv5(new a450(view, y9h0.payment_promo_secondary_text, 17));
        this.P = wv5Var2;
        this.Q = new wv5(new a450(view, y9h0.payment_promo_image, 18));
        kgx[] kgxVarArr = S;
        ((TextView) wv5Var.a(kgxVarArr[1])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        ((TextView) wv5Var2.a(kgxVarArr[2])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
    }

    public final void W(med0 med0Var) {
        yha0 yha0Var = this.R;
        b5d0 b5d0Var = yha0Var.c;
        fx00 fx00Var = new fx00(13, yha0Var, med0Var);
        View view = this.a;
        bb1.L(view, fx00Var);
        PlusTheme plusTheme = yha0Var.b;
        Context context = view.getContext();
        PlusThemedColor plusThemedColor = med0Var.e;
        PlusColor plusColor = (PlusColor) (tpd0.a(context, plusTheme) ? plusThemedColor.getDark() : plusThemedColor.getLight());
        kgx[] kgxVarArr = S;
        kgx kgxVar = kgxVarArr[0];
        wv5 wv5Var = this.N;
        MaterialCardView materialCardView = (MaterialCardView) wv5Var.a(kgxVar);
        final float dimension = ((MaterialCardView) wv5Var.a(kgxVarArr[0])).getContext().getResources().getDimension(pvg0.pay_sdk_promo_card_corner_radius);
        String str = null;
        materialCardView.setBackground(plusColor != null ? s2d0.a(plusColor, dimension, dimension, dimension, dimension) : null);
        materialCardView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.plus.pay.ui.core.mobile.view.payment.promos.PaymentPromosAdapter$CardViewHolder$bind$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), dimension);
            }
        });
        materialCardView.setClipToOutline(true);
        ImageView imageView = (ImageView) this.Q.a(kgxVarArr[3]);
        if (imageView != null) {
            ((b) b5d0Var).a(imageView);
            PlusThemedImage plusThemedImage = med0Var.d;
            if (plusThemedImage != null) {
                str = (String) (tpd0.a(imageView.getContext(), plusTheme) ? plusThemedImage.getDark() : plusThemedImage.getLight());
            }
            if (str != null) {
                imageView.setVisibility(0);
                ((b) b5d0Var).b(str).b(imageView);
            } else {
                imageView.setVisibility(8);
            }
        }
        ((TextView) this.O.a(kgxVarArr[1])).setText(med0Var.b);
        v3a1.c((TextView) this.P.a(kgxVarArr[2]), med0Var.c);
    }
}
