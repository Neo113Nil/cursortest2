package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.arcade.values.IconSize;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.RealImageLoader;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class IconBinding implements Widget {
    public final Context context;
    public final RealImageLoader imageLoader;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public IconSize size;
    public final ThemeInfo themeInfo;
    public final IconBinding$value$1 value;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.squareup.cash.arcade.treehouse.IconBinding$value$1] */
    public IconBinding(final Context context, RealImageLoader realImageLoader) {
        this.context = context;
        this.imageLoader = realImageLoader;
        this.themeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.value = new AppCompatImageView(context) { // from class: com.squareup.cash.arcade.treehouse.IconBinding$value$1
            {
                setImportantForAccessibility(2);
            }

            @Override // android.widget.ImageView, android.view.View
            public final void onMeasure(int i, int i2) {
                IconSize iconSize = IconBinding.this.size;
                if (!(iconSize instanceof IconSize.Pt)) {
                    getLayoutParams().width = -2;
                    getLayoutParams().height = -2;
                    super.onMeasure(i, i2);
                } else {
                    Context context2 = getContext();
                    context2.getClass();
                    int dip = Views.dip(context2, ((IconSize.Pt) iconSize).points);
                    getLayoutParams().width = dip;
                    getLayoutParams().height = dip;
                    setMeasuredDimension(dip, dip);
                }
            }
        };
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
