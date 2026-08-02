package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
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
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class BlockersUiFactory$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SavingsTransferOptionSelectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BlockersUiFactory$$ExternalSyntheticLambda13(Function1 function1, SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel) {
        this.$r8$classId = 6;
        this.f$1 = function1;
        this.f$0 = savingsTransferOptionSelectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SsnViewKt.SavingsTransferOptionSelectionSheet(savingsTransferOptionSelectionViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SsnViewKt.SavingsTransferOptionSelectionFullScreen(savingsTransferOptionSelectionViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                SsnViewKt.SavingsTransferOptionSelectionFullScreen(savingsTransferOptionSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = this.f$0;
                    SavingsTransferOptionSelectionViewModel.Content content = savingsTransferOptionSelectionViewModel2 instanceof SavingsTransferOptionSelectionViewModel.Content ? (SavingsTransferOptionSelectionViewModel.Content) savingsTransferOptionSelectionViewModel2 : null;
                    NavigationType navigationType = content != null ? content.showBackButton : false ? NavigationType.BACK : NavigationType.NONE;
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(4, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer3, 6, 108);
                    boolean z = savingsTransferOptionSelectionViewModel2 instanceof SavingsTransferOptionSelectionViewModel.Loading;
                    boolean changedInstance = gapComposer3.changedInstance(savingsTransferOptionSelectionViewModel2);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new RewardSlotQueries$$ExternalSyntheticLambda0(savingsTransferOptionSelectionViewModel2, 2);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    Strings.LoadableFullScreenContent(savingsTransferOptionSelectionViewModel2, z, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(99676534, new SetPinViewKt$$ExternalSyntheticLambda4(21, function1), gapComposer3), gapComposer3, 196608, 20);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                SsnViewKt.SavingsTransferOptionSelectionFullScreen(savingsTransferOptionSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                SsnViewKt.SavingsTransferOptionSelectionSheet(savingsTransferOptionSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed2 = gapComposer4.changed(function1);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda14(3, function1);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-2140243918, new BorrowHomeKt$$ExternalSyntheticLambda0(22, savingsTransferOptionSelectionViewModel, function1), gapComposer4), gapComposer4, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                SsnViewKt.SavingsTransferOptionSelectionSheet(savingsTransferOptionSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BlockersUiFactory$$ExternalSyntheticLambda13(SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = savingsTransferOptionSelectionViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ BlockersUiFactory$$ExternalSyntheticLambda13(SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = savingsTransferOptionSelectionViewModel;
        this.f$1 = function1;
    }
}
