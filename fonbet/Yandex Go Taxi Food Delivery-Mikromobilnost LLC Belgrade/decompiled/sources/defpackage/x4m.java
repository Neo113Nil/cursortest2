package defpackage;

import androidx.viewpager.widget.ViewPager;
import ru.yandex.taxi.design.DotsIndicatorComponent;

/* loaded from: classes5.dex */
public final class x4m extends ViewPager.a {
    public final /* synthetic */ DotsIndicatorComponent a;

    public x4m(DotsIndicatorComponent dotsIndicatorComponent) {
        this.a = dotsIndicatorComponent;
    }

    @Override // androidx.viewpager.widget.ViewPager.a, defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.scrollFinished();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.a, defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        this.a.setPageScroll(i, f, true);
    }
}
