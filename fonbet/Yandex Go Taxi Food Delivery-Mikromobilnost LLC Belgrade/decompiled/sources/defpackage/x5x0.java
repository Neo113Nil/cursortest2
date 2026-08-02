package defpackage;

import android.view.ViewGroup;
import com.yandex.alicekit.core.views.ScrollableViewPager;
import com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.tab.TabTitlesLayoutView;
import com.yandex.div.legacy.view.tab.TabsLayout;

/* loaded from: classes11.dex */
public final class x5x0 {
    public final ut31 a;
    public final TabTitlesLayoutView b;
    public final ScrollableViewPager c;
    public final ViewPagerFixedSizeLayout d;
    public final r810 e;
    public final bei h;
    public final String i;
    public final r3k0 j;
    public final DivView o;
    public final /* synthetic */ z5x0 p;
    public final w53 f = new w53();
    public final w53 g = new w53();
    public final d05 k = new d05(this);
    public boolean l = false;
    public r3k0 m = null;
    public boolean n = false;

    public x5x0(z5x0 z5x0Var, ut31 ut31Var, TabsLayout tabsLayout, kb kbVar, s2u0 s2u0Var, DivView divView, pzf pzfVar, bei beiVar, r3k0 r3k0Var) {
        this.p = z5x0Var;
        this.a = ut31Var;
        this.h = beiVar;
        this.j = r3k0Var;
        ddf ddfVar = new ddf(26, this);
        this.i = "TabsDivBlockViewBuilder.TAB_ITEM";
        TabTitlesLayoutView tabTitlesLayoutView = (TabTitlesLayoutView) g8a1.e(kbVar.a, tabsLayout);
        this.b = tabTitlesLayoutView;
        tabTitlesLayoutView.setHost(ddfVar);
        tabTitlesLayoutView.setTypefaceProvider((d820) pzfVar.b);
        tabTitlesLayoutView.setViewPool(ut31Var, "TabsDivBlockViewBuilder.TAB_HEADER");
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) g8a1.e(kbVar.b, tabsLayout);
        this.c = scrollableViewPager;
        scrollableViewPager.clearOnPageChangeListeners();
        scrollableViewPager.addOnPageChangeListener(new k05(0, this));
        ct31 customPageChangeListener = tabTitlesLayoutView.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(customPageChangeListener);
        }
        scrollableViewPager.setScrollEnabled(true);
        scrollableViewPager.setEdgeScrollEnabled(false);
        scrollableViewPager.setPageTransformer(false, new ryh(27, this));
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) g8a1.e(kbVar.c, tabsLayout);
        this.d = viewPagerFixedSizeLayout;
        r810 r810Var = new r810((ViewGroup) ut31Var.b("TabsDivBlockViewBuilder.TAB_ITEM"), new b05(this), new b05(this));
        this.e = r810Var;
        viewPagerFixedSizeLayout.setHeightCalculator(r810Var);
        this.o = divView;
    }
}
