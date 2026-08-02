package defpackage;

import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class s25 implements ct31 {
    public final WeakReference a;
    public int b;
    public int c;

    public s25(BaseIndicatorTabLayout baseIndicatorTabLayout) {
        this.a = new WeakReference(baseIndicatorTabLayout);
    }

    public final void a() {
        this.c = 0;
        this.b = 0;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        this.b = this.c;
        this.c = i;
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        BaseIndicatorTabLayout baseIndicatorTabLayout = (BaseIndicatorTabLayout) this.a.get();
        if (baseIndicatorTabLayout != null) {
            if (this.c != 2 || this.b == 1) {
                baseIndicatorTabLayout.setScrollPosition(i, f, true, true);
            }
        }
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        BaseIndicatorTabLayout baseIndicatorTabLayout = (BaseIndicatorTabLayout) this.a.get();
        if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i) {
            return;
        }
        int i2 = this.c;
        baseIndicatorTabLayout.selectTab(baseIndicatorTabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
