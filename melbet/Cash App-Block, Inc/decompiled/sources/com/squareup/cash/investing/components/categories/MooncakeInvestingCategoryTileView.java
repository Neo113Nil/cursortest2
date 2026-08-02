package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.components.PushOnPressAnimator;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MooncakeInvestingCategoryTileView extends ContourLayout {
    public final GradientDrawable gradientDrawable;
    public final ImageView iconView;
    public final RealImageLoader imageLoader;
    public final AppCompatTextView labelView;

    public MooncakeInvestingCategoryTileView(Context context, RealImageLoader realImageLoader) {
        super(context);
        this.imageLoader = realImageLoader;
        GradientDrawable gradientDrawable = new GradientDrawable();
        final int i = 0;
        gradientDrawable.setColors(new int[]{-1, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setCornerRadius(Views.dip((View) this, 24.0f));
        gradientDrawable.setAlpha(45);
        this.gradientDrawable = gradientDrawable;
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        final int i2 = 1;
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(-1);
        imageView.setBackground(gradientDrawable2);
        this.iconView = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextSize(16.0f);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setAutoSizeTextTypeWithDefaults(1);
        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(getDip(10), getDip(16), 1, 0);
        appCompatTextView.setBreakStrategy(0);
        this.labelView = appCompatTextView;
        setStateListAnimator(new PushOnPressAnimator(this, 30));
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(9));
        centerHorizontallyTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i3) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        });
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i3) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        });
        final int i3 = 2;
        centerVerticallyTo.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, imageView, centerHorizontallyTo, centerVerticallyTo);
        final int i4 = 3;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        });
        final int i5 = 4;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        });
        final int i6 = 5;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryTileView$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeInvestingCategoryTileView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i6;
                MooncakeInvestingCategoryTileView mooncakeInvestingCategoryTileView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(56));
                    case 1:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2(layoutSpec) - mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(24));
                    case 2:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(56));
                    case 3:
                        return new XInt(mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12) + SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left);
                    case 4:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m(layoutSpec) - mooncakeInvestingCategoryTileView.m3813getXdipTENr5nQ(12));
                    default:
                        layoutSpec.getClass();
                        return new YInt(mooncakeInvestingCategoryTileView.m3814getYdipdBGyhoQ(36) + mooncakeInvestingCategoryTileView.m3810bottomdBGyhoQ(mooncakeInvestingCategoryTileView.iconView));
                }
            }
        }));
    }
}
