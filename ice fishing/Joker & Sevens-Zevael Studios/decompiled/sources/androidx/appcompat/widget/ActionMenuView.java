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
import l.g;
import l.h;
import m.f;
import m.h0;
import m.i;
import m.i0;
import m.j;
import m.k;
import m.l;
import m.v1;
import u7.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ActionMenuView extends i0 implements g {
    public int A;
    public final int B;
    public final int C;
    public l D;

    /* renamed from: v, reason: collision with root package name */
    public h f422v;

    /* renamed from: w, reason: collision with root package name */
    public Context f423w;

    /* renamed from: x, reason: collision with root package name */
    public int f424x;

    /* renamed from: y, reason: collision with root package name */
    public i f425y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f426z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B = (int) (56.0f * f10);
        this.C = (int) (f10 * 4.0f);
        this.f423w = context;
        this.f424x = 0;
    }

    public static k h() {
        k kVar = new k(-2, -2);
        kVar.f4369a = false;
        ((LinearLayout.LayoutParams) kVar).gravity = 16;
        return kVar;
    }

    public static k i(ViewGroup.LayoutParams layoutParams) {
        k kVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof k) {
            k kVar2 = (k) layoutParams;
            kVar = new k(kVar2);
            kVar.f4369a = kVar2.f4369a;
        } else {
            kVar = new k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) kVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) kVar).gravity = 16;
        }
        return kVar;
    }

    @Override // l.g
    public final boolean a(l.i iVar) {
        return this.f422v.p(iVar, null, 0);
    }

    @Override // m.i0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof k;
    }

    @Override // m.i0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ h0 generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.i0
    /* renamed from: e */
    public final h0 generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    @Override // m.i0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ h0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // m.i0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // m.i0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f422v == null) {
            Context context = getContext();
            h hVar = new h(context);
            this.f422v = hVar;
            hVar.f3694e = new f8.c(26, this);
            i iVar = new i(context);
            this.f425y = iVar;
            iVar.f4322q = true;
            iVar.f4323r = true;
            iVar.f4316k = new d();
            this.f422v.b(iVar, this.f423w);
            i iVar2 = this.f425y;
            iVar2.f4318m = this;
            this.f422v = iVar2.f4314i;
        }
        return this.f422v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        i iVar = this.f425y;
        m.h hVar = iVar.f4319n;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.f4321p) {
            return iVar.f4320o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f424x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof j)) {
            z10 = ((j) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof j)) ? z10 : ((j) childAt2).c() | z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.f425y;
        if (iVar != null) {
            iVar.c();
            f fVar = this.f425y.f4329x;
            if (fVar == null || !fVar.b()) {
                return;
            }
            this.f425y.d();
            this.f425y.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f425y;
        if (iVar != null) {
            iVar.d();
            f fVar = iVar.f4330y;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f3746i.dismiss();
        }
    }

    @Override // m.i0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f426z) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a6 = v1.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                k kVar = (k) childAt.getLayoutParams();
                if (kVar.f4369a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a6) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    j(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                k kVar2 = (k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.f4369a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            k kVar3 = (k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.f4369a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.i0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        h hVar;
        boolean z10 = this.f426z;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f426z = z11;
        if (z10 != z11) {
            this.A = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f426z && (hVar = this.f422v) != null && size != this.A) {
            this.A = size;
            hVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f426z || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                k kVar = (k) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.B;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z12 = false;
        int i26 = 0;
        long j3 = 0;
        while (true) {
            i12 = this.C;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i23++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                k kVar2 = (k) childAt.getLayoutParams();
                kVar2.f4374f = false;
                kVar2.f4371c = 0;
                kVar2.f4370b = 0;
                kVar2.f4372d = false;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                kVar2.f4373e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i29 = kVar2.f4369a ? 1 : i19;
                k kVar3 = (k) childAt.getLayoutParams();
                int i30 = i19;
                i14 = i21;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i29 <= 0 || (z14 && i29 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i29, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                kVar3.f4372d = !kVar3.f4369a && z15;
                kVar3.f4370b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), makeMeasureSpec);
                i24 = Math.max(i24, i15);
                if (kVar2.f4372d) {
                    i26++;
                }
                if (kVar2.f4369a) {
                    z12 = true;
                }
                i19 = i30 - i15;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j3 |= 1 << i25;
                }
            }
            i25++;
            size3 = i27;
            paddingBottom = i28;
            i21 = i14;
        }
        int i31 = size3;
        int i32 = i19;
        int i33 = i21;
        boolean z16 = z12 && i23 == 2;
        int i34 = i32;
        boolean z17 = false;
        while (i26 > 0 && i34 > 0) {
            int i35 = Integer.MAX_VALUE;
            long j6 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i37 < childCount2) {
                int i38 = i22;
                k kVar4 = (k) getChildAt(i37).getLayoutParams();
                boolean z18 = z16;
                if (kVar4.f4372d) {
                    int i39 = kVar4.f4370b;
                    if (i39 < i35) {
                        j6 = 1 << i37;
                        i35 = i39;
                        i36 = 1;
                    } else if (i39 == i35) {
                        j6 |= 1 << i37;
                        i36++;
                    }
                }
                i37++;
                z16 = z18;
                i22 = i38;
            }
            i13 = i22;
            boolean z19 = z16;
            j3 |= j6;
            if (i36 > i34) {
                break;
            }
            int i40 = i35 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                k kVar5 = (k) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j10 = 1 << i41;
                if ((j6 & j10) != 0) {
                    if (z19 && kVar5.f4373e) {
                        r11 = 1;
                        r11 = 1;
                        if (i34 == 1) {
                            childAt2.setPadding(i12 + i33, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar5.f4370b += r11;
                    kVar5.f4374f = r11;
                    i34--;
                } else if (kVar5.f4370b == i40) {
                    j3 |= j10;
                }
                i41++;
                z12 = z20;
            }
            z16 = z19;
            i22 = i13;
            z17 = true;
        }
        i13 = i22;
        boolean z21 = !z12 && i23 == 1;
        if (i34 > 0 && j3 != 0 && (i34 < i23 - 1 || z21 || i24 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z21) {
                if ((j3 & 1) != 0 && !((k) getChildAt(0).getLayoutParams()).f4373e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j3 & (1 << i42)) != 0 && !((k) getChildAt(i42).getLayoutParams()).f4373e) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i34 * i33) / bitCount) : 0;
            boolean z22 = z17;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j3 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    k kVar6 = (k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar6.f4371c = i43;
                        kVar6.f4374f = true;
                        if (i44 == 0 && !kVar6.f4373e) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = (-i43) / 2;
                        }
                        z22 = true;
                    } else if (kVar6.f4369a) {
                        kVar6.f4371c = i43;
                        kVar6.f4374f = true;
                        ((LinearLayout.LayoutParams) kVar6).rightMargin = (-i43) / 2;
                        z22 = true;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) kVar6).leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar6).rightMargin = i43 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                k kVar7 = (k) childAt4.getLayoutParams();
                if (kVar7.f4374f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar7.f4370b * i33) + kVar7.f4371c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f425y.f4327v = z10;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.D = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        i iVar = this.f425y;
        m.h hVar = iVar.f4319n;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            iVar.f4321p = true;
            iVar.f4320o = drawable;
        }
    }

    public void setPopupTheme(int i10) {
        if (this.f424x != i10) {
            this.f424x = i10;
            if (i10 == 0) {
                this.f423w = getContext();
            } else {
                this.f423w = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(i iVar) {
        this.f425y = iVar;
        iVar.f4318m = this;
        this.f422v = iVar.f4314i;
    }

    @Override // m.i0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z10) {
    }
}
