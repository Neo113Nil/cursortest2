package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ChildrenList$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.buynowpaylater.components.AfterPayOrderDetailsRemainingView;
import com.squareup.cash.buynowpaylater.components.SingleUsePaymentOrderDetailsView;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsView extends ComposeUiView {
    public final int horizontalPadding;
    public final AppCompatImageView infoTextIcon;
    public final FigmaTextView infoTextView;
    public Function1 onEventCallback;
    public final AfterPayOrderDetailsHeaderView orderDetailsHeaderView;
    public final AppCompatTextView purchaseDetailsTextView;
    public final LinearLayout purchaseDetailsTextViewContainer;
    public final AfterPayPurchaseDetailsView purchaseDetailsView;
    public final AfterPayOrderDetailsRemainingView remainingTextView;
    public final ScrollView scrollView;
    public final SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView;
    public final TimelineView timelineView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDetailsView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.onEventCallback = new LoanDetailsSheetKt$$ExternalSyntheticLambda3(24);
        Colors colors = ThemeHelpersKt.findThemeInfo(context).arcadeColors;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AfterPayOrderDetailsHeaderView afterPayOrderDetailsHeaderView = new AfterPayOrderDetailsHeaderView(context, realImageLoader);
        this.orderDetailsHeaderView = afterPayOrderDetailsHeaderView;
        AfterPayOrderDetailsRemainingView afterPayOrderDetailsRemainingView = new AfterPayOrderDetailsRemainingView(context);
        this.remainingTextView = afterPayOrderDetailsRemainingView;
        TimelineView timelineView = new TimelineView(context);
        this.timelineView = timelineView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.icon_info);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(colorPalette.placeholderIcon));
        this.infoTextIcon = appCompatImageView;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        figmaTextView.setIncludeFontPadding(false);
        int i = colorPalette.secondaryLabel;
        figmaTextView.setLinkTextColor(i);
        figmaTextView.setMovementMethod(BetterLinkMovementMethod.getInstance());
        figmaTextView.setHighlightColor(colorPalette.tertiaryLabel);
        figmaTextView.setClickable(true);
        figmaTextView.setPadding(figmaTextView.getPaddingLeft(), figmaTextView.getPaddingTop(), figmaTextView.getPaddingRight(), Views.dip((View) figmaTextView, 16));
        this.infoTextView = figmaTextView;
        AfterPayPurchaseDetailsView afterPayPurchaseDetailsView = new AfterPayPurchaseDetailsView(context);
        afterPayPurchaseDetailsView.setPadding(afterPayPurchaseDetailsView.getPaddingLeft(), afterPayPurchaseDetailsView.getPaddingTop(), afterPayPurchaseDetailsView.getPaddingRight(), Views.dip((View) afterPayPurchaseDetailsView, 8));
        this.purchaseDetailsView = afterPayPurchaseDetailsView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(i);
        appCompatTextView.setPadding(Views.dip((View) appCompatTextView, 24), Views.dip((View) appCompatTextView, 36), Views.dip((View) appCompatTextView, 0), Views.dip((View) appCompatTextView, 12));
        this.purchaseDetailsTextView = appCompatTextView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(colorPalette.behindBackground);
        linearLayout.addView(appCompatTextView);
        this.purchaseDetailsTextViewContainer = linearLayout;
        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView = new SingleUsePaymentOrderDetailsView(context, realImageLoader);
        singleUsePaymentOrderDetailsView.setVisibility(8);
        this.singleUsePaymentOrderDetailsView = singleUsePaymentOrderDetailsView;
        int dip = Views.dip((View) this, 24);
        this.horizontalPadding = dip;
        final ContourLayout contourLayout = new ContourLayout(context);
        contourLayout.contourHeightWrapContent();
        ContourLayout.layoutBy$default(contourLayout, afterPayOrderDetailsHeaderView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 7)));
        final int i2 = 5;
        ContourLayout.layoutBy$default(contourLayout, singleUsePaymentOrderDetailsView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i3) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        final int i3 = 6;
        ContourLayout.layoutBy$default(contourLayout, afterPayOrderDetailsRemainingView, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        final int i4 = 7;
        ContourLayout.layoutBy$default(contourLayout, timelineView, ContourLayout.matchParentX(dip, dip), ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new AfterPayOrderDetailsView$$ExternalSyntheticLambda8(this, 0));
        final int i5 = 1;
        leftTo.widthOf(1, new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 8));
        ContourLayout.layoutBy$default(contourLayout, appCompatImageView, leftTo, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        final int i6 = 2;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i6;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        });
        leftTo2.rightTo(1, new AfterPayOrderDetailsView$$ExternalSyntheticLambda8(this, 1));
        final int i7 = 0;
        ContourLayout.layoutBy$default(contourLayout, figmaTextView, leftTo2, ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i7;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        final int i8 = 3;
        ContourLayout.layoutBy$default(contourLayout, linearLayout, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i8;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        final int i9 = 4;
        ContourLayout.layoutBy$default(contourLayout, afterPayPurchaseDetailsView, ContourLayout.matchParentX(dip, dip), ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i9;
                AfterPayOrderDetailsView afterPayOrderDetailsView = this;
                ContourLayout contourLayout2 = contourLayout;
                ((ContourLayout.LayoutSpec) obj).getClass();
                switch (i32) {
                    case 0:
                        return new YInt(contourLayout2.m3819topdBGyhoQ(afterPayOrderDetailsView.infoTextIcon) - contourLayout2.m3814getYdipdBGyhoQ(4));
                    case 1:
                        return new YInt(contourLayout2.getDip(22) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.timelineView));
                    case 2:
                        return new XInt(contourLayout2.m3818rightTENr5nQ(afterPayOrderDetailsView.infoTextIcon) + afterPayOrderDetailsView.horizontalPadding);
                    case 3:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.infoTextView));
                    case 4:
                        return new YInt(contourLayout2.getDip(12) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.purchaseDetailsTextViewContainer));
                    case 5:
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.orderDetailsHeaderView));
                    case 6:
                        SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView2 = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                        return new YInt(contourLayout2.m3810bottomdBGyhoQ(singleUsePaymentOrderDetailsView2) + (singleUsePaymentOrderDetailsView2.getVisibility() == 0 ? 0 : Views.dip((View) contourLayout2, 30)));
                    default:
                        return new YInt(contourLayout2.getDip(16) + contourLayout2.m3810bottomdBGyhoQ(afterPayOrderDetailsView.remainingTextView));
                }
            }
        }));
        ScrollView scrollView = new ScrollView(context);
        scrollView.setBackgroundColor(ColorKt.m694toArgb8_81llA(colors.semantic.background.f1047app));
        scrollView.addView(contourLayout);
        this.scrollView = scrollView;
    }

    public final void Content(AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-642174294);
        int i2 = (gapComposer.changedInstance(afterPayOrderDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (afterPayOrderDetailsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterPayOrderDetailsView$$ExternalSyntheticLambda13(this, afterPayOrderDetailsViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            this.onEventCallback = function1;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ShopHubResultsListKt$$ExternalSyntheticLambda21(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            this.orderDetailsHeaderView.setEventReceiver((Ui.EventReceiver) rememberedValue);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ShopHubResultsListKt$$ExternalSyntheticLambda21(2, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            this.purchaseDetailsView.setEventReceiver((Ui.EventReceiver) rememberedValue2);
            Context context = getContext();
            context.getClass();
            ArcadeThemeKt.ArcadeTheme(ThemeHelpersKt.findThemeInfo(context).arcadeColors, null, null, Expect_jvmKt.rememberComposableLambda(1037030645, new AfterPayOrderDetailsView$$ExternalSyntheticLambda13(this, afterPayOrderDetailsViewModel, function1), gapComposer), gapComposer, 3072, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterPayOrderDetailsView$$ExternalSyntheticLambda13(this, afterPayOrderDetailsViewModel, function1, i, 2);
        }
    }

    public final void OrderDetailsContent(AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Modifier.Companion companion;
        int i2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1850863094);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(afterPayOrderDetailsViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion2, 1.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda3(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-419588309, new CheckDepositAmountKt$$ExternalSyntheticLambda6(8, (Object) afterPayOrderDetailsViewModel, (Object) function1), gapComposer), gapComposer, 1572918, 44);
            Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.fillMaxSize(new LayoutWeightElement(1.0f, true), 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clipToBounds);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (afterPayOrderDetailsViewModel instanceof AfterPayOrderDetailsViewModel.OrderDetailsLoading) {
                gapComposer.startReplaceGroup(-935782182);
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
                function12 = function1;
                companion = companion2;
                i2 = i4;
            } else if (afterPayOrderDetailsViewModel instanceof AfterPayOrderDetailsViewModel.OrderDetailsErrorLoading) {
                gapComposer.startReplaceGroup(-935568778);
                String stringResource = Room.stringResource(gapComposer, R.string.afterpay_order_details_failed_to_load_title);
                String str = ((AfterPayOrderDetailsViewModel.OrderDetailsErrorLoading) afterPayOrderDetailsViewModel).message;
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 32.0f);
                i2 = i4;
                boolean z3 = i2 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue2 = new BorrowHomeKt$$ExternalSyntheticLambda3(29, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                companion = companion2;
                ImageUtilsKt.AfterPayErrorLoadingContent(0, 0, gapComposer, m299paddingVpY3zN4, stringResource, str, (Function0) rememberedValue2);
                gapComposer.end(false);
            } else {
                function12 = function1;
                companion = companion2;
                i2 = i4;
                if (!(afterPayOrderDetailsViewModel instanceof AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2108397323, false);
                }
                gapComposer.startReplaceGroup(-935067322);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new AfterPayOrderDetailsView$$ExternalSyntheticLambda8(this, 2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function1 function13 = (Function1) rememberedValue3;
                boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(afterPayOrderDetailsViewModel);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda1(6, this, afterPayOrderDetailsViewModel);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                AndroidView_androidKt.AndroidView(function13, fillMaxSize2, (Function1) rememberedValue4, gapComposer, 48, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (afterPayOrderDetailsViewModel instanceof AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel) {
                gapComposer.startReplaceGroup(1535013057);
                ActionButton actionButton = ((AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel) afterPayOrderDetailsViewModel).payEarlyButton;
                if (actionButton == null) {
                    gapComposer.startReplaceGroup(340764512);
                    gapComposer.end(false);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(340764513);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
                    boolean changedInstance3 = gapComposer.changedInstance(actionButton) | (i2 == 32);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(11, (Object) actionButton, function12);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    z = false;
                    coil3.size.SizeKt.Button((Function0) rememberedValue5, m299paddingVpY3zN42, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(533107, new CheckDepositAmountKt$$ExternalSyntheticLambda8(actionButton, 7), gapComposer), gapComposer, 1573248, 56);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(341315414);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterPayOrderDetailsView$$ExternalSyntheticLambda13(this, afterPayOrderDetailsViewModel, function12, i, 3);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AfterPayOrderDetailsViewModel) obj, function1, gapComposer, 0);
    }
}
