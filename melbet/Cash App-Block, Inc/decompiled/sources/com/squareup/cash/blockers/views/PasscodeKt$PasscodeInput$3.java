package com.squareup.cash.blockers.views;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.util.compose.ProgressBarKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class PasscodeKt$PasscodeInput$3 implements TextFieldDecorator {
    public final /* synthetic */ int $passcodeLength;
    public final /* synthetic */ TextFieldState $state;

    public PasscodeKt$PasscodeInput$3(int i, TextFieldState textFieldState) {
        this.$passcodeLength = i;
        this.$state = textFieldState;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(117679669);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f = 24.0f;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 24.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            gapComposer.startReplaceGroup(-665167668);
            int i3 = 0;
            while (i3 < this.$passcodeLength) {
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, f);
                boolean z2 = i3 < this.$state.getValue$foundation().text.length() ? z : false;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                int i4 = i3;
                long j = colors.component.button.prominent.background.f160default;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors2.semantic.border.standard;
                float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(2.0f, gapComposer);
                Modifier.Companion companion2 = companion;
                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z2 ? 1.0f : RecyclerView.DECELERATION_RATE, null, "Pip animation", null, gapComposer, 3072, 22);
                boolean changed = gapComposer.changed(animateFloatAsState) | gapComposer.changed(m3477toPx8Feqmps) | gapComposer.changed(j2) | gapComposer.changed(j);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    ProgressBarKt$$ExternalSyntheticLambda0 progressBarKt$$ExternalSyntheticLambda0 = new ProgressBarKt$$ExternalSyntheticLambda0(m3477toPx8Feqmps, animateFloatAsState, j2, j);
                    gapComposer.updateRememberedValue(progressBarKt$$ExternalSyntheticLambda0);
                    rememberedValue = progressBarKt$$ExternalSyntheticLambda0;
                }
                BoxKt.Box(ClipKt.drawBehind(m285size3ABfNKs, (Function1) rememberedValue), gapComposer, 0);
                i3 = i4 + 1;
                companion = companion2;
                z = true;
                f = 24.0f;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(this, composableLambdaImpl, i, 18);
        }
    }
}
