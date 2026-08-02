package com.squareup.cash.investing.components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.os.BundleKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.common.InvestingImageView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.contour.errors.CircularReferenceDetected;
import com.squareup.contour.utils.XYIntUtilsKt$unwrapXIntLambda$1;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsCollapsedToolbar extends ContourLayout {
    public final AppCompatTextView subtitleDescriptionView;
    public final InvestingImageView subtitleIconView;
    public final AppCompatTextView subtitleView;
    public final ThemeInfo themeInfo;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockDetailsCollapsedToolbar(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        this.themeInfo = themeInfo;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(ColorKt.m694toArgb8_81llA(themeInfo.arcadeColors.semantic.text.standard));
        Strings.applyStyle(appCompatTextView, TextStyles.mainTitle);
        appCompatTextView.setPaddingRelative(appCompatTextView.getPaddingStart(), appCompatTextView.getPaddingTop(), Views.dip((View) appCompatTextView, 40), appCompatTextView.getPaddingBottom());
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        final int i = 1;
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView2, TextStyles.smallTitle);
        BundleKt.setTypeface(appCompatTextView2, R.font.cashsans_medium);
        appCompatTextView2.setGravity(16);
        this.subtitleView = appCompatTextView2;
        InvestingImageView investingImageView = new InvestingImageView(context, realImageLoader);
        investingImageView.setBaselineAlignBottom(true);
        investingImageView.setAdjustViewBounds(true);
        this.subtitleIconView = investingImageView;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView3, TextStyles.smallBody);
        BundleKt.setTypeface(appCompatTextView3, R.font.cashsans_medium);
        appCompatTextView3.setGravity(16);
        this.subtitleDescriptionView = appCompatTextView3;
        contourHeightWrapContent();
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i));
        final int i2 = 2;
        leftTo.rightTo(1, new MyFirstConfigurationView$$ExternalSyntheticLambda2(i2));
        final int i3 = 3;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.topTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i3)));
        final int i4 = 4;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(i4));
        leftTo2.widthOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i2;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = new ByteArrayProtoReader32(3, new XYIntUtilsKt$unwrapXIntLambda$1(1, new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i3;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        }));
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i5 = i4;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i5) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, investingImageView, leftTo2, byteArrayProtoReader32);
        final int i5 = 5;
        final int i6 = 6;
        ContourLayout.layoutBy$default(this, appCompatTextView2, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i5;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        }), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i6;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        }));
        final int i7 = 0;
        ContourLayout.layoutBy$default(this, appCompatTextView3, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        }), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.InvestingStockDetailsCollapsedToolbar$$ExternalSyntheticLambda1
            public final /* synthetic */ InvestingStockDetailsCollapsedToolbar f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i52 = i7;
                InvestingStockDetailsCollapsedToolbar investingStockDetailsCollapsedToolbar = this.f$0;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i52) {
                    case 0:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3819topdBGyhoQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 1:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(6) + investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleView));
                    case 2:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3813getXdipTENr5nQ(14));
                    case 3:
                        AppCompatTextView appCompatTextView4 = investingStockDetailsCollapsedToolbar.subtitleView;
                        appCompatTextView4.getClass();
                        try {
                            if (appCompatTextView4.getParent() != investingStockDetailsCollapsedToolbar) {
                                throw new IllegalArgumentException("Referencing view outside of ViewGroup.");
                            }
                            ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.squareup.contour.ContourLayout.LayoutSpec");
                            }
                            return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(2) + ((ContourLayout.LayoutSpec) layoutParams).m3821baselineh0YXg9w$contour_release());
                        } catch (CircularReferenceDetected e) {
                            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                            stackTrace.getClass();
                            e.list.add(new CircularReferenceDetected.TraceElement(appCompatTextView4, (StackTraceElement) ArraysKt___ArraysKt.getOrNull(0, stackTrace), (StackTraceElement) ArraysKt___ArraysKt.getOrNull(1, stackTrace)));
                            throw e;
                        }
                    case 4:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3814getYdipdBGyhoQ(14));
                    case 5:
                        return new XInt(investingStockDetailsCollapsedToolbar.m3818rightTENr5nQ(investingStockDetailsCollapsedToolbar.subtitleIconView));
                    default:
                        return new YInt(investingStockDetailsCollapsedToolbar.m3810bottomdBGyhoQ(investingStockDetailsCollapsedToolbar.titleView));
                }
            }
        }));
    }
}
