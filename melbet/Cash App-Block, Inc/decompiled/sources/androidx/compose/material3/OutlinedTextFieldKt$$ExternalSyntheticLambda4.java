package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class OutlinedTextFieldKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ boolean f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ KeyboardOptions f$15;
    public final /* synthetic */ Object f$16;
    public final /* synthetic */ boolean f$17;
    public final /* synthetic */ int f$18;
    public final /* synthetic */ int f$19;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$21;
    public final /* synthetic */ Object f$22;
    public final /* synthetic */ int f$23;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function2 f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, boolean z3, Function2 function2, Function3 function3, String str, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits.MultiLine multiLine, InputTransformation inputTransformation, OutputTransformation outputTransformation, MutableInteractionSourceImpl mutableInteractionSourceImpl, ScrollState scrollState, int i, int i2, int i3) {
        this.f$0 = textFieldState;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$13 = z2;
        this.f$17 = z3;
        this.f$6 = function2;
        this.f$1 = function3;
        this.f$5 = str;
        this.f$15 = keyboardOptions;
        this.f$7 = keyboardActionHandler;
        this.f$12 = multiLine;
        this.f$14 = inputTransformation;
        this.f$16 = outputTransformation;
        this.f$21 = mutableInteractionSourceImpl;
        this.f$22 = scrollState;
        this.f$18 = i;
        this.f$19 = i2;
        this.f$23 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$22;
        Object obj4 = this.f$21;
        Object obj5 = this.f$16;
        Object obj6 = this.f$14;
        Object obj7 = this.f$12;
        Object obj8 = this.f$7;
        Object obj9 = this.f$5;
        Function function = this.f$1;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$23 | 1);
                MenuKt.OutlinedTextField((TextFieldValue) obj10, (Function1) function, this.f$2, this.f$3, (TextStyle) obj9, this.f$6, (Function2) obj8, (Function2) obj7, this.f$13, (VisualTransformation) obj6, this.f$15, (KeyboardActions) obj5, this.f$17, this.f$18, this.f$19, (Shape) obj4, (TextFieldColors) obj3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$18 | 1);
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$19);
                InputAreaKt.InputArea((TextFieldState) obj10, this.f$2, this.f$3, this.f$13, this.f$17, this.f$6, (Function3) function, (String) obj9, this.f$15, (KeyboardActionHandler) obj8, (TextFieldLineLimits.MultiLine) obj7, (InputTransformation) obj6, (OutputTransformation) obj5, (MutableInteractionSourceImpl) obj4, (ScrollState) obj3, (Composer) obj, updateChangedFlags2, updateChangedFlags3, this.f$23);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda4(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, Shape shape, TextFieldColors textFieldColors, int i3) {
        this.f$0 = textFieldValue;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$5 = textStyle;
        this.f$6 = function2;
        this.f$7 = function22;
        this.f$12 = function23;
        this.f$13 = z2;
        this.f$14 = visualTransformation;
        this.f$15 = keyboardOptions;
        this.f$16 = keyboardActions;
        this.f$17 = z3;
        this.f$18 = i;
        this.f$19 = i2;
        this.f$21 = shape;
        this.f$22 = textFieldColors;
        this.f$23 = i3;
    }
}
