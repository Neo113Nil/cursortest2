package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.beginners.presentation.services_info.views.CommonServicesContainer;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class rk5 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;
    public final DiscountBadgeView c;
    public final AppCompatImageView d;
    public final FrameLayout e;
    public final RobotoTextView f;
    public final CommonServicesContainer g;

    public rk5(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, DiscountBadgeView discountBadgeView, AppCompatImageView appCompatImageView, FrameLayout frameLayout, RobotoTextView robotoTextView, CommonServicesContainer commonServicesContainer) {
        this.a = constraintLayout;
        this.b = buttonComponent;
        this.c = discountBadgeView;
        this.d = appCompatImageView;
        this.e = frameLayout;
        this.f = robotoTextView;
        this.g = commonServicesContainer;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
