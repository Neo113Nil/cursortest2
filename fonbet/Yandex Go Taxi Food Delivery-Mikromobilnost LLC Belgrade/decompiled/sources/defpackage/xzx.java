package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class xzx implements zo31 {
    public final RideCardCompanionSectionView a;
    public final RobotoTextView b;
    public final RobotoTextView c;

    public xzx(RideCardCompanionSectionView rideCardCompanionSectionView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, GoFrameLayout goFrameLayout) {
        this.a = rideCardCompanionSectionView;
        this.b = robotoTextView;
        this.c = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
