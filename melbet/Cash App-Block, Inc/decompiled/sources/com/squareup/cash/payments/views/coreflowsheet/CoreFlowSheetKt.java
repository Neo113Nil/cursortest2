package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.UiScopeKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$TheSheet$visibilityScope$1$1$1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CoreFlowSheetKt {
    public static final StaticProvidableCompositionLocal LocalCoreFlowSheetInOverlayLayer = new StaticProvidableCompositionLocal(new MainPaymentViewKt$$ExternalSyntheticLambda0(26));

    public static final void CoreFlowSheet(Function0 function0, Modifier modifier, CoreFlowRealSheetState coreFlowRealSheetState, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1554023712);
        int i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i | 48 | (gapComposer2.changed(coreFlowRealSheetState) ? 256 : 128) | (gapComposer2.changed(coreFlowSheetPeekPosition$FixedHeight) ? 2048 : 1024) | 24576;
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                modifier2 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier2 = modifier;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(468323578);
            gapComposer2.end(false);
            if (((Boolean) gapComposer2.consume(LocalCoreFlowSheetInOverlayLayer)).booleanValue()) {
                gapComposer2.startReplaceGroup(468451702);
                OverlayKt.Overlay(function0, Expect_jvmKt.rememberComposableLambda(799243361, new CoreFlowSheetKt$$ExternalSyntheticLambda1(function0, modifier2, coreFlowRealSheetState, coreFlowSheetPeekPosition$FixedHeight, composableLambdaImpl), gapComposer2), gapComposer2, (i2 & 14) | 48);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(468784735);
                Modifier modifier3 = modifier2;
                gapComposer = gapComposer2;
                TheCoreFlowSheet(function0, modifier3, coreFlowRealSheetState, coreFlowSheetPeekPosition$FixedHeight, composableLambdaImpl, gapComposer, (i2 & 8190) | 221184);
                modifier2 = modifier3;
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CoreFlowSheetKt$$ExternalSyntheticLambda1(function0, modifier2, coreFlowRealSheetState, coreFlowSheetPeekPosition$FixedHeight, composableLambdaImpl, i);
        }
    }

    public static final void TheCoreFlowSheet(Function0 function0, Modifier modifier, CoreFlowRealSheetState coreFlowRealSheetState, CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2061583290);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(coreFlowRealSheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer2.changed(coreFlowSheetPeekPosition$FixedHeight) : gapComposer2.changedInstance(coreFlowSheetPeekPosition$FixedHeight) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer2.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
            if (animatedVisibilityScope == null) {
                gapComposer2.startReplaceGroup(-1404131580);
                SheetKt$TheSheet$visibilityScope$1$1$1 sheetKt$TheSheet$visibilityScope$1$1$1 = new SheetKt$TheSheet$visibilityScope$1$1$1(AnimatableKt.updateTransition(EnterExitState.Visible, null, gapComposer2, 6, 2), 2);
                gapComposer2.end(false);
                animatedVisibilityScope = sheetKt$TheSheet$visibilityScope$1$1$1;
            } else {
                gapComposer2.startReplaceGroup(1201629717);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(217221775, new SwipeToDismissKt$$ExternalSyntheticLambda3(coreFlowRealSheetState, function0, coreFlowSheetPeekPosition$FixedHeight, modifier, animatedVisibilityScope, composableLambdaImpl), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(function0, modifier, coreFlowRealSheetState, coreFlowSheetPeekPosition$FixedHeight, composableLambdaImpl, i, 8);
        }
    }
}
