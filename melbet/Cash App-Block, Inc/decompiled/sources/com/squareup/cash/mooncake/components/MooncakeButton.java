package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public class MooncakeButton extends AppCompatButton {
    public final ColorPalette colorPalette;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        int dip = Views.dip((View) this, 16);
        setPaddingRelative(dip, dip, dip, dip);
        Strings.applyStyle(this, TextStyles.mainTitle);
        setTextColor(colorPalette.label);
        setGravity(17);
        setAllCaps(false);
        setMinHeight(Views.dip((View) this, 56));
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
    }
}
