package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pr extends vLKozZt7 {
    public static final int[][] Qr9iLBAD = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList P7K7Inc8;
    public boolean b2ZJblxo;

    public pr(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.radioButtonStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray FySoLYna = fn.FySoLYna(context2, attributeSet, y00.sjUBp5pO, com.kolosta.rejin.jilosa.R.attr.radioButtonStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (FySoLYna.hasValue(0)) {
            setButtonTintList(w30.gjV1z5T1(context2, FySoLYna, 0));
        }
        if (FySoLYna.hasValue(1)) {
            setRippleColor(w30.gjV1z5T1(context2, FySoLYna, 1));
        }
        this.b2ZJblxo = FySoLYna.getBoolean(2, false);
        FySoLYna.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.P7K7Inc8;
        if (colorStateList != null) {
            return colorStateList;
        }
        int ygLcUYwZ = fn.ygLcUYwZ(this, com.kolosta.rejin.jilosa.R.attr.colorControlActivated);
        int ygLcUYwZ2 = fn.ygLcUYwZ(this, com.kolosta.rejin.jilosa.R.attr.colorOnSurface);
        int ygLcUYwZ3 = fn.ygLcUYwZ(this, com.kolosta.rejin.jilosa.R.attr.colorSurface);
        ColorStateList colorStateList2 = new ColorStateList(Qr9iLBAD, new int[]{fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ, 1.0f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ2, 0.54f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ2, 0.38f), fn.I5GHvsYW(ygLcUYwZ3, ygLcUYwZ2, 0.38f)});
        this.P7K7Inc8 = colorStateList2;
        return colorStateList2;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b2ZJblxo && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.b2ZJblxo = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
