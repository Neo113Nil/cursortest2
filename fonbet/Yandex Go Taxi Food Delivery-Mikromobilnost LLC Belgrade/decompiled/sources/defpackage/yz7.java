package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes14.dex */
public final class yz7 implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final DriverSectionView c;
    public final ImageView d;
    public final RecyclerView e;
    public final ShimmeringFrameLayout f;
    public final RobotoTextView g;
    public final RobotoTextView h;
    public final RobotoTextView i;

    public yz7(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, DriverSectionView driverSectionView, ImageView imageView, RecyclerView recyclerView, ShimmeringFrameLayout shimmeringFrameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = driverSectionView;
        this.d = imageView;
        this.e = recyclerView;
        this.f = shimmeringFrameLayout;
        this.g = robotoTextView;
        this.h = robotoTextView2;
        this.i = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
