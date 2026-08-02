package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.rating_selector.RideCardRatingSelectorView;
import ru.yandex.taxi.order.view.RatingView;

/* loaded from: classes14.dex */
public final /* synthetic */ class x8i0 implements w7i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8i0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                RatingView.ratingChangeListener$lambda$0((RatingView) obj, f, z);
                break;
            default:
                RideCardRatingSelectorView.ratingBarDefaultListener$lambda$0((Context) obj, f, z);
                break;
        }
    }
}
