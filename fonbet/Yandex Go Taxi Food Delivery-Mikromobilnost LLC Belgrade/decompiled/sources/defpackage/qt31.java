package defpackage;

import com.yandex.messaging.views.ViewPagerIndicator;

/* loaded from: classes15.dex */
public final class qt31 implements ct31 {
    public final /* synthetic */ ViewPagerIndicator a;

    public qt31(ViewPagerIndicator viewPagerIndicator) {
        this.a = viewPagerIndicator;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        float f2;
        ViewPagerIndicator viewPagerIndicator = this.a;
        viewPagerIndicator.currentPosition = i;
        viewPagerIndicator.currentPositionOffset = f;
        i3 = viewPagerIndicator.currentPosition;
        f2 = viewPagerIndicator.currentPositionOffset;
        viewPagerIndicator.updateIndicatorPosition(i3, f2);
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
    }
}
