package com.squareup.cash.earningstracker.views.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class EarningsCellDefaultShimmerContentKt {
    public static final long labelHeight = Room.getSp(20);
    public static final long bodyHeight = Room.getSp(16);
    public static final float accessoryWidth = 60.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: EarningsCellDefaultShimmerContent-t4AYKoY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3525EarningsCellDefaultShimmerContentt4AYKoY(float f, Modifier modifier, Dp dp, boolean z, Composer composer, int i, int i2) {
        Dp dp2;
        int i3;
        boolean z2;
        float f2;
        Modifier modifier2;
        Dp dp3;
        boolean z3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        Dp dp4;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        BiasAlignment.Vertical vertical;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ?? r0;
        GapComposer gapComposer2;
        Dp dp5;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1017982982);
        Applier applier = gapComposer3.applier;
        int i4 = i | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i | 432;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            dp2 = dp;
            i4 |= gapComposer3.changed(dp2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= gapComposer3.changed(z2) ? 2048 : 1024;
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
                    if (i5 != 0) {
                        dp2 = null;
                    }
                    boolean z5 = i3 != 0 ? false : z2;
                    Strings.getSizes(gapComposer3).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer3).getClass();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 16.0f), 1.0f);
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    BiasAlignment.Vertical vertical2 = Alignment.Companion.Top;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical2, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
                    if (z5) {
                        gapComposer3.startReplaceGroup(1055937925);
                        vertical = vertical2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                        z4 = z5;
                        dp4 = dp2;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                        companion = companion2;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", Strings.getColors(gapComposer3).semantic.background.subtle, (String) null, (Modifier) null, (AvatarImage) null, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3126, 0, 2032);
                        GapComposer gapComposer4 = gapComposer3;
                        Strings.getSizes(gapComposer4).getClass();
                        SpacerKt.Spacer(gapComposer4, SizeKt.m285size3ABfNKs(companion, 16.0f));
                        r0 = 0;
                        gapComposer4.end(false);
                        gapComposer2 = gapComposer4;
                    } else {
                        z4 = z5;
                        dp4 = dp2;
                        companion = companion2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        vertical = vertical2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                        GapComposer gapComposer5 = gapComposer3;
                        r0 = 0;
                        gapComposer5.startReplaceGroup(1056190668);
                        gapComposer5.end(false);
                        gapComposer2 = gapComposer5;
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, r0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                    gapComposer2.startReplaceGroup(-788963591);
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, vertical, gapComposer2, 6);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    long j = labelHeight;
                    f2 = f;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion, f2, density.mo231toDpGaN1DYA(j)), Strings.getColors(gapComposer2).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), gapComposer2, r0);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion, accessoryWidth, density.mo231toDpGaN1DYA(j)), Strings.getColors(gapComposer2).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), gapComposer2, r0);
                    gapComposer2.end(true);
                    if (dp4 != null) {
                        gapComposer2.startReplaceGroup(-529429396);
                        DBUtil.SpacerWithinSectionSmall(r0, 1, gapComposer2, null);
                        dp5 = dp4;
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(companion, dp5.value, density.mo231toDpGaN1DYA(bodyHeight)), Strings.getColors(gapComposer2).semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), gapComposer2, r0);
                        gapComposer2.end(r0);
                    } else {
                        dp5 = dp4;
                        gapComposer2.startReplaceGroup(-529118032);
                        gapComposer2.end(r0);
                    }
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer2, (boolean) r0, true, true);
                    dp3 = dp5;
                    modifier2 = companion;
                    z3 = z4;
                    gapComposer = gapComposer2;
                } else {
                    f2 = f;
                    GapComposer gapComposer6 = gapComposer3;
                    gapComposer6.skipToGroupEnd();
                    modifier2 = modifier;
                    dp3 = dp2;
                    z3 = z2;
                    gapComposer = gapComposer6;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletTile$$ExternalSyntheticLambda7(f2, modifier2, dp3, z3, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        dp2 = dp;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        z2 = z;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
