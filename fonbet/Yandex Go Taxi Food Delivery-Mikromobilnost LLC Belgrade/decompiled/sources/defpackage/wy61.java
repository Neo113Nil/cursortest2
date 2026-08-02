package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* loaded from: classes7.dex */
public final class wy61 extends ViewPager2.a {
    public final /* synthetic */ ViewPager2 a;
    public final /* synthetic */ MultiBannerControlsContainer b;

    public wy61(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
        this.a = viewPager2;
        this.b = multiBannerControlsContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        RecyclerView.Adapter adapter = this.a.getAdapter();
        this.b.a(i, adapter != null ? adapter.getItemCount() : 0);
    }
}
