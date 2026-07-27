package androidx.appcompat.widget;

import C3.e;
import M.h;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i8.m;
import l.InterfaceC4682j;
import l.k;
import l.l;
import l.n;
import l.w;
import l.z;
import m.AbstractC4763u0;
import m.C4735g;
import m.C4741j;
import m.C4743k;
import m.C4747m;
import m.C4761t0;
import m.InterfaceC4745l;
import m.InterfaceC4749n;
import m.g1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC4763u0 implements k, z {

    /* renamed from: I, reason: collision with root package name */
    public l f4674I;
    public Context J;

    /* renamed from: K, reason: collision with root package name */
    public int f4675K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4676L;

    /* renamed from: M, reason: collision with root package name */
    public C4743k f4677M;

    /* renamed from: N, reason: collision with root package name */
    public h f4678N;

    /* renamed from: O, reason: collision with root package name */
    public InterfaceC4682j f4679O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4680P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4681Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f4682R;

    /* renamed from: S, reason: collision with root package name */
    public final int f4683S;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC4749n f4684T;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f4682R = (int) (56.0f * f6);
        this.f4683S = (int) (f6 * 4.0f);
        this.J = context;
        this.f4675K = 0;
    }

    public static C4747m j() {
        C4747m c4747m = new C4747m(-2, -2);
        c4747m.f39454a = false;
        ((LinearLayout.LayoutParams) c4747m).gravity = 16;
        return c4747m;
    }

    public static C4747m k(ViewGroup.LayoutParams layoutParams) {
        C4747m c4747m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C4747m) {
            C4747m c4747m2 = (C4747m) layoutParams;
            c4747m = new C4747m(c4747m2);
            c4747m.f39454a = c4747m2.f39454a;
        } else {
            c4747m = new C4747m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c4747m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c4747m).gravity = 16;
        }
        return c4747m;
    }

    @Override // l.k
    public final boolean a(n nVar) {
        return this.f4674I.q(nVar, null, 0);
    }

    @Override // l.z
    public final void c(l lVar) {
        this.f4674I = lVar;
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4747m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.AbstractC4763u0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4761t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4763u0
    /* renamed from: g */
    public final C4761t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C4747m(getContext(), attributeSet);
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4674I == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.f4674I = lVar;
            lVar.f38966x = new m(this);
            C4743k c4743k = new C4743k(context);
            this.f4677M = c4743k;
            c4743k.f39432E = true;
            c4743k.f39433F = true;
            w wVar = this.f4678N;
            if (wVar == null) {
                wVar = new e();
            }
            c4743k.f39447x = wVar;
            this.f4674I.b(c4743k, this.J);
            C4743k c4743k2 = this.f4677M;
            c4743k2.f39428A = this;
            this.f4674I = c4743k2.f39445v;
        }
        return this.f4674I;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C4743k c4743k = this.f4677M;
        C4741j c4741j = c4743k.f39429B;
        if (c4741j != null) {
            return c4741j.getDrawable();
        }
        if (c4743k.f39431D) {
            return c4743k.f39430C;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4675K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // m.AbstractC4763u0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4761t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z8 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC4745l)) {
            z8 = ((InterfaceC4745l) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC4745l)) ? z8 : ((InterfaceC4745l) childAt2).c() | z8;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4743k c4743k = this.f4677M;
        if (c4743k != null) {
            c4743k.d();
            if (this.f4677M.k()) {
                this.f4677M.f();
                this.f4677M.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4743k c4743k = this.f4677M;
        if (c4743k != null) {
            c4743k.f();
            C4735g c4735g = c4743k.f39439M;
            if (c4735g == null || !c4735g.b()) {
                return;
            }
            c4735g.i.dismiss();
        }
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int width;
        int i11;
        if (!this.f4680P) {
            super.onLayout(z8, i, i4, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean z9 = g1.f39419a;
        boolean z10 = getLayoutDirection() == 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C4747m c4747m = (C4747m) childAt.getLayoutParams();
                if (c4747m.f39454a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c4747m).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c4747m).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c4747m).leftMargin) + ((LinearLayout.LayoutParams) c4747m).rightMargin;
                    l(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C4747m c4747m2 = (C4747m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c4747m2.f39454a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c4747m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c4747m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C4747m c4747m3 = (C4747m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c4747m3.f39454a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c4747m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c4747m3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // m.AbstractC4763u0, android.view.View
    public final void onMeasure(int i, int i4) {
        int i9;
        int i10;
        ?? r11;
        int i11;
        int i12;
        l lVar;
        boolean z8 = this.f4680P;
        boolean z9 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4680P = z9;
        if (z8 != z9) {
            this.f4681Q = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4680P && (lVar = this.f4674I) != null && size != this.f4681Q) {
            this.f4681Q = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4680P || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C4747m c4747m = (C4747m) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c4747m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c4747m).leftMargin = 0;
            }
            super.onMeasure(i, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f4682R;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        int i23 = 0;
        long j9 = 0;
        while (true) {
            i9 = this.f4683S;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z11) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C4747m c4747m2 = (C4747m) childAt.getLayoutParams();
                c4747m2.f39459f = false;
                c4747m2.f39456c = 0;
                c4747m2.f39455b = 0;
                c4747m2.f39457d = false;
                ((LinearLayout.LayoutParams) c4747m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c4747m2).rightMargin = 0;
                c4747m2.f39458e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c4747m2.f39454a ? 1 : i16;
                C4747m c4747m3 = (C4747m) childAt.getLayoutParams();
                int i27 = i16;
                i11 = i18;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z13 = z12;
                if (i26 <= 0 || (z12 && i26 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i11;
                    if (measuredWidth % i11 != 0) {
                        i12++;
                    }
                    if (z13 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c4747m3.f39457d = !c4747m3.f39454a && z13;
                c4747m3.f39455b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (c4747m2.f39457d) {
                    i23++;
                }
                if (c4747m2.f39454a) {
                    z10 = true;
                }
                i16 = i27 - i12;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j9 |= 1 << i22;
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i18 = i11;
        }
        int i28 = size3;
        int i29 = i16;
        int i30 = i18;
        boolean z14 = z10 && i20 == 2;
        int i31 = i29;
        boolean z15 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                boolean z16 = z14;
                C4747m c4747m4 = (C4747m) getChildAt(i34).getLayoutParams();
                int i35 = i19;
                if (c4747m4.f39457d) {
                    int i36 = c4747m4.f39455b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                i19 = i35;
                z14 = z16;
            }
            boolean z17 = z14;
            i10 = i19;
            j9 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                C4747m c4747m5 = (C4747m) childAt2.getLayoutParams();
                boolean z18 = z10;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z17 && c4747m5.f39458e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i9 + i30, 0, i9, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c4747m5.f39455b += r11;
                    c4747m5.f39459f = r11;
                    i31--;
                } else if (c4747m5.f39455b == i37) {
                    j9 |= j11;
                }
                i38++;
                z10 = z18;
            }
            i19 = i10;
            z14 = z17;
            z15 = true;
        }
        i10 = i19;
        boolean z19 = !z10 && i20 == 1;
        if (i31 > 0 && j9 != 0 && (i31 < i20 - 1 || z19 || i21 > 1)) {
            float bitCount = Long.bitCount(j9);
            if (!z19) {
                if ((j9 & 1) != 0 && !((C4747m) getChildAt(0).getLayoutParams()).f39458e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j9 & (1 << i39)) != 0 && !((C4747m) getChildAt(i39).getLayoutParams()).f39458e) {
                    bitCount -= 0.5f;
                }
            }
            int i40 = bitCount > 0.0f ? (int) ((i31 * i30) / bitCount) : 0;
            boolean z20 = z15;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j9 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C4747m c4747m6 = (C4747m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c4747m6.f39456c = i40;
                        c4747m6.f39459f = true;
                        if (i41 == 0 && !c4747m6.f39458e) {
                            ((LinearLayout.LayoutParams) c4747m6).leftMargin = (-i40) / 2;
                        }
                        z20 = true;
                    } else if (c4747m6.f39454a) {
                        c4747m6.f39456c = i40;
                        c4747m6.f39459f = true;
                        ((LinearLayout.LayoutParams) c4747m6).rightMargin = (-i40) / 2;
                        z20 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) c4747m6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c4747m6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z15 = z20;
        }
        if (z15) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                C4747m c4747m7 = (C4747m) childAt4.getLayoutParams();
                if (c4747m7.f39459f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c4747m7.f39455b * i30) + c4747m7.f39456c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i10 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f4677M.J = z8;
    }

    public void setOnMenuItemClickListener(InterfaceC4749n interfaceC4749n) {
        this.f4684T = interfaceC4749n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C4743k c4743k = this.f4677M;
        C4741j c4741j = c4743k.f39429B;
        if (c4741j != null) {
            c4741j.setImageDrawable(drawable);
        } else {
            c4743k.f39431D = true;
            c4743k.f39430C = drawable;
        }
    }

    public void setOverflowReserved(boolean z8) {
        this.f4676L = z8;
    }

    public void setPopupTheme(int i) {
        if (this.f4675K != i) {
            this.f4675K = i;
            if (i == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C4743k c4743k) {
        this.f4677M = c4743k;
        c4743k.f39428A = this;
        this.f4674I = c4743k.f39445v;
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4747m(getContext(), attributeSet);
    }
}
