package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class kvc extends y0a implements sq1 {
    public static final /* synthetic */ s9f[] k;
    public final Rect c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public int g;
    public int h;
    public int i;
    public final q13 j;

    static {
        opi opiVar = new opi(kvc.class, "aspectRatio", "getAspectRatio()F", 0);
        ern.a.getClass();
        k = new s9f[]{opiVar};
    }

    public kvc(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.j = new q13(Float.valueOf(0.0f), rq1.s);
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.c.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.c.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.c.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.c.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    @Override // defpackage.y0a, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new u79(-1, -1);
    }

    public float getAspectRatio() {
        s9f s9fVar = k[0];
        q13 q13Var = this.j;
        q13Var.getClass();
        return ((Number) q13Var.a).floatValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var = (u79) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(u79Var.a, getLayoutDirection());
                int i6 = u79Var.a & 112;
                int i7 = absoluteGravity & 7;
                int b = i7 != 1 ? i7 != 5 ? ((ViewGroup.MarginLayoutParams) u79Var).leftMargin + paddingLeftWithForeground : (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) u79Var).rightMargin : ouj.b(((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) u79Var).leftMargin, ((ViewGroup.MarginLayoutParams) u79Var).rightMargin, 2, paddingLeftWithForeground);
                int b2 = i6 != 16 ? i6 != 80 ? ((ViewGroup.MarginLayoutParams) u79Var).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin : ouj.b(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) u79Var).topMargin, ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin, 2, paddingTopWithForeground);
                childAt.layout(b, b2, measuredWidth + b, measuredHeight + b2);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        int horizontalPadding;
        int minimumWidth;
        int verticalPadding;
        int minimumHeight;
        int i3;
        u79 u79Var;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        int makeMeasureSpec = getUseAspect() ? !tyf.A(i) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(eeh.b(View.MeasureSpec.getSize(i) / getAspectRatio()), 1073741824) : i2;
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            linkedHashSet = this.d;
            linkedHashSet2 = this.e;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                u79 u79Var2 = (u79) layoutParams;
                boolean A = tyf.A(i);
                boolean A2 = tyf.A(makeMeasureSpec);
                int i5 = ((ViewGroup.MarginLayoutParams) u79Var2).width;
                boolean z = i5 == -1;
                int i6 = ((ViewGroup.MarginLayoutParams) u79Var2).height;
                boolean z2 = i6 == -1;
                if ((A && A2) || (!A2 ? !(!A ? z && i6 <= 0 : z2) : !z)) {
                    measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
                    this.i = View.combineMeasuredStates(this.i, childAt.getMeasuredState());
                    if ((!A && ((ViewGroup.MarginLayoutParams) u79Var2).width == -1) || (!A2 && ((ViewGroup.MarginLayoutParams) u79Var2).height == -1)) {
                        linkedHashSet.add(childAt);
                    }
                    if (!A && !z) {
                        this.g = Math.max(this.g, u79Var2.b() + childAt.getMeasuredWidth());
                    }
                    if (!A2 && !z2 && !getUseAspect()) {
                        this.h = Math.max(this.h, u79Var2.d() + childAt.getMeasuredHeight());
                    }
                } else if ((!A && i5 == -1) || (!A2 && i6 == -1)) {
                    linkedHashSet2.add(childAt);
                }
            }
            i4++;
        }
        LinkedHashSet<View> linkedHashSet3 = this.f;
        z75.t(linkedHashSet3, linkedHashSet);
        z75.t(linkedHashSet3, linkedHashSet2);
        if (!linkedHashSet3.isEmpty()) {
            boolean A3 = tyf.A(i);
            boolean A4 = tyf.A(makeMeasureSpec);
            if (!A3 || !A4) {
                boolean z3 = !A3 && this.g == 0;
                boolean z4 = (A4 || getUseAspect() || this.h != 0) ? false : true;
                if (z3 || z4) {
                    for (View view : linkedHashSet3) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        layoutParams2.getClass();
                        u79 u79Var3 = (u79) layoutParams2;
                        if (linkedHashSet2.contains(view) && ((((ViewGroup.MarginLayoutParams) u79Var3).width == -1 && z3) || (((ViewGroup.MarginLayoutParams) u79Var3).height == -1 && z4))) {
                            u79Var = u79Var3;
                            measureChildWithMargins(view, i, 0, makeMeasureSpec, 0);
                            this.i = View.combineMeasuredStates(this.i, view.getMeasuredState());
                            linkedHashSet2.remove(view);
                        } else {
                            u79Var = u79Var3;
                        }
                        if (z3) {
                            this.g = Math.max(this.g, u79Var.b() + view.getMeasuredWidth());
                        }
                        if (z4) {
                            this.h = Math.max(this.h, u79Var.d() + view.getMeasuredHeight());
                        }
                    }
                } else {
                    for (View view2 : linkedHashSet3) {
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        layoutParams3.getClass();
                        u79 u79Var4 = (u79) layoutParams3;
                        if (!A3 && ((ViewGroup.MarginLayoutParams) u79Var4).width == -1) {
                            this.g = Math.max(this.g, u79Var4.b() + view2.getMinimumWidth());
                        }
                        if (!A4 && ((ViewGroup.MarginLayoutParams) u79Var4).height == -1) {
                            this.h = Math.max(this.h, u79Var4.d() + view2.getMinimumHeight());
                        }
                    }
                }
            }
        }
        if (tyf.A(i)) {
            horizontalPadding = 0;
        } else {
            horizontalPadding = this.g + getHorizontalPadding();
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            if (horizontalPadding < suggestedMinimumWidth) {
                horizontalPadding = suggestedMinimumWidth;
            }
            Drawable foreground = getForeground();
            if (foreground != null && horizontalPadding < (minimumWidth = foreground.getMinimumWidth())) {
                horizontalPadding = minimumWidth;
            }
        }
        int resolveSizeAndState = View.resolveSizeAndState(horizontalPadding, i, this.i);
        int i7 = 16777215 & resolveSizeAndState;
        if (tyf.A(makeMeasureSpec)) {
            i3 = 0;
        } else {
            if (!getUseAspect() || tyf.A(i)) {
                verticalPadding = this.h + getVerticalPadding();
                int suggestedMinimumHeight = getSuggestedMinimumHeight();
                if (verticalPadding < suggestedMinimumHeight) {
                    verticalPadding = suggestedMinimumHeight;
                }
                Drawable foreground2 = getForeground();
                if (foreground2 != null && verticalPadding < (minimumHeight = foreground2.getMinimumHeight())) {
                    i3 = minimumHeight;
                }
            } else {
                verticalPadding = eeh.b(i7 / getAspectRatio());
            }
            i3 = verticalPadding;
        }
        if (View.MeasureSpec.getMode(makeMeasureSpec) == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            if (getUseAspect() && !tyf.A(i)) {
                int childCount2 = getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt2 = getChildAt(i8);
                    if (childAt2.getVisibility() != 8) {
                        ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                        layoutParams4.getClass();
                        if (((ViewGroup.MarginLayoutParams) ((u79) layoutParams4)).height == -3) {
                            measureChildWithMargins(childAt2, i, 0, makeMeasureSpec, 0);
                            linkedHashSet3.remove(childAt2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(i3, makeMeasureSpec, this.i << 16));
        for (View view3 : linkedHashSet3) {
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            layoutParams5.getClass();
            u79 u79Var5 = (u79) layoutParams5;
            view3.measure(xp3.O(((ViewGroup.MarginLayoutParams) u79Var5).width == -1 ? View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824) : i, u79Var5.b() + getHorizontalPadding(), ((ViewGroup.MarginLayoutParams) u79Var5).width, view3.getMinimumWidth(), u79Var5.h), xp3.O(((ViewGroup.MarginLayoutParams) u79Var5).height == -1 ? View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824) : makeMeasureSpec, u79Var5.d() + getVerticalPadding(), ((ViewGroup.MarginLayoutParams) u79Var5).height, view3.getMinimumHeight(), u79Var5.g));
            if (linkedHashSet2.contains(view3)) {
                this.i = View.combineMeasuredStates(this.i, view3.getMeasuredState());
            }
        }
        linkedHashSet.clear();
        linkedHashSet2.clear();
        linkedHashSet3.clear();
    }

    @Override // defpackage.sq1
    public void setAspectRatio(float f) {
        this.j.setValue(this, k[0], Float.valueOf(f));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (getForegroundGravity() == i) {
            return;
        }
        super.setForegroundGravity(i);
        int foregroundGravity = getForegroundGravity();
        Rect rect = this.c;
        if (foregroundGravity != 119 || getForeground() == null) {
            rect.setEmpty();
        } else {
            getForeground().getPadding(rect);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public kvc(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ kvc(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public kvc(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
