package com.squareup.cash.investing.components.metrics;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.molecule.PlatformKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.JsonLogicResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingEarningsTileKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InvestingEarningsViewModel f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ InvestingEarningsTileKt$$ExternalSyntheticLambda3(InvestingEarningsViewModel investingEarningsViewModel, long j) {
        this.f$0 = investingEarningsViewModel;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.$r8$classId;
        long j = this.f$1;
        InvestingEarningsViewModel investingEarningsViewModel = this.f$0;
        switch (i2) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 191.0f);
                    AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(25);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    boolean changedInstance = gapComposer.changedInstance(investingEarningsViewModel) | gapComposer.changed(j);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalMapPinKt$$ExternalSyntheticLambda5(investingEarningsViewModel, j, 9);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function1, m277height3ABfNKs, androidView_androidKt$NoOpUpdate$1, null, (Function1) rememberedValue2, gapComposer, 54, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                final InvestingEarningsGraphDotView investingEarningsGraphDotView = (InvestingEarningsGraphDotView) obj2;
                investingEarningsGraphDotView.getClass();
                InvestingEarningsViewModel.Content.InvestingEarningsGraphModel investingEarningsGraphModel = (InvestingEarningsViewModel.Content.InvestingEarningsGraphModel) ((InvestingEarningsViewModel.Content) investingEarningsViewModel).earningsModels.get(intValue2);
                float dip = Views.dip((View) investingEarningsGraphDotView, 136);
                float f = investingEarningsGraphModel.rangeAmount;
                float f2 = investingEarningsGraphModel.minAmount;
                if (f == RecyclerView.DECELERATION_RATE) {
                    f = 1.0f;
                }
                float f3 = dip / f;
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(j);
                ThemeInfo themeInfo = investingEarningsGraphDotView.themeInfo;
                AppCompatImageView appCompatImageView = investingEarningsGraphDotView.actualIcon;
                AppCompatImageView appCompatImageView2 = investingEarningsGraphDotView.expectedIcon;
                View view = investingEarningsGraphDotView.hairlineView;
                long j2 = investingEarningsGraphModel.actual;
                long j3 = investingEarningsGraphModel.expect;
                if (f2 >= RecyclerView.DECELERATION_RATE || investingEarningsGraphModel.rangeAmount + f2 <= RecyclerView.DECELERATION_RATE) {
                    i = 1;
                    view.setVisibility(8);
                } else {
                    int abs = Math.abs((int) (f3 * f2)) + investingEarningsGraphDotView.adjustPosition;
                    ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
                    ByteArrayProtoReader32 bottomTo = ContourLayout.bottomTo(new DatePickerKt$$ExternalSyntheticLambda10(abs, 14));
                    final int i3 = 10;
                    Function1 function12 = new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i4 = i3;
                            InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                            ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                            switch (i4) {
                                case 0:
                                    int i5 = InvestingEarningsGraphDotView.$r8$clinit;
                                    return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                case 1:
                                    int i6 = InvestingEarningsGraphDotView.$r8$clinit;
                                    return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                case 2:
                                    int i7 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                case 3:
                                    int i8 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                case 4:
                                    int i9 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                case 5:
                                    int i10 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                case 6:
                                    int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                case 7:
                                    int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                case 8:
                                    int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                case 9:
                                    int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                default:
                                    int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                            }
                        }
                    };
                    i = 1;
                    bottomTo.heightOf(1, function12);
                    ContourLayout.layoutBy$default(investingEarningsGraphDotView, view, matchParentX, bottomTo);
                    view.setVisibility(0);
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(i);
                gradientDrawable.setColor(m694toArgb8_81llA);
                appCompatImageView2.setBackground(gradientDrawable);
                view.setBackground(new DividerDrawable(ColorKt.m694toArgb8_81llA(themeInfo.arcadeColors.component.ui.divider.border)));
                final int i4 = (int) ((j3 - f2) * f3);
                final int i5 = (int) ((j2 - f2) * f3);
                boolean z = Math.abs(i4 - i5) < investingEarningsGraphDotView.thresholdInPixel;
                final int i6 = 3;
                if (investingEarningsGraphModel.hasExpectedEarnings) {
                    if (z) {
                        final int i7 = 1;
                        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i7;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i8 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i9 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i10 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        final int i8 = 2;
                        centerHorizontallyTo.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i8;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i9 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i10 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i9 = i7;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                int i10 = i5;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i9) {
                                    case 0:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 1:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 2:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    default:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                }
                                return new YInt((layoutSpec.getParent().m4372bottomh0YXg9w() - i10) - investingEarningsGraphDotView2.adjustPosition);
                            }
                        });
                        centerVerticallyTo.heightOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i6;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i9 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i10 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ContourLayout.layoutBy$default(investingEarningsGraphDotView, appCompatImageView2, centerHorizontallyTo, centerVerticallyTo);
                    } else {
                        ByteArrayProtoReader32 centerHorizontallyTo2 = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(23));
                        final int i9 = 4;
                        centerHorizontallyTo2.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i9;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i10 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        final int i10 = 2;
                        ByteArrayProtoReader32 centerVerticallyTo2 = ContourLayout.centerVerticallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i92 = i10;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                int i102 = i4;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i92) {
                                    case 0:
                                        int i11 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 1:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 2:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    default:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                }
                                return new YInt((layoutSpec.getParent().m4372bottomh0YXg9w() - i102) - investingEarningsGraphDotView2.adjustPosition);
                            }
                        });
                        final int i11 = 5;
                        centerVerticallyTo2.heightOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i11;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i12 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i13 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ContourLayout.layoutBy$default(investingEarningsGraphDotView, appCompatImageView2, centerHorizontallyTo2, centerVerticallyTo2);
                    }
                    appCompatImageView2.setVisibility(0);
                } else {
                    appCompatImageView2.setVisibility(8);
                }
                if (investingEarningsGraphModel.hasActualEarnings) {
                    Colors.Semantic semantic = themeInfo.arcadeColors.semantic;
                    Colors.Semantic.Background background = semantic.background;
                    int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(semantic.icon.standard);
                    boolean z2 = j2 >= j3;
                    appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    final int i12 = 6;
                    if (z2) {
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        Context context = investingEarningsGraphDotView.getContext();
                        context.getClass();
                        zzd zzdVar = Icons.Companion;
                        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.icon_check_16, Integer.valueOf(ColorKt.m694toArgb8_81llA(semantic.icon.inverse)));
                        drawableCompat.getClass();
                        LayerDrawable layerWith = JsonLogicResult.layerWith(gradientDrawable2, drawableCompat);
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setShape(1);
                        gradientDrawable3.setStroke(investingEarningsGraphDotView.getDip(2), ColorKt.m694toArgb8_81llA(background.f1047app));
                        gradientDrawable3.setColor(m694toArgb8_81llA2);
                        appCompatImageView.setBackground(gradientDrawable3);
                        appCompatImageView.setImageDrawable(layerWith);
                    } else {
                        GradientDrawable gradientDrawable4 = new GradientDrawable();
                        Context context2 = investingEarningsGraphDotView.getContext();
                        context2.getClass();
                        zzd zzdVar2 = Icons.Companion;
                        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context2, R.drawable.icon_navigation_close, Integer.valueOf(m694toArgb8_81llA2));
                        drawableCompat2.getClass();
                        LayerDrawable layerWith2 = JsonLogicResult.layerWith(gradientDrawable4, drawableCompat2);
                        GradientDrawable gradientDrawable5 = new GradientDrawable();
                        gradientDrawable5.setShape(1);
                        gradientDrawable5.setStroke(investingEarningsGraphDotView.getDip(2), m694toArgb8_81llA2);
                        gradientDrawable5.setColor(ColorKt.m694toArgb8_81llA(background.f1047app));
                        appCompatImageView.setBackground(gradientDrawable5);
                        appCompatImageView.setPaddingRelative(investingEarningsGraphDotView.getDip(6), investingEarningsGraphDotView.getDip(6), investingEarningsGraphDotView.getDip(6), investingEarningsGraphDotView.getDip(6));
                        appCompatImageView.setImageDrawable(layerWith2);
                    }
                    if (z) {
                        final int i13 = 0;
                        ByteArrayProtoReader32 centerHorizontallyTo3 = ContourLayout.centerHorizontallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i13;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        centerHorizontallyTo3.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i12;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ByteArrayProtoReader32 centerVerticallyTo3 = ContourLayout.centerVerticallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i92 = i13;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                int i102 = i5;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i92) {
                                    case 0:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 1:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 2:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    default:
                                        int i14 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                }
                                return new YInt((layoutSpec.getParent().m4372bottomh0YXg9w() - i102) - investingEarningsGraphDotView2.adjustPosition);
                            }
                        });
                        final int i14 = 7;
                        centerVerticallyTo3.heightOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i14;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i142 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i15 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ContourLayout.layoutBy$default(investingEarningsGraphDotView, appCompatImageView, centerHorizontallyTo3, centerVerticallyTo3);
                    } else {
                        ByteArrayProtoReader32 centerHorizontallyTo4 = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(24));
                        final int i15 = 8;
                        centerHorizontallyTo4.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i15;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i142 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i152 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        final int i16 = 3;
                        ByteArrayProtoReader32 centerVerticallyTo4 = ContourLayout.centerVerticallyTo(new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i92 = i16;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                int i102 = i5;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i92) {
                                    case 0:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 1:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    case 2:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                    default:
                                        int i142 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        break;
                                }
                                return new YInt((layoutSpec.getParent().m4372bottomh0YXg9w() - i102) - investingEarningsGraphDotView2.adjustPosition);
                            }
                        });
                        final int i17 = 9;
                        centerVerticallyTo4.heightOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingEarningsGraphDotView$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i42 = i17;
                                InvestingEarningsGraphDotView investingEarningsGraphDotView2 = investingEarningsGraphDotView;
                                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj3;
                                switch (i42) {
                                    case 0:
                                        int i52 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec) - investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4));
                                    case 1:
                                        int i62 = InvestingEarningsGraphDotView.$r8$clinit;
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + SVG$Unit$EnumUnboxingLocalUtility.m$1(layoutSpec));
                                    case 2:
                                        int i72 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 3:
                                        int i82 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 4:
                                        int i92 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 5:
                                        int i102 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 6:
                                        int i112 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 7:
                                        int i122 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 8:
                                        int i132 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new XInt(investingEarningsGraphDotView2.m3813getXdipTENr5nQ(4) + investingEarningsGraphDotView2.m3813getXdipTENr5nQ(investingEarningsGraphDotView2.dotDiameter));
                                    case 9:
                                        int i142 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(4) + investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(investingEarningsGraphDotView2.dotDiameter));
                                    default:
                                        int i152 = InvestingEarningsGraphDotView.$r8$clinit;
                                        layoutSpec.getClass();
                                        return new YInt(investingEarningsGraphDotView2.m3814getYdipdBGyhoQ(1));
                                }
                            }
                        });
                        ContourLayout.layoutBy$default(investingEarningsGraphDotView, appCompatImageView, centerHorizontallyTo4, centerVerticallyTo4);
                    }
                    appCompatImageView.setVisibility(0);
                } else {
                    appCompatImageView.setVisibility(8);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingEarningsTileKt$$ExternalSyntheticLambda3(InvestingEarningsViewModel investingEarningsViewModel, long j, int i) {
        this.f$0 = investingEarningsViewModel;
        this.f$1 = j;
    }
}
