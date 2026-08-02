package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;

/* loaded from: classes6.dex */
public final class te30 extends ViewPager2.a {
    public final /* synthetic */ MtCollapsedRoutesView a;
    public final /* synthetic */ ye30 b;

    public te30(MtCollapsedRoutesView mtCollapsedRoutesView, ye30 ye30Var) {
        this.a = mtCollapsedRoutesView;
        this.b = ye30Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        boolean z;
        super.onPageScrollStateChanged(i);
        boolean z2 = i == 2;
        MtCollapsedRoutesView mtCollapsedRoutesView = this.a;
        mtCollapsedRoutesView.isPagerScrolling = z2;
        z = mtCollapsedRoutesView.isPagerScrolling;
        if (z) {
            return;
        }
        mtCollapsedRoutesView.onTariffViewPagerScrollChanged(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        kk31 kk31Var;
        super.onPageScrolled(i, f, i2);
        kk31Var = this.a.verticalsView;
        kk31Var.updateHeaderState(i, f);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        boolean z;
        int i2;
        super.onPageSelected(i);
        MtCollapsedRoutesView mtCollapsedRoutesView = this.a;
        z = mtCollapsedRoutesView.isPagerScrolling;
        if (!z) {
            mtCollapsedRoutesView.targetSelectedPage = i;
            return;
        }
        i2 = mtCollapsedRoutesView.targetSelectedPage;
        if (i2 != i) {
            mtCollapsedRoutesView.targetSelectedPage = i;
            this.b.g.setCurrentItem(i, false);
        }
    }
}
