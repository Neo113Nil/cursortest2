package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes10.dex */
public final class sds extends ViewPager2.a {
    public final /* synthetic */ vds a;

    public sds(vds vdsVar) {
        this.a = vdsVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        this.a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        this.a.b(false);
    }
}
