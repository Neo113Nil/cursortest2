package com.squareup.cash.borrow.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.savings.views.ButtonGroupKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class BorrowAmountPickerKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AmountPickerViewModel.Ready f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BorrowAmountPickerKt$$ExternalSyntheticLambda11(Function1 function1, AmountPickerViewModel.Ready ready) {
        this.$r8$classId = 4;
        this.f$1 = function1;
        this.f$0 = ready;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AmountPickerViewModel.Ready ready = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BorrowHomeKt.BorrowAmountPickerContentCondensed(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ReadyContent(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ButtonGroupKt.ReadyContent(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ButtonGroupKt.ReadyContent$1(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape)));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    ComposableLambdaImpl composableLambdaImpl = null;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ComposableLambdaImpl composableLambdaImpl2 = ButtonGroupKt.f648lambda$597025206;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(26, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    if (ready.showHelpButton) {
                        gapComposer.startReplaceGroup(-692047397);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-71575872, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(13, function1), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-691791616);
                        gapComposer.end(false);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, composableLambdaImpl, gapComposer, 54, 44);
                    ButtonGroupKt.ReadyContent$1(ready, function1, gapComposer, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BorrowAmountPickerKt$$ExternalSyntheticLambda11(AmountPickerViewModel.Ready ready, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = ready;
        this.f$1 = function1;
    }
}
