package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.alicekit.core.views.ScrollableViewPager;
import com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.tab.TabTitlesLayoutView;
import com.yandex.div.legacy.view.tab.TabsLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class z5x0 extends ggk {
    public final Context a;
    public final ut31 b;
    public final pzf c;
    public final bei d;
    public final cee e;
    public final h2b1 f;
    public tdl g;

    public z5x0(Context context, ut31 ut31Var, pzf pzfVar, cee ceeVar) {
        bei beiVar = bei.C;
        h2b1 h2b1Var = h2b1.C;
        this.a = context;
        this.b = ut31Var;
        this.c = pzfVar;
        this.d = beiVar;
        this.e = ceeVar;
        this.f = h2b1Var;
        ut31Var.d("TabsDivBlockViewBuilder.TAB_LAYOUT", new v5x0(this, 0), 2);
        ut31Var.d("TabsDivBlockViewBuilder.TAB_HEADER", new c5x0(context), 24);
        ut31Var.d("TabsDivBlockViewBuilder.TAB_ITEM", new v5x0(this, 1), 4);
    }

    public static boolean c(zjk zjkVar) {
        Iterator it = zjkVar.A.iterator();
        while (it.hasNext()) {
            yjk yjkVar = (yjk) it.next();
            String str = yjkVar.b;
            n15 n15Var = yjkVar.a;
            if (("div-gallery-block".equals(str) ? (rrk) n15Var : null) != null) {
                return true;
            }
            zjk zjkVar2 = "div-container-block".equals(yjkVar.b) ? (zjk) n15Var : null;
            if (zjkVar2 != null && c(zjkVar2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ggk
    public final View a(DivView divView, n15 n15Var) {
        tdl tdlVar = (tdl) n15Var;
        this.g = tdlVar;
        TabsLayout tabsLayout = (TabsLayout) this.b.b("TabsDivBlockViewBuilder.TAB_LAYOUT");
        tabsLayout.getTitleLayout().setOnScrollChangedListener(new n2v0(this, divView));
        x5x0 x5x0Var = new x5x0(this, this.b, tabsLayout, new kb(ogh0.base_tabbed_title_container_scroller, ogh0.div_tabs_pager_container, ogh0.div_tabs_container_helper), new s2u0(7), divView, this.c, this.d, new r3k0(17, this, divView));
        HashSet hashSet = new HashSet();
        Object[] objArr = 0;
        for (int i = 0; i < tdlVar.F.size(); i++) {
            if (c(((sdl) tdlVar.F.get(i)).a)) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        ScrollableViewPager scrollableViewPager = x5x0Var.c;
        scrollableViewPager.setDisabledScrollPages(hashSet);
        r3k0 r3k0Var = new r3k0(18, tdlVar, tabsLayout);
        int min = Math.min(scrollableViewPager.getCurrentItem(), r3k0Var.c().size() - 1);
        x5x0Var.g.clear();
        x5x0Var.m = r3k0Var;
        e890 adapter = scrollableViewPager.getAdapter();
        d05 d05Var = x5x0Var.k;
        if (adapter != null) {
            x5x0Var.n = true;
            try {
                d05Var.f();
            } finally {
                x5x0Var.n = false;
            }
        }
        ArrayList c = r3k0Var.c();
        TabTitlesLayoutView tabTitlesLayoutView = x5x0Var.b;
        tabTitlesLayoutView.setData(c, min);
        if (scrollableViewPager.getAdapter() == null) {
            scrollableViewPager.setAdapter(d05Var);
        } else if (!c.isEmpty() && min != -1) {
            scrollableViewPager.setCurrentItem(min);
            tabTitlesLayoutView.manuallyScroll(min);
        }
        ydz.a();
        r810 r810Var = x5x0Var.e;
        if (r810Var != null) {
            ydz.a();
            r810Var.c.clear();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = x5x0Var.d;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
        DivView divView2 = x5x0Var.o;
        o9y currentState = divView2.getCurrentState();
        z83.d(currentState, null);
        z5x0 z5x0Var = x5x0Var.p;
        tdl tdlVar2 = z5x0Var.g;
        z83.d(tdlVar2, null);
        if (currentState != null && tdlVar2 != null) {
            jay jayVar = (jay) ((n9y) currentState.b.get(tdlVar2.e()));
            if (jayVar != null) {
                scrollableViewPager.setCurrentItem(jayVar.a);
            }
            scrollableViewPager.addOnPageChangeListener(new y5x0(tdlVar2, currentState, divView2, z5x0Var.f));
        }
        tabTitlesLayoutView.setTabColors(tdlVar.z, tdlVar.y, tdlVar.D);
        View e = g8a1.e(ogh0.div_tabs_divider, tabsLayout);
        e.setVisibility(tdlVar.C ? 0 : 8);
        e.setBackgroundColor(tdlVar.B);
        return tabsLayout;
    }
}
