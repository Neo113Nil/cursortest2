package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qbu extends ss31 {
    public final Rect c;
    public final Rect w;
    public int x;
    public int y;

    public qbu() {
        this.c = new Rect();
        this.w = new Rect();
        this.x = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout x;
        n751 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (x = x(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (x.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        int z = z(x) + size;
        int measuredHeight = x.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            z -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(z, i4 == -1 ? 1073741824 : Integer.MIN_VALUE), 0);
        return true;
    }

    @Override // defpackage.ss31
    public final void w(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout x = x(coordinatorLayout.getDependencies(view));
        int i2 = 0;
        if (x == null) {
            coordinatorLayout.onLayoutChild(view, i);
            this.x = 0;
            return;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int bottom = x.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom2 = ((x.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        n751 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.b() + rect.left;
            rect.right -= lastWindowInsets.c();
        }
        int i3 = layoutParams.gravity;
        if (i3 == 0) {
            i3 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.w;
        Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
        if (this.y != 0) {
            float y = y(x);
            int i4 = this.y;
            i2 = sb2.k((int) (y * i4), 0, i4);
        }
        view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
        this.x = rect2.top - x.getBottom();
    }

    public abstract AppBarLayout x(List list);

    public float y(View view) {
        return 1.0f;
    }

    public int z(View view) {
        return view.getMeasuredHeight();
    }

    public qbu(int i) {
        super(0);
        this.c = new Rect();
        this.w = new Rect();
        this.x = 0;
    }
}
