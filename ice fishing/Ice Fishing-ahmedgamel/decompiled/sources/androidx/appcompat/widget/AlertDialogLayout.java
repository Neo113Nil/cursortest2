package androidx.appcompat.widget;

import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.icefishingapp.icefishing.C5275R;
import java.util.WeakHashMap;
import m.AbstractC4715u0;
import m.C4713t0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC4715u0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = X.f2054a;
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
    @Override // m.AbstractC4715u0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int i14 = i9 - i;
        int paddingRight = i14 - getPaddingRight();
        int paddingRight2 = (i14 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i15 = gravity & 112;
        int i16 = gravity & 8388615;
        int paddingTop = i15 != 16 ? i15 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i6) - measuredHeight : (((i10 - i6) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C4713t0 c4713t0 = (C4713t0) childAt.getLayoutParams();
                int i18 = ((LinearLayout.LayoutParams) c4713t0).gravity;
                if (i18 < 0) {
                    i18 = i16;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i18, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c4713t0).leftMargin;
                    i12 = ((LinearLayout.LayoutParams) c4713t0).rightMargin;
                } else if (absoluteGravity != 5) {
                    i13 = ((LinearLayout.LayoutParams) c4713t0).leftMargin + paddingLeft;
                    if (i(i17)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i19 = paddingTop + ((LinearLayout.LayoutParams) c4713t0).topMargin;
                    childAt.layout(i13, i19, measuredWidth + i13, i19 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c4713t0).bottomMargin + i19;
                } else {
                    i11 = paddingRight - measuredWidth;
                    i12 = ((LinearLayout.LayoutParams) c4713t0).rightMargin;
                }
                i13 = i11 - i12;
                if (i(i17)) {
                }
                int i192 = paddingTop + ((LinearLayout.LayoutParams) c4713t0).topMargin;
                childAt.layout(i13, i192, measuredWidth + i13, i192 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c4713t0).bottomMargin + i192;
            }
        }
    }

    @Override // m.AbstractC4715u0, android.view.View
    public final void onMeasure(int i, int i6) {
        int i9;
        int i10;
        int i11;
        int i12;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = alertDialogLayout.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C5275R.id.topPanel) {
                    view = childAt;
                } else if (id == C5275R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != C5275R.id.contentPanel && id != C5275R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i6);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i9 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i9 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i10 = j(view2);
            i11 = view2.getMeasuredHeight() - i10;
            paddingBottom += i10;
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i12 = view3.getMeasuredHeight();
            paddingBottom += i12;
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        } else {
            i12 = 0;
        }
        int i14 = size - paddingBottom;
        if (view2 != null) {
            int i15 = paddingBottom - i10;
            int min = Math.min(i14, i11);
            if (min > 0) {
                i14 -= min;
                i10 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            paddingBottom = i15 + view2.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        }
        if (view3 != null && i14 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i12 + i14, mode));
            paddingBottom = (paddingBottom - i12) + view3.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        }
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = alertDialogLayout.getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                i16 = Math.max(i16, childAt2.getMeasuredWidth());
            }
        }
        int i18 = i6;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i16, i, i9), View.resolveSizeAndState(paddingBottom, i18, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i19 = 0;
            while (i19 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i19);
                if (childAt3.getVisibility() != 8) {
                    C4713t0 c4713t0 = (C4713t0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c4713t0).width == -1) {
                        int i20 = ((LinearLayout.LayoutParams) c4713t0).height;
                        ((LinearLayout.LayoutParams) c4713t0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i18, 0);
                        ((LinearLayout.LayoutParams) c4713t0).height = i20;
                    }
                }
                i19++;
                alertDialogLayout = this;
                i18 = i6;
            }
        }
    }
}
