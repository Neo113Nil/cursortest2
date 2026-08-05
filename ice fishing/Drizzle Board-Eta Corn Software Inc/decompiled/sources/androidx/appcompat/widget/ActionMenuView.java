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
import defpackage.B1cjorwa;
import defpackage.CTE3lpUp;
import defpackage.D4B4MtvK;
import defpackage.N2kLh4D5;
import defpackage.X1t0wlBd;
import defpackage.ap;
import defpackage.bp;
import defpackage.cs;
import defpackage.f7oeun2L;
import defpackage.fh0;
import defpackage.re;
import defpackage.rs;
import defpackage.tg0;
import defpackage.vc0;
import defpackage.xr;
import defpackage.yr;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ActionMenuView extends bp implements xr, rs {
    public final int DK9slbsy;
    public boolean Ey6iv0m0;
    public boolean FySoLYna;
    public CTE3lpUp I5GHvsYW;
    public int KlHjfFWx;
    public yr OxcuoDLp;
    public vc0 RXQxj5Oe;
    public final int WYNAV5pd;
    public Context amk52bBQ;
    public int gjV1z5T1;
    public D4B4MtvK lwWCatUu;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.WYNAV5pd = (int) (56.0f * f);
        this.DK9slbsy = (int) (f * 4.0f);
        this.amk52bBQ = context;
        this.KlHjfFWx = 0;
    }

    public static X1t0wlBd eVhOlqcC(ViewGroup.LayoutParams layoutParams) {
        X1t0wlBd x1t0wlBd;
        if (layoutParams == null) {
            return jb9XjC4I();
        }
        if (layoutParams instanceof X1t0wlBd) {
            X1t0wlBd x1t0wlBd2 = (X1t0wlBd) layoutParams;
            x1t0wlBd = new X1t0wlBd(x1t0wlBd2);
            x1t0wlBd.qoPGr6Ce = x1t0wlBd2.qoPGr6Ce;
        } else {
            x1t0wlBd = new X1t0wlBd(layoutParams);
        }
        if (((LinearLayout.LayoutParams) x1t0wlBd).gravity <= 0) {
            ((LinearLayout.LayoutParams) x1t0wlBd).gravity = 16;
        }
        return x1t0wlBd;
    }

    public static X1t0wlBd jb9XjC4I() {
        X1t0wlBd x1t0wlBd = new X1t0wlBd(-2, -2);
        x1t0wlBd.qoPGr6Ce = false;
        ((LinearLayout.LayoutParams) x1t0wlBd).gravity = 16;
        return x1t0wlBd;
    }

    @Override // defpackage.rs
    public final void NCTxEWno(yr yrVar) {
        this.OxcuoDLp = yrVar;
    }

    @Override // defpackage.bp
    /* renamed from: P7K7Inc8 */
    public final ap generateLayoutParams(AttributeSet attributeSet) {
        return new X1t0wlBd(getContext(), attributeSet);
    }

    @Override // defpackage.bp
    /* renamed from: VgvYg0wo */
    public final /* bridge */ /* synthetic */ ap generateDefaultLayoutParams() {
        return jb9XjC4I();
    }

    @Override // defpackage.bp
    /* renamed from: b2ZJblxo */
    public final /* bridge */ /* synthetic */ ap generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return eVhOlqcC(layoutParams);
    }

    @Override // defpackage.bp, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof X1t0wlBd;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.bp, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return jb9XjC4I();
    }

    @Override // defpackage.bp, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new X1t0wlBd(getContext(), attributeSet);
    }

    public Menu getMenu() {
        yr yrVar = this.OxcuoDLp;
        if (yrVar != null) {
            return yrVar;
        }
        Context context = getContext();
        yr yrVar2 = new yr(context);
        this.OxcuoDLp = yrVar2;
        yrVar2.VgvYg0wo = new tg0(3, this);
        CTE3lpUp cTE3lpUp = new CTE3lpUp(context);
        this.I5GHvsYW = cTE3lpUp;
        cTE3lpUp.ygLcUYwZ = true;
        cTE3lpUp.lDXGDhIF = true;
        cTE3lpUp.P7K7Inc8 = new re(8);
        this.OxcuoDLp.NCTxEWno(cTE3lpUp, this.amk52bBQ);
        CTE3lpUp cTE3lpUp2 = this.I5GHvsYW;
        cTE3lpUp2.jb9XjC4I = this;
        yr yrVar3 = cTE3lpUp2.wxUZMvaN;
        this.OxcuoDLp = yrVar3;
        return yrVar3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        CTE3lpUp cTE3lpUp = this.I5GHvsYW;
        N2kLh4D5 n2kLh4D5 = cTE3lpUp.k3x7lurq;
        if (n2kLh4D5 != null) {
            return n2kLh4D5.getDrawable();
        }
        if (cTE3lpUp.OnDfzHZD) {
            return cTE3lpUp.ow5vqvCr;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.KlHjfFWx;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k3x7lurq(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof B1cjorwa)) {
            z = ((B1cjorwa) childAt).NCTxEWno();
        }
        return (i <= 0 || !(childAt2 instanceof B1cjorwa)) ? z : ((B1cjorwa) childAt2).MdtA4re8() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CTE3lpUp cTE3lpUp = this.I5GHvsYW;
        if (cTE3lpUp != null) {
            cTE3lpUp.eVhOlqcC(false);
            if (this.I5GHvsYW.jb9XjC4I()) {
                this.I5GHvsYW.wxUZMvaN();
                this.I5GHvsYW.ygLcUYwZ();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CTE3lpUp cTE3lpUp = this.I5GHvsYW;
        if (cTE3lpUp != null) {
            cTE3lpUp.wxUZMvaN();
            f7oeun2L f7oeun2l = cTE3lpUp.RXQxj5Oe;
            if (f7oeun2l == null || !f7oeun2l.NCTxEWno()) {
                return;
            }
            f7oeun2l.jb9XjC4I.dismiss();
        }
    }

    @Override // defpackage.bp, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.FySoLYna) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = fh0.qoPGr6Ce;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                X1t0wlBd x1t0wlBd = (X1t0wlBd) childAt.getLayoutParams();
                if (x1t0wlBd.qoPGr6Ce) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k3x7lurq(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) x1t0wlBd).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) x1t0wlBd).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) x1t0wlBd).leftMargin) + ((LinearLayout.LayoutParams) x1t0wlBd).rightMargin;
                    k3x7lurq(i10);
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
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                X1t0wlBd x1t0wlBd2 = (X1t0wlBd) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !x1t0wlBd2.qoPGr6Ce) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) x1t0wlBd2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) x1t0wlBd2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            X1t0wlBd x1t0wlBd3 = (X1t0wlBd) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !x1t0wlBd3.qoPGr6Ce) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) x1t0wlBd3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) x1t0wlBd3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.bp, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        yr yrVar;
        boolean z = this.FySoLYna;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.FySoLYna = z2;
        if (z != z2) {
            this.gjV1z5T1 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.FySoLYna && (yrVar = this.OxcuoDLp) != null && size != this.gjV1z5T1) {
            this.gjV1z5T1 = size;
            yrVar.sjUBp5pO(true);
        }
        int childCount = getChildCount();
        if (!this.FySoLYna || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                X1t0wlBd x1t0wlBd = (X1t0wlBd) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) x1t0wlBd).rightMargin = 0;
                ((LinearLayout.LayoutParams) x1t0wlBd).leftMargin = 0;
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
        int i9 = this.WYNAV5pd;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.DK9slbsy;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                X1t0wlBd x1t0wlBd2 = (X1t0wlBd) childAt.getLayoutParams();
                x1t0wlBd2.P7K7Inc8 = false;
                x1t0wlBd2.MdtA4re8 = 0;
                x1t0wlBd2.NCTxEWno = 0;
                x1t0wlBd2.wxUZMvaN = false;
                ((LinearLayout.LayoutParams) x1t0wlBd2).leftMargin = 0;
                ((LinearLayout.LayoutParams) x1t0wlBd2).rightMargin = 0;
                x1t0wlBd2.VgvYg0wo = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = x1t0wlBd2.qoPGr6Ce ? 1 : i10;
                X1t0wlBd x1t0wlBd3 = (X1t0wlBd) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                x1t0wlBd3.wxUZMvaN = !x1t0wlBd3.qoPGr6Ce && z6;
                x1t0wlBd3.NCTxEWno = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (x1t0wlBd2.wxUZMvaN) {
                    i17++;
                }
                if (x1t0wlBd2.qoPGr6Ce) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                X1t0wlBd x1t0wlBd4 = (X1t0wlBd) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (x1t0wlBd4.wxUZMvaN) {
                    int i30 = x1t0wlBd4.NCTxEWno;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                X1t0wlBd x1t0wlBd5 = (X1t0wlBd) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && x1t0wlBd5.VgvYg0wo) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    x1t0wlBd5.NCTxEWno += r11;
                    x1t0wlBd5.P7K7Inc8 = r11;
                    i25--;
                } else if (x1t0wlBd5.NCTxEWno == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((X1t0wlBd) getChildAt(0).getLayoutParams()).VgvYg0wo) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((X1t0wlBd) getChildAt(i33).getLayoutParams()).VgvYg0wo) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    X1t0wlBd x1t0wlBd6 = (X1t0wlBd) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        x1t0wlBd6.MdtA4re8 = i34;
                        x1t0wlBd6.P7K7Inc8 = true;
                        if (i35 == 0 && !x1t0wlBd6.VgvYg0wo) {
                            ((LinearLayout.LayoutParams) x1t0wlBd6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (x1t0wlBd6.qoPGr6Ce) {
                        x1t0wlBd6.MdtA4re8 = i34;
                        x1t0wlBd6.P7K7Inc8 = true;
                        ((LinearLayout.LayoutParams) x1t0wlBd6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) x1t0wlBd6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) x1t0wlBd6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                X1t0wlBd x1t0wlBd7 = (X1t0wlBd) childAt4.getLayoutParams();
                if (x1t0wlBd7.P7K7Inc8) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((x1t0wlBd7.NCTxEWno * i24) + x1t0wlBd7.MdtA4re8, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    @Override // defpackage.xr
    public final boolean qoPGr6Ce(cs csVar) {
        return this.OxcuoDLp.OxcuoDLp(csVar, null, 0);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.I5GHvsYW.KlHjfFWx = z;
    }

    public void setOnMenuItemClickListener(D4B4MtvK d4B4MtvK) {
        this.lwWCatUu = d4B4MtvK;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        CTE3lpUp cTE3lpUp = this.I5GHvsYW;
        N2kLh4D5 n2kLh4D5 = cTE3lpUp.k3x7lurq;
        if (n2kLh4D5 != null) {
            n2kLh4D5.setImageDrawable(drawable);
        } else {
            cTE3lpUp.OnDfzHZD = true;
            cTE3lpUp.ow5vqvCr = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.Ey6iv0m0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.KlHjfFWx != i) {
            this.KlHjfFWx = i;
            if (i == 0) {
                this.amk52bBQ = getContext();
            } else {
                this.amk52bBQ = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(CTE3lpUp cTE3lpUp) {
        this.I5GHvsYW = cTE3lpUp;
        cTE3lpUp.jb9XjC4I = this;
        this.OxcuoDLp = cTE3lpUp.wxUZMvaN;
    }

    @Override // defpackage.bp, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return eVhOlqcC(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
