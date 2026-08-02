package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardTextWithIconView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class s980 implements zo31 {
    public final TrackingCardTextWithIconView a;
    public final GoImageView b;
    public final RobotoTextView c;

    public s980(TrackingCardTextWithIconView trackingCardTextWithIconView, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = trackingCardTextWithIconView;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
