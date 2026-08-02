package com.squareup.cash.investing.components.metrics;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.navigation.fragment.FragmentKt;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingAnalystGraphView extends ContourLayout {
    public final AppCompatImageView barView;
    public final int dotDiameter;
    public final AppCompatImageView dotView;
    public final AppCompatTextView recommendTextView;
    public final AppCompatImageView recommendTipView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingAnalystGraphView(Context context) {
        super(context, null);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        int dip = getDip(16);
        this.dotDiameter = dip;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(17);
        int i = colorPalette.disabledLabel;
        int i2 = colorPalette.background;
        appCompatTextView.setBackground(FragmentKt.roundedRect(this.density * 16.0f, i));
        final int i3 = 4;
        appCompatTextView.setPadding(getDip(15), getDip(4), getDip(15), getDip(4));
        appCompatTextView.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_regular));
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setLineHeight(Views.sp((View) appCompatTextView, 24));
        appCompatTextView.setTextColor(ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(appCompatTextView).arcadeColors.semantic.text.inverse));
        this.recommendTextView = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.investing_components_stock_metrics_triangle_down);
        this.recommendTipView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setBackground(FragmentKt.roundedRect(this.density * 6.0f, ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(appCompatImageView2).arcadeColors.semantic.background.prominent)));
        this.barView = appCompatImageView2;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        final int i4 = 1;
        gradientDrawable.setShape(1);
        final int i5 = 2;
        gradientDrawable.setStroke(getDip(2), i2);
        gradientDrawable.setSize(dip, dip);
        appCompatImageView3.setBackground(gradientDrawable);
        this.dotView = appCompatImageView3;
        contourHeightWrapContent();
        int m3813getXdipTENr5nQ = m3813getXdipTENr5nQ(24);
        final int i6 = 0;
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i6;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i7) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i8 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i8 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        }), ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(22)));
        ContourLayout.layoutBy$default(this, appCompatImageView, ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i4;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i7) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i8 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i8 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        }), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i7 = i5;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i7) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i8 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i8 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new DatePickerKt$$ExternalSyntheticLambda10(m3813getXdipTENr5nQ, 12));
        leftTo.rightTo(1, new DatePickerKt$$ExternalSyntheticLambda10(m3813getXdipTENr5nQ, 13));
        final int i7 = 3;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i7;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i8 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i8 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        });
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i3;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i8 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i8 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatImageView2, leftTo, byteArrayProtoReader32);
        final int i8 = 5;
        final int i9 = 6;
        ContourLayout.layoutBy$default(this, appCompatImageView3, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i8;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i82 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i82 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        }), ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingAnalystGraphView f$1;

            {
                this.f$1 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i9;
                InvestingAnalystGraphView investingAnalystGraphView = this.f$1;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                switch (i72) {
                    case 0:
                        int m3813getXdipTENr5nQ2 = investingAnalystGraphView.m3813getXdipTENr5nQ(16);
                        int i82 = layoutSpec.getParent().padding().left;
                        AppCompatTextView appCompatTextView2 = investingAnalystGraphView.recommendTextView;
                        AppCompatImageView appCompatImageView4 = investingAnalystGraphView.dotView;
                        int m3817preferredWidthTENr5nQ = (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2) + i82 + m3813getXdipTENr5nQ2;
                        int m4374rightblrYgr0 = (layoutSpec.getParent().m4374rightblrYgr0() - (investingAnalystGraphView.m3817preferredWidthTENr5nQ(appCompatTextView2) / 2)) - m3813getXdipTENr5nQ2;
                        if (Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m3817preferredWidthTENr5nQ) >= 0) {
                            m3817preferredWidthTENr5nQ = Intrinsics.compare(investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4), m4374rightblrYgr0) > 0 ? m4374rightblrYgr0 : investingAnalystGraphView.m3811centerXTENr5nQ(appCompatImageView4);
                        }
                        return new XInt(m3817preferredWidthTENr5nQ);
                    case 1:
                        return new XInt(investingAnalystGraphView.m3811centerXTENr5nQ(investingAnalystGraphView.dotView));
                    case 2:
                        return new YInt(investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTextView) - investingAnalystGraphView.getDip(3));
                    case 3:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(7) + investingAnalystGraphView.m3810bottomdBGyhoQ(investingAnalystGraphView.recommendTipView));
                    case 4:
                        return new YInt(investingAnalystGraphView.m3814getYdipdBGyhoQ(12));
                    case 5:
                        return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView));
                    default:
                        return new YInt(investingAnalystGraphView.m3812centerYdBGyhoQ(investingAnalystGraphView.barView));
                }
            }
        }));
    }
}
