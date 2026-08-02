package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.a;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import com.yandex.plus.home.feature.webviews.internal.stories.list.ScrollDirection;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import defpackage.hnr0;
import defpackage.pzt0;
import defpackage.sk41;
import defpackage.skd0;
import defpackage.tje;
import defpackage.vk41;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class yk41 extends ViewPager2.a {
    public final qk41 a;
    public final rk41 b;
    public int c = -1;
    public float w;
    public ScrollDirection x;
    public boolean y;

    public yk41(qk41 qk41Var, rk41 rk41Var) {
        this.a = qk41Var;
        this.b = rk41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // androidx.viewpager2.widget.ViewPager2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrollStateChanged(int i) {
        WebStoriesView currentStoriesView;
        boolean z;
        int i2;
        nk41 adapter;
        b bVar;
        ViewPager2 viewPager;
        nk41 adapter2;
        ViewPager2 viewPager2;
        WebStoriesView currentStoriesView2;
        ViewPager2 viewPager3;
        qk41 qk41Var = this.a;
        boolean z2 = false;
        rk41 rk41Var = this.b;
        if (i == 1) {
            currentStoriesView2 = qk41Var.a.getCurrentStoriesView();
            if (currentStoriesView2 != null) {
                currentStoriesView2.setIsFullyVisible(false);
            }
            viewPager3 = rk41Var.a.getViewPager();
            this.c = viewPager3.getCurrentItem();
            this.y = true;
        } else {
            this.y = false;
        }
        if (i == 0) {
            currentStoriesView = qk41Var.a.getCurrentStoriesView();
            if (currentStoriesView != null) {
                currentStoriesView.setIsFullyVisible(true);
            }
            if (this.c == 0) {
                viewPager2 = rk41Var.a.getViewPager();
                if (viewPager2.getCurrentItem() == 0) {
                    z = true;
                    i2 = this.c;
                    WebStoriesContainer webStoriesContainer = rk41Var.a;
                    WebStoriesContainer webStoriesContainer2 = rk41Var.a;
                    adapter = webStoriesContainer.getAdapter();
                    if (i2 == adapter.b.size() - 1) {
                        viewPager = webStoriesContainer2.getViewPager();
                        int currentItem = viewPager.getCurrentItem();
                        adapter2 = webStoriesContainer2.getAdapter();
                        if (currentItem == adapter2.b.size() - 1) {
                            z2 = true;
                        }
                    }
                    if ((z && this.x == ScrollDirection.RIGHT_TO_LEFT) || (z2 && this.x == ScrollDirection.LEFT_TO_RIGHT)) {
                        skd0.e(PlusLogTag.UI, "onDismiss()");
                        bVar = qk41Var.a.webViewsRouter;
                        ((a) bVar).k();
                    }
                    this.x = null;
                    this.w = 0.0f;
                }
            }
            z = false;
            i2 = this.c;
            WebStoriesContainer webStoriesContainer3 = rk41Var.a;
            WebStoriesContainer webStoriesContainer22 = rk41Var.a;
            adapter = webStoriesContainer3.getAdapter();
            if (i2 == adapter.b.size() - 1) {
            }
            if (z) {
                skd0.e(PlusLogTag.UI, "onDismiss()");
                bVar = qk41Var.a.webViewsRouter;
                ((a) bVar).k();
                this.x = null;
                this.w = 0.0f;
            }
            skd0.e(PlusLogTag.UI, "onDismiss()");
            bVar = qk41Var.a.webViewsRouter;
            ((a) bVar).k();
            this.x = null;
            this.w = 0.0f;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        if (i == this.c && this.y) {
            float f2 = i + f;
            float f3 = 0.5f + f2;
            float f4 = this.w;
            if (f3 > f4) {
                this.x = ScrollDirection.LEFT_TO_RIGHT;
            } else if (f3 < f4) {
                this.x = ScrollDirection.RIGHT_TO_LEFT;
            }
            if (f2 == 0.0f && f4 == 0.0f) {
                this.x = ScrollDirection.RIGHT_TO_LEFT;
            }
            this.w = f2;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(final int i) {
        int i2 = this.c;
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == -1) {
            valueOf = null;
        }
        final WebStoriesContainer webStoriesContainer = this.a.a;
        if (valueOf != null) {
            webStoriesContainer.onStoriesViewReady(valueOf.intValue(), new r941(10));
        }
        webStoriesContainer.onStoriesViewReady(i, new tls() { // from class: com.yandex.plus.home.feature.webviews.internal.stories.list.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                vk41 vk41Var;
                WebStoriesView webStoriesView = (WebStoriesView) obj;
                vk41Var = WebStoriesContainer.this.presenter;
                hnr0 storyNavigationSharedFlow = webStoriesView != null ? webStoriesView.getStoryNavigationSharedFlow() : null;
                vk41Var.getClass();
                PlusLogTag plusLogTag = PlusLogTag.UI;
                StringBuilder sb = new StringBuilder("WebStories page selected = ");
                int i3 = i;
                sb.append(i3);
                skd0.b(plusLogTag, sb.toString());
                pzt0 pzt0Var = vk41Var.h;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                vk41Var.h = tje.N(vk41Var.e(), null, null, new WebStoriesContainerPresenter$subscribeForNavigationEvents$1(storyNavigationSharedFlow, vk41Var, null), 3);
                sk41 sk41Var = (sk41) vk41Var.b;
                int i4 = vk41Var.g;
                InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType = InMessage$StoryIsVisibleEvent$StoryNavigationType.UNDEFINED;
                sk41Var.setStorySelected(i4, false, inMessage$StoryIsVisibleEvent$StoryNavigationType, null);
                int i5 = vk41Var.g;
                if (i5 >= 0 && vk41Var.i != InMessage$StoryIsVisibleEvent$MiniStoryControlType.SWIPE) {
                    if (i3 > i5) {
                        inMessage$StoryIsVisibleEvent$StoryNavigationType = InMessage$StoryIsVisibleEvent$StoryNavigationType.NEXT;
                    } else if (i3 < i5) {
                        inMessage$StoryIsVisibleEvent$StoryNavigationType = InMessage$StoryIsVisibleEvent$StoryNavigationType.PREV;
                    }
                }
                vk41Var.g = i3;
                ((sk41) vk41Var.b).setStorySelected(i3, true, inMessage$StoryIsVisibleEvent$StoryNavigationType, vk41Var.i);
                vk41Var.i = InMessage$StoryIsVisibleEvent$MiniStoryControlType.SWIPE;
                return zy11.a;
            }
        });
        webStoriesContainer.requestLayout();
    }
}
