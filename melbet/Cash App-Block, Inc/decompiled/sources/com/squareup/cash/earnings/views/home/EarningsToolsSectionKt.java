package com.squareup.cash.earnings.views.home;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.applets.views.EarnerAppletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetTopCornerBehavior;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsToolsSectionKt {
    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EarningsHomeViewModel.EarnerModeSheet.DurationOption[]{new EarningsHomeViewModel.EarnerModeSheet.DurationOption(3600L), new EarningsHomeViewModel.EarnerModeSheet.DurationOption(7200L), new EarningsHomeViewModel.EarnerModeSheet.DurationOption(14400L)});
        EarningsHomeViewModel.EarnerModeSheet.SubmitState submitState = EarningsHomeViewModel.EarnerModeSheet.SubmitState.IDLE;
        listOf.getClass();
    }

    public static final void DurationOptionButton(EarningsHomeViewModel.EarnerModeSheet.DurationOption durationOption, boolean z, Function0 function0, Modifier modifier, Composer composer, int i) {
        long j;
        float f;
        String format2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-898566074);
        int i2 = i | (gapComposer.changedInstance(durationOption) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            if (z) {
                gapComposer.startReplaceGroup(-233561169);
                j = Strings.getColors(gapComposer).semantic.border.prominent;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-233559444);
                j = Strings.getColors(gapComposer).semantic.border.subtle;
                gapComposer.end(false);
            }
            if (z) {
                gapComposer.startReplaceGroup(-233557012);
                Strings.getSizes(gapComposer).getClass();
                gapComposer.end(false);
                f = 2.0f;
            } else {
                gapComposer.startReplaceGroup(-233555637);
                Strings.getSizes(gapComposer).getClass();
                gapComposer.end(false);
                f = 1.0f;
            }
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m279heightInVpY3zN4$default(modifier, 96.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer).semantic.background.f1047app, m340RoundedCornerShape0680j_4);
            BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(j, f);
            Modifier m335selectableoSLSa3U$default = SelectableKt.m335selectableoSLSa3U$default(ImageKt.m179borderziNgDLE(m177backgroundbw27NRU, m173BorderStrokecXLIe8U.width, m173BorderStrokecXLIe8U.brush, m340RoundedCornerShape0680j_4), z, false, new Role(3), function0, 10);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m335selectableoSLSa3U$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            long j2 = durationOption.seconds;
            if (j2 % 3600 == 0) {
                gapComposer.startReplaceGroup(694749043);
                Long valueOf = Long.valueOf(j2 / 3600);
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("hours", valueOf);
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.earner_mode_sheet_duration_hours)).format(arrayMap);
                format2.getClass();
                gapComposer.end(false);
            } else if (j2 % 60 == 0) {
                gapComposer.startReplaceGroup(694908011);
                Long valueOf2 = Long.valueOf(j2 / 60);
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("minutes", valueOf2);
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.earner_mode_sheet_duration_minutes)).format(arrayMap2);
                format2.getClass();
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-393221256);
                Long valueOf3 = Long.valueOf(j2);
                ArrayMap arrayMap3 = new ArrayMap(1);
                arrayMap3.put("seconds", valueOf3);
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.earner_mode_sheet_duration_seconds)).format(arrayMap3);
                format2.getClass();
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(durationOption, z, function0, modifier, i, 17);
        }
    }

    public static final void EarnerModeSheetContent(EarningsHomeViewModel.EarnerModeSheet earnerModeSheet, Function1 function1, PaddingValues paddingValues, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1299420419);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(earnerModeSheet) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ArrayList<EarningsHomeViewModel.EarnerModeSheet.DurationOption> arrayList = earnerModeSheet.durationOptions;
            EarningsHomeViewModel.EarnerModeSheet.SubmitState submitState = earnerModeSheet.submitState;
            EarningsHomeViewModel.EarnerModeSheet.DurationOption durationOption = (EarningsHomeViewModel.EarnerModeSheet.DurationOption) CollectionsKt.firstOrNull((List) arrayList);
            if (durationOption == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(earnerModeSheet, function1, paddingValues, i);
                    return;
                }
                return;
            }
            boolean changed = gapComposer.changed(arrayList);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(durationOption);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean z = submitState == EarningsHomeViewModel.EarnerModeSheet.SubmitState.SUBMITTING;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(OffsetKt.consumeWindowInsets(SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues), paddingValues), ImageKt.rememberScrollState(gapComposer), false, 14);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            MutableState mutableState2 = mutableState;
            Object obj2 = obj;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, earnerModeSheet.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, earnerModeSheet.body, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier selectableGroup = SelectableKt.selectableGroup(SizeKt.fillMaxWidth(companion, 1.0f));
            Strings.getSizes(gapComposer).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, selectableGroup);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(751566221);
            for (EarningsHomeViewModel.EarnerModeSheet.DurationOption durationOption2 : arrayList) {
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                boolean areEqual = Intrinsics.areEqual(durationOption2, (EarningsHomeViewModel.EarnerModeSheet.DurationOption) mutableState2.getValue());
                MutableState mutableState3 = mutableState2;
                boolean changed2 = gapComposer.changed(mutableState3) | gapComposer.changedInstance(durationOption2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj3 = obj2;
                if (changed2 || rememberedValue2 == obj3) {
                    rememberedValue2 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(20, durationOption2, mutableState3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                DurationOptionButton(durationOption2, areEqual, (Function0) rememberedValue2, layoutWeightElement, gapComposer, 0);
                obj2 = obj3;
                mutableState2 = mutableState3;
            }
            MutableState mutableState4 = mutableState2;
            Object obj4 = obj2;
            gapComposer.end(false);
            gapComposer.end(true);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z2 = !z;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed3 = ((i3 & 112) == 32) | gapComposer.changed(mutableState4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == obj4) {
                rememberedValue3 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState4, 10);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(835889108, new ArcadeModal$$ExternalSyntheticLambda3(earnerModeSheet, 9), gapComposer), gapComposer, 1573296, 40);
            gapComposer = gapComposer;
            if (submitState == EarningsHomeViewModel.EarnerModeSheet.SubmitState.FAILED) {
                gapComposer.startReplaceGroup(-1672798956);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                String stringResource = Room.stringResource(gapComposer, R.string.earner_mode_sheet_submit_error);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.warning, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1672553901);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MusicViewKt$$ExternalSyntheticLambda2(earnerModeSheet, function1, paddingValues, modifier2, i, 2);
        }
    }

    public static final void EarningToolLabel(EarningsHomeViewModel.EarningToolsItem earningToolsItem, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(414383967);
        int i2 = (gapComposer.changedInstance(earningToolsItem) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = earningToolsItem.statusText;
            String str2 = earningToolsItem.title;
            if (str != null) {
                gapComposer.startReplaceGroup(1176870646);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1177228386);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsToolsSectionKt$$ExternalSyntheticLambda6(earningToolsItem, i);
        }
    }

    public static final void EarningToolRow(EarningsHomeViewModel.EarningToolsItem earningToolsItem, Function0 function0, Composer composer, int i) {
        Icons icons;
        Function0 function02 = function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(294107717);
        int i2 = i | (gapComposer.changedInstance(earningToolsItem) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StackedAvatarViewModel stackedAvatarViewModel = earningToolsItem.avatars;
            String str = earningToolsItem.subtitle;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (stackedAvatarViewModel != null) {
                gapComposer.startReplaceGroup(29851972);
                if (str == null) {
                    gapComposer.startReplaceGroup(30157104);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(30157105);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1717105700, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 2), gapComposer);
                    gapComposer.end(false);
                }
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1928918974, new EarnerAppletTileKt$$ExternalSyntheticLambda0(stackedAvatarViewModel, 2, (byte) 0), gapComposer), Expect_jvmKt.rememberComposableLambda(552255619, new EarningsToolsSectionKt$$ExternalSyntheticLambda6(earningToolsItem, 0, (byte) 0), gapComposer), null, function02, null, false, false, composableLambdaImpl, null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, ((i2 << 6) & 7168) | 805306422, 0, 3444);
                gapComposer.end(false);
                function02 = function0;
            } else {
                gapComposer.startReplaceGroup(30366262);
                int ordinal = earningToolsItem.f1128type.ordinal();
                if (ordinal == 0) {
                    icons = Icons.Bills24;
                } else if (ordinal == 1) {
                    icons = Icons.CurrencyUsd24;
                } else if (ordinal == 2) {
                    icons = Icons.Avatar24;
                } else if (ordinal == 3) {
                    icons = Icons.Deposit24;
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.Paychecks24;
                }
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.background.subtle;
                if (str == null) {
                    gapComposer.startReplaceGroup(30592592);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(30592593);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1912872264, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 3), gapComposer);
                    gapComposer.end(false);
                }
                int i3 = ((i2 << 15) & 3670016) | 3120;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, Expect_jvmKt.rememberComposableLambda(659811854, new EarningsToolsSectionKt$$ExternalSyntheticLambda6(earningToolsItem, 2, (byte) 0), gapComposer), null, 0L, function0, null, false, false, composableLambdaImpl, null, CellDefaultAccessory.Push.INSTANCE, 0L, null, gapComposer, i3, MLKEMEngine.KyberPolyBytes, 27568);
                function02 = function0;
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(earningToolsItem, function02, i, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void EarningsToolsSection(EarningsHomeViewModel.SectionContent.EarningTools earningTools, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        ArrayList<EarningsHomeViewModel.EarningToolsItem> arrayList;
        ?? r2;
        MutableState mutableState;
        Object obj;
        Object obj2;
        EarningsHomeViewModel.EarnerModeSheet earnerModeSheet;
        Object obj3;
        earningTools.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1777186600);
        int i2 = i | (gapComposer2.changedInstance(earningTools) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (rememberedValue == obj4) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = earningTools.sectionTitle;
            ArrayList arrayList2 = earningTools.items;
            if (str == null) {
                gapComposer2.startReplaceGroup(-2065443952);
                gapComposer2.end(false);
                mutableState = mutableState2;
                obj = obj4;
                arrayList = arrayList2;
                r2 = 0;
            } else {
                gapComposer2.startReplaceGroup(-2065443951);
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
                Strings.getSizes(gapComposer2).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer2).getClass();
                arrayList = arrayList2;
                r2 = 0;
                mutableState = mutableState2;
                obj = obj4;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 8.0f), Strings.getTypography(gapComposer2).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer2.end(false);
            }
            gapComposer2.startReplaceGroup(1318861008);
            for (EarningsHomeViewModel.EarningToolsItem earningToolsItem : arrayList) {
                boolean changedInstance = gapComposer2.changedInstance(earningToolsItem) | ((i3 & 112) == 32 ? true : r2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance) {
                    obj3 = obj;
                } else {
                    obj3 = obj;
                    if (rememberedValue2 != obj3) {
                        EarningToolRow(earningToolsItem, (Function0) rememberedValue2, gapComposer2, r2);
                        obj = obj3;
                    }
                }
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda2(3, earningToolsItem, function1, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue2);
                EarningToolRow(earningToolsItem, (Function0) rememberedValue2, gapComposer2, r2);
                obj = obj3;
            }
            Object obj5 = obj;
            gapComposer2.end(r2);
            gapComposer2.end(true);
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((EarningsHomeViewModel.EarningToolsItem) obj2).f1128type == ((EarningsHomeViewModel.EarningToolType) mutableState.getValue())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            EarningsHomeViewModel.EarningToolsItem earningToolsItem2 = (EarningsHomeViewModel.EarningToolsItem) obj2;
            if (earningToolsItem2 == null || (earnerModeSheet = earningToolsItem2.earnerModeSheet) == null || earnerModeSheet.durationOptions.isEmpty()) {
                earnerModeSheet = null;
            }
            if (earnerModeSheet == null) {
                gapComposer2.startReplaceGroup(-102879898);
                gapComposer2.end(r2);
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(-102879897);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj5) {
                    rememberedValue3 = new DrawerViewKt$$ExternalSyntheticLambda2(17, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, SheetTopCornerBehavior.AlwaysRounded, Expect_jvmKt.rememberComposableLambda(-481634957, new ArcadeModal2Kt$$ExternalSyntheticLambda0(5, earnerModeSheet, function1), gapComposer2), gapComposer2, 113246214, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                GapComposer gapComposer3 = gapComposer2;
                gapComposer3.end(r2);
                gapComposer = gapComposer3;
            }
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(earningTools, function1, i, 16);
        }
    }
}
