package com.squareup.cash.mooncake.components;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.util.android.Views;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MooncakeToolbar extends Toolbar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setLayoutTransition(new LayoutTransition());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarTitleAppearance, typedValue, true);
        setTitleTextAppearance(context, typedValue.resourceId);
        if (getNavigationIcon() == null) {
            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.close_white, null);
            drawableCompat.getClass();
            setNavigationIcon(drawableCompat);
        }
        AppCompatImageButton appCompatImageButton = this.mNavButtonView;
        if ((appCompatImageButton != null ? appCompatImageButton.getContentDescription() : null) == null) {
            setNavigationContentDescription(context.getString(R.string.action_bar_close));
        }
        setTitleTextColor(colorPalette.label);
        setSubtitleTextColor(colorPalette.secondaryLabel);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof ImageButton) {
            ImageButton imageButton = (ImageButton) view;
            RippleDrawable createBorderlessRippleDrawable = RipplesKt.createBorderlessRippleDrawable(view);
            createBorderlessRippleDrawable.setRadius(Views.dip((View) this, 20));
            imageButton.setBackground(createBorderlessRippleDrawable);
        }
    }

    public final void setNavigationIcon(Drawable drawable, Integer num) {
        if (drawable != null && num != null) {
            drawable.mutate().setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        setNavigationIcon(drawable, Integer.valueOf(ThemeHelpersKt.themeInfo(this).colorPalette.icon));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MooncakeToolbar(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ MooncakeToolbar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
