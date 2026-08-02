package com.squareup.cash.deposits.physical.view.map;

import android.content.Context;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda19;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda7;
import com.squareup.cash.deposits.physical.view.map.render.ClusterIconGenerator;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIterator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositMapViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void DepositFilters(int i, int i2, Composer composer, Modifier modifier, List list, Function1 function1) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(18108221);
        char c = 2;
        int i4 = i | (gapComposer.changedInstance(list) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        final ?? r11 = 0;
        final int i6 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(list);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4);
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
            String stringResource = Room.stringResource(gapComposer, R.string.pmd_map_filter_sheet_title);
            Object obj = null;
            GapComposer gapComposer2 = gapComposer;
            Countries.PageHeader(stringResource, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            gapComposer2.startReplaceGroup(207150907);
            EnumEntriesList enumEntriesList = PaperMoneyDepositMapViewModel.DepositMethodFilter.$ENTRIES;
            ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
            while (m.hasNext()) {
                final PaperMoneyDepositMapViewModel.DepositMethodFilter depositMethodFilter = (PaperMoneyDepositMapViewModel.DepositMethodFilter) m.next();
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(948672449, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i7;
                        int i8;
                        int i9 = r11;
                        PaperMoneyDepositMapViewModel.DepositMethodFilter depositMethodFilter2 = depositMethodFilter;
                        switch (i9) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    int ordinal = depositMethodFilter2.ordinal();
                                    if (ordinal == 0) {
                                        icons = Icons.DepositBarcode24;
                                    } else {
                                        if (ordinal != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        icons = Icons.CardStrip24;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    int ordinal2 = depositMethodFilter2.ordinal();
                                    if (ordinal2 == 0) {
                                        i7 = 1687551831;
                                        i8 = R.string.pmd_map_filter_sheet_barcode;
                                    } else {
                                        if (ordinal2 != 1) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1687550534, false);
                                        }
                                        i7 = 1687554426;
                                        i8 = R.string.pmd_map_filter_sheet_card_swipe;
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer4, i7, i8, gapComposer4, false), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-507740606, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i7;
                        int i8;
                        int i9 = i6;
                        PaperMoneyDepositMapViewModel.DepositMethodFilter depositMethodFilter2 = depositMethodFilter;
                        switch (i9) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    int ordinal = depositMethodFilter2.ordinal();
                                    if (ordinal == 0) {
                                        icons = Icons.DepositBarcode24;
                                    } else {
                                        if (ordinal != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        icons = Icons.CardStrip24;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    int ordinal2 = depositMethodFilter2.ordinal();
                                    if (ordinal2 == 0) {
                                        i7 = 1687551831;
                                        i8 = R.string.pmd_map_filter_sheet_barcode;
                                    } else {
                                        if (ordinal2 != 1) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1687550534, false);
                                        }
                                        i7 = 1687554426;
                                        i8 = R.string.pmd_map_filter_sheet_card_swipe;
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer4, i7, i8, gapComposer4, false), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer2);
                boolean changed2 = gapComposer2.changed(mutableState) | gapComposer2.changed(depositMethodFilter.ordinal());
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(14, depositMethodFilter, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer3 = gapComposer2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue2, false, false, null, null, new CellDefaultAccessory.Checkbox(((List) mutableState.getValue()).contains(depositMethodFilter)), 0L, gapComposer3, 54, 3572);
                mutableState = mutableState;
                r11 = r11;
                gapComposer2 = gapComposer3;
                neverEqualPolicy = neverEqualPolicy;
                c = 2;
                i6 = 1;
                obj = null;
                modifier4 = modifier4;
            }
            gapComposer = gapComposer2;
            boolean z = r11;
            gapComposer.end(z);
            DBUtil.SpacerWithinSectionMedium(z ? 1 : 0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1261760843, new ShiftListViewKt$$ExternalSyntheticLambda11(function1, mutableState, 2), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda2(list, function1, modifier3, i, i2, 1);
        }
    }

    public static final void FeeInformation(Icon icon, String str, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1604873275);
        int i2 = i | (gapComposer.changedInstance(icon) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
            Modifier then = m302paddingqDBjuR0$default2.then(new WithAlignmentLineElement(horizontalAlignmentLine));
            zzd zzdVar = Icons.Companion;
            String str2 = icon.arcade_id;
            str2.getClass();
            zzdVar.getClass();
            Icons icons = zzd.get(str2);
            icons.getClass();
            Trace.m1191Iconww6aTOc(icons, (String) null, then, Strings.getColors(gapComposer).semantic.icon.brand, gapComposer, 48, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) new WithAlignmentLineElement(horizontalAlignmentLine), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(icon, str, modifier2, i, 8);
        }
    }

    public static final void Footer(final PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1716489016);
        int i2 = (gapComposer.changedInstance(paperMoneyDepositMapViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m299paddingVpY3zN4, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, paperMoneyDepositMapViewModel.feeInformation != null, null, EnterExitTransitionKt.expandVertically$default(null, 15), EnterExitTransitionKt.shrinkVertically$default(null, null, 15), "Footer entry animation", Expect_jvmKt.rememberComposableLambda(-1260215930, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4 = i3;
                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel2 = paperMoneyDepositMapViewModel;
                    switch (i4) {
                        case 0:
                            ((Integer) obj3).getClass();
                            ((AnimatedVisibilityScope) obj).getClass();
                            PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = paperMoneyDepositMapViewModel2.feeInformation;
                            GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                            if (paperMoneyDepositMapSectionViewModel$FeeInformationViewModel == null) {
                                gapComposer2.startReplaceGroup(-783605293);
                            } else {
                                gapComposer2.startReplaceGroup(-783605292);
                                PaperMoneyDepositMapViewKt.FeeInformation(paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.icon, paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.text, null, gapComposer2, 0);
                            }
                            gapComposer2.end(false);
                            break;
                        default:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.show_barcode_button_text;
                                str.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1797126, 2);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final int i4 = 1;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-2030079533, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i42 = i4;
                    PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel2 = paperMoneyDepositMapViewModel;
                    switch (i42) {
                        case 0:
                            ((Integer) obj3).getClass();
                            ((AnimatedVisibilityScope) obj).getClass();
                            PaperMoneyDepositMapSectionViewModel$FeeInformationViewModel paperMoneyDepositMapSectionViewModel$FeeInformationViewModel = paperMoneyDepositMapViewModel2.feeInformation;
                            GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                            if (paperMoneyDepositMapSectionViewModel$FeeInformationViewModel == null) {
                                gapComposer2.startReplaceGroup(-783605293);
                            } else {
                                gapComposer2.startReplaceGroup(-783605292);
                                PaperMoneyDepositMapViewKt.FeeInformation(paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.icon, paperMoneyDepositMapSectionViewModel$FeeInformationViewModel.text, null, gapComposer2, 0);
                            }
                            gapComposer2.end(false);
                            break;
                        default:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                String str = paperMoneyDepositMapViewModel2.viewTextViewModel.mapScreen.show_barcode_button_text;
                                str.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1573296, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhysicalDepositViewFactory$$ExternalSyntheticLambda7(paperMoneyDepositMapViewModel, function1, i);
        }
    }

    public static final void PaperDepositCluster(CashCluster cashCluster, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(671214847);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(cashCluster) : gapComposer.changedInstance(cashCluster) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterIconGenerator(context);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ImageKt.m176Image5hnEew(new AndroidImageBitmap(((ClusterIconGenerator) rememberedValue).makeIcon(String.valueOf(cashCluster.items.size()))), Room.stringResource(R.string.pmd_cluster_content_description, new Object[]{Integer.valueOf(cashCluster.items.size())}, gapComposer), null, null, null, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda19(cashCluster, i, 4);
        }
    }

    public static final void PaperMoneyDepositMap(PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel, Function1 function1, Composer composer, int i) {
        paperMoneyDepositMapViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(20478689);
        int i2 = (gapComposer.changedInstance(paperMoneyDepositMapViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2094003628, new EarningsHomeKt$$ExternalSyntheticLambda2(7, function1, paperMoneyDepositMapViewModel, (MutableState) rememberedValue), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(paperMoneyDepositMapViewModel, function1, i, 8);
        }
    }
}
