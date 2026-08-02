package com.squareup.cash.blockers.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ SsnViewModel f$1;
    public final /* synthetic */ TouchRecorder f$2;
    public final /* synthetic */ FocusRequester f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ MutableState f$5;
    public final /* synthetic */ InsertingScrubber f$6;
    public final /* synthetic */ MutableState f$7;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda5(FocusRequester focusRequester, SsnViewModel ssnViewModel, Function1 function1, MutableState mutableState, TouchRecorder touchRecorder, InsertingScrubber insertingScrubber, MutableState mutableState2) {
        this.f$3 = focusRequester;
        this.f$1 = ssnViewModel;
        this.f$4 = function1;
        this.f$5 = mutableState;
        this.f$2 = touchRecorder;
        this.f$6 = insertingScrubber;
        this.f$7 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape)));
                    SsnViewModel ssnViewModel = this.f$1;
                    Strings.LoadableFullScreenContent(ssnViewModel, ssnViewModel.isLoading, imePadding, null, null, Expect_jvmKt.rememberComposableLambda(282793183, new SsnViewKt$$ExternalSyntheticLambda7(this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7), gapComposer), gapComposer, 196608, 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier focusRequester = FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), this.f$3);
                    MutableState mutableState = this.f$5;
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    SsnViewModel ssnViewModel2 = this.f$1;
                    InputState inputState = ssnViewModel2.isLoading ? InputState.DISABLED : InputState.DEFAULT;
                    String str = ssnViewModel2.hint;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(3, 2, false, 113);
                    Function1 function1 = this.f$4;
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changed(mutableState);
                    TouchRecorder touchRecorder = this.f$2;
                    boolean changedInstance = changed | gapComposer2.changedInstance(touchRecorder);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    MutableState mutableState2 = this.f$7;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(function1, touchRecorder, mutableState2, mutableState, 28);
                        mutableState2 = mutableState2;
                        mutableState = mutableState;
                        gapComposer2.updateRememberedValue(n3__externalsyntheticlambda0);
                        rememberedValue = n3__externalsyntheticlambda0;
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    KeyboardActions keyboardActions = new KeyboardActions(function12, function12, function12, function12, function12, function12);
                    boolean changedInstance2 = gapComposer2.changedInstance(ssnViewModel2) | gapComposer2.changed(mutableState);
                    InsertingScrubber insertingScrubber = this.f$6;
                    boolean changedInstance3 = gapComposer2.changedInstance(insertingScrubber) | changedInstance2;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue2 == neverEqualPolicy) {
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda02 = new n3$$ExternalSyntheticLambda0(ssnViewModel2, insertingScrubber, mutableState, mutableState2, 29);
                        gapComposer2.updateRememberedValue(n3__externalsyntheticlambda02);
                        rememberedValue2 = n3__externalsyntheticlambda02;
                    }
                    InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue2, focusRequester, inputState, (Function2) null, (Function2) null, (Function2) null, (Function3) null, str, keyboardOptions, keyboardActions, (VisualTransformation) null, gapComposer2, 0, 0, 2288);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda5(SsnViewModel ssnViewModel, TouchRecorder touchRecorder, FocusRequester focusRequester, Function1 function1, MutableState mutableState, InsertingScrubber insertingScrubber, MutableState mutableState2) {
        this.f$1 = ssnViewModel;
        this.f$2 = touchRecorder;
        this.f$3 = focusRequester;
        this.f$4 = function1;
        this.f$5 = mutableState;
        this.f$6 = insertingScrubber;
        this.f$7 = mutableState2;
    }
}
