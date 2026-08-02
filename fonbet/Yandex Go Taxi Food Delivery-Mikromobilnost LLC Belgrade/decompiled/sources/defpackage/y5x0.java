package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public final class y5x0 extends ViewPager.a {
    public final tdl a;
    public final o9y b;
    public final h2b1 c;

    public y5x0(tdl tdlVar, o9y o9yVar, DivView divView, h2b1 h2b1Var) {
        this.a = tdlVar;
        this.b = o9yVar;
        this.c = h2b1Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.a, defpackage.ct31
    public final void onPageSelected(int i) {
        this.b.b.put(this.a.e(), new jay(i));
        this.c.getClass();
    }
}
