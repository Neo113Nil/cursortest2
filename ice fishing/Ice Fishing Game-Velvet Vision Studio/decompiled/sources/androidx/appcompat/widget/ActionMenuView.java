package androidx.appcompat.widget;

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
import com.gamericefishpro.space.ka.f;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.m.h;
import com.gamericefishpro.space.m.i;
import com.gamericefishpro.space.m.j;
import com.gamericefishpro.space.n.a1;
import com.gamericefishpro.space.n.k;
import com.gamericefishpro.space.n.k2;
import com.gamericefishpro.space.n.l;
import com.gamericefishpro.space.n.z0;
import com.gamericefishpro.space.n.z1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends a1 implements h {
    public i I;
    public Context J;
    public int K;
    public com.gamericefishpro.space.n.i L;
    public z1 M;
    public boolean N;
    public int O;
    public final int P;
    public final int Q;
    public l R;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.P = (int) (56.0f * f);
        this.Q = (int) (f * 4.0f);
        this.J = context;
        this.K = 0;
    }

    public static k i() {
        k kVar = new k(-2, -2);
        kVar.a = false;
        ((LinearLayout.LayoutParams) kVar).gravity = 16;
        return kVar;
    }

    public static k j(ViewGroup.LayoutParams layoutParams) {
        k kVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof k) {
            k kVar2 = (k) layoutParams;
            kVar = new k(kVar2);
            kVar.a = kVar2.a;
        } else {
            kVar = new k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) kVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) kVar).gravity = 16;
        }
        return kVar;
    }

    @Override // com.gamericefishpro.space.m.h
    public final boolean b(j jVar) {
        return this.I.p(jVar, null, 0);
    }

    @Override // com.gamericefishpro.space.n.a1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.gamericefishpro.space.n.a1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ z0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // com.gamericefishpro.space.n.a1
    /* JADX INFO: renamed from: f */
    public final z0 generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    @Override // com.gamericefishpro.space.n.a1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // com.gamericefishpro.space.n.a1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // com.gamericefishpro.space.n.a1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.I == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.I = iVar;
            iVar.e = new d(6, this);
            com.gamericefishpro.space.n.i iVar2 = new com.gamericefishpro.space.n.i(context);
            this.L = iVar2;
            iVar2.D = true;
            iVar2.E = true;
            iVar2.w = new f(10);
            this.I.b(iVar2, this.J);
            com.gamericefishpro.space.n.i iVar3 = this.L;
            iVar3.z = this;
            this.I = iVar3.i;
        }
        return this.I;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        com.gamericefishpro.space.n.i iVar = this.L;
        com.gamericefishpro.space.n.h hVar = iVar.A;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.C) {
            return iVar.B;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof com.gamericefishpro.space.n.j)) {
            zB = ((com.gamericefishpro.space.n.j) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof com.gamericefishpro.space.n.j)) ? zB : ((com.gamericefishpro.space.n.j) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.gamericefishpro.space.n.i iVar = this.L;
        if (iVar != null) {
            iVar.c();
            com.gamericefishpro.space.n.f fVar = this.L.K;
            if (fVar == null || !fVar.b()) {
                return;
            }
            this.L.e();
            this.L.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.gamericefishpro.space.n.i iVar = this.L;
        if (iVar != null) {
            iVar.e();
            com.gamericefishpro.space.n.f fVar = iVar.L;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.i.dismiss();
        }
    }

    @Override // com.gamericefishpro.space.n.a1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.N) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = k2.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                k kVar = (k) childAt.getLayoutParams();
                if (kVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                k kVar2 = (k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            k kVar3 = (k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // com.gamericefishpro.space.n.a1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        i iVar;
        boolean z = this.N;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.N = z2;
        if (z != z2) {
            this.O = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.N && (iVar = this.I) != null && size != this.O) {
            this.O = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.N || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                k kVar = (k) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar).leftMargin = 0;
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
        int i8 = size2 - paddingRight;
        int i9 = this.P;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.Q;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                k kVar2 = (k) childAt.getLayoutParams();
                kVar2.f = false;
                kVar2.c = 0;
                kVar2.b = 0;
                kVar2.d = false;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                kVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = kVar2.a ? 1 : i10;
                k kVar3 = (k) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                kVar3.d = !kVar3.a && z6;
                kVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (kVar2.d) {
                    i15++;
                }
                if (kVar2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                k kVar4 = (k) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (kVar4.d) {
                    int i28 = kVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                k kVar5 = (k) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && kVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar5.b += r11;
                    kVar5.f = r11;
                    i23--;
                } else if (kVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((k) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((k) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    k kVar6 = (k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar6.c = i32;
                        kVar6.f = true;
                        if (i33 == 0 && !kVar6.e) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (kVar6.a) {
                        kVar6.c = i32;
                        kVar6.f = true;
                        ((LinearLayout.LayoutParams) kVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                k kVar7 = (k) childAt4.getLayoutParams();
                if (kVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar7.b * i22) + kVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.L.I = z;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.R = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        com.gamericefishpro.space.n.i iVar = this.L;
        com.gamericefishpro.space.n.h hVar = iVar.A;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            iVar.C = true;
            iVar.B = drawable;
        }
    }

    public void setPopupTheme(int i) {
        if (this.K != i) {
            this.K = i;
            if (i == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(com.gamericefishpro.space.n.i iVar) {
        this.L = iVar;
        iVar.z = this;
        this.I = iVar.i;
    }

    @Override // com.gamericefishpro.space.n.a1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z) {
    }
}
