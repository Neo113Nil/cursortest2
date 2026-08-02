package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;

/* loaded from: classes6.dex */
public class MooncakeImageButton extends AppCompatImageButton {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MooncakeImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setBackground(RipplesKt.createBorderlessRippleDrawable(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mooncake_MooncakeImageButton);
        obtainStyledAttributes.getClass();
        if (obtainStyledAttributes.getBoolean(0, false)) {
            setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{colorPalette.disabledIcon, colorPalette.icon}));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MooncakeImageButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
