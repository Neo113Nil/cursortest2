package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardObjectWithPlateNumberView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardPlateNumberView;

/* loaded from: classes14.dex */
public final class t301 implements zo31 {
    public final TrackingCardObjectWithPlateNumberView a;
    public final GoImageView b;
    public final TrackingCardPlateNumberView c;

    public t301(TrackingCardObjectWithPlateNumberView trackingCardObjectWithPlateNumberView, GoImageView goImageView, TrackingCardPlateNumberView trackingCardPlateNumberView) {
        this.a = trackingCardObjectWithPlateNumberView;
        this.b = goImageView;
        this.c = trackingCardPlateNumberView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
