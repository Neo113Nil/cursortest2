package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.widgets.common.PageIndicatorView;

/* loaded from: classes4.dex */
public final class y690 extends ViewPager2.a {
    public final /* synthetic */ PageIndicatorView a;

    public y690(PageIndicatorView pageIndicatorView) {
        this.a = pageIndicatorView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        int i2;
        PageIndicatorView pageIndicatorView = this.a;
        i2 = pageIndicatorView.currentItemPosition;
        if (i2 != i) {
            pageIndicatorView.currentItemPosition = i;
            pageIndicatorView.invalidate();
        }
    }
}
