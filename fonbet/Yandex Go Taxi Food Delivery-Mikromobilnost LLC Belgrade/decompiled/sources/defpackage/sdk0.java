package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.f;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.v;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;

/* loaded from: classes14.dex */
public final /* synthetic */ class sdk0 implements w7i0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sdk0(int i) {
        this.a = i;
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        switch (this.a) {
            case 0:
                int i = f.V;
                break;
            case 1:
                int i2 = v.V;
                break;
            default:
                ScootersFeedbackCard.onRatingChangeListenerInternal$lambda$0(f, z);
                break;
        }
    }
}
