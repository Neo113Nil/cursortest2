package defpackage;

import androidx.viewpager.widget.ViewPager;
import defpackage.shs;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.a;

/* loaded from: classes5.dex */
public final class yhs extends ViewPager.a {
    public final /* synthetic */ FullScreenBannerModalView a;

    public yhs(FullScreenBannerModalView fullScreenBannerModalView) {
        this.a = fullScreenBannerModalView;
    }

    @Override // androidx.viewpager.widget.ViewPager.a, defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        boolean z;
        whs whsVar;
        boolean z2 = i != 0;
        FullScreenBannerModalView fullScreenBannerModalView = this.a;
        fullScreenBannerModalView.isPagerScrolling = z2;
        z = fullScreenBannerModalView.isPagerScrolling;
        if (z) {
            fullScreenBannerModalView.pausePlayback();
            return;
        }
        fullScreenBannerModalView.resumePlayback();
        whsVar = fullScreenBannerModalView.pagerAdapter;
        if (whsVar != null) {
            whsVar.m(new ssd(4));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.a, defpackage.ct31
    public final void onPageSelected(int i) {
        boolean z;
        whs whsVar;
        shs shsVar;
        FullScreenBannerModalView fullScreenBannerModalView = this.a;
        z = fullScreenBannerModalView.isSettingAdapter;
        if (z) {
            return;
        }
        a aVar = fullScreenBannerModalView.presenter;
        klf0 klf0Var = aVar.h;
        int i2 = aVar.z;
        if (i > i2) {
            ((n9y0) klf0Var).d(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
        } else if (i < i2) {
            ((n9y0) klf0Var).e(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
        }
        zpf0 zpf0Var = aVar.i;
        shs shsVar2 = aVar.f;
        int i3 = i + 1;
        shs.a aVar2 = (shs.a) kotlin.collections.a.S(i, shsVar2.l);
        zpf0Var.e(shsVar2, i3, aVar2 != null ? aVar2.h : null, ((cay0) aVar.u).b());
        aVar.z = i;
        aVar.A = aVar.j.a();
        aVar.C = ((shs.a) aVar.f.l.get(aVar.z)).f;
        whsVar = fullScreenBannerModalView.pagerAdapter;
        if (whsVar != null) {
            whsVar.m(new th5(7, whsVar));
        }
        shsVar = fullScreenBannerModalView.banner;
        if (shsVar != null) {
            fullScreenBannerModalView.updateViews(shsVar);
        }
    }
}
