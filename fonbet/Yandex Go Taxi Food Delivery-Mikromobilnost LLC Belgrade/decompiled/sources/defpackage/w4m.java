package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import ru.yandex.taxi.design.DotsIndicatorComponent;

/* loaded from: classes5.dex */
public final class w4m extends ViewPager2.a {
    public final /* synthetic */ DotsIndicatorComponent a;

    public w4m(DotsIndicatorComponent dotsIndicatorComponent) {
        this.a = dotsIndicatorComponent;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.scrollFinished();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        this.a.setPageScroll(i, f, true);
    }
}
