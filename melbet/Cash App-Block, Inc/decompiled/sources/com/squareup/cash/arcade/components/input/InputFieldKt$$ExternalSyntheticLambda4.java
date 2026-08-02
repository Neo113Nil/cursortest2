package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.squareup.cash.arcade.components.internal.InputState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputFieldKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Function3 f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ InputFieldKt$$ExternalSyntheticLambda4(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, InputState inputState, Function2 function2, Function2 function22, Function2 function23, Function3 function3, String str, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, int i, int i2, int i3) {
        this.f$8 = textFieldValue;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = inputState;
        this.f$4 = function2;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$7 = function3;
        this.f$0 = str;
        this.f$9 = keyboardOptions;
        this.f$10 = keyboardActions;
        this.f$11 = visualTransformation;
        this.f$12 = i;
        this.f$13 = i2;
        this.f$14 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$13;
        int i3 = this.f$12;
        Object obj3 = this.f$11;
        Object obj4 = this.f$10;
        Object obj5 = this.f$9;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        Object obj8 = this.f$8;
        Object obj9 = this.f$4;
        Object obj10 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                InputFieldKt.InputField(this.f$0, this.f$1, this.f$2, (InputState) obj10, (Function2) obj9, (Function2) obj7, (Function2) obj6, this.f$7, (String) obj8, (KeyboardOptions) obj5, (KeyboardActions) obj4, (VisualTransformation) obj3, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$14);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                InputFieldKt.InputField((TextFieldValue) obj8, this.f$1, this.f$2, (InputState) obj10, (Function2) obj9, (Function2) obj7, (Function2) obj6, this.f$7, this.f$0, (KeyboardOptions) obj5, (KeyboardActions) obj4, (VisualTransformation) obj3, (Composer) obj, updateChangedFlags3, updateChangedFlags4, this.f$14);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags6 = Updater.updateChangedFlags(i2);
                zzmn.m2026FoundationRemoteImageNXws8ko(this.f$7, this.f$0, this.f$2, (Alignment) obj10, (ContentScale) obj9, (String) obj8, this.f$1, (ColorFilter) obj7, (Color) obj6, (PaddingValues) obj5, (Function3) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags5, updateChangedFlags6, this.f$14);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InputFieldKt$$ExternalSyntheticLambda4(String str, Function1 function1, Modifier modifier, InputState inputState, Function2 function2, Function2 function22, Function2 function23, Function3 function3, String str2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, int i, int i2, int i3) {
        this.f$0 = str;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = inputState;
        this.f$4 = function2;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$7 = function3;
        this.f$8 = str2;
        this.f$9 = keyboardOptions;
        this.f$10 = keyboardActions;
        this.f$11 = visualTransformation;
        this.f$12 = i;
        this.f$13 = i2;
        this.f$14 = i3;
    }

    public /* synthetic */ InputFieldKt$$ExternalSyntheticLambda4(Function3 function3, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, String str2, Function1 function1, ColorFilter colorFilter, Color color, PaddingValues paddingValues, Function3 function32, ComposableLambdaImpl composableLambdaImpl, int i, int i2, int i3) {
        this.f$7 = function3;
        this.f$0 = str;
        this.f$2 = modifier;
        this.f$3 = alignment;
        this.f$4 = contentScale;
        this.f$8 = str2;
        this.f$1 = function1;
        this.f$5 = colorFilter;
        this.f$6 = color;
        this.f$9 = paddingValues;
        this.f$10 = function32;
        this.f$11 = composableLambdaImpl;
        this.f$12 = i;
        this.f$13 = i2;
        this.f$14 = i3;
    }
}
