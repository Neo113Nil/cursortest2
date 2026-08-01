package A0;

import N0.f;
import O.K;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.MenuC0229m;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: H, reason: collision with root package name */
    public final int f2H;

    /* renamed from: I, reason: collision with root package name */
    public final int f3I;
    public final int J;

    /* renamed from: K, reason: collision with root package name */
    public final int f4K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f6M;

    public b(Context context) {
        super(context);
        this.f6M = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f2H = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f3I = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.J = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f4K = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = K.f747a;
                if (getLayoutDirection() == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        MenuC0229m menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f6M;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z2 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i5 = this.J;
        if (z2 && this.f5L) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i6 = this.f4K;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f3I * i7), Math.min(i6, i5));
            int i8 = size - min;
            int min2 = Math.min(i8 / (i7 != 0 ? i7 : 1), this.f2H);
            int i9 = i8 - (i7 * min2);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    i4 = i10 == getSelectedItemPosition() ? min : min2;
                    if (i9 > 0) {
                        i4++;
                        i9--;
                    }
                } else {
                    i4 = 0;
                }
                arrayList.add(Integer.valueOf(i4));
                i10++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), i5);
            int i11 = size - (size2 * min3);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).getVisibility() == 8) {
                    i3 = 0;
                } else if (i11 > 0) {
                    i3 = min3 + 1;
                    i11--;
                } else {
                    i3 = min3;
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i14)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i13 = childAt2.getMeasuredWidth() + i13;
            }
        }
        setMeasuredDimension(i13, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.f5L = z2;
    }
}
