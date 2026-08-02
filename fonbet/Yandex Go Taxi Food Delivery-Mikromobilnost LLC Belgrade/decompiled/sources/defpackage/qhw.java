package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;

/* loaded from: classes14.dex */
public final class qhw extends ViewPager2.a {
    public final /* synthetic */ IntercityDashboardPromoBannerContainerView a;

    public qhw(IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView) {
        this.a = intercityDashboardPromoBannerContainerView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        g gVar;
        mhw mhwVar;
        super.onPageSelected(i);
        IntercityDashboardPromoBannerContainerView intercityDashboardPromoBannerContainerView = this.a;
        intercityDashboardPromoBannerContainerView.updateViewPagerPadding(i);
        intercityDashboardPromoBannerContainerView.removeAutoscrollIfNeed(i);
        gVar = intercityDashboardPromoBannerContainerView.dashboardPresenter;
        mhwVar = intercityDashboardPromoBannerContainerView.promoBannerAdapter;
        gVar.Ng(((khw) mhwVar.getCurrentList().get(i)).h);
    }
}
