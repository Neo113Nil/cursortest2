package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r2 extends mv {
    public final int ESscZ9M1;
    public final int LfKQckgD;
    public final ArrayList Sjrx9cEN;
    public final int VGmz0ccI;
    public final int pP9Y2m6O;
    public boolean tef3qNMP;

    public r2(Context context) {
        super(context);
        this.Sjrx9cEN = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.ESscZ9M1 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.VGmz0ccI = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.LfKQckgD = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.pP9Y2m6O = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.Sjrx9cEN;
        arrayList.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i7 = 0;
        if (getItemIconGravity() == 0) {
            int labelVisibilityMode = getLabelVisibilityMode();
            int i8 = this.LfKQckgD;
            if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : currentVisibleContentItemCount > 3) {
                if (this.tef3qNMP) {
                    View childAt = getChildAt(getSelectedItemPosition());
                    int visibility = childAt.getVisibility();
                    int i9 = this.pP9Y2m6O;
                    if (visibility != 8) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), makeMeasureSpec);
                        i9 = Math.max(i9, childAt.getMeasuredWidth());
                    }
                    int i10 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                    int min = Math.min(size - (this.VGmz0ccI * i10), Math.min(i9, i8));
                    int i11 = size - min;
                    int min2 = Math.min(i11 / (i10 != 0 ? i10 : 1), this.ESscZ9M1);
                    int i12 = i11 - (i10 * min2);
                    int i13 = 0;
                    while (i13 < childCount) {
                        if (getChildAt(i13).getVisibility() != 8) {
                            i5 = i13 == getSelectedItemPosition() ? min : min2;
                            if (i12 > 0) {
                                i5++;
                                i12--;
                            }
                        } else {
                            i5 = 0;
                        }
                        arrayList.add(Integer.valueOf(i5));
                        i13++;
                    }
                    i3 = 0;
                    i4 = 0;
                    while (i7 < childCount) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i7)).intValue(), 1073741824), makeMeasureSpec);
                            childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                            int measuredWidth = childAt2.getMeasuredWidth() + i3;
                            i4 = Math.max(i4, childAt2.getMeasuredHeight());
                            i3 = measuredWidth;
                        }
                        i7++;
                    }
                }
            }
            int min3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i8);
            int i14 = size - (currentVisibleContentItemCount * min3);
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).getVisibility() == 8) {
                    i6 = 0;
                } else if (i14 > 0) {
                    i6 = min3 + 1;
                    i14--;
                } else {
                    i6 = min3;
                }
                arrayList.add(Integer.valueOf(i6));
            }
            i3 = 0;
            i4 = 0;
            while (i7 < childCount) {
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f;
            float f2 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f2);
            int round2 = Math.round(f / f2);
            int i16 = 0;
            int i17 = 0;
            while (i7 < childCount) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i16;
                    i17 = Math.max(i17, childAt3.getMeasuredHeight());
                    i16 = measuredWidth2;
                }
                i7++;
            }
            i3 = i16;
            i4 = i17;
        }
        setMeasuredDimension(i3, Math.max(i4, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.tef3qNMP = z;
    }
}
