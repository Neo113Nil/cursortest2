package ru.yandex.taxi.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.cma1;
import defpackage.rf6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/coordinator/BottomSheetFloatButtonBehavior;", "Landroid/view/View;", "T", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "<init>", "()V", "", "shadowCompensation", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rf6", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BottomSheetFloatButtonBehavior<T extends View> extends CoordinatorLayout.a {
    public final int a;
    public boolean b;

    public BottomSheetFloatButtonBehavior() {
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        CoordinatorLayout.a a = rf6.a(view2);
        return (a instanceof BottomSheetBehavior) || (a instanceof AnchorBottomSheetBehavior);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void d(CoordinatorLayout.LayoutParams layoutParams) {
        if (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin == 0 && ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin == 0 && ((ViewGroup.MarginLayoutParams) layoutParams).topMargin == 0 && ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == 0) {
            int i = layoutParams.anchorGravity;
            int i2 = i & 112;
            int i3 = layoutParams.gravity & 112;
            int i4 = this.a;
            if (i3 == i2) {
                if (80 == i2) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -i4;
                } else if (48 == i2) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -i4;
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
                }
            }
            int i5 = 8388615 & i;
            if (8388611 == i5) {
                layoutParams.setMarginEnd(-i4);
                layoutParams.setMarginStart(i4);
                return;
            }
            if (8388613 == i5) {
                layoutParams.setMarginEnd(i4);
                layoutParams.setMarginStart(-i4);
                return;
            }
            int i6 = i & 7;
            if (3 == i6) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -i4;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i4;
            } else if (5 == i6) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i4;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = -i4;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        CoordinatorLayout.a a = rf6.a(view2);
        if (!(a instanceof BottomSheetBehavior) && !(a instanceof AnchorBottomSheetBehavior)) {
            return false;
        }
        u(view2, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        for (View view2 : coordinatorLayout.getDependencies(view)) {
            CoordinatorLayout.a a = rf6.a(view2);
            if ((a instanceof BottomSheetBehavior) || (a instanceof AnchorBottomSheetBehavior)) {
                u(view2, view);
                break;
            }
        }
        coordinatorLayout.onLayoutChild(view, i);
        return true;
    }

    public final void u(View view, View view2) {
        if (view.getTop() > 0 && !this.b) {
            cma1.K(view2);
            this.b = true;
        } else {
            if (view.getTop() > 0 || !this.b) {
                return;
            }
            cma1.N(view2);
            this.b = false;
        }
    }

    public BottomSheetFloatButtonBehavior(int i) {
        this.a = i;
    }

    public BottomSheetFloatButtonBehavior(Context context, AttributeSet attributeSet) {
        this.a = 0;
    }
}
