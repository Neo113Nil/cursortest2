package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingFilterResultRow extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MooncakePillButton resetFiltersView;
    public final AppCompatTextView resultCountView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingFilterResultRow(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(colorPalette.label);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        final int i = 0;
        appCompatTextView.setTextSize(0, Views.sp((View) appCompatTextView, 16.0f));
        this.resultCountView = appCompatTextView;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, null, MooncakePillButton.Style.TERTIARY, 6, null);
        this.resetFiltersView = mooncakePillButton;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterResultRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterResultRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                InvestingFilterResultRow investingFilterResultRow = this.f$0;
                switch (i2) {
                    case 0:
                        return new YInt(investingFilterResultRow.m3814getYdipdBGyhoQ(48) + investingFilterResultRow.m3815heightdBGyhoQ(investingFilterResultRow.resultCountView));
                    case 1:
                        int i3 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(investingFilterResultRow.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        int i4 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingFilterResultRow.m3813getXdipTENr5nQ(10));
                }
            }
        });
        final int i2 = 1;
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterResultRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterResultRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                InvestingFilterResultRow investingFilterResultRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingFilterResultRow.m3814getYdipdBGyhoQ(48) + investingFilterResultRow.m3815heightdBGyhoQ(investingFilterResultRow.resultCountView));
                    case 1:
                        int i3 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(investingFilterResultRow.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        int i4 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingFilterResultRow.m3813getXdipTENr5nQ(10));
                }
            }
        }), ContourLayout.centerVerticallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(1)));
        final int i3 = 2;
        ContourLayout.layoutBy$default(this, mooncakePillButton, ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterResultRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterResultRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                InvestingFilterResultRow investingFilterResultRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingFilterResultRow.m3814getYdipdBGyhoQ(48) + investingFilterResultRow.m3815heightdBGyhoQ(investingFilterResultRow.resultCountView));
                    case 1:
                        int i32 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(investingFilterResultRow.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        int i4 = InvestingFilterResultRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingFilterResultRow.m3813getXdipTENr5nQ(10));
                }
            }
        }), ContourLayout.centerVerticallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(2)));
    }
}
