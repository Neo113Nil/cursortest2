package com.squareup.cash.savings.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullTransferInViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AmountPickerViewModel f$2;

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda1(AmountPickerViewModel amountPickerViewModel, Function1 function1, int i) {
        this.$r8$classId = 3;
        this.f$2 = amountPickerViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        AmountPickerViewModel.InitialLoading initialLoading = AmountPickerViewModel.InitialLoading.INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i2 = 16;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        AmountPickerViewModel amountPickerViewModel = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(21, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
                    ComposableLambdaImpl composableLambdaImpl2 = ButtonGroupKt.lambda$893613846;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(22, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    boolean z3 = amountPickerViewModel instanceof AmountPickerViewModel.Ready;
                    AmountPickerViewModel.Ready ready = z3 ? (AmountPickerViewModel.Ready) amountPickerViewModel : null;
                    if (ready == null || !ready.showHelpButton) {
                        gapComposer.startReplaceGroup(1684407348);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer.startReplaceGroup(1684151567);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(460641548, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(12, function1), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, composableLambdaImpl, gapComposer, 54, 44);
                    if (Intrinsics.areEqual(amountPickerViewModel, initialLoading) || (amountPickerViewModel instanceof AmountPickerViewModel.Loading)) {
                        gapComposer.startReplaceGroup(1684517956);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
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
                        z = true;
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        if (!z3) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1301263462, false);
                        }
                        gapComposer.startReplaceGroup(1301270398);
                        ButtonGroupKt.ReadyContent((AmountPickerViewModel.Ready) amountPickerViewModel, function1, gapComposer, 0);
                        gapComposer.end(false);
                        z = true;
                    }
                    gapComposer.end(z);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TickersAmountCaptionKt.FullscreenAmountPicker(this.f$2, new AmountConfig.PercentConfig(24), this.f$0, null, null, gapComposer2, 64, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (amountPickerViewModel instanceof AmountPickerViewModel.Ready) {
                    gapComposer3.startReplaceGroup(-2111895432);
                    TickersAmountCaptionKt.FullscreenAmountPicker((AmountPickerViewModel.Ready) amountPickerViewModel, new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 6, 6), this.f$0, SizeKt.fillMaxSize(companion, 1.0f), null, gapComposer3, 3136, 16);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-2111704968);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderKeypad(amountPickerViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    CustomOrderKt.CustomOrderKeypad(amountPickerViewModel, function1, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute2 = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier2 = gapComposer5.applier;
                if (shouldExecute2) {
                    boolean changed3 = gapComposer5.changed(function1);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new HelpSheetViewKt$$ExternalSyntheticLambda2(16, function1);
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue3, gapComposer5, 0, 1);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier navigationBarsPadding2 = SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, navigationBarsPadding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    ComposableLambdaImpl composableLambdaImpl3 = HelpSheetViewKt.lambda$964579416;
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed4 = gapComposer5.changed(function1);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new HelpSheetViewKt$$ExternalSyntheticLambda2(17, function1);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl3, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer5, 54, 108);
                    if (Intrinsics.areEqual(amountPickerViewModel, initialLoading) || (amountPickerViewModel instanceof AmountPickerViewModel.Loading)) {
                        gapComposer5.startReplaceGroup(727670242);
                        Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, fillMaxSize4);
                        gapComposer5.startReusableNode();
                        if (gapComposer5.inserting) {
                            gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer5.useNode();
                        }
                        Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                        Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer5, composeUiNode$Companion$SetModifier$17, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer5, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                        z2 = true;
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer5, null);
                        gapComposer5.end(true);
                        gapComposer5.end(false);
                    } else {
                        if (!(amountPickerViewModel instanceof AmountPickerViewModel.Ready)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1639096568, false);
                        }
                        gapComposer5.startReplaceGroup(-1639089632);
                        HelpSheetViewKt.ReadyContent((AmountPickerViewModel.Ready) amountPickerViewModel, function1, gapComposer5, 0);
                        gapComposer5.end(false);
                        z2 = true;
                    }
                    gapComposer5.end(z2);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed5 = gapComposer6.changed(function1);
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(19, function1);
                        gapComposer6.updateRememberedValue(rememberedValue5);
                    }
                    SheetKt.Sheet((Function0) rememberedValue5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1129070126, new ShareSheetViewKt$$ExternalSyntheticLambda1(i2, (Object) amountPickerViewModel, (Object) function1), gapComposer6), gapComposer6, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda1(AmountPickerViewModel amountPickerViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$2 = amountPickerViewModel;
        this.f$0 = function1;
    }

    public /* synthetic */ FullTransferInViewKt$$ExternalSyntheticLambda1(Function1 function1, AmountPickerViewModel amountPickerViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$2 = amountPickerViewModel;
    }
}
