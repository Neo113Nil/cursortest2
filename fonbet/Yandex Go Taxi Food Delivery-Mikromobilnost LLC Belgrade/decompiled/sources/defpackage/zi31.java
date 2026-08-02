package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;

/* loaded from: classes14.dex */
public final class zi31 extends ViewPager2.a {
    public final /* synthetic */ VerticalTariffSelectorView a;

    public zi31(VerticalTariffSelectorView verticalTariffSelectorView) {
        this.a = verticalTariffSelectorView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        super.onPageScrollStateChanged(i);
        this.a.onTariffViewPagerScrollChanged(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        kk31 kk31Var;
        super.onPageScrolled(i, f, i2);
        kk31Var = this.a.verticalsView;
        kk31Var.updateHeaderState(i, f);
    }
}
