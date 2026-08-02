package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class tdg extends mz4 {
    public static final /* synthetic */ kgx[] r = {new PropertyReference1Impl("titleView", 0, "getTitleView()Landroid/widget/TextView;", tdg.class), b64.x(qoi0.a, tdg.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("descriptionView", 0, "getDescriptionView()Landroid/widget/TextView;", tdg.class), new PropertyReference1Impl("buttonView", 0, "getButtonView()Landroid/widget/TextView;", tdg.class), new PropertyReference1Impl("giftProgressView", 0, "getGiftProgressView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/progress/GiftProgressView;", tdg.class), new PropertyReference1Impl("badgeView", 0, "getBadgeView()Landroid/widget/TextView;", tdg.class), new PropertyReference1Impl("giftImageView", 0, "getGiftImageView()Lcom/google/android/material/imageview/ShapeableImageView;", tdg.class), new PropertyReference1Impl("confettiFirstLayerView", 0, "getConfettiFirstLayerView()Lcom/google/android/material/imageview/ShapeableImageView;", tdg.class), new PropertyReference1Impl("confettiSecondLayerView", 0, "getConfettiSecondLayerView()Lcom/google/android/material/imageview/ShapeableImageView;", tdg.class), new PropertyReference1Impl("separator", 0, "getSeparator()Landroid/view/View;", tdg.class)};
    public final boolean f;
    public final ard0 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final wv5 k;
    public final wv5 l;
    public final wv5 m;
    public final wv5 n;
    public final wv5 o;
    public final wv5 p;
    public final wv5 q;

    public tdg(ViewGroup viewGroup, b5d0 b5d0Var, boolean z, ard0 ard0Var, jse jseVar) {
        super(viewGroup, b5d0Var, z, jseVar);
        this.f = z;
        this.g = ard0Var;
        this.h = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_top_view_title, 29));
        this.i = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_view_subtitle, 0));
        this.j = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_view_description, 1));
        this.k = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_view_button, 2));
        this.l = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_view_gift_progress, 3));
        this.m = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_badge_view, 4));
        this.n = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_gift, 5));
        this.o = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_confetti_first_layer, 6));
        this.p = new wv5(new sdg(viewGroup, u9h0.plus_sdk_daily_top_confetti_second_layer, 7));
        this.q = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_top_view_separator, 28));
    }

    public final TextView h() {
        return (TextView) this.m.a(r[5]);
    }
}
