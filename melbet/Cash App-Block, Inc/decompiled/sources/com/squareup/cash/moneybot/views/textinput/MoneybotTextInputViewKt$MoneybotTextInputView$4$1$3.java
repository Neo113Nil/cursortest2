package com.squareup.cash.moneybot.views.textinput;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.viewmodels.textinput.MoneybotTextInputViewModel;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3 implements TextFieldDecorator {
    public final /* synthetic */ MoneybotTextInputViewModel $model;
    public final /* synthetic */ TextFieldState $textFieldState;

    public MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3(TextFieldState textFieldState, MoneybotTextInputViewModel moneybotTextInputViewModel) {
        this.$textFieldState = textFieldState;
        this.$model = moneybotTextInputViewModel;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2109689464);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (this.$textFieldState.getValue$foundation().text.length() == 0) {
                gapComposer.startReplaceGroup(-187057856);
                String str = this.$model.placeholder;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1503826239);
                    gapComposer.end(false);
                    z = false;
                } else {
                    gapComposer.startReplaceGroup(-1503826238);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.input.text.placeholder, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-1503568256);
                gapComposer.end(false);
            }
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(this, composableLambdaImpl, i);
        }
    }
}
