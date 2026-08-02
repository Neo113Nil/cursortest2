package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class x6c extends x0 {
    public static final /* synthetic */ kgx[] S = {new PropertyReference1Impl("offerTitleTextView", 0, "getOfferTitleTextView()Landroid/widget/TextView;", x6c.class), b64.x(qoi0.a, x6c.class, "logosImageView", "getLogosImageView()Landroid/widget/ImageView;", 0), new PropertyReference1Impl("buttonTextView", 0, "getButtonTextView()Landroid/widget/TextView;", x6c.class), new PropertyReference1Impl("buttonAdditionalTextView", 0, "getButtonAdditionalTextView()Landroid/widget/TextView;", x6c.class)};
    public final wv5 N;
    public final wv5 O;
    public final wv5 P;
    public final wv5 Q;
    public final /* synthetic */ z6c R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6c(z6c z6cVar, View view) {
        super(view);
        this.R = z6cVar;
        this.N = new wv5(new j6c(view, z9h0.closing_item_offer_text, 3));
        this.O = new wv5(new j6c(view, z9h0.closing_item_logos_image, 4));
        this.P = new wv5(new j6c(view, z9h0.closing_item_benefit_text, 5));
        this.Q = new wv5(new j6c(view, z9h0.closing_item_description_text, 6));
    }
}
