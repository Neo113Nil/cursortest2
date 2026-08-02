package com.squareup.cash.investing.components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.ComposeView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.InvestingMetricView;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import com.squareup.cash.mooncake.components.AlertDialogView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.util.BalanceAnimator;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MooncakeInvestingStockRowView extends ContourLayout {
    public final ComposeView iconView;
    public final RealImageLoader imageLoader;
    public final TextView metricReplacementLabelView;
    public final InvestingMetricView metricTextView;
    public final TextView subTitleView;
    public final TextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeInvestingStockRowView(Context context, RealImageLoader realImageLoader, BalanceAnimator balanceAnimator) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.iconView = composeView;
        TextView textView = new TextView(context);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(2);
        TextThemeInfo textThemeInfo = TextStyles.smallTitle;
        Strings.applyStyle(textView, textThemeInfo);
        textView.setTextColor(colorPalette.label);
        this.titleView = textView;
        TextView textView2 = new TextView(context);
        textView2.setEllipsize(truncateAt);
        final int i = 1;
        textView2.setMaxLines(1);
        Strings.applyStyle(textView2, TextStyles.smallBody);
        textView2.setTextColor(colorPalette.secondaryLabel);
        this.subTitleView = textView2;
        InvestingMetricView investingMetricView = new InvestingMetricView(context, balanceAnimator);
        final int i2 = 8;
        investingMetricView.setCompoundDrawablePadding(getDip(8));
        investingMetricView.setGravity(16);
        final int i3 = 0;
        investingMetricView.setTextSize(0, Views.sp((View) this, 16.0f));
        investingMetricView.setPadding(getDip(15), getDip(8), getDip(14), getDip(8));
        this.metricTextView = investingMetricView;
        TextView textView3 = new TextView(context);
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(1);
        Strings.applyStyle(textView3, textThemeInfo);
        textView3.setTextColor(colorPalette.placeholderLabel);
        this.metricReplacementLabelView = textView3;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i4 = i3;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i4) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        leftTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i4 = i;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i4) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        final int i4 = 7;
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i4));
        final int i5 = 2;
        centerVerticallyTo.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i5;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        ContourLayout.layoutBy$default(this, composeView, leftTo, centerVerticallyTo);
        final int i6 = 3;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i6;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        final int i7 = 4;
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i7;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i2));
        final int i8 = 5;
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i8;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        ContourLayout.layoutBy$default(this, textView, leftTo2, byteArrayProtoReader32);
        final int i9 = 6;
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i9;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        leftTo3.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i4;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
        final int i10 = 10;
        ContourLayout.layoutBy$default(this, textView2, leftTo3, ContourLayout.topTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i10)));
        ContourLayout.layoutBy$default(this, investingMetricView, ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i2;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        }), ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(11)));
        if (!investingMetricView.isLaidOut() || investingMetricView.isLayoutRequested()) {
            investingMetricView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(this, 10));
        } else {
            Rect rect = new Rect();
            investingMetricView.getHitRect(rect);
            rect.set(rect.left - getDip(8), rect.top - getDip(8), getDip(8) + rect.right, getDip(8) + rect.bottom);
            setTouchDelegate(new TouchDelegate(rect, investingMetricView));
        }
        final int i11 = 9;
        ContourLayout.layoutBy$default(this, textView3, ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i11;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        }), ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(12)));
        setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(colorPalette.background), 2));
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.MooncakeInvestingStockRowView$$ExternalSyntheticLambda3
            public final /* synthetic */ MooncakeInvestingStockRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int m4374rightblrYgr0;
                int dip;
                int m4374rightblrYgr02;
                int dip2;
                int i42 = i10;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = this.f$0;
                switch (i42) {
                    case 0:
                        return new XInt(mooncakeInvestingStockRowView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(40));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(40));
                    case 3:
                        return new XInt(mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(80) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 4:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        layoutSpec.getClass();
                        InvestingMetricView investingMetricView2 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView4 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView2.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView2);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView4.getVisibility() == 0) {
                            m4374rightblrYgr0 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView4);
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr0 = layoutSpec.getParent().m4374rightblrYgr0();
                            dip = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr0 - dip);
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(0));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeInvestingStockRowView.m3816leftTENr5nQ(mooncakeInvestingStockRowView.titleView));
                    case 7:
                        ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                        layoutSpec2.getClass();
                        InvestingMetricView investingMetricView3 = mooncakeInvestingStockRowView.metricTextView;
                        TextView textView5 = mooncakeInvestingStockRowView.metricReplacementLabelView;
                        if (investingMetricView3.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(investingMetricView3);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else if (textView5.getVisibility() == 0) {
                            m4374rightblrYgr02 = mooncakeInvestingStockRowView.m3816leftTENr5nQ(textView5);
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        } else {
                            m4374rightblrYgr02 = layoutSpec2.getParent().m4374rightblrYgr0();
                            dip2 = mooncakeInvestingStockRowView.getDip(16);
                        }
                        return new XInt(m4374rightblrYgr02 - dip2);
                    case 8:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.getDip(24));
                    case 9:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingStockRowView.m3813getXdipTENr5nQ(38));
                    default:
                        return new YInt(mooncakeInvestingStockRowView.m3814getYdipdBGyhoQ(72));
                }
            }
        });
    }

    public final void render(StockContentModel stockContentModel, boolean z) {
        Drawable drawable;
        Drawable drawable2;
        int i;
        stockContentModel.getClass();
        StockMetric stockMetric = stockContentModel.metric;
        String str = stockContentModel.upcomingLabel;
        setEntityToken(stockContentModel.investmentEntityToken);
        this.iconView.setContent(new ComposableLambdaImpl(new SkipPaymentView$$ExternalSyntheticLambda1(14, this, stockContentModel.avatar), true, 2011603626));
        String str2 = stockContentModel.title;
        TextView textView = this.titleView;
        textView.setText(str2);
        String str3 = stockContentModel.subTitle;
        TextView textView2 = this.subTitleView;
        if (str3 == null || str3.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setMaxLines(1);
            textView2.setVisibility(0);
            textView2.setText(str3);
        }
        InvestingMetricView investingMetricView = this.metricTextView;
        if (stockMetric == null) {
            investingMetricView.setVisibility(8);
        } else {
            boolean z2 = stockContentModel.isStale;
            int i2 = InvestingMetricView.$r8$clinit;
            investingMetricView.getClass();
            ThemeInfo themeInfo = investingMetricView.themeInfo;
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(z2 ? themeInfo.arcadeColors.semantic.text.disabled : themeInfo.arcadeColors.semantic.text.standard);
            investingMetricView.setTextColor(m694toArgb8_81llA);
            investingMetricView.setText(stockMetric.getText());
            InvestingCryptoImage netProfitIcon = stockMetric.getNetProfitIcon();
            int i3 = netProfitIcon == null ? -1 : InvestingMetricView.WhenMappings.$EnumSwitchMapping$0[netProfitIcon.ordinal()];
            if (i3 == -1) {
                drawable = null;
            } else {
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("Unsupported");
                    return;
                }
                if (i3 == 4) {
                    Context context = investingMetricView.getContext();
                    context.getClass();
                    zzd zzdVar = Icons.Companion;
                    drawable = PlatformKt.getDrawableCompat(context, R.drawable.icon_ticker_up_24, Integer.valueOf(m694toArgb8_81llA));
                } else {
                    if (i3 != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Context context2 = investingMetricView.getContext();
                    context2.getClass();
                    zzd zzdVar2 = Icons.Companion;
                    drawable = PlatformKt.getDrawableCompat(context2, R.drawable.icon_ticker_down_24, Integer.valueOf(m694toArgb8_81llA));
                }
            }
            Views.setCompoundDrawableStart(investingMetricView, drawable);
            if (z) {
                Context context3 = investingMetricView.getContext();
                context3.getClass();
                int ordinal = stockMetric.getBackgroundColorType().ordinal();
                if (ordinal == 0) {
                    i = themeInfo.colorPalette.investingCellAccessoryLight;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i = themeInfo.colorPalette.investingCellAccessoryDark;
                }
                drawable2 = PlatformKt.getDrawableCompat(context3, R.drawable.widget_header_button_background, Integer.valueOf(i));
            } else {
                drawable2 = null;
            }
            investingMetricView.setBackground(drawable2);
            investingMetricView.setVisibility(0);
        }
        TextView textView3 = this.metricReplacementLabelView;
        if (str == null || str.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str);
            investingMetricView.setVisibility(8);
        }
        ContourLayout.updateLayoutBy$default(this, textView, null, textView2.getVisibility() == 0 ? ContourLayout.bottomTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(6)) : ContourLayout.centerVerticallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(9)), 1);
    }

    public void setEntityToken(InvestmentEntityToken investmentEntityToken) {
        investmentEntityToken.getClass();
    }

    public final void setOnMetricClickListener(Function0<Unit> function0) {
        InvestingMetricView investingMetricView = this.metricTextView;
        if (function0 != null) {
            investingMetricView.setOnClickListener(new AlertDialogView$$ExternalSyntheticLambda0(1, function0));
        } else {
            investingMetricView.setOnClickListener(null);
            investingMetricView.setClickable(false);
        }
    }

    public void setWasClicked(boolean z) {
    }
}
