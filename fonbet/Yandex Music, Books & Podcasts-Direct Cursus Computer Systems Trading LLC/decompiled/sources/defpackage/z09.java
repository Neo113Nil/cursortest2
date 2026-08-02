package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z09 extends j1a {
    public Function0 m;
    public Function0 n;
    public Function0 o;

    public z09(@NotNull Context context) {
        super(context, null, 0, 6, null);
        this.m = bs5.Y;
        this.n = bs5.L;
        this.o = bs5.X;
    }

    public final Integer f(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        int i7;
        int size = View.MeasureSpec.getSize(i) - i2;
        if (!z) {
            size = eeh.b((size - (((Number) this.o.invoke()).floatValue() * (((Number) this.n.invoke()).intValue() - 1))) / ((Number) this.n.invoke()).floatValue());
        }
        int i8 = i5 == Integer.MAX_VALUE ? i5 : i5 + i6;
        if (z || i3 != -1 || View.MeasureSpec.getMode(i) != 0) {
            i7 = i3;
        } else {
            if (!z2) {
                return null;
            }
            i7 = -2;
        }
        if (i7 == -3) {
            return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(size, i4 + i6), i8), Integer.MIN_VALUE));
        }
        if (i7 != -2) {
            return i7 != -1 ? Integer.valueOf(View.MeasureSpec.makeMeasureSpec(i3 + i6, 1073741824)) : Integer.valueOf(View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(size, i4 + i6), i8), 1073741824));
        }
        return Integer.valueOf(i5 == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE));
    }

    @NotNull
    public final Function0<Integer> getColumnCount() {
        return this.n;
    }

    @NotNull
    public final Function0<Float> getCrossSpacing() {
        return this.o;
    }

    @NotNull
    public final Function0<Integer> getOrientation() {
        return this.m;
    }

    @Override // defpackage.kvc, android.view.View
    public final void onMeasure(int i, int i2) {
        View child = getChild();
        if (child == null) {
            setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i2, 0));
            return;
        }
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        ViewParent parent = getParent();
        parent.getClass();
        hh9 hh9Var = (hh9) parent;
        boolean z = ((Number) this.m.invoke()).intValue() == 0;
        Integer f = f(hh9Var.getWidthMeasureSpec(), hh9Var.getPaddingLeft() + hh9Var.getPaddingRight(), ((ViewGroup.MarginLayoutParams) u79Var).width, child.getMinimumWidth(), u79Var.h, u79Var.b(), z, hh9Var.getConsiderMatchParent());
        Integer f2 = f(hh9Var.getHeightMeasureSpec(), hh9Var.getPaddingBottom() + hh9Var.getPaddingTop(), ((ViewGroup.MarginLayoutParams) u79Var).height, child.getMinimumHeight(), u79Var.g, u79Var.d(), !z, hh9Var.getConsiderMatchParent());
        if (f == null || f2 == null) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(f.intValue(), f2.intValue());
        }
    }

    public final void setColumnCount(@NotNull Function0<Integer> function0) {
        this.n = function0;
    }

    public final void setCrossSpacing(@NotNull Function0<Float> function0) {
        this.o = function0;
    }

    public final void setOrientation(@NotNull Function0<Integer> function0) {
        this.m = function0;
    }
}
