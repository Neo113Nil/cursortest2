package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList materialThemeColorsTintList;
    public boolean useMaterialThemeColors;

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, com.squareup.cash.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialRadioButton, i, com.squareup.cash.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (obtainStyledAttributes.hasValue(0)) {
            setButtonTintList(ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 0));
        }
        if (obtainStyledAttributes.hasValue(1) && (colorStateList = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 1)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateList);
            }
        }
        this.useMaterialThemeColors = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (!z) {
            setButtonTintList(null);
            return;
        }
        if (this.materialThemeColorsTintList == null) {
            int resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, com.squareup.cash.R.attr.colorControlActivated));
            int resolveColor2 = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, com.squareup.cash.R.attr.colorOnSurface));
            int resolveColor3 = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, com.squareup.cash.R.attr.colorSurface));
            this.materialThemeColorsTintList = new ColorStateList(ENABLED_CHECKED_STATES, new int[]{MaterialColors.layer(1.0f, resolveColor3, resolveColor), MaterialColors.layer(0.54f, resolveColor3, resolveColor2), MaterialColors.layer(0.38f, resolveColor3, resolveColor2), MaterialColors.layer(0.38f, resolveColor3, resolveColor2)});
        }
        setButtonTintList(this.materialThemeColorsTintList);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
