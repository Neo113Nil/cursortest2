package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class InputAreaKt$InputArea$3$1$2 implements TextFieldDecorator {
    public final /* synthetic */ long $borderColor;
    public final /* synthetic */ InputColors $colors;
    public final /* synthetic */ MutableInteractionSourceImpl $interactionSource;
    public final /* synthetic */ Function2 $label;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ TextFieldState $state;

    public InputAreaKt$InputArea$3$1$2(TextFieldState textFieldState, InputColors inputColors, long j, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function2 function2, String str) {
        this.$state = textFieldState;
        this.$colors = inputColors;
        this.$borderColor = j;
        this.$interactionSource = mutableInteractionSourceImpl;
        this.$label = function2;
        this.$placeholder = str;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1439226053);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String obj = this.$state.getValue$foundation().text.toString();
            InputColors inputColors = this.$colors;
            UtilsKt.m3396InputBoxVQfMllA(obj, inputColors, this.$borderColor, inputColors.backgroundDefault, this.$interactionSource, this.$label, null, null, this.$placeholder, false, composableLambdaImpl, gapComposer, 819462144, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(this, composableLambdaImpl, i, 5);
        }
    }
}
