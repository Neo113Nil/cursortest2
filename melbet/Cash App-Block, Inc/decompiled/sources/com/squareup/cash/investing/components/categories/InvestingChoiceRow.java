package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingChoiceRow extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Drawable choiceCheckedDrawable;
    public final Drawable choiceUncheckedDrawable;
    public final ColorPalette colorPalette;
    public final AppCompatTextView descriptionView;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingChoiceRow(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_checkbox_unchecked, null);
        drawableCompat.getClass();
        this.choiceUncheckedDrawable = drawableCompat;
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_checkbox_checked, Integer.valueOf(colorPalette.investing));
        drawableCompat2.getClass();
        this.choiceCheckedDrawable = drawableCompat2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        final int i = 0;
        appCompatTextView.setTextSize(0, Views.sp((View) appCompatTextView, 18.0f));
        appCompatTextView.setTextColor(colorPalette.label);
        appCompatTextView.setCompoundDrawablePadding(getDip(16));
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        BundleKt.setTypeface(appCompatTextView2, R.font.cashsans_regular);
        appCompatTextView2.setTextSize(0, Views.sp((View) appCompatTextView2, 16.0f));
        appCompatTextView2.setTextColor(colorPalette.secondaryLabel);
        appCompatTextView2.setLetterSpacing(0.01f);
        appCompatTextView2.setLineHeight(Views.sp((View) appCompatTextView2, 24));
        this.descriptionView = appCompatTextView2;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i2) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i3 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i4 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i5 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i6 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        });
        final int i2 = 1;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i3 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i4 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i5 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i6 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        });
        final int i3 = 2;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i32 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i4 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i5 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i6 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        });
        final int i4 = 3;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i32 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i42 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i5 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i6 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        }));
        final int i5 = 4;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i5;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i32 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i42 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i52 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i6 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        });
        final int i6 = 5;
        leftTo2.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i6;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i32 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i42 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i52 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i62 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i7 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        });
        final int i7 = 6;
        ContourLayout.layoutBy$default(this, appCompatTextView2, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingChoiceRow$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingChoiceRow f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i7;
                InvestingChoiceRow investingChoiceRow = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.descriptionView));
                    case 1:
                        int i32 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(32) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i42 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(43));
                    case 3:
                        int i52 = InvestingChoiceRow.$r8$clinit;
                        return new YInt(investingChoiceRow.m3814getYdipdBGyhoQ(16) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 4:
                        int i62 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(investingChoiceRow.m3813getXdipTENr5nQ(72) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 5:
                        int i72 = InvestingChoiceRow.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - investingChoiceRow.m3813getXdipTENr5nQ(30));
                    default:
                        int i8 = InvestingChoiceRow.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingChoiceRow.m3810bottomdBGyhoQ(investingChoiceRow.titleView));
                }
            }
        }));
        setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
    }
}
