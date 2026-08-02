package com.squareup.cash.investing.components.metrics;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;

/* loaded from: classes6.dex */
public final class InvestingFinancialGraphBarView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int barWidth;
    public int borderWidth;
    public final ColorPalette colorPalette;
    public final int hairlineHeight;
    public final View hairlineView;
    public final int minHeight;
    public final AppCompatImageView negProfitBarView;
    public final AppCompatImageView negRevenueBarView;
    public final AppCompatImageView profitBarView;
    public final Rect rect;
    public final AppCompatImageView revenueBarView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingFinancialGraphBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        this.borderWidth = getDip(2);
        this.barWidth = getDip(12);
        this.hairlineHeight = m3814getYdipdBGyhoQ(1);
        this.rect = new Rect();
        this.minHeight = getDip(8);
        this.revenueBarView = new AppCompatImageView(context);
        this.negRevenueBarView = new AppCompatImageView(context);
        this.profitBarView = new AppCompatImageView(context);
        this.negProfitBarView = new AppCompatImageView(context);
        View view = new View(context);
        view.setBackgroundColor(colorPalette.disabledIcon);
        this.hairlineView = view;
    }

    public final float getRadii() {
        return ((this.borderWidth * 2) + this.barWidth) / 2.0f;
    }

    public final void setBoundsAndVisibility(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        appCompatImageView.setVisibility(0);
        appCompatImageView2.setVisibility(8);
        appCompatImageView.setClipBounds(this.rect);
    }

    public final void setDividerColor(int i) {
        this.hairlineView.setBackgroundColor(i);
    }

    public final void setRevenueColor(int i) {
        Drawable background = this.revenueBarView.getBackground();
        background.getClass();
        ((GradientDrawable) background).setColor(i);
        Drawable background2 = this.negRevenueBarView.getBackground();
        background2.getClass();
        ((GradientDrawable) background2).setColor(i);
    }
}
