package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class r3 extends FrameLayout {
    public static final int[] b2ZJblxo = {R.attr.colorBackground};
    public boolean MdtA4re8;
    public boolean NCTxEWno;
    public final mcXgUFR8 P7K7Inc8;
    public final Rect VgvYg0wo;
    public final Rect wxUZMvaN;

    public r3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.wxUZMvaN = rect;
        this.VgvYg0wo = new Rect();
        mcXgUFR8 mcxgufr8 = new mcXgUFR8((Object) this, 10, false);
        this.P7K7Inc8 = mcxgufr8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q00.qoPGr6Ce, com.kolosta.rejin.jilosa.R.attr.materialCardViewStyle, com.kolosta.rejin.jilosa.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(b2ZJblxo);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.kolosta.rejin.jilosa.R.color.cardview_light_background) : getResources().getColor(com.kolosta.rejin.jilosa.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.NCTxEWno = obtainStyledAttributes.getBoolean(7, false);
        this.MdtA4re8 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        z30 z30Var = new z30(valueOf, dimension);
        mcxgufr8.MdtA4re8 = z30Var;
        setBackgroundDrawable(z30Var);
        setClipToOutline(true);
        setElevation(dimension2);
        ej0.FXJmAAN1(mcxgufr8, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((z30) this.P7K7Inc8.MdtA4re8).Qr9iLBAD;
    }

    public float getCardElevation() {
        return ((r3) this.P7K7Inc8.wxUZMvaN).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.wxUZMvaN.bottom;
    }

    public int getContentPaddingLeft() {
        return this.wxUZMvaN.left;
    }

    public int getContentPaddingRight() {
        return this.wxUZMvaN.right;
    }

    public int getContentPaddingTop() {
        return this.wxUZMvaN.top;
    }

    public float getMaxCardElevation() {
        return ((z30) this.P7K7Inc8.MdtA4re8).VgvYg0wo;
    }

    public boolean getPreventCornerOverlap() {
        return this.MdtA4re8;
    }

    public float getRadius() {
        return ((z30) this.P7K7Inc8.MdtA4re8).qoPGr6Ce;
    }

    public boolean getUseCompatPadding() {
        return this.NCTxEWno;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        z30 z30Var = (z30) this.P7K7Inc8.MdtA4re8;
        if (valueOf == null) {
            z30Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        z30Var.Qr9iLBAD = valueOf;
        z30Var.NCTxEWno.setColor(valueOf.getColorForState(z30Var.getState(), z30Var.Qr9iLBAD.getDefaultColor()));
        z30Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((r3) this.P7K7Inc8.wxUZMvaN).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ej0.FXJmAAN1(this.P7K7Inc8, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.MdtA4re8) {
            this.MdtA4re8 = z;
            mcXgUFR8 mcxgufr8 = this.P7K7Inc8;
            ej0.FXJmAAN1(mcxgufr8, ((z30) mcxgufr8.MdtA4re8).VgvYg0wo);
        }
    }

    public void setRadius(float f) {
        z30 z30Var = (z30) this.P7K7Inc8.MdtA4re8;
        if (f == z30Var.qoPGr6Ce) {
            return;
        }
        z30Var.qoPGr6Ce = f;
        z30Var.NCTxEWno(null);
        z30Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.NCTxEWno != z) {
            this.NCTxEWno = z;
            mcXgUFR8 mcxgufr8 = this.P7K7Inc8;
            ej0.FXJmAAN1(mcxgufr8, ((z30) mcxgufr8.MdtA4re8).VgvYg0wo);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        z30 z30Var = (z30) this.P7K7Inc8.MdtA4re8;
        if (colorStateList == null) {
            z30Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        z30Var.Qr9iLBAD = colorStateList;
        z30Var.NCTxEWno.setColor(colorStateList.getColorForState(z30Var.getState(), z30Var.Qr9iLBAD.getDefaultColor()));
        z30Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
