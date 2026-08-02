package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import app.cash.arcade.values.ImageResource;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.network.NetworkFetcher$fetch$2;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class TextBinding implements Widget {
    public final Context context;
    public Modifier modifier;
    public final ThemeInfo themeInfo;
    public NetworkFetcher$fetch$2 urlHandler;
    public final FigmaTextView value;

    public TextBinding(Context context) {
        this.context = context;
        ThemeInfo findThemeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.themeInfo = findThemeInfo;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setCompoundDrawablePadding(Views.dip((View) figmaTextView, 4));
        figmaTextView.setLinkTextColor(findThemeInfo.colorPalette.tertiaryLabel);
        this.value = figmaTextView;
        this.modifier = Modifier.Companion.$$INSTANCE;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    public final void image(int i, ImageResource imageResource) {
        Drawable drawable;
        if (imageResource != null) {
            Resources resources = this.context.getResources();
            resources.getClass();
            drawable = ImageResourcesKt.toDrawable$default(imageResource, resources);
            if (drawable != null) {
                drawable.mutate();
                Size size = new Size(16, 16);
                double min = Math.min(Views.sp(r1, size.getWidth()) / drawable.getIntrinsicWidth(), Views.sp(r1, size.getHeight()) / drawable.getIntrinsicHeight());
                drawable.setBounds(0, 0, Integer.valueOf((int) (drawable.getIntrinsicWidth() * min)).intValue(), Integer.valueOf((int) (drawable.getIntrinsicHeight() * min)).intValue());
                FigmaTextView figmaTextView = this.value;
                Drawable[] compoundDrawablesRelative = figmaTextView.getCompoundDrawablesRelative();
                compoundDrawablesRelative.getClass();
                compoundDrawablesRelative[i] = drawable;
                figmaTextView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            }
        }
        drawable = null;
        FigmaTextView figmaTextView2 = this.value;
        Drawable[] compoundDrawablesRelative2 = figmaTextView2.getCompoundDrawablesRelative();
        compoundDrawablesRelative2.getClass();
        compoundDrawablesRelative2[i] = drawable;
        figmaTextView2.setCompoundDrawablesRelative(compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
