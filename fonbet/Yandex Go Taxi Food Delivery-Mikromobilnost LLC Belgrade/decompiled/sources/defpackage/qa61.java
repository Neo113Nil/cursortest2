package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;

/* loaded from: classes3.dex */
public final class qa61 implements zo31 {
    public final MerchantOffersBannerView a;
    public final ImageView b;
    public final ImageView c;
    public final YbDivView d;
    public final View e;
    public final TextView f;
    public final TextView g;

    public qa61(MerchantOffersBannerView merchantOffersBannerView, ImageView imageView, ImageView imageView2, YbDivView ybDivView, View view, TextView textView, TextView textView2) {
        this.a = merchantOffersBannerView;
        this.b = imageView;
        this.c = imageView2;
        this.d = ybDivView;
        this.e = view;
        this.f = textView;
        this.g = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
