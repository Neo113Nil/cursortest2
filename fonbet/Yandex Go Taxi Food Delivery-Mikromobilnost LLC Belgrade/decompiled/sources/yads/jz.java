package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.b571;
import defpackage.ew81;
import defpackage.vt71;

/* loaded from: classes7.dex */
public final class jz extends lz {
    public final vt71 c;

    public jz(vt71 vt71Var, b571 b571Var, ew81 ew81Var) {
        super(b571Var, ew81Var);
        this.c = vt71Var;
    }

    @Override // yads.lz, android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.c.a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
        super.onClick(view);
    }
}
