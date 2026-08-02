package com.squareup.cash.investing.components.metrics;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda8;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FinancialBarGraphKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ InvestingFinancialViewModel$Content f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ FinancialBarGraphKt$$ExternalSyntheticLambda8(int i, InvestingFinancialViewModel$Content investingFinancialViewModel$Content, long j, int i2, int i3) {
        this.f$0 = i;
        this.f$1 = investingFinancialViewModel$Content;
        this.f$2 = j;
        this.f$3 = i2;
        this.f$4 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int max;
        long j2;
        int max2;
        int i;
        View view;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 200.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                    final int i2 = this.f$0;
                    boolean changed = gapComposer.changed(i2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new DatePickerKt$$ExternalSyntheticLambda10(i2, 11);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj3) {
                        rememberedValue2 = new NewsArticleAdapter$$ExternalSyntheticLambda1(21);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    final InvestingFinancialViewModel$Content investingFinancialViewModel$Content = this.f$1;
                    boolean changedInstance = gapComposer.changedInstance(investingFinancialViewModel$Content) | gapComposer.changed(i2);
                    final long j3 = this.f$2;
                    boolean changed2 = changedInstance | gapComposer.changed(j3);
                    final int i3 = this.f$3;
                    boolean changed3 = changed2 | gapComposer.changed(i3);
                    final int i4 = this.f$4;
                    boolean changed4 = changed3 | gapComposer.changed(i4);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue3 == obj3) {
                        Object obj4 = new Function1() { // from class: com.squareup.cash.investing.components.metrics.FinancialBarGraphKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                LinearLayout linearLayout = (LinearLayout) obj5;
                                linearLayout.getClass();
                                Views.resizeAndBind$default(linearLayout, 4, null, new FinancialBarGraphKt$$ExternalSyntheticLambda16(linearLayout, 0), new FinancialBarGraphKt$$ExternalSyntheticLambda8(InvestingFinancialViewModel$Content.this, i2, j3, i3, i4), 14);
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(obj4);
                        rememberedValue3 = obj4;
                    }
                    AndroidView_androidKt.AndroidView(function1, m302paddingqDBjuR0$default, function12, null, (Function1) rememberedValue3, gapComposer, 432, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                final InvestingFinancialGraphBarView investingFinancialGraphBarView = (InvestingFinancialGraphBarView) obj2;
                investingFinancialGraphBarView.getClass();
                InvestingFinancialViewModel$Content.InvestingFinancialGraphModel investingFinancialGraphModel = (InvestingFinancialViewModel$Content.InvestingFinancialGraphModel) this.f$1.financialModels.get(intValue2);
                float f = investingFinancialGraphModel.maxAmount;
                float f2 = investingFinancialGraphModel.maxNegativeAmount;
                float f3 = f + f2;
                int i5 = this.f$0;
                float f4 = f3 == RecyclerView.DECELERATION_RATE ? i5 : i5 / f3;
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(this.f$2);
                View view2 = investingFinancialGraphBarView.hairlineView;
                int i6 = investingFinancialGraphBarView.minHeight;
                int i7 = investingFinancialGraphBarView.barWidth;
                Rect rect = investingFinancialGraphBarView.rect;
                AppCompatImageView appCompatImageView = investingFinancialGraphBarView.negRevenueBarView;
                AppCompatImageView appCompatImageView2 = investingFinancialGraphBarView.revenueBarView;
                AppCompatImageView appCompatImageView3 = investingFinancialGraphBarView.negProfitBarView;
                AppCompatImageView appCompatImageView4 = investingFinancialGraphBarView.profitBarView;
                ColorPalette colorPalette = investingFinancialGraphBarView.colorPalette;
                float f5 = f4;
                investingFinancialGraphBarView.borderWidth = investingFinancialGraphBarView.getDip(0);
                GradientDrawable gradientDrawable = new GradientDrawable();
                final int i8 = 4;
                gradientDrawable.setCornerRadii(new float[]{investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
                gradientDrawable.setColor(colorPalette.placeholderLabel);
                appCompatImageView2.setBackground(gradientDrawable);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadii(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii()});
                gradientDrawable2.setColor(colorPalette.placeholderLabel);
                appCompatImageView.setBackground(gradientDrawable2);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadii(new float[]{investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE});
                appCompatImageView4.setBackground(gradientDrawable3);
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setCornerRadii(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii(), investingFinancialGraphBarView.getRadii()});
                appCompatImageView3.setBackground(gradientDrawable4);
                Drawable background = appCompatImageView4.getBackground();
                background.getClass();
                ((GradientDrawable) background).setColor(m694toArgb8_81llA);
                Drawable background2 = appCompatImageView3.getBackground();
                background2.getClass();
                ((GradientDrawable) background2).setColor(m694toArgb8_81llA);
                long j4 = investingFinancialGraphModel.profit;
                long j5 = investingFinancialGraphModel.revenue;
                int i9 = f2 > RecyclerView.DECELERATION_RATE ? (int) (f5 * f2) : 0;
                long abs = Math.abs(j5);
                if (0 > abs || abs >= 100) {
                    j = j4;
                    max = Math.max((int) (Math.abs(j5) * f5), i6);
                } else {
                    j = j4;
                    max = 0;
                }
                long abs2 = Math.abs(j);
                if (0 > abs2 || abs2 >= 100) {
                    j2 = j5;
                    max2 = Math.max((int) (f5 * Math.abs(j)), i6);
                } else {
                    j2 = j5;
                    max2 = 0;
                }
                int max3 = Math.max(max - ((int) (Math.abs(j2) * f5)), investingFinancialGraphBarView.borderWidth);
                int max4 = Math.max(max2 - ((int) (Math.abs(j) * f5)), investingFinancialGraphBarView.borderWidth);
                if (j2 >= 0) {
                    ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(26));
                    i = i7;
                    centerHorizontallyTo.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i10 = i8;
                            InvestingFinancialGraphBarView investingFinancialGraphBarView2 = investingFinancialGraphBarView;
                            ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj5;
                            switch (i10) {
                                case 0:
                                    int i11 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 1:
                                    int i12 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 2:
                                    int i13 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 3:
                                    int i14 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingFinancialGraphBarView2.hairlineHeight);
                                default:
                                    int i15 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            }
                        }
                    });
                    ByteArrayProtoReader32 bottomTo = ContourLayout.bottomTo(new SegmentedControlKt$$ExternalSyntheticLambda8(i9, max3, 2));
                    bottomTo.heightOf(1, new DatePickerKt$$ExternalSyntheticLambda10(investingFinancialGraphBarView, max, 15));
                    ContourLayout.layoutBy$default(investingFinancialGraphBarView, appCompatImageView2, centerHorizontallyTo, bottomTo);
                    int i10 = investingFinancialGraphBarView.borderWidth;
                    rect.set(i10, 0, i10 + i, max - max3);
                    investingFinancialGraphBarView.setBoundsAndVisibility(appCompatImageView2, appCompatImageView);
                    view = view2;
                } else {
                    i = i7;
                    ByteArrayProtoReader32 centerHorizontallyTo2 = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(27));
                    final int i11 = 1;
                    centerHorizontallyTo2.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i102 = i11;
                            InvestingFinancialGraphBarView investingFinancialGraphBarView2 = investingFinancialGraphBarView;
                            ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj5;
                            switch (i102) {
                                case 0:
                                    int i112 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 1:
                                    int i12 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 2:
                                    int i13 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 3:
                                    int i14 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingFinancialGraphBarView2.hairlineHeight);
                                default:
                                    int i15 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            }
                        }
                    });
                    ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new SegmentedControlKt$$ExternalSyntheticLambda8(i9, max3, 3));
                    view = view2;
                    byteArrayProtoReader32.heightOf(1, new DatePickerKt$$ExternalSyntheticLambda10(investingFinancialGraphBarView, max, 16));
                    ContourLayout.layoutBy$default(investingFinancialGraphBarView, appCompatImageView, centerHorizontallyTo2, byteArrayProtoReader32);
                    int i12 = investingFinancialGraphBarView.borderWidth;
                    rect.set(i12, max3, i12 + i, max);
                    investingFinancialGraphBarView.setBoundsAndVisibility(appCompatImageView, appCompatImageView2);
                }
                if (j >= 0) {
                    ByteArrayProtoReader32 centerHorizontallyTo3 = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(28));
                    final int i13 = 2;
                    centerHorizontallyTo3.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i102 = i13;
                            InvestingFinancialGraphBarView investingFinancialGraphBarView2 = investingFinancialGraphBarView;
                            ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj5;
                            switch (i102) {
                                case 0:
                                    int i112 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 1:
                                    int i122 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 2:
                                    int i132 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 3:
                                    int i14 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingFinancialGraphBarView2.hairlineHeight);
                                default:
                                    int i15 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            }
                        }
                    });
                    ByteArrayProtoReader32 bottomTo2 = ContourLayout.bottomTo(new SegmentedControlKt$$ExternalSyntheticLambda8(i9, max4, 4));
                    bottomTo2.heightOf(1, new DatePickerKt$$ExternalSyntheticLambda10(investingFinancialGraphBarView, max2, 17));
                    ContourLayout.layoutBy$default(investingFinancialGraphBarView, appCompatImageView4, centerHorizontallyTo3, bottomTo2);
                    int i14 = investingFinancialGraphBarView.borderWidth;
                    rect.set(i14, 0, i14 + i, max2 - max4);
                    investingFinancialGraphBarView.setBoundsAndVisibility(appCompatImageView4, appCompatImageView3);
                } else {
                    final int i15 = 0;
                    ByteArrayProtoReader32 centerHorizontallyTo4 = ContourLayout.centerHorizontallyTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(29));
                    centerHorizontallyTo4.widthOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i102 = i15;
                            InvestingFinancialGraphBarView investingFinancialGraphBarView2 = investingFinancialGraphBarView;
                            ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj5;
                            switch (i102) {
                                case 0:
                                    int i112 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 1:
                                    int i122 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 2:
                                    int i132 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                                case 3:
                                    int i142 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new YInt(investingFinancialGraphBarView2.hairlineHeight);
                                default:
                                    int i152 = InvestingFinancialGraphBarView.$r8$clinit;
                                    layoutSpec.getClass();
                                    return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            }
                        }
                    });
                    ByteArrayProtoReader32 byteArrayProtoReader322 = ContourLayout.topTo(new SegmentedControlKt$$ExternalSyntheticLambda8(i9, max4, 5));
                    byteArrayProtoReader322.heightOf(1, new DatePickerKt$$ExternalSyntheticLambda10(investingFinancialGraphBarView, max2, 18));
                    ContourLayout.layoutBy$default(investingFinancialGraphBarView, appCompatImageView3, centerHorizontallyTo4, byteArrayProtoReader322);
                    int i16 = investingFinancialGraphBarView.borderWidth;
                    rect.set(i16, max4, i16 + i, max2);
                    investingFinancialGraphBarView.setBoundsAndVisibility(appCompatImageView3, appCompatImageView4);
                }
                if (0 <= j2 && j2 <= j) {
                    appCompatImageView2.bringToFront();
                } else if (j <= j2 && j2 < 1) {
                    appCompatImageView.bringToFront();
                } else if (0 <= j && j <= j2) {
                    appCompatImageView4.bringToFront();
                } else if (j2 <= j && j < 1) {
                    appCompatImageView3.bringToFront();
                }
                ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
                ByteArrayProtoReader32 bottomTo3 = ContourLayout.bottomTo(new DatePickerKt$$ExternalSyntheticLambda10(i9, 19));
                final int i17 = 3;
                bottomTo3.heightOf(1, new Function1() { // from class: com.squareup.cash.investing.components.metrics.InvestingFinancialGraphBarView$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i102 = i17;
                        InvestingFinancialGraphBarView investingFinancialGraphBarView2 = investingFinancialGraphBarView;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj5;
                        switch (i102) {
                            case 0:
                                int i112 = InvestingFinancialGraphBarView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            case 1:
                                int i122 = InvestingFinancialGraphBarView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            case 2:
                                int i132 = InvestingFinancialGraphBarView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                            case 3:
                                int i142 = InvestingFinancialGraphBarView.$r8$clinit;
                                layoutSpec.getClass();
                                return new YInt(investingFinancialGraphBarView2.hairlineHeight);
                            default:
                                int i152 = InvestingFinancialGraphBarView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt((investingFinancialGraphBarView2.borderWidth * 2) + investingFinancialGraphBarView2.barWidth);
                        }
                    }
                });
                View view3 = view;
                ContourLayout.layoutBy$default(investingFinancialGraphBarView, view3, matchParentX, bottomTo3);
                view3.bringToFront();
                investingFinancialGraphBarView.setDividerColor(this.f$3);
                investingFinancialGraphBarView.setRevenueColor(this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FinancialBarGraphKt$$ExternalSyntheticLambda8(InvestingFinancialViewModel$Content investingFinancialViewModel$Content, int i, long j, int i2, int i3) {
        this.f$1 = investingFinancialViewModel$Content;
        this.f$0 = i;
        this.f$2 = j;
        this.f$3 = i2;
        this.f$4 = i3;
    }
}
