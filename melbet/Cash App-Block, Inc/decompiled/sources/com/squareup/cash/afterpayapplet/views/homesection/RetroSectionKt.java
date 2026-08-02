package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class RetroSectionKt {
    public static final void DefaultRetroCreditSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader defaultCreditHeader, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection retroTransactionSection, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1761813028);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(defaultCreditHeader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(retroTransactionSection) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            AfterpayAppletHomeContentViewModel.HomeSection.AppletCreditLineType appletCreditLineType = defaultCreditHeader.appletCreditLineType;
            String str = defaultCreditHeader.titleText;
            String str2 = defaultCreditHeader.subtitleText;
            String str3 = defaultCreditHeader.actionText;
            Tap tap = defaultCreditHeader.tapAction;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (tap == null) {
                gapComposer.startReplaceGroup(-670104806);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(-670104805);
                boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(tap);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new RetroSectionKt$$ExternalSyntheticLambda5(function1, tap, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            LegalSectionKt.CreditSectionHeader(null, appletCreditLineType, str, str3, str2, function0, gapComposer, 0);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (retroTransactionSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EligibleTransactions) {
                gapComposer.startReplaceGroup(-669943822);
                List list = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EligibleTransactions) retroTransactionSection).retroTransaction;
                int i3 = i2 & 7168;
                boolean z = i3 == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda1(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                boolean z2 = i3 == 2048;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SwipeToDismissKt$$ExternalSyntheticLambda4(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Function2 function2 = (Function2) rememberedValue3;
                boolean z3 = i3 == 2048;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new SwipeToDismissKt$$ExternalSyntheticLambda4(26, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                LegalSectionKt.RetroCellActivity(null, list, function12, function2, (Function2) rememberedValue4, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(retroTransactionSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EmptyEligibleTransactions)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -991443779, false);
                }
                gapComposer.startReplaceGroup(-669380831);
                ListOrderedKt.ListOrderedStandard((Modifier) null, Tags.toImmutableList(((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EmptyEligibleTransactions) retroTransactionSection).lineItem), gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier2, defaultCreditHeader, retroTransactionSection, function1, i, 27);
        }
    }

    public static final void ProgressRetroCreditSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader moneyBarSectionHeader, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection retroTransactionSection, Function1 function1, Composer composer, int i) {
        AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader moneyBarSectionHeader2;
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(838330572);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            moneyBarSectionHeader2 = moneyBarSectionHeader;
            i2 |= gapComposer.changedInstance(moneyBarSectionHeader2) ? 32 : 16;
        } else {
            moneyBarSectionHeader2 = moneyBarSectionHeader;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(retroTransactionSection) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            LegalSectionKt.MoneyBarCreditHeaderSection(moneyBarSectionHeader2, null, function1, gapComposer, (i2 >> 3) & 910, 2);
            function12 = function1;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (retroTransactionSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EligibleTransactions) {
                gapComposer.startReplaceGroup(1542839054);
                List list = ((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EligibleTransactions) retroTransactionSection).retroTransaction;
                int i3 = i2 & 7168;
                boolean z = i3 == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(21, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function13 = (Function1) rememberedValue;
                boolean z2 = i3 == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SwipeToDismissKt$$ExternalSyntheticLambda4(23, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function2 function2 = (Function2) rememberedValue2;
                boolean z3 = i3 == 2048;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SwipeToDismissKt$$ExternalSyntheticLambda4(24, function12);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                LegalSectionKt.RetroCellActivity(null, list, function13, function2, (Function2) rememberedValue3, gapComposer, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (!(retroTransactionSection instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EmptyEligibleTransactions)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1751347679, false);
                }
                gapComposer.startReplaceGroup(1543402045);
                ListOrderedKt.ListOrderedStandard((Modifier) null, Tags.toImmutableList(((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection.EmptyEligibleTransactions) retroTransactionSection).lineItem), gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier2, moneyBarSectionHeader, retroTransactionSection, function12, i, 26);
        }
    }

    public static final void RetroSection(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection retroTransactionSection, boolean z, Function1 function1, Composer composer, int i) {
        retroTransactionSection.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1103830799);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(retroTransactionSection) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader sectionHeader = retroTransactionSection.getSectionHeader();
            if (sectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) {
                gapComposer.startReplaceGroup(-1131457596);
                DefaultRetroCreditSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) sectionHeader, retroTransactionSection, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 7168));
                gapComposer.end(false);
            } else if (sectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) {
                gapComposer.startReplaceGroup(-1131321661);
                ProgressRetroCreditSection(null, (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) sectionHeader, retroTransactionSection, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 7168));
                gapComposer.end(false);
            } else {
                if (!(sectionHeader instanceof AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1976163356, false);
                }
                gapComposer.startReplaceGroup(-1131190531);
                LegalSectionKt.FadedCreditSection((AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader) sectionHeader, gapComposer, 0);
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-1131118425);
                LegalSectionKt.HomeSectionDivider(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1131085751);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier, retroTransactionSection, z, function1, i, 5);
        }
    }
}
