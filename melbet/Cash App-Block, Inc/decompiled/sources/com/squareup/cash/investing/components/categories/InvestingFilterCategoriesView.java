package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.core.widget.NestedScrollView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewEvent;
import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingFilterCategoriesView extends ContourLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public int availableHeight;
    public final LinearLayout choiceRows;
    public Ui.EventReceiver eventReceiver;
    public final MooncakePillButton resetView;
    public final NestedScrollView scrollView;
    public final MooncakePillButton submitView;
    public final AppCompatTextView titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingFilterCategoriesView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(colorPalette.label);
        BundleKt.setTypeface(appCompatTextView, R.font.cashsans_medium);
        final int i = 0;
        appCompatTextView.setTextSize(0, Views.sp((View) appCompatTextView, 18.0f));
        this.titleView = appCompatTextView;
        LinearLayout linearLayout = new LinearLayout(context);
        final int i2 = 1;
        linearLayout.setOrientation(1);
        final int i3 = 3;
        linearLayout.setShowDividers(3);
        linearLayout.setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        this.choiceRows = linearLayout;
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.addView(linearLayout);
        this.scrollView = nestedScrollView;
        MooncakePillButton.Size size = MooncakePillButton.Size.LARGE;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, size, MooncakePillButton.Style.TERTIARY, 2, null);
        mooncakePillButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i4) {
                    case 0:
                        Ui.EventReceiver eventReceiver = investingFilterCategoriesView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FilterCategoriesViewEvent.ResetClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = investingFilterCategoriesView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FilterCategoriesViewEvent.SubmitClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.resetView = mooncakePillButton;
        MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context, null, size, MooncakePillButton.Style.PRIMARY, 2, null);
        mooncakePillButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i4) {
                    case 0:
                        Ui.EventReceiver eventReceiver = investingFilterCategoriesView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FilterCategoriesViewEvent.ResetClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = investingFilterCategoriesView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FilterCategoriesViewEvent.SubmitClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.submitView = mooncakePillButton2;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i4) {
                    case 0:
                        int i5 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i6 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatTextView, ContourLayout.centerHorizontallyTo(new MyFirstConfigurationView$$ExternalSyntheticLambda2(28)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i2;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i4) {
                    case 0:
                        int i5 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i6 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        }));
        ByteArrayProtoReader32 matchParentX = ContourLayout.matchParentX(0, 0);
        final int i4 = 2;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i42) {
                    case 0:
                        int i5 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i6 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        });
        byteArrayProtoReader32.heightOf(2, new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i3;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i42) {
                    case 0:
                        int i5 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i6 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, nestedScrollView, matchParentX, byteArrayProtoReader32);
        final int i5 = 4;
        ContourLayout.layoutBy$default(this, mooncakePillButton, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i5;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i42) {
                    case 0:
                        int i52 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i6 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        }));
        final int i6 = 5;
        ContourLayout.layoutBy$default(this, mooncakePillButton2, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterCategoriesView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterCategoriesView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i6;
                InvestingFilterCategoriesView investingFilterCategoriesView = this.f$0;
                switch (i42) {
                    case 0:
                        int i52 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(Math.min(((YInt) obj).value, investingFilterCategoriesView.getDip(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.submitView)));
                    case 1:
                        int i62 = InvestingFilterCategoriesView.$r8$clinit;
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
                    case 2:
                        int i7 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(20) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.titleView));
                    case 3:
                        int i8 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.availableHeight - (investingFilterCategoriesView.getDip(56) + (investingFilterCategoriesView.submitView.getHeight() + (investingFilterCategoriesView.resetView.getHeight() + investingFilterCategoriesView.m3819topdBGyhoQ(investingFilterCategoriesView.scrollView)))));
                    case 4:
                        int i9 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.m3814getYdipdBGyhoQ(12) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.scrollView));
                    default:
                        int i10 = InvestingFilterCategoriesView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterCategoriesView.getDip(24) + investingFilterCategoriesView.m3810bottomdBGyhoQ(investingFilterCategoriesView.resetView));
                }
            }
        }));
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.availableHeight = View.MeasureSpec.getSize(i2);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FilterCategoriesViewModel filterCategoriesViewModel) {
        filterCategoriesViewModel.getClass();
        if (filterCategoriesViewModel instanceof FilterCategoriesViewModel.Content) {
            FilterCategoriesViewModel.Content content = (FilterCategoriesViewModel.Content) filterCategoriesViewModel;
            this.titleView.setText(content.title);
            this.resetView.setText(content.resetLabel);
            this.submitView.setText(content.submitLabel);
            Views.resizeAndBind$default(this.choiceRows, content.choiceRows.size(), null, new RealGooglePayer$$ExternalSyntheticLambda0(this, 16), new SkipPaymentView$$ExternalSyntheticLambda1(19, content, this), 14);
        }
    }
}
