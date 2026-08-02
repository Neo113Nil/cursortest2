package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class qra0 implements jt31 {
    public final ViewPager2 a;
    public int b;

    public qra0(ViewPager2 viewPager2, int i) {
        this.a = viewPager2;
        this.b = i;
    }

    public final void a(int i) {
        this.b = i;
        ViewPager2 viewPager2 = this.a;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            int currentItem = viewPager2.getCurrentItem();
            if (recyclerView.getChildAdapterPosition(childAt2) != -1) {
                c(r5 - currentItem, childAt2);
            }
        }
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        WeakHashMap weakHashMap = b.a;
        view.setTranslationX((-f) * this.b * (this.a.getLayoutDirection() == 1 ? -1 : 1));
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationZ((1.0f - y6i0.c(Math.abs(f), 0.0f, 1.0f)) * 10.0f);
    }
}
