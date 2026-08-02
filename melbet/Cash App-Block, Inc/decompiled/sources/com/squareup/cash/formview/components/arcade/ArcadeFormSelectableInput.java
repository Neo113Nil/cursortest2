package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$40;
import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes5.dex */
public final class ArcadeFormSelectableInput extends AbstractComposeView {
    public final FormBlocker.Element.SelectableInputElement element;
    public final FormElementViewBuilder$toView$40 onEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormSelectableInput(Context context, FormBlocker.Element.SelectableInputElement selectableInputElement, FormElementViewBuilder$toView$40 formElementViewBuilder$toView$40) {
        super(context, null, 6, 0);
        context.getClass();
        this.element = selectableInputElement;
        this.onEvent = formElementViewBuilder$toView$40;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-532804270);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.startReplaceGroup(-923781405);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean changed = gapComposer.changed(colors);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                Colors.Component component = colors.component;
                Colors.Component.Input input = component.input;
                Colors.Component.Input.Border border = input.border;
                long j = border.f186default;
                Colors.Component.Input.Border border2 = new Colors.Component.Input.Border(j, j, border.error, border.selected);
                Colors.Component.Input.Text text = input.text;
                long j2 = text.f195default;
                Colors.Component.Input.Text text2 = new Colors.Component.Input.Text(j2, j2, text.placeholder);
                long j3 = input.label.f193default;
                rememberedValue = Colors.copy$default(colors, Colors.Component.copy$default(component, null, null, null, new Colors.Component.Input(input.background, border2, input.checkbox, input.chip, input.cursor, input.helper, input.icon, new Colors.Component.Input.Label(j3, j3), input.radio, text2), null, null, null, 134215679), null, 55);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer.end(false);
            ArcadeThemeKt.ArcadeTheme((Colors) rememberedValue, null, null, Expect_jvmKt.rememberComposableLambda(-1879750553, new ArcadeFormSelectableInput$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormSelectableInput$$ExternalSyntheticLambda0(this, i);
        }
    }
}
