package androidx.appcompat.widget;

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
import c4.e;
import l.C4659e;
import l.InterfaceC4650A;
import l.k;
import l.l;
import l.m;
import l.o;
import l.x;
import m.AbstractC4728u0;
import m.C4700g;
import m.C4706j;
import m.C4708k;
import m.C4712m;
import m.C4726t0;
import m.InterfaceC4710l;
import m.InterfaceC4714n;
import m.g1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC4728u0 implements l, InterfaceC4650A {

    /* renamed from: I, reason: collision with root package name */
    public m f4527I;
    public Context J;

    /* renamed from: K, reason: collision with root package name */
    public int f4528K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4529L;

    /* renamed from: M, reason: collision with root package name */
    public C4708k f4530M;

    /* renamed from: N, reason: collision with root package name */
    public h f4531N;

    /* renamed from: O, reason: collision with root package name */
    public k f4532O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4533P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4534Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f4535R;

    /* renamed from: S, reason: collision with root package name */
    public final int f4536S;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC4714n f4537T;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4535R = (int) (56.0f * f2);
        this.f4536S = (int) (f2 * 4.0f);
        this.J = context;
        this.f4528K = 0;
    }

    public static C4712m j() {
        C4712m c4712m = new C4712m(-2, -2);
        c4712m.f39252a = false;
        ((LinearLayout.LayoutParams) c4712m).gravity = 16;
        return c4712m;
    }

    public static C4712m k(ViewGroup.LayoutParams layoutParams) {
        C4712m c4712m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C4712m) {
            C4712m c4712m2 = (C4712m) layoutParams;
            c4712m = new C4712m(c4712m2);
            c4712m.f39252a = c4712m2.f39252a;
        } else {
            c4712m = new C4712m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c4712m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c4712m).gravity = 16;
        }
        return c4712m;
    }

    @Override // l.l
    public final boolean a(o oVar) {
        return this.f4527I.q(oVar, null, 0);
    }

    @Override // l.InterfaceC4650A
    public final void c(m mVar) {
        this.f4527I = mVar;
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4712m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.AbstractC4728u0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4726t0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4728u0
    /* renamed from: g */
    public final C4726t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C4712m(getContext(), attributeSet);
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f4527I == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f4527I = mVar;
            mVar.f38751x = new C4659e(2, this);
            C4708k c4708k = new C4708k(context);
            this.f4530M = c4708k;
            c4708k.f39230E = true;
            c4708k.f39231F = true;
            x xVar = this.f4531N;
            if (xVar == null) {
                xVar = new e();
            }
            c4708k.f39245x = xVar;
            this.f4527I.b(c4708k, this.J);
            C4708k c4708k2 = this.f4530M;
            c4708k2.f39226A = this;
            this.f4527I = c4708k2.f39243v;
        }
        return this.f4527I;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C4708k c4708k = this.f4530M;
        C4706j c4706j = c4708k.f39227B;
        if (c4706j != null) {
            return c4706j.getDrawable();
        }
        if (c4708k.f39229D) {
            return c4708k.f39228C;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f4528K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // m.AbstractC4728u0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4726t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z6 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC4710l)) {
            z6 = ((InterfaceC4710l) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC4710l)) ? z6 : ((InterfaceC4710l) childAt2).c() | z6;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C4708k c4708k = this.f4530M;
        if (c4708k != null) {
            c4708k.e();
            if (this.f4530M.k()) {
                this.f4530M.f();
                this.f4530M.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4708k c4708k = this.f4530M;
        if (c4708k != null) {
            c4708k.f();
            C4700g c4700g = c4708k.f39237M;
            if (c4700g == null || !c4700g.b()) {
                return;
            }
            c4700g.i.dismiss();
        }
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int width;
        int i10;
        if (!this.f4533P) {
            super.onLayout(z6, i, i4, i6, i9);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i9 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i6 - i;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean z9 = g1.f39217a;
        boolean z10 = getLayoutDirection() == 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C4712m c4712m = (C4712m) childAt.getLayoutParams();
                if (c4712m.f39252a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        i10 = getPaddingLeft() + ((LinearLayout.LayoutParams) c4712m).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c4712m).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c4712m).leftMargin) + ((LinearLayout.LayoutParams) c4712m).rightMargin;
                    l(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                C4712m c4712m2 = (C4712m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c4712m2.f39252a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) c4712m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c4712m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            C4712m c4712m3 = (C4712m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c4712m3.f39252a) {
                int i24 = paddingLeft + ((LinearLayout.LayoutParams) c4712m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c4712m3).rightMargin + max + i24;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    @Override // m.AbstractC4728u0, android.view.View
    public final void onMeasure(int i, int i4) {
        int i6;
        int i9;
        ?? r11;
        int i10;
        int i11;
        m mVar;
        boolean z6 = this.f4533P;
        boolean z9 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f4533P = z9;
        if (z6 != z9) {
            this.f4534Q = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f4533P && (mVar = this.f4527I) != null && size != this.f4534Q) {
            this.f4534Q = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f4533P || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C4712m c4712m = (C4712m) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) c4712m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c4712m).leftMargin = 0;
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
        int i13 = size2 - paddingRight;
        int i14 = this.f4535R;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        int i22 = 0;
        long j6 = 0;
        while (true) {
            i6 = this.f4536S;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i10 = i17;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i19++;
                if (z11) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C4712m c4712m2 = (C4712m) childAt.getLayoutParams();
                c4712m2.f39257f = false;
                c4712m2.f39254c = 0;
                c4712m2.f39253b = 0;
                c4712m2.f39255d = false;
                ((LinearLayout.LayoutParams) c4712m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c4712m2).rightMargin = 0;
                c4712m2.f39256e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c4712m2.f39252a ? 1 : i15;
                C4712m c4712m3 = (C4712m) childAt.getLayoutParams();
                int i26 = i15;
                i10 = i17;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i24, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z13 = z12;
                if (i25 <= 0 || (z12 && i25 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i11++;
                    }
                    if (z13 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c4712m3.f39255d = !c4712m3.f39252a && z13;
                c4712m3.f39253b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, 1073741824), makeMeasureSpec);
                i20 = Math.max(i20, i11);
                if (c4712m2.f39255d) {
                    i22++;
                }
                if (c4712m2.f39252a) {
                    z10 = true;
                }
                i15 = i26 - i11;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j6 |= 1 << i21;
                }
            }
            i21++;
            size3 = i23;
            paddingBottom = i24;
            i17 = i10;
        }
        int i27 = size3;
        int i28 = i15;
        int i29 = i17;
        boolean z14 = z10 && i19 == 2;
        int i30 = i28;
        boolean z15 = false;
        while (i22 > 0 && i30 > 0) {
            int i31 = Integer.MAX_VALUE;
            long j9 = 0;
            int i32 = 0;
            int i33 = 0;
            while (i33 < childCount2) {
                boolean z16 = z14;
                C4712m c4712m4 = (C4712m) getChildAt(i33).getLayoutParams();
                int i34 = i18;
                if (c4712m4.f39255d) {
                    int i35 = c4712m4.f39253b;
                    if (i35 < i31) {
                        j9 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        j9 |= 1 << i33;
                        i32++;
                    }
                }
                i33++;
                i18 = i34;
                z14 = z16;
            }
            boolean z17 = z14;
            i9 = i18;
            j6 |= j9;
            if (i32 > i30) {
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                C4712m c4712m5 = (C4712m) childAt2.getLayoutParams();
                boolean z18 = z10;
                long j10 = 1 << i37;
                if ((j9 & j10) != 0) {
                    if (z17 && c4712m5.f39256e) {
                        r11 = 1;
                        r11 = 1;
                        if (i30 == 1) {
                            childAt2.setPadding(i6 + i29, 0, i6, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c4712m5.f39253b += r11;
                    c4712m5.f39257f = r11;
                    i30--;
                } else if (c4712m5.f39253b == i36) {
                    j6 |= j10;
                }
                i37++;
                z10 = z18;
            }
            i18 = i9;
            z14 = z17;
            z15 = true;
        }
        i9 = i18;
        boolean z19 = !z10 && i19 == 1;
        if (i30 > 0 && j6 != 0 && (i30 < i19 - 1 || z19 || i20 > 1)) {
            float bitCount = Long.bitCount(j6);
            if (!z19) {
                if ((j6 & 1) != 0 && !((C4712m) getChildAt(0).getLayoutParams()).f39256e) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount2 - 1;
                if ((j6 & (1 << i38)) != 0 && !((C4712m) getChildAt(i38).getLayoutParams()).f39256e) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i30 * i29) / bitCount) : 0;
            boolean z20 = z15;
            for (int i40 = 0; i40 < childCount2; i40++) {
                if ((j6 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    C4712m c4712m6 = (C4712m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c4712m6.f39254c = i39;
                        c4712m6.f39257f = true;
                        if (i40 == 0 && !c4712m6.f39256e) {
                            ((LinearLayout.LayoutParams) c4712m6).leftMargin = (-i39) / 2;
                        }
                        z20 = true;
                    } else if (c4712m6.f39252a) {
                        c4712m6.f39254c = i39;
                        c4712m6.f39257f = true;
                        ((LinearLayout.LayoutParams) c4712m6).rightMargin = (-i39) / 2;
                        z20 = true;
                    } else {
                        if (i40 != 0) {
                            ((LinearLayout.LayoutParams) c4712m6).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c4712m6).rightMargin = i39 / 2;
                        }
                    }
                }
            }
            z15 = z20;
        }
        if (z15) {
            for (int i41 = 0; i41 < childCount2; i41++) {
                View childAt4 = getChildAt(i41);
                C4712m c4712m7 = (C4712m) childAt4.getLayoutParams();
                if (c4712m7.f39257f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c4712m7.f39253b * i29) + c4712m7.f39254c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, mode != 1073741824 ? i9 : i27);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f4530M.J = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC4714n interfaceC4714n) {
        this.f4537T = interfaceC4714n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C4708k c4708k = this.f4530M;
        C4706j c4706j = c4708k.f39227B;
        if (c4706j != null) {
            c4706j.setImageDrawable(drawable);
        } else {
            c4708k.f39229D = true;
            c4708k.f39228C = drawable;
        }
    }

    public void setOverflowReserved(boolean z6) {
        this.f4529L = z6;
    }

    public void setPopupTheme(int i) {
        if (this.f4528K != i) {
            this.f4528K = i;
            if (i == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C4708k c4708k) {
        this.f4530M = c4708k;
        c4708k.f39226A = this;
        this.f4527I = c4708k.f39243v;
    }

    @Override // m.AbstractC4728u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4712m(getContext(), attributeSet);
    }
}
