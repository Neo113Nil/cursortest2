package com.squareup.cash.investing.components.performance;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.JsonLogicResult;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SectionRowView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ColorPalette colorPalette;
    public final AppCompatTextView labelView;
    public final AppCompatImageView moreInfoView;
    public final AppCompatImageView valueIconView;
    public final AppCompatTextView valueView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionRowView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView, TextStyles.smallTitle);
        appCompatTextView.setGravity(5);
        this.valueView = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.valueIconView = appCompatImageView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallBody);
        appCompatTextView2.setTextColor(colorPalette.label);
        this.labelView = appCompatTextView2;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        Context context2 = getContext();
        context2.getClass();
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context2, R.drawable.investing_crypto_components_section_row_more_info, null);
        drawableCompat.getClass();
        int i = colorPalette.secondaryBackground;
        GradientDrawable gradientDrawable = new GradientDrawable();
        final int i2 = 1;
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        appCompatImageView2.setImageDrawable(JsonLogicResult.layerWith(gradientDrawable, drawableCompat));
        this.moreInfoView = appCompatImageView2;
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
        contourWidthMatchParent();
        contourHeightWrapContent();
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(1));
        final int i3 = 2;
        leftTo.rightTo(2, new InvestmentEntityQueries$$ExternalSyntheticLambda1(4));
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo, ContourLayout.topTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(5)));
        final int i4 = 0;
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.performance.SectionRowView$$ExternalSyntheticLambda4
            public final /* synthetic */ SectionRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                SectionRowView sectionRowView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i5) {
                    case 0:
                        int i6 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(sectionRowView.m3816leftTENr5nQ(sectionRowView.valueView) - sectionRowView.getDip(6));
                    case 1:
                        int i7 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(sectionRowView.m3812centerYdBGyhoQ(sectionRowView.valueView));
                    default:
                        int i8 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = sectionRowView.moreInfoView;
                        return new XInt(appCompatImageView3.getVisibility() == 0 ? sectionRowView.m3816leftTENr5nQ(appCompatImageView3) - sectionRowView.getDip(16) : layoutSpec.getParent().m4374rightblrYgr0());
                }
            }
        });
        rightTo.leftTo(2, new InvestmentEntityQueries$$ExternalSyntheticLambda1(6));
        ContourLayout.layoutBy$default(this, appCompatImageView, rightTo, ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.performance.SectionRowView$$ExternalSyntheticLambda4
            public final /* synthetic */ SectionRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                SectionRowView sectionRowView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i5) {
                    case 0:
                        int i6 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(sectionRowView.m3816leftTENr5nQ(sectionRowView.valueView) - sectionRowView.getDip(6));
                    case 1:
                        int i7 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(sectionRowView.m3812centerYdBGyhoQ(sectionRowView.valueView));
                    default:
                        int i8 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = sectionRowView.moreInfoView;
                        return new XInt(appCompatImageView3.getVisibility() == 0 ? sectionRowView.m3816leftTENr5nQ(appCompatImageView3) - sectionRowView.getDip(16) : layoutSpec.getParent().m4374rightblrYgr0());
                }
            }
        }));
        ByteArrayProtoReader32 rightTo2 = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.investing.components.performance.SectionRowView$$ExternalSyntheticLambda4
            public final /* synthetic */ SectionRowView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i3;
                SectionRowView sectionRowView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i5) {
                    case 0:
                        int i6 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(sectionRowView.m3816leftTENr5nQ(sectionRowView.valueView) - sectionRowView.getDip(6));
                    case 1:
                        int i7 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(sectionRowView.m3812centerYdBGyhoQ(sectionRowView.valueView));
                    default:
                        int i8 = SectionRowView.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageView appCompatImageView3 = sectionRowView.moreInfoView;
                        return new XInt(appCompatImageView3.getVisibility() == 0 ? sectionRowView.m3816leftTENr5nQ(appCompatImageView3) - sectionRowView.getDip(16) : layoutSpec.getParent().m4374rightblrYgr0());
                }
            }
        });
        rightTo2.leftTo(2, new InvestmentEntityQueries$$ExternalSyntheticLambda1(7));
        ContourLayout.layoutBy$default(this, appCompatTextView, rightTo2, ContourLayout.topTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(8)));
        ContourLayout.layoutBy$default(this, appCompatImageView2, ContourLayout.rightTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(2)), ContourLayout.topTo(new InvestmentEntityQueries$$ExternalSyntheticLambda1(3)));
    }
}
