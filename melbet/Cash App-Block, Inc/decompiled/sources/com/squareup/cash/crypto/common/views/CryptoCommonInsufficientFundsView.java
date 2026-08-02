package com.squareup.cash.crypto.common.views;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.crypto.common.viewmodels.CryptoInsufficientFundsViewModel;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class CryptoCommonInsufficientFundsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCommonInsufficientFundsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Buttons(CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1506658705);
        int i2 = i | (gapComposer2.changedInstance(cryptoInsufficientFundsViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            String str = cryptoInsufficientFundsViewModel.positiveButtonText;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(26, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            boolean z2 = false;
            KeypadKt.m3640ButtonGFipHI0(str, function0, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), null, null, null, null, false, 0, null, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 0, 4088);
            String str2 = cryptoInsufficientFundsViewModel.negativeButtonText;
            MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            if (i3 == 32) {
                z2 = true;
            }
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(27, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.m3640ButtonGFipHI0(str2, (Function0) rememberedValue2, fillMaxWidth, null, null, style, null, false, 0, null, null, gapComposer2, 196992, 0, 4056);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(this, i, cryptoInsufficientFundsViewModel, function1, modifier, 20);
        }
    }

    public final void Content(CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel, Function1 function1, Composer composer, int i) {
        CryptoCommonInsufficientFundsView cryptoCommonInsufficientFundsView;
        CryptoInsufficientFundsViewModel cryptoInsufficientFundsViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1019565484);
        int i3 = (gapComposer.changedInstance(cryptoInsufficientFundsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            cryptoCommonInsufficientFundsView = this;
            cryptoInsufficientFundsViewModel2 = cryptoInsufficientFundsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (cryptoInsufficientFundsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0(this, cryptoInsufficientFundsViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            cryptoCommonInsufficientFundsView = this;
            cryptoInsufficientFundsViewModel2 = cryptoInsufficientFundsViewModel;
            function12 = function1;
            i2 = i;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(240307641, new CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0(function12, cryptoCommonInsufficientFundsView, cryptoInsufficientFundsViewModel2), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            int i4 = i2;
            endRestartGroup2.block = new CryptoCommonInsufficientFundsView$$ExternalSyntheticLambda0(cryptoCommonInsufficientFundsView, cryptoInsufficientFundsViewModel2, function12, i4, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((CryptoInsufficientFundsViewModel) obj, function1, gapComposer, 0);
    }
}
