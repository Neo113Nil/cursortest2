package androidx.appcompat.widget;

import B.b;
import S0.e;
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
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0212A;
import l.InterfaceC0228l;
import l.MenuC0229m;
import l.o;
import m.AbstractC0286w0;
import m.C0254g;
import m.C0260j;
import m.C0264l;
import m.C0268n;
import m.C0284v0;
import m.InterfaceC0266m;
import m.InterfaceC0270o;
import m.V0;
import m.h1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0286w0 implements InterfaceC0228l, InterfaceC0212A {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0229m f1822p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1823q;

    /* renamed from: r, reason: collision with root package name */
    public int f1824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1825s;

    /* renamed from: t, reason: collision with root package name */
    public C0264l f1826t;

    /* renamed from: u, reason: collision with root package name */
    public V0 f1827u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1828v;

    /* renamed from: w, reason: collision with root package name */
    public int f1829w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1830x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1831y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0270o f1832z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1830x = (int) (56.0f * f2);
        this.f1831y = (int) (f2 * 4.0f);
        this.f1823q = context;
        this.f1824r = 0;
    }

    public static C0268n j() {
        C0268n c0268n = new C0268n(-2, -2);
        c0268n.f3983a = false;
        ((LinearLayout.LayoutParams) c0268n).gravity = 16;
        return c0268n;
    }

    public static C0268n k(ViewGroup.LayoutParams layoutParams) {
        C0268n c0268n;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0268n) {
            C0268n c0268n2 = (C0268n) layoutParams;
            c0268n = new C0268n(c0268n2);
            c0268n.f3983a = c0268n2.f3983a;
        } else {
            c0268n = new C0268n(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0268n).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0268n).gravity = 16;
        }
        return c0268n;
    }

    @Override // l.InterfaceC0212A
    public final void a(MenuC0229m menuC0229m) {
        this.f1822p = menuC0229m;
    }

    @Override // l.InterfaceC0228l
    public final boolean b(o oVar) {
        return this.f1822p.q(oVar, null, 0);
    }

    @Override // m.AbstractC0286w0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0268n;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.AbstractC0286w0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0284v0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC0286w0
    /* renamed from: g */
    public final C0284v0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0268n(getContext(), attributeSet);
    }

    @Override // m.AbstractC0286w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC0286w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1822p == null) {
            Context context = getContext();
            MenuC0229m menuC0229m = new MenuC0229m(context);
            this.f1822p = menuC0229m;
            menuC0229m.e = new b(28, this);
            C0264l c0264l = new C0264l(context);
            this.f1826t = c0264l;
            c0264l.f3968m = true;
            c0264l.f3969n = true;
            c0264l.e = new e(28);
            this.f1822p.b(c0264l, this.f1823q);
            C0264l c0264l2 = this.f1826t;
            c0264l2.f3965h = this;
            this.f1822p = c0264l2.f3961c;
        }
        return this.f1822p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0264l c0264l = this.f1826t;
        C0260j c0260j = c0264l.j;
        if (c0260j != null) {
            return c0260j.getDrawable();
        }
        if (c0264l.f3967l) {
            return c0264l.f3966k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1824r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // m.AbstractC0286w0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0284v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0266m)) {
            z2 = ((InterfaceC0266m) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0266m)) ? z2 : z2 | ((InterfaceC0266m) childAt2).a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0264l c0264l = this.f1826t;
        if (c0264l != null) {
            c0264l.m(false);
            if (this.f1826t.g()) {
                this.f1826t.c();
                this.f1826t.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0264l c0264l = this.f1826t;
        if (c0264l != null) {
            c0264l.c();
            C0254g c0254g = c0264l.f3976u;
            if (c0254g == null || !c0254g.b()) {
                return;
            }
            c0254g.i.dismiss();
        }
    }

    @Override // m.AbstractC0286w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1828v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = h1.f3952a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0268n c0268n = (C0268n) childAt.getLayoutParams();
                if (c0268n.f3983a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0268n).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0268n).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0268n).leftMargin) + ((LinearLayout.LayoutParams) c0268n).rightMargin;
                    l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0268n c0268n2 = (C0268n) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0268n2.f3983a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0268n2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0268n2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0268n c0268n3 = (C0268n) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0268n3.f3983a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0268n3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0268n3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // m.AbstractC0286w0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC0229m menuC0229m;
        boolean z4 = this.f1828v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1828v = z5;
        if (z4 != z5) {
            this.f1829w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1828v && (menuC0229m = this.f1822p) != null && size != this.f1829w) {
            this.f1829w = size;
            menuC0229m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1828v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0268n c0268n = (C0268n) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0268n).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0268n).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f1830x;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j = 0;
        while (true) {
            i3 = this.f1831y;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0268n c0268n2 = (C0268n) childAt.getLayoutParams();
                c0268n2.f3987f = false;
                c0268n2.f3985c = 0;
                c0268n2.f3984b = 0;
                c0268n2.f3986d = false;
                ((LinearLayout.LayoutParams) c0268n2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0268n2).rightMargin = 0;
                c0268n2.e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0268n2.f3983a ? 1 : i14;
                C0268n c0268n3 = (C0268n) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z8 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c0268n3.f3986d = !c0268n3.f3983a && z8;
                c0268n3.f3984b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0268n2.f3986d) {
                    i21++;
                }
                if (c0268n2.f3983a) {
                    z6 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j2 = 0;
            while (i31 < childCount2) {
                C0268n c0268n4 = (C0268n) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0268n4.f3986d) {
                    int i32 = c0268n4.f3984b;
                    if (i32 < i29) {
                        j2 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j2 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z11;
            }
            z2 = z10;
            j |= j2;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0268n c0268n5 = (C0268n) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j3 = 1 << i34;
                if ((j2 & j3) != 0) {
                    if (z9 && c0268n5.e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0268n5.f3984b += r4;
                    c0268n5.f3987f = r4;
                    i14--;
                } else if (c0268n5.f3984b == i33) {
                    j |= j3;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z10 = true;
        }
        z2 = z10;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i18 - 1 && !z12 && i19 <= 1)) {
            i4 = i40;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C0268n) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j & (1 << i41)) != 0 && !((C0268n) getChildAt(i41).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > RecyclerView.f2111C0 ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0268n c0268n6 = (C0268n) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0268n6.f3985c = i42;
                        c0268n6.f3987f = true;
                        if (i43 == 0 && !c0268n6.e) {
                            ((LinearLayout.LayoutParams) c0268n6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0268n6.f3983a) {
                            c0268n6.f3985c = i42;
                            c0268n6.f3987f = true;
                            ((LinearLayout.LayoutParams) c0268n6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0268n6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0268n6).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C0268n c0268n7 = (C0268n) childAt4.getLayoutParams();
                if (c0268n7.f3987f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0268n7.f3984b * i16) + c0268n7.f3985c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1826t.f3973r = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0270o interfaceC0270o) {
        this.f1832z = interfaceC0270o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0264l c0264l = this.f1826t;
        C0260j c0260j = c0264l.j;
        if (c0260j != null) {
            c0260j.setImageDrawable(drawable);
        } else {
            c0264l.f3967l = true;
            c0264l.f3966k = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1825s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1824r != i) {
            this.f1824r = i;
            if (i == 0) {
                this.f1823q = getContext();
            } else {
                this.f1823q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0264l c0264l) {
        this.f1826t = c0264l;
        c0264l.f3965h = this;
        this.f1822p = c0264l.f3961c;
    }

    @Override // m.AbstractC0286w0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0268n(getContext(), attributeSet);
    }
}
