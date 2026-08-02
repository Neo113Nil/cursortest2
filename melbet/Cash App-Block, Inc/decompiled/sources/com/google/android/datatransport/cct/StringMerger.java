package com.google.android.datatransport.cct;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.datatransport.cct.StringMerger;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.deposits.physical.view.details.LocationDetailSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class StringMerger {
    public static final void FeeInfoSection(final LocationDetailsViewModel.FeeViewModel feeViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1576569125);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(feeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.pmd_merchant_info_content_description);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SyncDetailsQueries$$ExternalSyntheticLambda2(stringResource, 22);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-650750007, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    LocationDetailsViewModel.FeeViewModel feeViewModel2 = feeViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(feeViewModel2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, feeViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer4, 0);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), (TextStyle) null, (TextLineBalancing) null, feeViewModel2.body, (Map) null, (Function1) null, false);
                                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion, 4.0f));
                                Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), ((Color) gapComposer4.consume(ArcadeThemeKt.LocalTextColor)).value, gapComposer4, 54, 0);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1830424586, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    LocationDetailsViewModel.FeeViewModel feeViewModel2 = feeViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(feeViewModel2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, feeViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer4, 0);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), (TextStyle) null, (TextLineBalancing) null, feeViewModel2.body, (Map) null, (Function1) null, false);
                                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion, 4.0f));
                                Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), ((Color) gapComposer4.consume(ArcadeThemeKt.LocalTextColor)).value, gapComposer4, 54, 0);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer);
            r9 = (i3 & 112) == 32 ? 1 : 0;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (r9 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(7, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, semantics, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-462397040, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i2;
                    LocationDetailsViewModel.FeeViewModel feeViewModel2 = feeViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(feeViewModel2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, feeViewModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer4, 0);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), (TextStyle) null, (TextLineBalancing) null, feeViewModel2.body, (Map) null, (Function1) null, false);
                                ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion, 4.0f));
                                Trace.m1191Iconww6aTOc(Icons.InformationOutline16, (String) null, new WithAlignmentLineElement(horizontalAlignmentLine), ((Color) gapComposer4.consume(ArcadeThemeKt.LocalTextColor)).value, gapComposer4, 54, 0);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, null, 0L, gapComposer, 12582966, 3952);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(feeViewModel, function1, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void LocationDetailSheet(final LocationDetailsViewModel locationDetailsViewModel, Function1 function1, Composer composer, int i) {
        ?? r2;
        locationDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1429271320);
        final int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(locationDetailsViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        final boolean z = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Object obj = null;
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
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1626568009, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = z;
                    LocationDetailsViewModel locationDetailsViewModel2 = locationDetailsViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getTitle(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                AvatarSize avatarSize = AvatarSize.Size64;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors2.semantic.background.brand;
                                String avatarUrl = locationDetailsViewModel2.getAvatarUrl();
                                if (avatarUrl == null) {
                                    avatarUrl = "";
                                }
                                TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, new AvatarImage.Remote.Image(avatarUrl, false, new AvatarImage.LocalIcon(locationDetailsViewModel2 instanceof LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel ? Icons.DepositPaper32 : Icons.Atm32, 0L, 6), 0L, new RealAppConfigManager$$ExternalSyntheticLambda7(20), 58), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1481421945, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = i4;
                    LocationDetailsViewModel locationDetailsViewModel2 = locationDetailsViewModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getTitle(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                AvatarSize avatarSize = AvatarSize.Size64;
                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors2.semantic.background.brand;
                                String avatarUrl = locationDetailsViewModel2.getAvatarUrl();
                                if (avatarUrl == null) {
                                    avatarUrl = "";
                                }
                                TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, new AvatarImage.Remote.Image(avatarUrl, false, new AvatarImage.LocalIcon(locationDetailsViewModel2 instanceof LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel ? Icons.DepositPaper32 : Icons.Atm32, 0L, 6), 0L, new RealAppConfigManager$$ExternalSyntheticLambda7(20), 58), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-887933274, new LocationDetailSheetView$$ExternalSyntheticLambda0(function1, locationDetailsViewModel), gapComposer), gapComposer, 3462, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            LocationDetailsViewModel.FeeViewModel feeViewModel = locationDetailsViewModel.getFeeViewModel();
            if (feeViewModel == null) {
                gapComposer.startReplaceGroup(2095143372);
            } else {
                gapComposer.startReplaceGroup(2095143373);
                FeeInfoSection(feeViewModel, function1, gapComposer, i3 & 112);
            }
            gapComposer.end(false);
            if (locationDetailsViewModel instanceof LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel) {
                gapComposer.startReplaceGroup(2095239628);
                for (final LocationDetailsViewModel.DepositMethod depositMethod : ((LocationDetailsViewModel.PaperMoneyDepositMerchantViewModel) locationDetailsViewModel).depositMethods) {
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(392424513, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = z;
                            LocationDetailsViewModel.DepositMethod depositMethod2 = depositMethod;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(depositMethod2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), Expect_jvmKt.rememberComposableLambda(2069447840, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i4;
                            LocationDetailsViewModel.DepositMethod depositMethod2 = depositMethod;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(depositMethod2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, null, depositMethod.enabled, false, Expect_jvmKt.rememberComposableLambda(-753314086, new Function2() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = i2;
                            LocationDetailsViewModel.DepositMethod depositMethod2 = depositMethod;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Trace.m1191Iconww6aTOc(StringMerger.toArcadeIcon(depositMethod2.icon), (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, depositMethod2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, null, 0L, gapComposer, 12582966, 3932);
                    z = z;
                    i2 = i2;
                    i4 = 1;
                    obj = null;
                }
                boolean z2 = z;
                gapComposer.end(z2);
                r2 = z2;
            } else {
                r2 = 0;
                gapComposer.startReplaceGroup(2095520240);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionSmall(r2, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-769234320, new CheckDepositAmountKt$$ExternalSyntheticLambda6(27, (Object) locationDetailsViewModel, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocationDetailSheetView$$ExternalSyntheticLambda0(locationDetailsViewModel, function1, i);
        }
    }

    public static final FinancialConnectionsSheetFlowType getFlowType(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs) {
        financialConnectionsSheetActivityArgs.getClass();
        if (financialConnectionsSheetActivityArgs instanceof FinancialConnectionsSheetActivityArgs.ForData) {
            return FinancialConnectionsSheetFlowType.ForData;
        }
        if (financialConnectionsSheetActivityArgs instanceof FinancialConnectionsSheetActivityArgs.ForInstantDebits) {
            return FinancialConnectionsSheetFlowType.ForInstantDebits;
        }
        if (financialConnectionsSheetActivityArgs instanceof FinancialConnectionsSheetActivityArgs.ForToken) {
            return FinancialConnectionsSheetFlowType.ForToken;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final Icons toArcadeIcon(LocationDetailsViewModel.LocationDetailsIcon locationDetailsIcon) {
        int ordinal = locationDetailsIcon.ordinal();
        if (ordinal == 0) {
            return Icons.CurrencyUsd24;
        }
        if (ordinal == 1) {
            return Icons.Zero24;
        }
        if (ordinal == 2) {
            return Icons.DepositBarcode24;
        }
        if (ordinal == 3) {
            return Icons.CardStrip24;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
