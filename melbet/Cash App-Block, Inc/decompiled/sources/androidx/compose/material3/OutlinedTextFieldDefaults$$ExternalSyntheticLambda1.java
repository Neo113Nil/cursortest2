package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.moneybot.widgets.FloatingChatInputState;
import com.squareup.cash.moneybot.widgets.FloatingChatInputStatus;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class OutlinedTextFieldDefaults$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ Object f$15;
    public final /* synthetic */ Object f$16;
    public final /* synthetic */ Object f$17;
    public final /* synthetic */ int f$18;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ boolean f$7;
    public final /* synthetic */ Function2 f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z3, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = outlinedTextFieldDefaults;
        this.f$1 = str;
        this.f$2 = function2;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = visualTransformation;
        this.f$6 = mutableInteractionSourceImpl;
        this.f$7 = z3;
        this.f$8 = function22;
        this.f$9 = function23;
        this.f$14 = function24;
        this.f$15 = textFieldColors;
        this.f$16 = paddingValues;
        this.f$17 = composableLambdaImpl;
        this.f$18 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$18;
        Object obj3 = this.f$16;
        Object obj4 = this.f$17;
        Object obj5 = this.f$15;
        Object obj6 = this.f$6;
        Object obj7 = this.f$5;
        Object obj8 = this.f$0;
        Object obj9 = this.f$14;
        Object obj10 = this.f$9;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ((OutlinedTextFieldDefaults) obj8).DecorationBox(this.f$1, this.f$2, this.f$3, this.f$4, (VisualTransformation) obj7, (MutableInteractionSourceImpl) obj6, this.f$7, this.f$8, (Function2) obj10, (Function2) obj9, (TextFieldColors) obj5, (PaddingValues) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.FloatingChatInput((Modifier) obj8, (FloatingChatInputState) obj10, (FloatingChatInputStatus) obj9, this.f$3, this.f$4, (DelegatingSoftwareKeyboardController) obj7, this.f$1, this.f$7, (Function0) obj6, this.f$2, this.f$8, (Function1) obj5, (Function0) obj3, (Function1) obj4, (Composer) obj, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                CompatTextFieldKt.InsetDecorationBox(this.f$1, this.f$2, this.f$3, this.f$8, (Function2) obj10, (Function2) obj9, (Function2) obj8, this.f$4, (VisualTransformation) obj7, this.f$7, (MutableInteractionSourceImpl) obj6, (Shape) obj5, (androidx.compose.material.TextFieldColors) obj4, (PaddingValues) obj3, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(Modifier modifier, FloatingChatInputState floatingChatInputState, FloatingChatInputStatus floatingChatInputStatus, boolean z, boolean z2, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, String str, boolean z3, Function0 function0, Function2 function2, Function2 function22, Function1 function1, Function0 function02, Function1 function12, int i) {
        this.f$0 = modifier;
        this.f$9 = floatingChatInputState;
        this.f$14 = floatingChatInputStatus;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = delegatingSoftwareKeyboardController;
        this.f$1 = str;
        this.f$7 = z3;
        this.f$6 = function0;
        this.f$2 = function2;
        this.f$8 = function22;
        this.f$15 = function1;
        this.f$16 = function02;
        this.f$17 = function12;
        this.f$18 = i;
    }

    public /* synthetic */ OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(String str, Function2 function2, boolean z, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, VisualTransformation visualTransformation, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, androidx.compose.material.TextFieldColors textFieldColors, PaddingValues paddingValues, int i) {
        this.f$1 = str;
        this.f$2 = function2;
        this.f$3 = z;
        this.f$8 = function22;
        this.f$9 = function23;
        this.f$14 = function24;
        this.f$0 = function25;
        this.f$4 = z2;
        this.f$5 = visualTransformation;
        this.f$7 = z3;
        this.f$6 = mutableInteractionSourceImpl;
        this.f$15 = shape;
        this.f$17 = textFieldColors;
        this.f$16 = paddingValues;
        this.f$18 = i;
    }
}
