package com.squareup.cash.investing.components.metrics;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;

/* loaded from: classes6.dex */
public final class InvestingEarningsGraphDotView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AppCompatImageView actualIcon;
    public final int adjustPosition;
    public final int dotDiameter;
    public final AppCompatImageView expectedIcon;
    public final View hairlineView;
    public final ThemeInfo themeInfo;
    public final int thresholdInPixel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingEarningsGraphDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        ColorPalette colorPalette = themeInfo.colorPalette;
        this.adjustPosition = getDip(14);
        this.dotDiameter = 24;
        this.thresholdInPixel = 6;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int i = colorPalette.disabledLabel;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        appCompatImageView.setBackground(gradientDrawable);
        this.expectedIcon = appCompatImageView;
        this.actualIcon = new AppCompatImageView(context);
        View view = new View(context);
        view.setBackground(new DividerDrawable(colorPalette.disabledIcon));
        this.hairlineView = view;
    }
}
