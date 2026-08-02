package com.squareup.cash.earningstracker.views;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earningstracker.viewmodels.EarningsTimeframeSelectorSheetViewModel;
import com.squareup.cash.earningstracker.viewmodels.TimeframeViewModel;
import com.squareup.cash.earningstracker.views.components.EarningsHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class NetEarningsInfoSheetViewKt {

    /* renamed from: lambda$-1091704745, reason: not valid java name */
    public static final ComposableLambdaImpl f394lambda$1091704745;

    /* renamed from: lambda$-1936174213, reason: not valid java name */
    public static final ComposableLambdaImpl f395lambda$1936174213;

    /* renamed from: lambda$-513503641, reason: not valid java name */
    public static final ComposableLambdaImpl f397lambda$513503641;
    public static final ComposableLambdaImpl lambda$2091573679;
    public static final ComposableLambdaImpl lambda$226314797;
    public static final ComposableLambdaImpl lambda$964830544 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(14), false, 964830544);

    /* renamed from: lambda$-197679060, reason: not valid java name */
    public static final ComposableLambdaImpl f396lambda$197679060 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(24), false, -197679060);

    static {
        new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(15), false, -886074962);
        new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(16), false, 285637824);
        lambda$226314797 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(2), false, 226314797);
        lambda$2091573679 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(3), false, 2091573679);
        f397lambda$513503641 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(17), false, -513503641);
        f395lambda$1936174213 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(18), false, -1936174213);
        f394lambda$1091704745 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(25), false, -1091704745);
        new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(19), false, 1530477802);
    }

    public static final void EarningsTimeframeSelectorSheet(EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-487081479);
        int i2 = i | (gapComposer.changedInstance(earningsTimeframeSelectorSheetViewModel) ? 4 : 2);
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 | (gapComposer.changed(modifier) ? 256 : 128);
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            Transformations.SheetHeader(lambda$964830544, (Modifier) null, (Function2) null, (Function2) null, gapComposer, 6, 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(961164263);
            for (TimeframeViewModel timeframeViewModel : earningsTimeframeSelectorSheetViewModel.timeframeViewModels) {
                boolean z3 = z2;
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(timeframeViewModel.isSelected);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1851256764, new ArcadeModal$$ExternalSyntheticLambda5(timeframeViewModel, 7), gapComposer);
                boolean changedInstance = ((i4 & 112) == i3 ? z3 : z) | gapComposer.changedInstance(timeframeViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(22, function1, timeframeViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, 0L, radio, null, gapComposer, 6, 1530);
                z = z;
                i3 = i3;
                z2 = true;
                i4 = i4;
            }
            gapComposer.end(z);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(214544753, new ErrorView$$ExternalSyntheticLambda3(9, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) earningsTimeframeSelectorSheetViewModel, function1, (Object) modifier, i, 11);
        }
    }

    public static final void EarningsTimeframeSelectorSheetView(EarningsTimeframeSelectorSheetViewModel earningsTimeframeSelectorSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        earningsTimeframeSelectorSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-745289751);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsTimeframeSelectorSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1175627006, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(23, function1, earningsTimeframeSelectorSheetViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(earningsTimeframeSelectorSheetViewModel, function1, i, 18);
        }
    }

    public static final void NetEarningsInfoSheet(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(365376420);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            Transformations.SheetHeader(f395lambda$1936174213, (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(1513322648, new SsnViewKt$$ExternalSyntheticLambda12(25, function1), gapComposer), gapComposer, 3078, 6);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(66613020, new ErrorView$$ExternalSyntheticLambda3(12, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(function1, modifier, i, 3);
        }
    }

    public static final void NetEarningsInfoSheetView(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1105194534);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1630504047, new SsnViewKt$$ExternalSyntheticLambda12(24, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 14, false);
        }
    }
}
