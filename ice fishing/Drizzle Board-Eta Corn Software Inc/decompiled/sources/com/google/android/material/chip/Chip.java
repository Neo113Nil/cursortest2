package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.FOrSgJlm;
import defpackage.bc0;
import defpackage.c5;
import defpackage.cc0;
import defpackage.d5;
import defpackage.e5;
import defpackage.e70;
import defpackage.ec0;
import defpackage.f5;
import defpackage.fn;
import defpackage.g5;
import defpackage.gt;
import defpackage.hg0;
import defpackage.i2;
import defpackage.le0;
import defpackage.m1;
import defpackage.or;
import defpackage.q30;
import defpackage.ra;
import defpackage.t60;
import defpackage.w30;
import defpackage.y00;
import defpackage.y30;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class Chip extends FOrSgJlm implements f5, e70, Checkable {
    public boolean Ey6iv0m0;
    public final c5 FySoLYna;
    public final Rect I5GHvsYW;
    public final e5 KlHjfFWx;
    public boolean OnDfzHZD;
    public int OxcuoDLp;
    public g5 P7K7Inc8;
    public RippleDrawable Qr9iLBAD;
    public final RectF RXQxj5Oe;
    public CharSequence amk52bBQ;
    public InsetDrawable b2ZJblxo;
    public CompoundButton.OnCheckedChangeListener eVhOlqcC;
    public View.OnClickListener jb9XjC4I;
    public boolean k3x7lurq;
    public boolean lDXGDhIF;
    public boolean ow5vqvCr;
    public int sjUBp5pO;
    public boolean ygLcUYwZ;
    public static final Rect gjV1z5T1 = new Rect();
    public static final int[] WYNAV5pd = {R.attr.state_selected};
    public static final int[] DK9slbsy = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.kolosta.rejin.jilosa.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.I5GHvsYW = new Rect();
        this.RXQxj5Oe = new RectF();
        this.FySoLYna = new c5(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                m1.b2ZJblxo("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                m1.b2ZJblxo("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        g5 g5Var = new g5(context2, attributeSet);
        Context context3 = g5Var.N2kLh4D5;
        int[] iArr = y00.P7K7Inc8;
        TypedArray FySoLYna = fn.FySoLYna(context3, attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        g5Var.FzsqRtM7 = FySoLYna.hasValue(39);
        Context context4 = g5Var.N2kLh4D5;
        ColorStateList gjV1z5T12 = w30.gjV1z5T1(context4, FySoLYna, 25);
        if (g5Var.eIA6dogk != gjV1z5T12) {
            g5Var.eIA6dogk = gjV1z5T12;
            g5Var.onStateChange(g5Var.getState());
        }
        ColorStateList gjV1z5T13 = w30.gjV1z5T1(context4, FySoLYna, 12);
        if (g5Var.pRiPUEwG != gjV1z5T13) {
            g5Var.pRiPUEwG = gjV1z5T13;
            g5Var.onStateChange(g5Var.getState());
        }
        float dimension = FySoLYna.getDimension(20, 0.0f);
        if (g5Var.VhgXwMj9 != dimension) {
            g5Var.VhgXwMj9 = dimension;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        if (FySoLYna.hasValue(13)) {
            g5Var.Xkz7p5xa(FySoLYna.getDimension(13, 0.0f));
        }
        g5Var.nSmgoSB5(w30.gjV1z5T1(context4, FySoLYna, 23));
        g5Var.N8VPGzVC(FySoLYna.getDimension(24, 0.0f));
        g5Var.LfKQckgD(w30.gjV1z5T1(context4, FySoLYna, 38));
        String text = FySoLYna.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(g5Var.zCflySGU, text);
        ec0 ec0Var = g5Var.D4B4MtvK;
        if (!equals) {
            g5Var.zCflySGU = text;
            ec0Var.VgvYg0wo = true;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        bc0 bc0Var = (!FySoLYna.hasValue(0) || (resourceId3 = FySoLYna.getResourceId(0, 0)) == 0) ? null : new bc0(context4, resourceId3);
        bc0Var.ow5vqvCr = FySoLYna.getDimension(1, bc0Var.ow5vqvCr);
        if (Build.VERSION.SDK_INT >= 26) {
            int i = FySoLYna.hasValue(34) ? 34 : 7;
            if (FySoLYna.hasValue(i)) {
                bc0Var.MdtA4re8 = FySoLYna.getString(i);
            }
        }
        ec0Var.NCTxEWno(bc0Var, context4);
        int i2 = FySoLYna.getInt(3, 0);
        if (i2 == 1) {
            g5Var.rAaHqhFJ = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            g5Var.rAaHqhFJ = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            g5Var.rAaHqhFJ = TextUtils.TruncateAt.END;
        }
        g5Var.FXJmAAN1(FySoLYna.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            g5Var.FXJmAAN1(FySoLYna.getBoolean(16, false));
        }
        g5Var.fVMzMhyS(w30.DK9slbsy(context4, FySoLYna, 15));
        if (FySoLYna.hasValue(18)) {
            g5Var.zCflySGU(w30.gjV1z5T1(context4, FySoLYna, 18));
        }
        g5Var.hzgxAD8d(FySoLYna.getDimension(17, -1.0f));
        g5Var.g2aRJUAd(FySoLYna.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            g5Var.g2aRJUAd(FySoLYna.getBoolean(27, false));
        }
        g5Var.HdOGZAzC(w30.DK9slbsy(context4, FySoLYna, 26));
        g5Var.TrssYQ34(w30.gjV1z5T1(context4, FySoLYna, 31));
        g5Var.bvfAo0eO(FySoLYna.getDimension(29, 0.0f));
        g5Var.eIA6dogk(FySoLYna.getBoolean(6, false));
        g5Var.aZz0PFXp(FySoLYna.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            g5Var.aZz0PFXp(FySoLYna.getBoolean(9, false));
        }
        g5Var.pRiPUEwG(w30.DK9slbsy(context4, FySoLYna, 8));
        if (FySoLYna.hasValue(10)) {
            g5Var.VhgXwMj9(w30.gjV1z5T1(context4, FySoLYna, 10));
        }
        g5Var.Sjrx9cEN = (!FySoLYna.hasValue(41) || (resourceId2 = FySoLYna.getResourceId(41, 0)) == 0) ? null : gt.qoPGr6Ce(context4, resourceId2);
        g5Var.LvHlPNBd = (!FySoLYna.hasValue(35) || (resourceId = FySoLYna.getResourceId(35, 0)) == 0) ? null : gt.qoPGr6Ce(context4, resourceId);
        float dimension2 = FySoLYna.getDimension(22, 0.0f);
        if (g5Var.hGvurcGl != dimension2) {
            g5Var.hGvurcGl = dimension2;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        g5Var.VGmz0ccI(FySoLYna.getDimension(37, 0.0f));
        g5Var.ESscZ9M1(FySoLYna.getDimension(36, 0.0f));
        float dimension3 = FySoLYna.getDimension(43, 0.0f);
        if (g5Var.orhfF2Ya != dimension3) {
            g5Var.orhfF2Ya = dimension3;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        float dimension4 = FySoLYna.getDimension(42, 0.0f);
        if (g5Var.dHozS53r != dimension4) {
            g5Var.dHozS53r = dimension4;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        g5Var.KRabZ4CU(FySoLYna.getDimension(30, 0.0f));
        g5Var.ZyZthT5G(FySoLYna.getDimension(28, 0.0f));
        float dimension5 = FySoLYna.getDimension(14, 0.0f);
        if (g5Var.XrPeKzBk != dimension5) {
            g5Var.XrPeKzBk = dimension5;
            g5Var.invalidateSelf();
            g5Var.SgZGMMPL();
        }
        g5Var.T8ZRPPeH = FySoLYna.getDimensionPixelSize(4, Integer.MAX_VALUE);
        FySoLYna.recycle();
        fn.NCTxEWno(context2, attributeSet, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action);
        fn.wxUZMvaN(context2, attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action);
        this.lDXGDhIF = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue SgZGMMPL = ra.SgZGMMPL(theme, com.kolosta.rejin.jilosa.R.attr.minTouchTargetSize);
        this.OxcuoDLp = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((SgZGMMPL == null || SgZGMMPL.type != 5) ? Float.NaN : SgZGMMPL.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.kolosta.rejin.jilosa.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(g5Var);
        g5Var.sjUBp5pO(getElevation());
        fn.NCTxEWno(context2, attributeSet, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action);
        fn.wxUZMvaN(context2, attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.kolosta.rejin.jilosa.R.attr.chipStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.KlHjfFWx = new e5(this, this);
        wxUZMvaN();
        if (!hasValue) {
            setOutlineProvider(new d5(this));
        }
        setChecked(this.k3x7lurq);
        setText(g5Var.zCflySGU);
        setEllipsize(g5Var.rAaHqhFJ);
        b2ZJblxo();
        if (!this.P7K7Inc8.QKkyGhhI) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        P7K7Inc8();
        if (this.lDXGDhIF) {
            setMinHeight(this.OxcuoDLp);
        }
        this.sjUBp5pO = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Rect rect = Chip.gjV1z5T1;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.eVhOlqcC;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.RXQxj5Oe;
        rectF.setEmpty();
        if (MdtA4re8() && this.jb9XjC4I != null) {
            g5 g5Var = this.P7K7Inc8;
            Rect bounds = g5Var.getBounds();
            rectF.setEmpty();
            if (g5Var.Sjrx9cEN()) {
                float f = g5Var.XrPeKzBk + g5Var.uQ3KJUK5 + g5Var.g2aRJUAd + g5Var.f7oeun2L + g5Var.dHozS53r;
                if (g5Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.I5GHvsYW;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private bc0 getTextAppearance() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.D4B4MtvK.b2ZJblxo;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.OnDfzHZD != z) {
            this.OnDfzHZD = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.ow5vqvCr != z) {
            this.ow5vqvCr = z;
            refreshDrawableState();
        }
    }

    public final boolean MdtA4re8() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null) {
            return false;
        }
        Drawable drawable = g5Var.KRabZ4CU;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void NCTxEWno(int i) {
        this.OxcuoDLp = i;
        if (!this.lDXGDhIF) {
            InsetDrawable insetDrawable = this.b2ZJblxo;
            if (insetDrawable == null) {
                VgvYg0wo();
                return;
            } else {
                if (insetDrawable != null) {
                    this.b2ZJblxo = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    VgvYg0wo();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.P7K7Inc8.VhgXwMj9));
        int max2 = Math.max(0, i - this.P7K7Inc8.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.b2ZJblxo;
            if (insetDrawable2 == null) {
                VgvYg0wo();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.b2ZJblxo = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    VgvYg0wo();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.b2ZJblxo != null) {
            Rect rect = new Rect();
            this.b2ZJblxo.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                VgvYg0wo();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.b2ZJblxo = new InsetDrawable((Drawable) this.P7K7Inc8, i2, i3, i2, i3);
        VgvYg0wo();
    }

    public final void P7K7Inc8() {
        g5 g5Var;
        if (TextUtils.isEmpty(getText()) || (g5Var = this.P7K7Inc8) == null) {
            return;
        }
        int U0LaHZX7 = (int) (g5Var.U0LaHZX7() + g5Var.XrPeKzBk + g5Var.dHozS53r);
        g5 g5Var2 = this.P7K7Inc8;
        int lwWCatUu = (int) (g5Var2.lwWCatUu() + g5Var2.hGvurcGl + g5Var2.orhfF2Ya);
        if (this.b2ZJblxo != null) {
            Rect rect = new Rect();
            this.b2ZJblxo.getPadding(rect);
            lwWCatUu += rect.left;
            U0LaHZX7 += rect.right;
        }
        setPaddingRelative(lwWCatUu, getPaddingTop(), U0LaHZX7, getPaddingBottom());
    }

    public final void VgvYg0wo() {
        RippleDrawable rippleDrawable = new RippleDrawable(q30.NCTxEWno(this.P7K7Inc8.hzgxAD8d), getBackgroundDrawable(), null);
        FocusRingDrawable.VgvYg0wo(getContext(), rippleDrawable, this.P7K7Inc8);
        this.Qr9iLBAD = rippleDrawable;
        this.P7K7Inc8.getClass();
        setBackground(this.Qr9iLBAD);
        P7K7Inc8();
    }

    public final void b2ZJblxo() {
        TextPaint paint = getPaint();
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            paint.drawableState = g5Var.getState();
        }
        bc0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.MdtA4re8(getContext(), paint, this.FySoLYna);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.Ey6iv0m0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        e5 e5Var = this.KlHjfFWx;
        AccessibilityManager accessibilityManager = e5Var.Qr9iLBAD;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = e5Var.ygLcUYwZ;
                if (chip.MdtA4re8() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = e5Var.OnDfzHZD;
                if (i3 != i2) {
                    e5Var.OnDfzHZD = i2;
                    e5Var.OxcuoDLp(i2, 128);
                    e5Var.OxcuoDLp(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = e5Var.OnDfzHZD) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    e5Var.OnDfzHZD = Integer.MIN_VALUE;
                    e5Var.OxcuoDLp(Integer.MIN_VALUE, 128);
                    e5Var.OxcuoDLp(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.Ey6iv0m0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        e5 e5Var = this.KlHjfFWx;
        e5Var.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && e5Var.OnDfzHZD(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = e5Var.ow5vqvCr;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = e5Var.ygLcUYwZ;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.jb9XjC4I;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.Ey6iv0m0) {
                                chip.KlHjfFWx.OxcuoDLp(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = e5Var.OnDfzHZD(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = e5Var.OnDfzHZD(1, null);
            }
        }
        if (!z || e5Var.ow5vqvCr == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.FOrSgJlm, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g5 g5Var = this.P7K7Inc8;
        boolean z = false;
        int i = 0;
        z = false;
        if (g5Var != null && g5.euDDoUNr(g5Var.KRabZ4CU)) {
            g5 g5Var2 = this.P7K7Inc8;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.ygLcUYwZ) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.OnDfzHZD) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.ow5vqvCr) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.ygLcUYwZ) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.OnDfzHZD) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.ow5vqvCr) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = g5Var2.gmkaJpmS(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.amk52bBQ)) {
            return this.amk52bBQ;
        }
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || !g5Var.VGmz0ccI) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.b2ZJblxo;
        return insetDrawable == null ? this.P7K7Inc8 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.pP9Y2m6O;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.tef3qNMP;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.pRiPUEwG;
        }
        return null;
    }

    public float getChipCornerRadius() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return Math.max(0.0f, g5Var.i7xS8jrb());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.P7K7Inc8;
    }

    public float getChipEndPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.XrPeKzBk;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || (drawable = g5Var.nSmgoSB5) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.HdOGZAzC;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.N8VPGzVC;
        }
        return null;
    }

    public float getChipMinHeight() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.VhgXwMj9;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.hGvurcGl;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.Xkz7p5xa;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.fVMzMhyS;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || (drawable = g5Var.KRabZ4CU) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.ESscZ9M1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.uQ3KJUK5;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.g2aRJUAd;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.f7oeun2L;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.TrssYQ34;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.rAaHqhFJ;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.Ey6iv0m0) {
            e5 e5Var = this.KlHjfFWx;
            if (e5Var.ow5vqvCr == 1 || e5Var.k3x7lurq == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null) {
            return super.getFontVariationSettings();
        }
        bc0 bc0Var = g5Var.D4B4MtvK.b2ZJblxo;
        if (bc0Var == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return bc0Var.MdtA4re8;
    }

    public gt getHideMotionSpec() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.LvHlPNBd;
        }
        return null;
    }

    public float getIconEndPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.QT4Tf9Dt;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.Wi7iiXC4;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.hzgxAD8d;
        }
        return null;
    }

    public t60 getShapeAppearanceModel() {
        return this.P7K7Inc8.Qr9iLBAD();
    }

    public gt getShowMotionSpec() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.Sjrx9cEN;
        }
        return null;
    }

    public float getTextEndPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.dHozS53r;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            return g5Var.orhfF2Ya;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        le0.Xkz7p5xa(this, this.P7K7Inc8);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, WYNAV5pd);
        }
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null && g5Var.VGmz0ccI) {
            View.mergeDrawableStates(onCreateDrawableState, DK9slbsy);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.Ey6iv0m0) {
            e5 e5Var = this.KlHjfFWx;
            int i2 = e5Var.ow5vqvCr;
            if (i2 != Integer.MIN_VALUE) {
                e5Var.eVhOlqcC(i2);
            }
            if (z) {
                e5Var.OnDfzHZD(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        g5 g5Var = this.P7K7Inc8;
        accessibilityNodeInfo.setCheckable(g5Var != null && g5Var.VGmz0ccI);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.sjUBp5pO != i) {
            this.sjUBp5pO = i;
            P7K7Inc8();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.ow5vqvCr) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.ow5vqvCr) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.jb9XjC4I;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.Ey6iv0m0) {
                    this.KlHjfFWx.OxcuoDLp(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.amk52bBQ = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.Qr9iLBAD) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.FOrSgJlm, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.Qr9iLBAD) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.FOrSgJlm, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.eIA6dogk(z);
        }
    }

    public void setCheckableResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.eIA6dogk(g5Var.N2kLh4D5.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null) {
            this.k3x7lurq = z;
        } else if (g5Var.VGmz0ccI) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.pRiPUEwG(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.pRiPUEwG(ra.Ey6iv0m0(g5Var.N2kLh4D5, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.VhgXwMj9(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.VhgXwMj9(w30.RXQxj5Oe(g5Var.N2kLh4D5, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.aZz0PFXp(g5Var.N2kLh4D5.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.pRiPUEwG == colorStateList) {
            return;
        }
        g5Var.pRiPUEwG = colorStateList;
        g5Var.onStateChange(g5Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList RXQxj5Oe;
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.pRiPUEwG == (RXQxj5Oe = w30.RXQxj5Oe(g5Var.N2kLh4D5, i))) {
            return;
        }
        g5Var.pRiPUEwG = RXQxj5Oe;
        g5Var.onStateChange(g5Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.Xkz7p5xa(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.Xkz7p5xa(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(g5 g5Var) {
        g5 g5Var2 = this.P7K7Inc8;
        if (g5Var2 != g5Var) {
            if (g5Var2 != null) {
                g5Var2.a3AMA6yV = new WeakReference(null);
            }
            this.P7K7Inc8 = g5Var;
            g5Var.QKkyGhhI = false;
            g5Var.a3AMA6yV = new WeakReference(this);
            NCTxEWno(this.OxcuoDLp);
        }
    }

    public void setChipEndPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.XrPeKzBk == f) {
            return;
        }
        g5Var.XrPeKzBk = f;
        g5Var.invalidateSelf();
        g5Var.SgZGMMPL();
    }

    public void setChipEndPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float dimension = g5Var.N2kLh4D5.getResources().getDimension(i);
            if (g5Var.XrPeKzBk != dimension) {
                g5Var.XrPeKzBk = dimension;
                g5Var.invalidateSelf();
                g5Var.SgZGMMPL();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.fVMzMhyS(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.fVMzMhyS(ra.Ey6iv0m0(g5Var.N2kLh4D5, i));
        }
    }

    public void setChipIconSize(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.hzgxAD8d(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.hzgxAD8d(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.zCflySGU(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.zCflySGU(w30.RXQxj5Oe(g5Var.N2kLh4D5, i));
        }
    }

    public void setChipIconVisible(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.FXJmAAN1(g5Var.N2kLh4D5.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.VhgXwMj9 == f) {
            return;
        }
        g5Var.VhgXwMj9 = f;
        g5Var.invalidateSelf();
        g5Var.SgZGMMPL();
    }

    public void setChipMinHeightResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float dimension = g5Var.N2kLh4D5.getResources().getDimension(i);
            if (g5Var.VhgXwMj9 != dimension) {
                g5Var.VhgXwMj9 = dimension;
                g5Var.invalidateSelf();
                g5Var.SgZGMMPL();
            }
        }
    }

    public void setChipStartPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.hGvurcGl == f) {
            return;
        }
        g5Var.hGvurcGl = f;
        g5Var.invalidateSelf();
        g5Var.SgZGMMPL();
    }

    public void setChipStartPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float dimension = g5Var.N2kLh4D5.getResources().getDimension(i);
            if (g5Var.hGvurcGl != dimension) {
                g5Var.hGvurcGl = dimension;
                g5Var.invalidateSelf();
                g5Var.SgZGMMPL();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.nSmgoSB5(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.nSmgoSB5(w30.RXQxj5Oe(g5Var.N2kLh4D5, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.N8VPGzVC(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.N8VPGzVC(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.HdOGZAzC(drawable);
        }
        wxUZMvaN();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.ESscZ9M1 == charSequence) {
            return;
        }
        String str = i2.NCTxEWno;
        i2 i2Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? i2.VgvYg0wo : i2.wxUZMvaN;
        i2Var.getClass();
        y30 y30Var = cc0.MdtA4re8;
        String str2 = i2.MdtA4re8;
        String str3 = i2.NCTxEWno;
        boolean z = i2Var.qoPGr6Ce;
        if (charSequence == null) {
            spannableStringBuilder = null;
        } else {
            boolean NCTxEWno = y30Var.NCTxEWno(charSequence, charSequence.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean NCTxEWno2 = (NCTxEWno ? cc0.NCTxEWno : cc0.qoPGr6Ce).NCTxEWno(charSequence, charSequence.length());
            spannableStringBuilder2.append((CharSequence) ((z || !(NCTxEWno2 || i2.qoPGr6Ce(charSequence) == 1)) ? (!z || (NCTxEWno2 && i2.qoPGr6Ce(charSequence) != -1)) ? "" : str2 : str3));
            if (NCTxEWno != z) {
                spannableStringBuilder2.append(NCTxEWno ? (char) 8235 : (char) 8234);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((char) 8236);
            } else {
                spannableStringBuilder2.append(charSequence);
            }
            boolean NCTxEWno3 = (NCTxEWno ? cc0.NCTxEWno : cc0.qoPGr6Ce).NCTxEWno(charSequence, charSequence.length());
            if (!z && (NCTxEWno3 || i2.NCTxEWno(charSequence) == 1)) {
                str2 = str3;
            } else if (!z || (NCTxEWno3 && i2.NCTxEWno(charSequence) != -1)) {
                str2 = "";
            }
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder = spannableStringBuilder2;
        }
        g5Var.ESscZ9M1 = spannableStringBuilder;
        g5Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.ZyZthT5G(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.ZyZthT5G(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.HdOGZAzC(ra.Ey6iv0m0(g5Var.N2kLh4D5, i));
        }
        wxUZMvaN();
    }

    public void setCloseIconSize(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.bvfAo0eO(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.bvfAo0eO(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.KRabZ4CU(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.KRabZ4CU(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.TrssYQ34(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.TrssYQ34(w30.RXQxj5Oe(g5Var.N2kLh4D5, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.FOrSgJlm, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.FOrSgJlm, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.sjUBp5pO(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.P7K7Inc8 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            m1.b2ZJblxo("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.rAaHqhFJ = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.lDXGDhIF = z;
        NCTxEWno(this.OxcuoDLp);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null) {
            return false;
        }
        bc0 bc0Var = g5Var.D4B4MtvK.b2ZJblxo;
        if (bc0Var != null && Build.VERSION.SDK_INT >= 26) {
            bc0Var.MdtA4re8 = str;
        }
        b2ZJblxo();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(gt gtVar) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.LvHlPNBd = gtVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.LvHlPNBd = gt.qoPGr6Ce(g5Var.N2kLh4D5, i);
        }
    }

    public void setIconEndPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.ESscZ9M1(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.ESscZ9M1(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.VGmz0ccI(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.VGmz0ccI(g5Var.N2kLh4D5.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.P7K7Inc8 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            m1.b2ZJblxo("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            m1.b2ZJblxo("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.T8ZRPPeH = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            m1.b2ZJblxo("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.eVhOlqcC = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.jb9XjC4I = onClickListener;
        wxUZMvaN();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.LfKQckgD(colorStateList);
        }
        this.P7K7Inc8.getClass();
        VgvYg0wo();
    }

    public void setRippleColorResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.LfKQckgD(w30.RXQxj5Oe(g5Var.N2kLh4D5, i));
            this.P7K7Inc8.getClass();
            VgvYg0wo();
        }
    }

    @Override // defpackage.e70
    public void setShapeAppearanceModel(t60 t60Var) {
        this.P7K7Inc8.setShapeAppearanceModel(t60Var);
    }

    public void setShowMotionSpec(gt gtVar) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.Sjrx9cEN = gtVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.Sjrx9cEN = gt.qoPGr6Ce(g5Var.N2kLh4D5, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            m1.b2ZJblxo("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(g5Var.QKkyGhhI ? null : charSequence, bufferType);
        g5 g5Var2 = this.P7K7Inc8;
        if (g5Var2 == null || TextUtils.equals(g5Var2.zCflySGU, charSequence)) {
            return;
        }
        g5Var2.zCflySGU = charSequence;
        g5Var2.D4B4MtvK.VgvYg0wo = true;
        g5Var2.invalidateSelf();
        g5Var2.SgZGMMPL();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            Context context2 = g5Var.N2kLh4D5;
            g5Var.D4B4MtvK.NCTxEWno(new bc0(context2, i), context2);
        }
        b2ZJblxo();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.dHozS53r == f) {
            return;
        }
        g5Var.dHozS53r = f;
        g5Var.invalidateSelf();
        g5Var.SgZGMMPL();
    }

    public void setTextEndPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float dimension = g5Var.N2kLh4D5.getResources().getDimension(i);
            if (g5Var.dHozS53r != dimension) {
                g5Var.dHozS53r = dimension;
                g5Var.invalidateSelf();
                g5Var.SgZGMMPL();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ec0 ec0Var = g5Var.D4B4MtvK;
            bc0 bc0Var = ec0Var.b2ZJblxo;
            if (bc0Var != null) {
                bc0Var.ow5vqvCr = applyDimension;
                ec0Var.qoPGr6Ce.setTextSize(applyDimension);
                g5Var.qoPGr6Ce();
            }
        }
        b2ZJblxo();
    }

    public void setTextStartPadding(float f) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var == null || g5Var.orhfF2Ya == f) {
            return;
        }
        g5Var.orhfF2Ya = f;
        g5Var.invalidateSelf();
        g5Var.SgZGMMPL();
    }

    public void setTextStartPaddingResource(int i) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            float dimension = g5Var.N2kLh4D5.getResources().getDimension(i);
            if (g5Var.orhfF2Ya != dimension) {
                g5Var.orhfF2Ya = dimension;
                g5Var.invalidateSelf();
                g5Var.SgZGMMPL();
            }
        }
    }

    public final void wxUZMvaN() {
        g5 g5Var;
        if (!MdtA4re8() || (g5Var = this.P7K7Inc8) == null || !g5Var.bvfAo0eO || this.jb9XjC4I == null) {
            hg0.eVhOlqcC(this, null);
            this.Ey6iv0m0 = false;
        } else {
            hg0.eVhOlqcC(this, this.KlHjfFWx);
            this.Ey6iv0m0 = true;
        }
    }

    public void setCloseIconVisible(boolean z) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.g2aRJUAd(z);
        }
        wxUZMvaN();
    }

    public void setCheckedIconVisible(boolean z) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.aZz0PFXp(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.FXJmAAN1(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            m1.b2ZJblxo("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            m1.b2ZJblxo("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            m1.b2ZJblxo("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            m1.b2ZJblxo("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(bc0 bc0Var) {
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            g5Var.D4B4MtvK.NCTxEWno(bc0Var, g5Var.N2kLh4D5);
        }
        b2ZJblxo();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        g5 g5Var = this.P7K7Inc8;
        if (g5Var != null) {
            Context context = g5Var.N2kLh4D5;
            g5Var.D4B4MtvK.NCTxEWno(new bc0(context, i), context);
        }
        b2ZJblxo();
    }

    public void setInternalOnCheckedChangeListener(or orVar) {
    }

    public Chip(Context context) {
        this(context, null);
    }
}
