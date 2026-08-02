package com.squareup.cash.portfolio.graphs.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes6.dex */
public final class InvestingPortfolioAmountView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ComposeView composeHeaderView;
    public final FigmaTextView staleDataMessageView;
    public final FigmaTextView titleView;
    public final LinearLayout uptoDateDataViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingPortfolioAmountView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        TextThemeInfo textThemeInfo = TextStyles.bigMoney;
        final int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, textThemeInfo);
        this.titleView = figmaTextView;
        TextThemeInfo textThemeInfo2 = TextStyles.smallTitle;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, textThemeInfo2);
        FigmaTextView figmaTextView3 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView3, textThemeInfo2);
        FigmaTextView figmaTextView4 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView4, textThemeInfo2);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setVisibility(8);
        this.composeHeaderView = composeView;
        LinearLayout linearLayout = new LinearLayout(context);
        final int i2 = 0;
        linearLayout.setOrientation(0);
        final int i3 = 1;
        linearLayout.setGravity(1);
        linearLayout.addView(figmaTextView2);
        linearLayout.addView(figmaTextView3);
        linearLayout.addView(figmaTextView4);
        ViewGroup.LayoutParams layoutParams = figmaTextView3.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(getDip(20));
        marginLayoutParams.setMarginEnd(getDip(20));
        figmaTextView3.setLayoutParams(marginLayoutParams);
        this.uptoDateDataViews = linearLayout;
        FigmaTextView figmaTextView5 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView5, textThemeInfo2);
        figmaTextView5.setText(R.string.investing_portfolio_stale_data);
        figmaTextView5.setTextColor(colorPalette.placeholderLabel);
        Views.setCompoundDrawableStart(figmaTextView5, PlatformKt.getDrawableCompat(context, R.drawable.investing_stale_data_caution, null));
        final int i4 = 5;
        figmaTextView5.setCompoundDrawablePadding(getDip(5));
        figmaTextView5.setGravity(16);
        this.staleDataMessageView = figmaTextView5;
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new PoolsListViewKt$$ExternalSyntheticLambda6(13));
        centerHorizontallyTo.widthOf(2, new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i5) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        });
        ContourLayout.layoutBy$default(this, figmaTextView, centerHorizontallyTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i3;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i5) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        }));
        ContourLayout.layoutBy$default(this, linearLayout, ContourLayout.matchParentX(getDip(16), getDip(16)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i5) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        }));
        final int i5 = 3;
        ContourLayout.layoutBy$default(this, figmaTextView5, ContourLayout.centerHorizontallyTo(new PoolsListViewKt$$ExternalSyntheticLambda6(14)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        }));
        final int i6 = 4;
        ContourLayout.layoutBy$default(this, composeView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i6;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        }));
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingPortfolioAmountView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i4;
                InvestingPortfolioAmountView investingPortfolioAmountView = this.f$0;
                switch (i52) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i62 = InvestingPortfolioAmountView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve() - investingPortfolioAmountView.m3813getXdipTENr5nQ(24));
                    case 1:
                        int i7 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i8 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 3:
                        int i9 = InvestingPortfolioAmountView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(8) + investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.titleView));
                    case 4:
                        int i10 = InvestingPortfolioAmountView.$r8$clinit;
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    default:
                        return new YInt(investingPortfolioAmountView.m3814getYdipdBGyhoQ(11) + Math.max(Math.max(investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.uptoDateDataViews), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.staleDataMessageView)), investingPortfolioAmountView.m3810bottomdBGyhoQ(investingPortfolioAmountView.composeHeaderView)));
                }
            }
        });
        figmaTextView.setGravity(1);
    }
}
