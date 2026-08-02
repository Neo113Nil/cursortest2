package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.actions.OrderCardActionButtonsView;
import com.yandex.go.superapp.orders.card.actions.TrackingCardButtonView;

/* loaded from: classes14.dex */
public final class xl70 implements zo31 {
    public final OrderCardActionButtonsView a;
    public final View b;

    public xl70(OrderCardActionButtonsView orderCardActionButtonsView, TrackingCardButtonView trackingCardButtonView, TrackingCardButtonView trackingCardButtonView2, View view) {
        this.a = orderCardActionButtonsView;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
