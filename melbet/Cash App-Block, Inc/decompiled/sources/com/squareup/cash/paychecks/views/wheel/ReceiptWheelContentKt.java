package com.squareup.cash.paychecks.views.wheel;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.avatar.components.AvatarKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.paychecks.views.PaycheckCircles;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ReceiptWheelContentKt {

    /* renamed from: lambda$-2019842874, reason: not valid java name */
    public static final ComposableLambdaImpl f543lambda$2019842874 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(11), false, -2019842874);

    static {
        new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(9), false, -1256152162);
    }

    public static final void ActiveDistributionSectionWheelContent(DistributionWheelViewModel.Content.ActiveDistributionSection activeDistributionSection, Composer composer, int i) {
        activeDistributionSection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(446617489);
        int i2 = (gapComposer.changedInstance(activeDistributionSection) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(true) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TitleSubtitleIconsInnerContent(activeDistributionSection.title, activeDistributionSection.subtitle, null, true, gapComposer, ((i2 << 9) & 57344) | 3078, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(activeDistributionSection, i, 29);
        }
    }

    public static final void DistributePaycheckWheelContent(DistributionWheelViewModel.Content.DistributePaycheckScreen distributePaycheckScreen, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        distributePaycheckScreen.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(199290054);
        int i2 = (gapComposer.changedInstance(distributePaycheckScreen) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 482, Strings.getColors(gapComposer).semantic.text.standard, 0L, gapComposer, null, Strings.getTypography(gapComposer).numeralLarge, distributePaycheckScreen.percentage, null);
            zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 482, Strings.getColors(gapComposer).semantic.text.subtle, 0L, gapComposer, null, Strings.getTypography(gapComposer).bodyMedium, Room.stringResource(gapComposer, R.string.distribute_paycheck_wheel_subtitle), null);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(distributePaycheckScreen, modifier2, i, 17);
        }
    }

    public static final void DistributionWheelInnerContent(DistributionWheelViewModel.Content content, Function1 function1, Composer composer, int i) {
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1367042620);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (content instanceof DistributionWheelViewModel.Content.EditSingleDistributionScreen) {
            gapComposer.startReplaceGroup(532043446);
            EditSingleDistributionWheelContent((DistributionWheelViewModel.Content.EditSingleDistributionScreen) content, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else if (content instanceof DistributionWheelViewModel.Content.ActiveDistributionSection) {
            gapComposer.startReplaceGroup(532046241);
            ActiveDistributionSectionWheelContent((DistributionWheelViewModel.Content.ActiveDistributionSection) content, gapComposer, (i2 & 14) | 48);
            gapComposer.end(false);
        } else if (content instanceof DistributionWheelViewModel.Content.DistributePaycheckScreen) {
            gapComposer.startReplaceGroup(532049321);
            DistributePaycheckWheelContent((DistributionWheelViewModel.Content.DistributePaycheckScreen) content, null, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else if (content instanceof DistributionWheelViewModel.Content.ReceiptScreen) {
            gapComposer.startReplaceGroup(532051294);
            ReceiptWheelContent((DistributionWheelViewModel.Content.ReceiptScreen) content, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else {
            if (!(content instanceof DistributionWheelViewModel.Content.MultipleAllocationsScreen)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 532039912, false);
            }
            gapComposer.startReplaceGroup(532053331);
            MultipleAllocationsWheelContent((DistributionWheelViewModel.Content.MultipleAllocationsScreen) content, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(content, function1, i, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditDistributionCommonImplementation(String str, String str2, boolean z, Function3 function3, String str3, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function3 function32;
        Function1 function12;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        boolean z2;
        boolean z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1941131057);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function32 = function3;
            i3 |= gapComposer.changedInstance(function32) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 131072 : 65536;
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                function12 = function1;
                gapComposer.skipToGroupEnd();
                function33 = function32;
            } else {
                Function3 function34 = i4 != 0 ? f543lambda$2019842874 : function32;
                String stringResource = Room.stringResource(gapComposer, R.string.edit_distribution_blocker_more_info_button_accessibility_label);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), 5.0f);
                int i5 = 458752 & i3;
                boolean changed = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | gapComposer.changed(stringResource) | (i5 == 131072);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (changed || rememberedValue == obj) {
                    rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(str3, z, stringResource, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue);
                Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 6);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
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
                int i6 = i3;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier weight = columnScopeInstance.weight(0.25f, fillMaxWidth, true);
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Bottom, horizontal2, gapComposer, 54);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, weight);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                function34.invoke(columnScopeInstance, gapComposer, Integer.valueOf(6 | ((i6 >> 6) & 112)));
                gapComposer.end(true);
                Modifier weight2 = columnScopeInstance.weight(0.5f, SizeKt.fillMaxWidth(companion, 1.0f), true);
                Arrangement$Center$1 arrangement$Center$12 = SpacerKt.Center;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Center$12, horizontal2, gapComposer, 54);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, weight2);
                gapComposer.startReusableNode();
                Function3 function35 = function34;
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda4(22);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2);
                boolean z4 = i5 == 131072;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z4 || rememberedValue3 == obj) {
                    function13 = function1;
                    rememberedValue3 = new HomeViewKt$$ExternalSyntheticLambda8(2, function13);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    function13 = function1;
                }
                zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, (i6 & 14) | 24576, 480, Strings.getColors(gapComposer).semantic.text.standard, 0L, gapComposer, ImageKt.m183clickableoSLSa3U$default(clearAndSetSemantics, false, null, null, (Function0) rememberedValue3, 15), Strings.getTypography(gapComposer).numeralLarge, str, null);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = new HelpSheetViewKt$$ExternalSyntheticLambda4(23);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 480, Strings.getColors(gapComposer).semantic.text.subtle, 0L, gapComposer, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue4), Strings.getTypography(gapComposer).bodyMedium, Room.stringResource(gapComposer, R.string.edit_distribution_blocker_percentage_label), null);
                gapComposer.end(true);
                Modifier weight3 = columnScopeInstance.weight(0.25f, SizeKt.fillMaxWidth(companion, 1.0f), true);
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Center$12, horizontal2, gapComposer, 54);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, weight3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1888912658);
                    gapComposer.end(false);
                    function12 = function13;
                    z3 = true;
                } else {
                    gapComposer.startReplaceGroup(1888912659);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == obj) {
                        rememberedValue5 = new HelpSheetViewKt$$ExternalSyntheticLambda4(24);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 480, Strings.getColors(gapComposer).semantic.text.standard, 0L, gapComposer, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue5), Strings.getTypography(gapComposer).sectionTitle, str2, null);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(horizontal, 1)), Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, companion);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
                    Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (rememberedValue6 == obj) {
                        rememberedValue6 = new HelpSheetViewKt$$ExternalSyntheticLambda4(25);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 480, Strings.getColors(gapComposer).semantic.text.subtle, 0L, gapComposer, SemanticsModifierKt.clearAndSetSemantics(wrapContentSize$default, (Function1) rememberedValue6), textStyle, Room.stringResource(gapComposer, R.string.edit_distribution_blocker_monthly_amount_label), null);
                    if (z) {
                        gapComposer.startReplaceGroup(647668027);
                        Icons icons = Icons.InformationOutline16;
                        long j = Strings.getColors(gapComposer).semantic.icon.subtle;
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(textStyle.spanStyle.fontSize));
                        boolean z5 = i5 == 131072;
                        Object rememberedValue7 = gapComposer.rememberedValue();
                        if (z5 || rememberedValue7 == obj) {
                            function12 = function1;
                            rememberedValue7 = new HomeViewKt$$ExternalSyntheticLambda8(3, function12);
                            gapComposer.updateRememberedValue(rememberedValue7);
                        } else {
                            function12 = function1;
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, ImageKt.m183clickableoSLSa3U$default(m277height3ABfNKs, false, null, null, (Function0) rememberedValue7, 15), j, gapComposer, 54, 0);
                        z2 = false;
                        gapComposer.end(false);
                    } else {
                        function12 = function1;
                        z2 = false;
                        gapComposer.startReplaceGroup(648162353);
                        gapComposer.end(false);
                    }
                    z3 = true;
                    gapComposer.end(true);
                    gapComposer.end(z2);
                }
                gapComposer.end(z3);
                gapComposer.end(z3);
                function33 = function35;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(str, str2, z, function33, str3, function12, i, i2, 12);
                return;
            }
            return;
        }
        function32 = function3;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void EditSingleDistributionWheelContent(DistributionWheelViewModel.Content.EditSingleDistributionScreen editSingleDistributionScreen, Function1 function1, Composer composer, int i) {
        Function1 function12;
        editSingleDistributionScreen.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2096281549);
        int i2 = (gapComposer.changedInstance(editSingleDistributionScreen) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function12 = function1;
            EditDistributionCommonImplementation(editSingleDistributionScreen.percentage, editSingleDistributionScreen.monthlyAmount, editSingleDistributionScreen.showInfoButton, Expect_jvmKt.rememberComposableLambda(196549982, new PoolListSectionKt$$ExternalSyntheticLambda2(editSingleDistributionScreen, 1), gapComposer), null, function12, gapComposer, ((i2 << 12) & 458752) | 27648, 0);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(editSingleDistributionScreen, function12, i, 21);
        }
    }

    /* renamed from: InnerContentText-T042LqI, reason: not valid java name */
    public static final void m3699InnerContentTextT042LqI(String str, TextStyle textStyle, long j, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2056881779);
        int i4 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(textStyle) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(1) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            int i6 = (i3 & 14) | 1572864 | ((i3 >> 9) & 112);
            int i7 = i3 << 3;
            zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344), MLKEMEngine.KyberPolyBytes, j, Room.getSp(6), gapComposer, modifier4, textStyle, str, null);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarKt$$ExternalSyntheticLambda6(str, textStyle, j, modifier3, i, i2);
        }
    }

    public static final void MultipleAllocationsWheelContent(DistributionWheelViewModel.Content.MultipleAllocationsScreen multipleAllocationsScreen, Function1 function1, Composer composer, int i) {
        Function1 function12;
        FormattedResource formattedResource;
        multipleAllocationsScreen.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-234139803);
        int i2 = (gapComposer.changedInstance(multipleAllocationsScreen) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = multipleAllocationsScreen.percentage;
            String str2 = multipleAllocationsScreen.monthlyAmount;
            boolean z = multipleAllocationsScreen.showInfoButton;
            if (str2 != null) {
                ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(2, str, "share", str);
                m.put("monthlyAverage", str2);
                formattedResource = new FormattedResource(R.string.multiple_allocations_wheel_accessibility_descriptor, m);
            } else {
                formattedResource = new FormattedResource(R.string.multiple_allocations_wheel_accessibility_descriptor_nomonthlyaverage, SVG$Unit$EnumUnboxingLocalUtility.m(1, str, "share", str));
            }
            function12 = function1;
            EditDistributionCommonImplementation(str, str2, z, null, zzux.formattedResource(formattedResource, gapComposer), function12, gapComposer, (i2 << 12) & 458752, 8);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(multipleAllocationsScreen, function12, i, 20);
        }
    }

    public static final void ReceiptWheelContent(DistributionWheelViewModel.Content.ReceiptScreen receiptScreen, Composer composer, int i) {
        receiptScreen.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1452917270);
        int i2 = (gapComposer.changedInstance(receiptScreen) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TitleSubtitleIconsInnerContent(receiptScreen.title, receiptScreen.subtitle, receiptScreen.icons, false, gapComposer, 6, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda2(receiptScreen, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TitleSubtitleIconsInnerContent(DistributionWheelViewModel.Content.TitleConfiguration titleConfiguration, DistributionWheelViewModel.Content.TitleConfiguration titleConfiguration2, DistributionWheelViewModel.Content.IconsConfiguration iconsConfiguration, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        titleConfiguration.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(48811110);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(false) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(titleConfiguration) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(titleConfiguration2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(iconsConfiguration) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(26);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize, true, (Function1) rememberedValue);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
                if (iconsConfiguration == null) {
                    gapComposer.startReplaceGroup(-1501336403);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1501336402);
                    DistributionWheelViewModel.Content.IconsConfiguration.Placement placement = DistributionWheelViewModel.Content.IconsConfiguration.Placement.RECEIPT;
                    if (TitleSubtitleIconsInnerContentKt$WhenMappings.$EnumSwitchMapping$0[0] != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    PaycheckCircles.Placement[] placementArr = PaycheckCircles.Placement.$VALUES;
                    HelpSheetViewKt.PaycheckCircles(MLKEMEngine.KyberPolyBytes, gapComposer, null, iconsConfiguration.icons);
                    SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 8.0f));
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(-1572441084);
                gapComposer.end(false);
                m3699InnerContentTextT042LqI(titleConfiguration.text, toTextStyle(titleConfiguration.treatment, gapComposer), toColor(titleConfiguration.color, z4, gapComposer), companion, gapComposer, 0, 0);
                if (titleConfiguration2 == null) {
                    gapComposer.startReplaceGroup(-1500841922);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1500841921);
                    m3699InnerContentTextT042LqI(titleConfiguration2.text, toTextStyle(titleConfiguration2.treatment, gapComposer), toColor(titleConfiguration2.color, z4, gapComposer), null, gapComposer, 0, 16);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0(titleConfiguration, titleConfiguration2, iconsConfiguration, z3, i, i2, 19);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long toColor(DistributionWheelViewModel.TextColor textColor, boolean z, Composer composer) {
        long j;
        if (textColor.equals(DistributionWheelViewModel.TextColor.Label.INSTANCE)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(445388755);
            long j2 = MooncakeTheme.getColors(gapComposer).label;
            gapComposer.end(false);
            return j2;
        }
        if (textColor.equals(DistributionWheelViewModel.TextColor.SecondaryLabel.INSTANCE)) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(445391516);
            long j3 = MooncakeTheme.getColors(gapComposer2).secondaryLabel;
            gapComposer2.end(false);
            return j3;
        }
        if (!(textColor instanceof DistributionWheelViewModel.TextColor.Tinted)) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 445386366, false);
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(445393988);
        if (z) {
            gapComposer3.startReplaceGroup(445395638);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            j = colors.semantic.text.standard;
        } else {
            gapComposer3.startReplaceGroup(445396096);
            Color forTheme = ThemablesKt.forTheme(((DistributionWheelViewModel.TextColor.Tinted) textColor).color, gapComposer3);
            forTheme.getClass();
            j = forTheme.value;
        }
        gapComposer3.end(false);
        gapComposer3.end(false);
        return j;
    }

    public static final TextStyle toTextStyle(DistributionWheelViewModel.TextTreatment textTreatment, Composer composer) {
        int ordinal = textTreatment.ordinal();
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(434424008);
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle = mooncakeTypography.mainTitle;
            gapComposer.end(false);
            return textStyle;
        }
        if (ordinal == 1) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(434426054);
            MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography2 == null) {
                mooncakeTypography2 = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle2 = mooncakeTypography2.caption;
            gapComposer2.end(false);
            return textStyle2;
        }
        if (ordinal == 2) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(434428038);
            MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer3.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography3 == null) {
                mooncakeTypography3 = ((Boolean) gapComposer3.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle3 = mooncakeTypography3.header2;
            gapComposer3.end(false);
            return textStyle3;
        }
        if (ordinal == 3) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(434430022);
            MooncakeTypography mooncakeTypography4 = (MooncakeTypography) gapComposer4.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography4 == null) {
                mooncakeTypography4 = ((Boolean) gapComposer4.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle4 = mooncakeTypography4.header3;
            gapComposer4.end(false);
            return textStyle4;
        }
        if (ordinal == 4) {
            GapComposer gapComposer5 = (GapComposer) composer;
            gapComposer5.startReplaceGroup(434432071);
            MooncakeTypography mooncakeTypography5 = (MooncakeTypography) gapComposer5.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography5 == null) {
                mooncakeTypography5 = ((Boolean) gapComposer5.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            TextStyle textStyle5 = mooncakeTypography5.bigMoney;
            gapComposer5.end(false);
            return textStyle5;
        }
        if (ordinal != 5) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 434422284, false);
        }
        GapComposer gapComposer6 = (GapComposer) composer;
        gapComposer6.startReplaceGroup(434434184);
        MooncakeTypography mooncakeTypography6 = (MooncakeTypography) gapComposer6.consume(MooncakeTypographyKt.LocalTypography);
        if (mooncakeTypography6 == null) {
            mooncakeTypography6 = ((Boolean) gapComposer6.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
        }
        TextStyle textStyle6 = mooncakeTypography6.smallBody;
        gapComposer6.end(false);
        return textStyle6;
    }
}
