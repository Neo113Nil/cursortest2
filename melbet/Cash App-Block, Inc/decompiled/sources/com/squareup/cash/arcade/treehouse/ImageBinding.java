package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import app.cash.arcade.values.IconSize;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.RealImageLoader;
import com.squareup.cash.mooncake.components.MooncakeImageButton;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;

/* loaded from: classes5.dex */
public final class ImageBinding implements Widget {
    public final Object context;
    public Object imageLoader;
    public final ImageView value;
    public final /* synthetic */ int $r8$classId = 1;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;

    public ImageBinding(Context context, RealImageLoader realImageLoader) {
        this.context = context;
        this.imageLoader = realImageLoader;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImportantForAccessibility(2);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.value = appCompatImageView;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        switch (this.$r8$classId) {
        }
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        switch (this.$r8$classId) {
            case 0:
                return (AppCompatImageView) this.value;
            default:
                return (IconButtonBinding$value$1) this.value;
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        int i = this.$r8$classId;
        modifier.getClass();
        switch (i) {
            case 0:
                this.modifier = modifier;
                break;
            default:
                this.modifier = modifier;
                break;
        }
    }

    public ImageBinding(final Context context) {
        this.context = ThemeHelpersKt.findThemeInfo(context);
        this.value = new MooncakeImageButton(context) { // from class: com.squareup.cash.arcade.treehouse.IconButtonBinding$value$1
            @Override // android.widget.ImageView, android.view.View
            public final void onMeasure(int i, int i2) {
                IconSize iconSize = (IconSize) ImageBinding.this.imageLoader;
                if (iconSize instanceof IconSize.Pt) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    Context context2 = getContext();
                    context2.getClass();
                    int i3 = ((IconSize.Pt) iconSize).points;
                    layoutParams.width = Views.dip(context2, i3);
                    ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                    Context context3 = getContext();
                    context3.getClass();
                    layoutParams2.height = Views.dip(context3, i3);
                } else {
                    getLayoutParams().width = -2;
                    getLayoutParams().height = -2;
                }
                super.onMeasure(i, i2);
            }
        };
    }
}
