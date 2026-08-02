package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.orders.card.header.leads.TrackingCardImageWithOverlayImageView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes14.dex */
public final class u301 implements zo31 {
    public final TrackingCardImageWithOverlayImageView a;
    public final RoundedCornersImageView b;
    public final GoFrameLayout c;
    public final RoundedCornersImageView d;

    public u301(TrackingCardImageWithOverlayImageView trackingCardImageWithOverlayImageView, RoundedCornersImageView roundedCornersImageView, GoFrameLayout goFrameLayout, RoundedCornersImageView roundedCornersImageView2) {
        this.a = trackingCardImageWithOverlayImageView;
        this.b = roundedCornersImageView;
        this.c = goFrameLayout;
        this.d = roundedCornersImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
