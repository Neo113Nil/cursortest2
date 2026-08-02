package com.squareup.cash.payments.views.composer;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class NoteInputKt$NoteInput$3$1$1$1$3 implements TextFieldDecorator {
    public final /* synthetic */ ImmutableList $hints;
    public final /* synthetic */ TextFieldState $inputState;
    public final /* synthetic */ boolean $isRequired;
    public final /* synthetic */ boolean $showHintCarousel;

    public NoteInputKt$NoteInput$3$1$1$1$3(TextFieldState textFieldState, boolean z, boolean z2, ImmutableList immutableList) {
        this.$inputState = textFieldState;
        this.$isRequired = z;
        this.$showHintCarousel = z2;
        this.$hints = immutableList;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2042998886);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            if (this.$inputState.getValue$foundation().text.length() == 0) {
                gapComposer.startReplaceGroup(1001856747);
                int i3 = this.$isRequired ? R.string.payment_note_input_content_description : R.string.payment_note_input_content_description_optional;
                if (!this.$showHintCarousel || this.$hints.isEmpty()) {
                    gapComposer.startReplaceGroup(1002292545);
                    String stringResource = Room.stringResource(gapComposer, i3);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    z = false;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1002121239);
                    VisibleKt.HintCarousel(null, Room.stringResource(gapComposer, i3), this.$hints, gapComposer, 0, 1);
                    gapComposer.end(false);
                    z = false;
                }
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1002561160);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(this, composableLambdaImpl, i, 29);
        }
    }
}
