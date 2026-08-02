package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class y0a extends ViewGroup {
    public static final /* synthetic */ int b = 0;
    public int a;

    public /* synthetic */ y0a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void b(View view, int i, int i2) {
        super.measureChild(view, i, i2);
    }

    public final void c(View view, int i, int i2, int i3, int i4) {
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u79;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new u79(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u79 ? new u79((u79) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new u79((ViewGroup.MarginLayoutParams) layoutParams) : new u79(layoutParams);
    }

    public final int getGravity() {
        return this.a;
    }

    public final int getHorizontalGravity$div_release() {
        return this.a & 125829127;
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final int getVerticalGravity$div_release() {
        return this.a & 1879048304;
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingBottom() + getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        view.measure(xp3.O(i, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) u79Var).width, view.getMinimumWidth(), u79Var.h), xp3.O(i2, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) u79Var).height, view.getMinimumHeight(), u79Var.g));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        u79 u79Var = (u79) layoutParams;
        view.measure(xp3.O(i, u79Var.b() + getHorizontalPaddings$div_release() + i2, ((ViewGroup.MarginLayoutParams) u79Var).width, view.getMinimumWidth(), u79Var.h), xp3.O(i3, u79Var.d() + getVerticalPaddings$div_release() + i4, ((ViewGroup.MarginLayoutParams) u79Var).height, view.getMinimumHeight(), u79Var.g));
    }

    public final void setGravity(int i) {
        if (this.a == i) {
            return;
        }
        if ((125829127 & i) == 0) {
            i |= 8388611;
        }
        if ((1879048304 & i) == 0) {
            i |= 48;
        }
        this.a = i;
        requestLayout();
    }

    public y0a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public y0a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public y0a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 8388659;
        setClipToPadding(false);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new u79(getContext(), attributeSet);
    }
}
