package defpackage;

import android.content.Context;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardCoherentRatingSelectorView;
import ru.yandex.taxi.order.view.FeedbackView;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;

/* loaded from: classes14.dex */
public final /* synthetic */ class qvq implements w7i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qvq(RideCardCoherentRatingSelectorView rideCardCoherentRatingSelectorView, Context context) {
        this.a = 2;
        this.c = rideCardCoherentRatingSelectorView;
        this.b = context;
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FeedbackView.ratingChangeListener$lambda$0((Context) obj2, (FeedbackView) obj, f, z);
                break;
            case 1:
                OrderCardView.setUiActionInteractor$lambda$0$8((OrderCardView) obj2, (t501) obj, f, z);
                break;
            case 2:
                RideCardCoherentRatingSelectorView.ratingBarDefaultListener$lambda$0((RideCardCoherentRatingSelectorView) obj, (Context) obj2, f, z);
                break;
            default:
                ScootersFeedbackCard.setListeners$lambda$0((ScootersFeedbackCard) obj2, (tls) obj, f, z);
                break;
        }
    }

    public /* synthetic */ qvq(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
