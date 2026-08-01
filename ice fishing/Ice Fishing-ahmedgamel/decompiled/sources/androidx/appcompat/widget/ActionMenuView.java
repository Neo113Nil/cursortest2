package androidx.appcompat.widget;

import L3.h;
import M2.i;
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
import g1.C4522b;
import l.InterfaceC4639A;
import l.k;
import l.l;
import l.m;
import l.o;
import l.x;
import m.AbstractC4715u0;
import m.C4687g;
import m.C4693j;
import m.C4695k;
import m.C4699m;
import m.C4713t0;
import m.InterfaceC4697l;
import m.InterfaceC4701n;
import m.f1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC4715u0 implements l, InterfaceC4639A {

    /* renamed from: I, reason: collision with root package name */
    public m f4559I;
    public Context J;

    /* renamed from: K, reason: collision with root package name */
    public int f4560K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4561L;

    /* renamed from: M, reason: collision with root package name */
    public C4695k f4562M;

    /* renamed from: N, reason: collision with root package name */
    public h f4563N;

    /* renamed from: O, reason: collision with root package name */
    public k f4564O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4565P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4566Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f4567R;

    /* renamed from: S, reason: collision with root package name */
    public final int f4568S;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC4701n f4569T;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f4567R = (int) (56.0f * f3);
        this.f4568S = (int) (f3 * 4.0f);
        this.J = context;
        this.f4560K = 0;
    }

    public static C4699m j() {
        C4699m c4699m = new C4699m(-2, -2);
        c4699m.f39183a = false;
        ((LinearLayout.LayoutParams) c4699m).gravity = 16;
        return c4699m;
    }

    public static C4699m k(ViewGroup.LayoutParams layoutParams) {
        C4699m c4699m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C4699m) {
            C4699m c4699m2 = (C4699m) layoutParams;
            c4699m = new C4699m(c4699m2);
            c4699m.f39183a = c4699m2.f39183a;
        } else {
            c4699m = new C4699m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c4699m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c4699m).gravity = 16;
        }
        return c4699m;
    }

    @Override // l.l
    public final boolean a(o oVar) {
        return this.f4559I.q(oVar, null, 0);
    }

    @Override // l.InterfaceC4639A
    public final void c(m mVar) {
        this.f4559I = mVar;
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4699m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.AbstractC4715u0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4713t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4715u0
    /* renamed from: g */
    public final C4713t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C4699m(getContext(), attributeSet);
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4559I == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f4559I = mVar;
            mVar.f38824x = new C4522b(24, this);
            C4695k c4695k = new C4695k(context);
            this.f4562M = c4695k;
            c4695k.f39161E = true;
            c4695k.f39162F = true;
            x xVar = this.f4563N;
            if (xVar == null) {
                xVar = new i(20);
            }
            c4695k.f39176x = xVar;
            this.f4559I.b(c4695k, this.J);
            C4695k c4695k2 = this.f4562M;
            c4695k2.f39157A = this;
            this.f4559I = c4695k2.f39174v;
        }
        return this.f4559I;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C4695k c4695k = this.f4562M;
        C4693j c4693j = c4695k.f39158B;
        if (c4693j != null) {
            return c4693j.getDrawable();
        }
        if (c4695k.f39160D) {
            return c4695k.f39159C;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4560K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // m.AbstractC4715u0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4713t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z3 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC4697l)) {
            z3 = ((InterfaceC4697l) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC4697l)) ? z3 : ((InterfaceC4697l) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4695k c4695k = this.f4562M;
        if (c4695k != null) {
            c4695k.e();
            if (this.f4562M.k()) {
                this.f4562M.f();
                this.f4562M.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4695k c4695k = this.f4562M;
        if (c4695k != null) {
            c4695k.f();
            C4687g c4687g = c4695k.f39168M;
            if (c4687g == null || !c4687g.b()) {
                return;
            }
            c4687g.i.dismiss();
        }
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int width;
        int i11;
        if (!this.f4565P) {
            super.onLayout(z3, i, i6, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean z6 = f1.f39146a;
        boolean z9 = getLayoutDirection() == 1;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C4699m c4699m = (C4699m) childAt.getLayoutParams();
                if (c4699m.f39183a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z9) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c4699m).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c4699m).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c4699m).leftMargin) + ((LinearLayout.LayoutParams) c4699m).rightMargin;
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
        if (z9) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C4699m c4699m2 = (C4699m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c4699m2.f39183a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c4699m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c4699m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C4699m c4699m3 = (C4699m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c4699m3.f39183a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c4699m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c4699m3).rightMargin + max + i25;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // m.AbstractC4715u0, android.view.View
    public final void onMeasure(int i, int i6) {
        int i9;
        int i10;
        ?? r11;
        int i11;
        int i12;
        m mVar;
        boolean z3 = this.f4565P;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4565P = z6;
        if (z3 != z6) {
            this.f4566Q = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4565P && (mVar = this.f4559I) != null && size != this.f4566Q) {
            this.f4566Q = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4565P || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C4699m c4699m = (C4699m) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c4699m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c4699m).leftMargin = 0;
            }
            super.onMeasure(i, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f4567R;
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
        boolean z9 = false;
        int i23 = 0;
        long j6 = 0;
        while (true) {
            i9 = this.f4568S;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z10) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C4699m c4699m2 = (C4699m) childAt.getLayoutParams();
                c4699m2.f39188f = false;
                c4699m2.f39185c = 0;
                c4699m2.f39184b = 0;
                c4699m2.f39186d = false;
                ((LinearLayout.LayoutParams) c4699m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c4699m2).rightMargin = 0;
                c4699m2.f39187e = z10 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c4699m2.f39183a ? 1 : i16;
                C4699m c4699m3 = (C4699m) childAt.getLayoutParams();
                int i27 = i16;
                i11 = i18;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z10 ? (ActionMenuItemView) childAt : null;
                boolean z11 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z12 = z11;
                if (i26 <= 0 || (z11 && i26 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i11;
                    if (measuredWidth % i11 != 0) {
                        i12++;
                    }
                    if (z12 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c4699m3.f39186d = !c4699m3.f39183a && z12;
                c4699m3.f39184b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, 1073741824), makeMeasureSpec);
                i21 = Math.max(i21, i12);
                if (c4699m2.f39186d) {
                    i23++;
                }
                if (c4699m2.f39183a) {
                    z9 = true;
                }
                i16 = i27 - i12;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j6 |= 1 << i22;
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
        boolean z13 = z9 && i20 == 2;
        int i31 = i29;
        boolean z14 = false;
        while (i23 > 0 && i31 > 0) {
            int i32 = Integer.MAX_VALUE;
            long j9 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                boolean z15 = z13;
                C4699m c4699m4 = (C4699m) getChildAt(i34).getLayoutParams();
                int i35 = i19;
                if (c4699m4.f39186d) {
                    int i36 = c4699m4.f39184b;
                    if (i36 < i32) {
                        j9 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j9 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                i19 = i35;
                z13 = z15;
            }
            boolean z16 = z13;
            i10 = i19;
            j6 |= j9;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                C4699m c4699m5 = (C4699m) childAt2.getLayoutParams();
                boolean z17 = z9;
                long j10 = 1 << i38;
                if ((j9 & j10) != 0) {
                    if (z16 && c4699m5.f39187e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i9 + i30, 0, i9, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c4699m5.f39184b += r11;
                    c4699m5.f39188f = r11;
                    i31--;
                } else if (c4699m5.f39184b == i37) {
                    j6 |= j10;
                }
                i38++;
                z9 = z17;
            }
            i19 = i10;
            z13 = z16;
            z14 = true;
        }
        i10 = i19;
        boolean z18 = !z9 && i20 == 1;
        if (i31 > 0 && j6 != 0 && (i31 < i20 - 1 || z18 || i21 > 1)) {
            float bitCount = Long.bitCount(j6);
            if (!z18) {
                if ((j6 & 1) != 0 && !((C4699m) getChildAt(0).getLayoutParams()).f39187e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j6 & (1 << i39)) != 0 && !((C4699m) getChildAt(i39).getLayoutParams()).f39187e) {
                    bitCount -= 0.5f;
                }
            }
            int i40 = bitCount > 0.0f ? (int) ((i31 * i30) / bitCount) : 0;
            boolean z19 = z14;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j6 & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C4699m c4699m6 = (C4699m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c4699m6.f39185c = i40;
                        c4699m6.f39188f = true;
                        if (i41 == 0 && !c4699m6.f39187e) {
                            ((LinearLayout.LayoutParams) c4699m6).leftMargin = (-i40) / 2;
                        }
                        z19 = true;
                    } else if (c4699m6.f39183a) {
                        c4699m6.f39185c = i40;
                        c4699m6.f39188f = true;
                        ((LinearLayout.LayoutParams) c4699m6).rightMargin = (-i40) / 2;
                        z19 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) c4699m6).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c4699m6).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z14 = z19;
        }
        if (z14) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                C4699m c4699m7 = (C4699m) childAt4.getLayoutParams();
                if (c4699m7.f39188f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c4699m7.f39184b * i30) + c4699m7.f39185c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i10 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f4562M.J = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC4701n interfaceC4701n) {
        this.f4569T = interfaceC4701n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C4695k c4695k = this.f4562M;
        C4693j c4693j = c4695k.f39158B;
        if (c4693j != null) {
            c4693j.setImageDrawable(drawable);
        } else {
            c4695k.f39160D = true;
            c4695k.f39159C = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f4561L = z3;
    }

    public void setPopupTheme(int i) {
        if (this.f4560K != i) {
            this.f4560K = i;
            if (i == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C4695k c4695k) {
        this.f4562M = c4695k;
        c4695k.f39157A = this;
        this.f4559I = c4695k.f39174v;
    }

    @Override // m.AbstractC4715u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4699m(getContext(), attributeSet);
    }
}
