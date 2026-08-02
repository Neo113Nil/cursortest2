package com.squareup.cash.money.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import app.cash.broadway.ui.compose.UiScope;
import bo.app.q2$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.payments.views.composer.NoteInputKt$NoteInput$3$1$1$1$3;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ boolean f$7;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda17(FocusRequester focusRequester, Shaker shaker, Function0 function0, boolean z, TextFieldState textFieldState, RealCashVibrator realCashVibrator, boolean z2, ImmutableList immutableList) {
        this.f$0 = focusRequester;
        this.f$1 = shaker;
        this.f$2 = function0;
        this.f$4 = z;
        this.f$3 = textFieldState;
        this.f$5 = realCashVibrator;
        this.f$7 = z2;
        this.f$6 = immutableList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                MoneyTabUIKt.MoneyTabLoading((UiScope) obj8, (Modifier) obj7, (TabToolbarInternalViewModel) obj6, (String) obj5, this.f$4, (Function1) obj4, (ElementBoundsRegistry) obj3, this.f$7, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                FocusRequester focusRequester = (FocusRequester) obj8;
                final Shaker shaker = (Shaker) obj7;
                final Function0 function0 = (Function0) obj6;
                final TextFieldState textFieldState = (TextFieldState) obj5;
                final RealCashVibrator realCashVibrator = (RealCashVibrator) obj4;
                ImmutableList immutableList = (ImmutableList) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(TestTagKt.testTag(SharedViewEventsKt.shakeWith(FocusTraversalKt.focusRequester(Modifier.Companion.$$INSTANCE, focusRequester), shaker), "note_input_field"), 1.0f);
                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer).component.input.cursor);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.prominent, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 6, (Boolean) null, 119);
                    boolean changed = gapComposer.changed(function0);
                    final boolean z = this.f$4;
                    boolean changed2 = changed | gapComposer.changed(z) | gapComposer.changed(textFieldState) | gapComposer.changedInstance(shaker) | gapComposer.changedInstance(realCashVibrator);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed2 || rememberedValue == neverEqualPolicy) {
                        KeyboardActionHandler keyboardActionHandler = new KeyboardActionHandler() { // from class: com.squareup.cash.payments.views.composer.NoteInputKt$$ExternalSyntheticLambda4
                            @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
                            public final void onKeyboardAction(q2$$ExternalSyntheticLambda8 q2__externalsyntheticlambda8) {
                                Function0.this.invoke();
                                if (z) {
                                    TextFieldState textFieldState2 = textFieldState;
                                    if (StringsKt.isBlank(textFieldState2.getValue$foundation().text)) {
                                        shaker.shake();
                                        RealCashVibrator realCashVibrator2 = realCashVibrator;
                                        if (realCashVibrator2 != null) {
                                            realCashVibrator2.error();
                                        }
                                        TextFieldStateKt.clearText(textFieldState2);
                                    }
                                }
                            }
                        };
                        textFieldState = textFieldState;
                        gapComposer.updateRememberedValue(keyboardActionHandler);
                        rememberedValue = keyboardActionHandler;
                    }
                    KeyboardActionHandler keyboardActionHandler2 = (KeyboardActionHandler) rememberedValue;
                    boolean changedInstance = gapComposer.changedInstance(shaker) | gapComposer.changedInstance(realCashVibrator);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InputTransformation() { // from class: com.squareup.cash.payments.views.composer.NoteInputKt$$ExternalSyntheticLambda5
                            @Override // androidx.compose.foundation.text.input.InputTransformation
                            public final void transformInput(TextFieldBuffer textFieldBuffer) {
                                if (textFieldBuffer.buffer.toString().length() > 50) {
                                    Shaker.this.shake();
                                    RealCashVibrator realCashVibrator2 = realCashVibrator;
                                    if (realCashVibrator2 != null) {
                                        realCashVibrator2.error();
                                    }
                                    textFieldBuffer.revertAllChanges();
                                }
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    BasicTextFieldKt.BasicTextField(textFieldState, fillMaxWidth, false, false, (InputTransformation) rememberedValue2, m994copyp1EtxEg$default, keyboardOptions, keyboardActionHandler2, TextFieldLineLimits.SingleLine.INSTANCE, null, solidColor, null, new NoteInputKt$NoteInput$3$1$1$1$3(textFieldState, z, this.f$7, immutableList), null, gapComposer, 102236160, 0, 22028);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda17(UiScope uiScope, Modifier modifier, TabToolbarInternalViewModel tabToolbarInternalViewModel, String str, boolean z, Function1 function1, ElementBoundsRegistry elementBoundsRegistry, boolean z2, int i) {
        this.f$0 = uiScope;
        this.f$1 = modifier;
        this.f$2 = tabToolbarInternalViewModel;
        this.f$3 = str;
        this.f$4 = z;
        this.f$5 = function1;
        this.f$6 = elementBoundsRegistry;
        this.f$7 = z2;
    }
}
