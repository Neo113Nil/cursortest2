package androidx.appcompat.widget;

import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import m.AbstractC4728u0;
import m.C4726t0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC4728u0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = X.f2142a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    @Override // m.AbstractC4728u0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10;
        int i11;
        int i12;
        int paddingLeft = getPaddingLeft();
        int i13 = i6 - i;
        int paddingRight = i13 - getPaddingRight();
        int paddingRight2 = (i13 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i14 = gravity & 112;
        int i15 = gravity & 8388615;
        int paddingTop = i14 != 16 ? i14 != 80 ? getPaddingTop() : ((getPaddingTop() + i9) - i4) - measuredHeight : (((i9 - i4) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C4726t0 c4726t0 = (C4726t0) childAt.getLayoutParams();
                int i17 = ((LinearLayout.LayoutParams) c4726t0).gravity;
                if (i17 < 0) {
                    i17 = i15;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i17, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i10 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c4726t0).leftMargin;
                    i11 = ((LinearLayout.LayoutParams) c4726t0).rightMargin;
                } else if (absoluteGravity != 5) {
                    i12 = ((LinearLayout.LayoutParams) c4726t0).leftMargin + paddingLeft;
                    if (i(i16)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i18 = paddingTop + ((LinearLayout.LayoutParams) c4726t0).topMargin;
                    childAt.layout(i12, i18, measuredWidth + i12, i18 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c4726t0).bottomMargin + i18;
                } else {
                    i10 = paddingRight - measuredWidth;
                    i11 = ((LinearLayout.LayoutParams) c4726t0).rightMargin;
                }
                i12 = i10 - i11;
                if (i(i16)) {
                }
                int i182 = paddingTop + ((LinearLayout.LayoutParams) c4726t0).topMargin;
                childAt.layout(i12, i182, measuredWidth + i12, i182 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c4726t0).bottomMargin + i182;
            }
        }
    }

    @Override // m.AbstractC4728u0, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        int i9;
        int i10;
        int i11;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = alertDialogLayout.getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C5248R.id.topPanel) {
                    view = childAt;
                } else if (id == C5248R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != C5248R.id.contentPanel && id != C5248R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i9 = j(view2);
            i10 = view2.getMeasuredHeight() - i9;
            paddingBottom += i9;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i11 = view3.getMeasuredHeight();
            paddingBottom += i11;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i11 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - i9;
            int min = Math.min(i13, i10);
            if (min > 0) {
                i13 -= min;
                i9 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i11 + i13, mode));
            paddingBottom = (paddingBottom - i11) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = alertDialogLayout.getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        int i17 = i4;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i15, i, i6), View.resolveSizeAndState(paddingBottom, i17, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i18 = 0;
            while (i18 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i18);
                if (childAt3.getVisibility() != 8) {
                    C4726t0 c4726t0 = (C4726t0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c4726t0).width == -1) {
                        int i19 = ((LinearLayout.LayoutParams) c4726t0).height;
                        ((LinearLayout.LayoutParams) c4726t0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i17, 0);
                        ((LinearLayout.LayoutParams) c4726t0).height = i19;
                    }
                }
                i18++;
                alertDialogLayout = this;
                i17 = i4;
            }
        }
    }
}
