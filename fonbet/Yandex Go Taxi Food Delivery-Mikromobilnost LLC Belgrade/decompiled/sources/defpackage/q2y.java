package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.plate_number.PlateNumberDividerView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;

/* loaded from: classes14.dex */
public final class q2y implements zo31 {
    public final RideCardTimelineBannerView a;
    public final PlateNumberDividerView b;
    public final GoImageView c;
    public final GoLinearLayout d;

    public q2y(RideCardTimelineBannerView rideCardTimelineBannerView, GoLinearLayout goLinearLayout, PlateNumberDividerView plateNumberDividerView, GoImageView goImageView, GoLinearLayout goLinearLayout2) {
        this.a = rideCardTimelineBannerView;
        this.b = plateNumberDividerView;
        this.c = goImageView;
        this.d = goLinearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
