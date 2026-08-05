package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class hr extends AppCompatButton implements Checkable, e70 {
    public static final int[] VhgXwMj9 = {R.attr.state_checkable};
    public static final int[] aZz0PFXp = {R.attr.state_checked};
    public float DK9slbsy;
    public int Ey6iv0m0;
    public int FySoLYna;
    public boolean I5GHvsYW;
    public int KlHjfFWx;
    public int Mq3SeTnW;
    public boolean OnDfzHZD;
    public int OxcuoDLp;
    public final LinkedHashSet P7K7Inc8;
    public ColorStateList Qr9iLBAD;
    public boolean RXQxj5Oe;
    public int SgZGMMPL;
    public int U0LaHZX7;
    public final ir VgvYg0wo;
    public int WYNAV5pd;
    public int amk52bBQ;
    public PorterDuff.Mode b2ZJblxo;
    public float eIA6dogk;
    public PorterDuff.Mode eVhOlqcC;
    public int euDDoUNr;
    public int gjV1z5T1;
    public boolean i7xS8jrb;
    public Drawable jb9XjC4I;
    public ColorStateList k3x7lurq;
    public int lDXGDhIF;
    public int lwWCatUu;
    public Drawable ow5vqvCr;
    public float pRiPUEwG;
    public int sjUBp5pO;
    public String ygLcUYwZ;
    public gr ytu5o6f4;

    public hr(Context context, AttributeSet attributeSet) {
        super(le0.N8VPGzVC(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.materialButtonStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Button, new int[]{com.kolosta.rejin.jilosa.R.attr.materialSizeOverlay}), attributeSet, com.kolosta.rejin.jilosa.R.attr.materialButtonStyle);
        this.P7K7Inc8 = new LinkedHashSet();
        this.I5GHvsYW = false;
        this.RXQxj5Oe = false;
        this.WYNAV5pd = Integer.MIN_VALUE;
        this.DK9slbsy = -2.1474836E9f;
        this.lwWCatUu = Integer.MIN_VALUE;
        this.U0LaHZX7 = Integer.MIN_VALUE;
        this.euDDoUNr = Integer.MIN_VALUE;
        this.ytu5o6f4 = gr.NCTxEWno;
        Context context2 = getContext();
        TypedArray FySoLYna = fn.FySoLYna(context2, attributeSet, y00.ow5vqvCr, com.kolosta.rejin.jilosa.R.attr.materialButtonStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.amk52bBQ = FySoLYna.getDimensionPixelSize(13, 0);
        int i = FySoLYna.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b2ZJblxo = g50.b2ZJblxo(i);
        this.Qr9iLBAD = w30.gjV1z5T1(getContext(), FySoLYna, 15);
        this.jb9XjC4I = w30.DK9slbsy(getContext(), FySoLYna, 11);
        this.FySoLYna = FySoLYna.getInteger(12, 1);
        this.lDXGDhIF = FySoLYna.getDimensionPixelSize(14, 0);
        this.eVhOlqcC = g50.b2ZJblxo(FySoLYna.getInt(22, -1));
        this.k3x7lurq = FySoLYna.hasValue(21) ? w30.gjV1z5T1(getContext(), FySoLYna, 21) : this.Qr9iLBAD;
        this.gjV1z5T1 = FySoLYna.getInteger(20, 3);
        Drawable DK9slbsy = w30.DK9slbsy(getContext(), FySoLYna, 19);
        this.ow5vqvCr = DK9slbsy;
        this.OnDfzHZD = DK9slbsy == null;
        r60 P7K7Inc8 = z90.P7K7Inc8(context2, FySoLYna, 23);
        P7K7Inc8 = P7K7Inc8 == null ? t60.P7K7Inc8(context2, attributeSet, com.kolosta.rejin.jilosa.R.attr.materialButtonStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_Button).qoPGr6Ce() : P7K7Inc8;
        boolean z = FySoLYna.getBoolean(17, false);
        ir irVar = new ir(this, P7K7Inc8);
        this.VgvYg0wo = irVar;
        irVar.VgvYg0wo = FySoLYna.getDimensionPixelOffset(2, 0);
        irVar.P7K7Inc8 = FySoLYna.getDimensionPixelOffset(3, 0);
        irVar.b2ZJblxo = FySoLYna.getDimensionPixelOffset(4, 0);
        irVar.Qr9iLBAD = FySoLYna.getDimensionPixelOffset(5, 0);
        if (FySoLYna.hasValue(9)) {
            int dimensionPixelSize = FySoLYna.getDimensionPixelSize(9, -1);
            irVar.jb9XjC4I = dimensionPixelSize;
            irVar.NCTxEWno = irVar.NCTxEWno.qoPGr6Ce(dimensionPixelSize);
            irVar.wxUZMvaN();
            irVar.amk52bBQ = true;
        }
        irVar.eVhOlqcC = FySoLYna.getDimensionPixelSize(26, 0);
        irVar.k3x7lurq = g50.b2ZJblxo(FySoLYna.getInt(8, -1));
        irVar.ow5vqvCr = w30.gjV1z5T1(getContext(), FySoLYna, 7);
        irVar.OnDfzHZD = w30.gjV1z5T1(getContext(), FySoLYna, 25);
        irVar.ygLcUYwZ = w30.gjV1z5T1(getContext(), FySoLYna, 18);
        irVar.KlHjfFWx = FySoLYna.getBoolean(6, false);
        irVar.RXQxj5Oe = FySoLYna.getDimensionPixelSize(10, 0);
        irVar.Ey6iv0m0 = FySoLYna.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (FySoLYna.hasValue(0)) {
            irVar.OxcuoDLp = true;
            setSupportBackgroundTintList(irVar.ow5vqvCr);
            setSupportBackgroundTintMode(irVar.k3x7lurq);
        } else {
            irVar.MdtA4re8();
        }
        setPaddingRelative(paddingStart + irVar.VgvYg0wo, paddingTop + irVar.b2ZJblxo, paddingEnd + irVar.P7K7Inc8, paddingBottom + irVar.Qr9iLBAD);
        setCheckedInternal(FySoLYna.getBoolean(1, false));
        if (P7K7Inc8 instanceof z90) {
            irVar.MdtA4re8 = w30.zCflySGU(getContext());
            if (irVar.NCTxEWno instanceof z90) {
                irVar.wxUZMvaN();
            }
        }
        setOpticalCenterEnabled(z);
        FySoLYna.recycle();
        setCompoundDrawablePadding(this.amk52bBQ);
        OxcuoDLp(this.jb9XjC4I != null);
        Ey6iv0m0(this.ow5vqvCr != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.eIA6dogk;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        ir irVar = this.VgvYg0wo;
        if (irVar == null || !irVar.KlHjfFWx || this.I5GHvsYW == z) {
            return;
        }
        this.I5GHvsYW = z;
        refreshDrawableState();
        getParent();
        if (this.RXQxj5Oe) {
            return;
        }
        this.RXQxj5Oe = true;
        Iterator it = this.P7K7Inc8.iterator();
        if (!it.hasNext()) {
            this.RXQxj5Oe = false;
        } else {
            it.next().getClass();
            m1.qoPGr6Ce();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.eIA6dogk != f) {
            this.eIA6dogk = f;
            KlHjfFWx();
            invalidate();
            getParent();
        }
    }

    public final void Ey6iv0m0(boolean z) {
        Drawable drawable = this.ow5vqvCr;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.ow5vqvCr = mutate;
            mutate.setTintList(this.k3x7lurq);
            PorterDuff.Mode mode = this.eVhOlqcC;
            if (mode != null) {
                this.ow5vqvCr.setTintMode(mode);
            }
            int i = this.lDXGDhIF;
            if (i == 0) {
                i = this.ow5vqvCr.getIntrinsicWidth();
            }
            int i2 = this.lDXGDhIF;
            if (i2 == 0) {
                i2 = this.ow5vqvCr.getIntrinsicHeight();
            }
            Drawable drawable2 = this.ow5vqvCr;
            int i3 = this.KlHjfFWx;
            int i4 = this.Ey6iv0m0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.ow5vqvCr.setVisible(true, z);
        }
        if (this.ow5vqvCr != null && this.jb9XjC4I != null && MdtA4re8()) {
            m1.sjUBp5pO("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.ow5vqvCr == null) {
            if (this.OnDfzHZD) {
                return;
            }
            if (this.jb9XjC4I != null && MdtA4re8()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (OnDfzHZD() && compoundDrawablesRelative[0] != this.ow5vqvCr) || (ow5vqvCr() && compoundDrawablesRelative[2] != this.ow5vqvCr) || (ygLcUYwZ() && compoundDrawablesRelative[1] != this.ow5vqvCr);
        if (z || z2) {
            if (OnDfzHZD()) {
                setCompoundDrawablesRelative(this.ow5vqvCr, Qr9iLBAD(1), Qr9iLBAD(2), null);
            } else if (ow5vqvCr()) {
                setCompoundDrawablesRelative(Qr9iLBAD(0), Qr9iLBAD(1), this.ow5vqvCr, null);
            } else if (ygLcUYwZ()) {
                setCompoundDrawablesRelative(Qr9iLBAD(0), this.ow5vqvCr, Qr9iLBAD(2), null);
            }
        }
    }

    public final void I5GHvsYW(int i, int i2) {
        if (this.ow5vqvCr == null || getLayout() == null) {
            return;
        }
        if (OnDfzHZD() || ow5vqvCr()) {
            this.Ey6iv0m0 = 0;
            if (wxUZMvaN(this.gjV1z5T1)) {
                this.KlHjfFWx = 0;
                Ey6iv0m0(false);
                return;
            }
            int VgvYg0wo = VgvYg0wo(i, this.gjV1z5T1);
            if (this.KlHjfFWx != VgvYg0wo) {
                this.KlHjfFWx = VgvYg0wo;
                Ey6iv0m0(false);
                return;
            }
            return;
        }
        if (ygLcUYwZ()) {
            this.KlHjfFWx = 0;
            if (this.gjV1z5T1 == 16) {
                this.Ey6iv0m0 = 0;
                Ey6iv0m0(false);
                return;
            }
            int i3 = this.lDXGDhIF;
            if (i3 == 0) {
                i3 = this.ow5vqvCr.getIntrinsicHeight();
            }
            int P7K7Inc8 = P7K7Inc8(i2, i3);
            if (this.Ey6iv0m0 != P7K7Inc8) {
                this.Ey6iv0m0 = P7K7Inc8;
                Ey6iv0m0(false);
            }
        }
    }

    public final void KlHjfFWx() {
        int i = (int) (this.eIA6dogk - this.pRiPUEwG);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.Mq3SeTnW;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.DK9slbsy + i);
        }
        setPaddingRelative(this.lwWCatUu + i3, getPaddingTop(), (this.U0LaHZX7 + i) - i3, getPaddingBottom());
    }

    public final boolean MdtA4re8() {
        if (eVhOlqcC() && OnDfzHZD()) {
            return true;
        }
        if (jb9XjC4I() && ow5vqvCr()) {
            return true;
        }
        return k3x7lurq() && ygLcUYwZ();
    }

    public final boolean OnDfzHZD() {
        int i = this.gjV1z5T1;
        return i == 1 || i == 2;
    }

    public final void OxcuoDLp(boolean z) {
        Drawable drawable = this.jb9XjC4I;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.jb9XjC4I = mutate;
            mutate.setTintList(this.Qr9iLBAD);
            PorterDuff.Mode mode = this.b2ZJblxo;
            if (mode != null) {
                this.jb9XjC4I.setTintMode(mode);
            }
            int i = this.lDXGDhIF;
            if (i == 0) {
                i = this.jb9XjC4I.getIntrinsicWidth();
            }
            int i2 = this.lDXGDhIF;
            if (i2 == 0) {
                i2 = this.jb9XjC4I.getIntrinsicHeight();
            }
            Drawable drawable2 = this.jb9XjC4I;
            int i3 = this.sjUBp5pO;
            int i4 = this.OxcuoDLp;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.jb9XjC4I.setVisible(true, z);
        }
        if (this.jb9XjC4I != null && this.ow5vqvCr != null && MdtA4re8()) {
            m1.sjUBp5pO("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.jb9XjC4I == null && this.ow5vqvCr != null && MdtA4re8()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (eVhOlqcC() && compoundDrawablesRelative[0] != this.jb9XjC4I) || (jb9XjC4I() && compoundDrawablesRelative[2] != this.jb9XjC4I) || (k3x7lurq() && compoundDrawablesRelative[1] != this.jb9XjC4I);
        if (z || z2) {
            if (eVhOlqcC()) {
                setCompoundDrawablesRelative(this.jb9XjC4I, b2ZJblxo(1), b2ZJblxo(2), null);
            } else if (jb9XjC4I()) {
                setCompoundDrawablesRelative(b2ZJblxo(0), b2ZJblxo(1), this.jb9XjC4I, null);
            } else if (k3x7lurq()) {
                setCompoundDrawablesRelative(b2ZJblxo(0), this.jb9XjC4I, b2ZJblxo(2), null);
            }
        }
    }

    public final int P7K7Inc8(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.amk52bBQ) - getPaddingBottom()) / 2);
    }

    public final Drawable Qr9iLBAD(int i) {
        if (i == 0) {
            if (this.jb9XjC4I == null || !eVhOlqcC()) {
                return null;
            }
            return this.jb9XjC4I;
        }
        if (i == 1) {
            if (this.jb9XjC4I == null || !jb9XjC4I()) {
                return null;
            }
            return this.jb9XjC4I;
        }
        if (i == 2 && this.jb9XjC4I != null && jb9XjC4I()) {
            return this.jb9XjC4I;
        }
        return null;
    }

    public final int VgvYg0wo(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.jb9XjC4I;
        if (drawable != null) {
            i3 = this.lDXGDhIF;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.ow5vqvCr;
        if (drawable2 != null) {
            i4 = this.lDXGDhIF;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.amk52bBQ) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final void amk52bBQ(int i, int i2) {
        if (this.jb9XjC4I == null || getLayout() == null) {
            return;
        }
        if (eVhOlqcC() || jb9XjC4I()) {
            this.OxcuoDLp = 0;
            if (wxUZMvaN(this.FySoLYna)) {
                this.sjUBp5pO = 0;
                OxcuoDLp(false);
                return;
            }
            int VgvYg0wo = VgvYg0wo(i, this.FySoLYna);
            if (this.sjUBp5pO != VgvYg0wo) {
                this.sjUBp5pO = VgvYg0wo;
                OxcuoDLp(false);
                return;
            }
            return;
        }
        if (k3x7lurq()) {
            this.sjUBp5pO = 0;
            if (this.FySoLYna == 16) {
                this.OxcuoDLp = 0;
                OxcuoDLp(false);
                return;
            }
            int i3 = this.lDXGDhIF;
            if (i3 == 0) {
                i3 = this.jb9XjC4I.getIntrinsicHeight();
            }
            int P7K7Inc8 = P7K7Inc8(i2, i3);
            if (this.OxcuoDLp != P7K7Inc8) {
                this.OxcuoDLp = P7K7Inc8;
                OxcuoDLp(false);
            }
        }
    }

    public final Drawable b2ZJblxo(int i) {
        if (i == 0) {
            if (this.ow5vqvCr == null || !OnDfzHZD()) {
                return null;
            }
            return this.ow5vqvCr;
        }
        if (i == 1) {
            if (this.ow5vqvCr == null || !ygLcUYwZ()) {
                return null;
            }
            return this.ow5vqvCr;
        }
        if (i == 2 && this.ow5vqvCr != null && ow5vqvCr()) {
            return this.ow5vqvCr;
        }
        return null;
    }

    public final boolean eVhOlqcC() {
        int i = this.FySoLYna;
        return i == 1 || i == 2;
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.ygLcUYwZ)) {
            return this.ygLcUYwZ;
        }
        ir irVar = this.VgvYg0wo;
        return ((irVar == null || !irVar.KlHjfFWx) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.euDDoUNr;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.jb9XjC4I;
        }
        return 0;
    }

    public g80 getCornerSpringForce() {
        return this.VgvYg0wo.MdtA4re8;
    }

    public Drawable getIcon() {
        return this.jb9XjC4I;
    }

    public int getIconGravity() {
        return this.FySoLYna;
    }

    public int getIconPadding() {
        return this.amk52bBQ;
    }

    public int getIconSize() {
        return this.lDXGDhIF;
    }

    public ColorStateList getIconTint() {
        return this.Qr9iLBAD;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.b2ZJblxo;
    }

    public int getInsetBottom() {
        return this.VgvYg0wo.Qr9iLBAD;
    }

    public int getInsetLeft() {
        return this.VgvYg0wo.VgvYg0wo;
    }

    public int getInsetRight() {
        return this.VgvYg0wo.P7K7Inc8;
    }

    public int getInsetTop() {
        return this.VgvYg0wo.b2ZJblxo;
    }

    public ColorStateList getRippleColor() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.ygLcUYwZ;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.ow5vqvCr;
    }

    public int getSecondaryIconGravity() {
        return this.gjV1z5T1;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.k3x7lurq;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.eVhOlqcC;
    }

    public r60 getShapeAppearance() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.NCTxEWno;
        }
        m1.Ey6iv0m0("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public t60 getShapeAppearanceModel() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.NCTxEWno.wxUZMvaN();
        }
        m1.Ey6iv0m0("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.OnDfzHZD;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (lDXGDhIF()) {
            return this.VgvYg0wo.eVhOlqcC;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return lDXGDhIF() ? this.VgvYg0wo.ow5vqvCr : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return lDXGDhIF() ? this.VgvYg0wo.k3x7lurq : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.I5GHvsYW;
    }

    public final boolean jb9XjC4I() {
        int i = this.FySoLYna;
        return i == 3 || i == 4;
    }

    public final boolean k3x7lurq() {
        int i = this.FySoLYna;
        return i == 16 || i == 32;
    }

    public final boolean lDXGDhIF() {
        ir irVar = this.VgvYg0wo;
        return (irVar == null || irVar.OxcuoDLp) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (lDXGDhIF()) {
            le0.Xkz7p5xa(this, this.VgvYg0wo.qoPGr6Ce(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        ir irVar = this.VgvYg0wo;
        if (irVar != null && irVar.KlHjfFWx) {
            View.mergeDrawableStates(onCreateDrawableState, VhgXwMj9);
        }
        if (this.I5GHvsYW) {
            View.mergeDrawableStates(onCreateDrawableState, aZz0PFXp);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.I5GHvsYW);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        ir irVar = this.VgvYg0wo;
        accessibilityNodeInfo.setCheckable(irVar != null && irVar.KlHjfFWx);
        accessibilityNodeInfo.setChecked(this.I5GHvsYW);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        amk52bBQ(getMeasuredWidth(), getMeasuredHeight());
        I5GHvsYW(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.WYNAV5pd != i6) {
            this.WYNAV5pd = i6;
            this.DK9slbsy = -2.1474836E9f;
        }
        if (this.DK9slbsy == -2.1474836E9f) {
            this.DK9slbsy = getMeasuredWidth();
            getParent();
        }
        if (this.euDDoUNr == Integer.MIN_VALUE) {
            if (this.jb9XjC4I == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.lDXGDhIF;
                if (i7 == 0) {
                    i7 = this.jb9XjC4I.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.euDDoUNr = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.lwWCatUu == Integer.MIN_VALUE) {
            this.lwWCatUu = getPaddingStart();
        }
        if (this.U0LaHZX7 == Integer.MIN_VALUE) {
            this.U0LaHZX7 = getPaddingEnd();
        }
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fr frVar = (fr) parcelable;
        super.onRestoreInstanceState(frVar.NCTxEWno);
        setChecked(frVar.wxUZMvaN);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        fr frVar = new fr(super.onSaveInstanceState());
        frVar.wxUZMvaN = this.I5GHvsYW;
        return frVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        amk52bBQ(getMeasuredWidth(), getMeasuredHeight());
        I5GHvsYW(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean ow5vqvCr() {
        int i = this.gjV1z5T1;
        return i == 3 || i == 4;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.VgvYg0wo.Ey6iv0m0) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.jb9XjC4I != null) {
            if (this.jb9XjC4I.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.ygLcUYwZ = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!lDXGDhIF()) {
            super.setBackgroundColor(i);
            return;
        }
        ir irVar = this.VgvYg0wo;
        if (irVar.qoPGr6Ce(false) != null) {
            irVar.qoPGr6Ce(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!lDXGDhIF()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        ir irVar = this.VgvYg0wo;
        irVar.OxcuoDLp = true;
        hr hrVar = irVar.qoPGr6Ce;
        hrVar.setSupportBackgroundTintList(irVar.ow5vqvCr);
        hrVar.setSupportBackgroundTintMode(irVar.k3x7lurq);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ra.Ey6iv0m0(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (lDXGDhIF()) {
            this.VgvYg0wo.KlHjfFWx = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.DK9slbsy = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (lDXGDhIF()) {
            ir irVar = this.VgvYg0wo;
            if (irVar.amk52bBQ && irVar.jb9XjC4I == i) {
                return;
            }
            irVar.jb9XjC4I = i;
            irVar.amk52bBQ = true;
            irVar.NCTxEWno = irVar.NCTxEWno.qoPGr6Ce(i);
            irVar.wxUZMvaN();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (lDXGDhIF()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(g80 g80Var) {
        ir irVar = this.VgvYg0wo;
        irVar.MdtA4re8 = g80Var;
        if (irVar.NCTxEWno instanceof z90) {
            irVar.wxUZMvaN();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.pRiPUEwG = Math.min(i, this.euDDoUNr);
        KlHjfFWx();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (lDXGDhIF()) {
            this.VgvYg0wo.qoPGr6Ce(false).sjUBp5pO(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.jb9XjC4I != drawable) {
            this.DK9slbsy = -2.1474836E9f;
            this.jb9XjC4I = drawable;
            OxcuoDLp(true);
            amk52bBQ(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.FySoLYna != i) {
            if (this.jb9XjC4I != null && this.ow5vqvCr != null && MdtA4re8()) {
                m1.sjUBp5pO("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.FySoLYna = i;
                amk52bBQ(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.amk52bBQ != i) {
            this.amk52bBQ = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ra.Ey6iv0m0(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            m1.sjUBp5pO("iconSize cannot be less than 0");
        } else if (this.lDXGDhIF != i) {
            this.DK9slbsy = -2.1474836E9f;
            this.lDXGDhIF = i;
            OxcuoDLp(true);
            Ey6iv0m0(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.Qr9iLBAD != colorStateList) {
            this.Qr9iLBAD = colorStateList;
            OxcuoDLp(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.b2ZJblxo != mode) {
            this.b2ZJblxo = mode;
            OxcuoDLp(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(w30.RXQxj5Oe(getContext(), i));
    }

    public void setInsetBottom(int i) {
        ir irVar = this.VgvYg0wo;
        irVar.NCTxEWno(irVar.VgvYg0wo, irVar.b2ZJblxo, irVar.P7K7Inc8, i);
    }

    public void setInsetLeft(int i) {
        ir irVar = this.VgvYg0wo;
        irVar.NCTxEWno(i, irVar.b2ZJblxo, irVar.P7K7Inc8, irVar.Qr9iLBAD);
    }

    public void setInsetRight(int i) {
        ir irVar = this.VgvYg0wo;
        irVar.NCTxEWno(irVar.VgvYg0wo, irVar.b2ZJblxo, i, irVar.Qr9iLBAD);
    }

    public void setInsetTop(int i) {
        ir irVar = this.VgvYg0wo;
        irVar.NCTxEWno(irVar.VgvYg0wo, i, irVar.P7K7Inc8, irVar.Qr9iLBAD);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.i7xS8jrb != z) {
            this.i7xS8jrb = z;
            ir irVar = this.VgvYg0wo;
            if (z) {
                wm wmVar = new wm(this);
                irVar.wxUZMvaN = wmVar;
                tr qoPGr6Ce = irVar.qoPGr6Ce(false);
                if (qoPGr6Ce != null) {
                    qoPGr6Ce.euDDoUNr = wmVar;
                }
            } else {
                irVar.wxUZMvaN = null;
                tr qoPGr6Ce2 = irVar.qoPGr6Ce(false);
                if (qoPGr6Ce2 != null) {
                    qoPGr6Ce2.euDDoUNr = null;
                }
            }
            post(new d3vfVszL(8, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (lDXGDhIF()) {
            ir irVar = this.VgvYg0wo;
            hr hrVar = irVar.qoPGr6Ce;
            if (irVar.ygLcUYwZ != colorStateList) {
                irVar.ygLcUYwZ = colorStateList;
                if (hrVar.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) hrVar.getBackground()).setColor(q30.NCTxEWno(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (lDXGDhIF()) {
            setRippleColor(w30.RXQxj5Oe(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.ow5vqvCr != drawable) {
            this.DK9slbsy = -2.1474836E9f;
            this.ow5vqvCr = drawable;
            this.OnDfzHZD = false;
            Ey6iv0m0(true);
            I5GHvsYW(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconGravity(int i) {
        if (this.gjV1z5T1 != i) {
            if (this.ow5vqvCr != null && this.jb9XjC4I != null && MdtA4re8()) {
                m1.sjUBp5pO("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.gjV1z5T1 = i;
                I5GHvsYW(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? ra.Ey6iv0m0(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.k3x7lurq != colorStateList) {
            this.k3x7lurq = colorStateList;
            Ey6iv0m0(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.eVhOlqcC != mode) {
            this.eVhOlqcC = mode;
            Ey6iv0m0(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(w30.RXQxj5Oe(getContext(), i));
    }

    public void setShapeAppearance(r60 r60Var) {
        if (!lDXGDhIF()) {
            m1.Ey6iv0m0("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        ir irVar = this.VgvYg0wo;
        if (irVar.MdtA4re8 == null && r60Var.VgvYg0wo()) {
            irVar.MdtA4re8 = w30.zCflySGU(getContext());
            if (irVar.NCTxEWno instanceof z90) {
                irVar.wxUZMvaN();
            }
        }
        irVar.NCTxEWno = r60Var;
        irVar.wxUZMvaN();
    }

    @Override // defpackage.e70
    public void setShapeAppearanceModel(t60 t60Var) {
        if (!lDXGDhIF()) {
            m1.Ey6iv0m0("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        ir irVar = this.VgvYg0wo;
        irVar.NCTxEWno = t60Var;
        irVar.wxUZMvaN();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (lDXGDhIF()) {
            ir irVar = this.VgvYg0wo;
            irVar.sjUBp5pO = z;
            irVar.VgvYg0wo();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (lDXGDhIF()) {
            ir irVar = this.VgvYg0wo;
            if (irVar.OnDfzHZD != colorStateList) {
                irVar.OnDfzHZD = colorStateList;
                irVar.VgvYg0wo();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (lDXGDhIF()) {
            setStrokeColor(w30.RXQxj5Oe(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (lDXGDhIF()) {
            ir irVar = this.VgvYg0wo;
            if (irVar.eVhOlqcC != i) {
                irVar.eVhOlqcC = i;
                irVar.VgvYg0wo();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (lDXGDhIF()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!lDXGDhIF()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        ir irVar = this.VgvYg0wo;
        if (irVar.ow5vqvCr != colorStateList) {
            irVar.ow5vqvCr = colorStateList;
            if (irVar.qoPGr6Ce(false) != null) {
                irVar.qoPGr6Ce(false).setTintList(irVar.ow5vqvCr);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!lDXGDhIF()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        ir irVar = this.VgvYg0wo;
        if (irVar.k3x7lurq != mode) {
            irVar.k3x7lurq = mode;
            if (irVar.qoPGr6Ce(false) == null || irVar.k3x7lurq == null) {
                return;
            }
            irVar.qoPGr6Ce(false).setTintMode(irVar.k3x7lurq);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.DK9slbsy = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        amk52bBQ(getMeasuredWidth(), getMeasuredHeight());
        I5GHvsYW(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.DK9slbsy = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.DK9slbsy = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.VgvYg0wo.Ey6iv0m0 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.DK9slbsy = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(gr grVar) {
        if (this.ytu5o6f4 != grVar) {
            this.ytu5o6f4 = grVar;
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.SgZGMMPL != i) {
            this.SgZGMMPL = i;
        }
    }

    public final /* synthetic */ void sjUBp5pO() {
        this.Mq3SeTnW = getOpticalCenterShift();
        KlHjfFWx();
        invalidate();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.I5GHvsYW);
    }

    public final boolean wxUZMvaN(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final boolean ygLcUYwZ() {
        int i = this.gjV1z5T1;
        return i == 16 || i == 32;
    }

    public void setOnPressedChangeListenerInternal(er erVar) {
    }

    public void setSizeChange(aa0 aa0Var) {
    }
}
