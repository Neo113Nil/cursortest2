package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.c;

/* loaded from: classes3.dex */
public final class rg31 extends ViewPager2.a {
    public final /* synthetic */ VerticalStoriesFragment a;

    public rg31(VerticalStoriesFragment verticalStoriesFragment) {
        this.a = verticalStoriesFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.resumeCurrentStory();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        dvb storiesPagerAdapter;
        VerticalStoriesFragment verticalStoriesFragment = this.a;
        c access$getViewModel = VerticalStoriesFragment.access$getViewModel(verticalStoriesFragment);
        storiesPagerAdapter = verticalStoriesFragment.getStoriesPagerAdapter();
        int size = i % storiesPagerAdapter.c.size();
        access$getViewModel.getClass();
        access$getViewModel.a0(new j0v(access$getViewModel, size, i, 6));
    }
}
