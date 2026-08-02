package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionBadgesView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class zzx implements zo31 {
    public final RideCardDriverSectionBadgesView a;
    public final GoFrameLayout b;
    public final RobotoTextView c;
    public final GoFrameLayout d;
    public final RobotoTextView e;

    public zzx(RideCardDriverSectionBadgesView rideCardDriverSectionBadgesView, GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, GoFrameLayout goFrameLayout2, RobotoTextView robotoTextView2) {
        this.a = rideCardDriverSectionBadgesView;
        this.b = goFrameLayout;
        this.c = robotoTextView;
        this.d = goFrameLayout2;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
