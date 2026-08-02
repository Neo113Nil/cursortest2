package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import app.cash.molecule.PlatformKt;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.android.drawable.DrawablesKt;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class MooncakeCheckbox extends AppCompatCheckBox {
    public static final /* synthetic */ int $r8$clinit = 0;
    public CompoundButton.OnCheckedChangeListener internalCheckedChangeListener;
    public final ColorPalette palette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.palette = colorPalette;
        setMooncakeButtonDrawable();
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
        setCompoundDrawablePadding(Views.dip((View) this, 16));
        Strings.applyStyle(this, TextStyles.smallTitle);
        setTextColor(colorPalette.label);
        setPaddingRelative(Views.dip((View) this, 16), Views.dip((View) this, 16), Views.dip((View) this, 16), Views.dip((View) this, 16));
        super.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(this, 2));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        Views.setCompoundDrawableStart(this, drawable);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    @Deprecated
    public void setChecked(boolean z) {
        super.setChecked(z);
    }

    public final void setCheckedSilently(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.internalCheckedChangeListener;
        setOnCheckedChangeListener(null);
        super.setChecked(z);
        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setMooncakeButtonDrawable() {
        Context context = getContext();
        context.getClass();
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_checkbox_checked, Integer.valueOf(this.palette.tint));
        drawableCompat.getClass();
        Context context2 = getContext();
        context2.getClass();
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, R.drawable.mooncake_checkbox_unchecked, null);
        drawableCompat2.getClass();
        setButtonDrawable(DrawablesKt.stateListDrawableOf(new Pair(new int[]{android.R.attr.state_checked}, drawableCompat), new Pair(new int[0], drawableCompat2)));
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.internalCheckedChangeListener = onCheckedChangeListener;
    }

    public /* synthetic */ MooncakeCheckbox(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
