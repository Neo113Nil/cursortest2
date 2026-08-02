package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardCoherentRatingSelectorView;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class wzx implements zo31 {
    public final RideCardCoherentRatingSelectorView a;
    public final GoLinearLayout b;
    public final RatingBarComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public wzx(RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView, GoLinearLayout goLinearLayout, RatingBarComponent ratingBarComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = rideCardCoherentRatingSelectorView;
        this.b = goLinearLayout;
        this.c = ratingBarComponent;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
