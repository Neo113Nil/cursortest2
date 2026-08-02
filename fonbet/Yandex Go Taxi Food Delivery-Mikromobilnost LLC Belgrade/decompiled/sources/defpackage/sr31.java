package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public abstract class sr31 {
    public static final int[] a = {ngh0.div_gallery};

    public static final boolean a(Div2View div2View, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = motionEvent.getHistorySize() < 1 ? -1 : motionEvent.getHistoricalX(0) < motionEvent.getX() ? 4 : 8;
        int childCount = div2View.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = div2View.getChildAt(i2);
            if (childAt.getId() == ngh0.div_tabs_block && ww31.b(rawX, rawY, childAt)) {
                ViewPager viewPager = (ViewPager) ww31.a(ngh0.div_tabs_pager_container, childAt);
                if (!(i < 0 ? true : i != 4 ? i != 8 ? false : viewPager.canScrollHorizontally(1) : viewPager.canScrollHorizontally(-1))) {
                    RecyclerView recyclerView = (RecyclerView) viewPager.findViewById(a[0]);
                    if (recyclerView != null && b(recyclerView, rawX, rawY, i)) {
                    }
                }
                return true;
            }
            if ((childAt instanceof RecyclerView) && b((RecyclerView) childAt, rawX, rawY, i)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(RecyclerView recyclerView, float f, float f2, int i) {
        if (!ww31.b(f, f2, recyclerView)) {
            return false;
        }
        if (i < 0) {
            return true;
        }
        if (i == 4) {
            return recyclerView.computeHorizontalScrollOffset() > 0;
        }
        if (i != 8) {
            return false;
        }
        return recyclerView.computeHorizontalScrollOffset() + recyclerView.computeHorizontalScrollExtent() < recyclerView.computeHorizontalScrollRange();
    }
}
