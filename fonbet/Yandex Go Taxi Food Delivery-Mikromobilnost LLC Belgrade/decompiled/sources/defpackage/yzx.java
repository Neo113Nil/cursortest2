package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionCarPlateView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.RideCardDriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionTitleView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringImageView;

/* loaded from: classes14.dex */
public final class yzx implements zo31 {
    public final RideCardDriverSectionView a;
    public final GoView b;
    public final ShimmeringImageView c;
    public final AppCompatImageView d;
    public final GoImageView e;
    public final RideCardDriverSectionCarPlateView f;
    public final GoView g;
    public final RobotoTextView h;
    public final RideCardDriverSectionTitleView i;

    public yzx(RideCardDriverSectionView rideCardDriverSectionView, GoView goView, ShimmeringImageView shimmeringImageView, AppCompatImageView appCompatImageView, GoImageView goImageView, RideCardDriverSectionCarPlateView rideCardDriverSectionCarPlateView, GoView goView2, RobotoTextView robotoTextView, RideCardDriverSectionTitleView rideCardDriverSectionTitleView) {
        this.a = rideCardDriverSectionView;
        this.b = goView;
        this.c = shimmeringImageView;
        this.d = appCompatImageView;
        this.e = goImageView;
        this.f = rideCardDriverSectionCarPlateView;
        this.g = goView2;
        this.h = robotoTextView;
        this.i = rideCardDriverSectionTitleView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
