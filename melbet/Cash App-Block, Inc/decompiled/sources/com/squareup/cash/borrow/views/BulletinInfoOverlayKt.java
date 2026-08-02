package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.timeline.TimelineProtoBindingKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BulletinInfoOverlayKt {
    public static final void BulletinInfoModal(BorrowHomeOverlayViewModel.InfoModal infoModal, Latch$await$2$2 latch$await$2$2, QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 quickPayViewKt$QuickPay$1$1$1$2$2$1$1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-738617519);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(infoModal) ? 4 : 2) | i | (gapComposer.changedInstance(latch$await$2$2) ? 32 : 16) | (gapComposer.changedInstance(quickPayViewKt$QuickPay$1$1$1$2$2$1$1) ? 256 : 128);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = i3 | (gapComposer.changed(companion) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Image image = infoModal.image;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (image == null) {
                gapComposer.startReplaceGroup(-1036790348);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-1036790347);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1253314158, new BulletinInfoOverlayKt$$ExternalSyntheticLambda7(image, 0), gapComposer);
                gapComposer.end(false);
            }
            String str = infoModal.dismissButtonText;
            if (str == null) {
                gapComposer.startReplaceGroup(-1036101063);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1036101062);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-699273877, new CheckDepositAmountKt$$ExternalSyntheticLambda6(i2, quickPayViewKt$QuickPay$1$1$1$2$2$1$1, str), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.Modal(companion, Expect_jvmKt.rememberComposableLambda(1712489760, new BulletinInfoOverlayKt$$ExternalSyntheticLambda9(infoModal, 0), gapComposer), Expect_jvmKt.rememberComposableLambda(1634499489, new BulletinInfoOverlayKt$$ExternalSyntheticLambda9(infoModal, 1), gapComposer), Expect_jvmKt.rememberComposableLambda(763822965, new BorrowHomeKt$$ExternalSyntheticLambda0(29, latch$await$2$2, infoModal), gapComposer), composableLambdaImpl, rememberComposableLambda, gapComposer, ((i4 >> 9) & 14) | 3504, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(infoModal, latch$await$2$2, quickPayViewKt$QuickPay$1$1$1$2$2$1$1, i, 14);
        }
    }

    public static final void BulletinInfoOverlay(BorrowHomeOverlayViewModel.BulletinInfo bulletinInfo, Latch$await$2$2 latch$await$2$2, QuickPayViewKt$QuickPay$1$1$1$2$2$1$1 quickPayViewKt$QuickPay$1$1$1$2$2$1$1, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        bulletinInfo.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-908752523);
        int i2 = i | (gapComposer.changedInstance(bulletinInfo) ? 4 : 2) | (gapComposer.changedInstance(latch$await$2$2) ? 32 : 16) | (gapComposer.changedInstance(quickPayViewKt$QuickPay$1$1$1$2$2$1$1) ? 256 : 128) | (gapComposer.changedInstance(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2073166016, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(bulletinInfo, latch$await$2$2, quickPayViewKt$QuickPay$1$1$1$2$2$1$1, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4((Object) bulletinInfo, (Object) latch$await$2$2, (Object) quickPayViewKt$QuickPay$1$1$1$2$2$1$1, (Function) borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, modifier2, i, 13);
        }
    }

    public static final void BulletinInfoOverlayBullets(int i, Composer composer, Modifier modifier, List list) {
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        LocalHomeGeoViewKt$$ExternalSyntheticLambda17 localHomeGeoViewKt$$ExternalSyntheticLambda17;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(223322793);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | 48;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean isEmpty = list.isEmpty();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (isEmpty) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    localHomeGeoViewKt$$ExternalSyntheticLambda17 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, companion, i, 4, false);
                    endRestartGroup.block = localHomeGeoViewKt$$ExternalSyntheticLambda17;
                }
                return;
            }
            Modifier.Companion companion2 = companion;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            gapComposer.startReplaceGroup(-1924362508);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) it.next();
                Icon icon = bullet.arcade_icon;
                if (icon == null) {
                    gapComposer.startReplaceGroup(474392871);
                    gapComposer.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(474392872);
                    zzd zzdVar = Icons.Companion;
                    String str = icon.arcade_id;
                    str.getClass();
                    zzdVar.getClass();
                    Icons icons = zzd.get(str);
                    if (icons == null) {
                        gapComposer.startReplaceGroup(1317222880);
                        gapComposer.end(false);
                        rememberComposableLambda = null;
                    } else {
                        gapComposer.startReplaceGroup(1317222881);
                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(990014394, new BulletinInfoOverlayKt$$ExternalSyntheticLambda20(icons, j, i3), gapComposer);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(287049794, new LoanDetailsSheetKt$$ExternalSyntheticLambda8(bullet, j, 3), gapComposer), null, null, false, false, null, null, null, 0L, gapComposer, 48, 4092);
                j = j;
                companion2 = companion2;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            localHomeGeoViewKt$$ExternalSyntheticLambda17 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier2, i, 5, false);
            endRestartGroup.block = localHomeGeoViewKt$$ExternalSyntheticLambda17;
        }
    }

    public static final void BulletinInfoSheet(BorrowHomeOverlayViewModel.InfoSheet infoSheet, Latch$await$2$2 latch$await$2$2, BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, Modifier modifier, Composer composer, int i) {
        float f;
        boolean z;
        ScrollState scrollState;
        boolean z2;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(922740364);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(infoSheet) ? 4 : 2) | (gapComposer.changedInstance(latch$await$2$2) ? 32 : 16) | (gapComposer.changedInstance(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Colors colors = Strings.getColors(gapComposer);
            Color color = infoSheet.headerTintColor;
            Timeline timeline = infoSheet.timeline;
            List list = infoSheet.bullets;
            ArcadeThemeKt.ArcadeTheme(com.squareup.cash.borrow.ui.util.ArcadeThemeKt.withTint(colors, color, gapComposer), null, null, Expect_jvmKt.rememberComposableLambda(-811196053, new BulletinInfoOverlayKt$$ExternalSyntheticLambda2(infoSheet, 0), gapComposer), gapComposer, 3072, 6);
            boolean z3 = infoSheet.sheetButton != null;
            if (list.isEmpty() && timeline == null && z3) {
                gapComposer.startReplaceGroup(1554764246);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
            } else {
                gapComposer.startReplaceGroup(1554709562);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer.end(false);
                f = 16.0f;
            }
            float f2 = f;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), rememberScrollState, false, 14), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            boolean z4 = false;
            BulletinInfoOverlayBullets(0, gapComposer, null, list);
            if (timeline == null) {
                gapComposer.startReplaceGroup(-948183183);
                gapComposer.end(false);
                scrollState = rememberScrollState;
                z = z3;
            } else {
                gapComposer.startReplaceGroup(-948183182);
                boolean z5 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z5 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RewardSlotQueries$$ExternalSyntheticLambda0(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, 19);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                z = z3;
                scrollState = rememberScrollState;
                TimelineProtoBindingKt.Timeline(timeline, function1, null, null, gapComposer, 0, 12);
                z4 = false;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            String str = infoSheet.footerText;
            if (z || str != null) {
                gapComposer.startReplaceGroup(1555434249);
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
                boolean z6 = scrollState.getCanScrollForward() || scrollState.getCanScrollBackward();
                if (str == null) {
                    gapComposer.startReplaceGroup(1555651558);
                    z2 = false;
                    gapComposer.end(false);
                    composableLambdaImpl = null;
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(1555651559);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1354350298, new CheckDepositAmountKt$$ExternalSyntheticLambda6(1, (Object) str, (Object) borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                DimensionKt.ButtonCtaGroup(m177backgroundbw27NRU, z6, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-710671655, new EducationalSheetKt$$ExternalSyntheticLambda8(z, latch$await$2$2, infoSheet, 4), gapComposer), gapComposer, 24576, 4);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1556052172);
                gapComposer.end(z4);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(infoSheet, i, latch$await$2$2, borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, modifier, 12);
        }
    }
}
